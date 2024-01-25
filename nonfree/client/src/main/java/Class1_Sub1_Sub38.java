import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class1_Sub1_Sub38 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			@Pc(24) int local24 = Static221.anIntArray194[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static434.anInt4326; local26++) {
				local16[local26] = this.method5462(local24, Static280.anIntArray238[local26]) % 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)I")
	private int method5462(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 + arg0 * 57;
		@Pc(21) int local21 = local15 << 1 ^ local15;
		return 4096 - (Integer.MAX_VALUE & local21 * (local21 * local21 * 15731 + 789221) + 1376312589) / 262144;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class3_Sub1_Sub33 extends Class3_Sub1 {

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(III)I")
	private int method7375(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 + arg1 * 57;
		@Pc(21) int local21 = local15 ^ local15 << 1;
		return 4096 - (Integer.MAX_VALUE & (local21 * local21 * 15731 + 789221) * local21 + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(24) int local24 = Static324.anIntArray440[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static131.anInt2935; local26++) {
				local11[local26] = this.method7375(Static361.anIntArray460[local26], local24) % 4096;
			}
		}
		return local11;
	}
}

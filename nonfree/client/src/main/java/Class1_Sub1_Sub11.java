import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IBI)I")
	private int method1418(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local5 << 1 ^ local5;
		return 4096 - (Integer.MAX_VALUE & local15 * (local15 * 15731 * local15 + 789221) + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			@Pc(24) int local24 = Static187.anIntArray345[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static11.anInt294; local26++) {
				local16[local26] = this.method1418(local24, Static36.anIntArray81[local26]) % 4096;
			}
		}
		return local16;
	}
}

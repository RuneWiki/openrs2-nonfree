import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class1_Sub3_Sub27 extends Class1_Sub3 {

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IZI)I")
	private int method2234(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local9 << 1 ^ local9;
		return 4096 - (local20 * (local20 * 15731 * local20 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(19) int local19 = Static23.anIntArray47[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static76.anInt1531; local21++) {
				local11[local21] = this.method2234(Static106.anIntArray202[local21], local19) % 4096;
			}
		}
		return local11;
	}
}

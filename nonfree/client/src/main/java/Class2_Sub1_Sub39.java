import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class2_Sub1_Sub39 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(26) int[] local26 = this.method3203(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static62.anInt1675; local28++) {
				local16[local28] = 4096 - local26[local28];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3211(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass99_41.method3152(arg0);
		if (super.aClass99_41.aBoolean280) {
			@Pc(22) int[][] local22 = this.method3205(0, arg0);
			@Pc(26) int[] local26 = local22[0];
			@Pc(30) int[] local30 = local22[1];
			@Pc(34) int[] local34 = local22[2];
			@Pc(38) int[] local38 = local7[1];
			@Pc(42) int[] local42 = local7[2];
			@Pc(46) int[] local46 = local7[0];
			for (@Pc(48) int local48 = 0; local48 < Static62.anInt1675; local48++) {
				local46[local48] = 4096 - local26[local48];
				local38[local48] = 4096 - local30[local48];
				local42[local48] = 4096 - local34[local48];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean286 = arg0.method209() == 1;
		}
	}
}

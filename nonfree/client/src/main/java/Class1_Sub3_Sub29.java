import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class1_Sub3_Sub29 extends Class1_Sub3 {

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4452(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = this.aClass56_41.method1596(arg0);
		if (this.aClass56_41.aBoolean144) {
			@Pc(30) int[][] local30 = this.method4455(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local7[0];
			@Pc(46) int[] local46 = local7[2];
			@Pc(50) int[] local50 = local7[1];
			@Pc(54) int[] local54 = local30[2];
			for (@Pc(56) int local56 = 0; local56 < Static227.anInt4511; local56++) {
				local42[local56] = 4096 - local34[local56];
				local50[local56] = 4096 - local38[local56];
				local46[local56] = 4096 - local54[local56];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(30) int[] local30 = this.method4450(0, arg0);
			for (@Pc(32) int local32 = 0; local32 < Static227.anInt4511; local32++) {
				local19[local32] = 4096 - local30[local32];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean451 = arg0.method2690() == 1;
		}
	}
}

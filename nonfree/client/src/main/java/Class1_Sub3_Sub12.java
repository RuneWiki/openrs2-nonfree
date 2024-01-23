import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class1_Sub3_Sub12 extends Class1_Sub3 {

	@OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
	private int anInt1986 = 2048;

	@OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
	private int anInt1999 = 3072;

	@OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
	private int anInt1988 = 1024;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(28) int[] local28 = this.method4450(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static227.anInt4511; local30++) {
				local13[local30] = this.anInt1988 + (local28[local30] * this.anInt1986 >> 12);
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4452(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = this.aClass56_41.method1596(arg0);
		if (this.aClass56_41.aBoolean144) {
			@Pc(30) int[][] local30 = this.method4455(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local19[0];
			@Pc(46) int[] local46 = local30[2];
			@Pc(50) int[] local50 = local19[1];
			@Pc(54) int[] local54 = local19[2];
			for (@Pc(56) int local56 = 0; local56 < Static227.anInt4511; local56++) {
				local42[local56] = (this.anInt1986 * local34[local56] >> 12) + this.anInt1988;
				local50[local56] = (local38[local56] * this.anInt1986 >> 12) + this.anInt1988;
				local54[local56] = (local46[local56] * this.anInt1986 >> 12) + this.anInt1988;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V")
	@Override
	public void method4447() {
		this.anInt1986 = this.anInt1999 - this.anInt1988;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1988 = arg0.method2691();
		} else if (arg1 == 1) {
			this.anInt1999 = arg0.method2691();
		} else if (arg1 == 2) {
			this.aBoolean451 = arg0.method2690() == 1;
		}
	}
}

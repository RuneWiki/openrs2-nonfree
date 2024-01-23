import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class1_Sub3_Sub33 extends Class1_Sub3 {

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			for (@Pc(23) int local23 = 0; local23 < Static227.anInt4511; local23++) {
				this.method3734(local23, arg0);
				@Pc(37) int[] local37 = this.method4450(0, Static176.anInt3723);
				local16[local23] = local37[Static193.anInt3980];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(BII)V")
	private void method3734(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static209.anIntArray377[arg0];
		@Pc(19) int local19 = Static132.anIntArray265[arg1];
		@Pc(30) float local30 = (float) Math.atan2((double) (local15 - 2048), (double) (local19 - 2048));
		if ((double) local30 >= -3.141592653589793D && (double) local30 <= -2.356194490192345D) {
			Static176.anInt3723 = arg1;
			Static193.anInt3980 = arg0;
		} else if ((double) local30 <= -1.5707963267948966D && (double) local30 >= -2.356194490192345D) {
			Static176.anInt3723 = arg0;
			Static193.anInt3980 = arg1;
		} else if ((double) local30 <= -0.7853981633974483D && (double) local30 >= -1.5707963267948966D) {
			Static176.anInt3723 = arg0;
			Static193.anInt3980 = Static227.anInt4511 - arg1;
		} else if (local30 <= 0.0F && -0.7853981633974483D <= (double) local30) {
			Static193.anInt3980 = arg0;
			Static176.anInt3723 = Static26.anInt632 - arg1;
		} else if (local30 >= 0.0F && (double) local30 <= 0.7853981633974483D) {
			Static176.anInt3723 = Static26.anInt632 - arg1;
			Static193.anInt3980 = Static227.anInt4511 - arg0;
		} else if ((double) local30 >= 0.7853981633974483D && (double) local30 <= 1.5707963267948966D) {
			Static193.anInt3980 = Static227.anInt4511 - arg1;
			Static176.anInt3723 = Static26.anInt632 - arg0;
		} else if ((double) local30 >= 1.5707963267948966D && (double) local30 <= 2.356194490192345D) {
			Static176.anInt3723 = Static26.anInt632 - arg0;
			Static193.anInt3980 = arg1;
		} else if ((double) local30 >= 2.356194490192345D && (double) local30 <= 3.141592653589793D) {
			Static193.anInt3980 = Static227.anInt4511 - arg0;
			Static176.anInt3723 = arg1;
		}
		Static193.anInt3980 &= Static229.anInt4527;
		Static176.anInt3723 &= Static202.anInt4099;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4452(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = this.aClass56_41.method1596(arg0);
		if (this.aClass56_41.aBoolean144) {
			@Pc(28) int[] local28 = local19[0];
			@Pc(32) int[] local32 = local19[1];
			@Pc(36) int[] local36 = local19[2];
			for (@Pc(38) int local38 = 0; local38 < Static227.anInt4511; local38++) {
				this.method3734(local38, arg0);
				@Pc(56) int[][] local56 = this.method4455(0, Static176.anInt3723);
				local28[local38] = local56[0][Static193.anInt3980];
				local32[local38] = local56[1][Static193.anInt3980];
				local36[local38] = local56[2][Static193.anInt3980];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean451 = arg0.method2690() == 1;
		}
	}
}

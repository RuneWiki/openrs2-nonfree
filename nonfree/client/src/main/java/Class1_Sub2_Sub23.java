import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class1_Sub2_Sub23 extends Class1_Sub2 {

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean424 = arg0.method2595() == 1;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4572(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = this.aClass151_41.method3758(arg0);
		if (this.aClass151_41.aBoolean344) {
			@Pc(26) int[] local26 = local17[1];
			@Pc(30) int[] local30 = local17[0];
			@Pc(34) int[] local34 = local17[2];
			for (@Pc(36) int local36 = 0; local36 < Static299.anInt5670; local36++) {
				this.method2849(local36, arg0);
				@Pc(50) int[][] local50 = this.method4575(0, Static179.anInt3672);
				local30[local36] = local50[0][Static143.anInt2828];
				local26[local36] = local50[1][Static143.anInt2828];
				local34[local36] = local50[2][Static143.anInt2828];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			for (@Pc(19) int local19 = 0; local19 < Static299.anInt5670; local19++) {
				this.method2849(local19, arg0);
				@Pc(37) int[] local37 = this.method4570(Static179.anInt3672, 0);
				local9[local19] = local37[Static143.anInt2828];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIB)V")
	private void method2849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = Static310.anIntArray108[arg0];
		@Pc(13) int local13 = Static7.anIntArray13[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local5 - 2048), (double) (local13 - 2048));
		if (-3.141592653589793D <= (double) local24 && -2.356194490192345D >= (double) local24) {
			Static143.anInt2828 = arg0;
			Static179.anInt3672 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static179.anInt3672 = arg0;
			Static143.anInt2828 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static179.anInt3672 = arg0;
			Static143.anInt2828 = Static299.anInt5670 - arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static143.anInt2828 = arg0;
			Static179.anInt3672 = Static202.anInt4038 - arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static179.anInt3672 = Static202.anInt4038 - arg1;
			Static143.anInt2828 = Static299.anInt5670 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static143.anInt2828 = Static299.anInt5670 - arg1;
			Static179.anInt3672 = Static202.anInt4038 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static179.anInt3672 = Static202.anInt4038 - arg0;
			Static143.anInt2828 = arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static143.anInt2828 = Static299.anInt5670 - arg0;
			Static179.anInt3672 = arg1;
		}
		Static179.anInt3672 &= Static167.anInt3492;
		Static143.anInt2828 &= Static142.anInt2791;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class14_Sub1_Sub8 extends Class14_Sub1 {

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8905(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass279_41.method6840(arg0);
		if (super.aClass279_41.aBoolean571) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			for (@Pc(37) int local37 = 0; local37 < Static371.anInt6835; local37++) {
				this.method2320(local37, arg0);
				@Pc(50) int[][] local50 = this.method8904(0, Static143.anInt2730);
				local27[local37] = local50[0][Static327.anInt6193];
				local31[local37] = local50[1][Static327.anInt6193];
				local35[local37] = local50[2][Static327.anInt6193];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			for (@Pc(17) int local17 = 0; local17 < Static371.anInt6835; local17++) {
				this.method2320(local17, arg0);
				@Pc(30) int[] local30 = this.method8897(0, Static143.anInt2730);
				local11[local17] = local30[Static327.anInt6193];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean734 = arg0.method5866() == 1;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IZI)V")
	private void method2320(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static160.anIntArray258[arg0];
		@Pc(13) int local13 = Static336.anIntArray458[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static143.anInt2730 = arg1;
			Static327.anInt6193 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static327.anInt6193 = arg1;
			Static143.anInt2730 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static327.anInt6193 = Static371.anInt6835 - arg1;
			Static143.anInt2730 = arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static327.anInt6193 = arg0;
			Static143.anInt2730 = Static535.anInt9239 - arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static143.anInt2730 = Static535.anInt9239 - arg1;
			Static327.anInt6193 = Static371.anInt6835 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static143.anInt2730 = Static535.anInt9239 - arg0;
			Static327.anInt6193 = Static371.anInt6835 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static327.anInt6193 = arg1;
			Static143.anInt2730 = Static535.anInt9239 - arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static143.anInt2730 = arg1;
			Static327.anInt6193 = Static371.anInt6835 - arg0;
		}
		Static327.anInt6193 &= Static192.anInt3590;
		Static143.anInt2730 &= Static52.anInt1266;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class4_Sub1_Sub36 extends Class4_Sub1 {

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4732(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = this.aClass116_41.method2709(arg0);
		if (this.aClass116_41.aBoolean230) {
			@Pc(15) int[] local15 = local7[0];
			@Pc(19) int[] local19 = local7[1];
			@Pc(23) int[] local23 = local7[2];
			for (@Pc(25) int local25 = 0; local25 < Static73.anInt1626; local25++) {
				this.method4338(arg0, local25);
				@Pc(43) int[][] local43 = this.method4723(0, Static238.anInt4472);
				local15[local25] = local43[0][Static149.anInt2959];
				local19[local25] = local43[1][Static149.anInt2959];
				local23[local25] = local43[2][Static149.anInt2959];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean398 = arg0.method4666() == 1;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BII)V")
	private void method4338(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static138.anIntArray231[arg1];
		@Pc(13) int local13 = Static237.anIntArray478[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if (-3.141592653589793D <= (double) local24 && -2.356194490192345D >= (double) local24) {
			Static149.anInt2959 = arg1;
			Static238.anInt4472 = arg0;
		} else if (-1.5707963267948966D >= (double) local24 && (double) local24 >= -2.356194490192345D) {
			Static238.anInt4472 = arg1;
			Static149.anInt2959 = arg0;
		} else if (-0.7853981633974483D >= (double) local24 && (double) local24 >= -1.5707963267948966D) {
			Static149.anInt2959 = Static73.anInt1626 - arg0;
			Static238.anInt4472 = arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static238.anInt4472 = Static25.anInt379 - arg0;
			Static149.anInt2959 = arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static149.anInt2959 = Static73.anInt1626 - arg1;
			Static238.anInt4472 = Static25.anInt379 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static149.anInt2959 = Static73.anInt1626 - arg0;
			Static238.anInt4472 = Static25.anInt379 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static149.anInt2959 = arg0;
			Static238.anInt4472 = Static25.anInt379 - arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static238.anInt4472 = arg0;
			Static149.anInt2959 = Static73.anInt1626 - arg1;
		}
		Static149.anInt2959 &= Static48.anInt901;
		Static238.anInt4472 &= Static262.anInt5002;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(20) int[] local20 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			for (@Pc(26) int local26 = 0; local26 < Static73.anInt1626; local26++) {
				this.method4338(arg0, local26);
				@Pc(44) int[] local44 = this.method4736(Static238.anInt4472, 0);
				local20[local26] = local44[Static149.anInt2959];
			}
		}
		return local20;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!rj", name = "n", descriptor = "F")
	public static float aFloat194;

	@OriginalMember(owner = "client!rj", name = "o", descriptor = "Lclient!fg;")
	public static Class113 aClass113_1;

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_173 = new Class151(102, 2);

	@OriginalMember(owner = "client!rj", name = "m", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_174 = new Class151(85, 11);

	@OriginalMember(owner = "client!rj", name = "p", descriptor = "[I")
	public static final int[] anIntArray554 = new int[25];

	@OriginalMember(owner = "client!rj", name = "q", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_129 = new Class216(4, -1);

	@OriginalMember(owner = "client!rj", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!rj", name = "s", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_175 = new Class151(79, 6);

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)Lclient!rq;")
	public static Class320 method7027(@OriginalArg(0) int arg0) {
		@Pc(10) Class320 local10 = (Class320) Static310.aClass352_42.method7653((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static255.aClass34_56.method1239(1, arg0);
		local10 = new Class320();
		local10.anInt8179 = arg0;
		if (local20 != null) {
			local10.method7108(new Class4_Sub11(local20));
		}
		local10.method7109();
		if (local10.anInt8184 == 2 && Static193.aClass66_15.method1994((long) arg0) == null) {
			Static193.aClass66_15.method1985(new Class4_Sub24(Static208.anInt3374), (long) arg0);
			Static220.aClass320Array1[Static208.anInt3374++] = local10;
		}
		Static310.aClass352_42.method7655((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)B")
	public static byte method7028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!aa;IIIIJLclient!kq;II)V")
	public static void method7029(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) long arg4, @OriginalArg(6) Class199 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg2 * arg2 + arg6 * arg6;
		if (arg4 < (long) local11) {
			return;
		}
		@Pc(34) int local34 = Math.min(arg5.anInt5035 / 2, arg5.anInt4994 / 2);
		if (local11 <= local34 * local34) {
			Static559.method7427(arg2, Static404.aClass17Array14[arg7], arg6, arg0, arg1, arg3, arg5);
			return;
		}
		local34 -= 10;
		@Pc(60) int local60;
		if (Static259.anInt4200 == 4) {
			local60 = (int) Static642.aFloat230 & 0x3FFF;
		} else {
			local60 = Static354.anInt5391 + (int) Static642.aFloat230 & 0x3FFF;
		}
		@Pc(73) int local73 = Class4_Sub2_Sub26.anIntArray563[local60];
		@Pc(77) int local77 = Class4_Sub2_Sub26.anIntArray562[local60];
		if (Static259.anInt4200 != 4) {
			local77 = local77 * 256 / (Static338.anInt5228 + 256);
			local73 = local73 * 256 / (Static338.anInt5228 + 256);
		}
		@Pc(106) int local106 = arg2 * local73 + arg6 * local77 >> 14;
		@Pc(116) int local116 = arg2 * local77 - local73 * arg6 >> 14;
		@Pc(122) double local122 = Math.atan2((double) local106, (double) local116);
		@Pc(129) int local129 = (int) (Math.sin(local122) * (double) local34);
		@Pc(136) int local136 = (int) ((double) local34 * Math.cos(local122));
		Static577.aClass17Array17[arg7].method5252((float) local129 + (float) arg3 + (float) arg5.anInt5035 / 2.0F, (float) -local136 + (float) arg5.anInt4994 / 2.0F + (float) arg1, 4096, (int) (-local122 / 6.283185307179586D * 65535.0D));
	}
}

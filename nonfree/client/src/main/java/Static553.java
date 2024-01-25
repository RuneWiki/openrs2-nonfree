import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
	public static int anInt8738;

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "[Lclient!ii;")
	public static final Class169[] aClass169Array1 = new Class169[4];

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "[I")
	public static int[] anIntArray497 = new int[2];

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!nh;Z)Z")
	public static boolean method7507(@OriginalArg(0) int arg0, @OriginalArg(1) Class250 arg1) {
		Static394.aClass10_4.method4216(arg1.anIntArray376[arg0], arg1.anIntArray377[arg0], arg1.anIntArray375[arg0], Static93.anIntArray88);
		@Pc(22) int local22 = Static93.anIntArray88[2];
		if (local22 < 50) {
			return false;
		} else {
			arg1.aShortArray104[arg0] = (short) (Static538.anInt8593 + Static29.anInt420 * Static93.anIntArray88[0] / local22);
			arg1.aShortArray106[arg0] = (short) (Static310.anInt5339 + Static93.anIntArray88[1] * Static403.anInt6805 / local22);
			arg1.aShortArray105[arg0] = (short) local22;
			return true;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZLjava/lang/Object;Z)[B")
	public static byte[] method7508(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(14) byte[] local14 = (byte[]) arg0;
			return arg1 ? Static450.method6388(local14) : local14;
		} else if (arg0 instanceof Class121) {
			@Pc(29) Class121 local29 = (Class121) arg0;
			return local29.method3013();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method7509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg8 != 14091) {
			method7512(115, 11, -30, 87, -68, -42, 43);
		}
		if (arg0 == arg1 && arg6 == arg3 && arg9 == arg4 && arg5 == arg7) {
			Static32.method4588(0, arg2, arg6, arg1, arg5, arg9);
			return;
		}
		@Pc(46) int local46 = arg1;
		@Pc(48) int local48 = arg6;
		@Pc(52) int local52 = arg1 * 3;
		@Pc(56) int local56 = arg6 * 3;
		@Pc(60) int local60 = arg0 * 3;
		@Pc(64) int local64 = arg3 * 3;
		@Pc(68) int local68 = arg4 * 3;
		@Pc(72) int local72 = arg7 * 3;
		@Pc(80) int local80 = local60 + arg9 - local68 - arg1;
		@Pc(90) int local90 = local64 + arg5 - arg6 - local72;
		@Pc(100) int local100 = local68 + local52 - local60 - local60;
		@Pc(111) int local111 = local72 + local56 - local64 - local64;
		@Pc(115) int local115 = local60 - local52;
		@Pc(120) int local120 = local64 - local56;
		for (@Pc(122) int local122 = 128; local122 <= 4096; local122 += 128) {
			@Pc(130) int local130 = local122 * local122 >> 12;
			@Pc(136) int local136 = local122 * local130 >> 12;
			@Pc(140) int local140 = local80 * local136;
			@Pc(144) int local144 = local136 * local90;
			@Pc(148) int local148 = local130 * local100;
			@Pc(152) int local152 = local130 * local111;
			@Pc(156) int local156 = local115 * local122;
			@Pc(160) int local160 = local120 * local122;
			@Pc(171) int local171 = (local148 + local140 + local156 >> 12) + arg1;
			@Pc(183) int local183 = arg6 + (local144 + local152 + local160 >> 12);
			Static32.method4588(arg8 - 14091, arg2, local48, local46, local183, local171);
			local48 = local183;
			local46 = local171;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIII)V")
	public static void method7512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		for (@Pc(10) Class4_Sub7 local10 = (Class4_Sub7) Static151.aClass387_2.method9018(); local10 != null; local10 = (Class4_Sub7) Static151.aClass387_2.method9016()) {
			if (Static565.anInt8921 >= local10.anInt6934) {
				local10.method8570();
			} else {
				Static402.method5854((local10.anInt6928 << 9) + 256, local10.anInt6929, local10.anInt6932 * 2, (local10.anInt6930 << 9) + 256, arg2, arg3 >> 1, arg5, arg6 >> 1, arg1 ^ 0xFFFF0002);
				Static196.aClass70_3.method8434(Static663.anIntArray616[1] + arg0, 0, arg4 + Static663.anIntArray616[0], local10.anInt6935 | 0xFF000000, local10.aString81);
			}
		}
		if (arg1 != 2) {
			method7509(-1, -1, 96, 77, -35, 6, 97, 61, 57, 49);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public static void method7513(@OriginalArg(0) Canvas arg0) {
		@Pc(13) Dimension local13 = arg0.getSize();
		Static142.method6602(local13.width, local13.height);
		if (Static181.anInt3401 == 1) {
			Static548.aClass100_13.method8614(arg0, Static95.anInt1605, Static166.anInt3251);
		} else {
			Static548.aClass100_13.method8614(arg0, Static558.anInt8797, Static144.anInt2845);
		}
	}
}

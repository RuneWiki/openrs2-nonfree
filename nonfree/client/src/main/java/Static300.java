import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
	public static int anInt5957;

	@OriginalMember(owner = "client!vl", name = "m", descriptor = "Lclient!em;")
	public static Class46 aClass46_1;

	@OriginalMember(owner = "client!vl", name = "l", descriptor = "[Lclient!ui;")
	public static Class1_Sub3_Sub21[] aClass1_Sub3_Sub21Array4 = new Class1_Sub3_Sub21[14];

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "[I")
	public static int[] anIntArray532 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
	public static void method4569() {
		Static10.aClass89_2.method2266();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBIIII)V")
	public static void method4572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg2;
		@Pc(14) int local14 = arg4 - arg3;
		if (local10 == 0) {
			if (local14 != 0) {
				Static140.method2341(arg3, arg0, arg2, arg4);
			}
		} else if (local14 == 0) {
			Static188.method3050(arg2, arg0, arg1, arg3);
		} else {
			@Pc(44) int local44 = (local14 << 12) / local10;
			@Pc(52) int local52 = arg3 - (arg2 * local44 >> 12);
			@Pc(60) int local60;
			@Pc(68) int local68;
			if (Static170.anInt3814 > arg2) {
				local60 = Static170.anInt3814;
				local68 = local52 + (Static170.anInt3814 * local44 >> 12);
			} else if (arg2 > Static310.anInt6206) {
				local60 = Static310.anInt6206;
				local68 = (Static310.anInt6206 * local44 >> 12) + local52;
			} else {
				local60 = arg2;
				local68 = arg3;
			}
			if (local68 < Static206.anInt4449) {
				local68 = Static206.anInt4449;
				local60 = (Static206.anInt4449 - local52 << 12) / local44;
			} else if (local68 > Static90.anInt2088) {
				local68 = Static90.anInt2088;
				local60 = (Static90.anInt2088 - local52 << 12) / local44;
			}
			@Pc(144) int local144;
			@Pc(142) int local142;
			if (Static170.anInt3814 > arg1) {
				local142 = local52 + (Static170.anInt3814 * local44 >> 12);
				local144 = Static170.anInt3814;
			} else if (Static310.anInt6206 < arg1) {
				local144 = Static310.anInt6206;
				local142 = (local44 * Static310.anInt6206 >> 12) + local52;
			} else {
				local144 = arg1;
				local142 = arg4;
			}
			if (local142 < Static206.anInt4449) {
				local142 = Static206.anInt4449;
				local144 = (Static206.anInt4449 - local52 << 12) / local44;
			} else if (local142 > Static90.anInt2088) {
				local144 = (Static90.anInt2088 - local52 << 12) / local44;
				local142 = Static90.anInt2088;
			}
			Static202.method3233(local60, local68, local144, local142, arg0);
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
	public static void method4573(@OriginalArg(0) int arg0) {
		Static186.anInt4091 = -1;
		Static48.anInt1149 = 100;
		Static11.anInt308 = 3;
		Static170.anInt3807 = arg0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!th;)V")
	public static void method4574(@OriginalArg(1) Class168 arg0) {
		Static49.anInt1173 = arg0.method4069("p11_full");
		Static176.anInt3904 = arg0.method4069("p12_full");
		Static269.anInt5361 = arg0.method4069("b12_full");
		Static145.anInt6067 = arg0.method4069("hitmarks");
		Static55.anInt1220 = arg0.method4069("hitbar_default");
		Static18.anInt493 = arg0.method4069("headicons_pk");
		Static182.anInt4018 = arg0.method4069("headicons_prayer");
		Static31.anInt771 = arg0.method4069("hint_headicons");
		Static117.anInt4597 = arg0.method4069("hint_mapmarkers");
		Static146.anInt4440 = arg0.method4069("mapflag");
		Static260.anInt5267 = arg0.method4069("cross");
		Static190.anInt4208 = arg0.method4069("mapdots");
		Static49.anInt1171 = arg0.method4069("scrollbar");
		Static169.anInt3796 = arg0.method4069("name_icons");
		Static196.anInt4275 = arg0.method4069("floorshadows");
		Static208.anInt4499 = arg0.method4069("compass");
		Static279.anInt5611 = arg0.method4069("hint_mapedge");
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)Z")
	public static boolean method4578(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(16) int local16 = Static86.aShortArray64[arg0];
		if (local16 >= 2000) {
			local16 -= 2000;
		}
		return local16 == 1010;
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V")
	public static void method4581() {
		Static293.aClass89_51.method2266();
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(ILclient!th;)V")
	public static void method4582(@OriginalArg(1) Class168 arg0) {
		Static214.aClass168_159 = arg0;
	}
}

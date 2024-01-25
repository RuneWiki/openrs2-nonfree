import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!fj", name = "s", descriptor = "Lclient!wn;")
	public static Class269 aClass269_28;

	@OriginalMember(owner = "client!fj", name = "t", descriptor = "Lclient!nw;")
	public static Class5_Sub22_Sub3 aClass5_Sub22_Sub3_3;

	@OriginalMember(owner = "client!fj", name = "u", descriptor = "Lclient!um;")
	public static Class243 aClass243_122;

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_58 = new Class198("M", "M", "M", "M");

	@OriginalMember(owner = "client!fj", name = "p", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_60 = new Class194(40, 3);

	@OriginalMember(owner = "client!fj", name = "q", descriptor = "Z")
	public static boolean aBoolean233 = true;

	@OriginalMember(owner = "client!fj", name = "r", descriptor = "[I")
	public static final int[] anIntArray221 = new int[2];

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZZI[Lclient!fi;)V")
	public static void method2851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class76[] arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg4.length; local3++) {
			@Pc(9) Class76 local9 = arg4[local3];
			if (local9 != null && local9.anInt2112 == arg3) {
				Static177.method2451(arg0, local9, arg1, arg2);
				Static341.method4440(local9, arg1, arg0);
				if (local9.anInt2052 > local9.anInt2109 - local9.anInt2127) {
					local9.anInt2052 = local9.anInt2109 - local9.anInt2127;
				}
				if (local9.anInt2052 < 0) {
					local9.anInt2052 = 0;
				}
				if (local9.anInt2114 - local9.anInt2106 < local9.anInt2061) {
					local9.anInt2061 = local9.anInt2114 - local9.anInt2106;
				}
				if (local9.anInt2061 < 0) {
					local9.anInt2061 = 0;
				}
				if (local9.anInt2060 == 0) {
					Static125.method1758(arg2, local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)I")
	public static int method2852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (arg0 + local12) / arg1 - local12;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!um;I)V")
	public static void method2855(@OriginalArg(0) Class243 arg0) {
		Static425.anInt7119 = arg0.method5461("p11_full");
		Static147.anInt2653 = arg0.method5461("p12_full");
		Static54.anInt951 = arg0.method5461("b12_full");
		Static17.anInt368 = arg0.method5461("hitmarks");
		Static442.anInt7326 = arg0.method5461("hitbar_default");
		Static43.anInt5303 = arg0.method5461("timerbar_default");
		Static363.anInt5901 = arg0.method5461("headicons_pk");
		Static225.anInt3735 = arg0.method5461("headicons_prayer");
		Static419.anInt6978 = arg0.method5461("hint_headicons");
		Static319.anInt4968 = arg0.method5461("hint_mapmarkers");
		Static451.anInt7415 = arg0.method5461("mapflag");
		Static462.anInt7532 = arg0.method5461("cross");
		Static246.anInt3975 = arg0.method5461("mapdots");
		Static265.anInt4221 = arg0.method5461("scrollbar");
		Static91.anInt1609 = arg0.method5461("name_icons");
		Static103.anInt1736 = arg0.method5461("floorshadows");
		Static256.anInt4161 = arg0.method5461("compass");
		Static214.anInt3566 = arg0.method5461("otherlevel");
		Static391.anInt6412 = arg0.method5461("hint_mapedge");
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IFFIIIFFFLclient!cc;I)[B")
	public static byte[] method2856(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(6) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) float arg4, @OriginalArg(9) Class3 arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static214.method2825(local10, arg3, arg5, arg4, arg1, 0, arg0, arg2);
		return local10;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIBI)I")
	public static int method2857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(13) int local13 = arg1 & arg2 - 1;
		@Pc(17) int local17 = arg0 / arg2;
		@Pc(23) int local23 = arg0 & arg2 - 1;
		@Pc(28) int local28 = Static51.method808(local7, local17);
		@Pc(35) int local35 = Static51.method808(local7 + 1, local17);
		@Pc(42) int local42 = Static51.method808(local7, local17 + 1);
		@Pc(51) int local51 = Static51.method808(local7 + 1, local17 - -1);
		@Pc(58) int local58 = Static39.method636(local35, local28, local13, arg2);
		@Pc(70) int local70 = Static39.method636(local51, local42, local13, arg2);
		return Static39.method636(local70, local58, local23, arg2);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!fi;)V")
	public static void method2862(@OriginalArg(1) Class76 arg0) {
		if (arg0.anInt2060 == 5 && arg0.anInt2057 != -1) {
			Static35.method3332(arg0, Static407.aClass200_9);
		}
	}
}

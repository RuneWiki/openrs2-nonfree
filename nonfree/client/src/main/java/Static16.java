import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!cc", name = "cb", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas10;

	@OriginalMember(owner = "client!cc", name = "db", descriptor = "[I")
	public static int[] anIntArray383;

	@OriginalMember(owner = "client!cc", name = "R", descriptor = "Lclient!jb;")
	public static Class33 aClass33_35 = new Class33(64);

	@OriginalMember(owner = "client!cc", name = "T", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1214 = Static108.method1915("k");

	@OriginalMember(owner = "client!cc", name = "V", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1215 = Static108.method1915("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
	public static int anInt2466 = 0;

	@OriginalMember(owner = "client!cc", name = "Y", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1216 = Static108.method1915("Welt");

	@OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
	public static int anInt2469 = -1;

	@OriginalMember(owner = "client!cc", name = "fb", descriptor = "I")
	public static int anInt2472 = 0;

	@OriginalMember(owner = "client!cc", name = "gb", descriptor = "I")
	public static volatile int anInt2473 = 0;

	@OriginalMember(owner = "client!cc", name = "hb", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1217 = Static108.method1915("Add ignore");

	@OriginalMember(owner = "client!cc", name = "ib", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1218 = Static108.method1915("null");

	@OriginalMember(owner = "client!cc", name = "jb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1219 = Static108.method1915("<col=ff7000>");

	@OriginalMember(owner = "client!cc", name = "kb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1220 = aClass39_1217;

	@OriginalMember(owner = "client!cc", name = "lb", descriptor = "I")
	public static int anInt2474 = -1;

	@OriginalMember(owner = "client!cc", name = "mb", descriptor = "I")
	public static int anInt2475 = 1;

	@OriginalMember(owner = "client!cc", name = "nb", descriptor = "[Lclient!kd;")
	public static Class39[] aClass39Array25 = new Class39[100];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII[Lclient!ge;IIII[BI)V")
	public static void method1791(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class23[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8) {
		for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
			for (@Pc(21) int local21 = 0; local21 < 8; local21++) {
				if (local17 + arg1 > 0 && local17 + arg1 < 103 && local21 + arg5 > 0 && local21 + arg5 < 103) {
					arg2[arg4].anIntArrayArray9[local17 + arg1][arg5 + local21] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(100) Class1_Sub18 local100 = new Class1_Sub18(arg7);
		for (@Pc(102) int local102 = 0; local102 < 4; local102++) {
			for (@Pc(106) int local106 = 0; local106 < 64; local106++) {
				for (@Pc(110) int local110 = 0; local110 < 64; local110++) {
					if (arg0 == local102 && arg3 <= local106 && local106 < arg3 + 8 && local110 >= arg8 && local110 < arg8 + 8) {
						Static59.method1061(0, 0, local100, arg1 + Static8.method225(arg6, local106 & 0x7, local110 & 0x7), arg4, Static117.method2028(arg6, local106 & 0x7, local110 & 0x7) + arg5, arg6);
					} else {
						Static59.method1061(0, 0, local100, -1, 0, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
	public static void method1792() {
		aClass39Array25 = null;
		aClass39_1214 = null;
		aClass33_35 = null;
		aCanvas10 = null;
		anIntArray383 = null;
		aClass39_1217 = null;
		aClass39_1219 = null;
		aClass39_1220 = null;
		aClass39_1216 = null;
		aClass39_1215 = null;
		aClass39_1218 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BIIII)V")
	public static void method1793(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) Static62.aClass70_11.method1961((long) arg3);
		if (local16 == null) {
			local16 = new Class1_Sub2();
			Static62.aClass70_11.method1955(local16, (long) arg3);
		}
		if (local16.anIntArray20.length <= arg0) {
			@Pc(42) int[] local42 = new int[arg0 + 1];
			@Pc(47) int[] local47 = new int[arg0 + 1];
			for (@Pc(49) int local49 = 0; local49 < local16.anIntArray20.length; local49++) {
				local47[local49] = local16.anIntArray20[local49];
				local42[local49] = local16.anIntArray22[local49];
			}
			for (@Pc(75) int local75 = local16.anIntArray20.length; local75 < arg0; local75++) {
				local47[local75] = -1;
				local42[local75] = 0;
			}
			local16.anIntArray22 = local42;
			local16.anIntArray20 = local47;
		}
		local16.anIntArray20[arg0] = arg2;
		local16.anIntArray22[arg0] = arg1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!mf;B)V")
	public static void method1794(@OriginalArg(0) Class1_Sub1_Sub2_Sub1 arg0) {
		arg0.aBoolean203 = false;
		@Pc(22) Class1_Sub1_Sub7 local22;
		if (arg0.anInt2495 != -1) {
			local22 = Static82.method1398(arg0.anInt2495);
			if (local22 == null || local22.anIntArray151 == null) {
				arg0.anInt2495 = -1;
			} else {
				arg0.anInt2511++;
				if (local22.anIntArray151.length > arg0.anInt2524 && local22.anIntArray149[arg0.anInt2524] < arg0.anInt2511) {
					arg0.anInt2524++;
					arg0.anInt2511 = 1;
					Static73.method1255(arg0.anInt2521, local22, arg0.anInt2508, arg0.anInt2524);
				}
				if (arg0.anInt2524 >= local22.anIntArray151.length) {
					arg0.anInt2511 = 0;
					arg0.anInt2524 = 0;
					Static73.method1255(arg0.anInt2521, local22, arg0.anInt2508, arg0.anInt2524);
				}
			}
		}
		if (arg0.anInt2535 != -1 && arg0.anInt2493 <= Static45.anInt1256) {
			if (arg0.anInt2506 < 0) {
				arg0.anInt2506 = 0;
			}
			@Pc(128) int local128 = Static64.method1146(arg0.anInt2535).anInt2616;
			if (local128 == -1) {
				arg0.anInt2535 = -1;
			} else {
				@Pc(140) Class1_Sub1_Sub7 local140 = Static82.method1398(local128);
				if (local140 == null || local140.anIntArray151 == null) {
					arg0.anInt2535 = -1;
				} else {
					arg0.anInt2519++;
					if (local140.anIntArray151.length > arg0.anInt2506 && local140.anIntArray149[arg0.anInt2506] < arg0.anInt2519) {
						arg0.anInt2506++;
						arg0.anInt2519 = 1;
						Static73.method1255(arg0.anInt2521, local140, arg0.anInt2508, arg0.anInt2506);
					}
					if (arg0.anInt2506 >= local140.anIntArray151.length && (arg0.anInt2506 < 0 || arg0.anInt2506 >= local140.anIntArray151.length)) {
						arg0.anInt2535 = -1;
					}
				}
			}
		}
		if (arg0.anInt2526 != -1 && arg0.anInt2492 <= 1) {
			local22 = Static82.method1398(arg0.anInt2526);
			if (local22.anInt1034 == 1 && arg0.anInt2482 > 0 && arg0.anInt2490 <= Static45.anInt1256 && Static45.anInt1256 > arg0.anInt2502) {
				arg0.anInt2492 = 1;
				return;
			}
		}
		if (arg0.anInt2526 != -1 && arg0.anInt2492 == 0) {
			local22 = Static82.method1398(arg0.anInt2526);
			if (local22 == null || local22.anIntArray151 == null) {
				arg0.anInt2526 = -1;
			} else {
				arg0.anInt2534++;
				if (local22.anIntArray151.length > arg0.anInt2485 && arg0.anInt2534 > local22.anIntArray149[arg0.anInt2485]) {
					arg0.anInt2485++;
					arg0.anInt2534 = 1;
					Static73.method1255(arg0.anInt2521, local22, arg0.anInt2508, arg0.anInt2485);
				}
				if (local22.anIntArray151.length <= arg0.anInt2485) {
					arg0.anInt2518++;
					arg0.anInt2485 -= local22.anInt1047;
					if (local22.anInt1042 <= arg0.anInt2518) {
						arg0.anInt2526 = -1;
					} else if (arg0.anInt2485 >= 0 && local22.anIntArray151.length > arg0.anInt2485) {
						Static73.method1255(arg0.anInt2521, local22, arg0.anInt2508, arg0.anInt2485);
					} else {
						arg0.anInt2526 = -1;
					}
				}
				arg0.aBoolean203 = local22.aBoolean95;
			}
		}
		if (arg0.anInt2492 > 0) {
			arg0.anInt2492--;
		}
	}
}

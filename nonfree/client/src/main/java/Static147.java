import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!rd", name = "Q", descriptor = "Lclient!td;")
	public static Class84 aClass84_2;

	@OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
	private static int anInt731;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_11 = new Class66(30);

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_224 = Static177.method3050("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_225 = Static177.method3050("mapfunction");

	@OriginalMember(owner = "client!rd", name = "E", descriptor = "[I")
	public static final int[] anIntArray64 = new int[2000];

	@OriginalMember(owner = "client!rd", name = "I", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_226 = Static177.method3050("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
	public static int anInt729 = 0;

	@OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
	public static int anInt730 = 0;

	@OriginalMember(owner = "client!rd", name = "S", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_227 = Static177.method3050("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!h;Lclient!jd;I)I")
	public static int method464(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) Class46 arg1) {
		@Pc(14) int local14 = arg0.anInt1597;
		arg0.method1277(arg1.anInt2141);
		arg0.anInt1597 += Static55.aClass82_1.method2692(arg1.aByteArray20, arg1.anInt2141, arg0.aByteArray19, arg0.anInt1597, 0);
		return arg0.anInt1597 - local14;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZIIIII)V")
	public static void method468(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == Static60.anInt1484 && Static55.anInt1366 == arg1 && (arg3 == Static146.anInt3365 || !Static103.aBoolean113)) {
			return;
		}
		Static60.anInt1484 = arg0;
		Static146.anInt3365 = arg3;
		if (!Static103.aBoolean113) {
			Static146.anInt3365 = 0;
		}
		Static55.anInt1366 = arg1;
		Static187.method3168(25);
		Static13.method264(true, Static128.aClass46_1117);
		@Pc(40) int local40 = Static184.anInt4144;
		Static184.anInt4144 = (arg1 - 6) * 8;
		@Pc(48) int local48 = Static103.anInt2610;
		Static103.anInt2610 = (arg0 - 6) * 8;
		@Pc(58) int local58 = Static184.anInt4144 - local40;
		@Pc(63) int local63 = Static103.anInt2610 - local48;
		for (@Pc(69) int local69 = 0; local69 < 32768; local69++) {
			@Pc(75) Class4_Sub1_Sub1_Sub1_Sub2 local75 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local69];
			if (local75 != null) {
				for (@Pc(79) int local79 = 0; local79 < 10; local79++) {
					local75.anIntArray262[local79] -= local63;
					local75.anIntArray259[local79] -= local58;
				}
				local75.anInt2803 -= local58 * 128;
				local75.anInt2832 -= local63 * 128;
			}
		}
		for (@Pc(125) int local125 = 0; local125 < 2048; local125++) {
			@Pc(131) Class4_Sub1_Sub1_Sub1_Sub1 local131 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local125];
			if (local131 != null) {
				for (@Pc(135) int local135 = 0; local135 < 10; local135++) {
					local131.anIntArray262[local135] -= local63;
					local131.anIntArray259[local135] -= local58;
				}
				local131.anInt2803 -= local58 * 128;
				local131.anInt2832 -= local63 * 128;
			}
		}
		Static73.anInt1873 = arg3;
		Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.method2116(arg2, false, arg4);
		@Pc(189) byte local189 = 0;
		@Pc(191) byte local191 = 1;
		@Pc(193) byte local193 = 104;
		if (local63 < 0) {
			local191 = -1;
			local189 = 103;
			local193 = -1;
		}
		@Pc(203) byte local203 = 104;
		@Pc(205) byte local205 = 0;
		@Pc(207) byte local207 = 1;
		if (local58 < 0) {
			local203 = -1;
			local207 = -1;
			local205 = 103;
		}
		for (@Pc(220) int local220 = local189; local220 != local193; local220 += local191) {
			for (@Pc(224) int local224 = local205; local224 != local203; local224 += local207) {
				@Pc(230) int local230 = local63 + local220;
				@Pc(234) int local234 = local58 + local224;
				for (@Pc(236) int local236 = 0; local236 < 4; local236++) {
					if (local230 >= 0 && local234 >= 0 && local230 < 104 && local234 < 104) {
						Static122.aClass11ArrayArrayArray1[local236][local220][local224] = Static122.aClass11ArrayArrayArray1[local236][local230][local234];
					} else {
						Static122.aClass11ArrayArrayArray1[local236][local220][local224] = null;
					}
				}
			}
		}
		for (@Pc(303) Class4_Sub13 local303 = (Class4_Sub13) Static185.aClass11_16.method274(); local303 != null; local303 = (Class4_Sub13) Static185.aClass11_16.method271()) {
			local303.anInt2389 -= local58;
			local303.anInt2391 -= local63;
			if (local303.anInt2391 < 0 || local303.anInt2389 < 0 || local303.anInt2391 >= 104 || local303.anInt2389 >= 104) {
				local303.method3173();
			}
		}
		if (Static4.anInt2846 != 0) {
			Static170.anInt3809 -= local58;
			Static4.anInt2846 -= local63;
		}
		Static103.anInt2609 = -1;
		Static35.aBoolean47 = false;
		Static57.anInt1406 = 0;
		Static103.aClass11_10.method280();
		Static29.aClass11_3.method280();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Z")
	public static boolean method471(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
	public static void method477() {
		Static27.aClass66_12.method2218();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIZ)V")
	public static void method478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class11 local11 = Static122.aClass11ArrayArrayArray1[Static73.anInt1873][arg1][arg0];
		if (local11 == null) {
			Static36.method638(Static73.anInt1873, arg1, arg0);
			return;
		}
		@Pc(30) int local30 = -99999999;
		@Pc(32) Class4_Sub1_Sub1_Sub7 local32 = null;
		@Pc(37) Class4_Sub1_Sub1_Sub7 local37;
		for (local37 = (Class4_Sub1_Sub1_Sub7) local11.method274(); local37 != null; local37 = (Class4_Sub1_Sub1_Sub7) local11.method271()) {
			@Pc(43) Class4_Sub1_Sub12 local43 = Static83.method1663(local37.anInt1988);
			@Pc(46) int local46 = local43.anInt2484;
			if (local43.anInt2481 == 1) {
				local46 *= local37.anInt1983 + 1;
			}
			if (local30 < local46) {
				local30 = local46;
				local32 = local37;
			}
		}
		if (local32 == null) {
			Static36.method638(Static73.anInt1873, arg1, arg0);
			return;
		}
		local11.method273(local32);
		local37 = (Class4_Sub1_Sub1_Sub7) local11.method274();
		@Pc(89) Class4_Sub1_Sub1_Sub7 local89 = null;
		@Pc(91) Class4_Sub1_Sub1_Sub7 local91 = null;
		while (local37 != null) {
			if (local37.anInt1988 != local32.anInt1988) {
				if (local91 == null) {
					local91 = local37;
				}
				if (local91.anInt1988 != local37.anInt1988 && local89 == null) {
					local89 = local37;
				}
			}
			local37 = (Class4_Sub1_Sub1_Sub7) local11.method271();
		}
		@Pc(130) long local130 = (long) (arg1 + (arg0 << 7) + 1610612736);
		Static85.method1705(Static73.anInt1873, arg1, arg0, Static106.method1998(arg1 * 128 + 64, Static73.anInt1873, arg0 * 128 + 64), local32, local130, local91, local89);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIBI)I")
	public static int method480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(8) int local8 = arg3;
			arg3 = arg5;
			arg5 = local8;
		}
		@Pc(16) int local16 = arg4 & 0x3;
		if (local16 == 0) {
			return arg2;
		} else if (local16 == 1) {
			return 7 + 1 - arg1 - arg3;
		} else if (local16 == 2) {
			return 1 + 7 - arg5 - arg2;
		} else {
			return arg1;
		}
	}
}

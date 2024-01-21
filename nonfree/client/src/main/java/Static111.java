import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
	public static int anInt2632;

	@OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
	public static int anInt2638;

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "Lclient!od;")
	public static Class60 aClass60_1021 = Static41.method597("event_opbase");

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "Lclient!od;")
	public static Class60 aClass60_1022 = Static41.method597("Fallen lassen");

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "Lclient!od;")
	public static Class60 aClass60_1023 = Static41.method597("Passwort: ");

	@OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
	public static int anInt2633 = 0;

	@OriginalMember(owner = "client!tc", name = "U", descriptor = "Lclient!od;")
	private static Class60 aClass60_1025 = Static41.method597("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!tc", name = "S", descriptor = "Lclient!od;")
	public static Class60 aClass60_1024 = aClass60_1025;

	@OriginalMember(owner = "client!tc", name = "X", descriptor = "Lclient!od;")
	public static Class60 aClass60_1026 = Static41.method597("swe");

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BZII)V")
	public static void method1831(@OriginalArg(1) boolean arg0) {
		Static6.aBoolean2 = arg0;
		Static115.anInt2690 = 22050;
		Static39.anInt1048 = 2;
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
	public static void method1832() {
		aClass60_1024 = null;
		aClass60_1023 = null;
		aClass60_1021 = null;
		aClass60_1026 = null;
		aClass60_1025 = null;
		aClass60_1022 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZIIII)Lclient!rd;")
	public static Class4_Sub3_Sub6_Sub3 method1833(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(20) long local20 = ((long) arg3 << 40) + ((long) arg4 << 16) + (long) arg0 + ((long) arg2 << 38);
		@Pc(32) Class4_Sub3_Sub6_Sub3 local32;
		if (!arg1) {
			local32 = (Class4_Sub3_Sub6_Sub3) Static38.aClass12_8.method289(local20);
			if (local32 != null) {
				return local32;
			}
		}
		@Pc(40) Class4_Sub3_Sub16 local40 = Static112.method1854(arg0);
		if (arg4 > 1 && local40.anIntArray344 != null) {
			@Pc(50) int local50 = -1;
			for (@Pc(52) int local52 = 0; local52 < 10; local52++) {
				if (local40.anIntArray343[local52] <= arg4 && local40.anIntArray343[local52] != 0) {
					local50 = local40.anIntArray344[local52];
				}
			}
			if (local50 != -1) {
				local40 = Static112.method1854(local50);
			}
		}
		@Pc(97) Class4_Sub3_Sub1_Sub7 local97 = local40.method1964(1);
		if (local97 == null) {
			return null;
		}
		@Pc(103) Class4_Sub3_Sub6_Sub3 local103 = null;
		if (local40.anInt2863 != -1) {
			local103 = method1833(local40.anInt2902, true, 1, 0, 10);
			if (local103 == null) {
				return null;
			}
		}
		@Pc(123) int local123 = Static34.anInt2345;
		@Pc(126) int[] local126 = new int[4];
		@Pc(128) int[] local128 = Static34.anIntArray298;
		@Pc(130) int local130 = Static34.anInt2348;
		Static34.method1664(local126);
		local32 = new Class4_Sub3_Sub6_Sub3(36, 32);
		Static34.method1655(local32.anIntArray297, 36, 32);
		Static34.method1659();
		Static100.method1669();
		Static100.method1678(16, 16);
		Static100.aBoolean86 = false;
		@Pc(153) int local153 = local40.anInt2875;
		if (arg1) {
			local153 = (int) ((double) local153 * 1.5D);
		} else if (arg2 == 2) {
			local153 = (int) ((double) local153 * 1.04D);
		}
		@Pc(183) int local183 = local153 * Class4_Sub3_Sub6_Sub4.anIntArray301[local40.anInt2907] >> 16;
		@Pc(192) int local192 = local153 * Class4_Sub3_Sub6_Sub4.anIntArray304[local40.anInt2907] >> 16;
		local97.method1493();
		local97.method1492(local40.anInt2883, local40.anInt2877, local40.anInt2907, local40.anInt2888, local97.anInt2166 / 2 + local183 + local40.anInt2891, local40.anInt2891 + local192);
		if (arg2 >= 1) {
			local32.method1612(1);
		}
		if (arg2 >= 2) {
			local32.method1612(16777215);
		}
		if (arg3 != 0) {
			local32.method1608(arg3);
		}
		Static34.method1655(local32.anIntArray297, 36, 32);
		if (local40.anInt2863 != -1) {
			local103.method1632(0, 0);
		}
		if (!arg1 && (local40.anInt2866 == 1 || arg4 != 1) && arg4 != -1) {
			Static75.aClass4_Sub3_Sub6_Sub1_Sub1_4.method1204(Static79.method1278(arg4), 0, 9, 16776960, 1);
		}
		if (!arg1) {
			Static38.aClass12_8.method290(local32, local20);
		}
		Static34.method1655(local128, local123, local130);
		Static34.method1648(local126);
		Static100.method1669();
		Static100.aBoolean86 = true;
		return local32;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII)V")
	public static void method1834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static46.anInt1147 == 0 || arg1 == 0 || Static118.anInt2731 >= 50) {
			return;
		}
		Static98.anIntArray295[Static118.anInt2731] = arg2;
		Static11.anIntArray40[Static118.anInt2731] = arg1;
		Static123.anIntArray339[Static118.anInt2731] = arg0;
		Static40.aClass9Array1[Static118.anInt2731] = null;
		Static67.anIntArray191[Static118.anInt2731] = 0;
		Static118.anInt2731++;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!ip", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
	public static int anInt2737;

	@OriginalMember(owner = "client!ip", name = "m", descriptor = "I")
	public static int anInt2738;

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_67 = new Class85("slide:", "", "", "");

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIBI)Lclient!mc;")
	public static Class5_Sub1_Sub13 method2506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg1 << 8 | arg2;
		@Pc(18) Class5_Sub1_Sub13 local18 = (Class5_Sub1_Sub13) Static4.aClass122_1.method3177((long) local9 << 16);
		if (local18 != null) {
			return local18;
		}
		@Pc(30) byte[] local30 = Static1.aClass93_1.method2392(Static1.aClass93_1.method2415(local9));
		if (local30 == null) {
			local9 = arg0 + 65536 << 8 | arg2;
			local18 = (Class5_Sub1_Sub13) Static4.aClass122_1.method3177((long) local9 << 16);
			if (local18 != null) {
				return local18;
			}
			local30 = Static1.aClass93_1.method2392(Static1.aClass93_1.method2415(local9));
			if (local30 == null) {
				local9 = arg2 | 0xFFFF00;
				local18 = (Class5_Sub1_Sub13) Static4.aClass122_1.method3177((long) local9 << 16);
				if (local18 != null) {
					return local18;
				}
				local30 = Static1.aClass93_1.method2392(Static1.aClass93_1.method2415(local9));
				if (local30 == null) {
					return null;
				} else if (local30.length <= 1) {
					return null;
				} else {
					local18 = Static311.method3257(local30);
					local18.anInt3777 = arg2;
					Static4.aClass122_1.method3181((long) local9 << 16, local18);
					return local18;
				}
			} else if (local30.length <= 1) {
				return null;
			} else {
				local18 = Static311.method3257(local30);
				local18.anInt3777 = arg2;
				Static4.aClass122_1.method3181((long) local9 << 16, local18);
				return local18;
			}
		} else if (local30.length <= 1) {
			return null;
		} else {
			local18 = Static311.method3257(local30);
			local18.anInt3777 = arg2;
			Static4.aClass122_1.method3181((long) local9 << 16, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
	public static void method2507() {
		Static98.method1776();
		Static114.method1987();
		Static161.method2847();
		Static155.method2780();
		Static239.method4262();
		Static211.method3887();
		Static143.method2571();
		Static170.method3097();
		Static238.method4229();
		Static197.method3482();
		Static32.method560();
		Static66.method5230();
		Static233.method4155();
		Static148.method2693();
		Static127.method2263();
		Static215.method3931();
		Static103.method4837();
		Static314.method5476();
		Static39.method618();
		Static324.method5615();
		Static332.method6055();
		Static330.method5729();
		Static47.method793();
		Static150.aClass109_35.method2850();
		Static35.aClass109_9.method2850();
		Static329.aClass109_59.method2850();
		Static286.aClass109_50.method2850();
		Static108.aClass109_24.method2850();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIZ)V")
	public static void method2508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(17) Class5_Sub1_Sub2 local17 = Static166.method3027(arg1, 11);
		local17.method850();
		local17.anInt996 = arg2;
		local17.anInt994 = arg0;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)I")
	public static int method2509() {
		return ((Static263.anInt5208 == 0 ? 0 : 1) << 22) + ((Static349.anInt6699 == 0 ? 0 : 1) << 21) + ((Static226.anInt4453 == 0 ? 0 : 1) << 20) + ((Static230.aBoolean379 ? 1 : 0) << 19) + (Static161.anInt3186 << 17) + ((Static34.aBoolean42 ? 1 : 0) << 16) + ((Static280.aBoolean452 ? 1 : 0) << 13) + ((Static178.aBoolean274 ? 1 : 0) << 8) + ((Static323.aBoolean522 ? 1 : 0) << 5) + (Static192.anInt3806 & 0x7) + ((Static258.aBoolean423 ? 1 : 0) << 3) + ((Static215.aBoolean349 ? 1 : 0) << 4) + ((Static352.aBoolean585 ? 1 : 0) << 6) + ((Static306.aBoolean497 ? 1 : 0) << 9) + ((Static157.aBoolean233 ? 1 : 0) << 10) + ((Static95.anInt1828 & 0x3) << 11) + ((Static248.aBoolean414 ? 1 : 0) << 15) + (Static257.method4518() << 23) + (Static136.anInt2582 << 25) + ((Static326.aBoolean530 ? 1 : 0) << 27) + (Static254.anInt5030 << 28);
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V")
	public static void method2510() {
		@Pc(8) Class5_Sub1_Sub2 local8 = Static166.method3027(0, 15);
		local8.method856();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(III)V")
	public static void method2511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static348.anInt6698 = arg0 - Static290.anInt2776;
		Static211.anInt4169 = arg1 - Static290.anInt2772;
	}
}

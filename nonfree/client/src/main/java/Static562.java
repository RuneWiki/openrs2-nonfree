import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "Lclient!ql;")
	public static Class154 aClass154_9;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)Lclient!kr;")
	public static Class137 method8096() {
		try {
			return (Class137) Class.forName("Class137_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return new Class137_Sub2();
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BIII)I")
	public static int method8097(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static197.aByteArrayArrayArray24[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static197.aByteArrayArrayArray24[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IILclient!ria;BIII)Z")
	public static boolean method8098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class290 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static365.aBoolean444 || !Static231.aBoolean325) {
			return false;
		} else if (Static113.anInt2246 < 100) {
			return false;
		} else if (arg4 != arg3 || arg1 != arg5) {
			for (@Pc(55) int local55 = arg4; local55 <= arg3; local55++) {
				for (@Pc(59) int local59 = arg1; local59 <= arg5; local59++) {
					if (Static518.anIntArrayArrayArray19[arg0][local55][local59] == -Static299.anInt5834) {
						return false;
					}
				}
			}
			if (Static613.method8513(arg2)) {
				Static2.anInt10++;
				return true;
			} else {
				return false;
			}
		} else if (!Static606.method7456(arg1, arg4, arg0)) {
			return false;
		} else if (Static613.method8513(arg2)) {
			Static2.anInt10++;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)V")
	public static void method8099() {
		Static603.method8464(Static478.aClass302_56);
		Static511.anInt8900++;
		if (Static479.aBoolean562 && Static66.aBoolean91) {
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			if (Static389.aBoolean497) {
				local28 = Static240.method4161();
				local30 = Static452.method6945();
			}
			@Pc(44) int local44 = Static429.aClass71_1.method7701() + local28;
			@Pc(50) int local50 = local30 + Static429.aClass71_1.method7702();
			local50 -= Static393.anInt7353;
			local44 -= Static262.anInt5205;
			if (local44 < Static618.anInt10218) {
				local44 = Static618.anInt10218;
			}
			if (local50 < Static112.anInt2201) {
				local50 = Static112.anInt2201;
			}
			if (local44 + Static478.aClass302_56.anInt8801 > Static618.anInt10218 - -Static228.aClass302_30.anInt8801) {
				local44 = Static618.anInt10218 + Static228.aClass302_30.anInt8801 - Static478.aClass302_56.anInt8801;
			}
			if (Static478.aClass302_56.anInt8814 + local50 > Static228.aClass302_30.anInt8814 + Static112.anInt2201) {
				local50 = Static112.anInt2201 + Static228.aClass302_30.anInt8814 - Static478.aClass302_56.anInt8814;
			}
			@Pc(113) int local113 = Static228.aClass302_30.anInt8787 + local44 - Static618.anInt10218;
			@Pc(120) int local120 = Static228.aClass302_30.anInt8804 + local50 - Static112.anInt2201;
			@Pc(135) Class6_Sub10 local135;
			if (Static429.aClass71_1.method7705()) {
				if (Static478.aClass302_56.anInt8831 < Static511.anInt8900) {
					@Pc(210) int local210 = local44 - Static64.anInt10318;
					@Pc(214) int local214 = local50 - Static269.anInt5358;
					if (Static478.aClass302_56.anInt8792 < local210 || local210 < -Static478.aClass302_56.anInt8792 || Static478.aClass302_56.anInt8792 < local214 || -Static478.aClass302_56.anInt8792 > local214) {
						Static243.aBoolean342 = true;
					}
				}
				if (Static478.aClass302_56.anObjectArray19 != null && Static243.aBoolean342) {
					local135 = new Class6_Sub10();
					local135.anObjectArray1 = Static478.aClass302_56.anObjectArray19;
					local135.anInt1847 = local120;
					local135.aClass302_14 = Static478.aClass302_56;
					local135.anInt1851 = local113;
					Static244.method4193(local135);
				}
			} else {
				if (Static243.aBoolean342) {
					Static633.method8924();
					if (Static478.aClass302_56.anObjectArray16 != null) {
						local135 = new Class6_Sub10();
						local135.anInt1851 = local113;
						local135.anObjectArray1 = Static478.aClass302_56.anObjectArray16;
						local135.aClass302_14 = Static478.aClass302_56;
						local135.aClass302_15 = Static94.aClass302_16;
						local135.anInt1847 = local120;
						Static244.method4193(local135);
					}
					if (Static94.aClass302_16 != null && Static78.method1365(Static478.aClass302_56) != null) {
						Static483.method7219(Static478.aClass302_56, Static94.aClass302_16);
					}
				} else if ((Static414.anInt7552 == 1 || Static77.method1324()) && Static462.anInt8179 > 2) {
					Static64.method8730(Static64.anInt10318 + Static262.anInt5205, Static269.anInt5358 + Static393.anInt7353);
				} else if (Static490.method7377()) {
					Static64.method8730(Static64.anInt10318 + Static262.anInt5205, Static269.anInt5358 + Static393.anInt7353);
				}
				Static478.aClass302_56 = null;
			}
		} else if (Static511.anInt8900 > 1) {
			Static478.aClass302_56 = null;
		}
	}
}

import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!td", name = "r", descriptor = "I")
	public static int anInt2900;

	@OriginalMember(owner = "client!td", name = "f", descriptor = "I")
	public static int anInt2892 = 0;

	@OriginalMember(owner = "client!td", name = "m", descriptor = "Lclient!af;")
	public static Class5 aClass5_1327 = Static45.method1937("swe");

	@OriginalMember(owner = "client!td", name = "q", descriptor = "I")
	public static int anInt2899 = 0;

	@OriginalMember(owner = "client!td", name = "t", descriptor = "Lclient!af;")
	public static Class5 aClass5_1328 = Static45.method1937("<col=80ff00>");

	@OriginalMember(owner = "client!td", name = "w", descriptor = "I")
	public static int anInt2902 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!cd;)V")
	public static void method2033(@OriginalArg(1) Class1_Sub3_Sub4_Sub2 arg0) {
		arg0.anInt3087 = arg0.anInt3051;
		if (arg0.anInt3047 == 0) {
			arg0.anInt3035 = 0;
			return;
		}
		if (arg0.anInt3068 != -1 && arg0.anInt3048 == 0) {
			@Pc(30) Class1_Sub3_Sub11 local30 = Static77.method1316(arg0.anInt3068);
			if (arg0.anInt3061 > 0 && local30.anInt2033 == 0) {
				arg0.anInt3035++;
				return;
			}
			if (arg0.anInt3061 <= 0 && local30.anInt2039 == 0) {
				arg0.anInt3035++;
				return;
			}
		}
		@Pc(62) int local62 = arg0.anInt3079;
		@Pc(77) int local77 = arg0.anInt3063 * 64 + arg0.anIntArray443[arg0.anInt3047 - 1] * 128;
		@Pc(92) int local92 = arg0.anInt3063 * 64 + arg0.anIntArray446[arg0.anInt3047 - 1] * 128;
		@Pc(95) int local95 = arg0.anInt3089;
		if (local77 - local95 > 256 || local77 - local95 < -256 || local92 - local62 > 256 || local92 - local62 < -256) {
			arg0.anInt3089 = local77;
			arg0.anInt3079 = local92;
			return;
		}
		if (local77 > local95) {
			if (local62 < local92) {
				arg0.anInt3080 = 1280;
			} else if (local62 <= local92) {
				arg0.anInt3080 = 1536;
			} else {
				arg0.anInt3080 = 1792;
			}
		} else if (local95 <= local77) {
			if (local62 < local92) {
				arg0.anInt3080 = 1024;
			} else if (local62 > local92) {
				arg0.anInt3080 = 0;
			}
		} else if (local92 > local62) {
			arg0.anInt3080 = 768;
		} else if (local92 < local62) {
			arg0.anInt3080 = 256;
		} else {
			arg0.anInt3080 = 512;
		}
		@Pc(202) int local202 = arg0.anInt3078;
		@Pc(204) boolean local204 = true;
		@Pc(206) int local206 = 4;
		@Pc(215) int local215 = arg0.anInt3080 - arg0.anInt3073 & 0x7FF;
		if (local215 > 1024) {
			local215 -= 2048;
		}
		if (local215 >= -256 && local215 <= 256) {
			local202 = arg0.anInt3046;
		} else if (local215 >= 256 && local215 < 768) {
			local202 = arg0.anInt3041;
		} else if (local215 >= -768 && local215 <= -256) {
			local202 = arg0.anInt3055;
		}
		if (local202 == -1) {
			local202 = arg0.anInt3046;
		}
		arg0.anInt3087 = local202;
		if (arg0 instanceof Class1_Sub3_Sub4_Sub2_Sub2) {
			local204 = ((Class1_Sub3_Sub4_Sub2_Sub2) arg0).aClass1_Sub3_Sub12_1.aBoolean72;
		}
		if (local204) {
			if (arg0.anInt3073 != arg0.anInt3080 && arg0.anInt3039 == -1 && arg0.anInt3056 != 0) {
				local206 = 2;
			}
			if (arg0.anInt3047 > 2) {
				local206 = 6;
			}
			if (arg0.anInt3047 > 3) {
				local206 = 8;
			}
			if (arg0.anInt3035 > 0 && arg0.anInt3047 > 1) {
				local206 = 8;
				arg0.anInt3035--;
			}
		} else {
			if (arg0.anInt3047 > 1) {
				local206 = 6;
			}
			if (arg0.anInt3047 > 2) {
				local206 = 8;
			}
			if (arg0.anInt3035 > 0 && arg0.anInt3047 > 1) {
				arg0.anInt3035--;
				local206 = 8;
			}
		}
		if (arg0.aBooleanArray27[arg0.anInt3047 - 1]) {
			local206 <<= 0x1;
		}
		if (local206 >= 8 && arg0.anInt3046 == arg0.anInt3087 && arg0.anInt3036 != -1) {
			arg0.anInt3087 = arg0.anInt3036;
		}
		if (local62 < local92) {
			arg0.anInt3079 += local206;
			if (local92 < arg0.anInt3079) {
				arg0.anInt3079 = local92;
			}
		} else if (local92 < local62) {
			arg0.anInt3079 -= local206;
			if (local92 > arg0.anInt3079) {
				arg0.anInt3079 = local92;
			}
		}
		if (local77 > local95) {
			arg0.anInt3089 += local206;
			if (arg0.anInt3089 > local77) {
				arg0.anInt3089 = local77;
			}
		} else if (local77 < local95) {
			arg0.anInt3089 -= local206;
			if (local77 > arg0.anInt3089) {
				arg0.anInt3089 = local77;
			}
		}
		if (local77 == arg0.anInt3089 && arg0.anInt3079 == local92) {
			if (arg0.anInt3061 > 0) {
				arg0.anInt3061--;
			}
			arg0.anInt3047--;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!oc;IILjava/awt/Component;)Lclient!kc;")
	public static Class10 method2034(@OriginalArg(0) int arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Component arg3) {
		if (Static45.anInt2755 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(30) Class10 local30 = (Class10) Class.forName("Class10_Sub2").getDeclaredConstructor().newInstance();
			local30.anInt1776 = arg2;
			local30.anIntArray291 = new int[(Static69.aBoolean49 ? 2 : 1) * 256];
			local30.method1298(arg3);
			local30.anInt1772 = (arg2 & -1024) + 1024;
			if (local30.anInt1772 > 16384) {
				local30.anInt1772 = 16384;
			}
			local30.method1294(local30.anInt1772);
			if (Static78.anInt1877 > 0 && Static64.aClass47_1 == null) {
				Static64.aClass47_1 = new Class47();
				Static64.aClass47_1.aClass55_3 = arg1;
				arg1.method1537(Static78.anInt1877, Static64.aClass47_1);
			}
			if (Static64.aClass47_1 != null) {
				if (Static64.aClass47_1.aClass10Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static64.aClass47_1.aClass10Array1[arg0] = local30;
			}
			return local30;
		} catch (@Pc(113) Throwable local113) {
			try {
				@Pc(119) Class10_Sub1 local119 = new Class10_Sub1(arg1, arg0);
				local119.anInt1776 = arg2;
				local119.anIntArray291 = new int[(Static69.aBoolean49 ? 2 : 1) * 256];
				local119.method1298(arg3);
				local119.anInt1772 = 16384;
				local119.method1294(local119.anInt1772);
				if (Static78.anInt1877 > 0 && Static64.aClass47_1 == null) {
					Static64.aClass47_1 = new Class47();
					Static64.aClass47_1.aClass55_3 = arg1;
					arg1.method1537(Static78.anInt1877, Static64.aClass47_1);
				}
				if (Static64.aClass47_1 != null) {
					if (Static64.aClass47_1.aClass10Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static64.aClass47_1.aClass10Array1[arg0] = local119;
				}
				return local119;
			} catch (@Pc(181) Throwable local181) {
				return new Class10();
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	public static void method2043() {
		Static119.method2161(Static72.aClass1_Sub17_45);
		Static70.anInt1623++;
		if (Static76.aBoolean62 && Static93.aBoolean90) {
			@Pc(24) int local24 = Static98.anInt2407;
			@Pc(26) int local26 = Static97.anInt2395;
			local26 -= Static44.anInt1086;
			if (local26 < Static109.anInt2694) {
				local26 = Static109.anInt2694;
			}
			if (local26 + Static72.aClass1_Sub17_45.anInt2293 > Static64.aClass1_Sub17_42.anInt2293 + Static109.anInt2694) {
				local26 = Static109.anInt2694 + Static64.aClass1_Sub17_42.anInt2293 - Static72.aClass1_Sub17_45.anInt2293;
			}
			@Pc(65) int local65 = Static72.aClass1_Sub17_45.anInt2255;
			local24 -= Static40.anInt1046;
			@Pc(74) int local74 = local26 - Static73.anInt1686;
			if (local24 < Static38.anInt974) {
				local24 = Static38.anInt974;
			}
			@Pc(87) int local87 = local26 + Static64.aClass1_Sub17_42.anInt2273 - Static109.anInt2694;
			if (Static38.anInt974 + Static64.aClass1_Sub17_42.anInt2305 < Static72.aClass1_Sub17_45.anInt2305 + local24) {
				local24 = Static38.anInt974 + Static64.aClass1_Sub17_42.anInt2305 - Static72.aClass1_Sub17_45.anInt2305;
			}
			@Pc(116) int local116 = local24 + Static64.aClass1_Sub17_42.anInt2245 - Static38.anInt974;
			@Pc(121) int local121 = local24 - Static20.anInt653;
			if (Static72.aClass1_Sub17_45.anInt2307 < Static70.anInt1623 && (local121 > local65 || -local65 > local121 || local74 > local65 || -local65 > local74)) {
				Static111.aBoolean105 = true;
			}
			@Pc(159) Class1_Sub6 local159;
			if (Static72.aClass1_Sub17_45.anObjectArray17 != null && Static111.aBoolean105) {
				local159 = new Class1_Sub6();
				local159.anObjectArray1 = Static72.aClass1_Sub17_45.anObjectArray17;
				local159.aClass1_Sub17_26 = Static72.aClass1_Sub17_45;
				local159.anInt973 = local87;
				local159.anInt978 = local116;
				Static71.method1228(local159);
			}
			if (Static85.anInt2157 == 0) {
				if (Static111.aBoolean105) {
					if (Static72.aClass1_Sub17_45.anObjectArray4 != null) {
						local159 = new Class1_Sub6();
						local159.aClass1_Sub17_25 = Static3.aClass1_Sub17_5;
						local159.anInt978 = local116;
						local159.anInt973 = local87;
						local159.aClass1_Sub17_26 = Static72.aClass1_Sub17_45;
						local159.anObjectArray1 = Static72.aClass1_Sub17_45.anObjectArray4;
						Static71.method1228(local159);
					}
					if (Static3.aClass1_Sub17_5 != null && Static23.method535(Static72.aClass1_Sub17_45) != null) {
						Static44.aClass1_Sub20_Sub1_1.method2108(129);
						Static44.aClass1_Sub20_Sub1_1.method2061(Static3.aClass1_Sub17_5.anInt2249);
						Static44.aClass1_Sub20_Sub1_1.method2092(Static3.aClass1_Sub17_5.anInt2248);
						Static44.aClass1_Sub20_Sub1_1.method2059(Static72.aClass1_Sub17_45.anInt2248);
						Static44.aClass1_Sub20_Sub1_1.method2055(Static72.aClass1_Sub17_45.anInt2249);
					}
				} else if ((Static76.anInt1795 == 1 || Static81.method1433(Static18.anInt3043 - 1)) && Static18.anInt3043 > 2) {
					Static81.method1432();
				} else if (Static18.anInt3043 > 0) {
					Static86.method1528(Static18.anInt3043 - 1);
				}
				Static72.aClass1_Sub17_45 = null;
			}
		} else if (Static70.anInt1623 > 1) {
			Static72.aClass1_Sub17_45 = null;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V")
	public static void method2044() {
		aClass5_1327 = null;
		aClass5_1328 = null;
	}
}

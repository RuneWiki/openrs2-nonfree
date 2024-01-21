import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!di", name = "fb", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!di", name = "ab", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_324 = Static177.method3050("Select a world");

	@OriginalMember(owner = "client!di", name = "V", descriptor = "Lclient!jd;")
	public static Class46 aClass46_322 = aClass46_324;

	@OriginalMember(owner = "client!di", name = "X", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_323 = Static177.method3050("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!di", name = "Z", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_20 = new Class66(50);

	@OriginalMember(owner = "client!di", name = "db", descriptor = "I")
	public static int anInt954 = -1;

	@OriginalMember(owner = "client!di", name = "eb", descriptor = "[I")
	public static final int[] anIntArray85 = new int[256];

	@OriginalMember(owner = "client!di", name = "gb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_325 = Static177.method3050("mn");

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIII)V")
	public static void method637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static57.anInt1408 * 128) {
			arg0 = Static57.anInt1408 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static84.anInt4112 * 128) {
			arg2 = Static84.anInt4112 * 128 - 1;
		}
		Static87.anInt2220++;
		Static52.anInt1322 = Class4_Sub1_Sub7_Sub4.anIntArray412[arg3];
		Static80.anInt2008 = Class4_Sub1_Sub7_Sub4.anIntArray416[arg3];
		Static55.anInt1367 = Class4_Sub1_Sub7_Sub4.anIntArray412[arg4];
		Static177.anInt3970 = Class4_Sub1_Sub7_Sub4.anIntArray416[arg4];
		Static135.aBooleanArrayArray1 = Static72.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static116.anInt2858 = arg0;
		Static90.anInt2341 = arg1;
		Static83.anInt2133 = arg2;
		Static100.anInt2542 = arg0 / 128;
		Static63.anInt1572 = arg2 / 128;
		Static120.anInt3741 = arg5;
		Static92.anInt2366 = Static100.anInt2542 - Static139.anInt3253;
		if (Static92.anInt2366 < 0) {
			Static92.anInt2366 = 0;
		}
		Static31.anInt804 = Static63.anInt1572 - Static139.anInt3253;
		if (Static31.anInt804 < 0) {
			Static31.anInt804 = 0;
		}
		Static158.anInt3539 = Static100.anInt2542 + Static139.anInt3253;
		if (Static158.anInt3539 > Static57.anInt1408) {
			Static158.anInt3539 = Static57.anInt1408;
		}
		Static85.anInt2192 = Static63.anInt1572 + Static139.anInt3253;
		if (Static85.anInt2192 > Static84.anInt4112) {
			Static85.anInt2192 = Static84.anInt4112;
		}
		Static182.method3126();
		Static129.anInt3090 = 0;
		@Pc(125) int local125;
		@Pc(128) int local128;
		for (@Pc(118) int local118 = Static172.anInt3876; local118 < Static135.anInt3222; local118++) {
			@Pc(123) Class4_Sub7[][] local123 = Static28.aClass4_Sub7ArrayArrayArray1[local118];
			for (local125 = Static92.anInt2366; local125 < Static158.anInt3539; local125++) {
				for (local128 = Static31.anInt804; local128 < Static85.anInt2192; local128++) {
					@Pc(135) Class4_Sub7 local135 = local123[local125][local128];
					if (local135 != null) {
						if (local135.anInt1036 <= arg5 && (Static135.aBooleanArrayArray1[local125 + Static139.anInt3253 - Static100.anInt2542][local128 + Static139.anInt3253 - Static63.anInt1572] || Static142.anIntArrayArrayArray33[local118][local125][local128] - arg1 >= 2000)) {
							local135.aBoolean55 = true;
							local135.aBoolean53 = true;
							if (local135.anInt1040 > 0) {
								local135.aBoolean54 = true;
							} else {
								local135.aBoolean54 = false;
							}
							Static129.anInt3090++;
						} else {
							local135.aBoolean55 = false;
							local135.aBoolean53 = false;
							local135.anInt1041 = 0;
						}
					}
				}
			}
		}
		@Pc(227) int local227;
		@Pc(236) int local236;
		@Pc(241) int local241;
		@Pc(245) int local245;
		@Pc(223) int local223;
		for (@Pc(210) int local210 = Static172.anInt3876; local210 < Static135.anInt3222; local210++) {
			@Pc(215) Class4_Sub7[][] local215 = Static28.aClass4_Sub7ArrayArrayArray1[local210];
			for (local128 = -Static139.anInt3253; local128 <= 0; local128++) {
				local223 = Static100.anInt2542 + local128;
				local227 = Static100.anInt2542 - local128;
				if (local223 >= Static92.anInt2366 || local227 < Static158.anInt3539) {
					for (local236 = -Static139.anInt3253; local236 <= 0; local236++) {
						local241 = Static63.anInt1572 + local236;
						local245 = Static63.anInt1572 - local236;
						@Pc(257) Class4_Sub7 local257;
						if (local223 >= Static92.anInt2366) {
							if (local241 >= Static31.anInt804) {
								local257 = local215[local223][local241];
								if (local257 != null && local257.aBoolean55) {
									Static98.method1899(local257, true);
								}
							}
							if (local245 < Static85.anInt2192) {
								local257 = local215[local223][local245];
								if (local257 != null && local257.aBoolean55) {
									Static98.method1899(local257, true);
								}
							}
						}
						if (local227 < Static158.anInt3539) {
							if (local241 >= Static31.anInt804) {
								local257 = local215[local227][local241];
								if (local257 != null && local257.aBoolean55) {
									Static98.method1899(local257, true);
								}
							}
							if (local245 < Static85.anInt2192) {
								local257 = local215[local227][local245];
								if (local257 != null && local257.aBoolean55) {
									Static98.method1899(local257, true);
								}
							}
						}
						if (Static129.anInt3090 == 0) {
							Static28.aBoolean38 = false;
							return;
						}
					}
				}
			}
		}
		for (local125 = Static172.anInt3876; local125 < Static135.anInt3222; local125++) {
			@Pc(341) Class4_Sub7[][] local341 = Static28.aClass4_Sub7ArrayArrayArray1[local125];
			for (local223 = -Static139.anInt3253; local223 <= 0; local223++) {
				local227 = Static100.anInt2542 + local223;
				local236 = Static100.anInt2542 - local223;
				if (local227 >= Static92.anInt2366 || local236 < Static158.anInt3539) {
					for (local241 = -Static139.anInt3253; local241 <= 0; local241++) {
						local245 = Static63.anInt1572 + local241;
						@Pc(371) int local371 = Static63.anInt1572 - local241;
						@Pc(383) Class4_Sub7 local383;
						if (local227 >= Static92.anInt2366) {
							if (local245 >= Static31.anInt804) {
								local383 = local341[local227][local245];
								if (local383 != null && local383.aBoolean55) {
									Static98.method1899(local383, false);
								}
							}
							if (local371 < Static85.anInt2192) {
								local383 = local341[local227][local371];
								if (local383 != null && local383.aBoolean55) {
									Static98.method1899(local383, false);
								}
							}
						}
						if (local236 < Static158.anInt3539) {
							if (local245 >= Static31.anInt804) {
								local383 = local341[local236][local245];
								if (local383 != null && local383.aBoolean55) {
									Static98.method1899(local383, false);
								}
							}
							if (local371 < Static85.anInt2192) {
								local383 = local341[local236][local371];
								if (local383 != null && local383.aBoolean55) {
									Static98.method1899(local383, false);
								}
							}
						}
						if (Static129.anInt3090 == 0) {
							Static28.aBoolean38 = false;
							return;
						}
					}
				}
			}
		}
		Static28.aBoolean38 = false;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(III)V")
	public static void method638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub7 local7 = Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass70_1 = null;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/awt/Component;Lclient!rh;III)Lclient!mg;")
	public static Class41 method639(@OriginalArg(0) Component arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static154.anInt4087 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class41 local36 = (Class41) Class.forName("Class41_Sub2").getDeclaredConstructor().newInstance();
			local36.anInt2708 = arg2;
			local36.anIntArray252 = new int[(Static68.aBoolean82 ? 2 : 1) * 256];
			local36.method2043(arg0);
			local36.anInt2707 = (arg2 & 0xFFFFFC00) + 1024;
			if (local36.anInt2707 > 16384) {
				local36.anInt2707 = 16384;
			}
			local36.method2041(local36.anInt2707);
			if (Static17.anInt484 > 0 && Static154.aClass45_3 == null) {
				Static154.aClass45_3 = new Class45();
				Static154.aClass45_3.aClass76_3 = arg1;
				arg1.method2566(Static154.aClass45_3, Static17.anInt484);
			}
			if (Static154.aClass45_3 != null) {
				if (Static154.aClass45_3.aClass41Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static154.aClass45_3.aClass41Array1[arg3] = local36;
			}
			return local36;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class41_Sub1 local114 = new Class41_Sub1(arg1, arg3);
				local114.anInt2708 = arg2;
				local114.anIntArray252 = new int[(Static68.aBoolean82 ? 2 : 1) * 256];
				local114.method2043(arg0);
				local114.anInt2707 = 16384;
				local114.method2041(local114.anInt2707);
				if (Static17.anInt484 > 0 && Static154.aClass45_3 == null) {
					Static154.aClass45_3 = new Class45();
					Static154.aClass45_3.aClass76_3 = arg1;
					arg1.method2566(Static154.aClass45_3, Static17.anInt484);
				}
				if (Static154.aClass45_3 != null) {
					if (Static154.aClass45_3.aClass41Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static154.aClass45_3.aClass41Array1[arg3] = local114;
				}
				return local114;
			} catch (@Pc(175) Throwable local175) {
				return new Class41();
			}
		}
	}
}

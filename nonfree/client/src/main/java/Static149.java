import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!s", name = "O", descriptor = "I")
	public static int anInt3997;

	@OriginalMember(owner = "client!s", name = "S", descriptor = "I")
	public static int anInt4001;

	@OriginalMember(owner = "client!s", name = "L", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1359 = Static49.method1293("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!s", name = "N", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1360 = Static49.method1293("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
	public static int anInt3999 = 0;

	@OriginalMember(owner = "client!s", name = "R", descriptor = "I")
	public static int anInt4000 = -1;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)Z")
	public static boolean method3062(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
	public static void method3064() {
		aClass70_1360 = null;
		aClass70_1359 = null;
		Class1_Sub1_Sub4.anIntArray379 = null;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V")
	public static void method3065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass34_1 = null;
		}
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
	public static void method3067() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IZIZZ)Lclient!ue;")
	public static Class76_Sub1 method3068(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(5) Class9 local5 = null;
		if (Static22.aClass66_3 != null) {
			local5 = new Class9(arg1, Static22.aClass66_3, Static24.aClass66Array1[arg1], 1000000);
		}
		return new Class76_Sub1(local5, Static138.aClass9_2, arg1, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII)V")
	public static void method3069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static73.anInt2250 * 128) {
			arg0 = Static73.anInt2250 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static85.anInt2550 * 128) {
			arg2 = Static85.anInt2550 * 128 - 1;
		}
		Static59.anInt1907++;
		Static161.anInt4213 = Class1_Sub1_Sub1_Sub1.anIntArray11[arg3];
		Static171.anInt4443 = Class1_Sub1_Sub1_Sub1.anIntArray8[arg3];
		Static114.anInt3121 = Class1_Sub1_Sub1_Sub1.anIntArray11[arg4];
		Static66.anInt2085 = Class1_Sub1_Sub1_Sub1.anIntArray8[arg4];
		Static139.aBooleanArrayArray1 = Static143.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static142.anInt3764 = arg0;
		Static183.anInt4552 = arg1;
		Static108.anInt3059 = arg2;
		Static72.anInt2244 = arg0 / 128;
		Static11.anInt384 = arg2 / 128;
		Static184.anInt4570 = arg5;
		Static109.anInt3066 = Static72.anInt2244 - Static34.anInt1115;
		if (Static109.anInt3066 < 0) {
			Static109.anInt3066 = 0;
		}
		Static18.anInt484 = Static11.anInt384 - Static34.anInt1115;
		if (Static18.anInt484 < 0) {
			Static18.anInt484 = 0;
		}
		Static27.anInt738 = Static72.anInt2244 + Static34.anInt1115;
		if (Static27.anInt738 > Static73.anInt2250) {
			Static27.anInt738 = Static73.anInt2250;
		}
		Static54.anInt1758 = Static11.anInt384 + Static34.anInt1115;
		if (Static54.anInt1758 > Static85.anInt2550) {
			Static54.anInt1758 = Static85.anInt2550;
		}
		Static146.method2860();
		Static27.anInt732 = 0;
		@Pc(125) int local125;
		@Pc(128) int local128;
		for (@Pc(118) int local118 = Static53.anInt1717; local118 < Static40.anInt1398; local118++) {
			@Pc(123) Class1_Sub17[][] local123 = Static90.aClass1_Sub17ArrayArrayArray1[local118];
			for (local125 = Static109.anInt3066; local125 < Static27.anInt738; local125++) {
				for (local128 = Static18.anInt484; local128 < Static54.anInt1758; local128++) {
					@Pc(135) Class1_Sub17 local135 = local123[local125][local128];
					if (local135 != null) {
						if (local135.anInt2951 <= arg5 && (Static139.aBooleanArrayArray1[local125 + Static34.anInt1115 - Static72.anInt2244][local128 + Static34.anInt1115 - Static11.anInt384] || Static92.anIntArrayArrayArray7[local118][local125][local128] - arg1 >= 2000)) {
							local135.aBoolean121 = true;
							local135.aBoolean120 = true;
							if (local135.anInt2953 > 0) {
								local135.aBoolean119 = true;
							} else {
								local135.aBoolean119 = false;
							}
							Static27.anInt732++;
						} else {
							local135.aBoolean121 = false;
							local135.aBoolean120 = false;
							local135.anInt2943 = 0;
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
		for (@Pc(210) int local210 = Static53.anInt1717; local210 < Static40.anInt1398; local210++) {
			@Pc(215) Class1_Sub17[][] local215 = Static90.aClass1_Sub17ArrayArrayArray1[local210];
			for (local128 = -Static34.anInt1115; local128 <= 0; local128++) {
				local223 = Static72.anInt2244 + local128;
				local227 = Static72.anInt2244 - local128;
				if (local223 >= Static109.anInt3066 || local227 < Static27.anInt738) {
					for (local236 = -Static34.anInt1115; local236 <= 0; local236++) {
						local241 = Static11.anInt384 + local236;
						local245 = Static11.anInt384 - local236;
						@Pc(257) Class1_Sub17 local257;
						if (local223 >= Static109.anInt3066) {
							if (local241 >= Static18.anInt484) {
								local257 = local215[local223][local241];
								if (local257 != null && local257.aBoolean121) {
									Static128.method3222(local257, true);
								}
							}
							if (local245 < Static54.anInt1758) {
								local257 = local215[local223][local245];
								if (local257 != null && local257.aBoolean121) {
									Static128.method3222(local257, true);
								}
							}
						}
						if (local227 < Static27.anInt738) {
							if (local241 >= Static18.anInt484) {
								local257 = local215[local227][local241];
								if (local257 != null && local257.aBoolean121) {
									Static128.method3222(local257, true);
								}
							}
							if (local245 < Static54.anInt1758) {
								local257 = local215[local227][local245];
								if (local257 != null && local257.aBoolean121) {
									Static128.method3222(local257, true);
								}
							}
						}
						if (Static27.anInt732 == 0) {
							Static94.aBoolean108 = false;
							return;
						}
					}
				}
			}
		}
		for (local125 = Static53.anInt1717; local125 < Static40.anInt1398; local125++) {
			@Pc(341) Class1_Sub17[][] local341 = Static90.aClass1_Sub17ArrayArrayArray1[local125];
			for (local223 = -Static34.anInt1115; local223 <= 0; local223++) {
				local227 = Static72.anInt2244 + local223;
				local236 = Static72.anInt2244 - local223;
				if (local227 >= Static109.anInt3066 || local236 < Static27.anInt738) {
					for (local241 = -Static34.anInt1115; local241 <= 0; local241++) {
						local245 = Static11.anInt384 + local241;
						@Pc(371) int local371 = Static11.anInt384 - local241;
						@Pc(383) Class1_Sub17 local383;
						if (local227 >= Static109.anInt3066) {
							if (local245 >= Static18.anInt484) {
								local383 = local341[local227][local245];
								if (local383 != null && local383.aBoolean121) {
									Static128.method3222(local383, false);
								}
							}
							if (local371 < Static54.anInt1758) {
								local383 = local341[local227][local371];
								if (local383 != null && local383.aBoolean121) {
									Static128.method3222(local383, false);
								}
							}
						}
						if (local236 < Static27.anInt738) {
							if (local245 >= Static18.anInt484) {
								local383 = local341[local236][local245];
								if (local383 != null && local383.aBoolean121) {
									Static128.method3222(local383, false);
								}
							}
							if (local371 < Static54.anInt1758) {
								local383 = local341[local236][local371];
								if (local383 != null && local383.aBoolean121) {
									Static128.method3222(local383, false);
								}
							}
						}
						if (Static27.anInt732 == 0) {
							Static94.aBoolean108 = false;
							return;
						}
					}
				}
			}
		}
		Static94.aBoolean108 = false;
	}
}

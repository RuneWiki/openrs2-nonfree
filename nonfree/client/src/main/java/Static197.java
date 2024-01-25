import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!iba", name = "d", descriptor = "Ljava/lang/Object;")
	public static Object anObject8;

	@OriginalMember(owner = "client!iba", name = "o", descriptor = "I")
	public static int anInt4107;

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "Lclient!h;")
	public static final Class114 aClass114_86 = new Class114("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!iba", name = "l", descriptor = "Lclient!hm;")
	public static final Class122 aClass122_2 = new Class122();

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!gba;BI)V")
	public static void method3652(@OriginalArg(0) Class1_Sub13_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) boolean local13 = arg0.method3087(1) == 1;
		if (local13) {
			Static255.anIntArray355[Static125.anInt3025++] = arg1;
		}
		@Pc(28) int local28 = arg0.method3087(2);
		@Pc(32) Class47_Sub2_Sub3_Sub2 local32 = Static473.aClass47_Sub2_Sub3_Sub2Array1[arg1];
		if (local28 != 0) {
			@Pc(142) int local142;
			@Pc(147) int local147;
			@Pc(152) int local152;
			if (local28 == 1) {
				local142 = arg0.method3087(3);
				local147 = local32.anIntArray362[0];
				local152 = local32.anIntArray361[0];
				if (local142 == 0) {
					local152--;
					local147--;
				} else if (local142 == 1) {
					local152--;
				} else if (local142 == 2) {
					local152--;
					local147++;
				} else if (local142 == 3) {
					local147--;
				} else if (local142 == 4) {
					local147++;
				} else if (local142 == 5) {
					local147--;
					local152++;
				} else if (local142 == 6) {
					local152++;
				} else if (local142 == 7) {
					local152++;
					local147++;
				}
				if (local13) {
					local32.aBoolean345 = true;
					local32.anInt5113 = local147;
					local32.anInt5108 = local152;
				} else {
					local32.method4377(local152, local147, Static31.aByteArray13[arg1]);
				}
			} else if (local28 == 2) {
				local142 = arg0.method3087(4);
				local147 = local32.anIntArray362[0];
				local152 = local32.anIntArray361[0];
				if (local142 == 0) {
					local147 -= 2;
					local152 -= 2;
				} else if (local142 == 1) {
					local152 -= 2;
					local147--;
				} else if (local142 == 2) {
					local152 -= 2;
				} else if (local142 == 3) {
					local147++;
					local152 -= 2;
				} else if (local142 == 4) {
					local152 -= 2;
					local147 += 2;
				} else if (local142 == 5) {
					local147 -= 2;
					local152--;
				} else if (local142 == 6) {
					local147 += 2;
					local152--;
				} else if (local142 == 7) {
					local147 -= 2;
				} else if (local142 == 8) {
					local147 += 2;
				} else if (local142 == 9) {
					local152++;
					local147 -= 2;
				} else if (local142 == 10) {
					local152++;
					local147 += 2;
				} else if (local142 == 11) {
					local152 += 2;
					local147 -= 2;
				} else if (local142 == 12) {
					local147--;
					local152 += 2;
				} else if (local142 == 13) {
					local152 += 2;
				} else if (local142 == 14) {
					local147++;
					local152 += 2;
				} else if (local142 == 15) {
					local152 += 2;
					local147 += 2;
				}
				if (local13) {
					local32.anInt5113 = local147;
					local32.anInt5108 = local152;
					local32.aBoolean345 = true;
				} else {
					local32.method4377(local152, local147, Static31.aByteArray13[arg1]);
				}
			} else {
				local142 = arg0.method3087(1);
				@Pc(395) int local395;
				@Pc(403) int local403;
				@Pc(416) int local416;
				@Pc(423) int local423;
				if (local142 == 0) {
					local147 = arg0.method3087(12);
					local152 = local147 >> 10;
					local395 = local147 >> 5 & 0x1F;
					if (local395 > 15) {
						local395 -= 32;
					}
					local403 = local147 & 0x1F;
					if (local403 > 15) {
						local403 -= 32;
					}
					local416 = local395 + local32.anIntArray362[0];
					local423 = local32.anIntArray361[0] + local403;
					if (local13) {
						local32.aBoolean345 = true;
						local32.anInt5113 = local416;
						local32.anInt5108 = local423;
					} else {
						local32.method4377(local423, local416, Static31.aByteArray13[arg1]);
					}
					local32.aByte94 = (byte) (local32.aByte94 + local152 & 0x3);
					if (arg1 == Static150.anInt3353) {
						Static245.anInt4747 = local32.aByte94;
					}
				} else {
					local147 = arg0.method3087(30);
					local152 = local147 >> 28;
					local395 = local147 >> 14 & 0x3FFF;
					local403 = local147 & 0x3FFF;
					local416 = (local395 + local32.anIntArray362[0] + Static324.anInt6132 & 0x3FFF) - Static324.anInt6132;
					local423 = (local32.anIntArray361[0] + Static517.anInt8716 + local403 & 0x3FFF) - Static517.anInt8716;
					if (local13) {
						local32.anInt5108 = local423;
						local32.anInt5113 = local416;
						local32.aBoolean345 = true;
					} else {
						local32.method4377(local423, local416, Static31.aByteArray13[arg1]);
					}
					local32.aByte94 = (byte) (local32.aByte94 + local152 & 0x3);
					if (Static150.anInt3353 == arg1) {
						Static245.anInt4747 = local32.aByte94;
					}
				}
			}
		} else if (local13) {
			local32.aBoolean345 = false;
		} else if (arg1 == Static150.anInt3353) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(56) Class159 local56 = Static351.aClass159Array1[arg1] = new Class159();
			local56.anInt4756 = (local32.anIntArray361[0] + Static517.anInt8716 >> 6) + (local32.aByte94 << 28) + (Static324.anInt6132 + local32.anIntArray362[0] >> 6 << 14);
			if (local32.anInt5084 == -1) {
				local56.anInt4753 = local32.aClass146_7.method3943();
			} else {
				local56.anInt4753 = local32.anInt5084;
			}
			local56.aBoolean289 = local32.aBoolean346;
			local56.anInt4751 = local32.anInt5061;
			if (local32.anInt5094 > 0) {
				Static205.method3773(local32);
			}
			Static473.aClass47_Sub2_Sub3_Sub2Array1[arg1] = null;
			if (arg0.method3087(1) != 0) {
				Static65.method7160(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZIII)V")
	public static void method3653(@OriginalArg(0) boolean arg0) {
		Static176.anInt3761 = 2;
		Static267.aBoolean348 = arg0;
		Static77.anInt2079 = 22050;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(II)Z")
	public static boolean method3654(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(CBI)I")
	public static int method3656(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local7 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local7 = 1762;
		}
		return local7;
	}
}

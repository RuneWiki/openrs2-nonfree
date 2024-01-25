import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "Lclient!ns;")
	public static Class166 aClass166_253;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_87 = new Class242("K", "T", "K", "K");

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
	public static int anInt6460 = 0;

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "Lclient!vr;")
	public static final Class258 aClass258_45 = new Class258();

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)Lclient!kq;")
	public static Class6_Sub5 method5028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static40.aClass53ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class6_Sub5 local14 = local7.aClass6_Sub5_1;
			local7.aClass6_Sub5_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)Lclient!jh;")
	public static Class4_Sub1_Sub8 method5029() {
		@Pc(8) Class4_Sub1_Sub8 local8 = (Class4_Sub1_Sub8) Static152.aClass140_3.method3014();
		if (local8 != null) {
			local8.method5854();
			local8.method5863();
			return local8;
		}
		do {
			local8 = (Class4_Sub1_Sub8) Static300.aClass140_9.method3014();
			if (local8 == null) {
				return null;
			}
			if (local8.method2765() > Static199.method2845()) {
				return null;
			}
			local8.method5854();
			local8.method5863();
		} while ((Long.MIN_VALUE & local8.aLong226) == 0L);
		return local8;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIZ)V")
	public static void method5030(@OriginalArg(3) boolean arg0) {
		Static277.anInt4890 = 2;
		Static410.anInt6810 = 22050;
		Static394.aBoolean454 = arg0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIBI)V")
	public static void method5031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static396.anInt6813 = arg2;
		Static420.anInt7596 = arg0;
		Static15.anInt417 = arg4;
		Static84.anInt1908 = arg1;
		Static280.anInt4896 = arg3;
		if (Static280.anInt4896 >= 100) {
			@Pc(22) int local22 = Static420.anInt7596 * 128 + 64;
			@Pc(28) int local28 = Static396.anInt6813 * 128 + 64;
			@Pc(37) int local37 = Static222.method3109(local22, Static221.anInt4855, local28) - Static84.anInt1908;
			@Pc(41) int local41 = local22 - Static254.anInt4614;
			@Pc(46) int local46 = local37 - Static292.anInt5287;
			@Pc(51) int local51 = local28 - Static30.anInt696;
			@Pc(62) int local62 = (int) Math.sqrt((double) (local51 * local51 + local41 * local41));
			Static183.anInt3503 = (int) (Math.atan2((double) local46, (double) local62) * 2607.5945876176133D) & 0x3FFF;
			Static142.anInt2687 = (int) (-2607.5945876176133D * Math.atan2((double) local41, (double) local51)) & 0x3FFF;
			if (Static183.anInt3503 < 1024) {
				Static183.anInt3503 = 1024;
			}
			Static185.anInt6759 = 0;
			if (Static183.anInt3503 > 3072) {
				Static183.anInt3503 = 3072;
			}
		}
		Static134.anInt2621 = 2;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!bp;ZI)V")
	public static void method5032(@OriginalArg(0) Class6_Sub2_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		if (Static83.anInt1893 >= 400) {
			return;
		}
		if (Static375.aClass6_Sub2_Sub1_Sub1_3 != arg0) {
			@Pc(77) String local77;
			@Pc(123) int local123;
			if (arg0.anInt999 == 0) {
				@Pc(81) boolean local81 = true;
				if (Static375.aClass6_Sub2_Sub1_Sub1_3.anInt983 != -1 && arg0.anInt983 != -1) {
					@Pc(102) int local102 = Static375.aClass6_Sub2_Sub1_Sub1_3.anInt967 <= arg0.anInt967 ? arg0.anInt967 : Static375.aClass6_Sub2_Sub1_Sub1_3.anInt967;
					@Pc(113) int local113 = arg0.anInt983 > Static375.aClass6_Sub2_Sub1_Sub1_3.anInt983 ? Static375.aClass6_Sub2_Sub1_Sub1_3.anInt983 : arg0.anInt983;
					local123 = local102 * 10 / 100 + local113 + 5;
					@Pc(130) int local130 = Static375.aClass6_Sub2_Sub1_Sub1_3.anInt967 - arg0.anInt967;
					if (local130 < 0) {
						local130 = -local130;
					}
					if (local123 < local130) {
						local81 = false;
					}
				}
				@Pc(156) String local156 = Static128.aClass95_1 == Static441.aClass95_5 ? Static388.aClass242_97.method5320(Static139.anInt2670) : Static377.aClass242_94.method5320(Static139.anInt2670);
				if (arg0.anInt970 > arg0.anInt967) {
					local77 = arg0.method706() + (local81 ? Static39.method1429(Static375.aClass6_Sub2_Sub1_Sub1_3.anInt967, arg0.anInt967) : "<col=ffffff>") + " (" + local156 + arg0.anInt967 + "+" + (arg0.anInt970 - arg0.anInt967) + ")";
				} else {
					local77 = arg0.method706() + (local81 ? Static39.method1429(Static375.aClass6_Sub2_Sub1_Sub1_3.anInt967, arg0.anInt967) : "<col=ffffff>") + " (" + local156 + arg0.anInt967 + ")";
				}
			} else {
				local77 = arg0.method706() + " (" + Static358.aClass242_86.method5320(Static139.anInt2670) + arg0.anInt999 + ")";
			}
			if (Static222.aBoolean305) {
				if (!arg1 && (Static234.anInt4263 & 0x8) != 0) {
					Static191.method2806(0, (long) arg0.anInt6078, false, Static195.anInt2838, true, Static279.aString50, Static178.aString37 + " -> <col=ffffff>" + local77, 0, -1, 44);
				}
			} else if (arg1) {
				Static191.method2806(0, 0L, true, -1, false, "<col=cccccc>" + local77, "", 0, 0, -1);
			} else {
				for (@Pc(237) int local237 = 7; local237 >= 0; local237--) {
					if (Static136.aStringArray16[local237] != null) {
						@Pc(245) short local245 = 0;
						if (Static441.aClass95_5 == Static162.aClass95_7 && Static136.aStringArray16[local237].equalsIgnoreCase(Static108.aClass242_30.method5320(Static139.anInt2670))) {
							if (Static375.aClass6_Sub2_Sub1_Sub1_3.anInt967 < arg0.anInt967) {
								local245 = 2000;
							}
							if (Static375.aClass6_Sub2_Sub1_Sub1_3.anInt986 != 0 && arg0.anInt986 != 0) {
								if (Static375.aClass6_Sub2_Sub1_Sub1_3.anInt986 == arg0.anInt986) {
									local245 = 2000;
								} else {
									local245 = 0;
								}
							}
						} else if (Static130.aBooleanArray8[local237]) {
							local245 = 2000;
						}
						@Pc(303) short local303 = (short) (local245 + Static326.aShortArray55[local237]);
						local123 = Static291.anIntArray453[local237] == -1 ? Static214.anInt4012 : Static291.anIntArray453[local237];
						Static191.method2806(0, (long) arg0.anInt6078, false, local123, true, Static136.aStringArray16[local237], "<col=ffffff>" + local77, 0, -1, local303);
					}
				}
			}
			if (!arg1) {
				for (@Pc(415) Class4_Sub21 local415 = (Class4_Sub21) Static126.aClass258_19.method5538(); local415 != null; local415 = (Class4_Sub21) Static126.aClass258_19.method5528()) {
					if (local415.anInt3041 == 48) {
						local415.aString36 = "<col=ffffff>" + local77;
						return;
					}
				}
			}
		} else if (Static222.aBoolean305 && (Static234.anInt4263 & 0x10) != 0) {
			Static191.method2806(0, 0L, false, Static195.anInt2838, true, Static279.aString50, Static178.aString37 + " -> <col=ffffff>" + Static356.aClass242_85.method5320(Static139.anInt2670), 0, -1, 15);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!nda", name = "f", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_65 = new Class257(31, 3);

	@OriginalMember(owner = "client!nda", name = "p", descriptor = "[I")
	public static final int[] anIntArray385 = new int[13];

	@OriginalMember(owner = "client!nda", name = "z", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_66 = new Class257(47, 3);

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)Lclient!dia;")
	public static Class8_Sub16_Sub1 method5655() {
		return Static608.aClass8_Sub16_Sub1_4;
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(B)V")
	public static void method5658() {
		for (@Pc(3) int local3 = 0; local3 < Static55.anInt1863; local3++) {
			@Pc(9) Class230 local9 = Static63.aClass230Array1[local3];
			if (local9.aByte70 == 3) {
				if (local9.aClass8_Sub16_Sub3_3 == null) {
					local9.anInt7109 = Integer.MIN_VALUE;
				} else {
					Static15.aClass8_Sub16_Sub5_1.method7443(local9.aClass8_Sub16_Sub3_3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IBI)Z")
	public static boolean method5659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IC)Z")
	public static boolean method5660(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)Z")
	public static boolean method5661() {
		return Static350.aBoolean470;
	}

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "(I)Z")
	public static boolean method5664() {
		try {
			if (Static570.anInt9813 == 2) {
				if (Static12.aClass8_Sub47_1 == null) {
					Static12.aClass8_Sub47_1 = Static652.method7990(Static68.aClass237_22, Static532.anInt9177, Static7.anInt6404);
					if (Static12.aClass8_Sub47_1 == null) {
						return false;
					}
				}
				if (Static271.aClass357_1 == null) {
					Static271.aClass357_1 = new Class357(Static370.aClass237_100, Static56.aClass237_17);
				}
				@Pc(35) Class8_Sub16_Sub1 local35 = Static608.aClass8_Sub16_Sub1_4;
				if (Static10.aClass8_Sub16_Sub1_1 != null) {
					local35 = Static10.aClass8_Sub16_Sub1_1;
				}
				if (local35.method2280(Static12.aClass8_Sub47_1, Static423.aClass237_110, Static271.aClass357_1)) {
					Static608.aClass8_Sub16_Sub1_4 = local35;
					Static608.aClass8_Sub16_Sub1_4.method2273();
					@Pc(62) int local62;
					if (Static249.anInt5515 <= 0) {
						Static570.anInt9813 = 0;
						Static608.aClass8_Sub16_Sub1_4.method2294(Static227.anInt5183);
						for (local62 = 0; local62 < Static26.anIntArray32.length; local62++) {
							Static608.aClass8_Sub16_Sub1_4.method2282(Static26.anIntArray32[local62], local62);
							Static26.anIntArray32[local62] = 255;
						}
					} else {
						Static570.anInt9813 = 3;
						Static608.aClass8_Sub16_Sub1_4.method2294(Static249.anInt5515 <= Static227.anInt5183 ? Static249.anInt5515 : Static227.anInt5183);
						for (local62 = 0; local62 < Static26.anIntArray32.length; local62++) {
							Static608.aClass8_Sub16_Sub1_4.method2282(Static26.anIntArray32[local62], local62);
							Static26.anIntArray32[local62] = 255;
						}
					}
					if (Static10.aClass8_Sub16_Sub1_1 == null) {
						if (Static344.aLong167 > 0L) {
							Static608.aClass8_Sub16_Sub1_4.method2298(Static344.aLong167, Static642.aBoolean763, Static12.aClass8_Sub47_1);
						} else {
							Static608.aClass8_Sub16_Sub1_4.method2289(Static642.aBoolean763, Static12.aClass8_Sub47_1);
						}
					}
					if (Static505.aClass80_2 != null) {
						Static505.aClass80_2.method3193(Static608.aClass8_Sub16_Sub1_4);
					}
					Static68.aClass237_22 = null;
					Static271.aClass357_1 = null;
					Static344.aLong167 = 0L;
					Static12.aClass8_Sub47_1 = null;
					Static10.aClass8_Sub16_Sub1_1 = null;
					return true;
				}
			}
		} catch (@Pc(156) Exception local156) {
			local156.printStackTrace();
			Static608.aClass8_Sub16_Sub1_4.method2277();
			Static570.anInt9813 = 0;
			Static68.aClass237_22 = null;
			Static271.aClass357_1 = null;
			Static12.aClass8_Sub47_1 = null;
			Static10.aClass8_Sub16_Sub1_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!nda", name = "d", descriptor = "(I)V")
	public static void method5665(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static151.anInt3713 == 2) {
				Static394.aClass124Array1[0].method3585(Static49.aClass243Array1[0]);
				Static394.aClass124Array1[1].method3585(Static49.aClass243Array1[1]);
			} else if (Static151.anInt3713 == 3) {
				Static394.aClass124Array1[0].method3585(Static49.aClass243Array1[0]);
				Static394.aClass124Array1[1].method3585(Static49.aClass243Array1[1]);
				Static394.aClass124Array1[2].method3585(Static49.aClass243Array1[2]);
			} else {
				Static394.aClass124Array1[0].method3585(Static49.aClass243Array1[0]);
				Static394.aClass124Array1[1].method3585(Static49.aClass243Array1[1]);
				Static394.aClass124Array1[2].method3585(Static49.aClass243Array1[2]);
				Static394.aClass124Array1[3].method3585(Static49.aClass243Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static151.anInt3713 == 2) {
				Static394.aClass124Array1[0].method3585(Static49.aClass243Array1[2]);
			} else if (Static151.anInt3713 == 3) {
				Static394.aClass124Array1[0].method3585(Static49.aClass243Array1[3]);
				Static394.aClass124Array1[1].method3585(Static49.aClass243Array1[4]);
			} else {
				Static394.aClass124Array1[0].method3585(Static49.aClass243Array1[4]);
				Static394.aClass124Array1[1].method3585(Static49.aClass243Array1[5]);
				Static394.aClass124Array1[2].method3585(Static49.aClass243Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static151.anInt3713 == 2) {
				Static394.aClass124Array1[0].method3585(Static49.aClass243Array1[3]);
				return;
			}
			if (Static151.anInt3713 == 3) {
				Static394.aClass124Array1[0].method3585(Static49.aClass243Array1[5]);
				return;
			}
			Static394.aClass124Array1[0].method3585(Static49.aClass243Array1[7]);
		}
	}
}

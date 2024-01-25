import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cp", name = "o", descriptor = "I")
	public static int anInt1167;

	@OriginalMember(owner = "client!cp", name = "s", descriptor = "[I")
	public static int[] anIntArray68;

	@OriginalMember(owner = "client!cp", name = "u", descriptor = "I")
	public static int anInt1169;

	@OriginalMember(owner = "client!cp", name = "v", descriptor = "Lclient!lm;")
	public static Class134 aClass134_24;

	@OriginalMember(owner = "client!cp", name = "w", descriptor = "[I")
	public static int[] anIntArray69;

	@OriginalMember(owner = "client!cp", name = "x", descriptor = "I")
	public static int anInt1170;

	@OriginalMember(owner = "client!cp", name = "p", descriptor = "Lclient!cr;")
	public static Class37 aClass37_21 = new Class37(64);

	@OriginalMember(owner = "client!cp", name = "r", descriptor = "S")
	public static short aShort26 = 1;

	@OriginalMember(owner = "client!cp", name = "t", descriptor = "Lclient!ar;")
	public static final Class14 aClass14_3 = new Class14();

	@OriginalMember(owner = "client!cp", name = "y", descriptor = "I")
	public static int anInt1171 = 0;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "([Ljava/lang/Object;[IZ)V")
	public static void method905(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1) {
		Static289.method5052(0, arg1, arg0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lclient!nj;I)V")
	public static void method906(@OriginalArg(0) Class1_Sub21 arg0) {
		if (arg0.aByteArray82.length - arg0.anInt6611 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method5720();
		if (local19 < 0 || local19 > 14) {
			return;
		}
		@Pc(43) byte local43;
		if (local19 == 14) {
			local43 = 36;
		} else if (local19 == 13) {
			local43 = 35;
		} else if (local19 == 12) {
			local43 = 34;
		} else if (local19 == 11) {
			local43 = 33;
		} else if (local19 == 10) {
			local43 = 32;
		} else if (local19 == 9) {
			local43 = 31;
		} else if (local19 == 8) {
			local43 = 30;
		} else if (local19 == 7) {
			local43 = 29;
		} else if (local19 == 6) {
			local43 = 28;
		} else if (local19 == 5) {
			local43 = 28;
		} else if (local19 == 4) {
			local43 = 24;
		} else if (local19 == 3) {
			local43 = 23;
		} else if (local19 == 2) {
			local43 = 22;
		} else if (local19 == 1) {
			local43 = 23;
		} else {
			local43 = 19;
		}
		if (arg0.aByteArray82.length - arg0.anInt6611 < local43) {
			return;
		}
		Static182.anInt3805 = arg0.method5720();
		if (Static182.anInt3805 < 1) {
			Static182.anInt3805 = 1;
		} else if (Static182.anInt3805 > 4) {
			Static182.anInt3805 = 4;
		}
		Static22.method393(arg0.method5720() == 1);
		Static211.aBoolean353 = arg0.method5720() == 1;
		Static341.aBoolean543 = arg0.method5720() == 1;
		Static42.aBoolean75 = arg0.method5720() == 1;
		Static182.anInt3809 = arg0.method5720() == 1 ? 1 : 0;
		Static266.aBoolean458 = arg0.method5720() == 1;
		Static329.aBoolean533 = arg0.method5720() == 1;
		Static221.aBoolean375 = arg0.method5720() == 1;
		Static256.anInt5260 = arg0.method5720();
		if (Static256.anInt5260 > 2) {
			Static256.anInt5260 = 2;
		}
		if (local19 >= 2) {
			Static50.aBoolean83 = arg0.method5720() == 1;
		} else {
			Static50.aBoolean83 = arg0.method5720() == 1;
			arg0.method5720();
		}
		Static347.aBoolean550 = arg0.method5720() == 1;
		Static168.aBoolean267 = arg0.method5720() == 1;
		Static13.anInt213 = arg0.method5720();
		if (Static13.anInt213 > 2) {
			Static13.anInt213 = 2;
		}
		Static231.anInt4828 = Static13.anInt213;
		Static138.aBoolean522 = arg0.method5720() == 1;
		Static119.anInt2298 = arg0.method5720();
		if (Static119.anInt2298 > 127) {
			Static119.anInt2298 = 127;
		}
		Static4.anInt39 = arg0.method5720();
		Static142.anInt2788 = arg0.method5720();
		if (Static142.anInt2788 > 127) {
			Static142.anInt2788 = 127;
		}
		if (local19 >= 1) {
			Static147.anInt3045 = arg0.method5715();
			Static18.anInt358 = arg0.method5715();
		}
		if (local19 >= 3 && local19 < 6) {
			arg0.method5720();
		}
		@Pc(395) int local395;
		if (local19 >= 4) {
			local395 = arg0.method5720();
			if (local395 < 0 || local395 > 2) {
				local395 = 0;
			}
			if (Static267.anInt5492 < 96) {
				local395 = 0;
			}
			Static223.method1252(local395);
		}
		if (local19 >= 5) {
			Static10.anInt181 = arg0.method5716();
		}
		local395 = 0;
		if (local19 >= 6) {
			Static25.anInt449 = local395 = arg0.method5720();
		}
		if (Static25.anInt449 != 1 && Static25.anInt449 != 2) {
			Static25.anInt449 = 2;
		}
		if (local19 >= 7) {
			Static5.aBoolean10 = arg0.method5720() == 1;
		}
		if (local19 >= 8) {
			Static317.aBoolean521 = arg0.method5720() == 1;
		}
		if (local19 >= 9) {
			Static313.anInt6232 = arg0.method5720();
		}
		if (Static313.anInt6232 < 0 || Static313.anInt6232 > 3) {
			Static313.anInt6232 = 0;
		}
		if (local19 >= 10) {
			Static311.aBoolean510 = arg0.method5720() != 0;
		}
		if (local19 >= 11) {
			Static8.aBoolean13 = arg0.method5720() != 0;
		}
		if (local19 >= 12) {
			Static182.anInt3809 = arg0.method5720();
		}
		if (Static182.anInt3809 < 0 || Static182.anInt3809 > 2) {
			Static182.anInt3809 = 1;
		}
		if (local19 >= 13) {
			Static5.aBoolean9 = arg0.method5720() == 1;
		}
		if (local19 >= 14) {
			Static248.anInt26 = arg0.method5720();
		} else if (local395 == 0) {
			Static248.anInt26 = 2;
		} else {
			Static248.anInt26 = 1;
		}
		if (Static248.anInt26 < 0 || Static248.anInt26 > 3) {
			Static248.anInt26 = 2;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)Lclient!eb;")
	public static Class7_Sub3 method908(@OriginalArg(0) int arg0) {
		@Pc(7) Class122[] local7 = Class1_Sub2_Sub7.aClass122Array3;
		synchronized (Class1_Sub2_Sub7.aClass122Array3) {
			@Pc(35) Class7_Sub3 local35;
			if (Class1_Sub2_Sub7.aClass122Array3.length <= arg0 || Class1_Sub2_Sub7.aClass122Array3[arg0].method2623()) {
				local35 = new Class7_Sub3();
				local35.aClass7_Sub6Array1 = new Class7_Sub6[arg0];
				for (@Pc(41) int local41 = 0; local41 < arg0; local41++) {
					local35.aClass7_Sub6Array1[local41] = new Class7_Sub6();
				}
			} else {
				local35 = (Class7_Sub3) Class1_Sub2_Sub7.aClass122Array3[arg0].method2620();
				local35.method3450();
				@Pc(74) int local74 = Static321.anIntArray644[arg0]--;
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method909(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static116.method1837(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static116.method1837(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(51) int local51 = local14 - local11;
		if (local51 < 1 || local51 > 12) {
			return null;
		}
		@Pc(71) StringBuffer local71 = new StringBuffer(local51);
		for (@Pc(73) int local73 = local11; local73 < local14; local73++) {
			@Pc(79) char local79 = arg0.charAt(local73);
			if (Static80.method5799(local79)) {
				@Pc(87) char local87 = Static157.method2799(local79);
				if (local87 != '\u0000') {
					local71.append(local87);
				}
			}
		}
		if (local71.length() == 0) {
			return null;
		} else {
			return local71.toString();
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BLclient!dr;)Ljava/lang/String;")
	public static String method910(@OriginalArg(1) Class1_Sub12 arg0) {
		return arg0.aString52 == null || arg0.aString52.length() <= 0 ? arg0.aString53 : arg0.aString53 + Static204.aString276 + arg0.aString52;
	}
}

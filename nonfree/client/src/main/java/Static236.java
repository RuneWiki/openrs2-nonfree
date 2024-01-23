import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "Z")
	public static boolean aBoolean408;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Lclient!ed;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	public static int anInt4804 = 0;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public static void method3907() {
		Static269.aClass46_38.method1077();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BC)B")
	public static byte method3908(@OriginalArg(1) char arg0) {
		@Pc(33) byte local33;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local33 = (byte) arg0;
		} else if (arg0 == '€') {
			local33 = -128;
		} else if (arg0 == '‚') {
			local33 = -126;
		} else if (arg0 == 'ƒ') {
			local33 = -125;
		} else if (arg0 == '„') {
			local33 = -124;
		} else if (arg0 == '…') {
			local33 = -123;
		} else if (arg0 == '†') {
			local33 = -122;
		} else if (arg0 == '‡') {
			local33 = -121;
		} else if (arg0 == 'ˆ') {
			local33 = -120;
		} else if (arg0 == '‰') {
			local33 = -119;
		} else if (arg0 == 'Š') {
			local33 = -118;
		} else if (arg0 == '‹') {
			local33 = -117;
		} else if (arg0 == 'Œ') {
			local33 = -116;
		} else if (arg0 == 'Ž') {
			local33 = -114;
		} else if (arg0 == '‘') {
			local33 = -111;
		} else if (arg0 == '’') {
			local33 = -110;
		} else if (arg0 == '“') {
			local33 = -109;
		} else if (arg0 == '”') {
			local33 = -108;
		} else if (arg0 == '•') {
			local33 = -107;
		} else if (arg0 == '–') {
			local33 = -106;
		} else if (arg0 == '—') {
			local33 = -105;
		} else if (arg0 == '˜') {
			local33 = -104;
		} else if (arg0 == '™') {
			local33 = -103;
		} else if (arg0 == 'š') {
			local33 = -102;
		} else if (arg0 == '›') {
			local33 = -101;
		} else if (arg0 == 'œ') {
			local33 = -100;
		} else if (arg0 == 'ž') {
			local33 = -98;
		} else if (arg0 == 'Ÿ') {
			local33 = -97;
		} else {
			local33 = 63;
		}
		return local33;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	public static void method3909() {
		for (@Pc(18) Class2_Sub3_Sub21 local18 = (Class2_Sub3_Sub21) Static279.aClass1_33.method13(); local18 != null; local18 = (Class2_Sub3_Sub21) Static279.aClass1_33.method9()) {
			@Pc(24) Class36_Sub5 local24 = local18.aClass36_Sub5_1;
			if (Static208.anInt4335 != local24.anInt4435 || Static148.anInt3168 > local24.anInt4432) {
				local18.method4926();
			} else if (local24.anInt4428 <= Static148.anInt3168) {
				if (local24.anInt4442 > 0) {
					@Pc(56) Class36_Sub3_Sub1 local56 = Static201.aClass36_Sub3_Sub1Array1[local24.anInt4442 - 1];
					if (local56 != null && local56.anInt5093 >= 0 && local56.anInt5093 < 13312 && local56.anInt5109 >= 0 && local56.anInt5109 < 13312) {
						local24.method3611(Static99.method1894(local24.anInt4435, local56.anInt5109, local56.anInt5093) - local24.anInt4448, local56.anInt5093, local56.anInt5109, Static148.anInt3168);
					}
				}
				if (local24.anInt4442 < 0) {
					@Pc(112) int local112 = -local24.anInt4442 - 1;
					@Pc(121) Class36_Sub3_Sub2 local121;
					if (local112 == Static11.anInt298) {
						local121 = Static111.aClass36_Sub3_Sub2_1;
					} else {
						local121 = Static212.aClass36_Sub3_Sub2Array1[local112];
					}
					if (local121 != null && local121.anInt5093 >= 0 && local121.anInt5093 < 13312 && local121.anInt5109 >= 0 && local121.anInt5109 < 13312) {
						local24.method3611(Static99.method1894(local24.anInt4435, local121.anInt5109, local121.anInt5093) - local24.anInt4448, local121.anInt5093, local121.anInt5109, Static148.anInt3168);
					}
				}
				local24.method3615(Static37.anInt906);
				Static34.method1661(Static208.anInt4335, (int) local24.aDouble2, (int) local24.aDouble4, (int) local24.aDouble3, 60, local24, local24.anInt4444, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
	public static void method3910() {
		Static137.aClass46_22.method1077();
		Static144.aClass46_23.method1077();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method3911(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = 0;
		@Pc(15) char[] local15 = new char[arg1];
		for (@Pc(17) int local17 = 0; local17 < arg1; local17++) {
			@Pc(28) int local28 = arg0[local17 + arg2] & 0xFF;
			if (local28 != 0) {
				if (local28 >= 128 && local28 < 160) {
					@Pc(50) char local50 = Static190.aCharArray6[local28 - 128];
					if (local50 == '\u0000') {
						local50 = '?';
					}
					local28 = local50;
				}
				local15[local12++] = (char) local28;
			}
		}
		return new String(local15, 0, local12);
	}
}

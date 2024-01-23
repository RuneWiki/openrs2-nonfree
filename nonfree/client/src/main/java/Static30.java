import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bo", name = "r", descriptor = "Lclient!ak;")
	public static Class7 aClass7_34;

	@OriginalMember(owner = "client!bo", name = "F", descriptor = "[B")
	public static byte[] aByteArray6;

	@OriginalMember(owner = "client!bo", name = "Y", descriptor = "Lclient!og;")
	public static Class127 aClass127_1;

	@OriginalMember(owner = "client!bo", name = "rb", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!bo", name = "v", descriptor = "[I")
	public static int[] anIntArray66 = new int[32];

	@OriginalMember(owner = "client!bo", name = "X", descriptor = "I")
	public static int anInt655 = -1;

	@OriginalMember(owner = "client!bo", name = "hb", descriptor = "I")
	public static int anInt663 = 0;

	@OriginalMember(owner = "client!bo", name = "tb", descriptor = "Z")
	public static boolean aBoolean62 = false;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIIIII)V")
	public static void method493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(18) int local18 = Static45.method818(Static284.anInt5643, Static24.anInt556, arg6);
		@Pc(24) int local24 = Static45.method818(Static284.anInt5643, Static24.anInt556, arg3);
		@Pc(30) int local30 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg2);
		@Pc(36) int local36 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg1);
		@Pc(44) int local44 = Static45.method818(Static284.anInt5643, Static24.anInt556, arg5 + arg6);
		@Pc(53) int local53 = Static45.method818(Static284.anInt5643, Static24.anInt556, arg3 - arg5);
		@Pc(55) int local55;
		for (local55 = local18; local55 < local44; local55++) {
			Static288.method4405(arg0, local36, local30, Static151.anIntArrayArray26[local55]);
		}
		for (local55 = local24; local55 > local53; local55--) {
			Static288.method4405(arg0, local36, local30, Static151.anIntArrayArray26[local55]);
		}
		@Pc(97) int local97 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg5 + arg2);
		@Pc(106) int local106 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg1 - arg5);
		for (local55 = local44; local55 <= local53; local55++) {
			@Pc(119) int[] local119 = Static151.anIntArrayArray26[local55];
			Static288.method4405(arg0, local97, local30, local119);
			Static288.method4405(arg4, local106, local97, local119);
			Static288.method4405(arg0, local36, local106, local119);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method497(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(18) byte[] local18 = new byte[local8];
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			@Pc(27) char local27 = arg0.charAt(local20);
			if (local27 > '\u0000' && local27 < '\u0080' || !(local27 < ' ' || local27 > 'ÿ')) {
				local18[local20] = (byte) local27;
			} else if (local27 == '€') {
				local18[local20] = -128;
			} else if (local27 == '‚') {
				local18[local20] = -126;
			} else if (local27 == 'ƒ') {
				local18[local20] = -125;
			} else if (local27 == '„') {
				local18[local20] = -124;
			} else if (local27 == '…') {
				local18[local20] = -123;
			} else if (local27 == '†') {
				local18[local20] = -122;
			} else if (local27 == '‡') {
				local18[local20] = -121;
			} else if (local27 == 'ˆ') {
				local18[local20] = -120;
			} else if (local27 == '‰') {
				local18[local20] = -119;
			} else if (local27 == 'Š') {
				local18[local20] = -118;
			} else if (local27 == '‹') {
				local18[local20] = -117;
			} else if (local27 == 'Œ') {
				local18[local20] = -116;
			} else if (local27 == 'Ž') {
				local18[local20] = -114;
			} else if (local27 == '‘') {
				local18[local20] = -111;
			} else if (local27 == '’') {
				local18[local20] = -110;
			} else if (local27 == '“') {
				local18[local20] = -109;
			} else if (local27 == '”') {
				local18[local20] = -108;
			} else if (local27 == '•') {
				local18[local20] = -107;
			} else if (local27 == '–') {
				local18[local20] = -106;
			} else if (local27 == '—') {
				local18[local20] = -105;
			} else if (local27 == '˜') {
				local18[local20] = -104;
			} else if (local27 == '™') {
				local18[local20] = -103;
			} else if (local27 == 'š') {
				local18[local20] = -102;
			} else if (local27 == '›') {
				local18[local20] = -101;
			} else if (local27 == 'œ') {
				local18[local20] = -100;
			} else if (local27 == 'ž') {
				local18[local20] = -98;
			} else if (local27 == 'Ÿ') {
				local18[local20] = -97;
			} else {
				local18[local20] = 63;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIBII)V")
	public static void method502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static288.method4405(arg0, arg1 + arg2, arg1 + -arg2, Static151.anIntArrayArray26[arg3]);
		@Pc(17) int local17 = 0;
		@Pc(23) int local23 = arg4;
		@Pc(27) int local27 = arg2 * arg2;
		@Pc(31) int local31 = arg4 * arg4;
		@Pc(35) int local35 = local31 << 1;
		@Pc(39) int local39 = local27 << 1;
		@Pc(43) int local43 = arg4 << 1;
		@Pc(53) int local53 = local27 * (1 - local43) + local35;
		@Pc(62) int local62 = local31 - (local43 - 1) * local39;
		@Pc(66) int local66 = local27 << 2;
		@Pc(70) int local70 = local31 << 2;
		@Pc(78) int local78 = local35 * 3;
		@Pc(86) int local86 = local39 * ((arg4 << 1) - 3);
		@Pc(92) int local92 = local70;
		@Pc(98) int local98 = (arg4 - 1) * local66;
		while (local23 > 0) {
			local23--;
			@Pc(109) int local109 = arg3 - local23;
			if (local53 < 0) {
				while (local53 < 0) {
					local17++;
					local62 += local92;
					local92 += local70;
					local53 += local78;
					local78 += local70;
				}
			}
			if (local62 < 0) {
				local62 += local92;
				local92 += local70;
				local17++;
				local53 += local78;
				local78 += local70;
			}
			@Pc(165) int local165 = local23 + arg3;
			local53 += -local98;
			local62 += -local86;
			local98 -= local66;
			@Pc(183) int local183 = local17 + arg1;
			local86 -= local66;
			@Pc(191) int local191 = arg1 - local17;
			Static288.method4405(arg0, local183, local191, Static151.anIntArrayArray26[local109]);
			Static288.method4405(arg0, local183, local191, Static151.anIntArrayArray26[local165]);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)I")
	private static int method506(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)V")
	public static void method508() {
		Static14.aClass31_3.method856(5);
		Static11.aClass31_1.method856(5);
		Static134.aClass31_22.method856(5);
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(II)Lclient!ig;")
	public static Class1_Sub2_Sub10 method509(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub10 local10 = (Class1_Sub2_Sub10) Static52.aClass64_6.method1471((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static282.aClass7_238.method253(method506(arg0), Static56.method933(arg0));
		local10 = new Class1_Sub2_Sub10();
		if (local25 != null) {
			local10.method1766(new Class1_Sub18(local25));
		}
		Static52.aClass64_6.method1466(local10, (long) arg0);
		return local10;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!hp", name = "s", descriptor = "I")
	public static int anInt2577 = -1;

	@OriginalMember(owner = "client!hp", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString166 = "Use";

	@OriginalMember(owner = "client!hp", name = "v", descriptor = "I")
	public static int anInt2578 = 0;

	@OriginalMember(owner = "client!hp", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString167 = "Loaded sprites";

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IC)Z")
	public static boolean method2395(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(28) char[] local28 = Static95.aCharArray26;
			for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
				@Pc(36) char local36 = local28[local30];
				if (local36 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)Lclient!jf;")
	public static Class96 method2396(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static348.aClass96ArrayArray1[local12] == null || Static348.aClass96ArrayArray1[local12][local16] == null) {
			@Pc(30) boolean local30 = Static323.method5433(local12);
			if (!local30) {
				return null;
			}
		}
		return Static348.aClass96ArrayArray1[local12][local16];
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IJII)V")
	public static void method2398(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = (int) arg1 >> 14 & 0x1F;
		@Pc(19) int local19 = (int) arg1 >> 20 & 0x3;
		@Pc(26) int local26 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local12 != 10 && local12 != 11 && local12 != 22) {
			Static227.method3914(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], arg2, 0, local12, 0, true, local19, 0, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], arg0);
			return;
		}
		@Pc(41) Class137 local41 = Static228.method3923(local26);
		@Pc(49) int local49;
		@Pc(52) int local52;
		if (local19 == 0 || local19 == 2) {
			local52 = local41.anInt4166;
			local49 = local41.anInt4126;
		} else {
			local49 = local41.anInt4166;
			local52 = local41.anInt4126;
		}
		@Pc(63) int local63 = local41.anInt4124;
		if (local19 != 0) {
			local63 = (local63 << local19 & 0xF) + (local63 >> 4 - local19);
		}
		Static227.method3914(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], arg2, local52, 0, local49, true, 0, local63, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], arg0);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I")
	public static int method2399(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		@Pc(25) char local25 = 0;
		@Pc(27) char local27 = 0;
		while (local21 - local25 < local8 || local23 - local27 < local11) {
			if (local21 - local25 >= local8) {
				return -1;
			}
			if (local23 - local27 >= local11) {
				return 1;
			}
			@Pc(62) char local62;
			if (local25 == '\u0000') {
				local62 = arg1.charAt(local21++);
			} else {
				local62 = local25;
			}
			@Pc(81) char local81;
			if (local27 == '\u0000') {
				local81 = arg2.charAt(local23++);
			} else {
				local81 = local27;
			}
			local25 = Static151.method2887(local62);
			local27 = Static151.method2887(local81);
			local62 = Static302.method5140(arg0, local62);
			local81 = Static302.method5140(arg0, local81);
			if (local81 != local62 && Character.toUpperCase(local62) != Character.toUpperCase(local81)) {
				local62 = Character.toLowerCase(local62);
				local81 = Character.toLowerCase(local81);
				if (local62 != local81) {
					return Static46.method1047(local62, arg0) - Static46.method1047(local81, arg0);
				}
			}
		}
		@Pc(141) int local141 = Math.min(local8, local11);
		for (@Pc(143) int local143 = 0; local143 < local141; local143++) {
			if (arg0 == 2) {
				local21 = local8 - local143 - 1;
				local23 = local11 - local143 - 1;
			} else {
				local23 = local143;
				local21 = local143;
			}
			@Pc(174) char local174 = arg1.charAt(local21);
			@Pc(178) char local178 = arg2.charAt(local23);
			if (local174 != local178 && Character.toUpperCase(local174) != Character.toUpperCase(local178)) {
				local174 = Character.toLowerCase(local174);
				local178 = Character.toLowerCase(local178);
				if (local174 != local178) {
					return Static46.method1047(local174, arg0) - Static46.method1047(local178, arg0);
				}
			}
		}
		@Pc(219) int local219 = local8 - local11;
		if (local219 != 0) {
			return local219;
		}
		for (@Pc(228) int local228 = 0; local228 < local141; local228++) {
			@Pc(234) char local234 = arg1.charAt(local228);
			@Pc(238) char local238 = arg2.charAt(local228);
			if (local234 != local238) {
				return Static46.method1047(local234, arg0) - Static46.method1047(local238, arg0);
			}
		}
		return 0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(CB)C", line = 9)
	public static char method5763(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLclient!oe;)I", line = 414)
	public static int method5765(@OriginalArg(1) Class11_Sub5_Sub2_Sub2 arg0) {
		@Pc(8) Class71 local8 = arg0.aClass71_1;
		if (local8.anIntArray129 != null) {
			local8 = local8.method2095(Static199.aClass226_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local8.anInt2013;
		@Pc(32) Class222 local32 = arg0.method4333();
		if (arg0.aBoolean317) {
			local28 = local8.anInt2036;
		} else if (local32.anInt6251 == arg0.anInt4577 || arg0.anInt4577 == local32.anInt6280 || local32.anInt6289 == arg0.anInt4577 || local32.anInt6259 == arg0.anInt4577) {
			local28 = local8.anInt2023;
		} else if (local32.anInt6253 == arg0.anInt4577 || arg0.anInt4577 == local32.anInt6287 || local32.anInt6255 == arg0.anInt4577 || arg0.anInt4577 == local32.anInt6272) {
			local28 = local8.anInt2007;
		}
		return local28;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)V", line = 460)
	public static void method5766() {
		@Pc(7) Class204 local7 = null;
		try {
			@Pc(11) Class32 local11 = Static305.aClass152_5.method3757();
			while (local11.anInt992 == 0) {
				Static214.method4024(1L);
			}
			if (local11.anInt992 == 1) {
				local7 = (Class204) local11.anObject2;
				@Pc(41) Class2_Sub4 local41 = new Class2_Sub4(Class2_Sub2_Sub7.anInt2291 * 6 + 3);
				local41.method4843(1);
				local41.method4844(Class2_Sub2_Sub7.anInt2291);
				for (@Pc(51) int local51 = 0; local51 < Static71.anIntArray117.length; local51++) {
					if (Static83.aBooleanArray18[local51]) {
						local41.method4844(local51);
						local41.method4814(Static71.anIntArray117[local51]);
					}
				}
				local7.method5196(local41.aByteArray73, local41.anInt5289, 0);
			}
		} catch (@Pc(82) Exception local82) {
		}
		try {
			if (local7 != null) {
				local7.method5194();
			}
		} catch (@Pc(89) Exception local89) {
		}
		Class243.aLong221 = Static190.method3686();
		Class2_Sub2_Sub2_Sub2.aBoolean374 = false;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BZLjava/lang/String;I)Z", line = 515)
	public static boolean method5767(@OriginalArg(2) String arg0) {
		@Pc(36) boolean local36 = false;
		@Pc(38) boolean local38 = false;
		@Pc(40) int local40 = 0;
		@Pc(43) int local43 = arg0.length();
		for (@Pc(45) int local45 = 0; local45 < local43; local45++) {
			@Pc(51) char local51 = arg0.charAt(local45);
			if (local45 == 0) {
				if (local51 == '-') {
					local36 = true;
					continue;
				}
				if (local51 == '+') {
					continue;
				}
			}
			@Pc(94) int local94;
			if (local51 >= '0' && local51 <= '9') {
				local94 = local51 - '0';
			} else if (local51 >= 'A' && local51 <= 'Z') {
				local94 = local51 - '7';
			} else if (local51 >= 'a' && local51 <= 'z') {
				local94 = local51 - 'W';
			} else {
				return false;
			}
			if (local94 >= 10) {
				return false;
			}
			if (local36) {
				local94 = -local94;
			}
			@Pc(123) int local123 = local40 * 10 + local94;
			if (local40 != local123 / 10) {
				return false;
			}
			local40 = local123;
			local38 = true;
		}
		return local38;
	}
}

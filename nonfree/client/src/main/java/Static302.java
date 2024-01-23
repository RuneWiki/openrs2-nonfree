import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "Lclient!fa;")
	public static Class49 aClass49_4;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "Lclient!lj;")
	public static Class1_Sub5_Sub6 aClass1_Sub5_Sub6_11;

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "[I")
	public static int[] anIntArray595 = new int[100];

	@OriginalMember(owner = "client!vn", name = "ab", descriptor = "[I")
	public static int[] anIntArray597 = new int[4];

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
	public static void method4511() {
		if (Static287.anInt5199 != Static132.anInt2608 && Static62.method1102(Static132.anInt2608)) {
			Static287.anInt5199 = Static132.anInt2608;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IILjava/lang/String;Z)I")
	public static int method4512(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(27) boolean local27 = false;
		@Pc(34) int local34 = 0;
		@Pc(36) boolean local36 = false;
		@Pc(39) int local39 = arg1.length();
		for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
			@Pc(48) char local48 = arg1.charAt(local41);
			if (local41 == 0) {
				if (local48 == '-') {
					local27 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(76) int local76;
			if (local48 >= '0' && local48 <= '9') {
				local76 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local76 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local76 = local48 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local76) {
				throw new NumberFormatException();
			}
			if (local27) {
				local76 = -local76;
			}
			@Pc(125) int local125 = arg0 * local34 + local76;
			if (local34 != local125 / arg0) {
				throw new NumberFormatException();
			}
			local36 = true;
			local34 = local125;
		}
		if (!local36) {
			throw new NumberFormatException();
		}
		return local34;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IC)C")
	public static char method4515(@OriginalArg(1) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!si;BI)Ljava/lang/String;")
	public static String method4519(@OriginalArg(0) Class157 arg0, @OriginalArg(2) int arg1) {
		if (!Static42.method777(arg0).method1127(arg1) && arg0.anObjectArray29 == null) {
			return null;
		} else if (arg0.aStringArray32 == null || arg1 >= arg0.aStringArray32.length || arg0.aStringArray32[arg1] == null || arg0.aStringArray32[arg1].trim().length() == 0) {
			return Static26.aBoolean54 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray32[arg1];
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IBILclient!si;)V")
	public static void method4520(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class157 arg2) {
		if (Static64.aClass157_5 != null || Static91.aBoolean183 || (arg2 == null || Static19.method323(arg2) == null)) {
			return;
		}
		Static64.aClass157_5 = arg2;
		Static252.aClass157_15 = Static19.method323(arg2);
		Static6.aBoolean471 = false;
		Static136.anInt2664 = arg1;
		Static183.anInt3513 = 0;
		Static203.anInt3368 = arg0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IB)V")
	public static void method4523() {
		Static273.aClass175_40.method4288(5);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)I")
	public static int method4525(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIII)V")
	public static void method4527(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg2;
		@Pc(15) int local15 = arg3 - arg4;
		if (local15 == 0) {
			if (local10 != 0) {
				Static106.method3313(arg1, arg4, arg0, arg2);
			}
		} else if (local10 == 0) {
			Static121.method2202(arg4, arg3, arg0, arg2);
		} else {
			@Pc(58) int local58 = (local10 << 12) / local15;
			@Pc(67) int local67 = arg2 - (arg4 * local58 >> 12);
			@Pc(84) int local84;
			@Pc(82) int local82;
			if (Static188.anInt3598 > arg3) {
				local82 = (Static188.anInt3598 * local58 >> 12) + local67;
				local84 = Static188.anInt3598;
			} else if (Static289.anInt5245 < arg3) {
				local82 = local67 + (local58 * Static289.anInt5245 >> 12);
				local84 = Static289.anInt5245;
			} else {
				local84 = arg3;
				local82 = arg1;
			}
			@Pc(126) int local126;
			@Pc(124) int local124;
			if (arg4 < Static188.anInt3598) {
				local124 = local67 + (local58 * Static188.anInt3598 >> 12);
				local126 = Static188.anInt3598;
			} else if (Static289.anInt5245 < arg4) {
				local124 = (Static289.anInt5245 * local58 >> 12) + local67;
				local126 = Static289.anInt5245;
			} else {
				local126 = arg4;
				local124 = arg2;
			}
			if (Static231.anInt4333 > local82) {
				local82 = Static231.anInt4333;
				local84 = (Static231.anInt4333 - local67 << 12) / local58;
			} else if (Static218.anInt4086 < local82) {
				local82 = Static218.anInt4086;
				local84 = (Static218.anInt4086 - local67 << 12) / local58;
			}
			if (Static231.anInt4333 > local124) {
				local124 = Static231.anInt4333;
				local126 = (Static231.anInt4333 - local67 << 12) / local58;
			} else if (local124 > Static218.anInt4086) {
				local124 = Static218.anInt4086;
				local126 = (Static218.anInt4086 - local67 << 12) / local58;
			}
			Static29.method520(local124, arg0, local84, local126, local82);
		}
	}
}

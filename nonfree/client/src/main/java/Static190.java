import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
	public static int anInt4201;

	@OriginalMember(owner = "client!nm", name = "T", descriptor = "Z")
	public static boolean aBoolean261;

	@OriginalMember(owner = "client!nm", name = "U", descriptor = "I")
	public static int anInt4208;

	@OriginalMember(owner = "client!nm", name = "L", descriptor = "I")
	public static int anInt4200 = 0;

	@OriginalMember(owner = "client!nm", name = "W", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray34 = new String[500];

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZIILjava/lang/String;)I")
	public static int method3076(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1) {
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(38) int local38 = arg1.length();
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local38; local42++) {
			@Pc(53) char local53 = arg1.charAt(local42);
			if (local42 == 0) {
				if (local53 == '-') {
					local33 = true;
					continue;
				}
				if (local53 == '+') {
					continue;
				}
			}
			@Pc(83) int local83;
			if (local53 >= '0' && local53 <= '9') {
				local83 = local53 - '0';
			} else if (local53 >= 'A' && local53 <= 'Z') {
				local83 = local53 - '7';
			} else if (local53 >= 'a' && local53 <= 'z') {
				local83 = local53 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local83) {
				throw new NumberFormatException();
			}
			if (local33) {
				local83 = -local83;
			}
			@Pc(133) int local133 = arg0 * local40 + local83;
			if (local133 / arg0 != local40) {
				throw new NumberFormatException();
			}
			local40 = local133;
			local35 = true;
		}
		if (!local35) {
			throw new NumberFormatException();
		}
		return local40;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZI)V")
	public static void method3077(@OriginalArg(0) boolean arg0) {
		@Pc(13) byte local13;
		@Pc(11) byte[][] local11;
		if (Static294.aBoolean367 && arg0) {
			local13 = 1;
			local11 = Static129.aByteArrayArray11;
		} else {
			local11 = Static24.aByteArrayArray4;
			local13 = 4;
		}
		for (@Pc(26) int local26 = 0; local26 < local13; local26++) {
			Static248.method3834();
			for (@Pc(33) int local33 = 0; local33 < 13; local33++) {
				for (@Pc(38) int local38 = 0; local38 < 13; local38++) {
					@Pc(51) int local51 = Static309.anIntArrayArrayArray15[local26][local33][local38];
					if (local51 != -1) {
						@Pc(61) int local61 = local51 >> 24 & 0x3;
						if (!arg0 || local61 == 0) {
							@Pc(71) int local71 = local51 >> 1 & 0x3;
							@Pc(77) int local77 = local51 >> 3 & 0x7FF;
							@Pc(83) int local83 = local51 >> 14 & 0x3FF;
							@Pc(93) int local93 = local77 / 8 + (local83 / 8 << 8);
							for (@Pc(95) int local95 = 0; local95 < Static234.anIntArray456.length; local95++) {
								if (Static234.anIntArray456[local95] == local93 && local11[local95] != null) {
									Static282.method4293((local83 & 0x7) * 8, arg0, (local77 & 0x7) * 8, local11[local95], Static82.aClass75Array1, local71, local38 * 8, local26, local61, local33 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)V")
	public static void method3079() {
		Static256.aClass89_40.method2265();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!th;IIB)Lclient!si;")
	public static Class1_Sub3_Sub13_Sub2 method3080(@OriginalArg(0) Class168 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static131.method2257(arg2, arg0, arg1) ? Static286.method4388() : null;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI)V")
	public static void method3081() {
		Static293.aClass89_50.method2273(5);
		Static215.aClass89_33.method2273(5);
	}
}

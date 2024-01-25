import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[100];

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
	public static int anInt4252 = -1;

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_103 = new Class81(109, 2);

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_55 = new Class44(79, 3);

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/String;BIZ)I")
	public static int method3427(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(29) boolean local29 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg0.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(44) char local44 = arg0.charAt(local38);
			if (local38 == 0) {
				if (local44 == '-') {
					local29 = true;
					continue;
				}
				if (local44 == '+') {
					continue;
				}
			}
			@Pc(89) int local89;
			if (local44 >= '0' && local44 <= '9') {
				local89 = local44 - '0';
			} else if (local44 >= 'A' && local44 <= 'Z') {
				local89 = local44 - '7';
			} else if (local44 >= 'a' && local44 <= 'z') {
				local89 = local44 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local89) {
				throw new NumberFormatException();
			}
			if (local29) {
				local89 = -local89;
			}
			@Pc(117) int local117 = local89 + local33 * arg1;
			if (local117 / arg1 != local33) {
				throw new NumberFormatException();
			}
			local31 = true;
			local33 = local117;
		}
		if (!local31) {
			throw new NumberFormatException();
		}
		return local33;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIII)V")
	public static void method3428(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(12) Class38_Sub8 local12 = (Class38_Sub8) Static316.aClass184_4.method4212(); local12 != null; local12 = (Class38_Sub8) Static316.aClass184_4.method4215()) {
			if (local12.anInt6397 <= Static164.anInt3206) {
				local12.method5069();
			} else {
				Static210.method3242((local12.anInt6402 << 7) + 64, local12.anInt6403 * 2, arg1 >> 1, arg0 >> 1, (local12.anInt6394 << 7) + 64, local12.anInt6395);
				Static193.aClass56_3.method5844(0, Static413.anIntArray483[1] + arg3, local12.anInt6399 | 0xFF000000, Static413.anIntArray483[0] + arg2, local12.aString54);
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!fh;ILclient!tk;Lclient!qa;)V")
	public static void method3430(@OriginalArg(0) Class83 arg0, @OriginalArg(2) Class2_Sub38 arg1, @OriginalArg(3) Class26 arg2) {
		@Pc(10) Class76 local10 = arg0.method1709(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(21) int local21 = local10.UA();
		if (local21 < local10.qa()) {
			local21 = local10.qa();
		}
		@Pc(33) int local33 = arg1.anInt6766;
		@Pc(36) int local36 = arg1.anInt6771;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		@Pc(56) int local56;
		@Pc(83) int local83;
		if (arg0.aString18 != null) {
			local38 = Static434.aClass210_10.method4756(Static238.aStringArray22, arg0.aString18, null, null);
			for (local56 = 0; local56 < local38; local56++) {
				@Pc(62) String local62 = Static238.aStringArray22[local56];
				if (local38 - 1 > local56) {
					local62 = local62.substring(0, local62.length() - 4);
				}
				local83 = Static397.aClass49_28.method1275(local62);
				if (local83 > local40) {
					local40 = local83;
				}
			}
			local42 = Static397.aClass49_28.method1276() * local38 + Static397.aClass49_28.method1278() / 2;
		}
		local56 = arg1.anInt6766 + local21 / 2;
		if (local33 < local21 + Static169.anInt3166) {
			local33 = Static169.anInt3166;
			local56 = local40 / 2 + Static169.anInt3166 + local21 / 2 + 15;
		} else if (Static169.anInt3165 - local21 < local33) {
			local33 = Static169.anInt3165 - local21;
			local56 = Static169.anInt3165 - local40 / 2 - local21 / 2 - 10 - 5;
		}
		@Pc(169) int local169 = arg1.anInt6771;
		if (local36 < local21 + Static169.anInt3170) {
			local36 = Static169.anInt3170;
			local169 = Static169.anInt3170 + local21 / 2 + 10;
		} else if (Static169.anInt3163 - local21 < local36) {
			local36 = Static169.anInt3163 - local21;
			local169 = Static169.anInt3163 - local21 / 2 - local42 - 10;
		}
		local83 = (int) (Math.atan2((double) (local33 - arg1.anInt6766), (double) (local36 - arg1.anInt6771)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method6092((float) local33 + (float) local21 / 2.0F, (float) local36 + (float) local21 / 2.0F, 4096, local83);
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		@Pc(261) int local261 = -2;
		@Pc(263) int local263 = -2;
		if (arg0.aString18 != null) {
			local259 = local169;
			local257 = local56 - local40 / 2 - 5;
			local263 = local169 + local38 * Static397.aClass49_28.method1276() + 3;
			local261 = local40 + local257 + 10;
			if (arg0.anInt2331 != 0) {
				arg2.method2245(local263 - local169, local257, local169, local261 - local257, arg0.anInt2331);
			}
			if (arg0.anInt2314 != 0) {
				arg2.method2278(local257, local261 - local257, local169, arg0.anInt2314, local263 - local169);
			}
			for (@Pc(333) int local333 = 0; local333 < local38; local333++) {
				@Pc(339) String local339 = Static238.aStringArray22[local333];
				if (local38 - 1 > local333) {
					local339 = local339.substring(0, local339.length() - 4);
				}
				Static397.aClass49_28.method1277(arg2, local339, local56, local169, arg0.anInt2335);
				local169 += Static397.aClass49_28.method1276();
			}
		}
		if (arg0.anInt2339 == -1 && arg0.aString18 == null) {
			return;
		}
		@Pc(382) Class2_Sub43 local382 = new Class2_Sub43(arg1);
		local21 >>= 0x1;
		local382.anInt7449 = local36 - local21;
		local382.anInt7454 = local263;
		local382.anInt7447 = local261;
		local382.anInt7448 = local33 + local21;
		local382.anInt7457 = local36 + local21;
		local382.anInt7451 = local257;
		local382.anInt7446 = local259;
		local382.anInt7453 = local33 - local21;
		Static128.aClass265_20.method5999(local382);
	}
}

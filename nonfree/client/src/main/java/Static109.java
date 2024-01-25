import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!go", name = "l", descriptor = "F")
	public static float aFloat16;

	@OriginalMember(owner = "client!go", name = "x", descriptor = "[[I")
	public static int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!go", name = "D", descriptor = "Lclient!ij;")
	public static Class93 aClass93_44;

	@OriginalMember(owner = "client!go", name = "U", descriptor = "Lclient!ij;")
	public static Class93 aClass93_45;

	@OriginalMember(owner = "client!go", name = "N", descriptor = "I")
	public static int anInt2061 = 0;

	@OriginalMember(owner = "client!go", name = "O", descriptor = "Lclient!vg;")
	public static Class201 aClass201_6 = null;

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(BI)I")
	public static int method1929(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!go", name = "d", descriptor = "(II)Lclient!o;")
	public static Class5_Sub1_Sub15 method1935(@OriginalArg(0) int arg0) {
		@Pc(17) Class5_Sub1_Sub15 local17 = (Class5_Sub1_Sub15) Static121.aClass122_5.method3177((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(31) byte[] local31 = Static39.aClass93_14.method2410(Static168.method3063(arg0), Static240.method4272(arg0));
		local17 = new Class5_Sub1_Sub15();
		if (local31 != null) {
			local17.method4038(new Class5_Sub12(local31));
		}
		Static121.aClass122_5.method3181((long) arg0, local17);
		return local17;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I")
	public static int method1936(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(6) int local6 = arg0.length();
		@Pc(9) int local9 = arg2.length();
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) char local15 = 0;
		@Pc(17) char local17 = 0;
		while (local11 - local15 < local6 || local13 - local17 < local9) {
			if (local6 <= local11 - local15) {
				return -1;
			}
			if (local9 <= local13 - local17) {
				return 1;
			}
			@Pc(56) char local56;
			if (local15 == '\u0000') {
				local56 = arg0.charAt(local11++);
			} else {
				local56 = local15;
			}
			@Pc(71) char local71;
			if (local17 == '\u0000') {
				local71 = arg2.charAt(local13++);
			} else {
				local71 = local17;
			}
			local15 = Static186.method3347(local56);
			local17 = Static186.method3347(local71);
			local56 = Static270.method4718(arg1, local56);
			local71 = Static270.method4718(arg1, local71);
			if (local56 != local71 && Character.toUpperCase(local56) != Character.toUpperCase(local71)) {
				local56 = Character.toLowerCase(local56);
				local71 = Character.toLowerCase(local71);
				if (local56 != local71) {
					return Static45.method714(local56, arg1) - Static45.method714(local71, arg1);
				}
			}
		}
		@Pc(133) int local133 = Math.min(local6, local9);
		for (@Pc(135) int local135 = 0; local135 < local133; local135++) {
			if (arg1 == 2) {
				local13 = local9 - local135 - 1;
				local11 = local6 - local135 - 1;
			} else {
				local13 = local135;
				local11 = local135;
			}
			@Pc(170) char local170 = arg0.charAt(local11);
			@Pc(174) char local174 = arg2.charAt(local13);
			if (local174 != local170 && Character.toUpperCase(local170) != Character.toUpperCase(local174)) {
				local170 = Character.toLowerCase(local170);
				local174 = Character.toLowerCase(local174);
				if (local174 != local170) {
					return Static45.method714(local170, arg1) - Static45.method714(local174, arg1);
				}
			}
		}
		@Pc(223) int local223 = local6 - local9;
		if (local223 != 0) {
			return local223;
		}
		for (@Pc(229) int local229 = 0; local229 < local133; local229++) {
			@Pc(234) char local234 = arg0.charAt(local229);
			@Pc(238) char local238 = arg2.charAt(local229);
			if (local238 != local234) {
				return Static45.method714(local234, arg1) - Static45.method714(local238, arg1);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BIII)V")
	public static void method1938(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static178.aClass174ArrayArrayArray3 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg2 | arg0 << 14 | arg1 << 28);
		@Pc(33) Class5_Sub29 local33 = (Class5_Sub29) Static343.aClass190_33.method5466(local19);
		if (local33 == null) {
			Static229.method4134(arg1, arg2, arg0);
			return;
		}
		@Pc(47) Class5_Sub27 local47 = (Class5_Sub27) local33.aClass103_113.method2756();
		if (local47 == null) {
			Static229.method4134(arg1, arg2, arg0);
			return;
		}
		@Pc(61) Class4_Sub2_Sub1 local61 = (Class4_Sub2_Sub1) Static229.method4134(arg1, arg2, arg0);
		if (local61 == null) {
			local61 = new Class4_Sub2_Sub1();
		} else {
			local61.anInt1905 = local61.anInt1903 = -1;
		}
		local61.anInt1900 = local47.anInt4335;
		local61.anInt1904 = local47.anInt4334;
		label44: while (true) {
			@Pc(89) Class5_Sub27 local89 = (Class5_Sub27) local33.aClass103_113.method2748();
			if (local89 == null) {
				break;
			}
			if (local61.anInt1900 != local89.anInt4335) {
				local61.anInt1905 = local89.anInt4335;
				local61.anInt1906 = local89.anInt4334;
				while (true) {
					@Pc(110) Class5_Sub27 local110 = (Class5_Sub27) local33.aClass103_113.method2748();
					if (local110 == null) {
						break label44;
					}
					if (local61.anInt1900 != local110.anInt4335 && local110.anInt4335 != local61.anInt1905) {
						local61.anInt1903 = local110.anInt4335;
						local61.anInt1902 = local110.anInt4334;
					}
				}
			}
		}
		@Pc(154) int local154 = Static208.method3804(arg1, (arg2 << 7) + 64, (arg0 << 7) + 64);
		Static114.method1991(arg1, arg2, arg0, local154, local61);
	}
}

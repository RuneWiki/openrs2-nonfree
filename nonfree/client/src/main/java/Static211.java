import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "[Lclient!em;")
	public static Class48[] aClass48Array2;

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "Lclient!wg;")
	public static Class178 aClass178_2;

	@OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
	public static int anInt958;

	@OriginalMember(owner = "client!qc", name = "O", descriptor = "J")
	public static long aLong36;

	@OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
	private static int anInt965;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString25 = "Please wait...";

	@OriginalMember(owner = "client!qc", name = "B", descriptor = "Lclient!rg;")
	public static Class48_Sub2 aClass48_Sub2_2 = null;

	@OriginalMember(owner = "client!qc", name = "E", descriptor = "[I")
	public static int[] anIntArray127 = new int[25];

	@OriginalMember(owner = "client!qc", name = "F", descriptor = "I")
	public static int anInt957 = 0;

	@OriginalMember(owner = "client!qc", name = "I", descriptor = "[Lclient!qi;")
	public static Class6_Sub6_Sub1[] aClass6_Sub6_Sub1Array2 = new Class6_Sub6_Sub1[32768];

	@OriginalMember(owner = "client!qc", name = "J", descriptor = "I")
	public static int anInt959 = 0;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
	public static int method778(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(4) int local4 = arg0.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) char local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local15 < local4 || local17 - local19 < local11) {
			if (local13 - local15 >= local4) {
				return -1;
			}
			if (local17 - local19 >= local11) {
				return 1;
			}
			@Pc(69) char local69;
			if (local15 == '\u0000') {
				local69 = arg0.charAt(local13++);
			} else {
				local69 = local15;
			}
			@Pc(88) char local88;
			if (local19 == '\u0000') {
				local88 = arg2.charAt(local17++);
			} else {
				local88 = local19;
			}
			local15 = Static298.method4547(local69);
			local19 = Static298.method4547(local88);
			local69 = Static195.method2963(arg1, local69);
			local88 = Static195.method2963(arg1, local88);
			if (local69 != local88 && Character.toUpperCase(local69) != Character.toUpperCase(local88)) {
				local69 = Character.toLowerCase(local69);
				local88 = Character.toLowerCase(local88);
				if (local88 != local69) {
					return Static229.method3659(local69, arg1) - Static229.method3659(local88, arg1);
				}
			}
		}
		@Pc(150) int local150 = Math.min(local4, local11);
		@Pc(190) char local190;
		@Pc(152) int local152;
		for (local152 = 0; local152 < local150; local152++) {
			if (arg1 == 2) {
				local13 = local4 - local152 - 1;
				local17 = local11 - local152 - 1;
			} else {
				local17 = local152;
				local13 = local152;
			}
			@Pc(186) char local186 = arg0.charAt(local13);
			local190 = arg2.charAt(local17);
			if (local190 != local186 && Character.toUpperCase(local186) != Character.toUpperCase(local190)) {
				local186 = Character.toLowerCase(local186);
				local190 = Character.toLowerCase(local190);
				if (local190 != local186) {
					return Static229.method3659(local186, arg1) - Static229.method3659(local190, arg1);
				}
			}
		}
		local152 = local4 - local11;
		if (local152 != 0) {
			return local152;
		}
		for (@Pc(245) int local245 = 0; local245 < local150; local245++) {
			local190 = arg0.charAt(local245);
			@Pc(256) char local256 = arg2.charAt(local245);
			if (local256 != local190) {
				return Static229.method3659(local190, arg1) - Static229.method3659(local256, arg1);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILjava/lang/String;IZ)I")
	public static int method784(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(30) boolean local30 = false;
		@Pc(32) boolean local32 = false;
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = arg1.length();
		for (@Pc(39) int local39 = 0; local39 < local37; local39++) {
			@Pc(46) char local46 = arg1.charAt(local39);
			if (local39 == 0) {
				if (local46 == '-') {
					local30 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(91) int local91;
			if (local46 >= '0' && local46 <= '9') {
				local91 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local91 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local91 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local91) {
				throw new NumberFormatException();
			}
			if (local30) {
				local91 = -local91;
			}
			@Pc(123) int local123 = local91 + local34 * arg0;
			if (local123 / arg0 != local34) {
				throw new NumberFormatException();
			}
			local34 = local123;
			local32 = true;
		}
		if (!local32) {
			throw new NumberFormatException();
		}
		return local34;
	}
}

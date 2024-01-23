import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!fb", name = "K", descriptor = "[I")
	public static int[] anIntArray119;

	@OriginalMember(owner = "client!fb", name = "N", descriptor = "Lclient!ho;")
	public static Class78 aClass78_1;

	@OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
	public static int anInt1498;

	@OriginalMember(owner = "client!fb", name = "S", descriptor = "[I")
	public static int[] anIntArray120;

	@OriginalMember(owner = "client!fb", name = "T", descriptor = "Lclient!nm;")
	public static Class119 aClass119_23;

	@OriginalMember(owner = "client!fb", name = "W", descriptor = "I")
	public static int anInt1503;

	@OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
	public static int anInt1492 = 0;

	@OriginalMember(owner = "client!fb", name = "I", descriptor = "Z")
	public static boolean aBoolean146 = true;

	@OriginalMember(owner = "client!fb", name = "M", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray6 = new String[] { "en", "de", "fr", "pt" };

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(B)V")
	public static void method1327() {
		Static226.anImage2 = null;
		Static234.aFontMetrics1 = null;
		Static39.aFont1 = null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;ISZILjava/lang/String;IJ)V")
	public static void method1328(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		if (Static91.aBoolean183 || Static241.anInt4470 >= 500) {
			return;
		}
		Static146.aStringArray19[Static241.anInt4470] = arg4;
		Static246.aStringArray28[Static241.anInt4470] = arg0;
		Static4.anIntArray16[Static241.anInt4470] = arg3 == -1 ? Static293.anInt5296 : arg3;
		Static94.aShortArray46[Static241.anInt4470] = arg2;
		Static66.aLongArray5[Static241.anInt4470] = arg6;
		Static266.anIntArray551[Static241.anInt4470] = arg1;
		Static195.anIntArray409[Static241.anInt4470] = arg5;
		Static241.anInt4470++;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(ZI)V")
	public static void method1329(@OriginalArg(1) int arg0) {
		@Pc(4) Class1_Sub5_Sub21 local4 = Static278.method4266(5, arg0);
		local4.method4064();
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)Lclient!ae;")
	public static Class3 method1330(@OriginalArg(0) int arg0) {
		@Pc(16) Class3 local16 = (Class3) Static199.aClass175_31.method4295((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(32) byte[] local32 = Static291.aClass119_90.method3235(Static40.method723(arg0), Static118.method2145(arg0));
		local16 = new Class3();
		local16.anInt122 = arg0;
		if (local32 != null) {
			local16.method71(new Class1_Sub13(local32));
		}
		local16.method83();
		if (local16.anInt125 != -1) {
			local16.method73(method1330(local16.anInt125), method1330(local16.anInt148));
		}
		if (local16.anInt127 != -1) {
			local16.method74(method1330(local16.anInt127), method1330(local16.anInt137));
		}
		if (!Static199.aBoolean348 && local16.aBoolean14) {
			local16.aBoolean15 = false;
			local16.anInt143 = 0;
			local16.aStringArray1 = Static315.aStringArray37;
			local16.aString3 = Static89.aString68;
			local16.aStringArray2 = Static306.aStringArray36;
		}
		Static199.aClass175_31.method4285(local16, (long) arg0);
		return local16;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLclient!fh;)V")
	public static void method1332(@OriginalArg(1) Class1_Sub13 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static21.anInt448; local3++) {
			@Pc(14) int local14 = arg0.method1830();
			@Pc(18) int local18 = arg0.method1879();
			if (local18 == 65535) {
				local18 = -1;
			}
			if (Static314.aClass4_Sub1Array4[local14] != null) {
				Static314.aClass4_Sub1Array4[local14].anInt197 = local18;
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method1333(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(33) int local33 = 0;
			for (@Pc(35) long local35 = arg0; local35 != 0L; local35 /= 37L) {
				local33++;
			}
			@Pc(51) StringBuffer local51 = new StringBuffer(local33);
			while (arg0 != 0L) {
				@Pc(59) long local59 = arg0;
				arg0 /= 37L;
				@Pc(73) char local73 = Static305.aCharArray6[(int) (local59 - arg0 * 37L)];
				if (local73 == '_') {
					@Pc(84) int local84 = local51.length() - 1;
					local51.setCharAt(local84, Character.toUpperCase(local51.charAt(local84)));
					local73 = ' ';
				}
				local51.append(local73);
			}
			local51.reverse();
			local51.setCharAt(0, Character.toUpperCase(local51.charAt(0)));
			return local51.toString();
		}
	}
}

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!wj", name = "K", descriptor = "[I")
	public static final int[] anIntArray547 = new int[32];

	@OriginalMember(owner = "client!wj", name = "M", descriptor = "Lclient!wt;")
	private static final Class267 aClass267_108 = new Class267(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!wj", name = "W", descriptor = "Z")
	public static boolean aBoolean492 = false;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method6399(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static125.anInt2592 >= 100) {
			Static61.method1338(Static413.aClass267_101.method6581(Static161.anInt3239));
			return;
		}
		@Pc(26) String local26 = method6404(arg0);
		if (local26 == null) {
			return;
		}
		@Pc(71) String local71;
		for (@Pc(31) int local31 = 0; local31 < Static125.anInt2592; local31++) {
			@Pc(39) String local39 = method6404(Static186.aStringArray25[local31]);
			if (local39 != null && local39.equals(local26)) {
				Static61.method1338(arg0 + Static105.aClass267_31.method6581(Static161.anInt3239));
				return;
			}
			if (Static85.aStringArray9[local31] != null) {
				local71 = method6404(Static85.aStringArray9[local31]);
				if (local71 != null && local71.equals(local26)) {
					Static61.method1338(arg0 + Static105.aClass267_31.method6581(Static161.anInt3239));
					return;
				}
			}
		}
		for (@Pc(108) int local108 = 0; local108 < Static398.anInt2169; local108++) {
			local71 = method6404(Static314.aStringArray32[local108]);
			if (local71 != null && local71.equals(local26)) {
				Static61.method1338(Static415.aClass267_102.method6581(Static161.anInt3239) + arg0 + Static215.aClass267_56.method6581(Static161.anInt3239));
				return;
			}
			if (Static185.aStringArray24[local108] != null) {
				@Pc(151) String local151 = method6404(Static185.aStringArray24[local108]);
				if (local151 != null && local151.equals(local26)) {
					Static61.method1338(Static415.aClass267_102.method6581(Static161.anInt3239) + arg0 + Static215.aClass267_56.method6581(Static161.anInt3239));
					return;
				}
			}
		}
		if (method6404(Static302.aClass3_Sub2_Sub1_Sub2_2.aString54).equals(local26)) {
			Static61.method1338(Static337.aClass267_81.method6581(Static161.anInt3239));
		} else {
			Static403.method5961(Static194.aClass92_65);
			Static109.aClass6_Sub1_Sub1_5.method6439(Static16.method471(arg0) + 1);
			Static109.aClass6_Sub1_Sub1_5.method6448(arg0);
			Static109.aClass6_Sub1_Sub1_5.method6439(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(IIII)I")
	public static int method6400(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1) {
			return arg0;
		}
		@Pc(13) int local13 = 128 - arg2;
		@Pc(27) int local27 = (arg1 & 0x7F) * arg2 + local13 * (arg0 & 0x7F) >> 7;
		@Pc(42) int local42 = (arg0 & 0x380) * local13 + (arg1 & 0x380) * arg2 >> 7;
		@Pc(56) int local56 = (arg0 & 0xFC00) * local13 + arg2 * (arg1 & 0xFC00) >> 7;
		return local27 & 0x7F | local42 & 0x380 | local56 & 0xFC00;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method6401(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static398.anInt2169 >= 100 && !Static130.aBoolean183 || Static398.anInt2169 >= 200) {
			Static61.method1338(Static91.aClass267_27.method6581(Static161.anInt3239));
			return;
		}
		@Pc(33) String local33 = method6404(arg0);
		if (local33 == null) {
			return;
		}
		@Pc(76) String local76;
		for (@Pc(38) int local38 = 0; local38 < Static398.anInt2169; local38++) {
			@Pc(46) String local46 = method6404(Static314.aStringArray32[local38]);
			if (local46 != null && local46.equals(local33)) {
				Static61.method1338(arg0 + aClass267_108.method6581(Static161.anInt3239));
				return;
			}
			if (Static185.aStringArray24[local38] != null) {
				local76 = method6404(Static185.aStringArray24[local38]);
				if (local76 != null && local76.equals(local33)) {
					Static61.method1338(arg0 + aClass267_108.method6581(Static161.anInt3239));
					return;
				}
			}
		}
		for (@Pc(106) int local106 = 0; local106 < Static125.anInt2592; local106++) {
			local76 = method6404(Static186.aStringArray25[local106]);
			if (local76 != null && local76.equals(local33)) {
				Static61.method1338(Static375.aClass267_90.method6581(Static161.anInt3239) + arg0 + Static12.aClass267_5.method6581(Static161.anInt3239));
				return;
			}
			if (Static85.aStringArray9[local106] != null) {
				@Pc(149) String local149 = method6404(Static85.aStringArray9[local106]);
				if (local149 != null && local149.equals(local33)) {
					Static61.method1338(Static375.aClass267_90.method6581(Static161.anInt3239) + arg0 + Static12.aClass267_5.method6581(Static161.anInt3239));
					return;
				}
			}
		}
		if (method6404(Static302.aClass3_Sub2_Sub1_Sub2_2.aString54).equals(local33)) {
			Static61.method1338(Static217.aClass267_57.method6581(Static161.anInt3239));
		} else {
			Static403.method5961(Static4.aClass92_153);
			Static109.aClass6_Sub1_Sub1_5.method6439(Static16.method471(arg0));
			Static109.aClass6_Sub1_Sub1_5.method6448(arg0);
		}
	}

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "(B)V")
	public static void method6402() {
		Static24.aClass44_2.method1348();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method6403(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Static403.method5961(Static121.aClass92_43);
		Static109.aClass6_Sub1_Sub1_5.method6439(Static16.method471(arg1) + 1);
		Static109.aClass6_Sub1_Sub1_5.method6481(arg0);
		Static109.aClass6_Sub1_Sub1_5.method6448(arg1);
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method6404(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static243.method3812(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local14 && Static243.method3812(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(48) int local48 = local14 - local11;
		if (local48 < 1 || local48 > 12) {
			return null;
		}
		@Pc(71) StringBuffer local71 = new StringBuffer(local48);
		for (@Pc(73) int local73 = local11; local73 < local14; local73++) {
			@Pc(79) char local79 = arg0.charAt(local73);
			if (Static332.method4837(local79)) {
				@Pc(87) char local87 = Static217.method3263(local79);
				if (local87 != '\u0000') {
					local71.append(local87);
				}
			}
		}
		if (local71.length() == 0) {
			return null;
		} else {
			return local71.toString();
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILjava/awt/Canvas;)Lclient!sr;")
	public static Class6_Sub7 method6405(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class6_Sub7_Sub1");
			@Pc(10) Class6_Sub7 local10 = (Class6_Sub7) local6.getDeclaredConstructor().newInstance();
			local10.method4874(arg0);
			return local10;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class6_Sub7_Sub2 local26 = new Class6_Sub7_Sub2();
			local26.method4874(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "(B)V")
	public static void method6406() {
		Static179.aClass74_19.method1888();
		Static79.aClass170_2.method4007();
		Static96.aClass170_6.method4007();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!eq;II)V")
	public static void method6408(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) int arg2) {
		Static418.aClass219ArrayArray1 = new Class219[arg2][arg0];
		Static47.aClass66_3 = arg1;
		if (Static322.anIntArray382 != null) {
			Static30.aClass82_1 = Static179.method2948(Static322.anIntArray382[1], Static322.anIntArray382[5], Static322.anIntArray382[0], Static322.anIntArray382[3], Static322.anIntArray382[4], Static322.anIntArray382[2]);
		}
		Static253.aClass219_4 = new Class219();
		Static267.method4084();
	}
}

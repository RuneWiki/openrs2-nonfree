import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "J")
	public static long aLong143;

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "Lclient!qia;")
	public static final Class276 aClass276_40 = new Class276();

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "[I")
	public static final int[] anIntArray357 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)Z")
	public static boolean method5114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)Z")
	public static boolean method5115(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)I")
	public static int method5116(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(20) int local20 = 0;
		@Pc(22) char local22 = 0;
		@Pc(24) char local24 = 0;
		while (local8 > local13 - local22 || local20 - local24 < local11) {
			if (local13 - local22 >= local8) {
				return -1;
			}
			if (local11 <= local20 - local24) {
				return 1;
			}
			@Pc(60) char local60;
			if (local22 == '\u0000') {
				local60 = arg2.charAt(local13++);
			} else {
				local60 = local22;
			}
			@Pc(76) char local76;
			if (local24 == '\u0000') {
				local76 = arg0.charAt(local20++);
			} else {
				local76 = local24;
			}
			local22 = Static473.method7008(local60);
			local24 = Static473.method7008(local76);
			local60 = Static231.method4412(arg1, local60);
			local76 = Static231.method4412(arg1, local76);
			if (local76 != local60 && Character.toUpperCase(local60) != Character.toUpperCase(local76)) {
				local60 = Character.toLowerCase(local60);
				local76 = Character.toLowerCase(local76);
				if (local76 != local60) {
					return Static627.method8496(arg1, local60) - Static627.method8496(arg1, local76);
				}
			}
		}
		@Pc(143) int local143 = Math.min(local8, local11);
		for (@Pc(145) int local145 = 0; local145 < local143; local145++) {
			if (arg1 == 2) {
				local13 = local8 - local145 - 1;
				local20 = local11 - local145 - 1;
			} else {
				local20 = local145;
				local13 = local145;
			}
			@Pc(174) char local174 = arg2.charAt(local13);
			@Pc(178) char local178 = arg0.charAt(local20);
			if (local174 != local178 && Character.toUpperCase(local174) != Character.toUpperCase(local178)) {
				local174 = Character.toLowerCase(local174);
				local178 = Character.toLowerCase(local178);
				if (local178 != local174) {
					return Static627.method8496(arg1, local174) - Static627.method8496(arg1, local178);
				}
			}
		}
		@Pc(223) int local223 = local8 - local11;
		if (local223 != 0) {
			return local223;
		}
		for (@Pc(232) int local232 = 0; local232 < local143; local232++) {
			@Pc(238) char local238 = arg2.charAt(local232);
			@Pc(242) char local242 = arg0.charAt(local232);
			if (local238 != local242) {
				return Static627.method8496(arg1, local238) - Static627.method8496(arg1, local242);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
	public static void method5117() {
		Static174.method3571();
		Static14.method8598();
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method5119(@OriginalArg(1) Class33 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static349.aBoolean590) {
			local7 = Static477.method7033();
			local9 = Static10.method114();
		}
		Static367.method5894(arg0, Static582.anInt9731, Static554.anInt9455, local7 + Static326.anInt6543, Static434.anInt7939 - -local9);
		Static16.aClass25_1.method5838(-10660793, -1, Static287.aClass176_24.method4986(Static380.anInt7247), local7 + Static326.anInt6543 + 3, Static434.anInt7939 - -local9 + 14);
		@Pc(61) int local61 = local7 + Static501.aClass59_5.method4107();
		@Pc(68) int local68 = Static501.aClass59_5.method4106() + local9;
		@Pc(72) int local72;
		@Pc(94) int local94;
		if (Static506.aBoolean755) {
			local72 = 0;
			for (@Pc(128) Class3_Sub1_Sub10 local128 = (Class3_Sub1_Sub10) Static379.aClass30_9.method780(); local128 != null; local128 = (Class3_Sub1_Sub10) Static379.aClass30_9.method783()) {
				local94 = local72 * 16 + local9 + Static434.anInt7939 + 31;
				local72++;
				if (local128.anInt5812 == 1) {
					Static257.method4823(local61, (Class3_Sub1_Sub4) local128.aClass30_7.aClass3_Sub1_7.aClass3_Sub1_66, Static554.anInt9455, local68, -256, local94, local7 + Static326.anInt6543, Static582.anInt9731, local9 + Static434.anInt7939, -1, arg0);
				} else {
					Static414.method6482(arg0, local128, -256, local94, local7 + Static326.anInt6543, Static554.anInt9455, local9 + Static434.anInt7939, local61, -1, Static582.anInt9731, local68);
				}
			}
			if (Static198.aClass3_Sub1_Sub10_1 != null) {
				Static367.method5894(arg0, Static468.anInt8459, Static609.anInt10063, Static285.anInt5876, Static280.anInt5854);
				local72 = 0;
				Static16.aClass25_1.method5838(-10660793, -1, Static198.aClass3_Sub1_Sub10_1.aString59, Static285.anInt5876 + 3, Static280.anInt5854 + 14);
				for (@Pc(228) Class3_Sub1_Sub4 local228 = (Class3_Sub1_Sub4) Static198.aClass3_Sub1_Sub10_1.aClass30_7.method780(); local228 != null; local228 = (Class3_Sub1_Sub4) Static198.aClass3_Sub1_Sub10_1.aClass30_7.method783()) {
					@Pc(238) int local238 = local72 * 16 + Static280.anInt5854 + 31;
					Static257.method4823(local61, local228, Static609.anInt10063, local68, -256, local238, Static285.anInt5876, Static468.anInt8459, Static280.anInt5854, -1, arg0);
					local72++;
				}
				Static466.method6964(Static609.anInt10063, Static285.anInt5876, Static280.anInt5854, Static468.anInt8459);
			}
		} else {
			local72 = 0;
			for (@Pc(77) Class3_Sub1_Sub4 local77 = (Class3_Sub1_Sub4) Static187.aClass276_28.method6907(); local77 != null; local77 = (Class3_Sub1_Sub4) Static187.aClass276_28.method6912()) {
				local94 = (Static443.anInt8026 - local72 - 1) * 16 + Static434.anInt7939 + local9 + 31;
				Static257.method4823(local61, local77, Static554.anInt9455, local68, -256, local94, local7 + Static326.anInt6543, Static582.anInt9731, local9 + Static434.anInt7939, -1, arg0);
				local72++;
			}
		}
		Static466.method6964(Static554.anInt9455, local7 + Static326.anInt6543, Static434.anInt7939 - -local9, Static582.anInt9731);
	}
}

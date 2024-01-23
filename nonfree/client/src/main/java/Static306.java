import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!wd", name = "qb", descriptor = "Z")
	public static boolean aBoolean400 = false;

	@OriginalMember(owner = "client!wd", name = "tb", descriptor = "Z")
	public static volatile boolean aBoolean401 = true;

	@OriginalMember(owner = "client!wd", name = "wb", descriptor = "Ljava/lang/String;")
	public static String aString354 = " is already on your friend list.";

	@OriginalMember(owner = "client!wd", name = "xb", descriptor = "Ljava/lang/String;")
	public static String aString355 = "level: ";

	@OriginalMember(owner = "client!wd", name = "yb", descriptor = "[I")
	public static int[] anIntArray656 = new int[32];

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)V")
	public static void method4747(@OriginalArg(1) boolean arg0) {
		@Pc(11) byte[][] local11;
		if (Static94.aBoolean138 && arg0) {
			local11 = Static11.aByteArrayArray3;
		} else {
			local11 = Static212.aByteArrayArray31;
		}
		@Pc(29) int local29 = Static24.aByteArrayArray4.length;
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			@Pc(42) byte[] local42 = local11[local31];
			if (local42 != null) {
				@Pc(55) int local55 = (Static278.anIntArray597[local31] >> 8) * 64 - Static220.anInt3983;
				@Pc(66) int local66 = (Static278.anIntArray597[local31] & 0xFF) * 64 - Static295.anInt5480;
				Static16.method763();
				Static37.method576(arg0, local42, local66, local55, Static296.aClass30Array1);
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I")
	public static int method4748(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg0.length();
		@Pc(20) char local20 = 0;
		@Pc(22) int local22 = 0;
		@Pc(24) char local24 = 0;
		while (local8 > local15 - local20 || local18 > local22 - local24) {
			if (local8 <= local15 - local20) {
				return -1;
			}
			if (local18 <= local22 - local24) {
				return 1;
			}
			@Pc(73) char local73;
			if (local20 == '\u0000') {
				local73 = arg2.charAt(local15++);
			} else {
				local73 = local20;
			}
			@Pc(83) char local83;
			if (local24 == '\u0000') {
				local83 = arg0.charAt(local22++);
			} else {
				local83 = local24;
			}
			local20 = Static249.method3956(local73);
			local24 = Static249.method3956(local83);
			local73 = Static33.method523(arg1, local73);
			local83 = Static33.method523(arg1, local83);
			if (local83 != local73 && Character.toUpperCase(local73) != Character.toUpperCase(local83)) {
				local73 = Character.toLowerCase(local73);
				local83 = Character.toLowerCase(local83);
				if (local83 != local73) {
					return Static181.method2941(arg1, local73) - Static181.method2941(arg1, local83);
				}
			}
		}
		@Pc(150) int local150 = Math.min(local8, local18);
		@Pc(188) char local188;
		@Pc(152) int local152;
		for (local152 = 0; local152 < local150; local152++) {
			if (arg1 == 2) {
				local22 = local18 - local152 - 1;
				local15 = local8 - local152 - 1;
			} else {
				local22 = local152;
				local15 = local152;
			}
			@Pc(184) char local184 = arg2.charAt(local15);
			local188 = arg0.charAt(local22);
			if (local184 != local188 && Character.toUpperCase(local184) != Character.toUpperCase(local188)) {
				local184 = Character.toLowerCase(local184);
				local188 = Character.toLowerCase(local188);
				if (local184 != local188) {
					return Static181.method2941(arg1, local184) - Static181.method2941(arg1, local188);
				}
			}
		}
		local152 = local8 - local18;
		if (local152 != 0) {
			return local152;
		}
		for (@Pc(240) int local240 = 0; local240 < local150; local240++) {
			local188 = arg2.charAt(local240);
			@Pc(251) char local251 = arg0.charAt(local240);
			if (local188 != local251) {
				return Static181.method2941(arg1, local188) - Static181.method2941(arg1, local251);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "(I)V")
	public static void method4750() {
		while (true) {
			@Pc(16) Class4_Sub30 local16 = (Class4_Sub30) Static221.aClass114_27.method2621();
			if (local16 == null) {
				return;
			}
			@Pc(42) Class53_Sub1 local42;
			@Pc(33) int local33;
			if (local16.anInt4993 < 0) {
				local33 = -local16.anInt4993 - 1;
				if (local33 == Static273.anInt2022) {
					local42 = Static154.aClass53_Sub1_Sub1_2;
				} else {
					local42 = Static182.aClass53_Sub1_Sub1Array1[local33];
				}
			} else {
				local33 = local16.anInt4993 - 1;
				local42 = Static110.aClass53_Sub1_Sub2Array1[local33];
			}
			if (local42 != null) {
				@Pc(69) Class184 local69 = Static6.method99(local16.anInt5005);
				if (Static281.anInt5335 < 3) {
				}
				@Pc(88) int local88;
				@Pc(85) int local85;
				if (local16.anInt5004 == 1 || local16.anInt5004 == 3) {
					local88 = local69.anInt5517;
					local85 = local69.anInt5528;
				} else {
					local85 = local69.anInt5517;
					local88 = local69.anInt5528;
				}
				@Pc(105) int local105 = local16.anInt5011 + (local88 + 1 >> 1);
				@Pc(112) int local112 = local16.anInt5011 + (local88 >> 1);
				@Pc(120) int local120 = local16.anInt4994 + (local85 >> 1);
				@Pc(130) int local130 = local16.anInt4994 + (local85 + 1 >> 1);
				@Pc(134) int[][] local134 = Static243.anIntArrayArrayArray13[Static281.anInt5335];
				@Pc(161) int local161 = local134[local105][local120] + local134[local112][local120] + local134[local112][local130] + local134[local105][local130] >> 2;
				@Pc(163) Class53 local163 = null;
				@Pc(168) int local168 = Static37.anIntArray52[local16.anInt4999];
				if (local168 == 0) {
					@Pc(234) Class182 local234 = Static162.method2624(Static281.anInt5335, local16.anInt5011, local16.anInt4994);
					if (local234 != null) {
						local163 = local234.aClass53_5;
					}
				} else if (local168 == 1) {
					@Pc(219) Class186 local219 = Static265.method4163(Static281.anInt5335, local16.anInt5011, local16.anInt4994);
					if (local219 != null) {
						local163 = local219.aClass53_10;
					}
				} else if (local168 == 2) {
					@Pc(205) Class33 local205 = Static193.method3075(Static281.anInt5335, local16.anInt5011, local16.anInt4994);
					if (local205 != null) {
						local163 = local205.aClass53_1;
					}
				} else if (local168 == 3) {
					@Pc(192) Class42 local192 = Static34.method527(Static281.anInt5335, local16.anInt5011, local16.anInt4994);
					if (local192 != null) {
						local163 = local192.aClass53_2;
					}
				}
				if (local163 != null) {
					Static61.method1011(-1, Static281.anInt5335, 0, local16.anInt5011, local16.anInt5000 + 1, local16.anInt4994, 0, local168, local16.anInt4998 + 1);
					local42.anInt4027 = local16.anInt4994 * 128 + local85 * 64;
					@Pc(274) int local274 = local16.anInt4995;
					@Pc(277) int local277 = local16.anInt4996;
					local42.anInt4032 = local16.anInt5011 * 128 + local88 * 64;
					local42.anInt3975 = local161;
					local42.anInt4042 = local16.anInt4998 + Static50.anInt954;
					@Pc(300) int local300 = local16.anInt5008;
					local42.anObject5 = local163;
					local42.anInt4010 = local16.anInt5000 + Static50.anInt954;
					@Pc(315) int local315;
					if (local300 < local277) {
						local315 = local277;
						local277 = local300;
						local300 = local315;
					}
					local42.anInt4041 = local16.anInt5011 + local300;
					local42.anInt4043 = local16.anInt5011 + local277;
					@Pc(335) int local335 = local16.anInt5009;
					if (local335 < local274) {
						local315 = local274;
						local274 = local335;
						local335 = local315;
					}
					local42.anInt4038 = local335 + local16.anInt4994;
					local42.anInt4018 = local274 + local16.anInt4994;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "(I)V")
	public static void method4751() {
		for (@Pc(6) Class4_Sub25 local6 = (Class4_Sub25) Static57.aClass114_7.method2623(); local6 != null; local6 = (Class4_Sub25) Static57.aClass114_7.method2629()) {
			if (local6.anInt4437 == -1) {
				local6.anInt4447 = 0;
				Static87.method4691(local6);
			} else {
				local6.method4854();
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method4752(@OriginalArg(1) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(23) String local23 = arg0[arg1];
			return local23 == null ? "null" : local23.toString();
		} else {
			@Pc(33) int local33 = 0;
			@Pc(37) int local37 = arg2 + arg1;
			for (@Pc(39) int local39 = arg1; local39 < local37; local39++) {
				@Pc(46) String local46 = arg0[local39];
				if (local46 == null) {
					local33 += 4;
				} else {
					local33 += local46.length();
				}
			}
			@Pc(65) StringBuffer local65 = new StringBuffer(local33);
			for (@Pc(67) int local67 = arg1; local67 < local37; local67++) {
				@Pc(78) String local78 = arg0[local67];
				if (local78 == null) {
					local65.append("null");
				} else {
					local65.append(local78);
				}
			}
			return local65.toString();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method4753(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) int local17 = Static197.aClass4_Sub3_Sub5_2.method2268(arg0, 250);
		@Pc(32) int local32 = Static197.aClass4_Sub3_Sub5_2.method2281(arg0, 250) * 13;
		if (Static94.aBoolean138) {
			Static104.method1702(6, 6, local17 + 4 + 4, local32 + 8, 0);
			Static104.method1691(6, 6, local17 + 4 + 4, local32 + 4 - -4, 16777215);
		} else {
			Static270.method4242(6, 6, local17 + 8, 4 + 4 + local32, 0);
			Static270.method4259(6, 6, local17 + 4 + 4, local32 + 8, 16777215);
		}
		Static197.aClass4_Sub3_Sub5_2.method2262(arg0, 10, 10, local17, local32, 16777215, -1, 1, 1, 0);
		Static4.method66(local17 + 4 + 4, 4 + 4 + local32, 6, 6);
		if (!arg1) {
			Static89.method1559(10, 10, local32, local17);
		} else if (Static94.aBoolean138) {
			Static94.method1622();
		} else {
			try {
				@Pc(169) Graphics local169 = Static188.aCanvas115.getGraphics();
				Static152.aClass59_1.method4275(local169);
			} catch (@Pc(177) Exception local177) {
				Static188.aCanvas115.repaint();
			}
		}
	}
}

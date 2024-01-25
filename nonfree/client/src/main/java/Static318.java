import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!ps", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[200];

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)V")
	public static void method4535() {
		@Pc(14) int local14 = (int) ((double) Static209.anInt4283 * 34.46D);
		local14 <<= 0x0;
		if (Static30.aClass106_3.method5907()) {
			local14 += 128;
		}
		Static30.aClass106_3.d(50, local14);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIII)Z")
	public static boolean method4536(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static110.aByteArrayArrayArray20[0][arg1][arg3] & 0x2) != 0) {
			return true;
		} else if ((Static110.aByteArrayArrayArray20[arg0][arg1][arg3] & 0x10) == 0) {
			return Static285.method4174(arg3, arg0, arg1) == arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILclient!ia;I)V")
	public static void method4537(@OriginalArg(1) Class1_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (Static119.aClass187_1 == null) {
			return;
		}
		try {
			Static119.aClass187_1.method4261(0L);
			Static119.aClass187_1.method4256(arg0.aByteArray14, 24, arg1);
		} catch (@Pc(26) Exception local26) {
		}
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(B)V")
	public static void method4539() {
		Static419.aClass203_49.method4553();
		for (@Pc(17) Class1_Sub35 local17 = (Class1_Sub35) Static401.aClass203_47.method4548(); local17 != null; local17 = (Class1_Sub35) Static401.aClass203_47.method4545()) {
			if (local17.anInt5839 < 1000) {
				local17.method6178();
				Static419.aClass203_49.method4551(local17);
			}
		}
		Static419.aClass203_49.method4558(Static401.aClass203_47);
		@Pc(45) int local45 = -1;
		@Pc(50) Class1_Sub25 local50 = (Class1_Sub25) Static341.aClass203_43.method4548();
		if (local50 != null) {
			local45 = local50.method3350();
		}
		if (!Static96.aBoolean151) {
			if (local45 == 0 && (Static363.anInt6672 == 1 && Static126.anInt2794 > 2 || Static331.method4676())) {
				local45 = 2;
			}
			if (local45 == 2 && Static126.anInt2794 > 0 && local50 != null) {
				if (Static404.aClass68_11 == null && Static209.anInt4285 == 0) {
					Static397.method5468(local50.method3349(), local50.method3347());
				} else {
					Static448.anInt7868 = 2;
				}
			}
			if (local45 == 0 && Static126.anInt2794 > 0) {
				Static98.method1700();
			}
			if (Static404.aClass68_11 == null && Static209.anInt4285 == 0) {
				Static448.anInt7868 = 0;
				Static306.aClass1_Sub35_2 = null;
				return;
			}
			return;
		}
		@Pc(126) int local126;
		@Pc(130) int local130;
		if (local45 == -1) {
			local126 = Static336.aClass87_1.method1919();
			local130 = Static336.aClass87_1.method1909();
			if (Static293.anInt4679 - 10 > local126 || Static232.anInt4578 + Static293.anInt4679 + 10 < local126 || Static32.anInt891 - 10 > local130 || Static32.anInt891 + Static316.anInt5908 + 10 < local130) {
				Static340.method4795();
			}
		}
		if (local45 != 0) {
			return;
		}
		local126 = Static293.anInt4679;
		local130 = Static32.anInt891;
		@Pc(177) int local177 = Static232.anInt4578;
		@Pc(181) int local181 = local50.method3349();
		@Pc(185) int local185 = local50.method3347();
		@Pc(187) int local187 = -1;
		@Pc(206) int local206;
		for (@Pc(189) int local189 = 0; local189 < Static126.anInt2794; local189++) {
			if (Static333.aBoolean386) {
				local206 = local130 + (-local189 + -1 + Static126.anInt2794) * 16 + 33;
				if (local181 > local126 && local177 + local126 > local181 && local206 - 13 < local185 && local206 + 4 > local185) {
					local187 = local189;
				}
			} else {
				local206 = (Static126.anInt2794 - local189 - 1) * 16 + local130 + 31;
				if (local181 > local126 && local181 < local126 + local177 && local185 > local206 - 13 && local206 + 3 > local185) {
					local187 = local189;
				}
			}
		}
		if (local187 != -1) {
			local206 = 0;
			@Pc(292) Class78 local292 = new Class78(Static401.aClass203_47);
			for (@Pc(297) Class1_Sub35 local297 = (Class1_Sub35) local292.method1753(); local297 != null; local297 = (Class1_Sub35) local292.method1751()) {
				if (local187 == local206) {
					Static78.method1447(local185, local297, local181);
				}
				local206++;
			}
		}
		Static340.method4795();
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
	public static String[] method4540(@OriginalArg(0) String[] arg0) {
		@Pc(13) String[] local13 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = local13[local15] + arg0[local15];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)V")
	public static void method4541() {
		Static32.method677(Static337.aClass177_87);
		Static433.aClass1_Sub3_Sub1_11.method1208(Static86.method1531());
		Static433.aClass1_Sub3_Sub1_11.method1227(Static152.anInt3234);
		Static433.aClass1_Sub3_Sub1_11.method1227(Static342.anInt6292);
		Static433.aClass1_Sub3_Sub1_11.method1208(Static12.aClass34_Sub1_1.anInt7161);
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(II)V")
	public static void method4542(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub1_Sub11 local16 = Static248.method3707(arg0, 8);
		local16.method2954();
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BLclient!za;Lclient!qs;)V")
	public static void method4543(@OriginalArg(1) Class106 arg0, @OriginalArg(2) Class211 arg1) {
		@Pc(8) Class266[] local8 = Static470.method6051(arg1, Static410.anInt7334);
		Static130.aClass137Array5 = new Class137[local8.length];
		for (@Pc(14) int local14 = 0; local14 < local8.length; local14++) {
			Static130.aClass137Array5[local14] = arg0.method5938(local8[local14]);
		}
		local8 = Static470.method6051(arg1, Static87.anInt2076);
		Static344.aClass137Array15 = new Class137[local8.length];
		for (@Pc(44) int local44 = 0; local44 < local8.length; local44++) {
			Static344.aClass137Array15[local44] = arg0.method5938(local8[local44]);
		}
		local8 = Static470.method6051(arg1, Static9.anInt3078);
		Static12.aClass137Array2 = new Class137[local8.length];
		for (@Pc(79) int local79 = 0; local79 < local8.length; local79++) {
			Static12.aClass137Array2[local79] = arg0.method5938(local8[local79]);
		}
		local8 = Static470.method6051(arg1, Static129.anInt2884);
		Static366.aClass137Array17 = new Class137[local8.length];
		for (@Pc(109) int local109 = 0; local109 < local8.length; local109++) {
			Static366.aClass137Array17[local109] = arg0.method5938(local8[local109]);
		}
		local8 = Static470.method6051(arg1, Static310.anInt5824);
		Static391.aClass137Array18 = new Class137[local8.length];
		for (@Pc(139) int local139 = 0; local139 < local8.length; local139++) {
			Static391.aClass137Array18[local139] = arg0.method5938(local8[local139]);
		}
		local8 = Static470.method6051(arg1, Static100.anInt2370);
		Static3.aClass137Array1 = new Class137[local8.length];
		for (@Pc(169) int local169 = 0; local169 < local8.length; local169++) {
			Static3.aClass137Array1[local169] = arg0.method5938(local8[local169]);
		}
		local8 = Static470.method6051(arg1, Static247.anInt4761);
		Static247.aClass137Array10 = new Class137[local8.length];
		for (@Pc(199) int local199 = 0; local199 < local8.length; local199++) {
			Static247.aClass137Array10[local199] = arg0.method5938(local8[local199]);
		}
		local8 = Static470.method6051(arg1, Static93.anInt6566);
		Static44.aClass137Array13 = new Class137[local8.length];
		for (@Pc(225) int local225 = 0; local225 < local8.length; local225++) {
			Static44.aClass137Array13[local225] = arg0.method5938(local8[local225]);
		}
		local8 = Static470.method6051(arg1, Static64.anInt1736);
		Static344.aClass137Array16 = new Class137[local8.length];
		for (@Pc(251) int local251 = 0; local251 < local8.length; local251++) {
			Static344.aClass137Array16[local251] = arg0.method5938(local8[local251]);
		}
		local8 = Static470.method6051(arg1, Static332.anInt6407);
		Static73.aClass137Array4 = new Class137[local8.length];
		for (@Pc(281) int local281 = 0; local281 < local8.length; local281++) {
			Static73.aClass137Array4[local281] = arg0.method5938(local8[local281]);
		}
		local8 = Static470.method6051(arg1, Static2.anInt45);
		Static276.aClass137Array12 = new Class137[local8.length];
		for (@Pc(311) int local311 = 0; local311 < local8.length; local311++) {
			Static276.aClass137Array12[local311] = arg0.method5938(local8[local311]);
		}
		local8 = Static470.method6051(arg1, Static97.anInt2327);
		Static184.aClass137Array8 = new Class137[local8.length];
		for (@Pc(341) int local341 = 0; local341 < local8.length; local341++) {
			Static184.aClass137Array8[local341] = arg0.method5938(local8[local341]);
		}
		Static235.aClass137_13 = arg0.method5938(Static470.method6054(arg1, Static279.anInt5476, 0));
		Static96.aClass137_3 = arg0.method5938(Static470.method6054(arg1, Static99.anInt2354, 0));
		local8 = Static470.method6051(arg1, Static230.anInt4558);
		Static339.aClass137Array14 = new Class137[local8.length];
		for (@Pc(383) int local383 = 0; local383 < local8.length; local383++) {
			Static339.aClass137Array14[local383] = arg0.method5938(local8[local383]);
		}
	}
}

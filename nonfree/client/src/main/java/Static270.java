import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!kea", name = "db", descriptor = "Lclient!xa;")
	public static Class66 aClass66_24;

	@OriginalMember(owner = "client!kea", name = "jb", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(BZ)V")
	public static void method4561(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static345.aClass6_Sub26_Sub2_1.method5007(Static462.anInt8534) >= 15) {
				@Pc(21) int local21 = Static345.aClass6_Sub26_Sub2_1.method5008(15);
				if (local21 != 32767) {
					@Pc(26) boolean local26 = false;
					@Pc(33) Class6_Sub33 local33 = (Class6_Sub33) Static506.aClass305_36.method7447((long) local21);
					@Pc(39) Class11_Sub1_Sub1_Sub1 local39;
					if (local33 == null) {
						local39 = new Class11_Sub1_Sub1_Sub1();
						local39.anInt7392 = local21;
						local33 = new Class6_Sub33(local39);
						Static506.aClass305_36.method7448((long) local21, local33);
						Static9.aClass6_Sub33Array1[Static452.anInt8286++] = local33;
						local26 = true;
					}
					local39 = local33.aClass11_Sub1_Sub1_Sub1_2;
					Static70.anIntArray111[Static208.anInt4409++] = local21;
					local39.anInt7354 = Static508.anInt8998;
					if (local39.aClass222_1 != null && local39.aClass222_1.method5321()) {
						Static548.method7833(local39);
					}
					@Pc(95) int local95;
					if (arg0) {
						local95 = Static345.aClass6_Sub26_Sub2_1.method5008(8);
						if (local95 > 127) {
							local95 -= 256;
						}
					} else {
						local95 = Static345.aClass6_Sub26_Sub2_1.method5008(5);
						if (local95 > 15) {
							local95 -= 32;
						}
					}
					@Pc(117) int local117 = Static345.aClass6_Sub26_Sub2_1.method5008(1);
					local39.method611(Static504.aClass343_2.method7994(Static345.aClass6_Sub26_Sub2_1.method5008(14)));
					@Pc(132) int local132 = Static345.aClass6_Sub26_Sub2_1.method5008(1);
					if (local132 == 1) {
						Static388.anIntArray510[Static561.anInt2408++] = local21;
					}
					@Pc(154) int local154 = Static345.aClass6_Sub26_Sub2_1.method5008(3) + 4 << 11 & 0x3E2B;
					@Pc(161) int local161;
					if (arg0) {
						local161 = Static345.aClass6_Sub26_Sub2_1.method5008(8);
						if (local161 > 127) {
							local161 -= 256;
						}
					} else {
						local161 = Static345.aClass6_Sub26_Sub2_1.method5008(5);
						if (local161 > 15) {
							local161 -= 32;
						}
					}
					@Pc(185) int local185 = Static345.aClass6_Sub26_Sub2_1.method5008(2);
					local39.method6220(local39.aClass222_1.anInt6248);
					local39.anInt7397 = local39.aClass222_1.anInt6247 << 3;
					if (local26) {
						local39.method6204(true, local154);
					}
					local39.method607(local185, local117 == 1, Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray526[0] + local161, local39.method6212(), local95 + Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray527[0]);
					if (local39.aClass222_1.method5321()) {
						Static503.method7509(0, local39.anIntArray527[0], null, local39.anIntArray526[0], local39.aByte77, null, local39);
					}
					continue;
				}
			}
			Static345.aClass6_Sub26_Sub2_1.method5006();
			return;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4562(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(30) String local30;
		if (Static241.anInt4921 >= 200 && !Static175.aBoolean325 || Static241.anInt4921 >= 200) {
			Static99.method2135(Static222.aClass152_9.method4002(Static286.anInt5468));
			local30 = Static222.aClass152_10.method4002(Static286.anInt5468);
			if (local30 != null) {
				Static99.method2135(local30);
			}
			return;
		}
		local30 = Static495.method7439(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(89) String local89;
		for (@Pc(50) int local50 = 0; local50 < Static241.anInt4921; local50++) {
			@Pc(58) String local58 = Static495.method7439(Static381.aStringArray42[local50]);
			if (local58 != null && local58.equals(local30)) {
				Static99.method2135(arg0 + Static222.aClass152_83.method4002(Static286.anInt5468));
				return;
			}
			if (Static87.aStringArray9[local50] != null) {
				local89 = Static495.method7439(Static87.aStringArray9[local50]);
				if (local89 != null && local89.equals(local30)) {
					Static99.method2135(arg0 + Static222.aClass152_83.method4002(Static286.anInt5468));
					return;
				}
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static104.anInt7872; local116++) {
			local89 = Static495.method7439(Static60.aStringArray7[local116]);
			if (local89 != null && local89.equals(local30)) {
				Static99.method2135(Static222.aClass152_88.method4002(Static286.anInt5468) + arg0 + Static222.aClass152_89.method4002(Static286.anInt5468));
				return;
			}
			if (Static437.aStringArray46[local116] != null) {
				@Pc(160) String local160 = Static495.method7439(Static437.aStringArray46[local116]);
				if (local160 != null && local160.equals(local30)) {
					Static99.method2135(Static222.aClass152_88.method4002(Static286.anInt5468) + arg0 + Static222.aClass152_89.method4002(Static286.anInt5468));
					return;
				}
			}
		}
		if (Static495.method7439(Static350.aClass11_Sub1_Sub1_Sub2_4.aString95).equals(local30)) {
			Static99.method2135(Static222.aClass152_86.method4002(Static286.anInt5468));
		} else {
			Static298.method4854(Static88.aClass181_22);
			Static547.aClass6_Sub26_Sub2_2.method4950(Static392.method6180(arg0), -81849);
			Static547.aClass6_Sub26_Sub2_2.method4998(arg0);
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IZI)V")
	public static void method4563(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 0) {
			Static323.aClass9_8 = Static359.method5440(Static107.aClass168_27, Static104.aClass6_Sub6_Sub1_4.anInt1166 * 2, Static38.aCanvas4, Static517.anInterface2_13, 0);
		} else {
			if (arg1) {
				Static323.aClass9_8 = Static359.method5440(Static107.aClass168_27, 0, Static38.aCanvas4, Static517.anInterface2_13, 0);
				Static323.aClass9_8.D(0);
				@Pc(35) Class82 local35 = Static436.method6660(Static29.aClass168_15, Static523.anInt9090);
				@Pc(44) Class73 local44 = Static323.aClass9_8.method5393(local35, Static583.method50(Static132.aClass168_118, Static523.anInt9090));
				Static526.method7658(Static222.aClass152_11.method4002(Static286.anInt5468), true, local44);
				Static195.method3709();
				Static323.aClass9_8.method5390();
			}
			try {
				Static323.aClass9_8 = Static359.method5440(Static107.aClass168_27, Static104.aClass6_Sub6_Sub1_4.anInt1166 * 2, Static38.aCanvas4, Static517.anInterface2_13, arg0);
				if (Static323.aClass9_8.method5431()) {
					@Pc(73) boolean local73 = true;
					try {
						local73 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(83) Throwable local83) {
					}
					@Pc(89) Class6_Sub25 local89;
					if (local73) {
						local89 = Static323.aClass9_8.method5421(146800640);
					} else {
						local89 = Static323.aClass9_8.method5421(104857600);
					}
					Static323.aClass9_8.method5451(local89);
				}
			} catch (@Pc(100) Throwable local100) {
				arg0 = 0;
				Static323.aClass9_8 = Static359.method5440(Static107.aClass168_27, 0, Static38.aCanvas4, Static517.anInterface2_13, 0);
			}
		}
		Static5.anInt145 = arg0;
		Static517.method7579();
		if (!Static323.aClass9_8.method5395()) {
			Static43.anInt1257 = 1;
		}
		Static323.aClass9_8.method5394(Static43.anInt1257);
		Static323.aClass9_8.method5459(0);
		Static323.aClass9_8.JA(32);
		Static19.aClass8_2 = Static323.aClass9_8.method5446();
		Static308.aClass8_7 = Static323.aClass9_8.method5446();
		Static456.method7064();
		Static323.aClass9_8.method5432(!Static104.aClass6_Sub6_Sub1_4.aBoolean136);
		if (Static323.aClass9_8.method5439()) {
			Static115.method2333(Static104.aClass6_Sub6_Sub1_4.aBoolean126);
		}
		Static480.method7895(Static44.anInt1275 >> 3, Static228.anInt4746 >> 3, Static323.aClass9_8);
		Static200.method3771();
		Static452.aBoolean606 = true;
		Static54.aBoolean151 = false;
		Static116.aClass34Array1 = null;
	}
}

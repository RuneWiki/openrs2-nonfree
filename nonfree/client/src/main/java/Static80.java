import java.awt.Container;
import java.awt.Insets;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V")
	public static void method1226() {
		for (@Pc(7) int local7 = 0; local7 < Static276.anInt4784; local7++) {
			@Pc(13) Class67 local13 = Static537.aClass67Array1[local7];
			if (local13.aByte17 == 3) {
				if (local13.aClass2_Sub3_Sub3_1 == null) {
					local13.anInt1395 = Integer.MIN_VALUE;
				} else {
					Static246.aClass2_Sub3_Sub4_2.method6705(local13.aClass2_Sub3_Sub3_1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(B)V")
	public static void method1227() {
		if (Static142.anIntArray365 != null) {
			return;
		}
		Static142.anIntArray365 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(39) double local39 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(50) double local50 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(57) double local57 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(59) double local59 = local57;
			@Pc(61) double local61 = local57;
			@Pc(63) double local63 = local57;
			if (local50 != 0.0D) {
				@Pc(79) double local79;
				if (local57 < 0.5D) {
					local79 = (local50 + 1.0D) * local57;
				} else {
					local79 = local50 + local57 - local50 * local57;
				}
				@Pc(94) double local94 = local57 * 2.0D - local79;
				@Pc(98) double local98 = local39 + 0.3333333333333333D;
				if (local98 > 1.0D) {
					local98--;
				}
				@Pc(112) double local112 = local39 - 0.3333333333333333D;
				if (local112 < 0.0D) {
					local112++;
				}
				if (local39 * 6.0D < 1.0D) {
					local61 = local39 * 6.0D * (local79 - local94) + local94;
				} else if (local39 * 2.0D < 1.0D) {
					local61 = local79;
				} else if (local39 * 3.0D < 2.0D) {
					local61 = (local79 - local94) * (-local39 + 0.6666666666666666D) * 6.0D + local94;
				} else {
					local61 = local94;
				}
				if (local98 * 6.0D < 1.0D) {
					local59 = local94 + local98 * (local79 - local94) * 6.0D;
				} else if (local98 * 2.0D < 1.0D) {
					local59 = local79;
				} else if (local98 * 3.0D < 2.0D) {
					local59 = local94 + (local79 - local94) * 6.0D * (0.6666666666666666D - local98);
				} else {
					local59 = local94;
				}
				if (local112 * 6.0D < 1.0D) {
					local63 = local94 + (local79 - local94) * 6.0D * local112;
				} else if (local112 * 2.0D < 1.0D) {
					local63 = local79;
				} else if (local112 * 3.0D < 2.0D) {
					local63 = (0.6666666666666666D - local112) * 6.0D * (local79 - local94) + local94;
				} else {
					local63 = local94;
				}
			}
			local59 = Math.pow(local59, local19);
			local61 = Math.pow(local61, local19);
			local63 = Math.pow(local63, local19);
			@Pc(291) int local291 = (int) (local59 * 256.0D);
			@Pc(296) int local296 = (int) (local61 * 256.0D);
			@Pc(301) int local301 = (int) (local63 * 256.0D);
			@Pc(311) int local311 = (local296 << 8) + (local291 << 16) + local301;
			Static142.anIntArray365[local26] = local311;
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIBIIZ)V")
	public static void method1228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static43.aFrame1 != null && (arg1 != 3 || Static257.aClass2_Sub35_Sub1_1.anInt7511 != arg3 || arg0 != Static257.aClass2_Sub35_Sub1_1.anInt7502)) {
			Static572.method7446(Static43.aFrame1, Static169.aClass99_2);
			Static43.aFrame1 = null;
		}
		if (arg1 == 3 && Static43.aFrame1 == null) {
			Static43.aFrame1 = Static17.method4062(Static169.aClass99_2, arg3, 0, arg0);
			if (Static43.aFrame1 != null) {
				Static257.aClass2_Sub35_Sub1_1.anInt7511 = arg3;
				Static257.aClass2_Sub35_Sub1_1.anInt7502 = arg0;
				Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
			}
		}
		if (arg1 == 3 && Static43.aFrame1 == null) {
			method1228(-1, Static257.aClass2_Sub35_Sub1_1.anInt7491, arg2, -1, true);
			return;
		}
		@Pc(75) Container local75;
		@Pc(100) Insets local100;
		if (Static43.aFrame1 != null) {
			Static441.anInt7086 = arg3;
			Static222.anInt3250 = arg0;
			local75 = Static43.aFrame1;
		} else if (Static223.aFrame2 == null) {
			if (Static195.anApplet4 == null) {
				local75 = Static414.anApplet_Sub1_1;
			} else {
				local75 = Static195.anApplet4;
			}
			Static441.anInt7086 = local75.getSize().width;
			Static222.anInt3250 = local75.getSize().height;
		} else {
			local100 = Static223.aFrame2.getInsets();
			@Pc(108) int local108 = local100.right + local100.left;
			Static441.anInt7086 = Static223.aFrame2.getSize().width - local108;
			Static222.anInt3250 = Static223.aFrame2.getSize().height - local100.bottom - local100.top;
			local75 = Static223.aFrame2;
		}
		if (arg1 == 1) {
			Static172.anInt2621 = Static14.anInt330;
			Static107.anInt1866 = 0;
			Static187.anInt8962 = Static370.anInt6187;
			Static8.anInt227 = (Static441.anInt7086 - Static14.anInt330) / 2;
		} else {
			Static544.method7111();
		}
		if (Static416.aClass232_7 != Static340.aClass232_14) {
			@Pc(158) boolean local158;
			if (Static172.anInt2621 < 1024 && Static187.anInt8962 < 768) {
				local158 = true;
			} else {
				local158 = false;
			}
		}
		if (arg4) {
			Static42.method723();
		} else {
			Static9.aCanvas1.setSize(Static172.anInt2621, Static187.anInt8962);
			Static417.aClass162_17.method6831(Static9.aCanvas1);
			if (local75 == Static223.aFrame2) {
				local100 = Static223.aFrame2.getInsets();
				Static9.aCanvas1.setLocation(local100.left + Static8.anInt227, Static107.anInt1866 + local100.top);
			} else {
				Static9.aCanvas1.setLocation(Static8.anInt227, Static107.anInt1866);
			}
		}
		if (arg1 < 2) {
			Static160.aBoolean177 = false;
		} else {
			Static160.aBoolean177 = true;
		}
		if (Static122.anInt2094 != -1) {
			Static579.method7524(true);
		}
		if (Static529.aClass124_2 != null && Static578.method7492(Static540.anInt8912)) {
			Static499.method6471();
		}
		for (@Pc(223) int local223 = 0; local223 < 100; local223++) {
			Static255.aBooleanArray17[local223] = true;
		}
		Static199.aBoolean208 = true;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IJII)V")
	public static void method1229(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		@Pc(14) int local14 = (int) arg1 >> 14 & 0x1F;
		@Pc(21) int local21 = (int) arg1 >> 20 & 0x3;
		@Pc(28) int local28 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
		if (local14 != 10 && local14 != 11 && local14 != 22) {
			Static425.method5884(0, local14, 0, arg0, 0, true, local21, arg2);
			return;
		}
		@Pc(44) Class216 local44 = Static362.aClass290_2.method5799(local28);
		@Pc(60) int local60;
		@Pc(57) int local57;
		if (local21 == 0 || local21 == 2) {
			local60 = local44.anInt5287;
			local57 = local44.anInt5244;
		} else {
			local57 = local44.anInt5287;
			local60 = local44.anInt5244;
		}
		@Pc(71) int local71 = local44.anInt5267;
		if (local21 != 0) {
			local71 = (local71 << local21 & 0xF) + (local71 >> 4 - local21);
		}
		Static425.method5884(local71, 0, local57, arg0, local60, true, 0, arg2);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	public static boolean method1230(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (Static169.aClass99_2.aBoolean151) {
			Static489.aClass292_5 = new Class292();
			Static489.aClass292_5.aString111 = arg0;
			Static489.aClass292_5.anInt7261 = arg1;
			if (Static340.aClass232_14 != Static416.aClass232_7) {
				Static489.aClass292_5.anInt7263 = Static489.aClass292_5.anInt7261 + 40000;
				Static489.aClass292_5.anInt7264 = Static489.aClass292_5.anInt7261 + 50000;
			}
			if (arg1 < Static495.aClass86_Sub1Array2.length && Static495.aClass86_Sub1Array2[arg1] != null) {
				Static139.anInt2264 = Static495.aClass86_Sub1Array2[arg1].anInt1984;
			}
			return true;
		}
		@Pc(58) String local58 = "";
		if (Static340.aClass232_14 != Static416.aClass232_7) {
			local58 = ":" + (arg1 + 7000);
		}
		@Pc(73) String local73 = "";
		if (Static523.aString125 != null) {
			local73 = "/p=" + Static523.aString125;
		}
		@Pc(121) String local121 = "http://" + arg0 + local58 + "/l=" + Static261.anInt4297 + "/a=" + Static516.anInt8248 + local73 + "/j" + (Static341.aBoolean467 ? "1" : "0") + ",o" + (Static550.aBoolean537 ? "1" : "0") + ",a2";
		try {
			Static474.aClient1.getAppletContext().showDocument(new URL(local121), "_self");
			return true;
		} catch (@Pc(131) Exception local131) {
			return false;
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
	public static void method1231(@OriginalArg(0) int arg0) {
		Static143.anInt7437 = arg0;
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)V")
	public static void method1232() {
		@Pc(12) byte[] local12;
		if (Static460.anObject18 == null) {
			@Pc(5) Class10_Sub2_Sub2 local5 = new Class10_Sub2_Sub2();
			local12 = local5.method7706();
			Static460.anObject18 = Static144.method1989(local12);
		}
		if (Static489.anObject19 == null) {
			@Pc(30) Class10_Sub1_Sub2 local30 = new Class10_Sub1_Sub2();
			local12 = local30.method1372();
			Static489.anObject19 = Static144.method1989(local12);
		}
	}
}

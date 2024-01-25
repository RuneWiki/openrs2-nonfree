import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "Lclient!am;")
	public static Class9 aClass9_5;

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "Lclient!wt;")
	public static Class271 aClass271_4;

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "Lclient!l;")
	public static Class143 aClass143_10;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_33 = new Class7("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "Lclient!qu;")
	public static final Class204 aClass204_7 = new Class204(10, 2, 2, 0);

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "[I")
	public static final int[] anIntArray93 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IBLclient!ah;)V")
	public static void method1256(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub5_Sub1 arg1) {
		@Pc(15) boolean local15 = arg1.method316(1) == 1;
		if (local15) {
			Static260.anIntArray404[Static194.anInt3474++] = arg0;
		}
		@Pc(30) int local30 = arg1.method316(2);
		@Pc(34) Class31_Sub2_Sub1_Sub1 local34 = Static458.aClass31_Sub2_Sub1_Sub1Array1[arg0];
		if (local30 != 0) {
			@Pc(149) int local149;
			@Pc(154) int local154;
			@Pc(159) int local159;
			if (local30 == 1) {
				local149 = arg1.method316(3);
				local154 = local34.anIntArray658[0];
				local159 = local34.anIntArray657[0];
				if (local149 == 0) {
					local159--;
					local154--;
				} else if (local149 == 1) {
					local159--;
				} else if (local149 == 2) {
					local154++;
					local159--;
				} else if (local149 == 3) {
					local154--;
				} else if (local149 == 4) {
					local154++;
				} else if (local149 == 5) {
					local154--;
					local159++;
				} else if (local149 == 6) {
					local159++;
				} else if (local149 == 7) {
					local154++;
					local159++;
				}
				if (local15) {
					local34.anInt1306 = local159;
					local34.anInt1295 = local154;
					local34.aBoolean72 = true;
				} else {
					local34.method1189(local159, Static144.aByteArray49[arg0], local154);
				}
			} else if (local30 == 2) {
				local149 = arg1.method316(4);
				local154 = local34.anIntArray658[0];
				local159 = local34.anIntArray657[0];
				if (local149 == 0) {
					local154 -= 2;
					local159 -= 2;
				} else if (local149 == 1) {
					local159 -= 2;
					local154--;
				} else if (local149 == 2) {
					local159 -= 2;
				} else if (local149 == 3) {
					local154++;
					local159 -= 2;
				} else if (local149 == 4) {
					local154 += 2;
					local159 -= 2;
				} else if (local149 == 5) {
					local159--;
					local154 -= 2;
				} else if (local149 == 6) {
					local154 += 2;
					local159--;
				} else if (local149 == 7) {
					local154 -= 2;
				} else if (local149 == 8) {
					local154 += 2;
				} else if (local149 == 9) {
					local159++;
					local154 -= 2;
				} else if (local149 == 10) {
					local159++;
					local154 += 2;
				} else if (local149 == 11) {
					local159 += 2;
					local154 -= 2;
				} else if (local149 == 12) {
					local154--;
					local159 += 2;
				} else if (local149 == 13) {
					local159 += 2;
				} else if (local149 == 14) {
					local154++;
					local159 += 2;
				} else if (local149 == 15) {
					local154 += 2;
					local159 += 2;
				}
				if (local15) {
					local34.aBoolean72 = true;
					local34.anInt1295 = local154;
					local34.anInt1306 = local159;
				} else {
					local34.method1189(local159, Static144.aByteArray49[arg0], local154);
				}
			} else {
				local149 = arg1.method316(1);
				@Pc(431) int local431;
				@Pc(439) int local439;
				@Pc(450) int local450;
				@Pc(457) int local457;
				if (local149 == 0) {
					local154 = arg1.method316(12);
					local159 = local154 >> 10;
					local431 = local154 >> 5 & 0x1F;
					if (local431 > 15) {
						local431 -= 32;
					}
					local439 = local154 & 0x1F;
					if (local439 > 15) {
						local439 -= 32;
					}
					local450 = local431 + local34.anIntArray658[0];
					local457 = local439 + local34.anIntArray657[0];
					if (local15) {
						local34.anInt1295 = local450;
						local34.aBoolean72 = true;
						local34.anInt1306 = local457;
					} else {
						local34.method1189(local457, Static144.aByteArray49[arg0], local450);
					}
					local34.aByte100 = (byte) (local34.aByte100 + local159 & 0x3);
					if (Static102.anInt2165 == arg0) {
						Static357.anInt5881 = local34.aByte100;
					}
				} else {
					local154 = arg1.method316(30);
					local159 = local154 >> 28;
					local431 = local154 >> 14 & 0x3FFF;
					local439 = local154 & 0x3FFF;
					local450 = (Static165.anInt3049 + local34.anIntArray658[0] + local431 & 0x3FFF) - Static165.anInt3049;
					local457 = (local439 + Static345.anInt5799 + local34.anIntArray657[0] & 0x3FFF) - Static345.anInt5799;
					if (local15) {
						local34.anInt1295 = local450;
						local34.anInt1306 = local457;
						local34.aBoolean72 = true;
					} else {
						local34.method1189(local457, Static144.aByteArray49[arg0], local450);
					}
					local34.aByte100 = (byte) (local159 + local34.aByte100 & 0x3);
					if (arg0 == Static102.anInt2165) {
						Static357.anInt5881 = local34.aByte100;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean72 = false;
		} else if (Static102.anInt2165 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(65) Class59 local65 = Static358.aClass59Array1[arg0] = new Class59();
			local65.anInt1879 = (local34.anIntArray657[0] + Static345.anInt5799 >> 6) + (local34.aByte100 << 28) + (Static165.anInt3049 + local34.anIntArray658[0] >> 6 << 14);
			if (local34.anInt1293 == -1) {
				local65.anInt1876 = local34.aClass98_7.method2351();
			} else {
				local65.anInt1876 = local34.anInt1293;
			}
			local65.anInt1878 = local34.anInt7372;
			local65.aBoolean114 = local34.aBoolean70;
			if (local34.anInt1291 > 0) {
				Static87.method1623(local34);
			}
			Static458.aClass31_Sub2_Sub1_Sub1Array1[arg0] = null;
			if (arg1.method316(1) != 0) {
				Static364.method4980(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Z")
	public static boolean method1257() {
		try {
			return Static172.method2758();
		} catch (@Pc(14) IOException local14) {
			Static276.method4032();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static269.aClass107_139 == null ? -1 : Static269.aClass107_139.method2508()) + "," + (Static152.aClass107_95 == null ? -1 : Static152.aClass107_95.method2508()) + "," + (Static255.aClass107_135 == null ? -1 : Static255.aClass107_135.method2508()) + " - " + Static167.anInt3076 + "," + (Static452.aClass31_Sub2_Sub1_Sub1_2.anIntArray658[0] + Static165.anInt3049) + "," + (Static452.aClass31_Sub2_Sub1_Sub1_2.anIntArray657[0] + Static345.anInt5799) + " - ";
			for (@Pc(79) int local79 = 0; Static167.anInt3076 > local79 && local79 < 50; local79++) {
				local77 = local77 + Static206.aClass1_Sub5_Sub1_2.aByteArray89[local79] + ",";
			}
			Static158.method2570(local19, local77);
			Static225.method3455(false);
			return true;
		}
	}
}

import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "[I")
	public static int[] anIntArray57;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
	public static int anInt437;

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "[Lclient!rn;")
	public static Class150[] aClass150Array1;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIC)I")
	public static int method421(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		@Pc(15) int local15 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local15 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local15 = 1762;
		}
		return local15;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIBII)I")
	public static int method422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static97.aBoolean288) {
			arg0 = 1000000;
			Static97.aBoolean288 = false;
		}
		@Pc(22) Class54 local22 = Static41.aClass54ArrayArray1[arg3][arg2];
		@Pc(25) int local25 = local22.anInt1712;
		@Pc(35) float local35 = local22.aFloat47 * ((float) arg1 * 0.1F + 0.7F);
		@Pc(38) float local38 = local22.aFloat43;
		@Pc(41) float local41 = local22.aFloat46;
		@Pc(44) Class4_Sub2_Sub11 local44 = local22.aClass4_Sub2_Sub11_2;
		@Pc(47) float local47 = local22.aFloat44;
		@Pc(50) int local50 = local22.anInt1713;
		@Pc(53) int local53 = local22.anInt1717;
		@Pc(56) float local56 = local22.aFloat48;
		@Pc(59) float local59 = local22.aFloat45;
		if (!Static50.aBoolean66) {
			local50 = 0;
		}
		if (Static109.anInt2180 != local25 || local35 != Static216.aFloat122 || local41 != Static177.aFloat107 || local38 != Static173.aFloat103 || local53 != Static248.anInt4868 || Static22.anInt477 != local50 || Static78.aClass4_Sub2_Sub11_1 != local44 || local59 != Static86.aFloat50 || local56 != Static72.aFloat37 || Static280.aFloat158 != local47) {
			Static106.aFloat65 = Static52.aFloat31;
			Static260.aFloat171 = Static39.aFloat23;
			Static137.anInt2704 = Static27.anInt596;
			Static3.anInt18 = Static52.anInt1183;
			Static98.aFloat57 = Static204.aFloat117;
			Static97.aClass4_Sub2_Sub11_10 = Static170.aClass4_Sub2_Sub11_9;
			Static269.aFloat150 = Static272.aFloat154;
			Static16.aFloat11 = Static303.aFloat169;
			Static17.anInt394 = Static84.anInt1719;
			Static274.aFloat155 = Static146.aFloat87;
			if (Static207.aClass4_Sub2_Sub11_7 == null || Static97.aClass4_Sub2_Sub11_10 == Static207.aClass4_Sub2_Sub11_7) {
				Static207.aClass4_Sub2_Sub11_7 = new Class4_Sub2_Sub11();
			}
			Static177.aFloat107 = local41;
			Static72.aFloat37 = local56;
			Static78.aClass4_Sub2_Sub11_1 = local44;
			Static155.anInt3217 = 0;
			Static216.aFloat122 = local35;
			Static22.anInt477 = local50;
			Static86.aFloat50 = local59;
			Static280.aFloat158 = local47;
			Static173.aFloat103 = local38;
			Static248.anInt4868 = local53;
			Static109.anInt2180 = local25;
		}
		if (Static155.anInt3217 < 65536) {
			Static155.anInt3217 += arg0 * 250;
			if (Static155.anInt3217 >= 65536) {
				Static52.anInt1183 = Static248.anInt4868;
				Static97.aClass4_Sub2_Sub11_10 = null;
				Static27.anInt596 = Static109.anInt2180;
				Static204.aFloat117 = Static280.aFloat158;
				Static303.aFloat169 = Static86.aFloat50;
				Static52.aFloat31 = Static173.aFloat103;
				Static146.aFloat87 = Static72.aFloat37;
				Static84.anInt1719 = Static22.anInt477;
				Static272.aFloat154 = Static216.aFloat122;
				Static155.anInt3217 = 65536;
				Static39.aFloat23 = Static177.aFloat107;
				Static170.aClass4_Sub2_Sub11_9 = Static78.aClass4_Sub2_Sub11_1;
			} else {
				@Pc(195) int local195 = Static155.anInt3217 >> 8;
				@Pc(203) float local203 = (float) (65536 - Static155.anInt3217) / 65536.0F;
				@Pc(210) int local210 = 65536 - Static155.anInt3217 >> 8;
				@Pc(215) float local215 = (float) Static155.anInt3217 / 65536.0F;
				Static204.aFloat117 = Static98.aFloat57 * local203 + local215 * Static280.aFloat158;
				Static84.anInt1719 = Static17.anInt394 * local210 + local195 * Static22.anInt477 >> 8;
				Static52.aFloat31 = local203 * Static106.aFloat65 + Static173.aFloat103 * local215;
				Static272.aFloat154 = Static216.aFloat122 * local215 + Static269.aFloat150 * local203;
				Static146.aFloat87 = Static274.aFloat155 * local203 + Static72.aFloat37 * local215;
				Static27.anInt596 = (local195 * (Static109.anInt2180 & 0xFF00) + local210 * (Static137.anInt2704 & 0xFF00) & 0xFF0000) + ((Static109.anInt2180 & 0xFF00FF) * local195 + (Static137.anInt2704 & 0xFF00FF) * local210 & 0xFF00FF00) >> 8;
				Static39.aFloat23 = local215 * Static177.aFloat107 + local203 * Static260.aFloat171;
				Static52.anInt1183 = ((Static248.anInt4868 & 0xFF00) * local195 + (Static3.anInt18 & 0xFF00) * local210 & 0xFF0000) + ((Static3.anInt18 & 0xFF00FF) * local210 + ((Static248.anInt4868 & 0xFF00FF) * local195) & 0xFF00FF00) >> 8;
				Static303.aFloat169 = local215 * Static86.aFloat50 + local203 * Static16.aFloat11;
				if (Static78.aClass4_Sub2_Sub11_1 != Static97.aClass4_Sub2_Sub11_10) {
					if (Static97.aClass4_Sub2_Sub11_10 == null || Static78.aClass4_Sub2_Sub11_1 == null) {
						Static170.aClass4_Sub2_Sub11_9 = null;
					} else {
						Static170.aClass4_Sub2_Sub11_9 = Static207.aClass4_Sub2_Sub11_7.method2092(Static97.aClass4_Sub2_Sub11_10, Static78.aClass4_Sub2_Sub11_1, (float) Static155.anInt3217 / 65536.0F);
					}
				}
			}
		}
		return Static52.anInt1183;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)Lclient!hk;")
	public static Class67 method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub21 local7 = Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null || local7.aClass67_1 == null ? null : local7.aClass67_1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method425(@OriginalArg(1) String arg0) {
		@Pc(17) String local17 = Static114.method1915(Static193.method3171(arg0));
		if (local17 == null) {
			local17 = "";
		}
		return local17;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
	public static void method426() {
		@Pc(9) Container local9;
		if (Static250.aFrame2 != null) {
			local9 = Static250.aFrame2;
		} else if (Static32.aFrame1 == null) {
			local9 = Static95.aClass184_3.anApplet1;
		} else {
			local9 = Static32.aFrame1;
		}
		Static162.anInt3312 = local9.getSize().width;
		Static242.anInt4775 = local9.getSize().height;
		@Pc(36) Insets local36;
		if (local9 == Static32.aFrame1) {
			local36 = Static32.aFrame1.getInsets();
			Static242.anInt4775 -= local36.bottom + local36.top;
			Static162.anInt3312 -= local36.left + local36.right;
		}
		if (Static284.method4440() < 2) {
			Static189.anInt5672 = 765;
			Static303.anInt5768 = 0;
			Static268.anInt5346 = (Static162.anInt3312 - 765) / 2;
			Static292.anInt5674 = 503;
		} else {
			Static189.anInt5672 = Static162.anInt3312;
			Static268.anInt5346 = 0;
			Static303.anInt5768 = 0;
			Static292.anInt5674 = Static242.anInt4775;
		}
		if (Static251.aBoolean330) {
			Static251.method3857(Static189.anInt5672, Static292.anInt5674);
		}
		Static139.aCanvas1.setSize(Static189.anInt5672, Static292.anInt5674);
		if (Static32.aFrame1 == local9) {
			local36 = Static32.aFrame1.getInsets();
			Static139.aCanvas1.setLocation(local36.left + Static268.anInt5346, local36.top + Static303.anInt5768);
		} else {
			Static139.aCanvas1.setLocation(Static268.anInt5346, Static303.anInt5768);
		}
		if (Static56.anInt1264 != -1) {
			Static143.method2292(true);
		}
		Static20.method2333();
	}
}

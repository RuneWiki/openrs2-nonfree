import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!sfa", name = "r", descriptor = "I")
	public static int anInt8920 = 0;

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Ljava/lang/String;ZII)I")
	public static int method7308(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(40) char local40 = arg0.charAt(local35);
			if (local35 == 0) {
				if (local40 == '-') {
					local26 = true;
					continue;
				}
				if (local40 == '+') {
					continue;
				}
			}
			@Pc(69) int local69;
			if (local40 >= '0' && local40 <= '9') {
				local69 = local40 - '0';
			} else if (local40 >= 'A' && local40 <= 'Z') {
				local69 = local40 - '7';
			} else if (local40 >= 'a' && local40 <= 'z') {
				local69 = local40 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local69) {
				throw new NumberFormatException();
			}
			if (local26) {
				local69 = -local69;
			}
			@Pc(110) int local110 = local30 * arg1 + local69;
			if (local110 / arg1 != local30) {
				throw new NumberFormatException();
			}
			local30 = local110;
			local28 = true;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ILclient!e;Lclient!oa;)V")
	public static void method7309(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) Class15 arg1) {
		if (Static87.aClass3_Sub4_Sub7_2 == null) {
			return;
		}
		if (Static130.anInt2933 < 10) {
			if (!Static87.aClass254_93.method6425(Static87.aClass3_Sub4_Sub7_2.aString25)) {
				Static130.anInt2933 = Static392.aClass254_104.method6402(Static87.aClass3_Sub4_Sub7_2.aString25) / 10;
				return;
			}
			Static436.method6867();
			Static130.anInt2933 = 10;
		}
		if (Static130.anInt2933 == 10) {
			Static87.anInt6924 = Static87.aClass3_Sub4_Sub7_2.anInt2244 >> 6 << 6;
			Static87.anInt6928 = Static87.aClass3_Sub4_Sub7_2.anInt2251 >> 6 << 6;
			Static87.anInt6919 = (Static87.aClass3_Sub4_Sub7_2.anInt2248 >> 6 << 6) + 64 - Static87.anInt6924;
			Static87.anInt6925 = (Static87.aClass3_Sub4_Sub7_2.anInt2239 >> 6 << 6) + 64 - Static87.anInt6928;
			@Pc(72) int[] local72 = new int[3];
			@Pc(74) int local74 = -1;
			@Pc(76) int local76 = -1;
			if (Static87.aClass3_Sub4_Sub7_2.method2055(local72, (Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396 >> 9) + Static563.anInt10006, Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103, Static230.anInt4667 + (Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398 >> 9))) {
				local74 = local72[1] - Static87.anInt6928;
				local76 = local72[2] - Static87.anInt6924;
			}
			if (!Static52.aBoolean102 && local74 >= 0 && local74 < Static87.anInt6925 && local76 >= 0 && local76 < Static87.anInt6919) {
				local74 += (int) (Math.random() * 10.0D) - 5;
				local76 += (int) (Math.random() * 10.0D) - 5;
				Static185.anInt3726 = local74;
				Static18.anInt597 = local76;
			} else if (Static488.anInt2265 == -1 || Static133.anInt3193 == -1) {
				Static87.aClass3_Sub4_Sub7_2.method2054(Static87.aClass3_Sub4_Sub7_2.anInt2241 >> 14 & 0x3FFF, local72, Static87.aClass3_Sub4_Sub7_2.anInt2241 & 0x3FFF);
				Static185.anInt3726 = local72[1] - Static87.anInt6928;
				Static18.anInt597 = local72[2] - Static87.anInt6924;
			} else {
				Static87.aClass3_Sub4_Sub7_2.method2054(Static488.anInt2265, local72, Static133.anInt3193);
				Static52.aBoolean102 = false;
				if (local72 != null) {
					Static18.anInt597 = local72[2] - Static87.anInt6924;
					Static185.anInt3726 = local72[1] - Static87.anInt6928;
				}
				Static133.anInt3193 = -1;
				Static488.anInt2265 = -1;
			}
			if (Static87.aClass3_Sub4_Sub7_2.anInt2245 == 37) {
				Static87.aFloat148 = 3.0F;
				Static87.aFloat149 = 3.0F;
			} else if (Static87.aClass3_Sub4_Sub7_2.anInt2245 == 50) {
				Static87.aFloat148 = 4.0F;
				Static87.aFloat149 = 4.0F;
			} else if (Static87.aClass3_Sub4_Sub7_2.anInt2245 == 75) {
				Static87.aFloat148 = 6.0F;
				Static87.aFloat149 = 6.0F;
			} else if (Static87.aClass3_Sub4_Sub7_2.anInt2245 == 100) {
				Static87.aFloat148 = 8.0F;
				Static87.aFloat149 = 8.0F;
			} else if (Static87.aClass3_Sub4_Sub7_2.anInt2245 == 200) {
				Static87.aFloat148 = 16.0F;
				Static87.aFloat149 = 16.0F;
			} else {
				Static87.aFloat148 = 8.0F;
				Static87.aFloat149 = 8.0F;
			}
			Static87.anInt6915 = (int) Static87.aFloat148 >> 1;
			Static87.aByteArrayArrayArray19 = Static550.method7234(Static87.anInt6915);
			Static293.method4983();
			Static87.method5757();
			Static493.aClass183_55 = new Class183();
			Static87.anInt6914 += (int) (Math.random() * 5.0D) - 2;
			if (Static87.anInt6914 < -8) {
				Static87.anInt6914 = -8;
			}
			if (Static87.anInt6914 > 8) {
				Static87.anInt6914 = 8;
			}
			Static87.anInt6916 += (int) (Math.random() * 5.0D) - 2;
			if (Static87.anInt6916 < -16) {
				Static87.anInt6916 = -16;
			}
			if (Static87.anInt6916 > 16) {
				Static87.anInt6916 = 16;
			}
			Static87.method5758(arg0, Static87.anInt6914 >> 2 << 10, Static87.anInt6916 >> 1);
			Static87.aClass10_4.method401(256, 1024);
			Static87.aClass315_3.method7656(256, 256);
			Static87.aClass146_3.method3359(4096);
			Static380.aClass46_1.method1600(256);
			Static130.anInt2933 = 20;
		} else if (Static130.anInt2933 == 20) {
			Static306.method5124(true);
			Static87.method5755(arg1, Static87.anInt6914, Static87.anInt6916);
			Static130.anInt2933 = 60;
			Static306.method5124(true);
			Static168.method3106();
		} else if (Static130.anInt2933 == 60) {
			if (Static87.aClass254_93.method6409(Static87.aClass3_Sub4_Sub7_2.aString25 + "_staticelements")) {
				if (!Static87.aClass254_93.method6425(Static87.aClass3_Sub4_Sub7_2.aString25 + "_staticelements")) {
					return;
				}
				Static87.aClass238_2 = Static53.method1294(Static584.aBoolean846, Static87.aClass3_Sub4_Sub7_2.aString25 + "_staticelements", Static87.aClass254_93);
			} else {
				Static87.aClass238_2 = new Class238(0);
			}
			Static87.method5762();
			Static130.anInt2933 = 70;
			Static306.method5124(true);
			Static168.method3106();
		} else if (Static130.anInt2933 == 70) {
			Static584.aClass247_14 = new Class247(arg1, 11, true, Static545.aCanvas14);
			Static130.anInt2933 = 73;
			Static306.method5124(true);
			Static168.method3106();
		} else if (Static130.anInt2933 == 73) {
			Static580.aClass247_13 = new Class247(arg1, 12, true, Static545.aCanvas14);
			Static130.anInt2933 = 76;
			Static306.method5124(true);
			Static168.method3106();
		} else if (Static130.anInt2933 == 76) {
			Static563.aClass247_11 = new Class247(arg1, 14, true, Static545.aCanvas14);
			Static130.anInt2933 = 79;
			Static306.method5124(true);
			Static168.method3106();
		} else if (Static130.anInt2933 == 79) {
			Static474.aClass247_9 = new Class247(arg1, 17, true, Static545.aCanvas14);
			Static130.anInt2933 = 82;
			Static306.method5124(true);
			Static168.method3106();
		} else if (Static130.anInt2933 == 82) {
			Static142.aClass247_4 = new Class247(arg1, 19, true, Static545.aCanvas14);
			Static130.anInt2933 = 85;
			Static306.method5124(true);
			Static168.method3106();
		} else if (Static130.anInt2933 == 85) {
			Static67.aClass247_12 = new Class247(arg1, 22, true, Static545.aCanvas14);
			Static130.anInt2933 = 88;
			Static306.method5124(true);
			Static168.method3106();
		} else if (Static130.anInt2933 == 88) {
			Static400.aClass247_8 = new Class247(arg1, 26, true, Static545.aCanvas14);
			Static130.anInt2933 = 91;
			Static306.method5124(true);
			Static168.method3106();
		} else {
			Static284.aClass247_7 = new Class247(arg1, 30, true, Static545.aCanvas14);
			Static130.anInt2933 = 100;
			Static306.method5124(true);
			Static168.method3106();
			System.gc();
		}
	}
}

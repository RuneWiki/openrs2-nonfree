import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!fd", name = "O", descriptor = "Lclient!rl;")
	public static Class7_Sub8_Sub3 aClass7_Sub8_Sub3_1;

	@OriginalMember(owner = "client!fd", name = "K", descriptor = "Lclient!gn;")
	public static final Class94 aClass94_13 = new Class94(12, 14);

	@OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
	public static int anInt2206 = 2;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!ya;Lclient!ga;)V")
	public static void method1873(@OriginalArg(1) Class51 arg0, @OriginalArg(2) Interface4 arg1) {
		if (Static93.aClass7_Sub4_Sub9_3 == null) {
			return;
		}
		if (Static24.anInt346 < 10) {
			if (!Static93.aClass178_76.method3822(Static93.aClass7_Sub4_Sub9_3.aString35)) {
				Static24.anInt346 = Static224.aClass178_108.method3837(Static93.aClass7_Sub4_Sub9_3.aString35) / 10;
				return;
			}
			Static188.method2743();
			Static24.anInt346 = 10;
		}
		if (Static24.anInt346 == 10) {
			Static93.anInt4322 = Static93.aClass7_Sub4_Sub9_3.anInt3013 >> 6 << 6;
			Static93.anInt4323 = Static93.aClass7_Sub4_Sub9_3.anInt3006 >> 6 << 6;
			Static93.anInt4332 = (Static93.aClass7_Sub4_Sub9_3.anInt3005 >> 6 << 6) + 64 - Static93.anInt4322;
			Static93.anInt4330 = (Static93.aClass7_Sub4_Sub9_3.anInt2999 >> 6 << 6) + 64 - Static93.anInt4323;
			@Pc(78) int[] local78 = new int[3];
			@Pc(80) int local80 = -1;
			@Pc(82) int local82 = -1;
			if (Static93.aClass7_Sub4_Sub9_3.method2409(Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102, (Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388 >> 7) + Static359.anInt5713, Static314.anInt5181 - -(Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383 >> 7), local78)) {
				local82 = local78[2] - Static93.anInt4323;
				local80 = local78[1] - Static93.anInt4322;
			}
			if (!Static51.aBoolean45 && local80 >= 0 && local80 < Static93.anInt4332 && local82 >= 0 && Static93.anInt4330 > local82) {
				local80 += (int) (Math.random() * 10.0D) - 5;
				local82 += (int) (Math.random() * 10.0D) - 5;
				Static21.anInt321 = local82;
				Static203.anInt3590 = local80;
			} else if (Static302.anInt5111 == -1 || Static317.anInt5202 == -1) {
				Static93.aClass7_Sub4_Sub9_3.method2410(Static93.aClass7_Sub4_Sub9_3.anInt3009 & 0x3FFF, Static93.aClass7_Sub4_Sub9_3.anInt3009 >> 14 & 0x3FFF, local78);
				Static203.anInt3590 = local78[1] - Static93.anInt4322;
				Static21.anInt321 = local78[2] - Static93.anInt4323;
			} else {
				Static93.aClass7_Sub4_Sub9_3.method2410(Static317.anInt5202, Static302.anInt5111, local78);
				if (local78 != null) {
					Static21.anInt321 = local78[2] - Static93.anInt4323;
					Static203.anInt3590 = local78[1] - Static93.anInt4322;
				}
				Static51.aBoolean45 = false;
				Static317.anInt5202 = -1;
				Static302.anInt5111 = -1;
			}
			if (Static93.aClass7_Sub4_Sub9_3.anInt3000 == 37) {
				Static93.aFloat126 = 3.0F;
				Static93.aFloat125 = 3.0F;
			} else if (Static93.aClass7_Sub4_Sub9_3.anInt3000 == 50) {
				Static93.aFloat126 = 4.0F;
				Static93.aFloat125 = 4.0F;
			} else if (Static93.aClass7_Sub4_Sub9_3.anInt3000 == 75) {
				Static93.aFloat126 = 6.0F;
				Static93.aFloat125 = 6.0F;
			} else if (Static93.aClass7_Sub4_Sub9_3.anInt3000 == 100) {
				Static93.aFloat126 = 8.0F;
				Static93.aFloat125 = 8.0F;
			} else if (Static93.aClass7_Sub4_Sub9_3.anInt3000 == 200) {
				Static93.aFloat126 = 16.0F;
				Static93.aFloat125 = 16.0F;
			} else {
				Static93.aFloat126 = 8.0F;
				Static93.aFloat125 = 8.0F;
			}
			Static93.anInt4318 = (int) Static93.aFloat126 >> 1;
			Static93.aByteArrayArrayArray15 = Static205.method2956(Static93.anInt4318);
			Static430.method5562();
			Static93.method3421();
			Static238.aClass85_27 = new Class85();
			Static93.anInt4320 += (int) (Math.random() * 5.0D) - 2;
			if (Static93.anInt4320 < -8) {
				Static93.anInt4320 = -8;
			}
			if (Static93.anInt4320 > 8) {
				Static93.anInt4320 = 8;
			}
			Static93.anInt4319 += (int) (Math.random() * 5.0D) - 2;
			if (Static93.anInt4319 < -16) {
				Static93.anInt4319 = -16;
			}
			if (Static93.anInt4319 > 16) {
				Static93.anInt4319 = 16;
			}
			Static93.method3426(arg1, Static93.anInt4320 >> 2 << 10, Static93.anInt4319 >> 1);
			Static93.aClass62_4.method1484(1024, 256);
			Static93.aClass176_3.method3713(256, 256);
			Static93.aClass142_2.method3152(4096);
			Static446.aClass53_1.method1176(256);
			Static24.anInt346 = 20;
		} else if (Static24.anInt346 == 20) {
			Static285.method3747(true);
			Static93.method3424(arg0, Static93.anInt4320, Static93.anInt4319);
			Static24.anInt346 = 60;
			Static285.method3747(true);
			Static309.method4075();
		} else if (Static24.anInt346 == 60) {
			if (Static93.aClass178_76.method3828(Static93.aClass7_Sub4_Sub9_3.aString35 + "_staticelements")) {
				if (!Static93.aClass178_76.method3822(Static93.aClass7_Sub4_Sub9_3.aString35 + "_staticelements")) {
					return;
				}
				Static93.aClass109_3 = Static236.method3229(Static93.aClass7_Sub4_Sub9_3.aString35 + "_staticelements", Static87.aBoolean98, Static93.aClass178_76);
			} else {
				Static93.aClass109_3 = new Class109(0);
			}
			Static93.method3412();
			Static24.anInt346 = 70;
			Static285.method3747(true);
			Static309.method4075();
		} else if (Static24.anInt346 == 70) {
			Static71.aClass241_3 = new Class241(arg0, 11, true, Static95.aCanvas3);
			Static24.anInt346 = 73;
			Static285.method3747(true);
			Static309.method4075();
		} else if (Static24.anInt346 == 73) {
			Static186.aClass241_6 = new Class241(arg0, 12, true, Static95.aCanvas3);
			Static24.anInt346 = 76;
			Static285.method3747(true);
			Static309.method4075();
		} else if (Static24.anInt346 == 76) {
			Static36.aClass241_1 = new Class241(arg0, 14, true, Static95.aCanvas3);
			Static24.anInt346 = 79;
			Static285.method3747(true);
			Static309.method4075();
		} else if (Static24.anInt346 == 79) {
			Static291.aClass241_8 = new Class241(arg0, 17, true, Static95.aCanvas3);
			Static24.anInt346 = 82;
			Static285.method3747(true);
			Static309.method4075();
		} else if (Static24.anInt346 == 82) {
			Static234.aClass241_7 = new Class241(arg0, 19, true, Static95.aCanvas3);
			Static24.anInt346 = 85;
			Static285.method3747(true);
			Static309.method4075();
		} else if (Static24.anInt346 == 85) {
			Static82.aClass241_4 = new Class241(arg0, 22, true, Static95.aCanvas3);
			Static24.anInt346 = 88;
			Static285.method3747(true);
			Static309.method4075();
		} else if (Static24.anInt346 == 88) {
			Static129.aClass241_5 = new Class241(arg0, 26, true, Static95.aCanvas3);
			Static24.anInt346 = 91;
			Static285.method3747(true);
			Static309.method4075();
		} else {
			Static46.aClass241_2 = new Class241(arg0, 30, true, Static95.aCanvas3);
			Static24.anInt346 = 100;
			Static285.method3747(true);
			Static309.method4075();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V")
	public static void method1875() {
		if (Static145.aFrame4 != null) {
			return;
		}
		@Pc(15) int local15 = Static148.anInt2796;
		@Pc(17) int local17 = Static445.anInt1110;
		@Pc(25) int local25 = Static382.anInt6127 - local15 - Static251.anInt4258;
		@Pc(32) int local32 = Static439.anInt7322 - Static286.anInt4051 - local17;
		if (local15 <= 0 && local25 <= 0 && local17 <= 0 && local32 <= 0) {
			return;
		}
		try {
			@Pc(51) Container local51;
			if (Static452.aFrame5 == null) {
				local51 = Static230.aClass61_4.anApplet1;
			} else {
				local51 = Static452.aFrame5;
			}
			@Pc(57) int local57 = 0;
			@Pc(59) int local59 = 0;
			if (local51 == Static452.aFrame5) {
				@Pc(65) Insets local65 = Static452.aFrame5.getInsets();
				local59 = local65.top;
				local57 = local65.left;
			}
			@Pc(74) Graphics local74 = local51.getGraphics();
			local74.setColor(Color.black);
			if (local15 > 0) {
				local74.fillRect(local57, local59, local15, Static439.anInt7322);
			}
			if (local17 > 0) {
				local74.fillRect(local57, local59, Static382.anInt6127, local17);
			}
			if (local25 > 0) {
				local74.fillRect(local57 + Static382.anInt6127 - local25, local59, local25, Static439.anInt7322);
			}
			if (local32 > 0) {
				local74.fillRect(local57, local59 + Static439.anInt7322 - local32, Static382.anInt6127, local32);
				return;
			}
		} catch (@Pc(125) Exception local125) {
			return;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BII)V")
	public static void method1877(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static106.anInt2172 == 1) {
			Static144.method2238(arg0, Static268.aClass7_Sub39_1, arg1);
		} else if (Static106.anInt2172 == 2) {
			Static92.method1635(arg1, arg0);
		}
		Static106.anInt2172 = 0;
		Static268.aClass7_Sub39_1 = null;
	}
}

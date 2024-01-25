import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
	public static int anInt4788;

	@OriginalMember(owner = "client!dg", name = "ab", descriptor = "Lclient!tq;")
	public static Class191 aClass191_158;

	@OriginalMember(owner = "client!dg", name = "S", descriptor = "[I")
	public static final int[] anIntArray375 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!ae;I)V")
	public static void method4428(@OriginalArg(0) Class4 arg0) {
		arg0.method4252(0, 0, Static136.anInt2829, 350);
		arg0.method4246(0, 0, Static136.anInt2829, 350, Static105.anInt2372 << 24 | 0x332277, 1);
		@Pc(37) int local37;
		@Pc(41) int local41;
		for (@Pc(31) int local31 = 0; local31 < 100; local31++) {
			local37 = Static335.anIntArray501[local31];
			local41 = Static25.anIntArray103[local31];
			arg0.method4246(local37, local41, 2, 2, Static276.anIntArray413[local31] << 24 | 0xFFFFFF, 1);
		}
		local37 = 350 / Static273.anInt5576;
		if (Static324.anInt6551 > 0) {
			local41 = 342 - Static273.anInt5576;
			@Pc(82) int local82 = local37 * local41 / (local37 + Static324.anInt6551 - 1);
			@Pc(84) int local84 = 4;
			if (Static324.anInt6551 > 1) {
				local84 = (local41 - local82) * (-Static235.anInt4515 + Static324.anInt6551 + -1) / (Static324.anInt6551 - 1) + 4;
			}
			arg0.method4246(Static136.anInt2829 - 16, local84, 12, local82, Static105.anInt2372 << 24 | 0x332277, 2);
			for (@Pc(121) int local121 = Static235.anInt4515; local37 + Static235.anInt4515 > local121 && local121 < Static324.anInt6551; local121++) {
				@Pc(130) String[] local130 = Static336.method5829(Static158.aStringArray28[local121], '\b');
				@Pc(139) int local139 = (Static136.anInt2829 - 8 - 16) / local130.length;
				for (@Pc(141) int local141 = 0; local141 < local130.length; local141++) {
					@Pc(149) int local149 = local141 * local139 + 8;
					arg0.method4252(local149, 0, local139 + local149 - 8, 350);
					Static193.aClass37_2.method5254(-16777216, local149, -1, local130[local141], 350 - Static225.anInt4338 - Static24.aClass188_1.anInt6080 - Static273.anInt5576 * (-Static235.anInt4515 + local121) - 2);
				}
			}
		}
		arg0.method4252(0, 0, Static136.anInt2829, 350);
		arg0.method4260(Static136.anInt2829, 0, 350 - Static225.anInt4338, -1);
		Static56.aClass37_1.method5254(-16777216, 10, -1, "--> " + Static291.aString57, 350 - Static289.aClass188_8.anInt6080 - 1);
		local41 = -1;
		if (Static212.anInt4090 % 30 > 15) {
			local41 = 16777215;
		}
		arg0.method4220(350 - Static289.aClass188_8.anInt6080 - 11, Static289.aClass188_8.method5318("--> " + Static291.aString57.substring(0, Static209.anInt4724)) + 10, 12, local41);
	}

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "(I)V")
	public static void method4438() {
		if (Static207.anInt6401 > 0) {
			Static38.method868();
		} else {
			Static192.aClass173_4 = Static157.aClass173_1;
			Static157.aClass173_1 = null;
			Static125.method2616(40);
		}
	}

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "(I)I")
	public static int method4454() {
		try {
			if (Static93.anInt2122 == 0) {
				if (Static51.method1197() - 5000L < Static120.aLong76) {
					return 0;
				}
				Static313.aClass193_9 = Static177.aClass168_2.method4848(Static149.aString26, Static34.anInt599);
				Static320.aLong186 = Static51.method1197();
				Static93.anInt2122 = 1;
			}
			if (Static51.method1197() > Static320.aLong186 + 30000L) {
				return Static346.method5939(1000);
			}
			@Pc(82) int local82;
			@Pc(121) int local121;
			if (Static93.anInt2122 == 1) {
				if (Static313.aClass193_9.anInt6293 == 2) {
					return Static346.method5939(1001);
				}
				if (Static313.aClass193_9.anInt6293 != 1) {
					return -1;
				}
				Static157.aClass173_1 = new Class173((Socket) Static313.aClass193_9.anObject7, Static177.aClass168_2);
				Static313.aClass193_9 = null;
				local82 = 0;
				if (Static322.aBoolean573) {
					local82 = Static213.anInt4102;
				}
				Static74.aClass2_Sub10_Sub1_2.anInt4807 = 0;
				Static74.aClass2_Sub10_Sub1_2.method4430(23);
				Static74.aClass2_Sub10_Sub1_2.method4450(local82);
				Static157.aClass173_1.method5021(Static74.aClass2_Sub10_Sub1_2.anInt4807, Static74.aClass2_Sub10_Sub1_2.aByteArray57);
				if (Static124.aClass94_2 != null) {
					Static124.aClass94_2.method5969();
				}
				if (Static221.aClass94_3 != null) {
					Static221.aClass94_3.method5969();
				}
				local121 = Static157.aClass173_1.method5028();
				if (Static124.aClass94_2 != null) {
					Static124.aClass94_2.method5969();
				}
				if (Static221.aClass94_3 != null) {
					Static221.aClass94_3.method5969();
				}
				if (local121 != 0) {
					return Static346.method5939(local121);
				}
				Static93.anInt2122 = 2;
			}
			if (Static93.anInt2122 == 2) {
				if (Static157.aClass173_1.method5024() < 2) {
					return -1;
				}
				Static253.anInt6899 = Static157.aClass173_1.method5028();
				Static253.anInt6899 <<= 0x8;
				Static253.anInt6899 += Static157.aClass173_1.method5028();
				Static93.anInt2122 = 3;
				Static286.anInt5808 = 0;
				Static211.aByteArray53 = new byte[Static253.anInt6899];
			}
			if (Static93.anInt2122 != 3) {
				return -1;
			}
			local82 = Static157.aClass173_1.method5024();
			if (local82 < 1) {
				return -1;
			}
			if (local82 > Static253.anInt6899 - Static286.anInt5808) {
				local82 = Static253.anInt6899 - Static286.anInt5808;
			}
			Static157.aClass173_1.method5020(Static211.aByteArray53, Static286.anInt5808, local82);
			Static286.anInt5808 += local82;
			if (Static253.anInt6899 > Static286.anInt5808) {
				return -1;
			} else if (Static18.method669(Static211.aByteArray53)) {
				Static303.aClass20_Sub1Array3 = new Class20_Sub1[Static168.anInt3424];
				local121 = 0;
				for (@Pc(227) int local227 = Static98.anInt2208; local227 <= Static161.anInt3258; local227++) {
					@Pc(233) Class20_Sub1 local233 = Static328.method5761(local227);
					if (local233 != null) {
						Static303.aClass20_Sub1Array3[local121++] = local233;
					}
				}
				Static271.anInt5505 = 0;
				Static235.aClass2_Sub32_1 = null;
				Static157.aClass173_1.method5027();
				Static93.anInt2122 = 0;
				Static211.aByteArray53 = null;
				Static157.aClass173_1 = null;
				Static25.anInt1343 = 0;
				Static120.aLong76 = Static51.method1197();
				return 0;
			} else {
				return Static346.method5939(1002);
			}
		} catch (@Pc(265) IOException local265) {
			return Static346.method5939(1003);
		}
	}

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "(B)Z")
	public static boolean method4461() {
		if (Static18.aBoolean56) {
			try {
				Static358.method3(Static177.aClass168_2.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}
}

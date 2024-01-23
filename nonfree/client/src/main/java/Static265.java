import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "Lclient!cc;")
	public static Class22 aClass22_19;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
	public static int[] anIntArray444 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
	public static int anInt4985 = 2;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	public static void method3980() {
		@Pc(12) int local12 = Static286.method4296();
		if (local12 == 0) {
			Static275.aByteArrayArrayArray18 = null;
			Static42.method691(0);
		} else if (local12 == 1) {
			Static287.method1968((byte) 0);
			Static42.method691(512);
			if (Static46.aByteArrayArrayArray2 != null) {
				Static294.method3442();
			}
		} else {
			Static287.method1968((byte) (Static32.anInt641 - 4 & 0xFF));
			Static42.method691(2);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)I")
	public static int method3981(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(16) Class4_Sub32 local16 = (Class4_Sub32) Static105.aClass97_9.method2360((long) arg0);
		if (local16 == null) {
			return Static187.method2992(arg0).anInt3996;
		}
		@Pc(26) int local26 = 0;
		for (@Pc(36) int local36 = 0; local36 < local16.anIntArray480.length; local36++) {
			if (local16.anIntArray480[local36] == -1) {
				local26++;
			}
		}
		return local26 + Static187.method2992(arg0).anInt3996 - local16.anIntArray480.length;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)[Lclient!jd;")
	public static Class76[] method3982() {
		if (Static211.aClass76Array1 == null) {
			@Pc(13) Class76[] local13 = Static14.method1605(Static87.aClass164_2);
			@Pc(15) int local15 = 0;
			@Pc(19) Class76[] local19 = new Class76[local13.length];
			label54: for (@Pc(21) int local21 = 0; local21 < local13.length; local21++) {
				@Pc(33) Class76 local33 = local13[local21];
				if ((local33.anInt2647 <= 0 || local33.anInt2647 >= 24) && local33.anInt2653 >= 800 && local33.anInt2645 >= 600) {
					for (@Pc(54) int local54 = 0; local54 < local15; local54++) {
						@Pc(65) Class76 local65 = local19[local54];
						if (local65.anInt2653 == local33.anInt2653 && local33.anInt2645 == local65.anInt2645) {
							if (local65.anInt2647 < local33.anInt2647) {
								local19[local54] = local33;
							}
							continue label54;
						}
					}
					local19[local15] = local33;
					local15++;
				}
			}
			Static211.aClass76Array1 = new Class76[local15];
			Static307.method3243(local19, 0, Static211.aClass76Array1, 0, local15);
			@Pc(115) int[] local115 = new int[Static211.aClass76Array1.length];
			for (@Pc(117) int local117 = 0; local117 < Static211.aClass76Array1.length; local117++) {
				@Pc(129) Class76 local129 = Static211.aClass76Array1[local117];
				local115[local117] = local129.anInt2653 * local129.anInt2645;
			}
			Static230.method3622(Static211.aClass76Array1, local115);
		}
		return Static211.aClass76Array1;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)V")
	public static void method3983(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Static149.anInt3032;
		@Pc(7) int local7 = Static160.anInt3185;
		@Pc(9) int local9 = Static211.anInt4210;
		@Pc(11) int local11 = Static299.anInt5560;
		@Pc(13) int local13 = Static279.anInt5259;
		@Pc(16) int local16 = (int) Static96.aFloat16;
		if (local16 < Static40.anInt850 / 256) {
			local16 = Static40.anInt850 / 256;
		}
		if (Static231.aBooleanArray21[4] && Static201.anIntArray337[4] + 128 > local16) {
			local16 = Static201.anIntArray337[4] + 128;
		}
		@Pc(55) int local55 = (int) Static270.aFloat49 + Static73.anInt1335 & 0x7FF;
		Static287.method1966(Static96.method1559(Static210.anInt4103, Static239.aClass12_Sub3_Sub2_2.anInt4113, Static239.aClass12_Sub3_Sub2_2.anInt4141) - 50, Static127.anInt2702, local16 * 3 + 600, local55, arg0, Static295.anInt5480, local16);
		if (Static149.anInt3032 == local5 && local7 == Static160.anInt3185 && local9 == Static211.anInt4210 && local11 == Static299.anInt5560 && local13 == Static279.anInt5259) {
			Static239.anInt4616 = 1;
			return;
		}
		Static261.anInt4962 = 10;
		Static47.anInt951 = 10;
		@Pc(112) int local112 = Static279.anInt5259 - local13;
		Static121.anInt2644 = 10;
		if (local112 > 1024) {
			local112 -= 2048;
		}
		if (Static299.anInt5560 > local11) {
			local11 += (Static299.anInt5560 - local11) * Static121.anInt2644 / 1000 + Static47.anInt951;
			if (local11 < Static299.anInt5560) {
				Static299.anInt5560 = local11;
			}
		}
		if (Static299.anInt5560 < local11) {
			local11 -= Static47.anInt951 + Static121.anInt2644 * (local11 - Static299.anInt5560) / 1000;
			if (local11 > Static299.anInt5560) {
				Static299.anInt5560 = local11;
			}
		}
		Static57.anInt1128 = 10;
		if (local7 < Static160.anInt3185) {
			local7 += (Static160.anInt3185 - local7) * Static261.anInt4962 / 1000 + Static57.anInt1128;
			if (Static160.anInt3185 > local7) {
				Static160.anInt3185 = local7;
			}
		}
		if (Static211.anInt4210 > local9) {
			local9 += Static57.anInt1128 + (Static211.anInt4210 - local9) * Static261.anInt4962 / 1000;
			if (local9 < Static211.anInt4210) {
				Static211.anInt4210 = local9;
			}
		}
		if (local9 > Static211.anInt4210) {
			local9 -= Static57.anInt1128 + Static261.anInt4962 * (local9 - Static211.anInt4210) / 1000;
			if (local9 > Static211.anInt4210) {
				Static211.anInt4210 = local9;
			}
		}
		if (local5 < Static149.anInt3032) {
			local5 += Static57.anInt1128 + Static261.anInt4962 * (Static149.anInt3032 - local5) / 1000;
			if (local5 < Static149.anInt3032) {
				Static149.anInt3032 = local5;
			}
		}
		if (local112 < -1024) {
			local112 += 2048;
		}
		if (Static149.anInt3032 < local5) {
			local5 -= (local5 - Static149.anInt3032) * Static261.anInt4962 / 1000 + Static57.anInt1128;
			if (Static149.anInt3032 < local5) {
				Static149.anInt3032 = local5;
			}
		}
		if (local7 > Static160.anInt3185) {
			local7 -= Static57.anInt1128 + (local7 - Static160.anInt3185) * Static261.anInt4962 / 1000;
			if (Static160.anInt3185 < local7) {
				Static160.anInt3185 = local7;
			}
		}
		if (local112 > 0) {
			local13 += Static47.anInt951 + local112 * Static121.anInt2644 / 1000;
			local13 &= 0x7FF;
		}
		if (local112 < 0) {
			local13 -= Static121.anInt2644 * -local112 / 1000 + Static47.anInt951;
			local13 &= 0x7FF;
		}
		@Pc(387) int local387 = Static279.anInt5259 - local13;
		if (local387 > 1024) {
			local387 -= 2048;
		}
		if (local387 < -1024) {
			local387 += 2048;
		}
		if (local387 >= 0 || local112 <= 0 || local387 > 0 && local112 < 0) {
			Static279.anInt5259 = local13;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public static void method3984() {
		anIntArray444 = null;
		aClass22_19 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!lc;ZI)Lclient!bi;")
	public static Class4_Sub2_Sub1 method3985(@OriginalArg(0) Class98 arg0, @OriginalArg(2) int arg1) {
		return Static243.method3715(arg1, arg0) ? Static22.method367() : null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method3986(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(21) int local21 = Static49.aClass4_Sub2_Sub12_1.method4178(arg0, 250);
		@Pc(28) int local28 = Static49.aClass4_Sub2_Sub12_1.method4185(arg0, 250) * 13;
		if (Static178.aBoolean216) {
			Static186.method2968(6, 6, local21 + 8, local28 - -4 + 4, 0);
			Static186.method2970(6, 6, local21 + 4 + 4, local28 + 4 + 4, 16777215);
		} else {
			Static166.method2627(6, 6, local21 + 8, local28 + 4 - -4, 0);
			Static166.method2614(6, 6, local21 + 8, local28 + 8, 16777215);
		}
		Static49.aClass4_Sub2_Sub12_1.method4198(arg0, 10, 10, local21, local28, 16777215, -1, 1, 1, 0);
		Static115.method1995(6, local28 + 4 + 4, 6, local21 + 4 + 4);
		if (!arg1) {
			Static113.method1929(local21, 10, local28, 10);
		} else if (Static178.aBoolean216) {
			Static178.method2766();
		} else {
			try {
				@Pc(167) Graphics local167 = Static235.aCanvas1.getGraphics();
				Static26.aClass119_1.method3931(local167);
			} catch (@Pc(175) Exception local175) {
				Static235.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!lc;Lclient!lc;I)V")
	public static void method3987(@OriginalArg(0) Class98 arg0, @OriginalArg(1) Class98 arg1) {
		Static63.aClass98_36 = arg1;
		Static14.aClass98_58 = arg0;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	public static void method3988() {
		Static36.aClass33_4.method839();
		Static151.aClass33_26.method839();
		Static160.aClass33_28.method839();
	}
}

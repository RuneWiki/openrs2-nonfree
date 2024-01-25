import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_75 = new Class239(76, -1);

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
	public static int anInt2925 = -1;

	@OriginalMember(owner = "client!gl", name = "o", descriptor = "Z")
	public static boolean aBoolean238 = false;

	@OriginalMember(owner = "client!gl", name = "p", descriptor = "F")
	public static float aFloat56 = 0.0F;

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
	public static void method2728() {
		if (Static414.aClass320_17 != Static117.aClass320_1) {
			try {
				Static559.method6631("tbrefresh", Static456.aClient1);
			} catch (@Pc(22) Throwable local22) {
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)Z")
	public static boolean method2729() {
		try {
			if (Static517.anInt9002 == 2) {
				if (Static147.aClass2_Sub8_2 == null) {
					Static147.aClass2_Sub8_2 = Static548.method760(Static289.aClass53_83, Static215.anInt8111, Static96.anInt1868);
					if (Static147.aClass2_Sub8_2 == null) {
						return false;
					}
				}
				if (Static162.aClass108_1 == null) {
					Static162.aClass108_1 = new Class108(Static220.aClass53_72, Static205.aClass53_68);
				}
				if (Static519.aClass2_Sub12_Sub1_3.method1006(Static75.aClass53_22, Static147.aClass2_Sub8_2, Static162.aClass108_1)) {
					Static519.aClass2_Sub12_Sub1_3.method1030();
					Static519.aClass2_Sub12_Sub1_3.method1028(Static117.anInt2343);
					Static519.aClass2_Sub12_Sub1_3.method1009(Static336.aBoolean469, Static147.aClass2_Sub8_2);
					Static289.aClass53_83 = null;
					Static147.aClass2_Sub8_2 = null;
					Static517.anInt9002 = 0;
					Static162.aClass108_1 = null;
					return true;
				}
			}
		} catch (@Pc(56) Exception local56) {
			local56.printStackTrace();
			Static519.aClass2_Sub12_Sub1_3.method1005();
			Static517.anInt9002 = 0;
			Static289.aClass53_83 = null;
			Static147.aClass2_Sub8_2 = null;
			Static162.aClass108_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIII)V")
	public static void method2731(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(40) String local40 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local40);
		Static172.method5411(false, true, local40);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V")
	public static void method2732(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static115.anInt2326 - Static498.anInt8755;
		if (local7 >= 100) {
			Static427.anInt7875 = 1;
			return;
		}
		@Pc(20) int local20 = (int) Static265.aFloat182;
		if (local20 < Static284.anInt9397 >> 8) {
			local20 = Static284.anInt9397 >> 8;
		}
		if (Static352.aBooleanArray29[4] && local20 < Static165.anIntArray350[4] + 128) {
			local20 = Static165.anIntArray350[4] + 128;
		}
		@Pc(57) int local57 = Static114.anInt2317 + (int) aFloat56 & 0x3FFF;
		Static233.method6721(Static169.anInt3089, arg0, local20, Static31.anInt5633, Static200.method3233(Static208.anInt3742, Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660, Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659) - 50, (local20 >> 3) * 3 + 600 << 0, local57);
		@Pc(101) float local101 = 1.0F - (float) ((100 - local7) * (-local7 + 100) * (100 - local7)) / 1000000.0F;
		Static209.anInt3769 = (int) ((float) (Static209.anInt3769 - Static78.anInt1650) * local101 + (float) Static78.anInt1650);
		Static353.anInt5258 = (int) ((float) Static516.anInt8985 + local101 * (float) (Static353.anInt5258 - Static516.anInt8985));
		Static329.anInt3848 = (int) ((float) (Static329.anInt3848 - Static87.anInt1766) * local101 + (float) Static87.anInt1766);
		Static187.anInt3432 = (int) (local101 * (float) (Static187.anInt3432 - Static516.anInt8983) + (float) Static516.anInt8983);
		@Pc(151) int local151 = Static429.anInt7997 - Static135.anInt2545;
		if (local151 > 8192) {
			local151 -= 16384;
		} else if (local151 < -8192) {
			local151 += 16384;
		}
		Static429.anInt7997 = (int) ((float) Static135.anInt2545 + local101 * (float) local151);
		Static429.anInt7997 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IC)I")
	public static int method2734(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg0.charAt(local12) == arg1) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2735(@OriginalArg(1) int arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(19) String local19 = arg1[arg0];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(30) int local30 = arg0 + arg2;
			@Pc(32) int local32 = 0;
			for (@Pc(39) int local39 = arg0; local39 < local30; local39++) {
				@Pc(45) String local45 = arg1[local39];
				if (local45 == null) {
					local32 += 4;
				} else {
					local32 += local45.length();
				}
			}
			@Pc(64) StringBuffer local64 = new StringBuffer(local32);
			for (@Pc(66) int local66 = arg0; local66 < local30; local66++) {
				@Pc(72) String local72 = arg1[local66];
				if (local72 == null) {
					local64.append("null");
				} else {
					local64.append(local72);
				}
			}
			return local64.toString();
		}
	}
}

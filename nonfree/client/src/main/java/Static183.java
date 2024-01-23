import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
	public static int anInt3703;

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "Lclient!hf;")
	public static Class1_Sub4_Sub3 aClass1_Sub4_Sub3_3;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "[Lclient!vk;")
	public static Class1_Sub1_Sub24[] aClass1_Sub1_Sub24Array3 = new Class1_Sub1_Sub24[14];

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "S")
	public static short aShort21 = 1;

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
	public static int anInt3702 = 0;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIBI)V")
	public static void method3020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static191.anInt3924 < 100) {
			Static36.method650();
		}
		if (Static291.aBoolean404) {
			Static133.method2180(arg2, arg1, arg3 + arg2, arg0 + arg1);
		} else {
			Static41.method739(arg2, arg1, arg2 + arg3, arg1 + arg0);
		}
		@Pc(47) int local47;
		@Pc(57) int local57;
		if (Static191.anInt3924 < 100) {
			local47 = arg3 / 2 + arg2;
			local57 = arg0 / 2 + arg1 - 18 - 20;
			if (Static291.aBoolean404) {
				Static133.method2176(arg2, arg1, arg3, arg0, 0);
				Static133.method2164(local47 - 152, local57, 304, 34, 9179409);
				Static133.method2176(local47 - 150, local57 - -2, Static191.anInt3924 * 3, 30, 9179409);
			} else {
				Static41.method730(arg2, arg1, arg3, arg0, 0);
				Static41.method729(local47 - 152, local57, 304, 34, 9179409);
				Static41.method730(local47 - 150, local57 + 2, Static191.anInt3924 * 3, 30, 9179409);
			}
			Static245.aClass1_Sub1_Sub12_2.method4432(Static281.aString176, local47, local57 + 20, 16777215, -1);
			return;
		}
		Static270.anInt5144 = Static72.anInt1374 - (int) ((float) arg3 / Static58.aFloat31);
		Static5.anInt66 = (int) ((float) (arg0 * 2) / Static58.aFloat31);
		Static304.anInt5751 = (int) ((float) (arg3 * 2) / Static58.aFloat31);
		@Pc(155) int local155 = Static72.anInt1374 - (int) ((float) arg3 / Static58.aFloat31);
		local57 = Static72.anInt1374 + (int) ((float) arg3 / Static58.aFloat31);
		Static106.anInt2121 = Static75.anInt1427 - (int) ((float) arg0 / Static58.aFloat31);
		local47 = Static75.anInt1427 - (int) ((float) arg0 / Static58.aFloat31);
		@Pc(198) int local198 = Static75.anInt1427 + (int) ((float) arg0 / Static58.aFloat31);
		@Pc(218) Class24 local218;
		if (Static291.aBoolean404) {
			if (Static144.aClass1_Sub1_Sub3_Sub2_1 == null || arg3 != Static144.aClass1_Sub1_Sub3_Sub2_1.anInt5875 || Static144.aClass1_Sub1_Sub3_Sub2_1.anInt5887 != arg0) {
				Static144.aClass1_Sub1_Sub3_Sub2_1 = null;
				Static144.aClass1_Sub1_Sub3_Sub2_1 = new Class1_Sub1_Sub3_Sub2(arg3, arg0);
			}
			Static41.method738(Static144.aClass1_Sub1_Sub3_Sub2_1.anIntArray344, arg3, arg0);
			Static58.method2042(local155, local47, local57, local198, 0, 0, arg3, arg0 + 1);
			Static58.method2044();
			local218 = Static58.method2034();
			Static73.method1184(arg2, arg1, local218);
			Static144.aClass1_Sub1_Sub3_Sub2_1.method3476();
			Static133.method2174(Static144.aClass1_Sub1_Sub3_Sub2_1.anIntArray344, arg2, arg1, arg3, arg0);
			Static41.anIntArray62 = null;
		} else {
			Static58.method2042(local155, local47, local57, local198, arg2, arg1, arg2 + arg3, arg0 + 1 + arg1);
			Static58.method2044();
			local218 = Static58.method2034();
			Static73.method1184(0, 0, local218);
		}
		if (Static137.anInt2704 > 0) {
			Static314.anInt5911--;
			if (Static314.anInt5911 == 0) {
				Static314.anInt5911 = 20;
				Static137.anInt2704--;
			}
		}
		if (!Static13.aBoolean13) {
			return;
		}
		@Pc(307) int local307 = arg0 + arg1 - 8;
		@Pc(313) int local313 = arg2 + arg3 - 5;
		Static233.aClass1_Sub1_Sub12_3.method4436("Fps:" + Static136.anInt2698, local313, local307, 16776960, -1);
		@Pc(329) Runtime local329 = Runtime.getRuntime();
		@Pc(339) int local339 = (int) ((local329.totalMemory() - local329.freeMemory()) / 1024L);
		@Pc(341) int local341 = 16776960;
		@Pc(342) int local342 = local307 - 15;
		if (local339 > 65536) {
			local341 = 16711680;
		}
		Static233.aClass1_Sub1_Sub12_3.method4436("Mem:" + local339 + "k", local313, local342, local341, -1);
		local307 = local342 - 15;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method3027(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (!arg1) {
			try {
				Static324.method4224("loggedout", Static117.aClass117_3.anApplet1);
			} catch (@Pc(21) Throwable local21) {
			}
			try {
				Static220.anApplet_Sub1_41.getAppletContext().showDocument(new URL(Static220.anApplet_Sub1_41.getCodeBase(), arg0), "_top");
			} catch (@Pc(33) Exception local33) {
			}
			return;
		}
		if (Static291.aBoolean404 && Static295.aBoolean416) {
			try {
				Static324.method4223(new Object[] { (new URL(Static220.anApplet_Sub1_41.getCodeBase(), arg0)).toString() }, "openjs", Static117.aClass117_3.anApplet1);
				return;
			} catch (@Pc(60) Throwable local60) {
			}
		}
		try {
			Static220.anApplet_Sub1_41.getAppletContext().showDocument(new URL(Static220.anApplet_Sub1_41.getCodeBase(), arg0), "_blank");
		} catch (@Pc(72) Exception local72) {
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)Z")
	public static boolean method3031(@OriginalArg(0) int arg0) {
		if (Static282.aBooleanArray59[arg0]) {
			return true;
		} else if (Static62.aClass138_15.method3358(arg0)) {
			@Pc(25) int local25 = Static62.aClass138_15.method3365(arg0);
			if (local25 == 0) {
				Static282.aBooleanArray59[arg0] = true;
				return true;
			}
			if (Static313.aClass146ArrayArray1[arg0] == null) {
				Static313.aClass146ArrayArray1[arg0] = new Class146[local25];
			}
			for (@Pc(48) int local48 = 0; local48 < local25; local48++) {
				if (Static313.aClass146ArrayArray1[arg0][local48] == null) {
					@Pc(69) byte[] local69 = Static62.aClass138_15.method3346(arg0, local48);
					if (local69 != null) {
						@Pc(82) Class146 local82 = Static313.aClass146ArrayArray1[arg0][local48] = new Class146();
						local82.anInt4355 = (arg0 << 16) + local48;
						if (local69[0] == -1) {
							local82.method3520(new Class1_Sub14(local69));
						} else {
							local82.method3512(new Class1_Sub14(local69));
						}
					}
				}
			}
			Static282.aBooleanArray59[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}

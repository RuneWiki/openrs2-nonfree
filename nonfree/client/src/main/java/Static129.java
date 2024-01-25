import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas6;

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "[I")
	public static int[] anIntArray106;

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "S")
	public static short aShort36 = 320;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II[B)[B")
	public static byte[] method2395(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static604.method6225(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IBI)V")
	public static void method2396(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub7_Sub19 local12 = Static73.method5992(1, arg0);
		local12.method7363();
		local12.anInt9381 = arg1;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)Lclient!wo;")
	public static Class29 method2397() {
		try {
			return (Class29) Class.forName("Class29_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return new Class29_Sub2();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "([[[Lclient!up;B)V")
	public static void method2398(@OriginalArg(0) Class333[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class333[][] local9 = arg0[local3];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < local9[local11].length; local15++) {
					@Pc(23) Class333 local23 = local9[local11][local15];
					if (local23 != null) {
						if (local23.aClass25_Sub2_Sub5_1 instanceof Interface14) {
							((Interface14) local23.aClass25_Sub2_Sub5_1).method4963();
						}
						if (local23.aClass25_Sub2_Sub1_2 instanceof Interface14) {
							((Interface14) local23.aClass25_Sub2_Sub1_2).method4963();
						}
						if (local23.aClass25_Sub2_Sub1_1 instanceof Interface14) {
							((Interface14) local23.aClass25_Sub2_Sub1_1).method4963();
						}
						if (local23.aClass25_Sub2_Sub3_2 instanceof Interface14) {
							((Interface14) local23.aClass25_Sub2_Sub3_2).method4963();
						}
						if (local23.aClass25_Sub2_Sub3_1 instanceof Interface14) {
							((Interface14) local23.aClass25_Sub2_Sub3_1).method4963();
						}
						for (@Pc(73) Class147 local73 = local23.aClass147_3; local73 != null; local73 = local73.aClass147_2) {
							@Pc(78) Class25_Sub2_Sub2 local78 = local73.aClass25_Sub2_Sub2_1;
							if (local78 instanceof Interface14) {
								((Interface14) local78).method4963();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V")
	public static void method2399() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static46.aClass259Array1[local7] = null;
		}
		Static196.anInt4255 = 0;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZI)I")
	public static int method2400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static25.method243(arg1 - 1, arg0 + -1) + Static25.method243(arg1 + 1, arg0 + -1) + Static25.method243(arg1 - 1, arg0 + 1) + Static25.method243(arg1 - -1, arg0 + 1);
		@Pc(71) int local71 = Static25.method243(arg1 - 1, arg0) + Static25.method243(arg1 + 1, arg0) + Static25.method243(arg1, arg0 - 1) + Static25.method243(arg1, arg0 + 1);
		@Pc(81) int local81 = Static25.method243(arg1, arg0);
		return local41 / 16 + local71 / 8 + local81 / 4;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)V")
	public static void method2402() {
		@Pc(1) Class342 local1 = Static589.aClass342_203;
		synchronized (Static589.aClass342_203) {
			Static589.aClass342_203.method7697(5);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!wba;BLclient!rl;)Lclient!cw;")
	public static Class3_Sub10 method2403(@OriginalArg(0) Class353 arg0, @OriginalArg(2) Class287 arg1) {
		@Pc(8) Class3_Sub10 local8 = Static551.method7561();
		local8.anInt2131 = arg1.anInt8084;
		local8.aClass287_31 = arg1;
		if (local8.anInt2131 == -1) {
			local8.aClass3_Sub26_Sub1_1 = new Class3_Sub26_Sub1(260);
		} else if (local8.anInt2131 == -2) {
			local8.aClass3_Sub26_Sub1_1 = new Class3_Sub26_Sub1(10000);
		} else if (local8.anInt2131 <= 18) {
			local8.aClass3_Sub26_Sub1_1 = new Class3_Sub26_Sub1(20);
		} else if (local8.anInt2131 > 98) {
			local8.aClass3_Sub26_Sub1_1 = new Class3_Sub26_Sub1(260);
		} else {
			local8.aClass3_Sub26_Sub1_1 = new Class3_Sub26_Sub1(100);
		}
		local8.aClass3_Sub26_Sub1_1.method5550(arg0);
		local8.aClass3_Sub26_Sub1_1.method5558(local8.aClass287_31.method6360());
		local8.anInt2129 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILclient!ol;)V")
	public static void method2404(@OriginalArg(0) int arg0, @OriginalArg(2) Class25_Sub2_Sub2_Sub5 arg1) {
		if (arg1.anIntArray508 == null) {
			return;
		}
		@Pc(18) int local18 = arg1.anIntArray508[arg0 + 1];
		if (local18 == arg1.anInt8545) {
			return;
		}
		arg1.anInt8526 = 1;
		arg1.anInt8578 = arg1.anInt8580;
		arg1.anInt8521 = 0;
		arg1.anInt8543 = 0;
		arg1.anInt8539 = 0;
		arg1.anInt8545 = local18;
		if (arg1.anInt8545 != -1) {
			Static217.method3600(arg1.anInt8539, arg1, Static245.aClass155_1.method3820(arg1.anInt8545));
			return;
		}
	}
}

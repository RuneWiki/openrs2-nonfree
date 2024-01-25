import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!qr", name = "Q", descriptor = "I")
	public static int anInt7190;

	@OriginalMember(owner = "client!qr", name = "F", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_101 = new Class306("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)Z")
	public static boolean method6025(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(II)Z")
	public static boolean method6026(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILjava/lang/String;JZ)V")
	public static void method6027(@OriginalArg(1) String arg0, @OriginalArg(2) long arg1, @OriginalArg(3) boolean arg2) {
		if (arg2) {
			Static154.method2421();
			if (Static6.aString3.equals("")) {
				Static270.anInt5118 = 39;
				return;
			}
		}
		@Pc(23) Class1_Sub6 local23 = new Class1_Sub6(576);
		local23.method3937(10);
		local23.method3919((int) (Math.random() * 65535.0D));
		local23.method3926(arg1);
		local23.method3919(arg2 ? Static534.anInt9008 : Static543.anInt9158);
		local23.method3948((int) (Math.random() * 9.9999999E7D));
		local23.method3917(arg0);
		local23.method3948((int) (Math.random() * 9.9999999E7D));
		if (arg2) {
			local23.method3926(Static259.method4365(Static6.aString3));
			try {
				local23.method3926(Long.parseLong(Static58.aString7));
			} catch (@Pc(109) Exception local109) {
				Static270.anInt5118 = 39;
				return;
			}
		} else {
			local23.method3948((int) (Math.random() * 9.9999999E7D));
			local23.method3948((int) (Math.random() * 9.9999999E7D));
			local23.method3948((int) (Math.random() * 9.9999999E7D));
			local23.method3948((int) (Math.random() * 9.9999999E7D));
		}
		local23.method3948((int) (Math.random() * 9.9999999E7D));
		local23.method3933(Static335.aBigInteger5, Static494.aBigInteger6);
		Static455.aClass1_Sub6_Sub2_2.anInt4555 = 0;
		Static455.aClass1_Sub6_Sub2_2.method3937(arg2 ? Static295.aClass158_12.anInt4745 : Static295.aClass158_9.anInt4745);
		Static455.aClass1_Sub6_Sub2_2.method3919(local23.anInt4555 + 28);
		Static455.aClass1_Sub6_Sub2_2.method3919(610);
		Static455.aClass1_Sub6_Sub2_2.method3937(Static179.anInt3168);
		Static455.aClass1_Sub6_Sub2_2.method3937(Static304.aClass101_1.anInt2782);
		Static167.method3552(Static455.aClass1_Sub6_Sub2_2);
		Static455.aClass1_Sub6_Sub2_2.method3940(local23.aByteArray66, local23.anInt4555);
		Static270.anInt5118 = -3;
		Static184.anInt7342 = 0;
		Static179.anInt3165 = 1;
		Static458.anInt7794 = 0;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!kg;IIIII)V")
	public static void method6030(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt2369 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass1_Sub2Array2[local4] != null) {
				arg0.anInt2369++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt2369; local22++) {
			@Pc(31) long local31 = Static245.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class62 local41;
			while (local31 != 0L) {
				local41 = Static447.aClass62Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass1_Sub2_1 == arg0.aClass1_Sub2Array2[local22]) {
					continue label51;
				}
			}
			local31 = Static245.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static447.aClass62Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass1_Sub2_1 == arg0.aClass1_Sub2Array2[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt2369 - 1; local93++) {
				arg0.aClass1_Sub2Array2[local93] = arg0.aClass1_Sub2Array2[local93 + 1];
			}
			arg0.anInt2369--;
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(III)Z")
	public static boolean method6031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static530.method7340(arg0, arg1) | Static334.method5103(arg0, arg1) | Static483.method6631(arg1, arg0)) & Static183.method2894(arg0, arg1);
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(IB)Lclient!ws;")
	public static Class1_Sub1_Sub18 method6032(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub18 local10 = (Class1_Sub1_Sub18) Static189.aClass201_3.method4927((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static409.aClass171_126.method4339(arg0, 0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local10 = Static350.method5288(local25);
			Static189.aClass201_3.method4925(local10, (long) arg0);
			return local10;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IJ)V")
	public static void method6033(@OriginalArg(1) long arg0) {
		if (Static242.aClass255ArrayArrayArray2 != null) {
			if (Static448.anInt7701 == 1 || Static448.anInt7701 == 5) {
				Static24.method565(arg0);
			} else if (Static448.anInt7701 == 4) {
				Static504.method6971(arg0);
			}
		}
		Static409.method6080(Static513.aClass122_10, (long) Static436.anInt6850);
		if (Static170.anInt3050 != -1) {
			Static383.method4918(Static170.anInt3050);
		}
		for (@Pc(41) int local41 = 0; local41 < Static422.anInt7388; local41++) {
			if (Static3.aBooleanArray1[local41]) {
				Static236.aBooleanArray29[local41] = true;
			}
			Static389.aBooleanArray42[local41] = Static3.aBooleanArray1[local41];
			Static3.aBooleanArray1[local41] = false;
		}
		Static546.anInt2819 = Static436.anInt6850;
		if (Static513.aClass122_10.method7267()) {
			Static305.aBoolean408 = true;
		}
		if (Static170.anInt3050 != -1) {
			Static422.anInt7388 = 0;
			Static306.method4839();
		}
		Static513.aClass122_10.n();
		Static106.method1795(Static513.aClass122_10);
		@Pc(92) int local92 = Static87.method1481();
		if (local92 == -1) {
			local92 = Static108.anInt2198;
		}
		if (local92 == -1) {
			local92 = Static457.anInt7785;
		}
		Static210.method3586(local92);
		Static107.method1832(Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141, Static152.anInt2791, Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137, Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98);
		Static152.anInt2791 = 0;
	}
}

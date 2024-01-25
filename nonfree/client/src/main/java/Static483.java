import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!tca", name = "D", descriptor = "Lclient!kba;")
	public static Class119 aClass119_1;

	@OriginalMember(owner = "client!tca", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString100 = null;

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!pq;IIIZI)V")
	public static void method6704(@OriginalArg(0) Class251 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static466.aClass251_130 = arg0;
		Static396.aBoolean490 = false;
		Static192.anInt3325 = arg1;
		Static259.anInt4237 = arg2;
		Static140.anInt2527 = 1;
		Static221.anInt3764 = 10000;
		Static74.anInt1223 = 0;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(I[B)[B")
	public static byte[] method6705(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static585.method3080(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(B[ILclient!pea;I[II)Lclient!kfa;")
	public static Class16_Sub3 method6706(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class121_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg4 * arg2];
		for (@Pc(20) int local20 = 0; local20 < arg4; local20++) {
			@Pc(30) int local30 = arg0[local20] + arg2 * local20;
			for (@Pc(32) int local32 = 0; local32 < arg3[local20]; local32++) {
				local10[local30++] = -1;
			}
		}
		return new Class16_Sub3(arg1, arg2, arg4, local10);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(DB)V")
	public static void method6707(@OriginalArg(0) double arg0) {
		if (arg0 == Static320.aDouble2) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(27) int local27 = (int) (Math.pow((double) local15 / 255.0D, arg0) * 255.0D);
			Static299.anIntArray459[local15] = local27 <= 255 ? local27 : 255;
		}
		Static320.aDouble2 = arg0;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!cga;IIIII)V")
	public static void method6708(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt29 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static140.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class178 local35 = Static149.aClass178Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt29; local37++) {
							if (arg0.aClass6_Sub7Array2[local37] == local35.aClass6_Sub7_2) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass6_Sub7Array2[arg0.anInt29++] = local35.aClass6_Sub7_2;
						if (arg0.anInt29 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt29; local7 < 4; local7++) {
			arg0.aClass6_Sub7Array2[local7] = null;
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BJLjava/lang/String;Z)V")
	public static void method6709(@OriginalArg(1) long arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		if (arg2) {
			Static156.method2290();
			if (Static187.aString49.equals("")) {
				Static102.anInt1886 = 39;
				return;
			}
		}
		@Pc(19) Class6_Sub14 local19 = new Class6_Sub14(576);
		local19.method6035(10);
		local19.method5999((int) (Math.random() * 65535.0D));
		local19.method6007(arg0);
		local19.method5999(arg2 ? Static538.anInt9113 : Static323.anInt5822);
		local19.method5989(arg1);
		local19.method6007(arg2 ? Static378.aLong175 : Static421.aLong191);
		if (arg2) {
			local19.method6007(Static230.method3382(Static187.aString49));
			try {
				local19.method6007(Long.parseLong(Static209.aString53));
			} catch (@Pc(115) Exception local115) {
				Static102.anInt1886 = 39;
				return;
			}
		} else {
			local19.method5990((int) (Math.random() * 9.9999999E7D));
			local19.method5990((int) (Math.random() * 9.9999999E7D));
			local19.method5990((int) (Math.random() * 9.9999999E7D));
			local19.method5990((int) (Math.random() * 9.9999999E7D));
		}
		local19.method5990((int) (Math.random() * 9.9999999E7D));
		local19.method6042(Static568.aBigInteger8, Static21.aBigInteger1);
		Static218.aClass6_Sub14_Sub2_1.anInt7244 = 0;
		Static218.aClass6_Sub14_Sub2_1.method6035(arg2 ? Static184.aClass14_12.anInt222 : Static184.aClass14_9.anInt222);
		Static218.aClass6_Sub14_Sub2_1.method5999(local19.anInt7244 + 28);
		Static218.aClass6_Sub14_Sub2_1.method5999(613);
		Static218.aClass6_Sub14_Sub2_1.method6035(Static470.anInt7957);
		Static218.aClass6_Sub14_Sub2_1.method6035(Static57.aClass314_1.anInt8647);
		Static11.method184(Static218.aClass6_Sub14_Sub2_1);
		Static218.aClass6_Sub14_Sub2_1.method6039(local19.anInt7244, local19.aByteArray88);
		Static102.anInt1886 = -3;
		Static225.anInt3804 = 0;
		Static154.anInt2734 = 1;
		Static215.anInt3681 = 0;
	}
}

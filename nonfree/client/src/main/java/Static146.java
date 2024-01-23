import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
	public static int anInt2691;

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "Lclient!ak;")
	public static Class7 aClass7_124;

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
	public static int anInt2695;

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "[I")
	public static int[] anIntArray337 = new int[14];

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
	public static int anInt2693 = -1;

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "Z")
	public static boolean aBoolean190 = false;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)I")
	public static int method2279() {
		return Static110.aClass31_18.method849();
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method2280(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)Z")
	public static boolean method2281() {
		try {
			if (Static137.anInt3867 == 2) {
				if (Static123.aClass1_Sub33_1 == null) {
					Static123.aClass1_Sub33_1 = Static310.method4539(Static262.aClass7_210, Static279.anInt5596, Static289.anInt5738);
					if (Static123.aClass1_Sub33_1 == null) {
						return false;
					}
				}
				if (Static13.aClass42_2 == null) {
					Static13.aClass42_2 = new Class42(Static230.aClass7_187, Static218.aClass7_56);
				}
				if (Static256.aClass1_Sub8_Sub4_3.method4237(Static13.aClass42_2, Static123.aClass1_Sub33_1, Static76.aClass7_76)) {
					Static256.aClass1_Sub8_Sub4_3.method4220();
					Static256.aClass1_Sub8_Sub4_3.method4218(Static186.anInt3480);
					Static256.aClass1_Sub8_Sub4_3.method4222(Static17.aBoolean34, Static123.aClass1_Sub33_1);
					Static13.aClass42_2 = null;
					Static262.aClass7_210 = null;
					Static137.anInt3867 = 0;
					Static123.aClass1_Sub33_1 = null;
					return true;
				}
			}
		} catch (@Pc(70) Exception local70) {
			local70.printStackTrace();
			Static256.aClass1_Sub8_Sub4_3.method4223();
			Static137.anInt3867 = 0;
			Static13.aClass42_2 = null;
			Static262.aClass7_210 = null;
			Static123.aClass1_Sub33_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(III)V")
	public static void method2282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static167.aBoolean234 = true;
		Static185.anInt3456 = arg0;
		Static107.anInt1993 = arg1;
		Static102.anInt1932 = arg2;
		Static186.anInt3478 = -1;
		Static228.anInt4527 = -1;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZIIIZZJZI)V")
	public static void method2284(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) long arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(30) Class1_Sub18 local30 = new Class1_Sub18(128);
		local30.method3093(10);
		local30.method3123((arg2 ? 2 : 0) | (arg8 ? 1 : 0) | (arg6 ? 4 : 0));
		local30.method3091(arg7);
		local30.method3119(local8[0]);
		local30.method3067(arg1);
		local30.method3119(local8[1]);
		local30.method3123(Static129.anInt3918);
		local30.method3093(arg9);
		local30.method3093(arg4);
		local30.method3119(local8[2]);
		local30.method3123(arg3);
		local30.method3123(arg5);
		local30.method3119(local8[3]);
		local30.method3058(Static62.aBigInteger2, Static46.aBigInteger1);
		@Pc(116) Class1_Sub18 local116 = new Class1_Sub18(350);
		local116.method3067(arg0);
		@Pc(129) int local129 = 8 - Static94.method1537(arg0) % 8;
		for (@Pc(131) int local131 = 0; local131 < local129; local131++) {
			local116.method3093((int) (Math.random() * 255.0D));
		}
		local116.method3077(local8);
		Static270.aClass1_Sub18_Sub1_3.anInt3911 = 0;
		Static270.aClass1_Sub18_Sub1_3.method3093(22);
		Static270.aClass1_Sub18_Sub1_3.method3123(local116.anInt3911 + local30.anInt3911 + 2);
		Static270.aClass1_Sub18_Sub1_3.method3123(540);
		Static270.aClass1_Sub18_Sub1_3.method3080(local30.anInt3911, local30.aByteArray71);
		Static270.aClass1_Sub18_Sub1_3.method3080(local116.anInt3911, local116.aByteArray71);
		Static109.anInt2050 = -3;
		Static176.anInt3258 = 1;
		Static280.anInt5602 = 0;
		Static205.anInt4083 = 0;
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(III)Lclient!v;")
	public static Class167 method2285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub19 local7 = Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass167_1 == null ? null : local7.aClass167_1;
	}
}

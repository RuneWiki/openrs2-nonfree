import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "Lclient!oe;")
	public static Class72 aClass72_39;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
	public static int anInt575;

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "Lclient!qe;")
	private static Class78 aClass78_104 = Static199.method3560("Loaded config");

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "[I")
	public static int[] anIntArray102 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "Lclient!qe;")
	public static Class78 aClass78_105 = Static199.method3560("(U1");

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "Lclient!qe;")
	public static Class78 aClass78_106 = aClass78_104;

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "Lclient!qe;")
	private static Class78 aClass78_107 = Static199.method3560("Ok");

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "Lclient!qe;")
	public static Class78 aClass78_108 = aClass78_107;

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "[I")
	public static int[] anIntArray103 = new int[5];

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083");

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "Lclient!qe;")
	public static Class78 aClass78_109 = Static199.method3560("M");

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V")
	public static void method423(@OriginalArg(0) boolean arg0) {
		if (Static154.aClass105_3 == null) {
			return;
		}
		try {
			@Pc(17) Class2_Sub23 local17 = new Class2_Sub23(4);
			local17.method2132(arg0 ? 2 : 3);
			local17.method2112(0);
			Static154.aClass105_3.method3692(local17.aByteArray41, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				Static154.aClass105_3.method3695();
			} catch (@Pc(43) Exception local43) {
			}
			Static154.aClass105_3 = null;
			Static101.anInt2212++;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)Lclient!oj;")
	public static Class2_Sub3_Sub22 method424(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub3_Sub22 local15 = (Class2_Sub3_Sub22) Static140.aClass110_12.method3891((long) arg0);
		if (local15 != null) {
			return local15;
		}
		local15 = Static84.method1465(Static127.aClass72_281, arg0, Static184.aClass72_254);
		if (local15 != null) {
			Static140.aClass110_12.method3894(local15, (long) arg0);
		}
		return local15;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!mj;I)Z")
	public static boolean method426(@OriginalArg(0) Class64 arg0) {
		if (arg0.anInt3002 == 205) {
			Static58.anInt1022 = 250;
			return true;
		} else {
			return false;
		}
	}
}

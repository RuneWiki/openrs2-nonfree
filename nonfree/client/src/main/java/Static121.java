import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!eo", name = "p", descriptor = "Lclient!gf;")
	public static Class118 aClass118_2;

	@OriginalMember(owner = "client!eo", name = "t", descriptor = "[I")
	public static int[] anIntArray272;

	@OriginalMember(owner = "client!eo", name = "y", descriptor = "F")
	public static float aFloat57;

	@OriginalMember(owner = "client!eo", name = "D", descriptor = "I")
	public static int anInt3868;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "([BZ)[B")
	public static byte[] method3341(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static602.method4666(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method3342(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		Static572.method8181();
		Static322.method5584();
		Static120.method2388();
		Static490.method7466(arg0, arg1);
		Static58.method1492();
		Static282.method4861(Static546.aClass15_16);
		Static107.method2267(Static546.aClass15_16);
		Static591.method8342(Static546.aClass15_16, Static579.aClass254_137);
		Static134.method6550();
		Static57.method1334(Static541.aClass37Array12);
		Static210.method3686();
		Static49.method1242();
		if (Static75.anInt1880 == 3) {
			Static168.method3104(4);
		} else if (Static75.anInt1880 == 7) {
			Static168.method3104(8);
		} else if (Static75.anInt1880 == 10) {
			Static168.method3104(11);
		} else if (Static75.anInt1880 == 1 || Static75.anInt1880 == 2) {
			Static1.method124();
		}
	}
}

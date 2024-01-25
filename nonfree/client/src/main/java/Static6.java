import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_3 = new Class131(56, -1);

	@OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
	public static final int anInt217 = 205;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIB)Z")
	public static boolean method197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static147.method2220(arg0, arg1) || Static243.method3589(arg0, arg1);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!vh;ILclient!vh;Lclient!vh;Lclient!vh;)V")
	public static void method200(@OriginalArg(0) Class250 arg0, @OriginalArg(2) Class250 arg1, @OriginalArg(3) Class250 arg2, @OriginalArg(4) Class250 arg3) {
		Static136.aClass250_26 = arg3;
		Static434.aClass250_91 = arg2;
		Static60.aClass250_13 = arg0;
		Static100.aClass250_22 = arg1;
		Static448.aClass219ArrayArray2 = new Class219[Static136.aClass250_26.method5666()][];
		Static164.aBooleanArray22 = new boolean[Static136.aClass250_26.method5666()];
	}
}

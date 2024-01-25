import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!oda", name = "g", descriptor = "I")
	public static int anInt6310 = 0;

	@OriginalMember(owner = "client!oda", name = "h", descriptor = "[I")
	public static final int[] anIntArray505 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIILclient!dda;)Lclient!bt;")
	public static Class29 method5377(@OriginalArg(2) int arg0, @OriginalArg(3) Class53 arg1) {
		@Pc(9) byte[] local9 = arg1.method1616(0, arg0);
		return local9 == null ? null : new Class29(local9);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(II)V")
	public static void method5378(@OriginalArg(1) int arg0) {
		Static144.anInt2659 = arg0;
		@Pc(7) Class231 local7 = Static8.aClass231_2;
		synchronized (Static8.aClass231_2) {
			Static8.aClass231_2.method6240();
		}
		local7 = Static421.aClass231_60;
		synchronized (Static421.aClass231_60) {
			Static421.aClass231_60.method6240();
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(III)Z")
	public static boolean method5379(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static63.method1151(arg0, arg1) | Static381.method5974(arg0, arg1) | Static412.method6448(arg1, arg0)) & Static204.method3281(arg0, arg1);
	}
}

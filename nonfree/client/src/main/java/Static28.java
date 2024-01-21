import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "[I")
	public static int[] anIntArray84;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
	public static int anInt758;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "Lclient!ja;")
	private static Class39 aClass39_399 = method504("flash3:");

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "Lclient!ja;")
	public static Class39 aClass39_396 = aClass39_399;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Lclient!ja;")
	public static Class39 aClass39_397 = method504(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Lclient!ja;")
	public static Class39 aClass39_398 = method504("Freie Welt");

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "Lclient!ja;")
	private static Class39 aClass39_403 = method504("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "Lclient!ja;")
	public static Class39 aClass39_400 = aClass39_403;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
	public static int anInt759 = 0;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "Lclient!ja;")
	private static Class39 aClass39_402 = method504("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Lclient!ja;")
	public static Class39 aClass39_401 = aClass39_402;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Lclient!ja;")
	public static Class39 aClass39_404 = aClass39_399;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILjava/lang/String;)Lclient!ja;")
	public static Class39 method504(@OriginalArg(1) String arg0) {
		@Pc(13) byte[] local13 = arg0.getBytes();
		@Pc(16) int local16 = local13.length;
		@Pc(18) int local18 = 0;
		@Pc(22) Class39 local22 = new Class39();
		local22.aByteArray10 = new byte[local16];
		while (local16 > local18) {
			@Pc(34) int local34 = local13[local18++] & 0xFF;
			if (local34 <= 45 && local34 >= 40) {
				if (local18 >= local16) {
					break;
				}
				@Pc(74) int local74 = local13[local18++] & 0xFF;
				local22.aByteArray10[local22.anInt1481++] = (byte) (local74 + (local34 + -40) * 43 - 48);
			} else if (local34 != 0) {
				local22.aByteArray10[local22.anInt1481++] = (byte) local34;
			}
		}
		local22.method930();
		return local22.method948();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
	public static void method505() {
		aClass39_403 = null;
		aClass39_400 = null;
		aClass39_402 = null;
		aClass39_399 = null;
		aClass39_404 = null;
		aClass39_398 = null;
		anIntArray84 = null;
		aClass39_396 = null;
		aClass39_401 = null;
		aClass39_397 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIBIIIII)V")
	public static void method506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static27.method502(arg6)) {
			Static11.method226(arg0, arg2, Static109.aClass4_Sub5ArrayArray1[arg6], arg1, -1, arg5, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBI)V")
	public static void method507(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static98.anInt1022 == 2) {
			Static65.method1152(Static43.anInt1113 + (Static70.anInt1732 - Static36.anInt909 << 7), Static129.anInt3148 * 2, Static104.anInt2569 + (Static123.anInt3042 - Static24.anInt503 << 7));
			if (Static101.anInt2516 > -1 && Static71.anInt1738 % 20 < 10) {
				Static97.aClass4_Sub2_Sub3_Sub1Array9[0].method876(arg1 + Static101.anInt2516 - 12, Static59.anInt1553 + -28 + arg0);
			}
		}
	}
}

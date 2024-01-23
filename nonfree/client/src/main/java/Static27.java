import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "[I")
	public static int[] anIntArray230;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "[[[Lclient!eg;")
	public static Class2_Sub7[][][] aClass2_Sub7ArrayArrayArray4;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Lclient!i;")
	private static Class41 aClass41_676 = Static184.method2923("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "Lclient!i;")
	private static Class41 aClass41_680 = Static184.method2923("No response from server)3");

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Lclient!i;")
	public static Class41 aClass41_677 = aClass41_680;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
	public static int anInt2299 = 0;

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "Lclient!i;")
	public static Class41 aClass41_678 = aClass41_676;

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
	public static int anInt2300 = 1;

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "Lclient!i;")
	private static Class41 aClass41_683 = Static184.method2923("yellow:");

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "Lclient!i;")
	public static Class41 aClass41_679 = aClass41_683;

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "Z")
	public static boolean aBoolean122 = false;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "Lclient!i;")
	public static Class41 aClass41_681 = aClass41_683;

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "Lclient!i;")
	public static Class41 aClass41_682 = Static184.method2923("gleiten:");

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "Lclient!i;")
	public static Class41 aClass41_684 = Static184.method2923("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method1631() {
		Static131.aClass2_Sub3_Sub1_2.method221(24);
		for (@Pc(14) Class2_Sub21 local14 = (Class2_Sub21) Static113.aClass70_8.method2203(); local14 != null; local14 = (Class2_Sub21) Static113.aClass70_8.method2204()) {
			if (local14.anInt3439 == 0) {
				Static81.method1471(local14, true);
			}
		}
		if (Static48.aClass80_5 != null) {
			Static176.method2833(Static48.aClass80_5);
			Static48.aClass80_5 = null;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
	public static void method1632(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class108 local11 = Static119.aClass108ArrayArrayArray1[Static134.anInt3147][arg0][arg1];
		if (local11 == null) {
			Static25.method3301(Static134.anInt3147, arg0, arg1);
			return;
		}
		@Pc(20) int local20 = -99999999;
		@Pc(22) Class2_Sub2_Sub23 local22 = null;
		@Pc(32) Class2_Sub2_Sub23 local32;
		for (local32 = (Class2_Sub2_Sub23) local11.method3322(); local32 != null; local32 = (Class2_Sub2_Sub23) local11.method3331()) {
			@Pc(39) Class2_Sub2_Sub15 local39 = Static63.method1158(local32.aClass12_Sub7_1.anInt2384);
			@Pc(42) int local42 = local39.anInt3108;
			if (local39.anInt3106 == 1) {
				local42 *= local32.aClass12_Sub7_1.anInt2383 + 1;
			}
			if (local42 > local20) {
				local22 = local32;
				local20 = local42;
			}
		}
		if (local22 == null) {
			Static25.method3301(Static134.anInt3147, arg0, arg1);
			return;
		}
		@Pc(77) Class12_Sub7 local77 = null;
		local11.method3327(local22);
		@Pc(83) Class12_Sub7 local83 = null;
		for (local32 = (Class2_Sub2_Sub23) local11.method3322(); local32 != null; local32 = (Class2_Sub2_Sub23) local11.method3331()) {
			@Pc(92) Class12_Sub7 local92 = local32.aClass12_Sub7_1;
			if (local22.aClass12_Sub7_1.anInt2384 != local92.anInt2384) {
				if (local77 == null) {
					local77 = local92;
				}
				if (local92.anInt2384 != local77.anInt2384 && local83 == null) {
					local83 = local92;
				}
			}
		}
		@Pc(131) long local131 = (long) (arg0 + (arg1 << 7) + 1610612736);
		Static82.method1493(Static134.anInt3147, arg0, arg1, Static212.method3261(arg0 * 128 + 64, arg1 * 128 - -64, Static134.anInt3147), local22.aClass12_Sub7_1, local131, local77, local83);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lclient!vh;")
	public static Class2_Sub2_Sub26 method1636(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub2_Sub26 local6 = (Class2_Sub2_Sub26) Static209.aClass43_24.method1464((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static28.aClass15_2.method387(arg0, 1);
		local6 = new Class2_Sub2_Sub26();
		if (local20 != null) {
			local6.method3249(arg0, new Class2_Sub3(local20));
		}
		Static209.aClass43_24.method1462((long) arg0, local6);
		return local6;
	}
}

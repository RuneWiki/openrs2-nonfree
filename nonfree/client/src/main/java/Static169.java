import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	public static int anInt3955;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[S")
	public static short[] aShortArray49;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "[I")
	public static int[] anIntArray437 = new int[128];

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1365 = Static161.method2971("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1366 = aClass13_1365;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	public static void method2885() {
		aShortArray49 = null;
		aClass13_1366 = null;
		anIntArray437 = null;
		aClass13_1365 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3 method2886() {
		@Pc(14) Class1_Sub2_Sub1_Sub3 local14 = new Class1_Sub2_Sub1_Sub3();
		local14.anInt357 = Static106.anIntArray285[0];
		local14.anInt358 = Static12.anIntArray51[0];
		local14.anInt359 = Static130.anIntArray324[0];
		local14.anInt355 = Static184.anIntArray449[0];
		local14.anInt354 = Static32.anInt4094;
		local14.anInt356 = Static51.anInt1673;
		@Pc(46) int local46 = local14.anInt358 * local14.anInt357;
		@Pc(50) byte[] local50 = Static180.aByteArrayArray10[0];
		local14.anIntArray45 = new int[local46];
		for (@Pc(56) int local56 = 0; local56 < local46; local56++) {
			local14.anIntArray45[local56] = Static104.anIntArray268[local50[local56] & 0xFF];
		}
		Static111.method2163();
		return local14;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!dd;ILclient!dd;I)V")
	public static void method2887(@OriginalArg(0) Class13 arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2) {
		Static134.method2402(arg1, arg0, null, arg2);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)J")
	public static synchronized long method2888() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static34.aLong41 > local5) {
			Static51.aLong56 += Static34.aLong41 - local5;
		}
		Static34.aLong41 = local5;
		return local5 + Static51.aLong56;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLclient!fd;)Lclient!fd;")
	public static Class20 method2889(@OriginalArg(1) Class20 arg0) {
		@Pc(12) Class20 local12 = Static71.method1486(arg0);
		if (local12 == null) {
			local12 = arg0.aClass20_4;
		}
		return local12;
	}
}

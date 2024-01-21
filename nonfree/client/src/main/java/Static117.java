import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "[I")
	public static int[] anIntArray368;

	@OriginalMember(owner = "client!ub", name = "Y", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
	public static int anInt3069 = 0;

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
	public static int anInt3072 = 0;

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6 = new int[4][105][105];

	@OriginalMember(owner = "client!ub", name = "P", descriptor = "Lclient!he;")
	public static Class26 aClass26_1650 = Static6.method100("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "Z")
	public static boolean aBoolean168 = false;

	@OriginalMember(owner = "client!ub", name = "T", descriptor = "Z")
	public static boolean aBoolean169 = false;

	@OriginalMember(owner = "client!ub", name = "V", descriptor = "Lclient!he;")
	public static Class26 aClass26_1651 = Static6.method100("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!ub", name = "bb", descriptor = "Lclient!he;")
	private static Class26 aClass26_1652 = Static6.method100("Loaded update list");

	@OriginalMember(owner = "client!ub", name = "eb", descriptor = "[I")
	public static int[] anIntArray370 = new int[2048];

	@OriginalMember(owner = "client!ub", name = "fb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1653 = aClass26_1652;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)Lclient!je;")
	public static Class3_Sub1_Sub9 method2099(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub9 local10 = (Class3_Sub1_Sub9) Static25.aClass66_27.method1970((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static95.aClass16_115.method566(10, arg0);
		local10 = new Class3_Sub1_Sub9();
		local10.anInt1674 = arg0;
		if (local25 != null) {
			local10.method1130(new Class3_Sub11(local25));
		}
		local10.method1127();
		if (local10.anInt1699 != -1) {
			local10.method1136(method2099(local10.anInt1692), method2099(local10.anInt1699));
		}
		if (!Static57.aBoolean92 && local10.aBoolean90) {
			local10.anInt1706 = 0;
			local10.aClass26Array14 = null;
			local10.aClass26_857 = Static72.aClass26_1039;
			local10.aClass26Array15 = null;
		}
		Static25.aClass66_27.method1969((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V")
	public static void method2101() {
		anIntArray368 = null;
		anIntArray370 = null;
		aByteArrayArray19 = null;
		aClass26_1651 = null;
		aClass26_1650 = null;
		aClass26_1652 = null;
		anIntArrayArrayArray6 = null;
		aClass26_1653 = null;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	public static void method2102() {
		while (true) {
			@Pc(11) Class65 local11 = Static59.aClass65_45;
			@Pc(18) Class3_Sub13 local18;
			synchronized (Static59.aClass65_45) {
				local18 = (Class3_Sub13) Static23.aClass65_34.method1959();
			}
			if (local18 == null) {
				return;
			}
			local18.aClass16_Sub1_10.method582(local18.aClass12_4, (int) local18.aLong100, local18.aByteArray21, false);
		}
	}
}

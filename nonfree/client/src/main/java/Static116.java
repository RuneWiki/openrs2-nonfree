import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!of", name = "f", descriptor = "I")
	public static int anInt2752;

	@OriginalMember(owner = "client!of", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!of", name = "s", descriptor = "I")
	public static int anInt2760;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "[Lclient!kb;")
	public static Class46[] aClass46Array16 = new Class46[1000];

	@OriginalMember(owner = "client!of", name = "e", descriptor = "Lclient!kb;")
	public static Class46 aClass46_954 = Static65.method1172("sl_arrows");

	@OriginalMember(owner = "client!of", name = "g", descriptor = "Lclient!kb;")
	public static Class46 aClass46_955 = Static65.method1172(" x ");

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
	public static void method1957() {
		Static94.anIntArray232 = null;
		Static152.anIntArray395 = null;
		Static179.anIntArray439 = null;
		Static174.aByteArrayArrayArray6 = null;
		Static60.aByteArrayArrayArray4 = null;
		Static175.aByteArrayArrayArray7 = null;
		Static58.aByteArrayArrayArray3 = null;
		Static32.aByteArrayArrayArray2 = null;
		Static156.anIntArray401 = null;
		Static161.anIntArray407 = null;
		Static83.anIntArrayArrayArray5 = null;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
	public static void method1959() {
		aClass46Array16 = null;
		aClass46_955 = null;
		aClass46_954 = null;
		aByteArrayArray11 = null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method1960(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IJ)Lclient!kb;")
	public static Class46 method1961(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % (long) 37 == 0L) {
			return null;
		} else {
			@Pc(28) long local28 = arg0;
			@Pc(30) int local30 = 0;
			while (local28 != 0L) {
				local30++;
				local28 /= 37L;
			}
			@Pc(44) byte[] local44 = new byte[local30];
			while (arg0 != 0L) {
				@Pc(48) long local48 = arg0;
				arg0 /= 37L;
				local30--;
				local44[local30] = Static102.aByteArray19[(int) (local48 - arg0 * 37L)];
			}
			@Pc(73) Class46 local73 = new Class46();
			local73.aByteArray17 = local44;
			local73.anInt2034 = local44.length;
			return local73;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!kb;)V")
	public static void method1963(@OriginalArg(1) Class46 arg0) {
		if (Static86.aClass3_Sub17Array1 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(14) long local14 = arg0.method1348();
		if (local14 == (long) 0) {
			return;
		}
		while (Static86.aClass3_Sub17Array1.length > local10 && Static86.aClass3_Sub17Array1[local10].aLong143 != local14) {
			local10++;
		}
		if (local10 < Static86.aClass3_Sub17Array1.length && Static86.aClass3_Sub17Array1[local10] != null) {
			Static133.aClass3_Sub4_Sub1_3.method233(214);
			Static133.aClass3_Sub4_Sub1_3.method201(Static86.aClass3_Sub17Array1[local10].aLong143);
		}
	}
}

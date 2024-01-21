import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Lclient!ae;")
	public static Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_4;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Lclient!id;")
	private static Class34 aClass34_1009 = Static9.method266("Loading textures )2 ");

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!id;")
	public static Class34 aClass34_1006 = aClass34_1009;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Lclient!id;")
	private static Class34 aClass34_1008 = Static9.method266("Loading fonts )2 ");

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Lclient!id;")
	public static Class34 aClass34_1007 = aClass34_1008;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Lclient!id;")
	private static Class34 aClass34_1010 = Static9.method266(" is already on your ignore list");

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "Lclient!id;")
	public static Class34 aClass34_1011 = aClass34_1010;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "Lclient!id;")
	public static Class34 aClass34_1012 = Static9.method266("mn");

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
	public static int anInt2049 = 0;

	@OriginalMember(owner = "client!mc", name = "x", descriptor = "Lclient!id;")
	public static Class34 aClass34_1013 = Static9.method266("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public static void method1338() {
		Static69.aByteArrayArrayArray7 = null;
		Static84.anIntArrayArray23 = null;
		Static21.aByteArrayArrayArray6 = null;
		Static16.aByteArrayArrayArray5 = null;
		Static6.aByteArrayArrayArray1 = null;
		Static100.anIntArray315 = null;
		Static127.aByteArrayArrayArray8 = null;
		Static16.anIntArray63 = null;
		Static50.anIntArrayArrayArray1 = null;
		Static93.anIntArray307 = null;
		Static76.anIntArray232 = null;
		Static113.anIntArray342 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIBII)V")
	public static void method1339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static76.anInt2054; local3++) {
			if (arg0 < Static34.anIntArray99[local3] + Static17.anIntArray64[local3] && Static17.anIntArray64[local3] < arg0 + arg3 && Static12.anIntArray39[local3] + Static32.anIntArray151[local3] > arg2 && Static12.anIntArray39[local3] < arg1 + arg2) {
				Static43.aBooleanArray8[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
	public static void method1342() {
		Static21.aClass1_Sub19_Sub1_1.method2105(172);
		for (@Pc(17) Class1_Sub16 local17 = (Class1_Sub16) Static35.aClass48_5.method1337(); local17 != null; local17 = (Class1_Sub16) Static35.aClass48_5.method1335()) {
			if (local17.anInt1897 == 0 || local17.anInt1897 == 3) {
				Static95.method1619(local17, true);
			}
		}
		if (Static105.aClass1_Sub9_13 != null) {
			Static10.method277(Static105.aClass1_Sub9_13);
			Static105.aClass1_Sub9_13 = null;
		}
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
	public static void method1343() {
		aClass34_1007 = null;
		aClass34_1008 = null;
		aClass34_1009 = null;
		aClass34_1012 = null;
		aClass1_Sub1_Sub2_Sub1_4 = null;
		aClass34_1011 = null;
		aClass34_1010 = null;
		aClass34_1006 = null;
		aClass34_1013 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILclient!ie;ZLclient!ie;)Lclient!ge;")
	public static Class1_Sub1_Sub7 method1344(@OriginalArg(0) int arg0, @OriginalArg(2) Class35 arg1, @OriginalArg(4) Class35 arg2) {
		@Pc(8) int[] local8 = arg1.method1580(arg0);
		@Pc(10) boolean local10 = true;
		for (@Pc(12) int local12 = 0; local12 < local8.length; local12++) {
			@Pc(21) byte[] local21 = arg1.method1577(local8[local12], arg0);
			if (local21 == null) {
				local10 = false;
			} else {
				@Pc(40) int local40 = local21[1] & 0xFF | (local21[0] & 0xFF) << 8;
				@Pc(48) byte[] local48 = arg2.method1577(0, local40);
				if (local48 == null) {
					local10 = false;
				}
			}
		}
		if (!local10) {
			return null;
		}
		try {
			return new Class1_Sub1_Sub7(arg1, arg2, arg0, false);
		} catch (@Pc(85) Exception local85) {
			return null;
		}
	}
}

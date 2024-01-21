import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!e", name = "n", descriptor = "I")
	public static int anInt734;

	@OriginalMember(owner = "client!e", name = "r", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Lclient!fc;")
	private static Class25 aClass25_324 = Static78.method1313("as it was used to break our rules)3");

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Lclient!fc;")
	public static Class25 aClass25_321 = aClass25_324;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "I")
	public static int anInt728 = 0;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!fc;")
	public static Class25 aClass25_322 = Static78.method1313("(Y");

	@OriginalMember(owner = "client!e", name = "i", descriptor = "Lclient!fc;")
	public static Class25 aClass25_323 = Static78.method1313("Lade Texturen )2 ");

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Lclient!aa;")
	public static Class2 aClass2_4 = new Class2();

	@OriginalMember(owner = "client!e", name = "o", descriptor = "Lclient!fc;")
	public static Class25 aClass25_325 = Static78.method1313("welle2:");

	@OriginalMember(owner = "client!e", name = "q", descriptor = "Lclient!fc;")
	private static Class25 aClass25_327 = Static78.method1313("Enter object name");

	@OriginalMember(owner = "client!e", name = "p", descriptor = "Lclient!fc;")
	public static Class25 aClass25_326 = aClass25_327;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!ua;I)V")
	public static void method592(@OriginalArg(0) Class76 arg0) {
		Static129.aClass76_1 = arg0;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)Lclient!jd;")
	public static Class41 method593() {
		try {
			return (Class41) Class.forName("Class41_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!fc;Lclient!fc;Lclient!oc;)Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4 method594(@OriginalArg(1) Class25 arg0, @OriginalArg(2) Class25 arg1, @OriginalArg(3) Class56 arg2) {
		@Pc(8) int local8 = arg2.method1278(arg1);
		@Pc(19) int local19 = arg2.method1264(arg0, local8);
		return method599(local8, arg2, local19);
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
	public static void method595() {
		aByteArrayArrayArray1 = null;
		aClass25_326 = null;
		aClass25_322 = null;
		aClass25_324 = null;
		aClass2_4 = null;
		aClass25_325 = null;
		aClass25_327 = null;
		aClass25_323 = null;
		aClass25_321 = null;
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)J")
	public static synchronized long method596() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (Static3.aLong5 > local10) {
			Static103.aLong177 += Static3.aLong5 - local10;
		}
		Static3.aLong5 = local10;
		return local10 + Static103.aLong177;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!rb;IBLclient!mf;)V")
	public static void method597(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class56_Sub1 arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class2 local9 = Static7.aClass2_2;
		synchronized (Static7.aClass2_2) {
			for (@Pc(16) Class1_Sub15 local16 = (Class1_Sub15) Static7.aClass2_2.method22(); local16 != null; local16 = (Class1_Sub15) Static7.aClass2_2.method23()) {
				if ((long) arg1 == local16.aLong184 && arg0 == local16.aClass70_3 && local16.anInt2097 == 0) {
					local7 = local16.aByteArray22;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(78) byte[] local78 = arg0.method1692(arg1);
			arg2.method1297(arg1, local78, arg0, true);
		} else {
			arg2.method1297(arg1, local7, arg0, true);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I[BII)Lclient!fc;")
	public static Class25 method598(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class25 local9 = new Class25();
		local9.anInt956 = 0;
		local9.aByteArray15 = new byte[arg2];
		for (@Pc(18) int local18 = arg0; local18 < arg0 + arg2; local18++) {
			if (arg1[local18] != 0) {
				local9.aByteArray15[local9.anInt956++] = arg1[local18];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IILclient!oc;I)Lclient!ue;")
	private static Class1_Sub2_Sub2_Sub4 method599(@OriginalArg(1) int arg0, @OriginalArg(2) Class56 arg1, @OriginalArg(3) int arg2) {
		return Static109.method1749(arg2, arg0, arg1) ? Static105.method1693() : null;
	}
}

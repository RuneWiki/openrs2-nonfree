import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "Lclient!mg;")
	public static Class1_Sub1_Sub14 aClass1_Sub1_Sub14_3;

	@OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
	public static int anInt1242;

	@OriginalMember(owner = "client!eh", name = "u", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
	public static int anInt1245;

	@OriginalMember(owner = "client!eh", name = "z", descriptor = "J")
	public static long aLong41;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "Lclient!kh;")
	private static Class60 aClass60_386 = Static200.method3116("Bad session id)3");

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "Lclient!kh;")
	private static Class60 aClass60_388 = Static200.method3116("Please try again)3");

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "Lclient!kh;")
	public static Class60 aClass60_387 = aClass60_388;

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "[Z")
	public static boolean[] aBooleanArray5 = new boolean[112];

	@OriginalMember(owner = "client!eh", name = "s", descriptor = "Lclient!kh;")
	private static Class60 aClass60_391 = Static200.method3116(" has logged in)3");

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "Lclient!kh;")
	public static Class60 aClass60_389 = aClass60_391;

	@OriginalMember(owner = "client!eh", name = "r", descriptor = "Lclient!kh;")
	public static Class60 aClass60_390 = Static200.method3116("Neuer Benutzer");

	@OriginalMember(owner = "client!eh", name = "t", descriptor = "Lclient!kh;")
	public static Class60 aClass60_392 = aClass60_386;

	@OriginalMember(owner = "client!eh", name = "v", descriptor = "Lclient!kh;")
	private static Class60 aClass60_393 = Static200.method3116("Existing User");

	@OriginalMember(owner = "client!eh", name = "w", descriptor = "Lclient!kh;")
	public static Class60 aClass60_394 = aClass60_393;

	@OriginalMember(owner = "client!eh", name = "x", descriptor = "Lclient!kh;")
	public static Class60 aClass60_395 = Static200.method3116("");

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
	public static void method958() {
		Static41.anInt971 = 0;
		Static52.anIntArray164 = null;
		Static147.aClass6_13 = null;
		Static180.aByteArrayArrayArray9 = null;
		Static192.aByteArrayArrayArray11 = null;
		Static153.aByteArrayArrayArray7 = null;
		Static52.anIntArrayArrayArray8 = null;
		Static155.anIntArrayArrayArray19 = null;
		Static185.aByteArrayArrayArray10 = null;
		Static97.aByteArrayArrayArray2 = null;
		Static146.aByteArrayArrayArray6 = null;
		Static137.aClass19_19.method619();
		Static39.aClass19_5.method619();
		Static139.aClass88_5 = null;
		Static64.aClass88_3 = null;
		Static168.aClass88_7 = null;
		Static2.aClass88_1 = null;
		Static93.aClass88_4 = null;
		Static199.aClass88_8 = null;
		Static160.aClass1_Sub1_Sub6_4 = null;
		Static154.aClass88_6 = null;
		Static25.aClass88_2 = null;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
	public static void method959() {
		@Pc(7) int local7 = Static102.anInt2345;
		@Pc(9) int local9 = Static89.anInt2075;
		@Pc(11) int local11 = Static108.anInt2506;
		@Pc(13) int local13 = Static29.anInt709;
		Static76.method1367(local9, local7, local11, local13, 6116423);
		Static76.method1367(local9 + 1, local7 + 1, local11 - 2, 16, 0);
		Static76.method1374(local9 + 1, local7 + 18, local11 - 2, local13 + -19, 0);
		Static176.aClass1_Sub1_Sub14_2.method3317(Static176.aClass60_261, local9 + 3, local7 + 14, 6116423, -1);
		@Pc(65) int local65 = Static122.anInt2732;
		@Pc(67) int local67 = Static176.anInt768;
		for (@Pc(69) int local69 = 0; local69 < Static91.anInt2134; local69++) {
			@Pc(85) int local85 = local7 + (Static91.anInt2134 + -1 + -local69) * 15 + 31;
			@Pc(87) int local87 = 16777215;
			if (local9 < local65 && local9 + local11 > local65 && local67 > local85 - 13 && local67 < local85 + 3) {
				local87 = 16776960;
			}
			Static176.aClass1_Sub1_Sub14_2.method3317(Static114.method1966(local69), local9 + 3, local85, local87, 0);
		}
		Static85.method1481(Static108.anInt2506, Static89.anInt2075, Static29.anInt709, Static102.anInt2345);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)Lclient!o;")
	public static Class73_Sub1 method962() {
		@Pc(30) Class73_Sub1 local30 = new Class73_Sub1(Static97.anInt2261, Static176.anInt777, Static91.anIntArray251[0], Static97.anIntArray263[0], Static181.anIntArray504[0], Static10.anIntArray46[0], Static96.aByteArrayArray4[0], Static110.anIntArray317);
		Static43.method711();
		return local30;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!kh;)I")
	public static int method966(@OriginalArg(1) Class60 arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(19) int local19 = 0; local19 < Static135.anInt2930; local19++) {
			if (arg0.method1805(Static61.aClass60Array9[local19])) {
				return local19;
			}
		}
		return -1;
	}
}

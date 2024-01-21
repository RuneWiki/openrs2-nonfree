import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
	public static int anInt1335;

	@OriginalMember(owner = "client!jd", name = "Z", descriptor = "Lclient!rc;")
	public static Class54 aClass54_1;

	@OriginalMember(owner = "client!jd", name = "cb", descriptor = "[I")
	public static int[] anIntArray144;

	@OriginalMember(owner = "client!jd", name = "M", descriptor = "[I")
	public static int[] anIntArray142 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!jd", name = "P", descriptor = "I")
	public static int anInt1330 = 0;

	@OriginalMember(owner = "client!jd", name = "S", descriptor = "Lclient!qa;")
	public static Class50 aClass50_7 = new Class50(32);

	@OriginalMember(owner = "client!jd", name = "Y", descriptor = "I")
	public static int anInt1337 = 0;

	@OriginalMember(owner = "client!jd", name = "ab", descriptor = "Lclient!va;")
	private static Class61 aClass61_555 = Static88.method1421("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!jd", name = "bb", descriptor = "[I")
	public static int[] anIntArray143 = new int[5];

	@OriginalMember(owner = "client!jd", name = "db", descriptor = "Lclient!va;")
	public static Class61 aClass61_556 = aClass61_555;

	@OriginalMember(owner = "client!jd", name = "fb", descriptor = "[Lclient!va;")
	public static Class61[] aClass61Array8 = new Class61[100];

	@OriginalMember(owner = "client!jd", name = "gb", descriptor = "Lclient!i;")
	public static Class29 aClass29_36 = new Class29(64);

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public static void method752() {
		if (Static99.aClass27_4 != null) {
			Static99.aClass27_4.method610();
		}
		Static99.aClass27_4 = null;
		Static80.method1256();
		aClass54_1.method1379();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static15.aClass12Array1[local18].method262();
		}
		System.gc();
		Static15.method345();
		Static70.anInt2671 = 0;
		Static47.anInt1303 = -1;
		Static50.method780(10);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!he;Lclient!he;ZII)Lclient!hd;")
	public static Class10_Sub1_Sub7 method753(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg1.method223(arg2);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(26) byte[] local26 = arg1.method209(local12[local14], arg2);
			if (local26 == null) {
				local7 = false;
			} else {
				@Pc(46) int local46 = local26[1] & 0xFF | (local26[0] & 0xFF) << 8;
				@Pc(56) byte[] local56 = arg0.method209(0, local46);
				if (local56 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class10_Sub1_Sub7(arg1, arg0, arg2, false);
		} catch (@Pc(91) Exception local91) {
			return null;
		}
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
	public static void method754() {
		Static85.aBoolean100 = true;
		Static31.aBoolean43 = true;
	}

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "(B)V")
	public static void method755() {
		aClass50_7 = null;
		aClass61Array8 = null;
		aClass61_555 = null;
		anIntArray142 = null;
		aClass29_36 = null;
		anIntArray143 = null;
		anIntArray144 = null;
		aClass61_556 = null;
		aClass54_1 = null;
	}
}

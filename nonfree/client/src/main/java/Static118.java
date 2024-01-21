import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "Lclient!bc;")
	public static Class6 aClass6_20;

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1409 = Static108.method1915("Click to switch");

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1406 = aClass39_1409;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1407 = Static108.method1915("Walk here");

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1408 = aClass39_1407;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "Lclient!qc;")
	public static Class1_Sub18 aClass1_Sub18_5 = new Class1_Sub18(new byte[5000]);

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "B")
	public static byte aByte6 = 0;

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1410 = Static108.method1915("null");

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1411 = Static108.method1915("backhmid1");

	@OriginalMember(owner = "client!uc", name = "A", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1412 = Static108.method1915("welle:");

	@OriginalMember(owner = "client!uc", name = "B", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1413 = Static108.method1915("Entfernen");

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III[B)I")
	public static int method2041(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = arg1; local7 < arg0; local7++) {
			local5 = local5 >>> 8 ^ Class1_Sub15.anIntArray317[(local5 ^ arg2[local7]) & 0xFF];
		}
		return ~local5;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public static void method2042() {
		aClass39_1413 = null;
		aClass39_1406 = null;
		aClass39_1408 = null;
		aClass39_1411 = null;
		aClass39_1412 = null;
		aClass39_1409 = null;
		aClass1_Sub18_5 = null;
		aClass6_20 = null;
		aClass39_1410 = null;
		aClass39_1407 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[BIZ)Lclient!kd;")
	public static Class39 method2043(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class39 local3 = new Class39();
		local3.anInt1707 = 0;
		local3.aByteArray50 = new byte[arg2];
		for (@Pc(21) int local21 = arg0; local21 < arg2 + arg0; local21++) {
			if (arg1[local21] != 0) {
				local3.aByteArray50[local3.anInt1707++] = arg1[local21];
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILclient!q;I)[Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1[] method2044(@OriginalArg(0) int arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) int arg2) {
		return Static119.method2054(arg2, arg0, arg1) ? Static17.method328() : null;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
	public static void method2045() {
		Static9.anIntArrayArrayArray9 = null;
		Static43.anIntArray174 = null;
		Static120.anIntArray479 = null;
		Static43.anIntArrayArray8 = null;
		Static99.aByteArrayArrayArray7 = null;
		Static55.aByteArrayArrayArray5 = null;
		Static107.anIntArray414 = null;
		Static86.anIntArray318 = null;
		Static76.aByteArrayArrayArray6 = null;
		Static110.anIntArray422 = null;
		Static10.aByteArrayArrayArray2 = null;
		Static1.aByteArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)Lclient!ea;")
	public static Class14 method2046() {
		try {
			return (Class14) Class.forName("Class14_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class14_Sub2();
		}
	}
}

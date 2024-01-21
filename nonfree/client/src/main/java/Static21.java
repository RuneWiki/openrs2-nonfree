import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!d", name = "c", descriptor = "Lclient!bc;")
	public static Class6 aClass6_5;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "I")
	public static int anInt738;

	@OriginalMember(owner = "client!d", name = "m", descriptor = "Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1 aClass1_Sub1_Sub4_Sub1_14;

	@OriginalMember(owner = "client!d", name = "s", descriptor = "[I")
	public static int[] anIntArray107;

	@OriginalMember(owner = "client!d", name = "t", descriptor = "[I")
	public static int[] anIntArray108;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "Lclient!kd;")
	private static Class39 aClass39_354 = Static108.method1915("Unable to connect)3");

	@OriginalMember(owner = "client!d", name = "a", descriptor = "Lclient!kd;")
	public static Class39 aClass39_353 = aClass39_354;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Lclient!kd;")
	public static Class39 aClass39_355 = aClass39_354;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "I")
	public static int anInt737 = 0;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "I")
	public static final int anInt740 = 2301979;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "Lclient!kd;")
	public static Class39 aClass39_356 = Static108.method1915(" <col=ffffff>(X");

	@OriginalMember(owner = "client!d", name = "n", descriptor = "Lclient!kd;")
	private static Class39 aClass39_357 = Static108.method1915("Loaded input handler");

	@OriginalMember(owner = "client!d", name = "o", descriptor = "Lclient!kd;")
	public static Class39 aClass39_358 = Static108.method1915("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!d", name = "p", descriptor = "Lclient!kd;")
	private static Class39 aClass39_359 = Static108.method1915("Loading interfaces )2 ");

	@OriginalMember(owner = "client!d", name = "r", descriptor = "Lclient!kd;")
	public static Class39 aClass39_360 = aClass39_357;

	@OriginalMember(owner = "client!d", name = "u", descriptor = "Lclient!kd;")
	public static Class39 aClass39_361 = Static108.method1915("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!d", name = "v", descriptor = "Lclient!kd;")
	public static Class39 aClass39_362 = aClass39_359;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	public static void method413() {
		aClass1_Sub1_Sub4_Sub1_14 = null;
		aClass39_359 = null;
		aClass39_361 = null;
		aClass39_362 = null;
		aClass39_354 = null;
		anIntArray108 = null;
		aClass6_5 = null;
		aClass39_357 = null;
		aClass39_356 = null;
		aClass39_353 = null;
		aClass39_358 = null;
		anIntArray107 = null;
		aClass39_355 = null;
		aClass39_360 = null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!b;IIIII[Lclient!ge;[BII)V")
	public static void method414(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class23[] arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(15) Class1_Sub18 local15 = new Class1_Sub18(arg7);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method2175();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local15.method2175();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(55) int local55 = local32 >> 12;
				@Pc(61) int local61 = local32 >> 6 & 0x3F;
				@Pc(65) int local65 = local15.method2169();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				if (local55 == arg5 && arg4 <= local61 && arg4 + 8 > local61 && arg8 <= local51 && arg8 + 8 > local51) {
					@Pc(100) Class1_Sub1_Sub18 local100 = Static104.method1862(local17);
					@Pc(117) int local117 = arg9 + Static18.method352(local51 & 0x7, local73, local100.anInt3029, arg0, local100.anInt3039, local61 & 0x7);
					@Pc(134) int local134 = Static46.method1929(local100.anInt3029, local100.anInt3039, local73, arg0, local61 & 0x7, local51 & 0x7) + arg3;
					if (local117 > 0 && local134 > 0 && local117 < 103 && local134 < 103) {
						@Pc(151) int local151 = arg2;
						if ((Static51.aByteArrayArrayArray3[1][local117][local134] & 0x2) == 2) {
							local151 = arg2 - 1;
						}
						@Pc(165) Class23 local165 = null;
						if (local151 >= 0) {
							local165 = arg6[local151];
						}
						Static110.method1945(arg2, local134, local69, arg1, arg0 + local73 & 0x3, local17, local165, local117);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method415(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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
}

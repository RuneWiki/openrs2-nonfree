import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ta", name = "ob", descriptor = "Lclient!qb;")
	public static Class3_Sub1_Sub4_Sub3 aClass3_Sub1_Sub4_Sub3_5;

	@OriginalMember(owner = "client!ta", name = "Z", descriptor = "Lclient!he;")
	public static Class26 aClass26_1592 = Static6.method100("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!ta", name = "bb", descriptor = "I")
	public static int anInt2925 = 0;

	@OriginalMember(owner = "client!ta", name = "db", descriptor = "Lclient!he;")
	private static Class26 aClass26_1594 = Static6.method100("Invalid username or password)3");

	@OriginalMember(owner = "client!ta", name = "cb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1593 = aClass26_1594;

	@OriginalMember(owner = "client!ta", name = "gb", descriptor = "Z")
	public static boolean aBoolean162 = false;

	@OriginalMember(owner = "client!ta", name = "qb", descriptor = "Lclient!nc;")
	public static Class3_Sub14 aClass3_Sub14_15 = null;

	@OriginalMember(owner = "client!ta", name = "rb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1596 = Static6.method100("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!ta", name = "sb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1597 = Static6.method100("<col=ffffff>");

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
	public static void method1996() {
		Static1.aClass3_Sub3_Sub1_1.method230();
		Static70.anInt1540 = 1;
		Static110.aClass16_136 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZLclient!ef;I)Z")
	public static boolean method1997(@OriginalArg(1) Class16 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method560(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static105.method1947(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)I")
	public static int method1998() {
		return 6;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1999(@OriginalArg(1) byte[] arg0) {
		@Pc(11) Class3_Sub11 local11 = new Class3_Sub11(arg0);
		@Pc(19) int local19 = local11.method981();
		@Pc(23) int local23 = local11.method984();
		if (local23 < 0 || Static52.anInt1616 != 0 && Static52.anInt1616 < local23) {
			throw new RuntimeException();
		} else if (local19 == 0) {
			@Pc(88) byte[] local88 = new byte[local23];
			local11.method1018(local23, local88);
			return local88;
		} else {
			@Pc(40) int local40 = local11.method984();
			if (local40 < 0 || Static52.anInt1616 != 0 && local40 > Static52.anInt1616) {
				throw new RuntimeException();
			}
			@Pc(64) byte[] local64 = new byte[local40];
			if (local19 == 1) {
				Static37.method736(local64, local40, arg0, local23);
			} else {
				Static56.aClass77_1.method2192(local64, local11);
			}
			return local64;
		}
	}

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "(I)V")
	public static void method2000() {
		aClass26_1597 = null;
		aClass3_Sub14_15 = null;
		aClass26_1594 = null;
		aClass26_1596 = null;
		aClass3_Sub1_Sub4_Sub3_5 = null;
		aClass26_1592 = null;
		aClass26_1593 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BIILclient!ab;II)V")
	public static void method2001(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub1_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class3_Sub22 local7 = new Class3_Sub22();
		local7.anInt3032 = arg0 * 128;
		local7.anInt3025 = arg2.anInt88;
		local7.anInt3033 = arg3;
		local7.anInt3036 = arg2.anInt106;
		local7.anInt3027 = arg2.anInt95 * 128;
		local7.anInt3028 = arg2.anInt84;
		local7.anIntArray366 = arg2.anIntArray10;
		local7.anInt3039 = arg4 * 128;
		@Pc(50) int local50 = arg2.anInt86;
		@Pc(53) int local53 = arg2.anInt96;
		if (arg1 == 1 || arg1 == 3) {
			local50 = arg2.anInt96;
			local53 = arg2.anInt86;
		}
		local7.anInt3029 = (local50 + arg0) * 128;
		local7.anInt3040 = (local53 + arg4) * 128;
		if (arg2.anIntArray9 != null) {
			local7.aClass3_Sub1_Sub1_1 = arg2;
			local7.method2075();
		}
		Static70.aClass65_38.method1955(local7);
		if (local7.anIntArray366 != null) {
			local7.anInt3041 = local7.anInt3025 + (int) ((double) (local7.anInt3028 - local7.anInt3025) * Math.random());
		}
	}
}

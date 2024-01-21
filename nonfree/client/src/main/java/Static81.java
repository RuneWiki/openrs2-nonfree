import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!o", name = "l", descriptor = "Lclient!g;")
	public static Class26 aClass26_19;

	@OriginalMember(owner = "client!o", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "I")
	public static int anInt1785 = 0;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "Lclient!u;")
	public static Class74 aClass74_1219 = Static72.method1077("::errortest");

	@OriginalMember(owner = "client!o", name = "d", descriptor = "Lclient!u;")
	public static Class74 aClass74_1220 = Static72.method1077("Stufe)2");

	@OriginalMember(owner = "client!o", name = "e", descriptor = "I")
	public static int anInt1787 = 10;

	@OriginalMember(owner = "client!o", name = "o", descriptor = "Lclient!u;")
	private static Class74 aClass74_1225 = Static72.method1077(" is already on your friend list");

	@OriginalMember(owner = "client!o", name = "g", descriptor = "Lclient!u;")
	public static Class74 aClass74_1221 = aClass74_1225;

	@OriginalMember(owner = "client!o", name = "k", descriptor = "Lclient!u;")
	private static Class74 aClass74_1224 = Static72.method1077("Please contact customer support)3");

	@OriginalMember(owner = "client!o", name = "i", descriptor = "Lclient!u;")
	public static Class74 aClass74_1222 = aClass74_1224;

	@OriginalMember(owner = "client!o", name = "j", descriptor = "Lclient!u;")
	public static Class74 aClass74_1223 = Static72.method1077("backvmid2");

	@OriginalMember(owner = "client!o", name = "n", descriptor = "I")
	public static int anInt1790 = 0;

	@OriginalMember(owner = "client!o", name = "p", descriptor = "Lclient!u;")
	public static Class74 aClass74_1226 = Static72.method1077("@gr3@");

	@OriginalMember(owner = "client!o", name = "q", descriptor = "[I")
	public static int[] anIntArray255 = new int[2048];

	@OriginalMember(owner = "client!o", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray6 = new byte[50][];

	@OriginalMember(owner = "client!o", name = "s", descriptor = "Lclient!u;")
	public static Class74 aClass74_1227 = Static72.method1077("@whi@ )4 ");

	@OriginalMember(owner = "client!o", name = "t", descriptor = "Lclient!u;")
	public static Class74 aClass74_1228 = Static72.method1077("Wen m-Ochten Sie hinzuf-Ugen?");

	@OriginalMember(owner = "client!o", name = "u", descriptor = "I")
	public static int anInt1791 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Z")
	public static boolean method1261(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)Lclient!we;")
	public static Class2_Sub2_Sub18 method1262(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub2_Sub18 local8 = (Class2_Sub2_Sub18) Static14.aClass16_21.method490((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(22) byte[] local22 = Static53.aClass26_Sub1_38.method1358(0, arg0);
		if (local22 == null) {
			return null;
		}
		local8 = new Class2_Sub2_Sub18();
		@Pc(35) Class2_Sub10 local35 = new Class2_Sub10(local22);
		local35.anInt2187 = local35.aByteArray27.length - 12;
		@Pc(44) int local44 = 0;
		@Pc(48) int local48 = local35.method1532();
		local8.anInt2897 = local35.method1517();
		local8.anInt2895 = local35.method1517();
		local8.anInt2903 = local35.method1517();
		local8.anInt2899 = local35.method1517();
		local35.anInt2187 = 0;
		local8.anIntArray417 = new int[local48];
		local8.aClass74Array21 = new Class74[local48];
		local8.anIntArray415 = new int[local48];
		while (local35.aByteArray27.length - 12 > local35.anInt2187) {
			@Pc(94) int local94 = local35.method1517();
			if (local94 == 3) {
				local8.aClass74Array21[local44] = local35.method1530();
			} else if (local94 >= 100 || local94 == 21 || local94 == 38 || local94 == 39) {
				local8.anIntArray417[local44] = local35.method1514();
			} else {
				local8.anIntArray417[local44] = local35.method1532();
			}
			local8.anIntArray415[local44++] = local94;
		}
		Static14.aClass16_21.method492(local8, (long) arg0);
		return local8;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!g;IZI)[Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1[] method1263(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static65.method1010(arg0, arg2, arg1) ? Static25.method493() : null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public static void method1264() {
		aClass74_1226 = null;
		aClass74_1224 = null;
		aClass74_1221 = null;
		aByteArrayArrayArray5 = null;
		aClass74_1228 = null;
		aClass74_1227 = null;
		aClass74_1223 = null;
		anIntArray255 = null;
		aClass74_1219 = null;
		aByteArrayArray6 = null;
		aClass74_1222 = null;
		aClass74_1220 = null;
		aClass74_1225 = null;
		aClass26_19 = null;
	}
}

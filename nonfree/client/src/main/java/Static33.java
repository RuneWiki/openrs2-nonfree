import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!db", name = "d", descriptor = "I")
	public static int anInt943;

	@OriginalMember(owner = "client!db", name = "g", descriptor = "Lclient!a;")
	public static Class1 aClass1_1;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Z")
	public static boolean aBoolean37;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "[I")
	public static int[] anIntArray72;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "[B")
	public static byte[] aByteArray11 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!gg;")
	public static Class28 aClass28_550 = Static107.method1838(")1j");

	@OriginalMember(owner = "client!db", name = "i", descriptor = "Lclient!gg;")
	private static Class28 aClass28_552 = Static107.method1838("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Lclient!gg;")
	public static Class28 aClass28_551 = aClass28_552;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "I")
	public static int anInt945 = 0;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "Lclient!gg;")
	public static Class28 aClass28_553 = Static107.method1838("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Lclient!gg;")
	public static Class28 aClass28_554 = Static107.method1838("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	public static int anInt946 = 0;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4 = new int[4][13][13];

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)[Lclient!wb;")
	public static Class2_Sub4_Sub3_Sub4[] method644() {
		@Pc(8) Class2_Sub4_Sub3_Sub4[] local8 = new Class2_Sub4_Sub3_Sub4[Static90.anInt2315];
		for (@Pc(15) int local15 = 0; local15 < Static90.anInt2315; local15++) {
			@Pc(21) Class2_Sub4_Sub3_Sub4 local21 = new Class2_Sub4_Sub3_Sub4();
			local21.anInt3984 = Static28.anInt862;
			local21.anInt3982 = Static138.anInt3159;
			local21.anInt3983 = Static147.anIntArray314[local15];
			local21.anInt3986 = Static59.anIntArray135[local15];
			local21.anInt3981 = Static171.anIntArray359[local15];
			local21.anInt3985 = Static171.anIntArray358[local15];
			@Pc(51) byte[] local51 = Static81.aByteArrayArray5[local15];
			@Pc(57) int local57 = local21.anInt3985 * local21.anInt3981;
			local21.anIntArray366 = new int[local57];
			for (@Pc(63) int local63 = 0; local63 < local57; local63++) {
				local21.anIntArray366[local63] = Static101.anIntArray31[local51[local63] & 0xFF];
			}
			local8[local15] = local21;
		}
		Static12.method362();
		return local8;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method645() {
		aClass1_1 = null;
		aClass28_550 = null;
		aClass28_551 = null;
		aClass28_554 = null;
		anIntArray72 = null;
		aClass28_553 = null;
		anIntArrayArrayArray4 = null;
		aClass28_552 = null;
		aByteArray11 = null;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	public static void method646(@OriginalArg(0) int arg0) {
		anInt946 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static178.anInt3959; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static13.anInt587; local6++) {
				if (Static133.aClass2_Sub14ArrayArrayArray1[arg0][local3][local6] == null) {
					Static133.aClass2_Sub14ArrayArrayArray1[arg0][local3][local6] = new Class2_Sub14(arg0, local3, local6);
				}
			}
		}
	}
}

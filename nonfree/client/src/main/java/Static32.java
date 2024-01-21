import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!g", name = "i", descriptor = "I")
	public static int anInt1230;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "Lclient!wc;")
	public static Class4 aClass4_23;

	@OriginalMember(owner = "client!g", name = "v", descriptor = "Lclient!bd;")
	public static Class8 aClass8_11;

	@OriginalMember(owner = "client!g", name = "z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!cb;")
	public static Class11 aClass11_10 = new Class11(10);

	@OriginalMember(owner = "client!g", name = "l", descriptor = "Lclient!a;")
	public static Class1 aClass1_1210 = Static94.method1596("(Z");

	@OriginalMember(owner = "client!g", name = "q", descriptor = "[I")
	public static int[] anIntArray123 = new int[500];

	@OriginalMember(owner = "client!g", name = "s", descriptor = "Lclient!kc;")
	public static Class30 aClass30_2 = new Class30();

	@OriginalMember(owner = "client!g", name = "u", descriptor = "I")
	public static int anInt1238 = 0;

	@OriginalMember(owner = "client!g", name = "w", descriptor = "Lclient!a;")
	private static Class1 aClass1_1211 = Static94.method1596("Public chat");

	@OriginalMember(owner = "client!g", name = "x", descriptor = "Z")
	public static boolean aBoolean54 = false;

	@OriginalMember(owner = "client!g", name = "A", descriptor = "I")
	public static int anInt1240 = 0;

	@OriginalMember(owner = "client!g", name = "B", descriptor = "Lclient!a;")
	public static Class1 aClass1_1212 = Static94.method1596("@gr3@");

	@OriginalMember(owner = "client!g", name = "C", descriptor = "Lclient!a;")
	public static Class1 aClass1_1213 = aClass1_1211;

	@OriginalMember(owner = "client!g", name = "D", descriptor = "Z")
	public static boolean aBoolean55 = false;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([BZII)Lclient!a;")
	public static Class1 method845(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class1 local9 = new Class1();
		local9.anInt23 = 0;
		local9.aByteArray1 = new byte[arg2];
		for (@Pc(23) int local23 = arg1; local23 < arg2 + arg1; local23++) {
			if (arg0[local23] != 0) {
				local9.aByteArray1[local9.anInt23++] = arg0[local23];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	public static void method846() {
		aClass1_1213 = null;
		aClass1_1212 = null;
		aClass4_23 = null;
		aClass1_1211 = null;
		aClass30_2 = null;
		aByteArrayArrayArray4 = null;
		aClass11_10 = null;
		aClass1_1210 = null;
		anIntArray123 = null;
		aClass8_11 = null;
	}
}

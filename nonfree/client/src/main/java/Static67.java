import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!le", name = "B", descriptor = "Lclient!bc;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "I")
	public static int anInt1869 = 0;

	@OriginalMember(owner = "client!le", name = "t", descriptor = "Lclient!ec;")
	private static Class22 aClass22_503 = Static60.method1113("Error connecting to server)3");

	@OriginalMember(owner = "client!le", name = "m", descriptor = "Lclient!ec;")
	public static Class22 aClass22_500 = aClass22_503;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "Lclient!ec;")
	public static Class22 aClass22_501 = Static60.method1113("Fertigkeit)2");

	@OriginalMember(owner = "client!le", name = "o", descriptor = "Lclient!ec;")
	public static Class22 aClass22_502 = Static60.method1113("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!le", name = "s", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[100];

	@OriginalMember(owner = "client!le", name = "u", descriptor = "Lclient!ec;")
	private static Class22 aClass22_504 = Static60.method1113("You have only just left another world)3");

	@OriginalMember(owner = "client!le", name = "x", descriptor = "[I")
	public static int[] anIntArray189 = new int[256];

	@OriginalMember(owner = "client!le", name = "C", descriptor = "Lclient!ec;")
	public static Class22 aClass22_505 = aClass22_504;

	@OriginalMember(owner = "client!le", name = "G", descriptor = "Lclient!ec;")
	private static Class22 aClass22_507 = Static60.method1113("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!le", name = "F", descriptor = "Lclient!ec;")
	public static Class22 aClass22_506 = aClass22_507;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
	public static void method1168() {
		aClass22_501 = null;
		aClass9_1 = null;
		aBooleanArray11 = null;
		aClass22_504 = null;
		aClass22_503 = null;
		aClass22_500 = null;
		aClass22_506 = null;
		aClass22_507 = null;
		aClass22_502 = null;
		anIntArray189 = null;
		aClass22_505 = null;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(B)Lclient!h;")
	public static Class4_Sub1_Sub2_Sub2 method1169() {
		@Pc(15) Class4_Sub1_Sub2_Sub2 local15 = new Class4_Sub1_Sub2_Sub2();
		local15.anInt1157 = Static129.anInt3064;
		local15.anInt1161 = Static30.anIntArray77[0];
		local15.anInt1162 = Static61.anIntArray175[0];
		local15.anInt1160 = Static105.anIntArray297[0];
		@Pc(37) byte[] local37 = Static124.aByteArrayArray9[0];
		@Pc(43) int local43 = local15.anInt1160 * local15.anInt1161;
		local15.anInt1158 = Static57.anIntArray171[0];
		local15.anIntArray129 = new int[local43];
		local15.anInt1159 = Static106.anInt2687;
		for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
			local15.anIntArray129[local57] = Static27.anIntArray75[local37[local57] & 0xFF];
		}
		Static57.method1094();
		return local15;
	}
}

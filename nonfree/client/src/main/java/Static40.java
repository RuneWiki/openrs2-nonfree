import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "I")
	public static int anInt1057;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "I")
	public static int anInt1059;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "[Lclient!wb;")
	public static Class2_Sub4_Sub3_Sub4[] aClass2_Sub4_Sub3_Sub4Array5;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Z")
	public static boolean aBoolean48 = false;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "[I")
	public static int[] anIntArray85 = new int[5];

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!gg;")
	private static Class28 aClass28_645 = Static107.method1838("Please enter your username)3");

	@OriginalMember(owner = "client!e", name = "i", descriptor = "Lclient!gg;")
	public static Class28 aClass28_646 = aClass28_645;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BI)[B")
	public static byte[] method722(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static184.method1640(arg0, 0, local14, 0, local11);
		return local14;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public static void method724() {
		aClass2_Sub4_Sub3_Sub4Array5 = null;
		aClass28_646 = null;
		anIntArray85 = null;
		aClass28_645 = null;
	}
}

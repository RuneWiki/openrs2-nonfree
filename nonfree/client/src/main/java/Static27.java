import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "Lclient!sc;")
	private static Class107 aClass107_182 = Static231.method3737("Loading config )2 ");

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "Lclient!sc;")
	public static Class107 aClass107_181 = aClass107_182;

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
	public static int anInt523 = 3;

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "[B")
	public static byte[] aByteArray16 = new byte[520];

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZB)V")
	public static void method477(@OriginalArg(0) boolean arg0) {
		Static89.aBoolean176 = arg0;
		Static146.aBoolean269 = !Static155.method412();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Z")
	public static boolean method478(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)[Lclient!pd;")
	public static Class1_Sub2_Sub2_Sub1[] method479() {
		@Pc(8) Class1_Sub2_Sub2_Sub1[] local8 = new Class1_Sub2_Sub2_Sub1[Static40.anInt855];
		for (@Pc(10) int local10 = 0; local10 < Static40.anInt855; local10++) {
			@Pc(20) int local20 = Static141.anIntArray266[local10] * Static172.anIntArray329[local10];
			@Pc(24) byte[] local24 = Static158.aByteArrayArray7[local10];
			@Pc(27) int[] local27 = new int[local20];
			for (@Pc(29) int local29 = 0; local29 < local20; local29++) {
				local27[local29] = Static169.anIntArray324[local24[local29] & 0xFF];
			}
			local8[local10] = new Class1_Sub2_Sub2_Sub1(Static155.anInt432, Static182.anInt4094, Static56.anIntArray124[local10], Static223.anIntArray373[local10], Static141.anIntArray266[local10], Static172.anIntArray329[local10], local27);
		}
		Static158.method2564();
		return local8;
	}
}

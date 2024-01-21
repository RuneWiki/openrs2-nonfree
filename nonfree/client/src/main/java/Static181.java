import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!u", name = "gb", descriptor = "I")
	public static int anInt4056;

	@OriginalMember(owner = "client!u", name = "mb", descriptor = "[I")
	public static int[] anIntArray461;

	@OriginalMember(owner = "client!u", name = "hb", descriptor = "I")
	public static int anInt4057 = 0;

	@OriginalMember(owner = "client!u", name = "jb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2427 = Static118.method2249("Attack");

	@OriginalMember(owner = "client!u", name = "lb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2428 = Static118.method2249(")1j");

	@OriginalMember(owner = "client!u", name = "nb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2429 = aClass65_2427;

	@OriginalMember(owner = "client!u", name = "qb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2430 = Static118.method2249("settings=");

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(II)V")
	public static void method3053(@OriginalArg(0) int arg0) {
		Static90.anInt4438 = -1;
		Static94.anInt2345 = arg0;
		Static119.anInt2954 = -1;
		Static210.method3315();
	}

	@OriginalMember(owner = "client!u", name = "g", descriptor = "(I)Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3 method3054() {
		@Pc(5) Class1_Sub2_Sub5_Sub3 local5 = new Class1_Sub2_Sub5_Sub3();
		local5.anInt1852 = Static111.anIntArray308[0];
		local5.anInt1856 = Static108.anInt2647;
		local5.anInt1854 = Static127.anIntArray364[0];
		local5.anInt1853 = Static148.anInt3487;
		local5.anInt1855 = Static160.anIntArray328[0];
		local5.anInt1851 = Static138.anIntArray384[0];
		@Pc(44) byte[] local44 = Static153.aByteArrayArray33[0];
		@Pc(50) int local50 = local5.anInt1851 * local5.anInt1855;
		local5.anIntArray204 = new int[local50];
		for (@Pc(56) int local56 = 0; local56 < local50; local56++) {
			local5.anIntArray204[local56] = Static61.anIntArray154[local44[local56] & 0xFF];
		}
		Static84.method1458();
		return local5;
	}
}

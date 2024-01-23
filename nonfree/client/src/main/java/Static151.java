import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!od", name = "Z", descriptor = "I")
	public static int anInt3153;

	@OriginalMember(owner = "client!od", name = "R", descriptor = "Z")
	public static boolean aBoolean134 = true;

	@OriginalMember(owner = "client!od", name = "X", descriptor = "Z")
	public static boolean aBoolean135 = false;

	@OriginalMember(owner = "client!od", name = "ab", descriptor = "[I")
	public static int[] anIntArray326 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

	@OriginalMember(owner = "client!od", name = "cb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1046 = Static186.method3527("Mitglieder)2Welt");

	@OriginalMember(owner = "client!od", name = "fb", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1048 = Static186.method3527("Discard");

	@OriginalMember(owner = "client!od", name = "db", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1047 = aClass50_1048;

	@OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
	public static int anInt3155 = 0;

	@OriginalMember(owner = "client!od", name = "gb", descriptor = "I")
	public static int anInt3156 = -2;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B[B)[B")
	public static byte[] method2538(@OriginalArg(1) byte[] arg0) {
		@Pc(4) Class1_Sub17 local4 = new Class1_Sub17(arg0);
		@Pc(17) int local17 = local4.method2142();
		@Pc(21) int local21 = local4.method2140();
		if (local21 < 0 || Static198.anInt3997 != 0 && Static198.anInt3997 < local21) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(47) byte[] local47 = new byte[local21];
			local4.method2148(local21, local47);
			return local47;
		} else {
			@Pc(59) int local59 = local4.method2140();
			if (local59 < 0 || Static198.anInt3997 != 0 && local59 > Static198.anInt3997) {
				throw new RuntimeException();
			}
			@Pc(79) byte[] local79 = new byte[local59];
			if (local17 == 1) {
				Static202.method3241(local79, local59, arg0, local21);
			} else {
				Static203.aClass6_2.method154(local4, local79);
			}
			return local79;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)I")
	public static int method2539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0 & 0x3;
		if (local8 == 0) {
			return arg1;
		} else if (local8 == 1) {
			return 7 - arg2;
		} else if (local8 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}
}

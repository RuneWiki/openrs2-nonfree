import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!tf", name = "R", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1102 = Static119.method1462("<br>(X100(U(Y");

	@OriginalMember(owner = "client!tf", name = "T", descriptor = "I")
	public static int anInt2564 = 0;

	@OriginalMember(owner = "client!tf", name = "Y", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1103 = Static119.method1462("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!tf", name = "ab", descriptor = "I")
	public static volatile int anInt2570 = 0;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIII)V")
	public static void method1852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(11) int local11 = 0; local11 < Static17.anInt392; local11++) {
			if (arg1 < Static41.anIntArray117[local11] + Static47.anIntArray143[local11] && Static41.anIntArray117[local11] < arg1 + arg2 && arg0 < Static115.anIntArray335[local11] + Static95.anIntArray284[local11] && Static95.anIntArray284[local11] < arg3 + arg0) {
				Static9.aBooleanArray3[local11] = true;
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!wa;)V")
	public static void method1853(@OriginalArg(1) Class2_Sub22 arg0) {
		if (arg0.anInt2824 == Static22.anInt548) {
			Static100.aBooleanArray16[arg0.anInt2776] = true;
		}
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(B)V")
	public static void method1854() {
		aClass65_1103 = null;
		aClass65_1102 = null;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)Lclient!qb;")
	public static Class2_Sub1_Sub12 method1856(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub12 local10 = (Class2_Sub1_Sub12) Static68.aClass8_64.method172((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static30.aClass56_13.method1666(arg0, 9);
		local10 = new Class2_Sub1_Sub12();
		local10.anInt2128 = arg0;
		if (local25 != null) {
			local10.method1563(new Class2_Sub4(local25));
		}
		local10.method1558();
		Static68.aClass8_64.method176((long) arg0, local10);
		return local10;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!jh;")
	public static Class3_Sub2_Sub2_Sub1_Sub1 aClass3_Sub2_Sub2_Sub1_Sub1_3;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
	public static volatile int anInt2141 = -1;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
	public static int anInt2142 = 0;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!eh;")
	public static Class28 aClass28_644 = Static170.method3101("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "[S")
	public static short[] aShortArray24 = new short[] { 51, 25, 50, 18, 30, 31, 40, 8 };

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "Lclient!eh;")
	public static Class28 aClass28_645 = Static170.method3101(":duelfriend:");

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "Lclient!pa;")
	public static Class63 aClass63_12 = new Class63(64);

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "[I")
	public static int[] anIntArray354 = new int[2000];

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
	public static void method1655() {
		aClass28_644 = null;
		aClass28_645 = null;
		aClass3_Sub2_Sub2_Sub1_Sub1_3 = null;
		aClass63_12 = null;
		aShortArray24 = null;
		anIntArray354 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIII)I")
	public static int method1656(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(12) int local12 = arg0;
			arg0 = arg3;
			arg3 = local12;
		}
		@Pc(20) int local20 = arg1 & 0x3;
		if (local20 == 0) {
			return arg5;
		} else if (local20 == 1) {
			return 1 + 7 - arg4 - arg0;
		} else if (local20 == 2) {
			return 7 + 1 - arg5 - arg3;
		} else {
			return arg4;
		}
	}
}

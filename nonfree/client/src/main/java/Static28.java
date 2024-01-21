import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!fa", name = "B", descriptor = "[I")
	public static int[] anIntArray148;

	@OriginalMember(owner = "client!fa", name = "x", descriptor = "J")
	public static long aLong53 = 0L;

	@OriginalMember(owner = "client!fa", name = "y", descriptor = "Lclient!mb;")
	private static Class45 aClass45_425 = Static63.method1251("Offline");

	@OriginalMember(owner = "client!fa", name = "D", descriptor = "Lclient!mb;")
	private static Class45 aClass45_427 = Static63.method1251("Loaded wordpack");

	@OriginalMember(owner = "client!fa", name = "C", descriptor = "Lclient!mb;")
	public static Class45 aClass45_426 = aClass45_427;

	@OriginalMember(owner = "client!fa", name = "F", descriptor = "[I")
	public static int[] anIntArray150 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "Lclient!mb;")
	public static Class45 aClass45_428 = aClass45_425;

	@OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
	public static int anInt879 = 0;

	@OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
	public static int anInt881 = 0;

	@OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
	public static int anInt882 = 0;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([Lclient!jc;I[BIIII)V")
	public static void method623(@OriginalArg(0) Class37[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 64; local11++) {
				for (local15 = 0; local15 < 64; local15++) {
					if (arg3 + local11 > 0 && local11 + arg3 < 103 && arg4 + local15 > 0 && arg4 + local15 < 103) {
						arg0[local7].anIntArrayArray19[local11 + arg3][arg4 + local15] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(90) Class5_Sub9 local90 = new Class5_Sub9(arg2);
		for (local15 = 0; local15 < 4; local15++) {
			for (@Pc(96) int local96 = 0; local96 < 64; local96++) {
				for (@Pc(100) int local100 = 0; local100 < 64; local100++) {
					Static101.method747(local15, arg4 + local100, arg5, 0, local90, arg3 + local96, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
	public static void method624() {
		Static9.aClass67_1.method1819();
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)V")
	public static void method625() {
		aClass45_425 = null;
		aClass45_426 = null;
		anIntArray150 = null;
		anIntArray148 = null;
		aClass45_428 = null;
		aClass45_427 = null;
	}
}

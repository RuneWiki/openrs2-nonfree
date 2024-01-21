import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!cc", name = "hb", descriptor = "[I")
	public static int[] anIntArray70;

	@OriginalMember(owner = "client!cc", name = "ob", descriptor = "Lclient!r;")
	public static Class41_Sub1 aClass41_Sub1_3;

	@OriginalMember(owner = "client!cc", name = "ub", descriptor = "I")
	public static int anInt514;

	@OriginalMember(owner = "client!cc", name = "kb", descriptor = "Lclient!af;")
	private static Class5 aClass5_268 = Static45.method1937("Welcome to RuneScape");

	@OriginalMember(owner = "client!cc", name = "U", descriptor = "Lclient!af;")
	public static Class5 aClass5_265 = aClass5_268;

	@OriginalMember(owner = "client!cc", name = "W", descriptor = "Lclient!af;")
	public static Class5 aClass5_266 = Static45.method1937(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!cc", name = "Y", descriptor = "Lclient!af;")
	public static Class5 aClass5_267 = Static45.method1937("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!cc", name = "db", descriptor = "[[B")
	public static byte[][] aByteArrayArray3 = new byte[50][];

	@OriginalMember(owner = "client!cc", name = "fb", descriptor = "I")
	public static int anInt505 = 0;

	@OriginalMember(owner = "client!cc", name = "jb", descriptor = "[Lclient!nb;")
	public static Class1_Sub3_Sub4_Sub2_Sub1[] aClass1_Sub3_Sub4_Sub2_Sub1Array1 = new Class1_Sub3_Sub4_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!cc", name = "qb", descriptor = "I")
	public static int anInt511 = 0;

	@OriginalMember(owner = "client!cc", name = "rb", descriptor = "Lclient!af;")
	public static Class5 aClass5_269 = Static45.method1937("mapscene");

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
	public static void method418() {
		aClass5_269 = null;
		aByteArrayArray3 = null;
		aClass5_266 = null;
		anIntArray70 = null;
		aClass1_Sub3_Sub4_Sub2_Sub1Array1 = null;
		aClass41_Sub1_3 = null;
		aClass5_267 = null;
		aClass5_265 = null;
		aClass5_268 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
	public static void method419() {
		Static119.aClass8_1.method2240();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static84.aLongArray2[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static129.aLongArray6[local22] = 0L;
		}
		Static46.anInt1120 = 0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZIBILclient!r;I)V")
	public static void method420(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class41_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) ((arg3 << 16) + arg0);
		@Pc(21) Class1_Sub3_Sub15 local21 = (Class1_Sub3_Sub15) Static78.aClass7_9.method287(local6);
		if (local21 != null) {
			return;
		}
		local21 = (Class1_Sub3_Sub15) Static9.aClass7_1.method287(local6);
		if (local21 != null) {
			return;
		}
		local21 = (Class1_Sub3_Sub15) Static95.aClass7_10.method287(local6);
		if (local21 == null) {
			if (!arg1) {
				local21 = (Class1_Sub3_Sub15) Static21.aClass7_2.method287(local6);
				if (local21 != null) {
					return;
				}
			}
			local21 = new Class1_Sub3_Sub15();
			local21.aByte7 = arg2;
			local21.aClass41_Sub1_15 = arg4;
			local21.anInt2382 = arg5;
			if (arg1) {
				Static78.aClass7_9.method291(local21, local6);
				Static56.anInt1347++;
			} else {
				Static6.aClass17_1.method606(local21);
				Static95.aClass7_10.method291(local21, local6);
				Static74.anInt1720++;
			}
		} else if (arg1) {
			local21.method2235();
			Static78.aClass7_9.method291(local21, local6);
			Static74.anInt1720--;
			Static56.anInt1347++;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)I")
	public static int method423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = arg2 / arg0;
		@Pc(20) int local20 = arg0 - 1 & arg2;
		@Pc(28) int local28 = arg1 / arg0;
		@Pc(34) int local34 = arg1 & arg0 - 1;
		@Pc(39) int local39 = Static87.method2234(local28, local14);
		@Pc(46) int local46 = Static87.method2234(local28, local14 + 1);
		@Pc(53) int local53 = Static87.method2234(local28 + 1, local14);
		@Pc(62) int local62 = Static87.method2234(local28 + 1, local14 - -1);
		@Pc(69) int local69 = Static103.method1750(local20, arg0, local39, local46);
		@Pc(76) int local76 = Static103.method1750(local20, arg0, local53, local62);
		return Static103.method1750(local34, arg0, local69, local76);
	}
}

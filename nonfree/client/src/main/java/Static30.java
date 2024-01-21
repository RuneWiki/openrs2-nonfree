import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ef", name = "gb", descriptor = "[Lclient!ue;")
	public static Class4_Sub4_Sub5_Sub4[] aClass4_Sub4_Sub5_Sub4Array5;

	@OriginalMember(owner = "client!ef", name = "ub", descriptor = "Lclient!ke;")
	public static Class4_Sub12_Sub2 aClass4_Sub12_Sub2_4;

	@OriginalMember(owner = "client!ef", name = "Jb", descriptor = "Lclient!ne;")
	public static Class4_Sub10 aClass4_Sub10_4;

	@OriginalMember(owner = "client!ef", name = "nc", descriptor = "I")
	public static int anInt1429;

	@OriginalMember(owner = "client!ef", name = "qb", descriptor = "Lclient!v;")
	public static Class76 aClass76_605 = Static134.method2017("mapdots");

	@OriginalMember(owner = "client!ef", name = "vb", descriptor = "Lclient!v;")
	public static Class76 aClass76_606 = Static134.method2017("<)4col>");

	@OriginalMember(owner = "client!ef", name = "gc", descriptor = "Lclient!v;")
	private static Class76 aClass76_611 = Static134.method2017("Your friend list is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!ef", name = "zb", descriptor = "Lclient!v;")
	public static Class76 aClass76_608 = aClass76_611;

	@OriginalMember(owner = "client!ef", name = "Vb", descriptor = "Lclient!v;")
	public static Class76 aClass76_609 = Static134.method2017("null");

	@OriginalMember(owner = "client!ef", name = "dc", descriptor = "Lclient!v;")
	public static Class76 aClass76_610 = Static134.method2017("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!ef", name = "qc", descriptor = "Z")
	public static boolean aBoolean82 = false;

	@OriginalMember(owner = "client!ef", name = "uc", descriptor = "[I")
	public static int[] anIntArray185 = new int[100];

	@OriginalMember(owner = "client!ef", name = "xc", descriptor = "I")
	public static int anInt1437 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BII)I")
	public static int method965(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class4_Sub21 local12 = (Class4_Sub21) Static104.aClass28_9.method770((long) arg0);
		if (local12 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(28) int local28 = 0;
			for (@Pc(30) int local30 = 0; local30 < local12.anIntArray326.length; local30++) {
				if (local12.anIntArray325[local30] == arg1) {
					local28 += local12.anIntArray326[local30];
				}
			}
			return local28;
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(BII)I")
	public static int method966(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 + arg0 * 57;
		@Pc(16) int local16 = local10 ^ local10 << 13;
		@Pc(35) int local35 = (local16 * 15731 * local16 + 789221) * local16 + 1376312589 & Integer.MAX_VALUE;
		return local35 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V")
	public static void method968() {
		for (@Pc(3) int local3 = -1; local3 < Static106.anInt2357; local3++) {
			@Pc(17) int local17;
			if (local3 == -1) {
				local17 = 2047;
			} else {
				local17 = Static113.anIntArray348[local3];
			}
			@Pc(25) Class4_Sub4_Sub3_Sub1_Sub2 local25 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local17];
			if (local25 != null) {
				Static59.method1018(local25, 1);
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIZ)I")
	public static int method970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(10) int local10 = arg3;
			arg3 = arg4;
			arg4 = local10;
		}
		@Pc(23) int local23 = arg2 & 0x3;
		if (local23 == 0) {
			return arg5;
		} else if (local23 == 1) {
			return 1 + 7 - arg3 - arg1;
		} else if (local23 == 2) {
			return 1 + 7 - arg5 - arg4;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V")
	public static void method972() {
		Static131.aBoolean158 = true;
		Static76.aBoolean119 = true;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)V")
	public static void method974() {
		anIntArray185 = null;
		aClass4_Sub12_Sub2_4 = null;
		aClass4_Sub4_Sub5_Sub4Array5 = null;
		aClass76_610 = null;
		aClass76_608 = null;
		aClass76_606 = null;
		aClass76_609 = null;
		aClass76_611 = null;
		aClass4_Sub10_4 = null;
		aClass76_605 = null;
	}
}

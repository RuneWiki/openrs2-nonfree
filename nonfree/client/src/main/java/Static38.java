import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "Lclient!q;")
	public static Class60 aClass60_1;

	@OriginalMember(owner = "client!fc", name = "V", descriptor = "[Lclient!qc;")
	public static Class1_Sub3_Sub1_Sub3[] aClass1_Sub3_Sub1_Sub3Array3;

	@OriginalMember(owner = "client!fc", name = "W", descriptor = "Lclient!r;")
	public static Class41_Sub1 aClass41_Sub1_5;

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
	public static int anInt974 = -1;

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "[J")
	public static long[] aLongArray1 = new long[100];

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
	public static int anInt976 = 0;

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "Lclient!af;")
	public static Class5 aClass5_460 = Static45.method1937("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!fc", name = "R", descriptor = "Lclient!nd;")
	public static Class53 aClass53_7 = new Class53();

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!kb;B)V")
	public static void method693(@OriginalArg(0) Class41 arg0) {
		Static75.aClass41_13 = arg0;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	public static void method694() {
		aClass60_1 = null;
		aClass1_Sub3_Sub1_Sub3Array3 = null;
		aClass5_460 = null;
		aLongArray1 = null;
		aClass41_Sub1_5 = null;
		aClass53_7 = null;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)Lclient!h;")
	public static Class1_Sub3_Sub8 method695(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub3_Sub8 local10 = (Class1_Sub3_Sub8) Static82.aClass28_57.method796((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static47.method832(arg0, Static68.aClass41_10, Static128.aClass41_32);
		if (local10 != null) {
			Static82.aClass28_57.method789(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)Lclient!af;")
	public static Class5 method696(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static48.method838(arg0) : Static81.aClass5_1007;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLclient!af;)Z")
	public static boolean method697(@OriginalArg(1) Class5 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static20.anInt658; local11++) {
			if (arg0.method207(Static9.aClass5Array2[local11])) {
				return true;
			}
		}
		return arg0.method207(Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.aClass5_985);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Lclient!kb;B)V")
	public static void method698(@OriginalArg(0) Class41 arg0) {
		Static66.aClass41_31 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!me", name = "Cb", descriptor = "[I")
	public static int[] anIntArray166;

	@OriginalMember(owner = "client!me", name = "Kb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!me", name = "tb", descriptor = "[I")
	public static int[] anIntArray165 = new int[4000];

	@OriginalMember(owner = "client!me", name = "Ub", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1079 = Static33.method650(" more options");

	@OriginalMember(owner = "client!me", name = "ub", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1071 = aClass56_1079;

	@OriginalMember(owner = "client!me", name = "vb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1072 = Static33.method650(" from your ignore list first");

	@OriginalMember(owner = "client!me", name = "xb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1073 = Static33.method650("Create a free account");

	@OriginalMember(owner = "client!me", name = "Fb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1074 = aClass56_1073;

	@OriginalMember(owner = "client!me", name = "Wb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1080 = Static33.method650("Welcome to RuneScape");

	@OriginalMember(owner = "client!me", name = "Hb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1075 = aClass56_1080;

	@OriginalMember(owner = "client!me", name = "Mb", descriptor = "I")
	public static int anInt2013 = 0;

	@OriginalMember(owner = "client!me", name = "Nb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1076 = Static33.method650(" x");

	@OriginalMember(owner = "client!me", name = "Sb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1077 = Static33.method650("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!me", name = "Tb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1078 = aClass56_1072;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
	public static void method1327() {
		@Pc(1) Object local1 = Static118.anObject4;
		synchronized (Static118.anObject4) {
			if (Static7.anInt375 != 0) {
				Static7.anInt375 = 1;
				try {
					Static118.anObject4.wait();
				} catch (@Pc(19) InterruptedException local19) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "g", descriptor = "(B)I")
	public static int method1328() {
		return 6;
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
	public static void method1329() {
		if (!Static93.aBoolean114) {
			return;
		}
		@Pc(11) Class3_Sub1_Sub16 local11 = Static42.method784(Static18.anInt498, Static34.anInt968);
		if (local11 != null && local11.anObjectArray21 != null) {
			Static56.method1067(local11, 0, null, local11.anObjectArray21, 0, 0);
		}
		Static93.aBoolean114 = false;
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V")
	public static void method1330() {
		aClass56_1078 = null;
		anIntArray166 = null;
		aClass56_1074 = null;
		anIntArrayArrayArray5 = null;
		aClass56_1073 = null;
		anIntArray165 = null;
		aClass56_1072 = null;
		aClass56_1077 = null;
		aClass56_1080 = null;
		aClass56_1079 = null;
		aClass56_1075 = null;
		aClass56_1071 = null;
		aClass56_1076 = null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIII)V")
	public static void method1331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = 2048 - arg0 & 0x7FF;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = arg2;
		@Pc(23) int local23 = 2048 - arg3 & 0x7FF;
		@Pc(33) int local33;
		@Pc(29) int local29;
		@Pc(44) int local44;
		if (local10 != 0) {
			local29 = Class3_Sub1_Sub1_Sub3.anIntArray115[local10];
			local33 = Class3_Sub1_Sub1_Sub3.anIntArray116[local10];
			local44 = local29 * 0 - arg2 * local33 >> 16;
			local16 = local29 * arg2 + local33 * 0 >> 16;
			local12 = local44;
		}
		if (local23 != 0) {
			local33 = Class3_Sub1_Sub1_Sub3.anIntArray116[local23];
			local29 = Class3_Sub1_Sub1_Sub3.anIntArray115[local23];
			local44 = local16 * local33 + local29 * 0 >> 16;
			local16 = local16 * local29 - local33 * 0 >> 16;
			local14 = local44;
		}
		Static94.anInt2474 = arg3;
		Static111.anInt2863 = arg5 - local12;
		Static15.anInt433 = arg1 - local16;
		Static57.anInt1615 = arg4 - local14;
		Static97.anInt2547 = arg0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZIILclient!tb;)Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4 method1332(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class44 arg2) {
		return Static87.method1606(arg0, arg2, arg1) ? Static57.method1079() : null;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(ZI)Lclient!oa;")
	public static Class56 method1333() {
		@Pc(7) Class56 local7 = new Class56();
		local7.anInt2171 = 0;
		local7.aByteArray29 = new byte[100];
		return local7;
	}
}

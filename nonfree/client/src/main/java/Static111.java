import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!se", name = "T", descriptor = "I")
	public static int anInt2735;

	@OriginalMember(owner = "client!se", name = "fb", descriptor = "J")
	public static long aLong85;

	@OriginalMember(owner = "client!se", name = "O", descriptor = "Lclient!af;")
	private static Class5 aClass5_1275 = Static45.method1937("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!se", name = "K", descriptor = "Lclient!af;")
	public static Class5 aClass5_1273 = aClass5_1275;

	@OriginalMember(owner = "client!se", name = "L", descriptor = "Lclient!af;")
	public static Class5 aClass5_1274 = Static45.method1937(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!se", name = "M", descriptor = "I")
	public static int anInt2729 = 0;

	@OriginalMember(owner = "client!se", name = "X", descriptor = "I")
	public static int anInt2739 = 0;

	@OriginalMember(owner = "client!se", name = "cb", descriptor = "Z")
	public static boolean aBoolean105 = false;

	@OriginalMember(owner = "client!se", name = "eb", descriptor = "[[I")
	public static int[][] anIntArrayArray79 = new int[104][104];

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(II)Lclient!af;")
	public static Class5 method1921(@OriginalArg(0) int arg0) {
		return Static100.method1696(new Class5[] { Static48.method838(arg0 >> 24 & 0xFF), Static22.aClass5_336, Static48.method838(arg0 >> 16 & 0xFF), Static22.aClass5_336, Static48.method838(arg0 >> 8 & 0xFF), Static22.aClass5_336, Static48.method838(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!kb;ZI)Lclient!qc;")
	public static Class1_Sub3_Sub1_Sub3 method1922(@OriginalArg(0) Class41 arg0, @OriginalArg(2) int arg1) {
		return Static93.method1589(arg0, arg1) ? Static36.method682() : null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIB)V")
	public static void method1923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		@Pc(11) int[] local11 = new int[4];
		local8[0] = arg0;
		local11[0] = arg1;
		@Pc(21) int local21 = 1;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			if (arg0 != Static66.anIntArray453[local23]) {
				local8[local21] = Static66.anIntArray453[local23];
				local11[local21] = Static64.anIntArray247[local23];
				local21++;
			}
		}
		Static66.anIntArray453 = local8;
		Static64.anIntArray247 = local11;
		Static60.method1088(Static37.aClass9Array1, Static64.anIntArray247, Static66.anIntArray453, 0, Static37.aClass9Array1.length - 1);
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	public static void method1924() {
		Static48.aClass28_30.method792();
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
	public static void method1925() {
		aClass5_1275 = null;
		aClass5_1273 = null;
		aClass5_1274 = null;
		anIntArrayArray79 = null;
	}
}

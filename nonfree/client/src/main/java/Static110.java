import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!sf", name = "mb", descriptor = "J")
	public static long aLong82;

	@OriginalMember(owner = "client!sf", name = "ob", descriptor = "[I")
	public static int[] anIntArray328;

	@OriginalMember(owner = "client!sf", name = "sb", descriptor = "[[I")
	public static int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!sf", name = "bb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1038 = Static119.method1462("");

	@OriginalMember(owner = "client!sf", name = "db", descriptor = "[I")
	public static int[] anIntArray327 = new int[50];

	@OriginalMember(owner = "client!sf", name = "eb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1039 = Static119.method1462("Schlie-8en");

	@OriginalMember(owner = "client!sf", name = "tb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1046 = Static119.method1462("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!sf", name = "gb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1040 = aClass65_1046;

	@OriginalMember(owner = "client!sf", name = "ib", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1041 = aClass65_1038;

	@OriginalMember(owner = "client!sf", name = "jb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1042 = aClass65_1046;

	@OriginalMember(owner = "client!sf", name = "pb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1045 = Static119.method1462("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!sf", name = "kb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1043 = aClass65_1045;

	@OriginalMember(owner = "client!sf", name = "nb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1044 = Static119.method1462("(U4");

	@OriginalMember(owner = "client!sf", name = "qb", descriptor = "I")
	public static int anInt2467 = 0;

	@OriginalMember(owner = "client!sf", name = "ub", descriptor = "I")
	public static int anInt2469 = 0;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BII)I")
	public static int method1791(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class2_Sub20 local17 = (Class2_Sub20) Static22.aClass40_6.method851((long) arg0);
		if (local17 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = 0; local31 < local17.anIntArray344.length; local31++) {
				if (local17.anIntArray345[local31] == arg1) {
					local29 += local17.anIntArray344[local31];
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
	public static void method1792() {
		anIntArray327 = null;
		anIntArray328 = null;
		aClass65_1044 = null;
		aClass65_1040 = null;
		aClass65_1039 = null;
		aClass65_1038 = null;
		aClass65_1045 = null;
		anIntArrayArray24 = null;
		aClass65_1041 = null;
		aClass65_1043 = null;
		aClass65_1042 = null;
		aClass65_1046 = null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!pe;)V")
	public static void method1793(@OriginalArg(0) int arg0, @OriginalArg(2) Class65 arg1) {
		Static49.aClass2_Sub4_Sub1_1.method962(35);
		Static49.aClass2_Sub4_Sub1_1.method917(arg1.method1493());
		Static49.aClass2_Sub4_Sub1_1.method926(arg0);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIBII)V")
	public static void method1794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = arg2; local11 <= arg2 + arg3; local11++) {
			for (@Pc(15) int local15 = arg1; local15 <= arg1 + arg0; local15++) {
				if (local15 >= 0 && local15 < 104 && local11 >= 0 && local11 < 104) {
					Static106.aByteArrayArrayArray4[0][local15][local11] = 127;
					if (arg1 == local15 && local15 > 0) {
						Static67.anIntArrayArrayArray8[0][local15][local11] = Static67.anIntArrayArrayArray8[0][local15 - 1][local11];
					}
					if (arg1 + arg0 == local15 && local15 < 103) {
						Static67.anIntArrayArrayArray8[0][local15][local11] = Static67.anIntArrayArrayArray8[0][local15 + 1][local11];
					}
					if (local11 == arg2 && local11 > 0) {
						Static67.anIntArrayArrayArray8[0][local15][local11] = Static67.anIntArrayArrayArray8[0][local15][local11 - 1];
					}
					if (local11 == arg3 + arg2 && local11 < 103) {
						Static67.anIntArrayArrayArray8[0][local15][local11] = Static67.anIntArrayArrayArray8[0][local15][local11 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V")
	public static void method1795() {
		Static86.method1385();
		Static4.method867();
		Static95.method1569();
		Static81.method1327();
		Static53.method884();
		Static98.method1605();
		Static20.method341();
		Static21.method348();
		Static32.method620();
		Static26.method521();
		Static127.method1939();
		Static73.method1250();
		((Class1) Static87.anInterface1_1).method9();
		Static3.aClass8_6.method171();
		Static15.aClass56_Sub1_7.method1685();
		Static68.aClass56_Sub1_31.method1685();
		Static90.aClass56_Sub1_21.method1685();
		Static16.aClass56_Sub1_25.method1685();
		Static95.aClass56_Sub1_22.method1685();
		Static88.aClass56_Sub1_19.method1685();
		Static57.aClass56_Sub1_16.method1685();
		Static16.aClass56_Sub1_24.method1685();
		Static41.aClass56_Sub1_14.method1685();
		Static17.aClass56_Sub1_8.method1685();
		Static83.aClass56_Sub1_17.method1685();
		Static35.aClass56_Sub1_11.method1685();
	}
}

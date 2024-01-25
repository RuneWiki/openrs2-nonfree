import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!f", name = "x", descriptor = "[I")
	public static int[] anIntArray103;

	@OriginalMember(owner = "client!f", name = "F", descriptor = "I")
	public static int anInt1904;

	@OriginalMember(owner = "client!f", name = "C", descriptor = "[[I")
	public static final int[][] anIntArrayArray12 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!f", name = "I", descriptor = "I")
	public static int anInt1907 = 0;

	@OriginalMember(owner = "client!f", name = "L", descriptor = "I")
	public static int anInt1909 = -1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Lclient!gn;")
	public static Class5_Sub19 method1757(@OriginalArg(0) int arg0) {
		return (Class5_Sub19) Static331.aClass42_54.method1052((long) arg0);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ls;Lclient!ra;BLclient!ra;)V")
	public static void method1758(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) Class170 arg1, @OriginalArg(3) Class170 arg2) {
		Static344.aClass170_10 = arg1;
		Static130.aClass170_56 = arg2;
		Static134.anInterface6_1 = arg0;
		if (Static344.aClass170_10 != null) {
			Static178.anInt3559 = Static344.aClass170_10.method4575(1);
		}
		if (Static130.aClass170_56 != null) {
			Static123.anInt2595 = Static130.aClass170_56.method4575(1);
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)V")
	public static void method1765() {
		if (Static28.anInt770 > 0) {
			Static310.method5284();
		} else {
			Static240.aClass68_19 = Static95.aClass68_23;
			Static95.aClass68_23 = null;
			Static293.method4971(40);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method1769(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static32.anInt859 >= 100) {
			Static217.method3824(Static47.aString65);
			return;
		}
		@Pc(21) String local21 = Static334.method5595(arg0);
		if (local21 == null) {
			return;
		}
		@Pc(65) String local65;
		for (@Pc(26) int local26 = 0; local26 < Static32.anInt859; local26++) {
			@Pc(34) String local34 = Static334.method5595(Static31.aStringArray1[local26]);
			if (local34 != null && local34.equals(local21)) {
				Static217.method3824(arg0 + Static90.aString252);
				return;
			}
			if (Static44.aStringArray25[local26] != null) {
				local65 = Static334.method5595(Static44.aStringArray25[local26]);
				if (local65 != null && local65.equals(local21)) {
					Static217.method3824(arg0 + Static90.aString252);
					return;
				}
			}
		}
		for (@Pc(100) int local100 = 0; local100 < Static31.anInt829; local100++) {
			local65 = Static334.method5595(Static61.aStringArray8[local100]);
			if (local65 != null && local65.equals(local21)) {
				Static217.method3824(Static181.aString217 + arg0 + Static350.aString377);
				return;
			}
			if (Static72.aStringArray9[local100] != null) {
				@Pc(139) String local139 = Static334.method5595(Static72.aStringArray9[local100]);
				if (local139 != null && local139.equals(local21)) {
					Static217.method3824(Static181.aString217 + arg0 + Static350.aString377);
					return;
				}
			}
		}
		if (Static334.method5595(Static85.aClass25_Sub1_Sub1_Sub1_1.aString237).equals(local21)) {
			Static217.method3824(Static276.aString310);
		} else {
			Static335.aClass5_Sub1_Sub1_3.method174(251);
			Static335.aClass5_Sub1_Sub1_3.method1886(Static344.method954(arg0) + 1);
			Static335.aClass5_Sub1_Sub1_3.method1849(arg0);
			Static335.aClass5_Sub1_Sub1_3.method1886(arg1 ? 1 : 0);
		}
	}
}

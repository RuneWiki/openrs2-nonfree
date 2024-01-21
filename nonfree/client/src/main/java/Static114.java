import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "Lclient!kd;")
	public static Class44_Sub1 aClass44_Sub1_75;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "Lclient!tb;")
	public static Class44 aClass44_63;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1563 = Static33.method650("Choose Option");

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
	public static int anInt2884 = 0;

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1564 = Static33.method650(" )2> @lre@");

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1565 = Static33.method650("m");

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1566 = Static33.method650("Untersuchen");

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1567 = Static33.method650("sl_button");

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1568 = Static33.method650("backvmid1");

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1569 = aClass56_1563;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "[Lclient!pb;")
	public static Class59[] aClass59Array1 = new Class59[50];

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method1872() {
		aClass56_1566 = null;
		aClass44_Sub1_75 = null;
		aClass56_1567 = null;
		aClass56_1564 = null;
		aClass59Array1 = null;
		aClass44_63 = null;
		aClass56_1563 = null;
		aClass56_1568 = null;
		aClass56_1569 = null;
		aClass56_1565 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ae;I)V")
	public static void method1873(@OriginalArg(0) Class5 arg0) {
		Static7.aClass5_2 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
	public static void method1874() {
		if (Static58.aString3.toLowerCase().indexOf("microsoft") != -1) {
			Static59.anIntArray134[222] = 59;
			Static59.anIntArray134[187] = 27;
			Static59.anIntArray134[219] = 42;
			Static59.anIntArray134[221] = 43;
			Static59.anIntArray134[192] = 58;
			Static59.anIntArray134[223] = 28;
			Static59.anIntArray134[220] = 74;
			Static59.anIntArray134[191] = 73;
			Static59.anIntArray134[188] = 71;
			Static59.anIntArray134[186] = 57;
			Static59.anIntArray134[189] = 26;
			Static59.anIntArray134[190] = 72;
			return;
		}
		Static59.anIntArray134[61] = 27;
		Static59.anIntArray134[92] = 74;
		Static59.anIntArray134[93] = 43;
		Static59.anIntArray134[59] = 57;
		Static59.anIntArray134[45] = 26;
		Static59.anIntArray134[46] = 72;
		Static59.anIntArray134[44] = 71;
		Static59.anIntArray134[91] = 42;
		if (Static58.aMethod2 == null) {
			Static59.anIntArray134[222] = 59;
			Static59.anIntArray134[192] = 58;
		} else {
			Static59.anIntArray134[520] = 59;
			Static59.anIntArray134[222] = 58;
			Static59.anIntArray134[192] = 28;
		}
		Static59.anIntArray134[47] = 73;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLclient!ve;I[B)V")
	public static void method1875(@OriginalArg(1) Class80 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class3_Sub15 local7 = new Class3_Sub15();
		local7.anInt2514 = 0;
		local7.aLong94 = arg1;
		local7.aClass80_4 = arg0;
		local7.aByteArray33 = arg2;
		@Pc(22) Class37 local22 = Static45.aClass37_8;
		synchronized (Static45.aClass37_8) {
			Static45.aClass37_8.method985(local7);
		}
		Static104.method1742();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBI)I")
	public static int method1876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class3_Sub18 local10 = (Class3_Sub18) Static56.aClass2_3.method17((long) arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && local10.anIntArray298.length > arg0) {
			return local10.anIntArray298[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V")
	public static void method1877(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int[] local12 = new int[4];
		@Pc(14) int local14 = 1;
		@Pc(17) int[] local17 = new int[4];
		local17[0] = arg1;
		local12[0] = arg0;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			if (Static83.anIntArray191[local27] != arg1) {
				local17[local14] = Static83.anIntArray191[local27];
				local12[local14] = Static84.anIntArray193[local27];
				local14++;
			}
		}
		Static84.anIntArray193 = local12;
		Static83.anIntArray191 = local17;
		Static32.method646(Static84.anIntArray193, Static83.anIntArray191, 0, Static16.aClass75Array1.length - 1, Static16.aClass75Array1);
	}
}

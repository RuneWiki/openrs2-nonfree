import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
	public static int anInt184;

	@OriginalMember(owner = "client!ah", name = "R", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!ah", name = "W", descriptor = "[Lclient!dn;")
	public static Class51[] aClass51Array1;

	@OriginalMember(owner = "client!ah", name = "M", descriptor = "[[I")
	public static final int[][] anIntArrayArray6 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!ah", name = "Q", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_6 = new Class85("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!ah", name = "U", descriptor = "I")
	public static int anInt187 = -2;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BZ)V")
	public static void method168(@OriginalArg(1) boolean arg0) {
		for (@Pc(8) Class5_Sub7 local8 = (Class5_Sub7) Static296.aClass103_138.method2756(); local8 != null; local8 = (Class5_Sub7) Static296.aClass103_138.method2748()) {
			if (local8.aClass5_Sub16_Sub3_1 != null) {
				Static114.aClass5_Sub16_Sub4_1.method5798(local8.aClass5_Sub16_Sub3_1);
				local8.aClass5_Sub16_Sub3_1 = null;
			}
			if (local8.aClass5_Sub16_Sub3_2 != null) {
				Static114.aClass5_Sub16_Sub4_1.method5798(local8.aClass5_Sub16_Sub3_2);
				local8.aClass5_Sub16_Sub3_2 = null;
			}
			local8.method6005();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(51) Class5_Sub7 local51 = (Class5_Sub7) Static143.aClass103_70.method2756(); local51 != null; local51 = (Class5_Sub7) Static143.aClass103_70.method2748()) {
			if (local51.aClass5_Sub16_Sub3_1 != null) {
				Static114.aClass5_Sub16_Sub4_1.method5798(local51.aClass5_Sub16_Sub3_1);
				local51.aClass5_Sub16_Sub3_1 = null;
			}
			local51.method6005();
		}
		for (@Pc(77) Class5_Sub7 local77 = (Class5_Sub7) Static199.aClass190_22.method5471(); local77 != null; local77 = (Class5_Sub7) Static199.aClass190_22.method5465()) {
			if (local77.aClass5_Sub16_Sub3_1 != null) {
				Static114.aClass5_Sub16_Sub4_1.method5798(local77.aClass5_Sub16_Sub3_1);
				local77.aClass5_Sub16_Sub3_1 = null;
			}
			local77.method6005();
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)I")
	public static int method169(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(IB)V")
	public static void method170(@OriginalArg(0) int arg0) {
		if (!Static92.method1683(arg0)) {
			return;
		}
		@Pc(18) Class201[] local18 = Static304.aClass201ArrayArray1[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(25) Class201 local25 = local18[local20];
			if (local25 != null) {
				local25.anInt6534 = 0;
				local25.anInt6549 = 1;
				local25.anInt6490 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)V")
	public static void method172() {
		@Pc(5) Class109 local5 = Static291.aClass109_53;
		synchronized (Static291.aClass109_53) {
			Static291.aClass109_53.method2859(5);
		}
	}
}

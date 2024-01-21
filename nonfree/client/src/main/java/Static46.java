import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_11;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "[Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3[] aClass2_Sub1_Sub4_Sub3Array5;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "Lclient!da;")
	public static Class15 aClass15_34;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_12;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Lclient!bc;")
	public static Class7 aClass7_3 = new Class7(4096);

	@OriginalMember(owner = "client!id", name = "d", descriptor = "I")
	public static volatile int anInt1371 = 0;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "I")
	public static int anInt1372 = 0;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "Lclient!wb;")
	public static Class65 aClass65_608 = Static24.method441("Icons redrawn");

	@OriginalMember(owner = "client!id", name = "g", descriptor = "Lclient!wb;")
	public static Class65 aClass65_609 = Static24.method441("k");

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Lclient!ge;")
	public static Class21 aClass21_16 = new Class21(50);

	@OriginalMember(owner = "client!id", name = "j", descriptor = "I")
	public static int anInt1373 = -1;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "I")
	public static int anInt1374 = 0;

	@OriginalMember(owner = "client!id", name = "m", descriptor = "I")
	public static int anInt1375 = -1;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "I")
	public static int anInt1376 = -1;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "[I")
	public static int[] anIntArray193 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!id", name = "q", descriptor = "Lclient!wb;")
	public static Class65 aClass65_610 = Static24.method441("chatback");

	@OriginalMember(owner = "client!id", name = "r", descriptor = "Lclient!wb;")
	public static Class65 aClass65_611 = Static24.method441("@yel@*V");

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)Z")
	public static boolean method816(@OriginalArg(0) int arg0) {
		if (Static39.aBooleanArray11[arg0]) {
			return true;
		} else if (Static21.aClass33_40.method1141(arg0)) {
			@Pc(23) int local23 = Static21.aClass33_40.method1153(arg0);
			if (local23 == 0) {
				Static39.aBooleanArray11[arg0] = true;
				return true;
			}
			if (Static89.aClass2_Sub1_Sub2ArrayArray1[arg0] == null) {
				Static89.aClass2_Sub1_Sub2ArrayArray1[arg0] = new Class2_Sub1_Sub2[local23];
			}
			for (@Pc(47) int local47 = 0; local47 < local23; local47++) {
				if (Static89.aClass2_Sub1_Sub2ArrayArray1[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static21.aClass33_40.method1150(local47, arg0);
					if (local61 != null) {
						Static89.aClass2_Sub1_Sub2ArrayArray1[arg0][local47] = new Class2_Sub1_Sub2();
						Static89.aClass2_Sub1_Sub2ArrayArray1[arg0][local47].method81(new Class2_Sub8(local61));
					}
				}
			}
			Static39.aBooleanArray11[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method817() {
		aClass65_609 = null;
		aClass21_16 = null;
		aClass7_3 = null;
		aClass65_610 = null;
		aClass2_Sub1_Sub4_Sub3Array5 = null;
		aClass15_34 = null;
		aClass2_Sub1_Sub4_Sub3_11 = null;
		aClass65_608 = null;
		aClass2_Sub1_Sub4_Sub3_12 = null;
		aClass65_611 = null;
		anIntArray193 = null;
	}
}

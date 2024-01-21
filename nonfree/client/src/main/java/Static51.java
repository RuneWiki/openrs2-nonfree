import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString5;

	@OriginalMember(owner = "client!i", name = "t", descriptor = "Lclient!pa;")
	public static Class35_Sub1 aClass35_Sub1_13;

	@OriginalMember(owner = "client!i", name = "v", descriptor = "Lclient!ub;")
	public static Class11 aClass11_1;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "Lclient!id;")
	public static Class34 aClass34_719 = null;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "Lclient!id;")
	private static Class34 aClass34_720 = Static9.method266("Loading interfaces )2 ");

	@OriginalMember(owner = "client!i", name = "f", descriptor = "Lclient!wd;")
	public static Class1_Sub19_Sub1 aClass1_Sub19_Sub1_4 = new Class1_Sub19_Sub1(5000);

	@OriginalMember(owner = "client!i", name = "h", descriptor = "Lclient!id;")
	public static Class34 aClass34_721 = Static9.method266("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!i", name = "i", descriptor = "[I")
	public static int[] anIntArray154 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!i", name = "j", descriptor = "I")
	public static int anInt1482 = 0;

	@OriginalMember(owner = "client!i", name = "k", descriptor = "Lclient!id;")
	public static Class34 aClass34_722 = aClass34_720;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "Lclient!id;")
	public static Class34 aClass34_723 = Static9.method266("Versteckt");

	@OriginalMember(owner = "client!i", name = "m", descriptor = "Lclient!id;")
	public static Class34 aClass34_724 = Static9.method266("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!i", name = "p", descriptor = "[Lclient!id;")
	public static Class34[] aClass34Array11 = new Class34[100];

	@OriginalMember(owner = "client!i", name = "q", descriptor = "I")
	public static int anInt1484 = 0;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "Lclient!id;")
	public static Class34 aClass34_725 = Static9.method266("Ausw-=hlen");

	@OriginalMember(owner = "client!i", name = "s", descriptor = "[I")
	public static int[] anIntArray155 = new int[500];

	@OriginalMember(owner = "client!i", name = "u", descriptor = "Lclient!id;")
	public static Class34 aClass34_726 = Static9.method266("");

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(JI)V")
	public static void method918(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static90.anInt3112; local19++) {
			if (Static116.aLongArray6[local19] == arg0) {
				Static90.anInt3112--;
				for (@Pc(37) int local37 = local19; local37 < Static90.anInt3112; local37++) {
					Static61.aClass34Array13[local37] = Static61.aClass34Array13[local37 + 1];
					Static77.anIntArray242[local37] = Static77.anIntArray242[local37 + 1];
					Static116.aLongArray6[local37] = Static116.aLongArray6[local37 + 1];
					Static15.anIntArray60[local37] = Static15.anIntArray60[local37 + 1];
				}
				Static38.anInt1125 = Static70.anInt1848;
				Static21.aClass1_Sub19_Sub1_1.method2105(180);
				Static21.aClass1_Sub19_Sub1_1.method2073(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIZ)V")
	public static void method919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (local7 = 0; local7 < 8; local7++) {
				Static98.anIntArrayArrayArray4[arg1][local3 + arg2][arg0 + local7] = 0;
			}
		}
		if (arg2 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static98.anIntArrayArrayArray4[arg1][arg2][arg0 + local7] = Static98.anIntArrayArrayArray4[arg1][arg2 - 1][local7 + arg0];
			}
		}
		if (arg0 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static98.anIntArrayArrayArray4[arg1][local7 + arg2][arg0] = Static98.anIntArrayArrayArray4[arg1][local7 + arg2][arg0 - 1];
			}
		}
		if (arg2 > 0 && Static98.anIntArrayArrayArray4[arg1][arg2 - 1][arg0] != 0) {
			Static98.anIntArrayArrayArray4[arg1][arg2][arg0] = Static98.anIntArrayArrayArray4[arg1][arg2 - 1][arg0];
		} else if (arg0 > 0 && Static98.anIntArrayArrayArray4[arg1][arg2][arg0 - 1] != 0) {
			Static98.anIntArrayArrayArray4[arg1][arg2][arg0] = Static98.anIntArrayArrayArray4[arg1][arg2][arg0 - 1];
		} else if (arg2 > 0 && arg0 > 0 && Static98.anIntArrayArrayArray4[arg1][arg2 - 1][arg0 - 1] != 0) {
			Static98.anIntArrayArrayArray4[arg1][arg2][arg0] = Static98.anIntArrayArrayArray4[arg1][arg2 - 1][arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
	public static void method920() {
		aClass34_725 = null;
		aString5 = null;
		aClass34_726 = null;
		aClass34_719 = null;
		aClass1_Sub19_Sub1_4 = null;
		aClass34_723 = null;
		aClass11_1 = null;
		aClass34_724 = null;
		aClass34_722 = null;
		aClass35_Sub1_13 = null;
		anIntArray154 = null;
		aClass34_720 = null;
		aClass34Array11 = null;
		anIntArray155 = null;
		aClass34_721 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II[BI)Lclient!id;")
	public static Class34 method921(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class34 local13 = new Class34();
		local13.aByteArray20 = new byte[arg0];
		local13.anInt1553 = 0;
		for (@Pc(26) int local26 = arg2; local26 < arg2 + arg0; local26++) {
			if (arg1[local26] != 0) {
				local13.aByteArray20[local13.anInt1553++] = arg1[local26];
			}
		}
		return local13;
	}
}

import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "J")
	public static long aLong32;

	@OriginalMember(owner = "client!ga", name = "M", descriptor = "Lclient!bd;")
	public static Class8 aClass8_12;

	@OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
	public static int anInt1257;

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "Lclient!a;")
	public static Class1 aClass1_1219 = Static94.method1596("T");

	@OriginalMember(owner = "client!ga", name = "B", descriptor = "[Lclient!a;")
	public static Class1[] aClass1Array11 = new Class1[100];

	@OriginalMember(owner = "client!ga", name = "C", descriptor = "Lclient!a;")
	private static Class1 aClass1_1220 = Static94.method1596("Enter your username (V password)3");

	@OriginalMember(owner = "client!ga", name = "D", descriptor = "[I")
	public static int[] anIntArray124 = new int[5];

	@OriginalMember(owner = "client!ga", name = "E", descriptor = "[I")
	public static int[] anIntArray125 = new int[2000];

	@OriginalMember(owner = "client!ga", name = "F", descriptor = "Lclient!a;")
	private static Class1 aClass1_1221 = Static94.method1596("This computers address has been blocked");

	@OriginalMember(owner = "client!ga", name = "G", descriptor = "Lclient!a;")
	public static Class1 aClass1_1222 = Static94.method1596("welle:");

	@OriginalMember(owner = "client!ga", name = "I", descriptor = "Lclient!a;")
	public static Class1 aClass1_1223 = aClass1_1221;

	@OriginalMember(owner = "client!ga", name = "O", descriptor = "Lclient!a;")
	public static Class1 aClass1_1224 = aClass1_1220;

	@OriginalMember(owner = "client!ga", name = "Y", descriptor = "Lclient!a;")
	private static Class1 aClass1_1230 = Static94.method1596("Loaded interfaces");

	@OriginalMember(owner = "client!ga", name = "P", descriptor = "Lclient!a;")
	public static Class1 aClass1_1225 = aClass1_1230;

	@OriginalMember(owner = "client!ga", name = "S", descriptor = "Lclient!a;")
	public static Class1 aClass1_1226 = Static94.method1596("headicons_prayer");

	@OriginalMember(owner = "client!ga", name = "U", descriptor = "Lclient!a;")
	private static Class1 aClass1_1227 = Static94.method1596("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!ga", name = "eb", descriptor = "Lclient!a;")
	private static Class1 aClass1_1234 = Static94.method1596("Password: ");

	@OriginalMember(owner = "client!ga", name = "V", descriptor = "Lclient!a;")
	public static Class1 aClass1_1228 = aClass1_1234;

	@OriginalMember(owner = "client!ga", name = "Z", descriptor = "Lclient!a;")
	private static Class1 aClass1_1231 = Static94.method1596("Report abuse");

	@OriginalMember(owner = "client!ga", name = "W", descriptor = "Lclient!a;")
	public static Class1 aClass1_1229 = aClass1_1231;

	@OriginalMember(owner = "client!ga", name = "bb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1232 = aClass1_1227;

	@OriginalMember(owner = "client!ga", name = "cb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1233 = Static94.method1596("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
	public static void method859() {
		aClass1_1225 = null;
		aClass1_1226 = null;
		aClass1_1221 = null;
		anIntArray124 = null;
		aClass1_1231 = null;
		aClass1_1227 = null;
		anIntArray125 = null;
		aClass1_1223 = null;
		aClass1_1232 = null;
		aClass1_1228 = null;
		aClass1_1233 = null;
		aClass1_1230 = null;
		aClass1_1234 = null;
		aClass1_1219 = null;
		aClass1_1224 = null;
		aClass1_1229 = null;
		aClass1_1220 = null;
		aClass1Array11 = null;
		aClass1_1222 = null;
		aClass8_12 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method860(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static98.aClass55_1);
		arg0.removeFocusListener(Static98.aClass55_1);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII)V")
	public static void method861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
			Static73.anInt1989 = -1;
			Static34.anInt1275 = -1;
			return;
		}
		@Pc(33) int local33 = Static65.method1338(Static2.anInt287, arg2, arg1) - arg0;
		@Pc(37) int local37 = arg1 - Static41.anInt1396;
		@Pc(41) int local41 = local33 - Static59.anInt1824;
		@Pc(45) int local45 = Static75.anIntArray256[Static47.anInt1561];
		@Pc(49) int local49 = Static75.anIntArray254[Static47.anInt1561];
		@Pc(53) int local53 = arg2 - Static21.anInt916;
		@Pc(57) int local57 = Static75.anIntArray254[Static4.anInt376];
		@Pc(61) int local61 = Static75.anIntArray256[Static4.anInt376];
		@Pc(71) int local71 = local37 * local57 + local53 * local61 >> 16;
		@Pc(81) int local81 = local61 * local37 - local53 * local57 >> 16;
		@Pc(88) int local88 = local71;
		@Pc(98) int local98 = local41 * local45 - local81 * local49 >> 16;
		@Pc(108) int local108 = local81 * local45 + local41 * local49 >> 16;
		if (local108 < 50) {
			Static73.anInt1989 = -1;
			Static34.anInt1275 = -1;
		} else {
			Static34.anInt1275 = (local88 << 9) / local108 + 256;
			Static73.anInt1989 = (local98 << 9) / local108 + 167;
		}
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V")
	public static void method862() {
		for (@Pc(7) int local7 = -1; local7 < Static99.anInt2521; local7++) {
			@Pc(15) int local15;
			if (local7 == -1) {
				local15 = 2047;
			} else {
				local15 = Static93.anIntArray292[local7];
			}
			@Pc(25) Class2_Sub1_Sub1_Sub1_Sub1 local25 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local15];
			if (local25 != null && local25.anInt2709 > 0) {
				local25.anInt2709--;
				if (local25.anInt2709 == 0) {
					local25.aClass1_2863 = null;
				}
			}
		}
		for (@Pc(62) int local62 = 0; local62 < Static44.anInt1516; local62++) {
			@Pc(68) int local68 = Static20.anIntArray89[local62];
			@Pc(72) Class2_Sub1_Sub1_Sub1_Sub2 local72 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local68];
			if (local72 != null && local72.anInt2709 > 0) {
				local72.anInt2709--;
				if (local72.anInt2709 == 0) {
					local72.aClass1_2863 = null;
				}
			}
		}
	}
}

import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ct", name = "s", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ct", name = "E", descriptor = "[[S")
	private static final short[][] aShortArrayArray2 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

	@OriginalMember(owner = "client!ct", name = "F", descriptor = "I")
	public static final int anInt2075 = 1;

	@OriginalMember(owner = "client!ct", name = "J", descriptor = "[[S")
	private static final short[][] aShortArrayArray4 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ct", name = "H", descriptor = "[[S")
	private static final short[][] aShortArrayArray3 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ct", name = "G", descriptor = "[[[S")
	public static final short[][][] aShortArrayArrayArray1 = new short[][][] { aShortArrayArray2, aShortArrayArray4, aShortArrayArray3 };

	@OriginalMember(owner = "client!ct", name = "I", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_18 = new Class200(41, -1);

	@OriginalMember(owner = "client!ct", name = "K", descriptor = "[Lclient!on;")
	public static final Class251[] aClass251Array1 = new Class251[8];

	@OriginalMember(owner = "client!ct", name = "L", descriptor = "Lclient!mr;")
	public static final Class223 aClass223_11 = new Class223();

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(III)Z")
	public static boolean method1942(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static15.method837(arg1, arg0) || Static200.method3474(arg0, arg1);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IBI)Z")
	public static boolean method1943(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static485.method7224(arg0, arg1) | (arg1 & 0x10000) != 0 || Static586.method8273(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static200.method3474(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZII)V")
	public static void method1951(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub32 local8 = Static210.method3568(arg0, arg1);
		if (local8 != null) {
			local8.method8769();
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
	public static void method1952() {
		Static642.method8751(Static262.aClass3_Sub27_12.aClass21_Sub18_1.method6208() == 1);
		Static105.aClass188_1 = Static176.method3076(0, Static205.aClass138_2, Static364.aCanvas13, 22050);
		Static429.method6680(Static596.method8353(null));
		Static181.aClass188_3 = Static176.method3076(1, Static205.aClass138_2, Static364.aCanvas13, 2048);
		Static204.aClass3_Sub7_Sub1_1 = new Class3_Sub7_Sub1();
		Static181.aClass188_3.method7768(Static204.aClass3_Sub7_Sub1_1);
		Static166.aClass97_1 = new Class97(22050, Static276.anInt4980);
		Static464.method7046();
	}
}

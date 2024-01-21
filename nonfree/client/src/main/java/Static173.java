import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static173 {

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "Lclient!oc;")
	public static Class71_Sub1 aClass71_Sub1_21;

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
	public static int anInt3684;

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
	public static int anInt3686;

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "Lclient!ne;")
	public static Class2_Sub16 aClass2_Sub16_1;

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "[I")
	public static final int[] anIntArray316 = new int[2000];

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "[I")
	public static final int[] anIntArray317 = new int[5];

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
	public static int anInt3687 = 0;

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "Lclient!kg;")
	public static final Class53 aClass53_22 = new Class53(64);

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "Z")
	public static boolean aBoolean158 = true;

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1298 = Static151.method2243("Neuer Benutzer");

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1299 = Static151.method2243("Discard");

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1300 = aClass62_1299;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!pb;IIZZII)V")
	public static void method2525(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static46.anInt1030 = arg1;
		Static49.anInt1075 = arg2;
		Static80.anInt1663 = 0;
		Static40.aBoolean40 = false;
		Static59.anInt1222 = 2;
		Static21.aClass71_3 = arg0;
		Static35.anInt841 = 1;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	public static void method2526() {
		Static117.aClass53_13.method1649();
	}
}

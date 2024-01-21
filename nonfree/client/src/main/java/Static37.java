import java.awt.FontMetrics;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!g", name = "f", descriptor = "Lclient!re;")
	public static Class9 aClass9_43;

	@OriginalMember(owner = "client!g", name = "A", descriptor = "[Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1[] aClass2_Sub2_Sub1_Sub1Array9;

	@OriginalMember(owner = "client!g", name = "Y", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics2;

	@OriginalMember(owner = "client!g", name = "r", descriptor = "I")
	public static int anInt1938 = 0;

	@OriginalMember(owner = "client!g", name = "D", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!g", name = "F", descriptor = "Lclient!u;")
	public static Class74 aClass74_1319 = Static72.method1077("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!g", name = "H", descriptor = "Lclient!u;")
	private static Class74 aClass74_1320 = Static72.method1077("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!g", name = "M", descriptor = "Lclient!u;")
	public static Class74 aClass74_1321 = Static72.method1077("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AN>");

	@OriginalMember(owner = "client!g", name = "N", descriptor = "Lclient!u;")
	public static Class74 aClass74_1322 = aClass74_1320;

	@OriginalMember(owner = "client!g", name = "R", descriptor = "Lclient!u;")
	public static Class74 aClass74_1323 = Static72.method1077("Mitglieder)2Welt");

	@OriginalMember(owner = "client!g", name = "W", descriptor = "Lclient!u;")
	public static Class74 aClass74_1324 = Static72.method1077("au");

	@OriginalMember(owner = "client!g", name = "X", descriptor = "Lclient!u;")
	private static Class74 aClass74_1325 = Static72.method1077("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!g", name = "ab", descriptor = "Lclient!u;")
	public static Class74 aClass74_1326 = aClass74_1325;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public static void method1354() {
		Static17.anIntArray54 = null;
		Static51.anIntArray312 = null;
		Static24.aByteArrayArray3 = null;
		Static91.anIntArray265 = null;
		Static71.anIntArray194 = null;
		Static57.anIntArray156 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	public static void method1361() {
		aClass74_1321 = null;
		aClass74_1323 = null;
		aClass74_1325 = null;
		aClass2_Sub2_Sub1_Sub1Array9 = null;
		aCalendar2 = null;
		aClass74_1326 = null;
		aFontMetrics2 = null;
		aClass9_43 = null;
		aClass74_1324 = null;
		aClass74_1319 = null;
		aClass74_1322 = null;
		aClass74_1320 = null;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)I")
	public static int method1362(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(19) int local19 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(32) int local32 = (local19 >>> 4) + local19 & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(48) int local48 = local38 + (local38 >>> 16);
		return local48 & 0xFF;
	}
}

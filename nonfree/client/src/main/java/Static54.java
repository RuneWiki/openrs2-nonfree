import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!ja", name = "U", descriptor = "I")
	public static int anInt1472;

	@OriginalMember(owner = "client!ja", name = "cb", descriptor = "I")
	public static int anInt1478;

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
	public static int anInt1446 = 0;

	@OriginalMember(owner = "client!ja", name = "z", descriptor = "Lclient!pb;")
	public static Class61 aClass61_9 = new Class61();

	@OriginalMember(owner = "client!ja", name = "W", descriptor = "Lclient!ja;")
	private static Class39 aClass39_794 = Static28.method504("Malformed login packet)3");

	@OriginalMember(owner = "client!ja", name = "B", descriptor = "Lclient!ja;")
	public static Class39 aClass39_791 = aClass39_794;

	@OriginalMember(owner = "client!ja", name = "P", descriptor = "Lclient!ja;")
	public static Class39 aClass39_792 = Static28.method504("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!ja", name = "S", descriptor = "Lclient!ja;")
	public static Class39 aClass39_793 = Static28.method504("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!ja", name = "Y", descriptor = "Lclient!ja;")
	public static Class39 aClass39_795 = Static28.method504(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(IB)Lclient!he;")
	public static Class4_Sub5 method949(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static109.aClass4_Sub5ArrayArray1[local13] == null || Static109.aClass4_Sub5ArrayArray1[local13][local17] == null) {
			@Pc(31) boolean local31 = Static27.method502(local13);
			if (!local31) {
				return null;
			}
		}
		return Static109.aClass4_Sub5ArrayArray1[local13][local17];
	}

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "(B)V")
	public static void method958() {
		aClass39_793 = null;
		aClass39_791 = null;
		aClass61_9 = null;
		aClass39_792 = null;
		aClass39_795 = null;
		aClass39_794 = null;
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(BI)V")
	public static void method966(@OriginalArg(1) int arg0) {
		if (arg0 == Static88.anInt2205) {
			return;
		}
		if (Static88.anInt2205 == 0) {
			Static70.method1186();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static83.anInt2075 = 0;
			Static85.anInt2125 = 0;
			Static18.anInt433 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static45.aClass69_2 != null) {
			Static45.aClass69_2.method1859();
			Static45.aClass69_2 = null;
		}
		if (Static88.anInt2205 == 25) {
			Static68.anInt1705 = 0;
			Static111.anInt2777 = 0;
			Static75.anInt1799 = 0;
			Static93.anInt3185 = 1;
			Static108.anInt2701 = 1;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static68.method1171(Static8.aCanvas1, Static67.aClass20_Sub1_12, Static127.aClass20_Sub1_20);
		} else {
			Static112.method1973();
		}
		Static88.anInt2205 = arg0;
	}
}

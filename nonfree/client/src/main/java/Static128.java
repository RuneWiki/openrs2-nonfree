import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static128 {

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "Z")
	public static boolean aBoolean263;

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_65 = new Class12(93, 8);

	@OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
	public static int anInt2353 = 0;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)Z")
	public static boolean method2023(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(III)Z")
	public static boolean method2024(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)V")
	public static void method2028(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		Static47.aString8 = arg1;
		Static109.aString58 = arg0;
		if (Static337.anInt5743 != 3 && (Static109.aString58.equals("") || Static47.aString8.equals(""))) {
			Static30.method393(3);
			return;
		}
		Static321.aBoolean622 = false;
		if (Static337.anInt5743 != 1) {
			Static283.anInt4985 = 0;
			Static41.anInt714 = -1;
		}
		Static30.method393(-3);
		Static58.anInt1166 = 1;
		Static271.anInt7119 = 0;
		Static223.anInt5841 = 0;
	}
}

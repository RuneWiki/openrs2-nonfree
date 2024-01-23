import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
	public static int anInt5482;

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "Lclient!ek;")
	public static Class42 aClass42_96;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString189 = " has logged in.";

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString190 = "red:";

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Lclient!ke;")
	public static Class2_Sub18 aClass2_Sub18_1 = new Class2_Sub18(0, 0);

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "Lclient!lj;")
	public static Class106 aClass106_13 = new Class106(64);

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
	public static int anInt5481 = 0;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)Ljava/lang/String;")
	public static String method4337() {
		@Pc(28) String local28;
		if (Static73.anInt1823 == 1 && Static68.anInt1741 < 2) {
			local28 = Static21.aString22 + Static260.aString172 + Static4.aString3 + " ->";
		} else if (Static287.aBoolean373 && Static68.anInt1741 < 2) {
			local28 = Static251.aString167 + Static260.aString172 + Static96.aString83 + " ->";
		} else if (Static72.aBoolean117 && Static145.aBooleanArray13[81] && Static68.anInt1741 > 2) {
			local28 = Static143.method2543(Static68.anInt1741 - 2);
		} else {
			local28 = Static143.method2543(Static68.anInt1741 - 1);
		}
		if (Static68.anInt1741 > 2) {
			local28 = local28 + "<col=ffffff> / " + (Static68.anInt1741 - 2) + Static33.aString37;
		}
		return local28;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	public static void method4338() {
		Static89.aClass157_17.method4033();
		Static48.aClass157_10.method4033();
	}
}

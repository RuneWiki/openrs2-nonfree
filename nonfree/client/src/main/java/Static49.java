import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!d", name = "y", descriptor = "Lclient!pb;")
	public static Class14_Sub19_Sub2 aClass14_Sub19_Sub2_1;

	@OriginalMember(owner = "client!d", name = "B", descriptor = "Lclient!mo;")
	public static Class143 aClass143_35;

	@OriginalMember(owner = "client!d", name = "D", descriptor = "Lclient!mo;")
	public static Class143 aClass143_36;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "I")
	public static int anInt1233 = 13156520;

	@OriginalMember(owner = "client!d", name = "l", descriptor = "I")
	public static int anInt1234 = -1;

	@OriginalMember(owner = "client!d", name = "u", descriptor = "Z")
	public static boolean aBoolean82 = false;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IC)Z")
	public static boolean method1191(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)V")
	public static void method1192(@OriginalArg(0) int arg0) {
		for (@Pc(17) Class14 local17 = Static235.aClass25_23.method697(); local17 != null; local17 = Static235.aClass25_23.method694()) {
			if ((long) arg0 == (local17.aLong217 >> 48 & 0xFFFFL)) {
				local17.method5986();
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1194(@OriginalArg(1) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static263.aStringArray61.length; local12++) {
			if (Static263.aStringArray61[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}
}

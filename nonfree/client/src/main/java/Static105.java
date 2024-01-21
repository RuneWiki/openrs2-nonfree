import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "Lclient!sd;")
	public static Class2 aClass2_23;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
	public static int anInt2694;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
	public static int anInt2687 = 0;

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1212 = Static56.method972("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1206 = aClass5_1212;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1215 = Static56.method972("Bad session id)3");

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1207 = aClass5_1215;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "Z")
	public static boolean aBoolean144 = false;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1208 = Static56.method972("Texturen geladen)3");

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1214 = Static56.method972("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1209 = aClass5_1214;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1210 = Static56.method972("glow2:");

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1211 = Static56.method972("k");

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
	public static int anInt2692 = 0;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1213 = aClass5_1210;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public static void method1746() {
		Static102.aClass9_25.method283();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)V")
	public static void method1747(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub13 local10 = (Class3_Sub13) Static15.aClass21_4.method459((long) arg0);
		if (local10 != null) {
			local10.method1966();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)V")
	public static void method1748() {
		Static55.method949(0, false, null, 10);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
	public static void method1749() {
		aClass5_1209 = null;
		aClass2_23 = null;
		aClass5_1208 = null;
		aClass5_1214 = null;
		aClass5_1211 = null;
		aClass5_1210 = null;
		aClass5_1206 = null;
		aClass5_1215 = null;
		aClass5_1212 = null;
		aClass5_1213 = null;
		aClass5_1207 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)V")
	public static void method1750(@OriginalArg(1) boolean arg0) {
		if (Static82.aClass18_2 == null) {
			return;
		}
		try {
			@Pc(11) Class3_Sub6 local11 = new Class3_Sub6(4);
			local11.method1608(arg0 ? 2 : 3);
			local11.method1609(0);
			Static82.aClass18_2.method409(local11.aByteArray17, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				Static82.aClass18_2.method405();
			} catch (@Pc(45) Exception local45) {
			}
			Static82.aClass18_2 = null;
			Static109.anInt2870++;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!m;)Lclient!ae;")
	public static Class5 method1751(@OriginalArg(1) Class3_Sub6 arg0) {
		return Static106.method1778(arg0);
	}
}

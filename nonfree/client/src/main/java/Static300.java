import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!km", name = "t", descriptor = "Lclient!da;")
	public static Class68 aClass68_4;

	@OriginalMember(owner = "client!km", name = "K", descriptor = "I")
	public static int anInt2386;

	@OriginalMember(owner = "client!km", name = "L", descriptor = "[I")
	public static int[] anIntArray106;

	@OriginalMember(owner = "client!km", name = "P", descriptor = "I")
	private static int anInt2389;

	@OriginalMember(owner = "client!km", name = "Q", descriptor = "I")
	private static int anInt2390;

	@OriginalMember(owner = "client!km", name = "R", descriptor = "I")
	private static int anInt2391;

	@OriginalMember(owner = "client!km", name = "S", descriptor = "I")
	private static int anInt2392;

	@OriginalMember(owner = "client!km", name = "T", descriptor = "Z")
	private static boolean aBoolean196;

	@OriginalMember(owner = "client!km", name = "U", descriptor = "Z")
	private static boolean aBoolean197;

	@OriginalMember(owner = "client!km", name = "V", descriptor = "Z")
	private static boolean aBoolean198;

	@OriginalMember(owner = "client!km", name = "W", descriptor = "Z")
	private static boolean aBoolean199;

	@OriginalMember(owner = "client!km", name = "X", descriptor = "Z")
	private static boolean aBoolean200;

	@OriginalMember(owner = "client!km", name = "Y", descriptor = "Z")
	private static boolean aBoolean201;

	@OriginalMember(owner = "client!km", name = "Z", descriptor = "Z")
	private static boolean aBoolean202;

	@OriginalMember(owner = "client!km", name = "ab", descriptor = "I")
	private static int anInt2393;

	@OriginalMember(owner = "client!km", name = "bb", descriptor = "Z")
	private static boolean aBoolean203;

	@OriginalMember(owner = "client!km", name = "cb", descriptor = "I")
	private static int anInt2394;

	@OriginalMember(owner = "client!km", name = "db", descriptor = "Z")
	private static boolean aBoolean204;

	@OriginalMember(owner = "client!km", name = "eb", descriptor = "I")
	private static int anInt2395;

	@OriginalMember(owner = "client!km", name = "fb", descriptor = "Z")
	private static boolean aBoolean205;

	@OriginalMember(owner = "client!km", name = "gb", descriptor = "I")
	private static int anInt2396;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!in;)V")
	public static void method2215(@OriginalArg(1) Class157 arg0) {
		Static577.aClass157_93 = arg0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method2216(@OriginalArg(0) String arg0) {
		return Static590.aHashtable7.containsKey(arg0);
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public static void method2224(@OriginalArg(0) String arg0) {
		if (Static19.aStringArray1 == null) {
			Static447.method7046();
		}
		Static130.aCalendar1.setTime(new Date(Static277.method5091()));
		@Pc(20) int local20 = Static130.aCalendar1.get(11);
		@Pc(24) int local24 = Static130.aCalendar1.get(12);
		@Pc(28) int local28 = Static130.aCalendar1.get(13);
		@Pc(62) String local62 = Integer.toString(local20 / 10) + local20 % 10 + ":" + local24 / 10 + local24 % 10 + ":" + local28 / 10 + local28 % 10;
		@Pc(67) String[] local67 = Static62.method1946('\n', arg0);
		for (@Pc(69) int local69 = 0; local69 < local67.length; local69++) {
			for (@Pc(73) int local73 = Static410.anInt7746; local73 > 0; local73--) {
				Static19.aStringArray1[local73] = Static19.aStringArray1[local73 - 1];
			}
			Static19.aStringArray1[0] = local62 + ": " + local67[local69];
			if (Static107.aFileOutputStream3 != null) {
				try {
					Static107.aFileOutputStream3.write(Static333.method5730(Static19.aStringArray1[0] + "\n"));
				} catch (@Pc(122) IOException local122) {
				}
			}
			if (Static410.anInt7746 < Static19.aStringArray1.length - 1) {
				Static410.anInt7746++;
				if (Static602.anInt10571 > 0) {
					Static602.anInt10571++;
				}
			}
		}
	}
}

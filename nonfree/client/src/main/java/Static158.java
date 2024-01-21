import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static158 {

	@OriginalMember(owner = "client!r", name = "R", descriptor = "Z")
	public static boolean aBoolean163;

	@OriginalMember(owner = "client!r", name = "ib", descriptor = "[I")
	public static int[] anIntArray298;

	@OriginalMember(owner = "client!r", name = "kb", descriptor = "Lclient!af;")
	public static Class6 aClass6_3;

	@OriginalMember(owner = "client!r", name = "bb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1022 = Static81.method1507("glow1:");

	@OriginalMember(owner = "client!r", name = "Q", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1018 = aClass24_1022;

	@OriginalMember(owner = "client!r", name = "T", descriptor = "I")
	public static int anInt3507 = 0;

	@OriginalMember(owner = "client!r", name = "V", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1019 = Static81.method1507("logo");

	@OriginalMember(owner = "client!r", name = "X", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1020 = Static81.method1507("<col=00ff00>");

	@OriginalMember(owner = "client!r", name = "Z", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1021 = Static81.method1507("Abbrechen");

	@OriginalMember(owner = "client!r", name = "cb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1023 = Static81.method1507("Prepared sound engine");

	@OriginalMember(owner = "client!r", name = "db", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1024 = aClass24_1022;

	@OriginalMember(owner = "client!r", name = "hb", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1025 = aClass24_1023;

	@OriginalMember(owner = "client!r", name = "ob", descriptor = "I")
	public static int anInt3516 = 0;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(JI)Lclient!dj;")
	public static Class24 method2688(@OriginalArg(0) long arg0) {
		return Static200.method3378(arg0);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)I")
	public static int method2690(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
			return arg0 - 32;
		} else if (arg0 == 255) {
			return 159;
		} else if (arg0 == 156) {
			return 140;
		} else {
			return arg0;
		}
	}
}

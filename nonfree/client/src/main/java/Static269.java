import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!jp", name = "O", descriptor = "Z")
	private static boolean aBoolean94;

	@OriginalMember(owner = "client!jp", name = "P", descriptor = "I")
	private static int anInt1229;

	@OriginalMember(owner = "client!jp", name = "Q", descriptor = "Z")
	private static boolean aBoolean95;

	@OriginalMember(owner = "client!jp", name = "R", descriptor = "Z")
	private static boolean aBoolean96;

	@OriginalMember(owner = "client!jp", name = "S", descriptor = "Z")
	private static boolean aBoolean97;

	@OriginalMember(owner = "client!jp", name = "T", descriptor = "Z")
	private static boolean aBoolean98;

	@OriginalMember(owner = "client!jp", name = "U", descriptor = "I")
	private static int anInt1230;

	@OriginalMember(owner = "client!jp", name = "V", descriptor = "I")
	private static int anInt1231;

	@OriginalMember(owner = "client!jp", name = "W", descriptor = "I")
	private static int anInt1232;

	@OriginalMember(owner = "client!jp", name = "X", descriptor = "Z")
	private static boolean aBoolean99;

	@OriginalMember(owner = "client!jp", name = "Y", descriptor = "Z")
	private static boolean aBoolean100;

	@OriginalMember(owner = "client!jp", name = "Z", descriptor = "Z")
	private static boolean aBoolean101;

	@OriginalMember(owner = "client!jp", name = "ab", descriptor = "Z")
	private static boolean aBoolean102;

	@OriginalMember(owner = "client!jp", name = "bb", descriptor = "I")
	private static int anInt1233;

	@OriginalMember(owner = "client!jp", name = "cb", descriptor = "I")
	private static int anInt1234;

	@OriginalMember(owner = "client!jp", name = "db", descriptor = "I")
	private static int anInt1235;

	@OriginalMember(owner = "client!jp", name = "eb", descriptor = "I")
	private static int anInt1236;

	@OriginalMember(owner = "client!jp", name = "fb", descriptor = "I")
	private static int anInt1237;

	@OriginalMember(owner = "client!jp", name = "p", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_35 = new Class136(82, 0);

	@OriginalMember(owner = "client!jp", name = "K", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_17 = new Class181(74, 7);

	@OriginalMember(owner = "client!jp", name = "L", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_36 = new Class136(68, 6);

	@OriginalMember(owner = "client!jp", name = "M", descriptor = "I")
	public static int anInt1227 = -1;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(CI)Z")
	public static boolean method1213(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(26) char[] local26 = Static605.aCharArray8;
			for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
				@Pc(34) char local34 = local26[local28];
				if (arg0 == local34) {
					return true;
				}
			}
		}
		return false;
	}
}

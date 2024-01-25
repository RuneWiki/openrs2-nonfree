import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
	public static int anInt1358;

	@OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
	private static int anInt1373;

	@OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
	private static int anInt1374;

	@OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
	private static int anInt1375;

	@OriginalMember(owner = "client!fi", name = "P", descriptor = "Z")
	private static boolean aBoolean93;

	@OriginalMember(owner = "client!fi", name = "Q", descriptor = "Z")
	private static boolean aBoolean94;

	@OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
	private static int anInt1376;

	@OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
	private static int anInt1377;

	@OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
	private static int anInt1378;

	@OriginalMember(owner = "client!fi", name = "U", descriptor = "Z")
	private static boolean aBoolean95;

	@OriginalMember(owner = "client!fi", name = "V", descriptor = "Z")
	private static boolean aBoolean96;

	@OriginalMember(owner = "client!fi", name = "W", descriptor = "Z")
	private static boolean aBoolean97;

	@OriginalMember(owner = "client!fi", name = "X", descriptor = "Z")
	private static boolean aBoolean98;

	@OriginalMember(owner = "client!fi", name = "Y", descriptor = "Z")
	private static boolean aBoolean99;

	@OriginalMember(owner = "client!fi", name = "Z", descriptor = "I")
	private static int anInt1379;

	@OriginalMember(owner = "client!fi", name = "ab", descriptor = "I")
	private static int anInt1380;

	@OriginalMember(owner = "client!fi", name = "bb", descriptor = "Z")
	private static boolean aBoolean100;

	@OriginalMember(owner = "client!fi", name = "cb", descriptor = "Z")
	private static boolean aBoolean101;

	@OriginalMember(owner = "client!fi", name = "db", descriptor = "Z")
	private static boolean aBoolean102;

	@OriginalMember(owner = "client!fi", name = "G", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_25 = new Class187(65, 0);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBII)I")
	public static int method1246(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static298.aClass88Array3 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg2 >> 9;
		@Pc(20) int local20 = arg1 >> 9;
		if (local16 < 0 || local20 < 0 || Static124.anInt2150 - 1 < local16 || Static64.anInt1015 - 1 < local20) {
			return 0;
		}
		@Pc(46) int local46 = arg0;
		if (arg0 < 3 && (Static317.aByteArrayArrayArray13[1][local16][local20] & 0x2) != 0) {
			local46 = arg0 + 1;
		}
		return Static298.aClass88Array3[local46].method8753(arg2, arg1);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
	private static int anInt1871;

	@OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
	private static int anInt1872;

	@OriginalMember(owner = "client!lc", name = "O", descriptor = "Z")
	private static boolean aBoolean167;

	@OriginalMember(owner = "client!lc", name = "P", descriptor = "Z")
	private static boolean aBoolean168;

	@OriginalMember(owner = "client!lc", name = "Q", descriptor = "Z")
	private static boolean aBoolean169;

	@OriginalMember(owner = "client!lc", name = "R", descriptor = "Z")
	private static boolean aBoolean170;

	@OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
	private static int anInt1873;

	@OriginalMember(owner = "client!lc", name = "T", descriptor = "I")
	private static int anInt1874;

	@OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
	private static int anInt1875;

	@OriginalMember(owner = "client!lc", name = "V", descriptor = "Z")
	private static boolean aBoolean171;

	@OriginalMember(owner = "client!lc", name = "W", descriptor = "Z")
	private static boolean aBoolean172;

	@OriginalMember(owner = "client!lc", name = "X", descriptor = "I")
	private static int anInt1876;

	@OriginalMember(owner = "client!lc", name = "Y", descriptor = "Z")
	private static boolean aBoolean173;

	@OriginalMember(owner = "client!lc", name = "Z", descriptor = "Z")
	private static boolean aBoolean174;

	@OriginalMember(owner = "client!lc", name = "ab", descriptor = "Z")
	private static boolean aBoolean175;

	@OriginalMember(owner = "client!lc", name = "bb", descriptor = "Z")
	private static boolean aBoolean176;

	@OriginalMember(owner = "client!lc", name = "cb", descriptor = "I")
	private static int anInt1877;

	@OriginalMember(owner = "client!lc", name = "db", descriptor = "I")
	private static int anInt1878;

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "Z")
	public static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
	public static int anInt1860 = -1;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII)V")
	public static void method1742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class247 local7 = Static332.aClass247ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class23_Sub2_Sub2 local13 = local7.aClass23_Sub2_Sub2_1;
		@Pc(16) Class23_Sub2_Sub2 local16 = local7.aClass23_Sub2_Sub2_2;
		if (local13 != null) {
			local13.aShort114 = (short) (local13.aShort114 * arg3 / (0x10 << Static436.anInt7634 - 7));
			local13.aShort113 = (short) (local13.aShort113 * arg3 / (0x10 << Static436.anInt7634 - 7));
		}
		if (local16 != null) {
			local16.aShort114 = (short) (local16.aShort114 * arg3 / (0x10 << Static436.anInt7634 - 7));
			local16.aShort113 = (short) (local16.aShort113 * arg3 / (0x10 << Static436.anInt7634 - 7));
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!kh;I)V")
	public static void method1745(@OriginalArg(0) Class208 arg0) {
		if (arg0.anInt5643 == 5 && arg0.anInt5645 != -1) {
			Static617.method8092(arg0, Static582.aClass16_12);
		}
	}
}

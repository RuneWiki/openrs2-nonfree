import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
	public static int anInt3717;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Lclient!nk;")
	public static Class85 aClass85_5 = new Class85();

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	public static int anInt3710 = -1;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	public static int anInt3711 = 0;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1009 = null;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	public static int anInt3714 = 0;

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "[S")
	public static short[] aShortArray45 = new short[256];

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)I")
	public static int method2728(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)I")
	public static int method2730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = (arg1 & 0x7F) * arg0 >> 7;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)Z")
	public static boolean method2731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9 = arg3 * Static143.anInt3147 + arg0 * Static51.anInt3008 >> 16;
		@Pc(19) int local19 = arg3 * Static51.anInt3008 - arg0 * Static143.anInt3147 >> 16;
		@Pc(29) int local29 = arg1 * Static212.anInt4563 + local19 * Static92.anInt1984 >> 16;
		@Pc(39) int local39 = arg1 * Static92.anInt1984 - local19 * Static212.anInt4563 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static212.anInt4563 + local19 * Static92.anInt1984 >> 16;
		@Pc(76) int local76 = arg2 * Static92.anInt1984 - local19 * Static212.anInt4563 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > 3500 && local66 > 3500) {
			return false;
		} else if (local50 < Static146.anInt3164 && local87 < Static146.anInt3164) {
			return false;
		} else if (local50 > Static232.anInt4367 && local87 > Static232.anInt4367) {
			return false;
		} else if (local56 < Static177.anInt3841 && local93 < Static177.anInt3841) {
			return false;
		} else {
			return local56 <= Static75.anInt1690 || local93 <= Static75.anInt1690;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)I")
	public static int method2732(@OriginalArg(1) int arg0) {
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

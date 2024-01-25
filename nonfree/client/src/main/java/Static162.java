import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray14;

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "Lclient!lg;")
	public static final Class181 aClass181_2 = new Class181();

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "Lclient!rh;")
	public static final Class256 aClass256_3 = new Class256(1);

	@OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
	public static int anInt2944 = 0;

	@OriginalMember(owner = "client!gj", name = "w", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_144 = new Class296(81, 8);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIB)I")
	public static int method2505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(12) int local12 = 255 - local7;
		@Pc(30) int local30 = (local7 * (arg0 & 0xFF00FF) & 0xFF00FF00 | local7 * (arg0 & 0xFF00) & 0xFF0000) >>> 8;
		return local30 + ((local12 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local12 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(JJ)J")
	public static long method2506(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(IIB)V")
	public static void method2507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class283 local9 = Static251.aClass283ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static124.anInt2517 = local9.anInt7855;
			Static212.anInt4110 = local9.anInt7848;
			Static409.anInt7258 = local9.anInt7850;
		}
		Static503.method6961();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)I")
	public static int method2508(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 & 0x3F;
		@Pc(21) int local21 = arg0 >> 6 & 0x3;
		if (local15 == 18) {
			if (local21 == 0) {
				return 1;
			}
			if (local21 == 1) {
				return 2;
			}
			if (local21 == 2) {
				return 4;
			}
			if (local21 == 3) {
				return 8;
			}
		} else if (local15 == 19 || local15 == 21) {
			if (local21 == 0) {
				return 16;
			}
			if (local21 == 1) {
				return 32;
			}
			if (local21 == 2) {
				return 64;
			}
			if (local21 == 3) {
				return 128;
			}
		}
		return 0;
	}
}

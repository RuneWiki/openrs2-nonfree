import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "J")
	public static long aLong194;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBI)Z")
	public static boolean method5426(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)Lclient!qs;")
	public static Class129 method5434() {
		try {
			return (Class129) Class.forName("Class129_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BB)C")
	public static char method5437(@OriginalArg(1) byte arg0) {
		@Pc(13) int local13 = arg0 & 0xFF;
		if (local13 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local13, 16) + " provided");
		}
		if (local13 >= 128 && local13 < 160) {
			@Pc(44) char local44 = Static268.aCharArray7[local13 - 128];
			if (local44 == '\u0000') {
				local44 = '?';
			}
			local13 = local44;
		}
		return (char) local13;
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(II)V")
	public static void method5439() {
		Static300.aClass165_35.method4394(50);
		Static649.aClass165_78.method4394(50);
		Static45.aClass165_10.method4394(50);
		Static376.aClass165_41.method4394(50);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IJ)V")
	public static void method5440(@OriginalArg(1) long arg0) {
		@Pc(11) int local11 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729 + Static641.anInt10179;
		@Pc(16) int local16 = Static168.anInt3311 + Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731;
		if (Static474.anInt7824 - local11 < -2000 || Static474.anInt7824 - local11 > 2000 || Static350.anInt5703 - local16 < -2000 || Static350.anInt5703 - local16 > 2000) {
			Static350.anInt5703 = local16;
			Static474.anInt7824 = local11;
		}
		@Pc(55) int local55;
		@Pc(63) int local63;
		if (local11 != Static474.anInt7824) {
			local55 = local11 - Static474.anInt7824;
			local63 = (int) (arg0 * (long) local55 / 320L);
			if (local55 <= 0) {
				if (local63 == 0) {
					local63 = -1;
				} else if (local55 > local63) {
					local63 = local55;
				}
			} else if (local63 == 0) {
				local63 = 1;
			} else if (local63 > local55) {
				local63 = local55;
			}
			Static474.anInt7824 += local63;
		}
		Static667.aFloat212 += Static577.aFloat226 * (float) arg0 / 6.0F;
		if (local16 != Static350.anInt5703) {
			local55 = local16 - Static350.anInt5703;
			local63 = (int) (arg0 * (long) local55 / 320L);
			if (local55 > 0) {
				if (local63 == 0) {
					local63 = 1;
				} else if (local55 < local63) {
					local63 = local55;
				}
			} else if (local63 == 0) {
				local63 = -1;
			} else if (local55 > local63) {
				local63 = local55;
			}
			Static350.anInt5703 += local63;
		}
		Static618.aFloat207 += (float) arg0 * Static667.aFloat213 / 6.0F;
		Static58.method1275();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZIII)I")
	public static int method5441(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub24 local8 = Static640.method8894(arg2, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local8.anIntArray307.length) {
			return local8.anIntArray307[arg1];
		} else {
			return -1;
		}
	}
}

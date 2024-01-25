import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!so", name = "F", descriptor = "[I")
	public static final int[] anIntArray456 = new int[25];

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method4904(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method4905(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static272.aBoolean393) {
			return false;
		}
		@Pc(18) int local18 = arg1 >> 16;
		@Pc(22) int local22 = arg1 & 0xFFFF;
		if (Static271.aClass21ArrayArray1[local18] == null || Static271.aClass21ArrayArray1[local18][local22] == null) {
			return false;
		}
		@Pc(40) Class21 local40 = Static271.aClass21ArrayArray1[local18][local22];
		@Pc(55) Class4_Sub39 local55;
		if (arg0 == -1 && local40.anInt722 == 0) {
			for (local55 = (Class4_Sub39) Static58.aClass116_7.method3270(); local55 != null; local55 = (Class4_Sub39) Static58.aClass116_7.method3272()) {
				if (local55.anInt5716 == 23 || local55.anInt5716 == 1008 || local55.anInt5716 == 18 || local55.anInt5716 == 44 || local55.anInt5716 == 11) {
					for (@Pc(143) Class21 local143 = Static92.method534(local55.anInt5718); local143 != null; local143 = Static271.method4639(local143)) {
						if (local40.anInt728 == local143.anInt728) {
							return true;
						}
					}
				}
			}
		} else {
			for (local55 = (Class4_Sub39) Static58.aClass116_7.method3270(); local55 != null; local55 = (Class4_Sub39) Static58.aClass116_7.method3272()) {
				if (arg0 == local55.anInt5722 && local55.anInt5718 == local40.anInt728 && (local55.anInt5716 == 23 || local55.anInt5716 == 1008 || local55.anInt5716 == 18 || local55.anInt5716 == 44 || local55.anInt5716 == 11)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(I)V")
	public static void method4909() {
		if (Static345.aBoolean488) {
			return;
		}
		if (Static24.aBoolean37) {
			Static106.aFloat31 = (int) Static106.aFloat31 + 191 & 0xFFFFFF80;
		} else {
			Static172.aFloat67 += (24.0F - Static172.aFloat67) / 2.0F;
		}
		Static73.aBoolean138 = true;
		Static345.aBoolean488 = true;
	}

	@OriginalMember(owner = "client!so", name = "i", descriptor = "(B)V")
	public static void method4911() {
		Static88.aClass58_12 = null;
		Static252.anInt5147 = -1;
	}
}

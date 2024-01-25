import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "Lclient!qj;")
	public static Class165 aClass165_94;

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "C")
	public static char aChar3;

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "Lclient!qj;")
	public static Class165 aClass165_95;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)V")
	public static void method5326() {
		Static160.anInt3183 = 0;
		Static158.aBoolean276 = false;
		Static3.anInt77 = 1;
		Static77.aClass165_25 = null;
		Static259.anInt5035 = -1;
		Static292.anInt5680 = 2;
		Static68.anInt1415 = -1;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BIIIII)V")
	public static void method5327(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = arg2 - arg0;
		@Pc(20) int local20 = arg4 - arg3;
		if (local15 == 0) {
			if (local20 != 0) {
				Static227.method4126(arg4, arg1, arg3, arg0);
			}
		} else if (local20 == 0) {
			Static93.method1731(arg3, arg0, arg1, arg2);
		} else {
			@Pc(49) int local49 = (local20 << 12) / local15;
			@Pc(58) int local58 = arg3 - (arg0 * local49 >> 12);
			@Pc(67) int local67;
			@Pc(75) int local75;
			if (Static106.anInt2157 > arg2) {
				local67 = Static106.anInt2157;
				local75 = (Static106.anInt2157 * local49 >> 12) + local58;
			} else if (Static251.anInt6512 >= arg2) {
				local67 = arg2;
				local75 = arg4;
			} else {
				local67 = Static251.anInt6512;
				local75 = (local49 * Static251.anInt6512 >> 12) + local58;
			}
			@Pc(108) int local108;
			@Pc(110) int local110;
			if (arg0 < Static106.anInt2157) {
				local110 = local58 + (Static106.anInt2157 * local49 >> 12);
				local108 = Static106.anInt2157;
			} else if (Static251.anInt6512 >= arg0) {
				local108 = arg0;
				local110 = arg3;
			} else {
				local110 = local58 + (Static251.anInt6512 * local49 >> 12);
				local108 = Static251.anInt6512;
			}
			if (local110 < Static49.anInt1124) {
				local108 = (Static49.anInt1124 - local58 << 12) / local49;
				local110 = Static49.anInt1124;
			} else if (local110 > Static291.anInt5657) {
				local110 = Static291.anInt5657;
				local108 = (Static291.anInt5657 - local58 << 12) / local49;
			}
			if (Static49.anInt1124 > local75) {
				local67 = (Static49.anInt1124 - local58 << 12) / local49;
				local75 = Static49.anInt1124;
			} else if (Static291.anInt5657 < local75) {
				local67 = (Static291.anInt5657 - local58 << 12) / local49;
				local75 = Static291.anInt5657;
			}
			Static69.method1389(local75, arg1, local108, local110, local67);
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(IB)I")
	public static int method5329(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;BC)I")
	public static int method5330(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			if (arg1 == arg0.charAt(local17)) {
				local7++;
			}
		}
		return local7;
	}
}

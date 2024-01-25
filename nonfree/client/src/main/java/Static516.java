import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "[Lclient!rba;")
	public static final Class4_Sub41[] aClass4_Sub41Array2 = new Class4_Sub41[300];

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZILjava/net/Socket;)Lclient!tn;")
	public static Class45 method2306(@OriginalArg(2) Socket arg0) throws IOException {
		return new Class45_Sub1(arg0, 7500);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)I")
	public static int method2307(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIII)I")
	public static int method2309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static355.anInt6196 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(14) int local14 = Integer.MAX_VALUE;
		@Pc(18) int local18 = arg0 - Static392.anInt8797;
		@Pc(23) int local23 = arg2 - Static392.anInt8804;
		for (@Pc(28) Class4_Sub48 local28 = (Class4_Sub48) Static392.aClass124_60.method3267(); local28 != null; local28 = (Class4_Sub48) Static392.aClass124_60.method3273()) {
			if (arg1 == local28.anInt8895) {
				@Pc(37) int local37 = local28.anInt8896;
				@Pc(40) int local40 = local28.anInt8900;
				@Pc(51) int local51 = Static392.anInt8797 + local37 << 14 | local40 + Static392.anInt8804;
				@Pc(69) int local69 = (local18 - local37) * (local18 - local37) + (local23 - local40) * (-local40 + local23);
				if (local12 < 0 || local14 > local69) {
					local12 = local51;
					local14 = local69;
				}
			}
		}
		return local12;
	}
}

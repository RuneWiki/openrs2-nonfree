import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
	public static int anInt8641;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIB)Z")
	public static boolean method7070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)Z")
	public static boolean method7071(@OriginalArg(1) int arg0) {
		if (Static285.aBooleanArray25[arg0]) {
			return true;
		} else if (Static118.aClass251_30.method5775(arg0)) {
			@Pc(23) int local23 = Static118.aClass251_30.method5768(arg0);
			if (local23 == 0) {
				Static285.aBooleanArray25[arg0] = true;
				return true;
			}
			if (Static14.aClass292ArrayArray1[arg0] == null) {
				Static14.aClass292ArrayArray1[arg0] = new Class292[local23];
			}
			for (@Pc(50) int local50 = 0; local50 < local23; local50++) {
				if (Static14.aClass292ArrayArray1[arg0][local50] == null) {
					@Pc(64) byte[] local64 = Static118.aClass251_30.method5772(local50, arg0);
					if (local64 != null) {
						@Pc(76) Class292 local76 = Static14.aClass292ArrayArray1[arg0][local50] = new Class292();
						local76.anInt7890 = (arg0 << 16) + local50;
						if (local64[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local76.method6473(new Class6_Sub21(local64));
					}
				}
			}
			Static285.aBooleanArray25[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(JJ)J")
	public static long method7072(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(BI)V")
	public static void method7073() {
		Static100.aClass136_22.method3474(50);
	}
}

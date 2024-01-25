import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!tha", name = "m", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray37;

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(IIII)I")
	public static int method7798(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0) {
			return arg0;
		}
		@Pc(22) int local22 = 128 - arg2;
		@Pc(36) int local36 = (arg0 & 0x7F) * local22 + (arg1 & 0x7F) * arg2 >> 7;
		@Pc(50) int local50 = arg2 * (arg1 & 0x380) + local22 * (arg0 & 0x380) >> 7;
		@Pc(64) int local64 = (arg1 & 0xFC00) * arg2 + (arg0 & 0xFC00) * local22 >> 7;
		return local50 & 0x380 | local64 & 0xFC00 | local36 & 0x7F;
	}

	@OriginalMember(owner = "client!tha", name = "d", descriptor = "(I)V")
	public static void method7799() {
		@Pc(1) Class265 local1 = Static168.aClass265_9;
		synchronized (Static168.aClass265_9) {
			Static168.aClass265_9.method6573();
		}
		local1 = Static360.aClass265_36;
		synchronized (Static360.aClass265_36) {
			Static360.aClass265_36.method6573();
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "()V")
	public static void method7800() {
		Static508.aClass89_1 = Static508.aClass89_2;
	}
}

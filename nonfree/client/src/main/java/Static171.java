import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ln", name = "y", descriptor = "Lclient!qa;")
	public static final Class117 aClass117_1 = Static200.method3657();

	@OriginalMember(owner = "client!ln", name = "K", descriptor = "I")
	public static int anInt3612 = 0;

	@OriginalMember(owner = "client!ln", name = "R", descriptor = "I")
	public static int anInt3616 = 0;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIII)I")
	public static int method3052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "(I)V")
	public static void method3054() {
		@Pc(1) Class37 local1 = Static352.aClass37_111;
		synchronized (Static352.aClass37_111) {
			Static352.aClass37_111.method919();
		}
		local1 = Static337.aClass37_107;
		synchronized (Static337.aClass37_107) {
			Static337.aClass37_107.method919();
		}
	}
}

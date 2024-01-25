import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!jh", name = "E", descriptor = "Lclient!bu;")
	public static Class32 aClass32_46;

	@OriginalMember(owner = "client!jh", name = "M", descriptor = "[I")
	public static int[] anIntArray238 = new int[1];

	@OriginalMember(owner = "client!jh", name = "gb", descriptor = "Z")
	public static boolean aBoolean323 = false;

	@OriginalMember(owner = "client!jh", name = "jb", descriptor = "Lclient!an;")
	public static final Class11 aClass11_24 = new Class11(32);

	@OriginalMember(owner = "client!jh", name = "ub", descriptor = "[Lclient!ec;")
	public static final Class60[] aClass60Array1 = new Class60[128];

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
	public static void method3007() {
		@Pc(1) Class126 local1 = Static101.aClass126_58;
		synchronized (Static101.aClass126_58) {
			Static101.aClass126_58.method3131();
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIB)V")
	public static void method3009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		Static252.aFloat47 = local11;
		Static180.aFloat27 = local15;
		if (Static161.anInt3316 == 2) {
			Static445.anInt7524 = 0;
			Static298.anInt5734 = local15;
			Static445.anInt7532 = local11;
		}
		Static264.method3840();
		Static224.aBoolean359 = true;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
	public static void method3010() {
		Static312.anInt5522 = -1;
		Static78.anInt1944 = -1;
		Static311.anInt5499 = 0;
	}
}

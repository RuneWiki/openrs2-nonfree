import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "[Lclient!lf;")
	public static Class114[] aClass114Array2;

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "[I")
	public static final int[] anIntArray296 = new int[128];

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!sd;B)I")
	public static int method3092(@OriginalArg(0) Class10_Sub3_Sub3_Sub1 arg0) {
		@Pc(8) Class192 local8 = arg0.aClass192_1;
		if (local8.anIntArray525 != null) {
			local8 = local8.method5281();
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(27) int local27 = local8.lb;
		@Pc(31) Class128 local31 = arg0.method5364();
		if (arg0.aBoolean414) {
			local27 = local8.anInt5787;
		} else if (arg0.anInt5939 == local31.anInt3760 || local31.anInt3725 == arg0.anInt5939 || local31.anInt3733 == arg0.anInt5939 || local31.anInt3743 == arg0.anInt5939) {
			local27 = local8.anInt5797;
		} else if (arg0.anInt5939 == local31.anInt3754 || arg0.anInt5939 == local31.anInt3718 || arg0.anInt5939 == local31.anInt3749 || arg0.anInt5939 == local31.anInt3741) {
			local27 = local8.anInt5809;
		}
		return local27;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V")
	public static void method3093() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("availableProcessors");
			if (local12 != null) {
				try {
					@Pc(16) Runtime local16 = Runtime.getRuntime();
					@Pc(22) Integer local22 = (Integer) local12.invoke(local16, (Object[]) null);
					Static203.anInt6252 = local22;
				} catch (@Pc(27) Throwable local27) {
				}
			}
		} catch (@Pc(38) Exception local38) {
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V")
	public static void method3094() {
		@Pc(5) Class11 local5 = Static281.aClass11_124;
		synchronized (Static281.aClass11_124) {
			Static281.aClass11_124.method214();
		}
	}
}

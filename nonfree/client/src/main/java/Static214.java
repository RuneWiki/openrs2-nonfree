import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "[I")
	public static int[] anIntArray213;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
	public static int anInt3758;

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "Lclient!rg;")
	public static Class310 aClass310_47;

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "Lclient!rl;")
	public static final Class317 aClass317_20 = new Class317(4);

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_100 = new Class251(26, 3);

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
	public static void method3269() {
		if (!Static546.aBoolean727) {
			return;
		}
		@Pc(12) Class299 local12 = Static384.method5875(Static613.anInt10111, Static254.anInt4789);
		if (local12 != null && local12.anObjectArray20 != null) {
			@Pc(23) Class14_Sub10 local23 = new Class14_Sub10();
			local23.anObjectArray1 = local12.anObjectArray20;
			local23.aClass299_2 = local12;
			Static672.method9304(local23);
		}
		Static578.anInt9567 = -1;
		Static573.anInt9481 = -1;
		Static546.aBoolean727 = false;
		if (local12 != null) {
			Static538.method7933(local12);
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)Lclient!eba;")
	public static Class14_Sub1_Sub3 method3270() {
		return Static472.aClass14_Sub1_Sub3_3;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([Ljava/lang/String;[II)V")
	public static void method3272(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1) {
		Static654.method9148(arg0, arg0.length - 1, 0, arg1);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Lclient!sca;")
	public static Class62 method3273() {
		try {
			return (Class62) Class.forName("cj").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}
}

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
	public static int anInt6010;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "Lclient!mg;")
	public static final Class204 aClass204_17 = new Class204(4);

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "Lclient!mg;")
	public static final Class204 aClass204_13 = new Class204(1);

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "Lclient!mg;")
	public static final Class204 aClass204_10 = new Class204(1);

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "Lclient!mg;")
	public static final Class204 aClass204_11 = new Class204(2);

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!mg;")
	public static final Class204 aClass204_12 = new Class204(4);

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "Lclient!mg;")
	public static final Class204 aClass204_14 = new Class204(2);

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "Lclient!mg;")
	public static final Class204 aClass204_15 = new Class204(4);

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "Lclient!mg;")
	public static final Class204 aClass204_16 = new Class204(2);

	@OriginalMember(owner = "client!mg", name = "o", descriptor = "Z")
	public static boolean aBoolean426 = false;

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
	public static int anInt6011 = 0;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!vca;)Z")
	public static boolean method4879(@OriginalArg(1) Class338 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean644) {
			return false;
		} else if (!arg0.method7661(Static157.anInterface7_2)) {
			return false;
		} else if (Static151.aClass297_12.method6531((long) arg0.anInt9722) == null) {
			return Static404.aClass297_30.method6531((long) arg0.anInt9749) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLclient!ol;)V")
	public static void method4881(@OriginalArg(1) Class25_Sub2_Sub2_Sub5 arg0) {
		if (arg0 instanceof Class25_Sub2_Sub2_Sub5_Sub2) {
			@Pc(31) Class25_Sub2_Sub2_Sub5_Sub2 local31 = (Class25_Sub2_Sub2_Sub5_Sub2) arg0;
			if (local31.aClass213_1 != null) {
				Static145.method2772(local31, Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117 != local31.aByte117);
			}
		} else if (arg0 instanceof Class25_Sub2_Sub2_Sub5_Sub1) {
			@Pc(15) Class25_Sub2_Sub2_Sub5_Sub1 local15 = (Class25_Sub2_Sub2_Sub5_Sub1) arg0;
			Static483.method6565(local15.aByte117 != Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117, local15);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/awt/Canvas;BLclient!fa;I)Lclient!r;")
	public static Class31 method4882(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Interface4 arg1, @OriginalArg(3) int arg2) {
		return new Class31_Sub2(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)Lclient!jn;")
	public static Class35 method4883() {
		try {
			return (Class35) Class.forName("Class35_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}

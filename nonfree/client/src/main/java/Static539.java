import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!ur", name = "z", descriptor = "I")
	public static int anInt9040;

	@OriginalMember(owner = "client!ur", name = "F", descriptor = "I")
	public static int anInt9044;

	@OriginalMember(owner = "client!ur", name = "H", descriptor = "I")
	public static int anInt9045;

	@OriginalMember(owner = "client!ur", name = "C", descriptor = "Lclient!em;")
	public static final Class83 aClass83_194 = new Class83(12, -2);

	@OriginalMember(owner = "client!ur", name = "G", descriptor = "Z")
	public static boolean aBoolean676 = true;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!laa;IBLjava/awt/Component;)Lclient!jca;")
	public static Class76 method7337(@OriginalArg(0) int arg0, @OriginalArg(1) Class198 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Component arg3) {
		if (Static304.anInt5650 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class76 local36 = (Class76) Class.forName("Class76_Sub2").getDeclaredConstructor().newInstance();
			local36.anInt2886 = arg0;
			local36.anIntArray129 = new int[(Static269.aBoolean372 ? 2 : 1) * 256];
			local36.method2515(arg3);
			local36.anInt2880 = (arg0 & 0xFFFFFC00) + 1024;
			if (local36.anInt2880 > 16384) {
				local36.anInt2880 = 16384;
			}
			local36.method2520(local36.anInt2880);
			if (Static564.anInt9355 > 0 && Static153.aClass107_1 == null) {
				Static153.aClass107_1 = new Class107();
				Static153.aClass107_1.aClass198_1 = arg1;
				arg1.method4285(Static564.anInt9355, Static153.aClass107_1);
			}
			if (Static153.aClass107_1 != null) {
				if (Static153.aClass107_1.aClass76Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static153.aClass107_1.aClass76Array1[arg2] = local36;
			}
			return local36;
		} catch (@Pc(116) Throwable local116) {
			try {
				@Pc(122) Class76_Sub1 local122 = new Class76_Sub1(arg1, arg2);
				local122.anInt2886 = arg0;
				local122.anIntArray129 = new int[(Static269.aBoolean372 ? 2 : 1) * 256];
				local122.method2515(arg3);
				local122.anInt2880 = 16384;
				local122.method2520(local122.anInt2880);
				if (Static564.anInt9355 > 0 && Static153.aClass107_1 == null) {
					Static153.aClass107_1 = new Class107();
					Static153.aClass107_1.aClass198_1 = arg1;
					arg1.method4285(Static564.anInt9355, Static153.aClass107_1);
				}
				if (Static153.aClass107_1 != null) {
					if (Static153.aClass107_1.aClass76Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static153.aClass107_1.aClass76Array1[arg2] = local122;
				}
				return local122;
			} catch (@Pc(181) Throwable local181) {
				return new Class76();
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(IB)V")
	public static void method7338() {
		@Pc(1) Class207 local1 = Static236.aClass207_55;
		synchronized (Static236.aClass207_55) {
			Static236.aClass207_55.method4397(5);
		}
		local1 = Static275.aClass207_25;
		synchronized (Static275.aClass207_25) {
			Static275.aClass207_25.method4397(5);
		}
	}
}

import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!ls", name = "n", descriptor = "[I")
	public static int[] anIntArray286;

	@OriginalMember(owner = "client!ls", name = "E", descriptor = "[Lclient!sg;")
	public static Class97[] aClass97Array15;

	@OriginalMember(owner = "client!ls", name = "q", descriptor = "Lclient!ec;")
	public static final Class58 aClass58_17 = new Class58(16);

	@OriginalMember(owner = "client!ls", name = "z", descriptor = "I")
	public static int anInt3761 = 0;

	@OriginalMember(owner = "client!ls", name = "D", descriptor = "I")
	public static int anInt3765 = 0;

	@OriginalMember(owner = "client!ls", name = "F", descriptor = "J")
	public static long aLong110 = 0L;

	@OriginalMember(owner = "client!ls", name = "G", descriptor = "Z")
	public static boolean aBoolean239 = false;

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(II)V")
	public static void method3218() {
		Static218.aClass26_27.method329(5);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IILjava/awt/Component;Lclient!ko;I)Lclient!ir;")
	public static Class78 method3220(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) Class118 arg2, @OriginalArg(4) int arg3) {
		if (Static352.anInt6698 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(38) Class78 local38 = (Class78) Class.forName("Class78_Sub2").getDeclaredConstructor().newInstance();
			local38.anInt6475 = arg0;
			local38.anIntArray535 = new int[(Static178.aBoolean224 ? 2 : 1) * 256];
			local38.method5508(arg1);
			local38.anInt6470 = (arg0 & 0xFFFFFC00) + 1024;
			if (local38.anInt6470 > 16384) {
				local38.anInt6470 = 16384;
			}
			local38.method5517(local38.anInt6470);
			if (Static345.anInt6605 > 0 && Static20.aClass107_1 == null) {
				Static20.aClass107_1 = new Class107();
				Static20.aClass107_1.aClass118_4 = arg2;
				arg2.method2712(Static345.anInt6605, Static20.aClass107_1);
			}
			if (Static20.aClass107_1 != null) {
				if (Static20.aClass107_1.aClass78Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static20.aClass107_1.aClass78Array1[arg3] = local38;
			}
			return local38;
		} catch (@Pc(111) Throwable local111) {
			try {
				@Pc(122) Class78_Sub1 local122 = new Class78_Sub1(arg2, arg3);
				local122.anInt6475 = arg0;
				local122.anIntArray535 = new int[(Static178.aBoolean224 ? 2 : 1) * 256];
				local122.method5508(arg1);
				local122.anInt6470 = 16384;
				local122.method5517(local122.anInt6470);
				if (Static345.anInt6605 > 0 && Static20.aClass107_1 == null) {
					Static20.aClass107_1 = new Class107();
					Static20.aClass107_1.aClass118_4 = arg2;
					arg2.method2712(Static345.anInt6605, Static20.aClass107_1);
				}
				if (Static20.aClass107_1 != null) {
					if (Static20.aClass107_1.aClass78Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static20.aClass107_1.aClass78Array1[arg3] = local122;
				}
				return local122;
			} catch (@Pc(184) Throwable local184) {
				return new Class78();
			}
		}
	}
}

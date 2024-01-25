import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "[J")
	public static long[] aLongArray6;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method2791() {
		if (Static507.aClass325Array1 == null) {
			Static507.aClass325Array1 = Static529.method7778();
			Static537.aClass325_25 = Static507.aClass325Array1[0];
			Static361.aLong183 = Static376.method6088();
		}
		if (Static313.aClass163_1 == null) {
			Static149.method2485();
		}
		@Pc(30) Class325 local30 = Static537.aClass325_25;
		@Pc(33) int local33 = Static487.method7424();
		if (local30 == Static537.aClass325_25) {
			Static361.aString82 = Static537.aClass325_25.aClass101_62.method2841(Static126.anInt2904);
			if (Static537.aClass325_25.aBoolean801) {
				Static84.anInt1929 = Static537.aClass325_25.anInt9605 + local33 * (Static537.aClass325_25.anInt9607 - Static537.aClass325_25.anInt9605) / 100;
			}
			if (Static537.aClass325_25.aBoolean800) {
				Static361.aString82 = Static361.aString82 + Static84.anInt1929 + "%";
			}
		} else if (Static529.aClass325_23 == Static537.aClass325_25) {
			Static313.aClass163_1 = null;
			Static168.method3104(3);
		} else {
			Static361.aString82 = local30.aClass101_63.method2841(Static126.anInt2904);
			if (Static537.aClass325_25.aBoolean800) {
				Static361.aString82 = Static361.aString82 + local30.anInt9607 + "%";
			}
			Static84.anInt1929 = local30.anInt9607;
			if (Static537.aClass325_25.aBoolean801 || local30.aBoolean801) {
				Static361.aLong183 = Static376.method6088();
			}
		}
		if (Static313.aClass163_1 == null) {
			return;
		}
		Static313.aClass163_1.method3937(Static361.aLong183, Static361.aString82, Static84.anInt1929, Static537.aClass325_25);
		if (Static197.anInterface24Array1 == null) {
			return;
		}
		for (@Pc(135) int local135 = Static507.anInt9381 + 1; local135 < Static197.anInterface24Array1.length; local135++) {
			if (Static197.anInterface24Array1[local135].method6800() >= 100 && Static507.anInt9381 == local135 - 1 && Static75.anInt1880 >= 1 && Static313.aClass163_1.method3929()) {
				try {
					Static197.anInterface24Array1[local135].method6802();
				} catch (@Pc(171) Exception local171) {
					Static197.anInterface24Array1 = null;
					return;
				}
				Static313.aClass163_1.method3930(Static197.anInterface24Array1[local135]);
				Static507.anInt9381++;
				if (Static197.anInterface24Array1.length - 1 <= Static507.anInt9381 && Static197.anInterface24Array1.length > 1) {
					Static507.anInt9381 = Static23.aClass339_7.method8093() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BZLjava/lang/Object;)[B")
	public static byte[] method2792(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static332.method5751(local13) : local13;
		} else if (arg1 instanceof Class158) {
			@Pc(27) Class158 local27 = (Class158) arg1;
			return local27.method5025();
		} else {
			throw new IllegalArgumentException();
		}
	}
}

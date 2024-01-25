import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
	public static int anInt6344;

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
	public static int anInt6352;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "[B")
	public static final byte[] aByteArray199 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "[Lclient!ko;")
	public static final Class121_Sub1[] aClass121_Sub1Array2 = new Class121_Sub1[29];

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(Z)V")
	public static void method5659() {
		Static13.aClass11_56.method214();
		Static120.aClass11_60.method214();
		Static16.aClass11_9.method214();
		Static15.aClass11_132.method214();
		Static83.aClass11_141.method214();
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)Lclient!pn;")
	public static Class103 method5660() {
		try {
			return (Class103) Class.forName("Class103_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIII)V")
	public static void method5662(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static164.aClass14_Sub4_Sub2_3.method2557(158);
		Static164.aClass14_Sub4_Sub2_3.method2541(arg3);
		Static164.aClass14_Sub4_Sub2_3.method2509(arg2);
		Static164.aClass14_Sub4_Sub2_3.method2541(arg1);
		Static164.aClass14_Sub4_Sub2_3.method2524(arg0);
	}
}

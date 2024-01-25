import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "[I")
	public static int[] anIntArray110 = new int[1];

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIILclient!wv;II)V")
	public static void method1227(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class4_Sub1_Sub1 arg2, @OriginalArg(5) int arg3) {
		Static297.method991(arg2.anInt9542, 0, arg2.anInt9540, arg1, arg0, arg2.aByte108, arg3);
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)Lclient!mc;")
	public static Class6_Sub31 method1229() {
		return Static30.anInt866 == 0 ? new Class6_Sub31() : Static444.aClass6_Sub31Array1[--Static30.anInt866];
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lclient!un;")
	public static Class43 method1230() {
		try {
			return new Class43_Sub3();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class43) Class.forName("Class43_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(18) Throwable local18) {
				return new Class43_Sub2();
			}
		}
	}
}

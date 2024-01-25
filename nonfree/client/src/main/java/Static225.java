import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!lk", name = "u", descriptor = "[I")
	public static int[] anIntArray291;

	@OriginalMember(owner = "client!lk", name = "z", descriptor = "Lclient!st;")
	public static Class222 aClass222_2;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "[I")
	public static final int[] anIntArray290 = new int[500];

	@OriginalMember(owner = "client!lk", name = "w", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_46 = new Class215(28, 8);

	@OriginalMember(owner = "client!lk", name = "x", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_192 = new Class22(44, 6);

	@OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
	public static int anInt4371 = 0;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
	public static void method3438() {
		Static274.method3926();
		Static159.method2701();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBIII)V")
	public static void method3440(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static354.anInt6186 && arg0 <= Static208.anInt2656) {
			@Pc(24) int local24 = Static332.method4519(Static168.anInt3256, arg1, Static376.anInt6287);
			@Pc(30) int local30 = Static332.method4519(Static168.anInt3256, arg2, Static376.anInt6287);
			Static287.method3980(local30, local24, arg0, arg3);
		}
	}
}

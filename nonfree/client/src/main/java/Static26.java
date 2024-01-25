import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bj", name = "J", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_21 = new Class217(85, -2);

	@OriginalMember(owner = "client!bj", name = "S", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_24 = new Class18(9, -1);

	@OriginalMember(owner = "client!bj", name = "V", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[5];

	@OriginalMember(owner = "client!bj", name = "W", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_25 = new Class18(1, 8);

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(ZI)V")
	public static void method639() {
		@Pc(7) Class21 local7 = Static29.aClass21_29;
		synchronized (Static29.aClass21_29) {
			Static29.aClass21_29.method844(5);
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIB)V")
	public static void method640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = Static219.anInt4418 * arg1 >> 8;
		if (local5 != 0 && arg0 != -1) {
			Static134.method2732(local5, Static47.aClass30_11, arg0);
			Static298.aBoolean482 = true;
		}
	}
}

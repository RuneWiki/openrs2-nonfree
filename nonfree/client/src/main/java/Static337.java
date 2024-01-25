import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!vq", name = "w", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_107 = new Class37(30);

	@OriginalMember(owner = "client!vq", name = "x", descriptor = "Z")
	public static volatile boolean aBoolean537 = false;

	@OriginalMember(owner = "client!vq", name = "C", descriptor = "Lclient!ar;")
	public static final Class14 aClass14_36 = new Class14();

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIII)V")
	public static void method5605(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(8) Class7_Sub1 local8 = (Class7_Sub1) Static172.aClass122_6.method2626(); local8 != null; local8 = (Class7_Sub1) Static172.aClass122_6.method2630()) {
			if (local8.anInt217 <= Static282.anInt3516) {
				local8.method3450();
			} else {
				Static28.method489((local8.anInt216 << 7) + 64, arg1 >> 1, arg0 >> 1, local8.anInt210 * 2, (local8.anInt214 << 7) + 64);
				Static286.aClass29_3.method3746(Static49.anIntArray493[0] + arg3, local8.aString9, Static49.anIntArray493[1] + arg2, 0, local8.anInt215 | 0xFF000000);
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "(I)V")
	public static void method5607() {
		Static211.aClass37_69.method919();
	}
}

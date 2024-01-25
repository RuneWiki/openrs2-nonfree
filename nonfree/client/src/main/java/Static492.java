import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!up", name = "f", descriptor = "Lclient!ow;")
	public static Class218 aClass218_1;

	@OriginalMember(owner = "client!up", name = "i", descriptor = "I")
	public static int anInt8659;

	@OriginalMember(owner = "client!up", name = "l", descriptor = "[B")
	public static final byte[] aByteArray112 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIBI)V")
	public static void method7263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 * Static281.aClass2_Sub19_Sub1_1.anInt2190 >> 8;
		if (arg1 == -1 && !Static539.aBoolean675) {
			Static20.method550();
		} else if (arg1 != -1 && (Static294.anInt5419 != arg1 || !Static192.method3149()) && local15 != 0 && !Static539.aBoolean675) {
			Static431.method6616(arg1, local15, Static463.aClass53_134, arg0);
		}
		Static294.anInt5419 = arg1;
	}
}

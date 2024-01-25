import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static464 {

	@OriginalMember(owner = "client!ws", name = "R", descriptor = "I")
	public static int anInt7954;

	@OriginalMember(owner = "client!ws", name = "L", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_101 = new Class212(24, 8);

	@OriginalMember(owner = "client!ws", name = "P", descriptor = "I")
	public static int anInt7952 = 0;

	@OriginalMember(owner = "client!ws", name = "S", descriptor = "[J")
	public static final long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "(II)I")
	public static int method6290(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIB)I")
	public static int method6291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static165.anIntArray266[arg1 & 0x3] : Static147.anIntArray252[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "(I)V")
	public static void method6293() {
		Static182.aClass30_12.MA(((float) Static157.aClass185_Sub1_1.anInt5565 * 0.1F + 0.7F) * 1.1523438F);
		Static182.aClass30_12.la(Static219.anInt4437, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static182.aClass30_12.ha(Static182.anInt3700, -1, 256);
		Static182.aClass30_12.method2067(Static459.aClass41_6);
	}
}

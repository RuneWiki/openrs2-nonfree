import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static14 {

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
	public static int anInt4962;

	@OriginalMember(owner = "client!ap", name = "C", descriptor = "I")
	public static int anInt4971;

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "[I")
	public static final int[] anIntArray385 = new int[1000];

	@OriginalMember(owner = "client!ap", name = "x", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_133 = new Class21(64);

	@OriginalMember(owner = "client!ap", name = "D", descriptor = "[Lclient!es;")
	public static final Class51_Sub1[] aClass51_Sub1Array2 = new Class51_Sub1[29];

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZB)V")
	public static void method4534(@OriginalArg(0) boolean arg0) {
		Static73.method1613(Static130.anInt2825, arg0, Static336.anInt6389, Static213.anInt4274);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)I")
	public static int method4535(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static306.anIntArray457[arg1 & 0x3] : Static133.anIntArray214[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(B)V")
	public static void method4536() {
		Static258.aClass21_42.method851();
		Static239.aClass21_128.method851();
	}
}

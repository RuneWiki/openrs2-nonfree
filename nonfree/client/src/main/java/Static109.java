import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "F")
	public static float aFloat34;

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "Lclient!bs;")
	public static Class33 aClass33_1;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_32 = new Class237(104, -1);

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "[I")
	public static final int[] anIntArray176 = new int[13];

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)V")
	public static void method1676(@OriginalArg(1) int arg0) {
		Static151.anInt2577 = arg0;
		Static21.anInt465 = -1;
		Static21.anInt465 = -1;
		Static144.method2162();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
	public static void method1679() {
		@Pc(16) int local16 = Static389.aClass128_Sub1_1.method2986(Static285.anInt7839);
		if (local16 == 0) {
			Static443.aByteArrayArrayArray17 = null;
			Static141.method1970(0);
		} else if (local16 == 1) {
			Static313.method4474((byte) 0);
			Static141.method1970(512);
			if (Static184.aByteArrayArrayArray3 != null) {
				Static407.method5500();
			}
		} else {
			Static313.method4474((byte) (Static243.anInt4342 - 4 & 0xFF));
			Static141.method1970(2);
		}
		Static150.anInt2560 = Static152.anInt2600;
	}
}

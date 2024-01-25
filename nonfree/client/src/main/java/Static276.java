import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!of", name = "r", descriptor = "I")
	public static int anInt5074;

	@OriginalMember(owner = "client!of", name = "q", descriptor = "Z")
	public static boolean aBoolean429 = false;

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
	public static void method4099() {
		@Pc(10) int local10 = Static399.aClass167_Sub1_1.method4522(Static281.anInt5126);
		if (local10 == 0) {
			Static440.aByteArrayArrayArray17 = null;
			Static237.method3734(0);
		} else if (local10 == 1) {
			Static140.method6009((byte) 0);
			Static237.method3734(512);
			if (Static367.aByteArrayArrayArray16 != null) {
				Static322.method4617();
			}
		} else {
			Static140.method6009((byte) (Static41.anInt1082 - 4 & 0xFF));
			Static237.method3734(2);
		}
		Static99.anInt1740 = Static301.anInt5383;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)I")
	public static int method4100(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(28) int local28 = (local13 & 0x33333333) + (local13 >>> 2 & 0xF3333333);
		@Pc(36) int local36 = local28 + (local28 >>> 4) & 0xF0F0F0F;
		@Pc(42) int local42 = local36 + (local36 >>> 8);
		@Pc(48) int local48 = local42 + (local42 >>> 16);
		return local48 & 0xFF;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
	public static void method4101() {
		Static265.aBoolean623 = true;
	}
}

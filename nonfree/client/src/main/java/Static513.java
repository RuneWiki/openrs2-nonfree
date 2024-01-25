import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static513 {

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
	public static int anInt8429;

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "[I")
	public static final int[] anIntArray428 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
	public static int anInt8431 = 0;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
	public static void method7348(@OriginalArg(0) int arg0) {
		Static164.anInt2535 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)I")
	public static int method7350() {
		return Static18.anInt243 == 1 ? Static347.anInt5886 : Static649.anInt10660;
	}
}

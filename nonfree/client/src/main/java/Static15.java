import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static15 {

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "[I")
	public static final int[] anIntArray46 = new int[50];

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
	public static int anInt317 = 0;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)V")
	public static void method315(@OriginalArg(0) int arg0) {
		Static35.anInt732 = arg0;
		Static157.anInt3513 = -1;
		Static157.anInt3513 = -1;
		Static18.method358();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIII)V")
	public static void method316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static348.aByteArrayArrayArray11 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(II)I")
	public static int method317(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}

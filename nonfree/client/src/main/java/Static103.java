import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static103 {

	@OriginalMember(owner = "client!kh", name = "D", descriptor = "[S")
	public static short[] aShortArray72;

	@OriginalMember(owner = "client!kh", name = "U", descriptor = "Lclient!qe;")
	public static Class82 aClass82_1;

	@OriginalMember(owner = "client!kh", name = "W", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!kh", name = "P", descriptor = "Lclient!i;")
	private static Class41 aClass41_746 = Static184.method2923("Sorry invited players only)3");

	@OriginalMember(owner = "client!kh", name = "G", descriptor = "Lclient!i;")
	public static Class41 aClass41_743 = aClass41_746;

	@OriginalMember(owner = "client!kh", name = "H", descriptor = "Lclient!i;")
	private static Class41 aClass41_744 = Static184.method2923(" has logged out)3");

	@OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
	public static int anInt2511 = 0;

	@OriginalMember(owner = "client!kh", name = "J", descriptor = "Lclient!i;")
	public static Class41 aClass41_745 = Static184.method2923("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
	public static int anInt2513 = 0;

	@OriginalMember(owner = "client!kh", name = "S", descriptor = "Lclient!i;")
	public static Class41 aClass41_747 = aClass41_744;

	@OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
	public static int anInt2517 = 0;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)I")
	public static int method1767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(II)V")
	public static void method1771() {
		Static215.anInt4739 = -1;
		Static10.anInt373 = 0;
		Static154.anInt3617 = 2;
		Static143.aClass15_31 = null;
		Static16.aBoolean20 = false;
		Static108.anInt2618 = 1;
		Static202.anInt1732 = -1;
	}
}

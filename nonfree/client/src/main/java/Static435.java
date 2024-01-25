import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static435 {

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
	public static int anInt7685;

	@OriginalMember(owner = "client!qg", name = "H", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
	public static final int anInt7693 = 1401;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZIII)V")
	public static void method6003(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static160.method2927(arg2)) {
			Static501.method6727(arg0, arg3, -1, arg1, Static449.aClass251ArrayArray1[arg2]);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)V")
	public static void method6007(@OriginalArg(0) int arg0) {
		Static439.anIntArray462 = new int[arg0];
		Static375.anIntArray365 = new int[arg0];
		Static56.anIntArray43 = new int[arg0];
		Static279.anIntArray244 = new int[arg0];
		Static559.anIntArray562 = new int[arg0];
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILjava/lang/String;)I")
	public static int method6012(@OriginalArg(2) String arg0) {
		return Static536.method7339(16, arg0);
	}
}

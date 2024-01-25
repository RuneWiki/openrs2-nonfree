import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!br", name = "n", descriptor = "[I")
	public static int[] anIntArray511 = new int[2];

	@OriginalMember(owner = "client!br", name = "v", descriptor = "I")
	public static final int anInt9437 = 2;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILclient!uq;ZIII)V")
	public static void method7696(@OriginalArg(1) Class362 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static184.method2887(arg0, arg2, arg1, 0L);
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "()V")
	public static void method7703() {
		for (@Pc(1) int local1 = 0; local1 < Static433.aClass298Array6.length; local1++) {
			Static433.aClass298Array6[local1].method6532();
		}
		Static433.aClass298Array6 = null;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(III)Z")
	public static boolean method7704(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static382.method5376(arg0, arg1) | (arg0 & 0x2000) != 0 | Static452.method6107(arg0, arg1)) & Static96.method1615(arg1, arg0);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIB)Z")
	public static boolean method7706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x60000) != 0 | Static213.method3147(arg1, arg0) || Static97.method1619(arg1, arg0);
	}
}

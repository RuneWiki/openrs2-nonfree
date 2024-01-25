import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
	public static int anInt60;

	@OriginalMember(owner = "client!gq", name = "m", descriptor = "[[B")
	public static final byte[][] aByteArrayArray2 = new byte[250][];

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "I")
	public static int anInt63 = 0;

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)V")
	public static void method48() {
		@Pc(1) Class103 local1 = Static329.aClass103_65;
		synchronized (Static329.aClass103_65) {
			Static329.aClass103_65.method2679(5);
		}
		local1 = Static103.aClass103_22;
		synchronized (Static103.aClass103_22) {
			Static103.aClass103_22.method2679(5);
		}
		local1 = Static269.aClass103_56;
		synchronized (Static269.aClass103_56) {
			Static269.aClass103_56.method2679(5);
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIIII)V")
	public static void method49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static61.anInt1534 <= arg0 && arg4 <= Static168.anInt3509 && Static142.anInt3103 <= arg3 && Static314.anInt6030 >= arg1) {
			Static350.method5622(arg0, arg3, arg1, arg4, arg2);
		} else {
			Static140.method2824(arg4, arg2, arg3, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(II)V")
	public static void method50() {
		@Pc(5) Class103 local5 = Static248.aClass103_47;
		synchronized (Static248.aClass103_47) {
			Static248.aClass103_47.method2679(5);
		}
	}
}

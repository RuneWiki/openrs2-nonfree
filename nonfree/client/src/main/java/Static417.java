import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
	public static int anInt7038;

	@OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
	public static int anInt7039;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "[B")
	public static byte[] aByteArray79 = null;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZB)V")
	public static void method6129(@OriginalArg(0) boolean arg0) {
		Static300.method4692(Static256.anInt4629, Static381.anInt6411, Static85.anInt9921, arg0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)I")
	public static int method6132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(23) byte local23;
		if (arg0 > 20000) {
			Static188.method9006();
			local23 = 4;
		} else if (arg0 > 10000) {
			Static84.method1341();
			local23 = 3;
		} else if (arg0 <= 5000) {
			local23 = 1;
			Static388.method5742();
		} else {
			local23 = 2;
			Static277.method4480();
		}
		if (Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() != arg1) {
			Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub24_1, arg1);
			Static462.method6506(false, arg1);
		}
		Static111.method1655();
		return local23;
	}
}

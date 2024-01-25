import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!lea", name = "Gd", descriptor = "I")
	public static int anInt6367;

	@OriginalMember(owner = "client!lea", name = "Ed", descriptor = "Z")
	public static boolean aBoolean541 = false;

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(BLclient!tn;I)V")
	public static void method5326(@OriginalArg(1) Class3_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (Static209.aClass76_2 == null) {
			return;
		}
		try {
			Static209.aClass76_2.method2777(0L);
			Static209.aClass76_2.method2770(arg1, arg0.aByteArray106, 24);
		} catch (@Pc(14) Exception local14) {
		}
	}
}

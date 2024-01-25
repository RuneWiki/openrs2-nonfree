import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static446 {

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)V")
	public static void method5835(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static187.anInt8961 = arg1 - Static476.anInt7584;
		Static317.anInt5332 = arg0 - Static476.anInt7583;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIB)Z")
	public static boolean method5836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static484.method6236(arg0, arg1) || Static444.method5804(arg0, arg1);
	}
}

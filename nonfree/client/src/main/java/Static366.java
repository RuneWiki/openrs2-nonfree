import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!nw", name = "U", descriptor = "J")
	public static long aLong200;

	@OriginalMember(owner = "client!nw", name = "kb", descriptor = "Z")
	public static boolean aBoolean479 = false;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIII)V")
	public static void method4945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static270.anInt4759 <= arg0 && Static162.anInt2935 >= arg0) {
			@Pc(23) int local23 = Static176.method2504(arg2, Static451.anInt7775, Static514.anInt8722);
			@Pc(29) int local29 = Static176.method2504(arg3, Static451.anInt7775, Static514.anInt8722);
			Static274.method268(arg1, local23, arg0, local29);
		}
	}
}

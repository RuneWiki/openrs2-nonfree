import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static79 {

	@OriginalMember(owner = "client!es", name = "l", descriptor = "I")
	public static int anInt5244;

	@OriginalMember(owner = "client!es", name = "o", descriptor = "[Lclient!ij;")
	public static Class77[] aClass77Array5;

	@OriginalMember(owner = "client!es", name = "v", descriptor = "I")
	public static int anInt5253;

	@OriginalMember(owner = "client!es", name = "C", descriptor = "I")
	public static int anInt5258;

	@OriginalMember(owner = "client!es", name = "D", descriptor = "I")
	public static int anInt5259;

	@OriginalMember(owner = "client!es", name = "q", descriptor = "I")
	public static int anInt5248 = 0;

	@OriginalMember(owner = "client!es", name = "x", descriptor = "Z")
	public static boolean aBoolean341 = true;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BI)I")
	public static int method4499(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!pl;Lclient!pl;I)V")
	public static void method4500(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1) {
		if (arg1.aClass11_252 != null) {
			arg1.method5701();
		}
		arg1.aClass11_252 = arg0.aClass11_252;
		arg1.aClass11_251 = arg0;
		arg1.aClass11_252.aClass11_251 = arg1;
		arg1.aClass11_251.aClass11_252 = arg1;
	}
}

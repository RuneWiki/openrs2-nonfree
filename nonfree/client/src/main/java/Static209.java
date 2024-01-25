import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "[[B")
	public static final byte[][] aByteArrayArray10 = new byte[250][];

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)Lclient!vr;")
	public static Class3_Sub41 method3227() {
		if (Static42.aClass138_5 == null || Static69.aClass130_1 == null) {
			return null;
		}
		for (@Pc(14) Class3_Sub41 local14 = (Class3_Sub41) Static69.aClass130_1.method2817(); local14 != null; local14 = (Class3_Sub41) Static69.aClass130_1.method2817()) {
			@Pc(25) Class196 local25 = Static42.aClass195_2.method4500(local14.anInt6279);
			if (local25 != null && local25.aBoolean396 && local25.method4505(Static42.anInterface9_2)) {
				return local14;
			}
		}
		return null;
	}
}

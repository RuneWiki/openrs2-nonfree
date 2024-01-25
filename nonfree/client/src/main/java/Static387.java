import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "F")
	public static float aFloat100;

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_187 = new Class158("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
	public static int anInt7074 = 0;

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)V")
	public static void method5397(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static248.method3707(arg0, 9);
		local8.method2954();
	}
}

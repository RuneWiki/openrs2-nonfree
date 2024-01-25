import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_88 = new Class186(68, 0);

	@OriginalMember(owner = "client!iaa", name = "e", descriptor = "I")
	public static int anInt4804 = 1;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!d;Lclient!lb;Ljava/awt/Canvas;II)Lclient!ha;")
	public static Class67 method4058(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Class221 arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) int arg3) {
		if (!Static642.method8689()) {
			throw new RuntimeException("");
		} else if (Static376.method5425("jaggl")) {
			@Pc(42) OpenGL local42 = new OpenGL();
			@Pc(52) long local52 = local42.init(arg2, 8, 8, 8, 24, 0, arg3);
			if (local52 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(74) Class67_Sub1_Sub2 local74 = new Class67_Sub1_Sub2(local42, arg2, local52, arg0, arg1, arg3);
			local74.method5669();
			return local74;
		} else {
			throw new RuntimeException("");
		}
	}
}

import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
	public static int anInt8008;

	@OriginalMember(owner = "client!pk", name = "A", descriptor = "Lclient!mea;")
	public static Class230 aClass230_8 = null;

	@OriginalMember(owner = "client!pk", name = "B", descriptor = "Z")
	public static boolean aBoolean556 = false;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!wia;Lclient!d;IBLjava/awt/Canvas;)Lclient!ha;")
	public static Class137 method6609(@OriginalArg(0) Class386 arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Canvas arg3) {
		if (!Static588.method8387()) {
			throw new RuntimeException("");
		} else if (Static160.method2605("jaggl")) {
			@Pc(24) OpenGL local24 = new OpenGL();
			@Pc(34) long local34 = local24.init(arg3, 8, 8, 8, 24, 0, arg2);
			if (local34 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(53) Class137_Sub1_Sub1 local53 = new Class137_Sub1_Sub1(local24, arg3, local34, arg1, arg0, arg2);
			local53.method8066();
			return local53;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)Ljava/lang/String;")
	public static String method6610() {
		return Static505.aBoolean629 || Static12.aClass14_Sub3_Sub11_1 == null ? "" : Static12.aClass14_Sub3_Sub11_1.aString56;
	}
}

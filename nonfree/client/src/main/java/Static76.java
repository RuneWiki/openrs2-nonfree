import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!cs", name = "D", descriptor = "I")
	public static int anInt1726 = -1;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "([BI)Z")
	public static boolean method1595(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub11 local8 = new Class3_Sub11(arg0);
		@Pc(12) int local12 = local8.method5175();
		if (local12 != 2) {
			return false;
		}
		@Pc(33) boolean local33 = local8.method5175() == 1;
		if (local33) {
			Static347.method5130(local8);
		}
		Static267.method4086(local8);
		return true;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!tf;Lclient!fa;ILjava/awt/Canvas;B)Lclient!r;")
	public static Class45 method1596(@OriginalArg(0) Class322 arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Canvas arg3) {
		if (!Static214.method3437()) {
			throw new RuntimeException("");
		} else if (Static10.method149("jaggl")) {
			@Pc(29) OpenGL local29 = new OpenGL();
			@Pc(39) long local39 = local29.init(arg3, 8, 8, 8, 24, 0, arg2);
			if (local39 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(60) Class45_Sub2_Sub2 local60 = new Class45_Sub2_Sub2(local29, arg3, local39, arg1, arg0, arg2);
			local60.method4963();
			return local60;
		} else {
			throw new RuntimeException("");
		}
	}
}

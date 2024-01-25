import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "Lclient!wu;")
	public static Class384 aClass384_87;

	@OriginalMember(owner = "client!mda", name = "l", descriptor = "I")
	public static int anInt5965;

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)Lclient!ju;")
	public static Class5_Sub4_Sub13 method5279() {
		@Pc(13) Class5_Sub4_Sub13 local13 = (Class5_Sub4_Sub13) Static407.aClass80_5.method1538();
		if (local13 != null) {
			local13.method8911();
			local13.method8741();
			return local13;
		}
		do {
			local13 = (Class5_Sub4_Sub13) Static548.aClass80_7.method1538();
			if (local13 == null) {
				return null;
			}
			if (local13.method4138() > Static205.method3179()) {
				return null;
			}
			local13.method8911();
			local13.method8741();
		} while ((local13.aLong273 & Long.MIN_VALUE) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(BLclient!wu;Lclient!d;Ljava/awt/Canvas;I)Lclient!ha;")
	public static Class126 method5280(@OriginalArg(1) Class384 arg0, @OriginalArg(2) Interface8 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3) {
		if (!Static301.method4382()) {
			throw new RuntimeException("");
		} else if (Static190.method673("jaggl")) {
			@Pc(24) OpenGL local24 = new OpenGL();
			@Pc(34) long local34 = local24.init(arg2, 8, 8, 8, 24, 0, arg3);
			if (local34 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(60) Class126_Sub2_Sub1 local60 = new Class126_Sub2_Sub1(local24, arg2, local34, arg1, arg0, arg3);
			local60.method5508();
			return local60;
		} else {
			throw new RuntimeException("");
		}
	}
}

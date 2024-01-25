import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "F")
	public static float aFloat166;

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "J")
	public static long aLong227;

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
	public static int anInt8098 = 7000;

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
	public static int anInt8094 = anInt8098;

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "Lclient!tq;")
	public static final Class340 aClass340_45 = new Class340(32);

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
	public static int anInt8099 = 0;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!d;Lclient!wm;I)Lclient!ha;")
	public static Class65 method6865(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) Class390 arg3) {
		if (!Static513.method7299()) {
			throw new RuntimeException("");
		} else if (Static278.method4508("jaggl")) {
			@Pc(34) OpenGL local34 = new OpenGL();
			@Pc(44) long local44 = local34.init(arg0, 8, 8, 8, 24, 0, arg1);
			if (local44 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(65) Class65_Sub2_Sub2 local65 = new Class65_Sub2_Sub2(local34, arg0, local44, arg2, arg3, arg1);
			local65.method4361();
			return local65;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILclient!ha;)Lclient!ne;")
	public static Class247 method6868(@OriginalArg(0) int arg0, @OriginalArg(2) Class65 arg1) {
		@Pc(14) Class88 local14 = Static419.method6246(arg1, arg0, true);
		return local14 == null ? null : local14.aClass247_2;
	}
}

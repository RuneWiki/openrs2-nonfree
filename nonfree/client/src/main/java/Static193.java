import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!gs", name = "w", descriptor = "I")
	public static int anInt10281;

	@OriginalMember(owner = "client!gs", name = "t", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_311 = new Class194(116, 5);

	@OriginalMember(owner = "client!gs", name = "u", descriptor = "Lclient!vu;")
	public static final Class363 aClass363_57 = new Class363();

	@OriginalMember(owner = "client!gs", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray82 = new String[100];

	@OriginalMember(owner = "client!gs", name = "A", descriptor = "[I")
	public static final int[] anIntArray679 = new int[14];

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!uu;Ljava/awt/Canvas;IBLclient!d;)Lclient!ha;")
	public static Class82 method8667(@OriginalArg(0) Class343 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Interface5 arg3) {
		if (!Static258.method4331()) {
			throw new RuntimeException("");
		} else if (Static422.method6653("jaggl")) {
			@Pc(26) OpenGL local26 = new OpenGL();
			@Pc(41) long local41 = local26.init(arg1, 8, 8, 8, 24, 0, arg2);
			if (local41 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(60) Class82_Sub3_Sub1 local60 = new Class82_Sub3_Sub1(local26, arg1, local41, arg3, arg0, arg2);
			local60.method5033();
			return local60;
		} else {
			throw new RuntimeException("");
		}
	}
}

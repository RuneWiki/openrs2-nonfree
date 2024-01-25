import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!fda", name = "p", descriptor = "I")
	public static int anInt2693;

	@OriginalMember(owner = "client!fda", name = "n", descriptor = "Z")
	public static boolean aBoolean205 = false;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!wu;BILclient!d;)Lclient!ha;")
	public static Class95 method2240(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class380 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface6 arg3) {
		if (!Static254.method3522()) {
			throw new RuntimeException("");
		} else if (Static550.method7576("jaggl")) {
			@Pc(24) OpenGL local24 = new OpenGL();
			@Pc(34) long local34 = local24.init(arg0, 8, 8, 8, 24, 0, arg2);
			if (local34 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(53) Class95_Sub3_Sub2 local53 = new Class95_Sub3_Sub2(local24, arg0, local34, arg3, arg1, arg2);
			local53.method7022();
			return local53;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method2241(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class25 local9 = Static296.aClass25Array1[99];
		for (@Pc(16) int local16 = 99; local16 > 0; local16--) {
			Static296.aClass25Array1[local16] = Static296.aClass25Array1[local16 - 1];
		}
		if (local9 == null) {
			local9 = new Class25(arg7, arg0, arg4, arg3, arg1, arg6, arg5, arg2);
		} else {
			local9.method575(arg3, arg7, arg6, arg4, arg1, arg2, arg0, arg5);
		}
		Static176.anInt3101++;
		Static296.aClass25Array1[0] = local9;
		Static265.anInt4279 = Static542.anInt8903;
	}
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!lf", name = "U", descriptor = "[Lclient!qg;")
	public static Class87[] aClass87Array13;

	@OriginalMember(owner = "client!lf", name = "V", descriptor = "[I")
	public static int[] anIntArray295;

	@OriginalMember(owner = "client!lf", name = "P", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_214 = new Class123(54, 9);

	@OriginalMember(owner = "client!lf", name = "T", descriptor = "[[S")
	public static final short[][] aShortArrayArray7 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!rl;IBLjava/lang/String;)Lclient!mt;")
	public static Class168 method3401(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static394.anIntArray486, 0);
		if (Static394.anIntArray486[0] == 0) {
			if (Static394.anIntArray486[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static394.anIntArray486, 1);
			if (Static394.anIntArray486[1] > 1) {
				@Pc(58) byte[] local58 = new byte[Static394.anIntArray486[1]];
				OpenGL.glGetInfoLogARB(local6, Static394.anIntArray486[1], Static394.anIntArray486, 0, local58, 0);
				System.out.println(new String(local58));
			}
			if (Static394.anIntArray486[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class168(arg0, local6, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BIII)Z")
	public static boolean method3402(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface10 local9 = (Interface10) Static86.method825(arg0, arg1, arg2);
		@Pc(19) boolean local19 = true;
		if (local9 != null) {
			local19 = Static188.method3015(local9) & true;
		}
		local9 = (Interface10) Static415.method6101(arg0, arg1, arg2, sq.class);
		if (local9 != null) {
			local19 &= Static188.method3015(local9);
		}
		local9 = (Interface10) Static109.method4308(arg0, arg1, arg2);
		if (local9 != null) {
			local19 &= Static188.method3015(local9);
		}
		return local19;
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(III)I")
	public static int method3404(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static160.anIntArray192[arg1 & 0x3] : Static174.anIntArray220[arg1 & 0x3];
	}
}

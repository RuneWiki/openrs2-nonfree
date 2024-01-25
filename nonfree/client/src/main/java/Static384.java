import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_142 = new Class239(80, 2);

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
	public static int anInt7093 = 1;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILjava/awt/Canvas;Lclient!dda;Lclient!n;I)Lclient!qa;")
	public static synchronized Class39 method6029(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Class53 arg2, @OriginalArg(4) Interface12 arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return Static498.method7332(arg1, false, arg3);
		} else if (arg4 == 2) {
			return Static297.method4695(arg3, arg1);
		} else if (arg4 == 4) {
			return Static498.method7332(arg1, true, arg3);
		} else if (arg4 == 1) {
			return Static257.method4025(arg0, arg1, arg3);
		} else if (arg4 == 5) {
			return Static477.method7126(arg2, arg0, arg1, arg3);
		} else if (arg4 == 3) {
			return Static557.method6343(arg1, arg2, arg3, arg0);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/String;IILclient!os;)Lclient!ku;")
	public static Class168 method6039(@OriginalArg(0) String arg0, @OriginalArg(3) Class39_Sub3 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static236.anIntArray413, 0);
		if (Static236.anIntArray413[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class168(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}

import jaggl.OpenGL;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "Lclient!ha;")
	public static Class33 aClass33_5;

	@OriginalMember(owner = "client!cia", name = "c", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!cia", name = "d", descriptor = "F")
	public static float aFloat37;

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(IBLjava/lang/String;Lclient!eq;)Lclient!kn;")
	public static Class186 method1488(@OriginalArg(2) String arg0, @OriginalArg(3) Class33_Sub3 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static387.anIntArray447, 0);
		if (Static387.anIntArray447[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class186(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}

import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "[[[Lclient!fq;")
	public static Class80[][][] aClass80ArrayArrayArray3;

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_71 = new Class179(75, -1);

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_174 = new Class107(31, -2);

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!od;ILjava/awt/Canvas;Lclient!ga;I)Lclient!ya;")
	public static Class39 method4844(@OriginalArg(0) Class180 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Interface4 arg2, @OriginalArg(4) int arg3) {
		return new qa(arg3, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!kd;[Lclient!sn;)Lclient!fe;")
	public static Class72 method4845(@OriginalArg(1) Class39_Sub2 arg0, @OriginalArg(2) Class224[] arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] == null || arg1[local5].aLong190 <= 0L) {
				return null;
			}
		}
		@Pc(26) long local26 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(28) int local28 = 0; local28 < arg1.length; local28++) {
			OpenGL.glAttachObjectARB(local26, arg1[local28].aLong190);
		}
		OpenGL.glLinkProgramARB(local26);
		OpenGL.glGetObjectParameterivARB(local26, 35714, Static165.anIntArray276, 0);
		if (Static165.anIntArray276[0] == 0) {
			if (Static165.anIntArray276[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local26, 35716, Static165.anIntArray276, 1);
			if (Static165.anIntArray276[1] > 1) {
				@Pc(84) byte[] local84 = new byte[Static165.anIntArray276[1]];
				OpenGL.glGetInfoLogARB(local26, Static165.anIntArray276[1], Static165.anIntArray276, 0, local84, 0);
				System.out.println(new String(local84));
			}
			if (Static165.anIntArray276[0] == 0) {
				for (@Pc(108) int local108 = 0; local108 < arg1.length; local108++) {
					OpenGL.glDetachObjectARB(local26, arg1[local108].aLong190);
				}
				OpenGL.glDeleteObjectARB(local26);
				return null;
			}
		}
		return new Class72(arg0, local26, arg1);
	}
}

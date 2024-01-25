import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "Lclient!ri;")
	public static Class284 aClass284_36;

	@OriginalMember(owner = "client!eea", name = "h", descriptor = "I")
	public static int anInt2730;

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZII)I")
	public static int method2294(@OriginalArg(2) int arg0) {
		@Pc(14) Class3_Sub44 local14 = Static470.method6424(false, arg0);
		if (local14 == null) {
			return Static540.aClass327_1.method7298(arg0).anInt5349;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(34) int local34 = 0; local34 < local14.anIntArray446.length; local34++) {
			if (local14.anIntArray446[local34] == -1) {
				local24++;
			}
		}
		return local24 + Static540.aClass327_1.method7298(arg0).anInt5349 - local14.anIntArray446.length;
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(B)V")
	public static void method2295() {
		Static345.anInt6219 = 0;
		Static73.aClass367Array4 = new Class367[50];
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method2296(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static372.anInt6493; local16++) {
			if (arg0.equalsIgnoreCase(Static437.aStringArray36[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "([BILclient!bea;B)Lclient!dg;")
	public static Class67 method2297(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31_Sub1_Sub1 arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceRawARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static324.anIntArray289, 0);
		if (Static324.anIntArray289[0] == 0) {
			if (Static324.anIntArray289[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static324.anIntArray289, 1);
			if (Static324.anIntArray289[1] > 1) {
				@Pc(53) byte[] local53 = new byte[Static324.anIntArray289[1]];
				OpenGL.glGetInfoLogARB(local6, Static324.anIntArray289[1], Static324.anIntArray289, 0, local53, 0);
				System.out.println(new String(local53));
			}
			if (Static324.anIntArray289[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class67(arg2, local6, arg1);
	}
}

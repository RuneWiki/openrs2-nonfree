import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_44 = new Class181(77, 3);

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "Lclient!kg;")
	public static final Class186 aClass186_9 = new Class186(1, 2, 2, 0);

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
	public static int anInt4824 = 0;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILjava/lang/String;ILclient!rda;)Lclient!cba;")
	public static Class46 method4409(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class126_Sub3 arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static596.anIntArray789, 0);
		if (Static596.anIntArray789[0] == 0) {
			if (Static596.anIntArray789[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static596.anIntArray789, 1);
			if (Static596.anIntArray789[1] > 1) {
				@Pc(55) byte[] local55 = new byte[Static596.anIntArray789[1]];
				OpenGL.glGetInfoLogARB(local6, Static596.anIntArray789[1], Static596.anIntArray789, 0, local55, 0);
				System.out.println(new String(local55));
			}
			if (Static596.anIntArray789[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class46(arg2, local6, arg1);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
	public static void method4410(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static40.anInt704 == 2) {
				Static311.aClass301Array1[0].method7145(Static589.aClass350Array3[0]);
				Static311.aClass301Array1[1].method7145(Static589.aClass350Array3[1]);
			} else if (Static40.anInt704 == 3) {
				Static311.aClass301Array1[0].method7145(Static589.aClass350Array3[0]);
				Static311.aClass301Array1[1].method7145(Static589.aClass350Array3[1]);
				Static311.aClass301Array1[2].method7145(Static589.aClass350Array3[2]);
			} else {
				Static311.aClass301Array1[0].method7145(Static589.aClass350Array3[0]);
				Static311.aClass301Array1[1].method7145(Static589.aClass350Array3[1]);
				Static311.aClass301Array1[2].method7145(Static589.aClass350Array3[2]);
				Static311.aClass301Array1[3].method7145(Static589.aClass350Array3[3]);
			}
		} else if (arg0 == 1) {
			if (Static40.anInt704 == 2) {
				Static311.aClass301Array1[0].method7145(Static589.aClass350Array3[2]);
			} else if (Static40.anInt704 == 3) {
				Static311.aClass301Array1[0].method7145(Static589.aClass350Array3[3]);
				Static311.aClass301Array1[1].method7145(Static589.aClass350Array3[4]);
			} else {
				Static311.aClass301Array1[0].method7145(Static589.aClass350Array3[4]);
				Static311.aClass301Array1[1].method7145(Static589.aClass350Array3[5]);
				Static311.aClass301Array1[2].method7145(Static589.aClass350Array3[6]);
			}
		} else if (arg0 == 2) {
			if (Static40.anInt704 == 2) {
				Static311.aClass301Array1[0].method7145(Static589.aClass350Array3[3]);
				return;
			}
			if (Static40.anInt704 == 3) {
				Static311.aClass301Array1[0].method7145(Static589.aClass350Array3[5]);
				return;
			}
			Static311.aClass301Array1[0].method7145(Static589.aClass350Array3[7]);
		}
	}
}

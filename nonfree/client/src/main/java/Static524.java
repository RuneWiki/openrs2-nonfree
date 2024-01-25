import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
	public static int anInt9196;

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
	public static int anInt9194 = 0;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILjava/lang/String;Lclient!er;B)Lclient!jf;")
	public static Class157 method7238(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class31_Sub2 arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local6, arg1);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static6.anIntArray3, 0);
		if (Static6.anIntArray3[0] == 0) {
			if (Static6.anIntArray3[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static6.anIntArray3, 1);
			if (Static6.anIntArray3[1] > 1) {
				@Pc(53) byte[] local53 = new byte[Static6.anIntArray3[1]];
				OpenGL.glGetInfoLogARB(local6, Static6.anIntArray3[1], Static6.anIntArray3, 0, local53, 0);
				System.out.println(new String(local53));
			}
			if (Static6.anIntArray3[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class157(arg2, local6, arg0);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II[Lclient!pca;)V")
	public static void method7239(@OriginalArg(0) int arg0, @OriginalArg(2) Class251[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class251 local13 = arg1[local7];
			if (local13 != null && arg0 == local13.anInt7280 && !Static70.method1711(local13)) {
				if (local13.anInt7231 == 0) {
					method7239(local13.anInt7279, arg1);
					if (local13.aClass251Array3 != null) {
						method7239(local13.anInt7279, local13.aClass251Array3);
					}
					@Pc(51) Class3_Sub49 local51 = (Class3_Sub49) Static204.aClass297_16.method6531((long) local13.anInt7279);
					if (local51 != null) {
						Static8.method72(local51.anInt9244);
					}
				}
				if (local13.anInt7231 == 6 && local13.anInt7266 != -1) {
					@Pc(73) Class270 local73 = Static245.aClass155_1.method3820(local13.anInt7266);
					if (local73 != null) {
						local13.anInt7222 += Static208.anInt4448;
						@Pc(84) int local84 = local13.anInt7271;
						while (local73.anIntArray445[local13.anInt7271] < local13.anInt7222) {
							local13.anInt7222 -= local73.anIntArray445[local13.anInt7271];
							local13.anInt7271++;
							if (local73.anIntArray443.length <= local13.anInt7271) {
								local13.anInt7271 -= local73.anInt7683;
								if (local13.anInt7271 < 0 || local13.anInt7271 >= local73.anIntArray443.length) {
									local13.anInt7271 = 0;
								}
							}
							local13.anInt7270 = local13.anInt7271 + 1;
							if (local73.anIntArray443.length <= local13.anInt7270) {
								local13.anInt7270 -= local73.anInt7683;
								if (local13.anInt7270 < 0 || local73.anIntArray443.length <= local13.anInt7270) {
									local13.anInt7270 = -1;
								}
							}
							Static588.method8016(local13);
						}
						if (local84 != local13.anInt7271) {
							Static372.method5237(local13.anInt7271, local73);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I[Ljava/lang/String;[S)V")
	public static void method7241(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static287.method4309(arg0.length - 1, arg1, 0, arg0);
	}
}

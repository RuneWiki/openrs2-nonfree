import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
	public static int anInt349 = 0;

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "J")
	public static long aLong9 = 0L;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(III)V")
	public static void method265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class270 local7 = Static309.aClass270ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null && local7.aClass3_Sub5_2 != null) {
			local7.aClass3_Sub5_2 = null;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILjava/lang/String;Lclient!pg;B)Lclient!bc;")
	public static Class19 method267(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class163_Sub2 arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local6, arg1);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static244.anIntArray337, 0);
		if (Static244.anIntArray337[0] == 0) {
			if (Static244.anIntArray337[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static244.anIntArray337, 1);
			if (Static244.anIntArray337[1] > 1) {
				@Pc(55) byte[] local55 = new byte[Static244.anIntArray337[1]];
				OpenGL.glGetInfoLogARB(local6, Static244.anIntArray337[1], Static244.anIntArray337, 0, local55, 0);
				System.out.println(new String(local55));
			}
			if (Static244.anIntArray337[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class19(arg2, local6, arg0);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
	public static void method268() {
		if (!Static365.aBoolean444) {
			return;
		}
		while (true) {
			while (Static85.aClass65_Sub1Array3.length > Static180.anInt3089) {
				@Pc(26) Class65_Sub1 local26 = Static85.aClass65_Sub1Array3[Static180.anInt3089];
				if (local26 != null && local26.anInt2408 == -1) {
					if (Static215.aClass2_Sub11_2 == null) {
						Static215.aClass2_Sub11_2 = Static229.aClass202_1.method4387(local26.aString73);
					}
					@Pc(49) int local49 = Static215.aClass2_Sub11_2.anInt1499;
					if (local49 == -1) {
						return;
					}
					Static215.aClass2_Sub11_2 = null;
					local26.anInt2408 = local49;
					Static180.anInt3089++;
				} else {
					Static180.anInt3089++;
				}
			}
			return;
		}
	}
}

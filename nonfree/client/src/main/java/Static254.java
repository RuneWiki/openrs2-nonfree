import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILclient!d;Ljava/awt/Canvas;ILclient!nd;)Lclient!ha;")
	public static Class13 method4241(@OriginalArg(0) int arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(4) Class238 arg3) {
		if (!Static211.method3532()) {
			throw new RuntimeException("");
		} else if (Static354.method5314("jaggl")) {
			@Pc(29) OpenGL local29 = new OpenGL();
			@Pc(39) long local39 = local29.init(arg2, 8, 8, 8, 24, 0, arg0);
			if (local39 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(58) Class13_Sub3_Sub1 local58 = new Class13_Sub3_Sub1(local29, arg2, local39, arg1, arg3, arg0);
			local58.method8202();
			return local58;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BLclient!bi;[Lclient!pf;)Lclient!it;")
	public static Class167 method4243(@OriginalArg(1) Class13_Sub2 arg0, @OriginalArg(2) Class268[] arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] == null || arg1[local5].aLong192 <= 0L) {
				return null;
			}
		}
		@Pc(28) long local28 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(30) int local30 = 0; local30 < arg1.length; local30++) {
			OpenGL.glAttachObjectARB(local28, arg1[local30].aLong192);
		}
		OpenGL.glLinkProgramARB(local28);
		OpenGL.glGetObjectParameterivARB(local28, 35714, Static431.anIntArray554, 0);
		if (Static431.anIntArray554[0] == 0) {
			if (Static431.anIntArray554[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local28, 35716, Static431.anIntArray554, 1);
			if (Static431.anIntArray554[1] > 1) {
				@Pc(80) byte[] local80 = new byte[Static431.anIntArray554[1]];
				OpenGL.glGetInfoLogARB(local28, Static431.anIntArray554[1], Static431.anIntArray554, 0, local80, 0);
				System.out.println(new String(local80));
			}
			if (Static431.anIntArray554[0] == 0) {
				for (@Pc(101) int local101 = 0; local101 < arg1.length; local101++) {
					OpenGL.glDetachObjectARB(local28, arg1[local101].aLong192);
				}
				OpenGL.glDeleteObjectARB(local28);
				return null;
			}
		}
		return new Class167(arg0, local28, arg1);
	}
}

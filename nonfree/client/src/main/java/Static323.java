import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!la", name = "a", descriptor = "Lclient!o;")
	public static final Class252 aClass252_1 = new Class252(16);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II[BI)I")
	public static int method5027(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = -1;
		for (@Pc(12) int local12 = arg2; local12 < arg0; local12++) {
			local10 = Class343.anIntArray516[(local10 ^ arg1[local12]) & 0xFF] ^ local10 >>> 8;
		}
		return ~local10;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
	public static void method5029() {
		Static74.method1094();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B[Lclient!ut;Lclient!og;)Lclient!fja;")
	public static Class117 method5030(@OriginalArg(1) Class362[] arg0, @OriginalArg(2) Class143_Sub1_Sub2 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong302 <= 0L) {
				return null;
			}
		}
		@Pc(35) long local35 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
			OpenGL.glAttachObjectARB(local35, arg0[local37].aLong302);
		}
		OpenGL.glLinkProgramARB(local35);
		OpenGL.glGetObjectParameterivARB(local35, 35714, Static646.anIntArray591, 0);
		if (Static646.anIntArray591[0] == 0) {
			if (Static646.anIntArray591[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local35, 35716, Static646.anIntArray591, 1);
			if (Static646.anIntArray591[1] > 1) {
				@Pc(97) byte[] local97 = new byte[Static646.anIntArray591[1]];
				OpenGL.glGetInfoLogARB(local35, Static646.anIntArray591[1], Static646.anIntArray591, 0, local97, 0);
				System.out.println(new String(local97));
			}
			if (Static646.anIntArray591[0] == 0) {
				for (@Pc(121) int local121 = 0; local121 < arg0.length; local121++) {
					OpenGL.glDetachObjectARB(local35, arg0[local121].aLong302);
				}
				OpenGL.glDeleteObjectARB(local35);
				return null;
			}
		}
		return new Class117(arg1, local35, arg0);
	}
}

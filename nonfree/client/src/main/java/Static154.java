import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!gca", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!ji;Z)V")
	public static void method2909(@OriginalArg(0) Class6_Sub21 arg0) {
		@Pc(9) int local9 = arg0.method6005();
		Static300.aClass341Array1 = new Class341[local9];
		for (@Pc(19) int local19 = 0; local19 < local9; local19++) {
			Static300.aClass341Array1[local19] = new Class341();
			Static300.aClass341Array1[local19].anInt9212 = arg0.method6005();
			Static300.aClass341Array1[local19].aString101 = arg0.method6029();
		}
		Static233.anInt4737 = arg0.method6005();
		Static158.anInt3361 = arg0.method6005();
		Static255.anInt4966 = arg0.method6005();
		Static109.aClass299_Sub1Array1 = new Class299_Sub1[Static158.anInt3361 + 1 - Static233.anInt4737];
		for (@Pc(66) int local66 = 0; local66 < Static255.anInt4966; local66++) {
			@Pc(72) int local72 = arg0.method6005();
			@Pc(80) Class299_Sub1 local80 = Static109.aClass299_Sub1Array1[local72] = new Class299_Sub1();
			local80.anInt8026 = arg0.method6069();
			local80.anInt8025 = arg0.method6036();
			local80.anInt8035 = Static233.anInt4737 + local72;
			local80.aString82 = arg0.method6029();
			local80.aString83 = arg0.method6029();
		}
		Static245.anInt4908 = arg0.method6036();
		Static357.aBoolean444 = true;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZI)Lclient!fl;")
	public static Class97 method2911(@OriginalArg(1) int arg0) {
		@Pc(10) Class97 local10 = (Class97) Static83.aClass136_19.method3473((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static11.aClass251_6.method5772(arg0, 0);
		local10 = new Class97();
		if (local20 != null) {
			local10.method2764(arg0, new Class6_Sub21(local20));
		}
		Static83.aClass136_19.method3482((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILclient!mn;)V")
	public static void method2912(@OriginalArg(1) Class98_Sub4 arg0) {
		arg0.aClass4_Sub1_Sub1_1 = null;
		if (Static81.anInt1697 < 20) {
			Static510.aClass40_7.method1131(arg0);
			Static81.anInt1697++;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V")
	public static void method2913() {
		if (Static352.aClass272_2.aBoolean511 && Static171.aClass105_2.anInt3307 != -1) {
			Static235.method4085(Static171.aClass105_2.anInt3307, Static171.aClass105_2.aString26);
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "([Lclient!hr;ILclient!jaa;)Lclient!sh;")
	public static Class305 method2915(@OriginalArg(0) Class137[] arg0, @OriginalArg(2) Class14_Sub3 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong109 <= 0L) {
				return null;
			}
		}
		@Pc(31) long local31 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
			OpenGL.glAttachObjectARB(local31, arg0[local33].aLong109);
		}
		OpenGL.glLinkProgramARB(local31);
		OpenGL.glGetObjectParameterivARB(local31, 35714, Static326.anIntArray438, 0);
		if (Static326.anIntArray438[0] == 0) {
			if (Static326.anIntArray438[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local31, 35716, Static326.anIntArray438, 1);
			if (Static326.anIntArray438[1] > 1) {
				@Pc(89) byte[] local89 = new byte[Static326.anIntArray438[1]];
				OpenGL.glGetInfoLogARB(local31, Static326.anIntArray438[1], Static326.anIntArray438, 0, local89, 0);
				System.out.println(new String(local89));
			}
			if (Static326.anIntArray438[0] == 0) {
				for (@Pc(113) int local113 = 0; local113 < arg0.length; local113++) {
					OpenGL.glDetachObjectARB(local31, arg0[local113].aLong109);
				}
				OpenGL.glDeleteObjectARB(local31);
				return null;
			}
		}
		return new Class305(arg1, local31, arg0);
	}
}

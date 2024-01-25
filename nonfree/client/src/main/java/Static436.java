import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
	public static int anInt7610;

	@OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
	public static int anInt7620 = 0;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!bo;[Lclient!tr;Z)Lclient!eu;")
	public static Class74 method5907(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) Class235[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong202 <= 0L) {
				return null;
			}
		}
		@Pc(36) long local36 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(38) int local38 = 0; local38 < arg1.length; local38++) {
			OpenGL.glAttachObjectARB(local36, arg1[local38].aLong202);
		}
		OpenGL.glLinkProgramARB(local36);
		OpenGL.glGetObjectParameterivARB(local36, 35714, Static360.anIntArray425, 0);
		if (Static360.anIntArray425[0] == 0) {
			if (Static360.anIntArray425[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local36, 35716, Static360.anIntArray425, 1);
			if (Static360.anIntArray425[1] > 1) {
				@Pc(90) byte[] local90 = new byte[Static360.anIntArray425[1]];
				OpenGL.glGetInfoLogARB(local36, Static360.anIntArray425[1], Static360.anIntArray425, 0, local90, 0);
				System.out.println(new String(local90));
			}
			if (Static360.anIntArray425[0] == 0) {
				for (@Pc(111) int local111 = 0; local111 < arg1.length; local111++) {
					OpenGL.glDetachObjectARB(local36, arg1[local111].aLong202);
				}
				OpenGL.glDeleteObjectARB(local36);
				return null;
			}
		}
		return new Class74(arg0, local36, arg1);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIB)V")
	public static void method5908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub2_Sub2 local8 = Static15.method236(arg0, 1);
		local8.method434();
		local8.anInt657 = arg1;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!m;Lclient!pc;I)V")
	public static void method5909(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Class188 arg1) {
		Static107.anInterface8_3 = arg0;
		Static403.aClass188_117 = arg1;
	}
}

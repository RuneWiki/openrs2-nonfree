import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!hj", name = "q", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_64 = new Class130(81, -1);

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(JIIB)V")
	public static void method3633(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = (int) arg0 >> 14 & 0x1F;
		@Pc(21) int local21 = (int) arg0 >> 20 & 0x3;
		@Pc(28) int local28 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static396.method5709(0, 0, local10, 0, arg1, arg2, local21, true);
			return;
		}
		@Pc(44) Class299 local44 = Static105.aClass302_1.method7466(local28);
		@Pc(57) int local57;
		@Pc(54) int local54;
		if (local21 == 0 || local21 == 2) {
			local57 = local44.anInt8661;
			local54 = local44.anInt8625;
		} else {
			local54 = local44.anInt8661;
			local57 = local44.anInt8625;
		}
		@Pc(68) int local68 = local44.anInt8636;
		if (local21 != 0) {
			local68 = (local68 << local21 & 0xF) + (local68 >> 4 - local21);
		}
		Static396.method5709(local57, local68, 0, local54, arg1, arg2, 0, true);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([Lclient!ms;ILclient!mba;)Lclient!eaa;")
	public static Class82 method3634(@OriginalArg(0) Class224[] arg0, @OriginalArg(2) Class5_Sub1_Sub2 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong188 <= 0L) {
				return null;
			}
		}
		@Pc(29) long local29 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(31) int local31 = 0; local31 < arg0.length; local31++) {
			OpenGL.glAttachObjectARB(local29, arg0[local31].aLong188);
		}
		OpenGL.glLinkProgramARB(local29);
		OpenGL.glGetObjectParameterivARB(local29, 35714, Static208.anIntArray532, 0);
		if (Static208.anIntArray532[0] == 0) {
			if (Static208.anIntArray532[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local29, 35716, Static208.anIntArray532, 1);
			if (Static208.anIntArray532[1] > 1) {
				@Pc(88) byte[] local88 = new byte[Static208.anIntArray532[1]];
				OpenGL.glGetInfoLogARB(local29, Static208.anIntArray532[1], Static208.anIntArray532, 0, local88, 0);
				System.out.println(new String(local88));
			}
			if (Static208.anIntArray532[0] == 0) {
				for (@Pc(109) int local109 = 0; local109 < arg0.length; local109++) {
					OpenGL.glDetachObjectARB(local29, arg0[local109].aLong188);
				}
				OpenGL.glDeleteObjectARB(local29);
				return null;
			}
		}
		return new Class82(arg1, local29, arg0);
	}
}

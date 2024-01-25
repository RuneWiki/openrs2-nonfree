import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static648 {

	@OriginalMember(owner = "client!ww", name = "L", descriptor = "I")
	public static int anInt10737;

	@OriginalMember(owner = "client!ww", name = "db", descriptor = "Lclient!vd;")
	public static Class353 aClass353_138;

	@OriginalMember(owner = "client!ww", name = "S", descriptor = "I")
	public static final int anInt10742 = -1;

	@OriginalMember(owner = "client!ww", name = "V", descriptor = "I")
	public static int anInt10745 = -1;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(III)I")
	public static int method9033(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(25) byte local25;
		if (arg1 > 20000) {
			Static308.method5205();
			local25 = 4;
		} else if (arg1 > 10000) {
			Static600.method8452();
			local25 = 3;
		} else if (arg1 <= 5000) {
			local25 = 1;
			Static488.method8558();
		} else {
			local25 = 2;
			Static112.method1848();
		}
		if (arg0 != Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681()) {
			Static348.aClass6_Sub22_19.method3534(arg0, Static348.aClass6_Sub22_19.aClass15_Sub22_1);
			Static278.method4875(arg0, false);
		}
		Static289.method5031();
		return local25;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!kd;Z)V")
	public static void method9036(@OriginalArg(0) Class20_Sub2_Sub2_Sub1_Sub2 arg0) {
		for (@Pc(16) Class6_Sub49 local16 = (Class6_Sub49) Static23.aClass8_21.method149(); local16 != null; local16 = (Class6_Sub49) Static23.aClass8_21.method155()) {
			if (arg0 == local16.aClass20_Sub2_Sub2_Sub1_Sub2_2) {
				if (local16.aClass6_Sub3_Sub3_4 != null) {
					Static196.aClass6_Sub3_Sub1_1.method270(local16.aClass6_Sub3_Sub3_4);
					local16.aClass6_Sub3_Sub3_4 = null;
				}
				local16.method9043();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "([Lclient!wj;Lclient!wh;I)Lclient!rv;")
	public static Class300 method9037(@OriginalArg(0) Class375[] arg0, @OriginalArg(1) Class100_Sub3 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong276 <= 0L) {
				return null;
			}
		}
		@Pc(35) long local35 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(42) int local42 = 0; local42 < arg0.length; local42++) {
			OpenGL.glAttachObjectARB(local35, arg0[local42].aLong276);
		}
		OpenGL.glLinkProgramARB(local35);
		OpenGL.glGetObjectParameterivARB(local35, 35714, Static636.anIntArray642, 0);
		if (Static636.anIntArray642[0] == 0) {
			if (Static636.anIntArray642[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local35, 35716, Static636.anIntArray642, 1);
			if (Static636.anIntArray642[1] > 1) {
				@Pc(96) byte[] local96 = new byte[Static636.anIntArray642[1]];
				OpenGL.glGetInfoLogARB(local35, Static636.anIntArray642[1], Static636.anIntArray642, 0, local96, 0);
				System.out.println(new String(local96));
			}
			if (Static636.anIntArray642[0] == 0) {
				for (@Pc(120) int local120 = 0; local120 < arg0.length; local120++) {
					OpenGL.glDetachObjectARB(local35, arg0[local120].aLong276);
				}
				OpenGL.glDeleteObjectARB(local35);
				return null;
			}
		}
		return new Class300(arg1, local35, arg0);
	}
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILclient!ee;)V")
	public static void method710(@OriginalArg(1) Class5_Sub12 arg0) {
		@Pc(9) int local9 = arg0.method8614();
		Static46.aClass71Array1 = new Class71[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static46.aClass71Array1[local14] = new Class71();
			Static46.aClass71Array1[local14].anInt1499 = arg0.method8614();
			Static46.aClass71Array1[local14].aString20 = arg0.method8648();
		}
		Static57.anInt915 = arg0.method8614();
		Static466.anInt7863 = arg0.method8614();
		Static76.anInt1279 = arg0.method8614();
		Static197.aClass166_Sub1Array2 = new Class166_Sub1[Static466.anInt7863 + 1 - Static57.anInt915];
		for (@Pc(66) int local66 = 0; local66 < Static76.anInt1279; local66++) {
			@Pc(72) int local72 = arg0.method8614();
			@Pc(80) Class166_Sub1 local80 = Static197.aClass166_Sub1Array2[local72] = new Class166_Sub1();
			local80.anInt8513 = arg0.method8645();
			local80.anInt8510 = arg0.method8623();
			local80.anInt8518 = local72 + Static57.anInt915;
			local80.aString120 = arg0.method8648();
			local80.aString121 = arg0.method8648();
		}
		Static504.anInt8542 = arg0.method8623();
		Static74.aBoolean103 = true;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!rda;[Lclient!cba;I)Lclient!nfa;")
	public static Class241 method711(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) Class46[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong32 <= 0L) {
				return null;
			}
		}
		@Pc(36) long local36 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(38) int local38 = 0; local38 < arg1.length; local38++) {
			OpenGL.glAttachObjectARB(local36, arg1[local38].aLong32);
		}
		OpenGL.glLinkProgramARB(local36);
		OpenGL.glGetObjectParameterivARB(local36, 35714, Static622.anIntArray808, 0);
		if (Static622.anIntArray808[0] == 0) {
			if (Static622.anIntArray808[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local36, 35716, Static622.anIntArray808, 1);
			if (Static622.anIntArray808[1] > 1) {
				@Pc(84) byte[] local84 = new byte[Static622.anIntArray808[1]];
				OpenGL.glGetInfoLogARB(local36, Static622.anIntArray808[1], Static622.anIntArray808, 0, local84, 0);
				System.out.println(new String(local84));
			}
			if (Static622.anIntArray808[0] == 0) {
				for (@Pc(108) int local108 = 0; local108 < arg1.length; local108++) {
					OpenGL.glDetachObjectARB(local36, arg1[local108].aLong32);
				}
				OpenGL.glDeleteObjectARB(local36);
				return null;
			}
		}
		return new Class241(arg0, local36, arg1);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "([Lclient!kf;II)V")
	public static void method712(@OriginalArg(0) Class14_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class14_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt9320;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt9320 < local27 + (local29 & 0x1)) {
				@Pc(44) Class14_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method712(arg0, arg1, local10 - 1);
		method712(arg0, local10 + 1, arg2);
	}
}

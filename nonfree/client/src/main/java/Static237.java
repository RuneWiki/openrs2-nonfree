import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!is", name = "z", descriptor = "I")
	public static int anInt5337;

	@OriginalMember(owner = "client!is", name = "B", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_58 = new Class71(108, 3);

	@OriginalMember(owner = "client!is", name = "I", descriptor = "[I")
	public static final int[] anIntArray314 = new int[5];

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!nv;[Lclient!w;I)Lclient!rda;")
	public static Class288 method4354(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) Class362[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			if (arg1[local12] == null || arg1[local12].aLong272 <= 0L) {
				return null;
			}
		}
		@Pc(36) long local36 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(38) int local38 = 0; local38 < arg1.length; local38++) {
			OpenGL.glAttachObjectARB(local36, arg1[local38].aLong272);
		}
		OpenGL.glLinkProgramARB(local36);
		OpenGL.glGetObjectParameterivARB(local36, 35714, Static365.anIntArray388, 0);
		if (Static365.anIntArray388[0] == 0) {
			if (Static365.anIntArray388[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local36, 35716, Static365.anIntArray388, 1);
			if (Static365.anIntArray388[1] > 1) {
				@Pc(88) byte[] local88 = new byte[Static365.anIntArray388[1]];
				OpenGL.glGetInfoLogARB(local36, Static365.anIntArray388[1], Static365.anIntArray388, 0, local88, 0);
				System.out.println(new String(local88));
			}
			if (Static365.anIntArray388[0] == 0) {
				for (@Pc(112) int local112 = 0; local112 < arg1.length; local112++) {
					OpenGL.glDetachObjectARB(local36, arg1[local112].aLong272);
				}
				OpenGL.glDeleteObjectARB(local36);
				return null;
			}
		}
		return new Class288(arg0, local36, arg1);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 0 || arg6 < 0 || Static372.anInt7082 - 1 <= arg1 || arg6 >= Static218.anInt5023 - 1) {
			return;
		}
		if (Static405.aClass56ArrayArrayArray2 == null) {
			return;
		}
		@Pc(56) Interface27 local56;
		if (arg4 == 0) {
			local56 = (Interface27) Static418.method6567(arg2, arg1, arg6);
			@Pc(62) Interface27 local62 = (Interface27) Static570.method7926(arg2, arg1, arg6);
			if (local56 != null && arg3 != 2) {
				if (local56 instanceof Class15_Sub1_Sub4_Sub1) {
					((Class15_Sub1_Sub4_Sub1) local56).aClass143_1.method4181(arg0);
				} else {
					Static528.method7472(arg1, arg6, arg2, arg3, arg5, arg0, arg4, local56.method8342());
				}
			}
			if (local62 != null) {
				if (local62 instanceof Class15_Sub1_Sub4_Sub1) {
					((Class15_Sub1_Sub4_Sub1) local62).aClass143_1.method4181(arg0);
					return;
				}
				Static528.method7472(arg1, arg6, arg2, arg3, arg5, arg0, arg4, local62.method8342());
				return;
			}
			return;
		}
		if (arg4 != 1) {
			if (arg4 == 2) {
				local56 = (Interface27) Static575.method7984(arg2, arg1, arg6, wha.class);
				if (local56 == null) {
					return;
				}
				if (arg3 == 11) {
					arg3 = 10;
				}
				if (!(local56 instanceof Class15_Sub1_Sub2_Sub4)) {
					Static528.method7472(arg1, arg6, arg2, arg3, arg5, arg0, arg4, local56.method8342());
					return;
				}
				((Class15_Sub1_Sub2_Sub4) local56).lb.method4181(arg0);
			} else if (arg4 == 3) {
				local56 = (Interface27) Static484.method7154(arg2, arg1, arg6);
				if (local56 != null) {
					if (!(local56 instanceof Class15_Sub1_Sub3_Sub2)) {
						Static528.method7472(arg1, arg6, arg2, arg3, arg5, arg0, arg4, local56.method8342());
						return;
					}
					((Class15_Sub1_Sub3_Sub2) local56).aClass143_3.method4181(arg0);
					return;
				}
			}
			return;
		}
		local56 = (Interface27) Static408.method6467(arg2, arg1, arg6);
		if (local56 == null) {
			return;
		}
		if (local56 instanceof Class15_Sub1_Sub5_Sub1) {
			((Class15_Sub1_Sub5_Sub1) local56).aClass143_2.method4181(arg0);
			return;
		}
		@Pc(231) int local231 = local56.method8342();
		if (arg3 == 4 || arg3 == 5) {
			Static528.method7472(arg1, arg6, arg2, 4, arg5, arg0, arg4, local231);
			return;
		}
		if (arg3 == 6) {
			Static528.method7472(arg1, arg6, arg2, 4, arg5 + 4, arg0, arg4, local231);
		} else if (arg3 == 7) {
			Static528.method7472(arg1, arg6, arg2, 4, (arg5 + 2 & 0x3) + 4, arg0, arg4, local231);
			return;
		} else if (arg3 == 8) {
			Static528.method7472(arg1, arg6, arg2, 4, arg5 + 4, arg0, arg4, local231);
			Static528.method7472(arg1, arg6, arg2, 4, (arg5 + 2 & 0x3) + 4, arg0, arg4, local231);
			return;
		}
		return;
	}
}

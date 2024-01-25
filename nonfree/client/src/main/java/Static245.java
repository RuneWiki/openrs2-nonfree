import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!ica", name = "n", descriptor = "I")
	public static int anInt4579;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "I")
	public static final int anInt4574 = 50;

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "I")
	public static int anInt4575 = 0;

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "[I")
	public static final int[] anIntArray296 = new int[anInt4574];

	@OriginalMember(owner = "client!ica", name = "g", descriptor = "[I")
	public static final int[] anIntArray297 = new int[anInt4574];

	@OriginalMember(owner = "client!ica", name = "h", descriptor = "[I")
	public static final int[] anIntArray298 = new int[anInt4574];

	@OriginalMember(owner = "client!ica", name = "j", descriptor = "[I")
	public static final int[] anIntArray299 = new int[anInt4574];

	@OriginalMember(owner = "client!ica", name = "k", descriptor = "[I")
	public static final int[] anIntArray300 = new int[anInt4574];

	@OriginalMember(owner = "client!ica", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[anInt4574];

	@OriginalMember(owner = "client!ica", name = "m", descriptor = "[I")
	public static final int[] anIntArray301 = new int[anInt4574];

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(BLclient!fl;Z)V")
	public static void method3918(@OriginalArg(1) Class23_Sub2_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static37.anInt1104 >= 400) {
			return;
		}
		if (arg0 != Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2) {
			@Pc(89) String local89;
			if (arg0.anInt3266 == 0) {
				@Pc(100) boolean local100 = true;
				if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt3270 != -1 && arg0.anInt3270 != -1) {
					@Pc(119) int local119 = arg0.anInt3270 <= Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt3270 ? arg0.anInt3270 : Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt3270;
					@Pc(126) int local126 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt3272 - arg0.anInt3272;
					if (local126 < 0) {
						local126 = -local126;
					}
					if (local126 > local119) {
						local100 = false;
					}
				}
				@Pc(152) String local152 = Static14.aClass181_5 == Static102.aClass181_38 ? Static569.aClass335_31.method7694(Static319.anInt5939) : Static569.aClass335_29.method7694(Static319.anInt5939);
				if (arg0.anInt3285 <= arg0.anInt3272) {
					local89 = arg0.method2903() + (local100 ? Static676.method8726(arg0.anInt3272, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt3272) : "<col=ffffff>") + " (" + local152 + arg0.anInt3272 + ")";
				} else {
					local89 = arg0.method2903() + (local100 ? Static676.method8726(arg0.anInt3272, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt3272) : "<col=ffffff>") + " (" + local152 + arg0.anInt3272 + "+" + (arg0.anInt3285 - arg0.anInt3272) + ")";
				}
			} else if (arg0.anInt3266 == -1) {
				local89 = arg0.method2903();
			} else {
				local89 = arg0.method2903() + " (" + Static569.aClass335_30.method7694(Static319.anInt5939) + arg0.anInt3266 + ")";
			}
			if (Static329.aBoolean166 && !arg1 && (Static7.anInt94 & 0x8) != 0) {
				Static225.method3514(true, false, -1, Static158.anInt2968, 0, (long) arg0.anInt10180, Static542.aString107 + " -> <col=ffffff>" + local89, 17, Static46.aString12, (long) arg0.anInt10180, false, 0);
			}
			if (arg1) {
				Static225.method3514(false, false, 0, -1, 0, 0L, "", -1, "<col=cccccc>" + local89, (long) arg0.anInt10180, true, 0);
			} else {
				for (@Pc(273) int local273 = 7; local273 >= 0; local273--) {
					if (Static477.aStringArray57[local273] != null) {
						@Pc(281) short local281 = 0;
						if (Static102.aClass181_38 == Static341.aClass181_93 && Static477.aStringArray57[local273].equalsIgnoreCase(Static569.aClass335_24.method7694(Static319.anInt5939))) {
							if (Static244.aBoolean360 && arg0.anInt3272 > Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt3272) {
								local281 = 2000;
							}
							if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt3290 == 0 || arg0.anInt3290 == 0) {
								if (arg0.aBoolean261) {
									local281 = 2000;
								}
							} else if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt3290 == arg0.anInt3290) {
								local281 = 2000;
							} else {
								local281 = 0;
							}
						} else if (Static400.aBooleanArray20[local273]) {
							local281 = 2000;
						}
						@Pc(344) short local344 = (short) (Static303.aShortArray177[local273] + local281);
						@Pc(356) int local356 = Static67.anIntArray596[local273] == -1 ? Static581.anInt9234 : Static67.anIntArray596[local273];
						Static225.method3514(true, false, -1, local356, 0, (long) arg0.anInt10180, "<col=ffffff>" + local89, local344, Static477.aStringArray57[local273], (long) arg0.anInt10180, false, 0);
					}
				}
			}
			if (!arg1) {
				for (@Pc(420) Class3_Sub6_Sub16 local420 = (Class3_Sub6_Sub16) Static362.aClass193_32.method4457(); local420 != null; local420 = (Class3_Sub6_Sub16) Static362.aClass193_32.method4459()) {
					if (local420.anInt7069 == 16) {
						local420.aString96 = "<col=ffffff>" + local89;
						return;
					}
				}
			}
		} else if (Static329.aBoolean166 && (Static7.anInt94 & 0x10) != 0) {
			Static225.method3514(true, false, -1, Static158.anInt2968, 0, 0L, Static542.aString107 + " -> <col=ffffff>" + Static569.aClass335_38.method7694(Static319.anInt5939), 9, Static46.aString12, (long) arg0.anInt10180, false, 0);
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Ljava/lang/String;ZILclient!hk;)Lclient!hv;")
	public static Class166 method3919(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class16_Sub2 arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static628.anIntArray631, 0);
		if (Static628.anIntArray631[0] == 0) {
			if (Static628.anIntArray631[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static628.anIntArray631, 1);
			if (Static628.anIntArray631[1] > 1) {
				@Pc(52) byte[] local52 = new byte[Static628.anIntArray631[1]];
				OpenGL.glGetInfoLogARB(local6, Static628.anIntArray631[1], Static628.anIntArray631, 0, local52, 0);
				System.out.println(new String(local52));
			}
			if (Static628.anIntArray631[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class166(arg2, local6, arg1);
	}
}

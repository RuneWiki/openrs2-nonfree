import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "Lclient!sk;")
	public static Class39 aClass39_2;

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
	public static int anInt1328;

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
	public static int anInt1329 = -50;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V")
	public static void method1403() {
		@Pc(7) int local7 = Static274.anInt4964;
		@Pc(9) int[] local9 = Static70.anIntArray392;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class4_Sub1_Sub2_Sub1_Sub2 local19 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local9[local11]];
			if (local19 != null && local19.anInt5747 > 0) {
				local19.anInt5747--;
				if (local19.anInt5747 == 0) {
					local19.aString62 = null;
				}
			}
		}
		for (@Pc(42) int local42 = 0; local42 < Static94.anInt2209; local42++) {
			@Pc(49) long local49 = (long) Static520.anIntArray594[local42];
			@Pc(55) Class3_Sub28 local55 = (Class3_Sub28) Static551.aClass280_43.method7107(local49);
			if (local55 != null) {
				@Pc(60) Class4_Sub1_Sub2_Sub1_Sub1 local60 = local55.aClass4_Sub1_Sub2_Sub1_Sub1_2;
				if (local60.anInt5747 > 0) {
					local60.anInt5747--;
					if (local60.anInt5747 == 0) {
						local60.aString62 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!jw;III)V")
	public static void method1405(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class77 local12;
		if (arg2 < Static569.anInt9425) {
			local12 = Static330.aClass77ArrayArrayArray2[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass4_Sub1_Sub5_1 != null && local12.aClass4_Sub1_Sub5_1.method7690()) {
				arg0.method7696(Static384.anInt7200, local12.aClass4_Sub1_Sub5_1, Static232.aClass5_8, 0, true, 0);
			}
		}
		if (arg3 < Static569.anInt9425) {
			local12 = Static330.aClass77ArrayArrayArray2[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass4_Sub1_Sub5_1 != null && local12.aClass4_Sub1_Sub5_1.method7690()) {
				arg0.method7696(0, local12.aClass4_Sub1_Sub5_1, Static232.aClass5_8, 0, true, Static384.anInt7200);
			}
		}
		if (arg2 < Static569.anInt9425 && arg3 < Static293.anInt5181) {
			local12 = Static330.aClass77ArrayArrayArray2[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass4_Sub1_Sub5_1 != null && local12.aClass4_Sub1_Sub5_1.method7690()) {
				arg0.method7696(Static384.anInt7200, local12.aClass4_Sub1_Sub5_1, Static232.aClass5_8, 0, true, Static384.anInt7200);
			}
		}
		if (arg2 < Static569.anInt9425 && arg3 > 0) {
			local12 = Static330.aClass77ArrayArrayArray2[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass4_Sub1_Sub5_1 != null && local12.aClass4_Sub1_Sub5_1.method7690()) {
				arg0.method7696(Static384.anInt7200, local12.aClass4_Sub1_Sub5_1, Static232.aClass5_8, 0, true, -Static384.anInt7200);
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!mba;II[B)Lclient!ms;")
	public static Class224 method1406(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		if (arg2 == null || arg2.length == 0) {
			return null;
		}
		@Pc(13) long local13 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceRawARB(local13, arg2);
		OpenGL.glCompileShaderARB(local13);
		OpenGL.glGetObjectParameterivARB(local13, 35713, Static301.anIntArray289, 0);
		if (Static301.anIntArray289[0] == 0) {
			if (Static301.anIntArray289[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local13, 35716, Static301.anIntArray289, 1);
			if (Static301.anIntArray289[1] > 1) {
				@Pc(54) byte[] local54 = new byte[Static301.anIntArray289[1]];
				OpenGL.glGetInfoLogARB(local13, Static301.anIntArray289[1], Static301.anIntArray289, 0, local54, 0);
				System.out.println(new String(local54));
			}
			if (Static301.anIntArray289[0] == 0) {
				OpenGL.glDeleteObjectARB(local13);
				return null;
			}
		}
		return new Class224(arg0, local13, arg1);
	}
}

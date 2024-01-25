import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cha", name = "w", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!cha", name = "t", descriptor = "I")
	public static int anInt1202;

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(B)V")
	public static void method1218() {
		Static482.method7253();
		Static656.aBoolean741 = false;
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "()V")
	public static void method1219() {
		for (@Pc(1) int local1 = 0; local1 < Static380.anInt6702; local1++) {
			@Pc(6) Class4_Sub3_Sub3 local6 = Static95.aClass4_Sub3_Sub3Array1[local1];
			Static356.method5411(local6, true);
			Static95.aClass4_Sub3_Sub3Array1[local1] = null;
		}
		Static380.anInt6702 = 0;
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(ILjava/lang/String;Lclient!pi;I)Lclient!ei;")
	public static Class95 method1220(@OriginalArg(1) String arg0, @OriginalArg(2) Class144_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) long local14 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local14, arg0);
		OpenGL.glCompileShaderARB(local14);
		OpenGL.glGetObjectParameterivARB(local14, 35713, Static237.anIntArray231, 0);
		if (Static237.anIntArray231[0] == 0) {
			if (Static237.anIntArray231[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local14, 35716, Static237.anIntArray231, 1);
			if (Static237.anIntArray231[1] > 1) {
				@Pc(59) byte[] local59 = new byte[Static237.anIntArray231[1]];
				OpenGL.glGetInfoLogARB(local14, Static237.anIntArray231[1], Static237.anIntArray231, 0, local59, 0);
				System.out.println(new String(local59));
			}
			if (Static237.anIntArray231[0] == 0) {
				OpenGL.glDeleteObjectARB(local14);
				return null;
			}
		}
		return new Class95(arg1, local14, arg2);
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(IIILclient!nh;I)V")
	public static void method1221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub3_Sub3_Sub3 arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class141 local9 = arg2.method2865();
		@Pc(18) Class181 local18 = arg2.aClass181_7;
		@Pc(28) int local28 = arg2.anInt3289 - arg2.aClass200_7.anInt5507 & 0x3FFF;
		if (arg3 == -1) {
			if (local28 == 0 && arg2.anInt3296 <= 25) {
				if (!arg2.aBoolean236 || !local9.method3041(local18.method8959())) {
					local18.method8964(local9.method3036(), 0);
					arg2.aBoolean236 = local18.method8970();
				}
			} else if (arg0 < 0 && local9.anInt3519 != -1) {
				local18.method8964(local9.anInt3519, 0);
				arg2.aBoolean236 = false;
			} else if (arg0 > 0 && local9.anInt3538 != -1) {
				local18.method8964(local9.anInt3538, 0);
				arg2.aBoolean236 = false;
			} else if (!arg2.aBoolean236 || !local9.method3041(local18.method8959())) {
				local18.method8964(local9.method3036(), 0);
				arg2.aBoolean236 = arg2.aClass181_7.method8970();
			}
		} else if (arg2.anInt3256 != -1 && (local28 >= 10240 || local28 <= 2048)) {
			@Pc(63) int local63 = Static387.anIntArray470[arg1] - arg2.aClass200_7.anInt5507 & 0x3FFF;
			if (arg3 == 2 && local9.anInt3543 != -1) {
				if (local63 > 2048 && local63 <= 6144 && local9.anInt3530 != -1) {
					local18.method8964(local9.anInt3530, 0);
				} else if (local63 >= 10240 && local63 < 14336 && local9.anInt3559 != -1) {
					local18.method8964(local9.anInt3559, 0);
				} else if (local63 <= 6144 || local63 >= 10240 || local9.anInt3560 == -1) {
					local18.method8964(local9.anInt3543, 0);
				} else {
					local18.method8964(local9.anInt3560, 0);
				}
			} else if (arg3 == 0 && local9.anInt3562 != -1) {
				if (local63 > 2048 && local63 <= 6144 && local9.anInt3536 != -1) {
					local18.method8964(local9.anInt3536, 0);
				} else if (local63 >= 10240 && local63 < 14336 && local9.anInt3528 != -1) {
					local18.method8964(local9.anInt3528, 0);
				} else if (local63 <= 6144 || local63 >= 10240 || local9.anInt3563 == -1) {
					local18.method8964(local9.anInt3562, 0);
				} else {
					local18.method8964(local9.anInt3563, 0);
				}
			} else if (local63 > 2048 && local63 <= 6144 && local9.anInt3532 != -1) {
				local18.method8964(local9.anInt3532, 0);
			} else if (local63 >= 10240 && local63 < 14336 && local9.anInt3526 != -1) {
				local18.method8964(local9.anInt3526, 0);
			} else if (local63 <= 6144 || local63 >= 10240 || local9.anInt3542 == -1) {
				local18.method8964(local9.anInt3531, 0);
			} else {
				local18.method8964(local9.anInt3542, 0);
			}
			arg2.aBoolean236 = false;
		} else if (local28 == 0 && arg2.anInt3296 <= 25) {
			if (arg3 == 2 && local9.anInt3543 != -1) {
				local18.method8964(local9.anInt3543, 0);
			} else if (arg3 == 0 && local9.anInt3562 != -1) {
				local18.method8964(local9.anInt3562, 0);
			} else {
				local18.method8964(local9.anInt3531, 0);
			}
			arg2.aBoolean236 = false;
		} else {
			if (arg3 == 2 && local9.anInt3543 != -1) {
				if (arg0 < 0 && local9.anInt3547 != -1) {
					local18.method8964(local9.anInt3547, 0);
				} else if (arg0 <= 0 || local9.anInt3548 == -1) {
					local18.method8964(local9.anInt3543, 0);
				} else {
					local18.method8964(local9.anInt3548, 0);
				}
			} else if (arg3 == 0 && local9.anInt3562 != -1) {
				if (arg0 < 0 && local9.anInt3552 != -1) {
					local18.method8964(local9.anInt3552, 0);
				} else if (arg0 <= 0 || local9.anInt3539 == -1) {
					local18.method8964(local9.anInt3562, 0);
				} else {
					local18.method8964(local9.anInt3539, 0);
				}
			} else if (arg0 < 0 && local9.anInt3518 != -1) {
				local18.method8964(local9.anInt3518, 0);
			} else if (arg0 <= 0 || local9.anInt3522 == -1) {
				local18.method8964(local9.anInt3531, 0);
			} else {
				local18.method8964(local9.anInt3522, 0);
			}
			arg2.aBoolean236 = false;
		}
	}
}

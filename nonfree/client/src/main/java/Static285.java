import jaggl.OpenGL;
import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!jq", name = "D", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet5;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IZLjava/lang/String;Lclient!kv;)Lclient!lv;")
	public static Class227 method3923(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class143_Sub2 arg2) {
		@Pc(11) long local11 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local11, arg1);
		OpenGL.glCompileShaderARB(local11);
		OpenGL.glGetObjectParameterivARB(local11, 35713, Static57.anIntArray56, 0);
		if (Static57.anIntArray56[0] == 0) {
			if (Static57.anIntArray56[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local11, 35716, Static57.anIntArray56, 1);
			if (Static57.anIntArray56[1] > 1) {
				@Pc(47) byte[] local47 = new byte[Static57.anIntArray56[1]];
				OpenGL.glGetInfoLogARB(local11, Static57.anIntArray56[1], Static57.anIntArray56, 0, local47, 0);
				System.out.println(new String(local47));
			}
			if (Static57.anIntArray56[0] == 0) {
				OpenGL.glDeleteObjectARB(local11);
				return null;
			}
		}
		return new Class227(arg2, local11, arg0);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method3924(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < Static529.anInt8750; local9++) {
			if (arg0.equalsIgnoreCase(Static562.aStringArray36[local9])) {
				return local9;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIIILclient!mja;IIZ)Z")
	public static boolean method3925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class234 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(5) int local5 = arg5;
		@Pc(7) int local7 = arg0;
		@Pc(16) int local16 = arg5 - 64;
		@Pc(21) int local21 = arg0 - 64;
		Static435.anIntArrayArray55[64][64] = 99;
		Static507.anIntArrayArray69[64][64] = 0;
		@Pc(40) byte local40 = 0;
		@Pc(42) int local42 = 0;
		Static3.anIntArray1[0] = arg5;
		@Pc(49) int local49 = local40 + 1;
		Static110.anIntArray104[0] = arg0;
		@Pc(54) int[][] local54 = arg7.anIntArrayArray50;
		while (local42 != local49) {
			local5 = Static3.anIntArray1[local42];
			local7 = Static110.anIntArray104[local42];
			@Pc(69) int local69 = local7 - arg7.anInt6490;
			@Pc(74) int local74 = local7 - local21;
			@Pc(79) int local79 = local5 - local16;
			local42 = local42 + 1 & 0xFFF;
			@Pc(91) int local91 = local5 - arg7.anInt6497;
			if (arg9 == -4) {
				if (local5 == arg4 && arg2 == local7) {
					Static29.anInt404 = local5;
					Static498.anInt8492 = local7;
					return true;
				}
			} else if (arg9 == -3) {
				if (Static329.method5103(1, 1, arg1, local7, arg3, arg4, arg2, local5)) {
					Static29.anInt404 = local5;
					Static498.anInt8492 = local7;
					return true;
				}
			} else if (arg9 == -2) {
				if (arg7.method5442(arg4, arg1, 1, local5, arg3, arg2, 1, arg6, local7)) {
					Static29.anInt404 = local5;
					Static498.anInt8492 = local7;
					return true;
				}
			} else if (arg9 == -1) {
				if (arg7.method5457(arg2, arg1, local7, 1, arg6, arg3, arg4, local5)) {
					Static29.anInt404 = local5;
					Static498.anInt8492 = local7;
					return true;
				}
			} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
				if (arg7.method5455(1, arg9, arg8, local5, local7, arg4, arg2)) {
					Static498.anInt8492 = local7;
					Static29.anInt404 = local5;
					return true;
				}
			} else if (arg7.method5446(arg8, arg9, arg2, arg4, 1, local5, local7)) {
				Static29.anInt404 = local5;
				Static498.anInt8492 = local7;
				return true;
			}
			@Pc(236) int local236 = Static507.anIntArrayArray69[local79][local74] + 1;
			if (local79 > 0 && Static435.anIntArrayArray55[local79 - 1][local74] == 0 && (local54[local91 - 1][local69] & 0x42240000) == 0) {
				Static3.anIntArray1[local49] = local5 - 1;
				Static110.anIntArray104[local49] = local7;
				Static435.anIntArrayArray55[local79 - 1][local74] = 2;
				local49 = local49 + 1 & 0xFFF;
				Static507.anIntArrayArray69[local79 - 1][local74] = local236;
			}
			if (local79 < 127 && Static435.anIntArrayArray55[local79 + 1][local74] == 0 && (local54[local91 + 1][local69] & 0x60240000) == 0) {
				Static3.anIntArray1[local49] = local5 + 1;
				Static110.anIntArray104[local49] = local7;
				Static435.anIntArrayArray55[local79 + 1][local74] = 8;
				local49 = local49 + 1 & 0xFFF;
				Static507.anIntArrayArray69[local79 + 1][local74] = local236;
			}
			if (local74 > 0 && Static435.anIntArrayArray55[local79][local74 - 1] == 0 && (local54[local91][local69 - 1] & 0x40A40000) == 0) {
				Static3.anIntArray1[local49] = local5;
				Static110.anIntArray104[local49] = local7 - 1;
				local49 = local49 + 1 & 0xFFF;
				Static435.anIntArrayArray55[local79][local74 - 1] = 1;
				Static507.anIntArrayArray69[local79][local74 - 1] = local236;
			}
			if (local74 < 127 && Static435.anIntArrayArray55[local79][local74 + 1] == 0 && (local54[local91][local69 + 1] & 0x48240000) == 0) {
				Static3.anIntArray1[local49] = local5;
				Static110.anIntArray104[local49] = local7 + 1;
				local49 = local49 + 1 & 0xFFF;
				Static435.anIntArrayArray55[local79][local74 + 1] = 4;
				Static507.anIntArrayArray69[local79][local74 + 1] = local236;
			}
			if (local79 > 0 && local74 > 0 && Static435.anIntArrayArray55[local79 - 1][local74 - 1] == 0 && (local54[local91 - 1][local69 - 1] & 0x43A40000) == 0 && (local54[local91 - 1][local69] & 0x42240000) == 0 && (local54[local91][local69 - 1] & 0x40A40000) == 0) {
				Static3.anIntArray1[local49] = local5 - 1;
				Static110.anIntArray104[local49] = local7 - 1;
				Static435.anIntArrayArray55[local79 - 1][local74 - 1] = 3;
				local49 = local49 + 1 & 0xFFF;
				Static507.anIntArrayArray69[local79 - 1][local74 - 1] = local236;
			}
			if (local79 < 127 && local74 > 0 && Static435.anIntArrayArray55[local79 + 1][local74 - 1] == 0 && (local54[local91 + 1][local69 - 1] & 0x60E40000) == 0 && (local54[local91 + 1][local69] & 0x60240000) == 0 && (local54[local91][local69 - 1] & 0x40A40000) == 0) {
				Static3.anIntArray1[local49] = local5 + 1;
				Static110.anIntArray104[local49] = local7 - 1;
				local49 = local49 + 1 & 0xFFF;
				Static435.anIntArrayArray55[local79 + 1][local74 - 1] = 9;
				Static507.anIntArrayArray69[local79 + 1][local74 - 1] = local236;
			}
			if (local79 > 0 && local74 < 127 && Static435.anIntArrayArray55[local79 - 1][local74 + 1] == 0 && (local54[local91 - 1][local69 + 1] & 0x4E240000) == 0 && (local54[local91 - 1][local69] & 0x42240000) == 0 && (local54[local91][local69 + 1] & 0x48240000) == 0) {
				Static3.anIntArray1[local49] = local5 - 1;
				Static110.anIntArray104[local49] = local7 + 1;
				local49 = local49 + 1 & 0xFFF;
				Static435.anIntArrayArray55[local79 - 1][local74 + 1] = 6;
				Static507.anIntArrayArray69[local79 - 1][local74 + 1] = local236;
			}
			if (local79 < 127 && local74 < 127 && Static435.anIntArrayArray55[local79 + 1][local74 + 1] == 0 && (local54[local91 + 1][local69 + 1] & 0x78240000) == 0 && (local54[local91 + 1][local69] & 0x60240000) == 0 && (local54[local91][local69 + 1] & 0x48240000) == 0) {
				Static3.anIntArray1[local49] = local5 + 1;
				Static110.anIntArray104[local49] = local7 + 1;
				Static435.anIntArrayArray55[local79 + 1][local74 + 1] = 12;
				local49 = local49 + 1 & 0xFFF;
				Static507.anIntArrayArray69[local79 + 1][local74 + 1] = local236;
			}
		}
		Static498.anInt8492 = local7;
		Static29.anInt404 = local5;
		return false;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!rv;)Lclient!bu;")
	public static Class47_Sub1 method3926(@OriginalArg(1) Class5_Sub15 arg0) {
		return new Class47_Sub1(arg0.method3638(), arg0.method3638(), arg0.method3638(), arg0.method3638(), arg0.method3638(), arg0.method3638(), arg0.method3638(), arg0.method3638(), arg0.method3633(), arg0.method3642());
	}
}

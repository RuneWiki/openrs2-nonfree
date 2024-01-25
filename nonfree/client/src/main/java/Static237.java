import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "Lclient!ok;")
	public static Class178 aClass178_68;

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
	public static int anInt4069 = -1;

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "Lclient!fr;")
	public static final Class85 aClass85_26 = new Class85();

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "[I")
	public static final int[] anIntArray357 = new int[32];

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
	public static int anInt4073 = 0;

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
	public static int anInt4076 = 0;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method3231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 0 || arg6 < 0 || arg2 >= Static333.anInt3375 - 1 || Static102.anInt2086 - 1 <= arg6) {
			return;
		}
		if (Static19.aClass223ArrayArrayArray1 == null) {
			return;
		}
		@Pc(53) Interface5 local53;
		if (arg4 == 0) {
			local53 = (Interface5) Static184.method2673(arg1, arg2, arg6);
			@Pc(59) Interface5 local59 = (Interface5) Static214.method2092(arg1, arg2, arg6);
			if (local53 != null && arg3 != 2) {
				if (local53 instanceof Class26_Sub3_Sub2) {
					((Class26_Sub3_Sub2) local53).aClass66_3.method1628(arg0);
				} else {
					Static172.method2495(local53.method5731(), arg6, arg1, arg0, arg5, arg3, arg4, arg2);
				}
			}
			if (local59 != null) {
				if (local59 instanceof Class26_Sub3_Sub2) {
					((Class26_Sub3_Sub2) local59).aClass66_3.method1628(arg0);
					return;
				}
				Static172.method2495(local59.method5731(), arg6, arg1, arg0, arg5, arg3, arg4, arg2);
				return;
			}
			return;
		}
		if (arg4 == 1) {
			local53 = (Interface5) Static178.method2592(arg1, arg2, arg6);
			if (local53 != null) {
				if (!(local53 instanceof Class26_Sub1_Sub2)) {
					@Pc(132) int local132 = local53.method5731();
					if (arg3 != 4 && arg3 != 5) {
						if (arg3 == 6) {
							Static172.method2495(local132, arg6, arg1, arg0, arg5 + 4, 4, arg4, arg2);
							return;
						}
						if (arg3 == 7) {
							Static172.method2495(local132, arg6, arg1, arg0, (arg5 + 2 & 0x3) + 4, 4, arg4, arg2);
						} else if (arg3 == 8) {
							Static172.method2495(local132, arg6, arg1, arg0, arg5 + 4, 4, arg4, arg2);
							Static172.method2495(local132, arg6, arg1, arg0, (arg5 + 2 & 0x3) + 4, 4, arg4, arg2);
							return;
						}
						return;
					}
					Static172.method2495(local132, arg6, arg1, arg0, arg5, 4, arg4, arg2);
					return;
				}
				((Class26_Sub1_Sub2) local53).aClass66_1.method1628(arg0);
				return;
			}
			return;
		}
		if (arg4 != 2) {
			if (arg4 == 3) {
				local53 = (Interface5) Static339.method4422(arg1, arg2, arg6);
				if (local53 != null) {
					if (local53 instanceof Class26_Sub4_Sub3) {
						((Class26_Sub4_Sub3) local53).aClass66_4.method1628(arg0);
						return;
					}
					Static172.method2495(local53.method5731(), arg6, arg1, arg0, arg5, arg3, arg4, arg2);
					return;
				}
			}
			return;
		}
		local53 = (Interface5) Static14.method152(arg1, arg2, arg6, gf.class);
		if (local53 == null) {
			return;
		}
		if (arg3 == 11) {
			arg3 = 10;
		}
		if (!(local53 instanceof Class26_Sub2_Sub2)) {
			Static172.method2495(local53.method5731(), arg6, arg1, arg0, arg5, arg3, arg4, arg2);
			return;
		}
		((Class26_Sub2_Sub2) local53).aClass66_2.method1628(arg0);
		return;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IFIILclient!sh;IBF[BFIFIF)V")
	public static void method3232(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class72 arg2, @OriginalArg(7) float arg3, @OriginalArg(8) byte[] arg4, @OriginalArg(9) float arg5, @OriginalArg(10) int arg6, @OriginalArg(11) float arg7, @OriginalArg(13) float arg8) {
		@Pc(17) float[] local17 = new float[16384];
		@Pc(47) int local47;
		@Pc(57) int local57;
		for (@Pc(19) int local19 = 0; local19 < 8; local19++) {
			arg2.method1718(arg7 * 127.0F, local17, arg8 / (float) 128, arg0 / (float) 128, 0, arg5 / (float) 16, arg1);
			local47 = arg6;
			arg5 *= 2.0F;
			arg7 *= arg3;
			for (local57 = 0; local57 < 16384; local57++) {
				arg4[local47] = (byte) ((float) arg4[local47] + local17[local57]);
				local47++;
			}
			arg0 *= 2.0F;
			arg8 *= 2.0F;
		}
		local47 = arg6;
		for (local57 = 0; local57 < 16384; local57++) {
			arg4[local47] -= -127;
			local47++;
		}
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V")
	public static void method3233() {
		Static258.aClass155_5.method3346();
		Static76.aClass233_3.method4851();
		Static430.aClass162_2.method3438();
		Static411.aClass142_4.method3147();
		Static442.aClass98_1.method2236();
		Static259.aClass206_2.method4327();
		Static364.aClass151_2.method3288();
		Static79.aClass231_1.method4832();
		Static446.aClass53_1.method1179();
		Static172.aClass123_1.method2741();
		Static223.aClass154_1.method3336();
		Static106.aClass62_3.method1482();
		Static351.aClass176_4.method3714();
		Static443.aClass193_4.method4067();
		Static138.aClass122_1.method2722();
		Static439.aClass255_1.method5276();
		Static411.aClass217_1.method4451();
		Static230.aClass152_1.method3297();
		Static23.aClass29_1.method518();
		Static109.aClass18_1.method207();
		Static24.method254();
		Static110.method1910();
		Static393.method4994();
		Static419.method5250();
		Static87.aClass126_16.method2828(5);
		Static343.aClass126_51.method2828(5);
		Static322.aClass126_44.method2828(5);
		Static270.aClass126_38.method2828(5);
		Static159.aClass126_23.method2828(5);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZF)F")
	public static float method3234(@OriginalArg(1) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)V")
	public static void method3235() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static333.anInt3375; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static102.anInt2086; local13++) {
				if (Static9.method48(local13, local7, true, Static19.aClass223ArrayArrayArray1, local9)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IILjava/lang/String;Lclient!vd;)Lclient!rv;")
	public static Class225 method3236(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class51_Sub2 arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local6, arg1);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static189.anIntArray488, 0);
		if (Static189.anIntArray488[0] == 0) {
			if (Static189.anIntArray488[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static189.anIntArray488, 1);
			if (Static189.anIntArray488[1] > 1) {
				@Pc(50) byte[] local50 = new byte[Static189.anIntArray488[1]];
				OpenGL.glGetInfoLogARB(local6, Static189.anIntArray488[1], Static189.anIntArray488, 0, local50, 0);
				System.out.println(new String(local50));
			}
			if (Static189.anIntArray488[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class225(arg2, local6, arg0);
	}
}

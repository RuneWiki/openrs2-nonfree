import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "[Lclient!ps;")
	public static Class277[] aClass277Array1;

	@OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
	public static int anInt5915;

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "Z")
	public static boolean aBoolean428 = false;

	@OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
	public static int anInt5917 = 0;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!om;[BII)Lclient!he;")
	public static Class137 method5267(@OriginalArg(0) Class133_Sub1_Sub2 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static568.anIntArray526, 0);
		if (Static568.anIntArray526[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class137(arg0, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(II)I")
	public static int method5269(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)I")
	public static int method5270() {
		if (Static142.aBoolean190) {
			return 6;
		} else if (Static12.aClass5_Sub5_Sub15_1 == null) {
			return 0;
		} else {
			@Pc(19) int local19 = Static12.aClass5_Sub5_Sub15_1.anInt6765;
			if (Static157.method2277(local19)) {
				return 1;
			} else if (Static155.method1877(local19)) {
				return 2;
			} else if (Static327.method4978(local19)) {
				return 3;
			} else if (Static390.method5792(local19)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIB)V")
	public static void method5271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) Class5_Sub5_Sub21 local17 = Static101.method1629(15, 0);
		local17.method8958();
		local17.anInt10537 = arg0;
		local17.anInt10530 = arg1;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIIILclient!ha;III)V")
	public static void method5272(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class133 arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		arg2.method7251(arg3, arg1, -10660793, arg0, arg4);
		arg2.method7251(arg3 - 2, 16, -16777216, arg0 + 1, arg4 + 1);
		arg2.method7243(arg4 + 1, -16777216, -19 + arg1, arg0 + 18, arg3 + -2);
	}
}

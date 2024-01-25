import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!np", name = "i", descriptor = "Lclient!lda;")
	public static final Class225 aClass225_9 = new Class225(7, 0, 1, 1);

	@OriginalMember(owner = "client!np", name = "e", descriptor = "I")
	public static int anInt7611 = -1;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IB)V")
	public static void method6370(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		Static407.anInt7261 = -1;
		if (arg1 == -20) {
			Static442.anInt10084 = arg0;
			Static407.anInt7261 = -1;
			Static276.method4222(arg1 + 20);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V")
	public static void method6372(@OriginalArg(0) byte arg0) {
		if (arg0 != 70) {
			anInt7611 = -106;
		}
		Static638.method8657(12);
		Static681.method8987(arg0 - 67);
		System.gc();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "([B[BIIIIBII)V")
	public static void method6373(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(18) int local18 = -arg7; local18 < 0; local18++) {
			@Pc(28) int local28;
			for (@Pc(24) int local24 = local10; local24 < 0; local24++) {
				local28 = arg5++;
				arg0[local28] += arg1[arg4++];
				@Pc(40) int local40 = arg5++;
				arg0[local40] += arg1[arg4++];
				@Pc(52) int local52 = arg5++;
				arg0[local52] += arg1[arg4++];
				@Pc(64) int local64 = arg5++;
				arg0[local64] += arg1[arg4++];
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local28 = arg5++;
				arg0[local28] += arg1[arg4++];
			}
			arg4 += arg2;
			arg5 += arg6;
		}
		if (-95 != -95) {
			method6370(14, (byte) 37);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!gia;I[Lclient!gda;)Lclient!ima;")
	public static Class175 method6374(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class127[] arg2) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			if (arg2[local7] == null || arg2[local7].aLong127 <= 0L) {
				return null;
			}
		}
		if (arg1 > -60) {
			method6372((byte) 45);
		}
		@Pc(49) long local49 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(51) int local51 = 0; local51 < arg2.length; local51++) {
			OpenGL.glAttachObjectARB(local49, arg2[local51].aLong127);
		}
		OpenGL.glLinkProgramARB(local49);
		OpenGL.glGetObjectParameterivARB(local49, 35714, Static462.anIntArray435, 0);
		if (Static462.anIntArray435[0] == 0) {
			if (Static462.anIntArray435[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local49, 35716, Static462.anIntArray435, 1);
			if (Static462.anIntArray435[1] > 1) {
				@Pc(109) byte[] local109 = new byte[Static462.anIntArray435[1]];
				OpenGL.glGetInfoLogARB(local49, Static462.anIntArray435[1], Static462.anIntArray435, 0, local109, 0);
				System.out.println(new String(local109));
			}
			if (Static462.anIntArray435[0] == 0) {
				for (@Pc(130) int local130 = 0; local130 < arg2.length; local130++) {
					OpenGL.glDetachObjectARB(local49, arg2[local130].aLong127);
				}
				OpenGL.glDeleteObjectARB(local49);
				return null;
			}
		}
		return new Class175(arg0, local49, arg2);
	}
}

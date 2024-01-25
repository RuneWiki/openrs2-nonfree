import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!jq", name = "N", descriptor = "Lclient!tf;")
	public static Class322 aClass322_128;

	@OriginalMember(owner = "client!jq", name = "B", descriptor = "[F")
	public static final float[] aFloatArray80 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!jq", name = "K", descriptor = "[I")
	public static final int[] anIntArray469 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!jq", name = "O", descriptor = "[F")
	public static final float[] aFloatArray81 = new float[4];

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Lclient!wd;")
	public static Class358 method6205(@OriginalArg(1) int arg0) {
		@Pc(8) Class358[] local8 = Static561.method2428();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].anInt9317 == arg0) {
				return local8[local10];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "([BZZ)Ljava/lang/Object;")
	public static Object method6206(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static284.aBoolean353) {
			try {
				@Pc(25) Class175 local25 = (Class175) Class.forName("Class175_Sub1").getDeclaredConstructor().newInstance();
				local25.method4131(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static284.aBoolean353 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IILclient!r;III[[[BIIIIII)V")
	public static void method6208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class45 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[][][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg11 == 0 || arg8 == 0) {
			return;
		}
		if (arg11 == 9) {
			arg4 = arg4 + 1 & 0x3;
			arg11 = 1;
		}
		if (arg11 == 10) {
			arg11 = 1;
			arg4 = arg4 + 3 & 0x3;
		}
		if (arg11 == 11) {
			arg11 = 8;
			arg4 = arg4 + 3 & 0x3;
		}
		arg2.IA(arg10, arg5, arg3, arg9, arg1, arg7, arg6[arg11 - 1][arg4], arg8, arg0);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIZ)V")
	public static void method6209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class344 local9 = Static554.aClass344ArrayArray1[arg1][arg0];
		Static396.method5779(local9 == null ? Static429.aClass344_2 : local9, arg2);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I[BILclient!mr;)Lclient!iea;")
	public static Class143 method6210(@OriginalArg(1) byte[] arg0, @OriginalArg(3) Class45_Sub2_Sub2 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static68.anIntArray69, 0);
		if (Static68.anIntArray69[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class143(arg1, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}

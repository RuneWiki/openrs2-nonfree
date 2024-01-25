import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!uga", name = "m", descriptor = "J")
	public static long aLong241;

	@OriginalMember(owner = "client!uga", name = "p", descriptor = "[I")
	public static int[] anIntArray650;

	@OriginalMember(owner = "client!uga", name = "g", descriptor = "I")
	public static int anInt8851 = -60;

	@OriginalMember(owner = "client!uga", name = "l", descriptor = "I")
	public static int anInt8855 = 0;

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(BII)Z")
	public static boolean method7247(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIII[BII[BI)V")
	public static void method7248(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg5 >> 2);
		@Pc(15) int local15 = -(arg5 & 0x3);
		for (@Pc(21) int local21 = -arg7; local21 < 0; local21++) {
			@Pc(29) int local29;
			for (@Pc(25) int local25 = local10; local25 < 0; local25++) {
				local29 = arg4++;
				arg6[local29] += arg3[arg0++];
				@Pc(41) int local41 = arg4++;
				arg6[local41] += arg3[arg0++];
				@Pc(53) int local53 = arg4++;
				arg6[local53] += arg3[arg0++];
				@Pc(65) int local65 = arg4++;
				arg6[local65] += arg3[arg0++];
			}
			for (@Pc(83) int local83 = local15; local83 < 0; local83++) {
				local29 = arg4++;
				arg6[local29] += arg3[arg0++];
			}
			arg0 += arg2;
			arg4 += arg1;
		}
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(BII)V")
	public static void method7249(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class6_Sub31 local12 = Static114.method2007(Static564.aClass47_147, Static337.aClass324_1);
		local12.aClass6_Sub21_Sub2_2.method6061(arg1);
		local12.aClass6_Sub21_Sub2_2.method6039(arg0);
		method7251(local12);
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(BLclient!mc;)V")
	public static void method7251(@OriginalArg(1) Class6_Sub31 arg0) {
		Static585.aClass361_70.method7833(arg0);
		arg0.anInt5591 = arg0.aClass6_Sub21_Sub2_2.anInt7338;
		arg0.aClass6_Sub21_Sub2_2.anInt7338 = 0;
		Static249.anInt4924 += arg0.anInt5591;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(III)I")
	public static int method7252(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static312.anIntArray426[arg0 & 0x3] : Static173.anIntArray215[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(ILclient!jaa;Ljava/lang/String;Z)Lclient!fb;")
	public static Class88 method7253(@OriginalArg(1) Class14_Sub3 arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local10);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static255.anIntArray379, 0);
		if (Static255.anIntArray379[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class88(arg0, 34336, local10);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}

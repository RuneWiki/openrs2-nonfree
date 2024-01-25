import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!sp", name = "z", descriptor = "I")
	public static int anInt8128;

	@OriginalMember(owner = "client!sp", name = "B", descriptor = "Ljava/lang/Object;")
	public static Object anObject19;

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "[I")
	public static int[] anIntArray623 = new int[1];

	@OriginalMember(owner = "client!sp", name = "y", descriptor = "[[I")
	public static final int[][] anIntArrayArray178 = new int[6][];

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V")
	public static void method6528() {
		Static577.aClass222_64.method4422();
		Static208.aClass222_25.method4422();
		Static143.aClass222_15.method4422();
		Static363.aClass222_37.method4422();
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V")
	public static void method6529() {
		Static327.aClass45_1.method7468();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static99.aLongArray18[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static242.aLongArray14[local22] = 0L;
		}
		Static205.anInt9211 = 0;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!ok;BILjava/lang/String;)Lclient!jea;")
	public static Class169 method6531(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(3) String arg1) {
		@Pc(13) int local13 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local13);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static212.anIntArray330, 0);
		if (Static212.anIntArray330[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class169(arg0, 34336, local13);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(III)Z")
	public static boolean method6535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIBI[B)Z")
	public static boolean method6536(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(9) int local9 = arg1 % 8;
		@Pc(19) int local19;
		if (local9 == 0) {
			local19 = 0;
		} else {
			local19 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg0 + 8 - 1) / 8);
		@Pc(41) int local41 = -((arg1 + 8 - 1) / 8);
		for (@Pc(51) int local51 = local32; local51 < 0; local51++) {
			for (@Pc(55) int local55 = local41; local55 < 0; local55++) {
				if (arg4[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local19;
			if (arg4[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg2;
		}
		return false;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)Z")
	public static boolean method6541(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}
}

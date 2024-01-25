import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!rt", name = "l", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_78 = new Class243(31, 7);

	@OriginalMember(owner = "client!rt", name = "w", descriptor = "Z")
	public static boolean aBoolean578 = false;

	@OriginalMember(owner = "client!rt", name = "z", descriptor = "[I")
	public static final int[] anIntArray601 = new int[1];

	@OriginalMember(owner = "client!rt", name = "B", descriptor = "Z")
	public static boolean aBoolean579 = false;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I[Lclient!vt;Lclient!os;)Lclient!dca;")
	public static Class51 method6568(@OriginalArg(1) Class305[] arg0, @OriginalArg(2) Class39_Sub3 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong231 <= 0L) {
				return null;
			}
		}
		@Pc(40) long local40 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(42) int local42 = 0; local42 < arg0.length; local42++) {
			OpenGL.glAttachObjectARB(local40, arg0[local42].aLong231);
		}
		OpenGL.glLinkProgramARB(local40);
		OpenGL.glGetObjectParameterivARB(local40, 35714, Static220.anIntArray405, 0);
		if (Static220.anIntArray405[0] == 0) {
			if (Static220.anIntArray405[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local40, 35716, Static220.anIntArray405, 1);
			if (Static220.anIntArray405[1] > 1) {
				@Pc(90) byte[] local90 = new byte[Static220.anIntArray405[1]];
				OpenGL.glGetInfoLogARB(local40, Static220.anIntArray405[1], Static220.anIntArray405, 0, local90, 0);
				System.out.println(new String(local90));
			}
			if (Static220.anIntArray405[0] == 0) {
				for (@Pc(111) int local111 = 0; local111 < arg0.length; local111++) {
					OpenGL.glDetachObjectARB(local40, arg0[local111].aLong231);
				}
				OpenGL.glDeleteObjectARB(local40);
				return null;
			}
		}
		return new Class51(arg1, local40, arg0);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZILclient!ha;ILclient!wca;ILclient!pa;)V")
	public static void method6571(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class35 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class310 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class209 arg6) {
		if (arg2 == null) {
			return;
		}
		@Pc(17) int local17;
		if (Static427.anInt7875 == 4) {
			local17 = (int) Static161.aFloat56 & 0x3FFF;
		} else {
			local17 = (int) Static161.aFloat56 + Static87.anInt1767 & 0x3FFF;
		}
		@Pc(36) int local36 = Math.max(arg4.anInt9163 / 2, arg4.anInt9198 / 2) + 10;
		@Pc(44) int local44 = arg0 * arg0 + arg3 * arg3;
		if (local44 > local36 * local36) {
			return;
		}
		@Pc(58) int local58 = Class125.anIntArray381[local17];
		@Pc(62) int local62 = Class125.anIntArray382[local17];
		if (Static427.anInt7875 != 4) {
			local62 = local62 * 256 / (Static3.anInt111 + 256);
			local58 = local58 * 256 / (Static3.anInt111 + 256);
		}
		@Pc(97) int local97 = arg3 * local62 + local58 * arg0 >> 15;
		@Pc(108) int local108 = arg0 * local62 - local58 * arg3 >> 15;
		arg2.method7345(arg4.anInt9163 / 2 + arg1 + local97 - arg2.EA() / 2, arg5 - (-(arg4.anInt9198 / 2) + local108) + -(arg2.ma() / 2), arg6, arg1, arg5);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIIII)Z")
	public static boolean method6572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static267.aByteArrayArrayArray19[0][arg0][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static267.aByteArrayArrayArray19[arg1][arg0][arg2] & 0x10) == 0) {
			return Static283.method4504(arg1, arg2, arg0) == arg3;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)I")
	public static int method6573(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}

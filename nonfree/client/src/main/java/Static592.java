import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "[I")
	public static int[] anIntArray540;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "Lclient!em;")
	public static Class6_Sub5_Sub9 aClass6_Sub5_Sub9_4;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
	public static int anInt10005 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V")
	public static void method8154(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub5_Sub19 local8 = Static348.method5721(arg0, 2);
		local8.method5174();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ICB)I")
	public static int method8155(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		@Pc(12) int local12 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			@Pc(21) char local21 = Character.toLowerCase(arg1);
			local12 = (local21 << 4) + 1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!ac;ILjava/lang/String;)Lclient!ne;")
	public static Class218 method8156(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(3) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static23.anIntArray21, 0);
		if (Static23.anIntArray21[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class218(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!as", name = "k", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_28 = new Class123(69, 3);

	@OriginalMember(owner = "client!as", name = "l", descriptor = "Lclient!tq;")
	public static final Class238 aClass238_4 = new Class238(11, 7);

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
	public static void method470() {
		if (Static305.aBoolean347) {
			return;
		}
		Static65.aBoolean151 = true;
		if (Static291.aClass28_Sub1_1.aBoolean85) {
			Static165.aFloat28 = (int) Static165.aFloat28 - 17 & 0xFFFFFFF0;
		} else {
			Static408.aFloat98 += (-Static408.aFloat98 - 12.0F) / 2.0F;
		}
		Static305.aBoolean347 = true;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method471(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static88.method4151(arg7)) {
			if (Static373.aClass239ArrayArray2[arg7] == null) {
				Static415.method6099(arg6, -1, arg0, Static35.aClass239ArrayArray1[arg7], arg2, arg5, arg3, arg4, arg1);
			} else {
				Static415.method6099(arg6, -1, arg0, Static373.aClass239ArrayArray2[arg7], arg2, arg5, arg3, arg4, arg1);
			}
		} else if (arg3 == -1) {
			for (@Pc(23) int local23 = 0; local23 < 100; local23++) {
				Static180.aBooleanArray8[local23] = true;
			}
		} else {
			Static180.aBooleanArray8[arg3] = true;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILjava/lang/String;ILclient!rl;)Lclient!th;")
	public static Class233 method473(@OriginalArg(1) String arg0, @OriginalArg(3) Class66_Sub2 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static93.anIntArray121, 0);
		if (Static93.anIntArray121[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class233(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}

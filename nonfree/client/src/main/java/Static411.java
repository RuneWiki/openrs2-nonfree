import jaggl.OpenGL;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!om", name = "r", descriptor = "Z")
	public static boolean aBoolean570;

	@OriginalMember(owner = "client!om", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!om", name = "G", descriptor = "[Lclient!ro;")
	public static final Class3_Sub7_Sub18[] aClass3_Sub7_Sub18Array4 = new Class3_Sub7_Sub18[14];

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIB)Z")
	public static boolean method6900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
	public static void method6902() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static259.anInt5056 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILjava/lang/String;Lclient!dw;I)Lclient!am;")
	public static Class16 method6903(@OriginalArg(1) String arg0, @OriginalArg(2) Class82_Sub1 arg1) {
		@Pc(10) int local10 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local10);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static273.anIntArray293, 0);
		if (Static273.anIntArray293[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class16(arg1, 34336, local10);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}

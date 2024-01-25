import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ega", name = "p", descriptor = "I")
	public static int anInt2200 = 0;

	@OriginalMember(owner = "client!ega", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray6 = new String[200];

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/lang/String;IILclient!kv;)Lclient!iu;")
	public static Class173 method1999(@OriginalArg(0) String arg0, @OriginalArg(3) Class143_Sub2 arg1) {
		@Pc(10) int local10 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local10);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static518.anIntArray508, 0);
		if (Static518.anIntArray508[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class173(arg1, 34336, local10);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Z[Ljava/lang/String;)V")
	public static void method2000(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static505.aString91 = Static505.aString91 + arg0[0];
			Static124.anInt2153 += arg0[0].length();
			return;
		}
		for (@Pc(35) int local35 = 0; local35 < arg0.length; local35++) {
			if (arg0[local35].startsWith("pause")) {
				@Pc(52) int local52 = 5;
				try {
					local52 = Integer.parseInt(arg0[local35].substring(6));
				} catch (@Pc(61) Exception local61) {
				}
				Static611.method8213("Pausing for " + local52 + " seconds...");
				Static257.aStringArray16 = arg0;
				Static137.anInt2276 = local35 + 1;
				Static602.aLong301 = (long) (local52 * 1000) + Static124.method1947();
				return;
			}
			Static505.aString91 = arg0[local35];
			Static87.method1316(false);
		}
	}
}

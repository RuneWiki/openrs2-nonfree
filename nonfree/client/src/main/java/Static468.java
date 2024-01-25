import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!sk", name = "w", descriptor = "[I")
	public static int[] anIntArray723;

	@OriginalMember(owner = "client!sk", name = "E", descriptor = "Lclient!ta;")
	public static Class73 aClass73_4;

	@OriginalMember(owner = "client!sk", name = "L", descriptor = "I")
	public static int anInt8642;

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "(I)V")
	public static void method7217() {
		@Pc(8) Class6_Sub39 local8 = (Class6_Sub39) Static512.aClass211_67.method5183();
		@Pc(19) boolean local19 = Static122.aClass93_7 != null || Static119.anInt2418 > 0;
		if (local19) {
			Static31.anInt1033 = 1;
		}
		if (Static478.aBoolean650 && Static387.aClass273_1.method6617(81) && Static205.anInt4369 > 2) {
			if (local19) {
				Static410.aClass6_Sub42_3 = (Class6_Sub42) Static207.aClass211_29.aClass6_154.aClass6_284.aClass6_284;
			} else {
				Static204.method3798((Class6_Sub42) Static207.aClass211_29.aClass6_154.aClass6_284.aClass6_284, local8.method8018(), local8.method8012());
			}
		} else if (local19) {
			Static410.aClass6_Sub42_3 = (Class6_Sub42) Static207.aClass211_29.aClass6_154.aClass6_284;
		} else {
			Static204.method3798((Class6_Sub42) Static207.aClass211_29.aClass6_154.aClass6_284, local8.method8018(), local8.method8012());
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/lang/String;ILclient!ap;)Lclient!ph;")
	public static Class248 method7218(@OriginalArg(1) String arg0, @OriginalArg(3) Class9_Sub2 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static290.anIntArray414, 0);
		if (Static290.anIntArray414[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class248(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "(I)V")
	public static void method7220() {
		if (!Static471.method7251()) {
			return;
		}
		if (Static301.aStringArray32 == null) {
			Static555.method7928();
		}
		Static302.aBoolean510 = true;
		Static352.anInt6780 = 0;
		try {
			Static64.aClipboard1 = Static363.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(20) Exception local20) {
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLclient!ep;)V")
	public static void method7221(@OriginalArg(1) Class93 arg0) {
		if (Static299.anInt5681 == arg0.anInt2759) {
			Static429.aBooleanArray27[arg0.anInt2764] = true;
		}
	}
}

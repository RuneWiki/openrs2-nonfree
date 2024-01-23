import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static75 {

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
	public static int anInt1867;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "[S")
	public static short[] aShortArray11 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "[I")
	public static int[] anIntArray158 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray13 = new String[] { "en", "de", "fr", "pt" };

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString66 = "flash2:";

	@OriginalMember(owner = "client!fc", name = "J", descriptor = "[C")
	public static char[] aCharArray2 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
	public static int anInt1869 = 0;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(III)V")
	public static void method1416(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static239.aFloat51 = arg1;
		Static148.aFloat33 = arg0;
		if (Static16.anInt342 == 2) {
			Static151.anInt3328 = arg1;
			Static295.anInt5738 = arg0;
		}
		Static279.method4342();
		Static63.aBoolean100 = true;
	}
}

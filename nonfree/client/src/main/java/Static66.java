import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static66 {

	@OriginalMember(owner = "client!cea", name = "Kb", descriptor = "I")
	public static int anInt1803;

	@OriginalMember(owner = "client!cea", name = "Lb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray4;

	@OriginalMember(owner = "client!cea", name = "Hb", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[100];

	@OriginalMember(owner = "client!cea", name = "Jb", descriptor = "J")
	public static long aLong47 = 1L;

	@OriginalMember(owner = "client!cea", name = "Mb", descriptor = "I")
	public static int anInt1804 = 0;

	@OriginalMember(owner = "client!cea", name = "d", descriptor = "(III)Z")
	public static boolean method1533(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!cea", name = "g", descriptor = "(III)Z")
	public static boolean method1538(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static566.method7893(arg0, arg1) || Static591.method8346(arg1, arg0);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static414 {

	@OriginalMember(owner = "client!op", name = "a", descriptor = "I")
	public static int anInt7270;

	@OriginalMember(owner = "client!op", name = "b", descriptor = "I")
	public static int anInt7271;

	@OriginalMember(owner = "client!op", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray57 = new String[8];

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IZ)Z")
	public static boolean method6401(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
	public static void method6403(@OriginalArg(0) int arg0) {
		Static576.anInt9421 = arg0;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(III)Z")
	public static boolean method6404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x180) != 0;
	}
}

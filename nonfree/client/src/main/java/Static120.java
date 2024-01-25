import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static120 {

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "I")
	public static int anInt1894;

	@OriginalMember(owner = "client!dt", name = "h", descriptor = "Lclient!hg;")
	public static Class158 aClass158_3;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "Lclient!eba;")
	public static Class98 aClass98_2;

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "Lclient!hg;")
	public static Class158 aClass158_4;

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
	public static int anInt1905;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IB)Z")
	public static boolean method1677(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BIIII)V")
	public static void method1682(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static642.anInt10429 = 0;
		Static456.anInt7806 = arg0;
		Static604.anInt10083 = arg1;
		Static456.anInt7815 = 0;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)I")
	public static int method1683() {
		return Static554.anInt9335;
	}
}

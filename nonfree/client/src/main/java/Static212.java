import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Lclient!su;")
	public static final Class298 aClass298_207 = new Class298();

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
	public static int anInt9969 = -1;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
	public static int anInt9970 = 0;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "Lclient!hs;")
	public static final Class136 aClass136_148 = new Class136(7, 1);

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
	public static int anInt9973 = 1;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
	public static void method7945() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static297.aBooleanArray18[local7] = false;
		}
		Static119.anInt7222 = 0;
		Static89.anInt1491 = -1;
		Static478.anInt8411 = 0;
		Static140.anInt2734 = -1;
		Static60.anInt1008 = 1;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)Z")
	public static boolean method7946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}

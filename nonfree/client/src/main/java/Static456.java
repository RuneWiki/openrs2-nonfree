import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static456 {

	@OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
	public static int anInt7803 = -1;

	@OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
	public static int anInt7806 = 100;

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
	public static int anInt7813 = 0;

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
	public static int anInt7815 = 0;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BIIII)V")
	public static void method6719(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg1 >= Static642.anInt10429 && anInt7806 >= arg2 + arg1 && anInt7815 <= arg3 - arg1 && Static604.anInt10083 >= arg1 + arg3) {
			Static661.method9155(arg1, arg0, arg3, arg2);
		} else {
			Static237.method1618(arg2, arg3, arg0, arg1);
		}
	}
}

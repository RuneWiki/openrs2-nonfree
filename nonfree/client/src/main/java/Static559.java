import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static559 {

	@OriginalMember(owner = "client!sn", name = "sb", descriptor = "[I")
	public static int[] anIntArray478;

	@OriginalMember(owner = "client!sn", name = "ub", descriptor = "Lclient!d;")
	public static Interface2 anInterface2_11;

	@OriginalMember(owner = "client!sn", name = "ib", descriptor = "Lclient!qw;")
	public static final Class302 aClass302_63 = new Class302();

	@OriginalMember(owner = "client!sn", name = "ob", descriptor = "Z")
	public static boolean aBoolean634 = false;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)Z")
	public static boolean method7378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static155.method2482(arg1, arg0)) {
			return (arg0 & 0x9000) != 0 | Static258.method3864(arg0, arg1) | Static152.method8491(arg1, arg0) ? true : (arg1 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | Static131.method2235(arg1, arg0) | Static35.method721(arg0, arg1));
		} else {
			return false;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static467 {

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_252 = new Class196(78, 0);

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
	public static int anInt8128 = 4;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Z")
	public static boolean method6899(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method6904(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}
}

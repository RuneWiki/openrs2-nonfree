import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static286 {

	@OriginalMember(owner = "client!kw", name = "Db", descriptor = "Ljava/lang/Object;")
	public static Object anObject15;

	@OriginalMember(owner = "client!kw", name = "Fb", descriptor = "I")
	public static int anInt5862;

	@OriginalMember(owner = "client!kw", name = "Hb", descriptor = "I")
	public static int anInt5864 = 0;

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(III)Z")
	public static boolean method4962(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}

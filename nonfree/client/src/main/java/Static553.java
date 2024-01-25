import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static553 {

	@OriginalMember(owner = "client!uu", name = "T", descriptor = "I")
	public static int anInt9663;

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(III)Z")
	public static boolean method7584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static286.method4308(arg1, arg0) | (arg0 & 0x40000) != 0 || Static576.method7812(arg0, arg1);
	}
}

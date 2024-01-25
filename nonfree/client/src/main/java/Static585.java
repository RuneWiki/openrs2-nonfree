import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static585 {

	@OriginalMember(owner = "client!tia", name = "F", descriptor = "I")
	public static int anInt9689;

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(III)Z")
	public static boolean method8347(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static169 {

	@OriginalMember(owner = "client!gea", name = "C", descriptor = "I")
	public static int anInt9273;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZII)Z")
	public static boolean method7350(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}

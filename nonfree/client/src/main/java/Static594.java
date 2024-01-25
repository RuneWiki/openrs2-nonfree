import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static594 {

	@OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
	public static int anInt10471;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(III)Z")
	public static boolean method8740(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100100) != 0;
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(III)Z")
	public static boolean method8742(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}
}

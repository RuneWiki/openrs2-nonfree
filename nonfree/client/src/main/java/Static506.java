import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static506 {

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "Lclient!km;")
	public static Class174 aClass174_2;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Z")
	public static boolean method5540(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(CI)I")
	public static int method5545(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class340.anIntArray716.length ? Class340.anIntArray716[arg0] : -1;
	}
}

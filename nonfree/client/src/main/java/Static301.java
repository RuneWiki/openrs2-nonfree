import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static301 {

	@OriginalMember(owner = "client!ku", name = "H", descriptor = "I")
	public static int anInt5871;

	@OriginalMember(owner = "client!ku", name = "I", descriptor = "I")
	public static final int anInt5872 = 1406;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)Z")
	public static boolean method5139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}
}

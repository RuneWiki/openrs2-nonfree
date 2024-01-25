import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static371 {

	@OriginalMember(owner = "client!nn", name = "H", descriptor = "I")
	public static int anInt7077;

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(IIZ)Z")
	public static boolean method5820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}

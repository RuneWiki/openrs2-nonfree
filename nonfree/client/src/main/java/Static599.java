import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static599 {

	@OriginalMember(owner = "client!ww", name = "h", descriptor = "I")
	public static int anInt9632;

	@OriginalMember(owner = "client!ww", name = "j", descriptor = "I")
	public static int anInt9633;

	@OriginalMember(owner = "client!ww", name = "n", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_130;

	@OriginalMember(owner = "client!ww", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray44;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(III)Z")
	public static boolean method7859(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}

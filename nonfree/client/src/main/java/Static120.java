import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static120 {

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString144 = null;

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "J")
	public static long aLong269 = 20000000L;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZI)Z")
	public static boolean method8608(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}

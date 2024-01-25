import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static161 {

	@OriginalMember(owner = "client!fl", name = "t", descriptor = "Lclient!pga;")
	public static Class32 aClass32_6;

	@OriginalMember(owner = "client!fl", name = "u", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_30 = new Class208(4, 1);

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)Z")
	public static boolean method3024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}

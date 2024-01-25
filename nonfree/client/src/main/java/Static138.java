import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!gs", name = "y", descriptor = "Lclient!o;")
	public static Class6 aClass6_26;

	@OriginalMember(owner = "client!gs", name = "B", descriptor = "Z")
	public static boolean aBoolean285;

	@OriginalMember(owner = "client!gs", name = "C", descriptor = "Lclient!jb;")
	public static Class118 aClass118_1;

	@OriginalMember(owner = "client!gs", name = "E", descriptor = "Lclient!o;")
	public static Class6 aClass6_27;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IBI)I")
	public static int method2116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 24;
		@Pc(30) int local30 = (local12 * (arg1 & 0xFF00) & 0xFF0000 | local12 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(34) int local34 = 255 - local12;
		return (((arg0 & 0xFF00FF) * local34 & 0xFF00FF00 | (arg0 & 0xFF00) * local34 & 0xFF0000) >>> 8) + local30;
	}
}

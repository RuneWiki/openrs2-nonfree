import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!rca", name = "h", descriptor = "I")
	public static int anInt8474;

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_77 = new Class187(52, 4);

	@OriginalMember(owner = "client!rca", name = "f", descriptor = "I")
	public static int anInt8473 = 0;

	@OriginalMember(owner = "client!rca", name = "g", descriptor = "Lclient!rh;")
	public static final Class307 aClass307_15 = new Class307(10, 2, 2, 0);

	@OriginalMember(owner = "client!rca", name = "i", descriptor = "J")
	public static long aLong261 = 1L;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IBII)Z")
	public static boolean method7199(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Interface10 local14 = (Interface10) Static322.method5015(arg0, arg2, arg1);
		@Pc(16) boolean local16 = true;
		if (local14 != null) {
			local16 = Static78.method1206(local14) & true;
		}
		local14 = (Interface10) Static156.method2369(arg0, arg2, arg1, ija.class);
		if (local14 != null) {
			local16 &= Static78.method1206(local14);
		}
		local14 = (Interface10) Static198.method2808(arg0, arg2, arg1);
		if (local14 != null) {
			local16 &= Static78.method1206(local14);
		}
		return local16;
	}
}

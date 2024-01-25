import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ai", name = "u", descriptor = "Lclient!mm;")
	public static Class135 aClass135_1;

	@OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
	public static int anInt190;

	@OriginalMember(owner = "client!ai", name = "w", descriptor = "[I")
	public static int[] anIntArray5;

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
	public static int anInt189 = 0;

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_10 = new Class159("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_8 = new Class198(8);

	@OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
	public static final int anInt191 = -1;

	@OriginalMember(owner = "client!ai", name = "y", descriptor = "[I")
	public static int[] anIntArray6 = new int[2];

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZII)Z")
	public static boolean method185(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface7 local11 = (Interface7) Static354.method5631(arg2, arg0, arg1);
		if (local11 != null) {
			local5 = Static147.method2992(local11) & true;
		}
		local11 = (Interface7) Static347.method5528(arg2, arg0, arg1, mb.class);
		if (local11 != null) {
			local5 &= Static147.method2992(local11);
		}
		local11 = (Interface7) Static172.method3324(arg2, arg0, arg1);
		if (local11 != null) {
			local5 &= Static147.method2992(local11);
		}
		return local5;
	}
}

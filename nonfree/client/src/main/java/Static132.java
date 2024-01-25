import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
	public static int anInt2278;

	@OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
	public static int anInt2279;

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_41 = new Class237(7, 2);

	@OriginalMember(owner = "client!gk", name = "q", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_32 = new Class84("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!gk", name = "r", descriptor = "[I")
	public static final int[] anIntArray214 = new int[14];

	@OriginalMember(owner = "client!gk", name = "s", descriptor = "Lclient!of;")
	public static final Class176 aClass176_4 = new Class176("WTRC", 1);

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)Z")
	public static boolean method1899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static97.method1525(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static139.anInt2355;
			@Pc(14) int local14 = arg2 << Static139.anInt2355;
			return Static64.method1127(local10 + 1, Static92.aClass136Array1[arg0].I(arg1, arg2) + arg3, local14 + 1) && Static64.method1127(local10 + Static337.anInt7424 - 1, Static92.aClass136Array1[arg0].I(arg1 + 1, arg2) + arg3, local14 + 1) && Static64.method1127(local10 + Static337.anInt7424 - 1, Static92.aClass136Array1[arg0].I(arg1 + 1, arg2 + 1) + arg3, local14 + Static337.anInt7424 - 1) && Static64.method1127(local10 + 1, Static92.aClass136Array1[arg0].I(arg1, arg2 + 1) + arg3, local14 + Static337.anInt7424 - 1);
		} else {
			return false;
		}
	}
}

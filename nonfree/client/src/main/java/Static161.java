import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "Lclient!fs;")
	public static Class134 aClass134_21;

	@OriginalMember(owner = "client!fda", name = "e", descriptor = "Lclient!kia;")
	public static final Class201 aClass201_3 = new Class201("WTRC", "office", "_rc", 1);

	@OriginalMember(owner = "client!fda", name = "f", descriptor = "Z")
	public static boolean aBoolean202 = false;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZIII)I")
	public static int method2194(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class5_Sub48 local15 = Static507.method7441(arg1, arg0);
		if (local15 == null) {
			return -1;
		} else if (arg2 >= 0 && arg2 < local15.anIntArray523.length) {
			return local15.anIntArray523[arg2];
		} else {
			return -1;
		}
	}
}

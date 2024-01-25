import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!it", name = "s", descriptor = "Lclient!l;")
	public static Class143 aClass143_18;

	@OriginalMember(owner = "client!it", name = "e", descriptor = "Z")
	public static boolean aBoolean196 = false;

	@OriginalMember(owner = "client!it", name = "i", descriptor = "Lclient!oe;")
	public static final Class181 aClass181_30 = new Class181();

	@OriginalMember(owner = "client!it", name = "p", descriptor = "Lclient!kl;")
	public static final Class137 aClass137_8 = new Class137("WTQA", 2);

	@OriginalMember(owner = "client!it", name = "q", descriptor = "Lclient!gu;")
	public static final Class96 aClass96_20 = new Class96(512);

	@OriginalMember(owner = "client!it", name = "r", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_110 = new Class107(30, 28);

	@OriginalMember(owner = "client!it", name = "t", descriptor = "Lclient!pm;")
	public static final Class193 aClass193_1 = new Class193();

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIBI)Z")
	public static boolean method2825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(13) int local13 = arg1; local13 <= arg2; local13++) {
			for (@Pc(16) int local16 = arg3; local16 <= arg0; local16++) {
				if (Static59.anIntArrayArray10[local13][local16] == arg4 && Static409.anIntArrayArray60[local13][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}

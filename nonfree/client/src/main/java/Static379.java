import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!lja", name = "v", descriptor = "I")
	public static int anInt5859;

	@OriginalMember(owner = "client!lja", name = "q", descriptor = "I")
	public static int anInt5868;

	@OriginalMember(owner = "client!lja", name = "I", descriptor = "Lclient!qn;")
	public static final Class313 aClass313_29 = new Class313(16);

	@OriginalMember(owner = "client!lja", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString77 = null;

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(BIIII)V")
	public static void method5121(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 != 8 && arg3 != 16) {
			@Pc(28) Class364 local28 = Static448.aClass364ArrayArrayArray2[arg0][arg1][arg2];
			if (local28 != null) {
				if (arg3 == 1) {
					local28.aShort101 = 0;
				} else if (arg3 == 2) {
					local28.aShort102 = 0;
				}
			}
			Static175.method2821();
			return;
		}
		for (@Pc(57) int local57 = 0; local57 < Static340.anInt5461; local57++) {
			@Pc(63) Class108 local63 = Static131.aClass108Array4[local57];
			if (local63.aByte57 == arg3 && local63.aShort45 == arg1 && arg2 == local63.aShort46 || local63.aShort48 == arg1 && local63.aShort46 == arg2) {
				if (local57 != Static340.anInt5461) {
					Static732.method6316(Static131.aClass108Array4, local57 + 1, Static131.aClass108Array4, local57, Static131.aClass108Array4.length - local57 - 1);
				}
				Static340.anInt5461--;
				return;
			}
		}
	}
}

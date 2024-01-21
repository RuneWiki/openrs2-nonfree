import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!de", name = "c", descriptor = "I")
	public static int anInt774;

	@OriginalMember(owner = "client!de", name = "n", descriptor = "I")
	public static int anInt778;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_251 = Static120.method1824("<img=0>");

	@OriginalMember(owner = "client!de", name = "e", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!de", name = "g", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_253 = Static120.method1824("Loaded config");

	@OriginalMember(owner = "client!de", name = "f", descriptor = "Lclient!rd;")
	public static Class80 aClass80_252 = aClass80_253;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "[I")
	public static final int[] anIntArray99 = new int[100];

	@OriginalMember(owner = "client!de", name = "m", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_254 = Static120.method1824(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!de", name = "o", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_255 = Static120.method1824(" <col=00ff80>");

	@OriginalMember(owner = "client!de", name = "p", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_256 = Static120.method1824(")4lang)4de");

	@OriginalMember(owner = "client!de", name = "q", descriptor = "I")
	public static int anInt779 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static97.anIntArrayArrayArray5[arg0][local16][local20] == -Static109.anInt2440) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static111.anIntArrayArrayArray7[arg0][arg1][arg3] + arg5;
			if (!Static79.method1201(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static79.method1201(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static79.method1201(local20, local156, local182)) {
				return false;
			} else if (Static79.method1201(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static188.method3073(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static79.method1201(local16 + 1, Static111.anIntArrayArrayArray7[arg0][arg1][arg3] + arg5, local20 + 1) && Static79.method1201(local16 + 128 - 1, Static111.anIntArrayArrayArray7[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static79.method1201(local16 + 128 - 1, Static111.anIntArrayArrayArray7[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static79.method1201(local16 + 1, Static111.anIntArrayArrayArray7[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}
}

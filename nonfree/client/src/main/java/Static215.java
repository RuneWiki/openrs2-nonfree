import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!km", name = "o", descriptor = "Lclient!qm;")
	public static Class209 aClass209_7;

	@OriginalMember(owner = "client!km", name = "h", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_93 = new Class263(27, 1);

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(III)Z")
	public static boolean method3366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static220.anIntArrayArrayArray13[arg0][arg1][arg2];
		if (local7 == -Static291.anInt7494) {
			return false;
		} else if (local7 == Static291.anInt7494) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static198.anInt7947;
			@Pc(26) int local26 = arg2 << Static198.anInt7947;
			if (Static333.method4696(local22 + 1, Static396.aClass96Array5[arg0].ua(arg1, arg2), local26 + 1) && Static333.method4696(local22 + Static251.anInt4890 - 1, Static396.aClass96Array5[arg0].ua(arg1 + 1, arg2), local26 + 1) && Static333.method4696(local22 + Static251.anInt4890 - 1, Static396.aClass96Array5[arg0].ua(arg1 + 1, arg2 + 1), local26 + Static251.anInt4890 - 1) && Static333.method4696(local22 + 1, Static396.aClass96Array5[arg0].ua(arg1, arg2 + 1), local26 + Static251.anInt4890 - 1) && Static333.method4696(local22 + Static333.anInt6111, Static396.aClass96Array5[arg0].ua(arg1, arg2), local26 + 1) && Static333.method4696(local22 + Static251.anInt4890 - 1, Static396.aClass96Array5[arg0].ua(arg1 + 1, arg2), local26 + Static333.anInt6111) && Static333.method4696(local22 + Static333.anInt6111, Static396.aClass96Array5[arg0].ua(arg1, arg2 + 1), local26 + Static251.anInt4890 - 1) && Static333.method4696(local22 + Static251.anInt4890 - 1, Static396.aClass96Array5[arg0].ua(arg1, arg2), local26 + Static333.anInt6111) && Static333.method4696(local22 + Static333.anInt6111, Static396.aClass96Array5[arg0].ua(arg1, arg2), local26 + Static333.anInt6111)) {
				Static220.anIntArrayArrayArray13[arg0][arg1][arg2] = Static291.anInt7494;
				return true;
			} else {
				Static220.anIntArrayArrayArray13[arg0][arg1][arg2] = -Static291.anInt7494;
				return false;
			}
		}
	}
}

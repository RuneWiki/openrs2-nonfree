import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "F")
	public static float aFloat144;

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_105 = new Class81(53, -1);

	@OriginalMember(owner = "client!ls", name = "j", descriptor = "Lclient!ok;")
	public static final Class180 aClass180_9 = new Class180(13, 7);

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!pc;Lclient!pc;Z)I")
	public static int method3559(@OriginalArg(0) Class188 arg0, @OriginalArg(1) Class188 arg1) {
		@Pc(10) int local10 = 0;
		if (arg0.method4296(Static191.anInt3766)) {
			local10++;
		}
		if (arg0.method4296(Static205.anInt3959)) {
			local10++;
		}
		if (arg0.method4296(Static77.anInt7118)) {
			local10++;
		}
		if (arg1.method4296(Static191.anInt3766)) {
			local10++;
		}
		if (arg1.method4296(Static205.anInt3959)) {
			local10++;
		}
		if (arg1.method4296(Static77.anInt7118)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)Z")
	public static boolean method3560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static162.anIntArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == -Static243.anInt4537) {
			return false;
		} else if (local7 == Static243.anInt4537) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static250.anInt4056;
			@Pc(26) int local26 = arg2 << Static250.anInt4056;
			if (Static379.method5283(local22 + 1, Static372.aClass106Array11[arg0].I(arg1, arg2), local26 + 1) && Static379.method5283(local22 + Static284.anInt5177 - 1, Static372.aClass106Array11[arg0].I(arg1 + 1, arg2), local26 + 1) && Static379.method5283(local22 + Static284.anInt5177 - 1, Static372.aClass106Array11[arg0].I(arg1 + 1, arg2 + 1), local26 + Static284.anInt5177 - 1) && Static379.method5283(local22 + 1, Static372.aClass106Array11[arg0].I(arg1, arg2 + 1), local26 + Static284.anInt5177 - 1) && Static379.method5283(local22 + Static176.anInt3421, Static372.aClass106Array11[arg0].I(arg1, arg2), local26 + 1) && Static379.method5283(local22 + Static284.anInt5177 - 1, Static372.aClass106Array11[arg0].I(arg1 + 1, arg2), local26 + Static176.anInt3421) && Static379.method5283(local22 + Static176.anInt3421, Static372.aClass106Array11[arg0].I(arg1, arg2 + 1), local26 + Static284.anInt5177 - 1) && Static379.method5283(local22 + Static284.anInt5177 - 1, Static372.aClass106Array11[arg0].I(arg1, arg2), local26 + Static176.anInt3421) && Static379.method5283(local22 + Static176.anInt3421, Static372.aClass106Array11[arg0].I(arg1, arg2), local26 + Static176.anInt3421)) {
				Static162.anIntArrayArrayArray5[arg0][arg1][arg2] = Static243.anInt4537;
				return true;
			} else {
				Static162.anIntArrayArrayArray5[arg0][arg1][arg2] = -Static243.anInt4537;
				return false;
			}
		}
	}
}

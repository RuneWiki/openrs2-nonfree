import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
	public static int anInt7343;

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "Lclient!uda;")
	public static final Class292 aClass292_13 = new Class292(2);

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
	public static int anInt7342 = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)Z")
	public static boolean method6133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static87.anIntArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == -Static463.anInt7846) {
			return false;
		} else if (local7 == Static463.anInt7846) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static451.anInt7905;
			@Pc(26) int local26 = arg2 << Static451.anInt7905;
			if (Static393.method5943(local22 + 1, Static544.aClass205Array3[arg0].ba(arg1, arg2), local26 + 1) && Static393.method5943(local22 + Static201.anInt3950 - 1, Static544.aClass205Array3[arg0].ba(arg1 + 1, arg2), local26 + 1) && Static393.method5943(local22 + Static201.anInt3950 - 1, Static544.aClass205Array3[arg0].ba(arg1 + 1, arg2 + 1), local26 + Static201.anInt3950 - 1) && Static393.method5943(local22 + 1, Static544.aClass205Array3[arg0].ba(arg1, arg2 + 1), local26 + Static201.anInt3950 - 1) && Static393.method5943(local22 + Static122.anInt2483, Static544.aClass205Array3[arg0].ba(arg1, arg2), local26 + 1) && Static393.method5943(local22 + Static201.anInt3950 - 1, Static544.aClass205Array3[arg0].ba(arg1 + 1, arg2), local26 + Static122.anInt2483) && Static393.method5943(local22 + Static122.anInt2483, Static544.aClass205Array3[arg0].ba(arg1, arg2 + 1), local26 + Static201.anInt3950 - 1) && Static393.method5943(local22 + Static201.anInt3950 - 1, Static544.aClass205Array3[arg0].ba(arg1, arg2), local26 + Static122.anInt2483) && Static393.method5943(local22 + Static122.anInt2483, Static544.aClass205Array3[arg0].ba(arg1, arg2), local26 + Static122.anInt2483)) {
				Static87.anIntArrayArrayArray1[arg0][arg1][arg2] = Static463.anInt7846;
				return true;
			} else {
				Static87.anIntArrayArrayArray1[arg0][arg1][arg2] = -Static463.anInt7846;
				return false;
			}
		}
	}
}

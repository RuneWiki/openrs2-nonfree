import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "Lclient!bi;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(III)Z")
	public static boolean method4486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static254.anIntArrayArrayArray16[arg0][arg1][arg2];
		if (local7 == -Static219.anInt4904) {
			return false;
		} else if (local7 == Static219.anInt4904) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static79.method1420(local22 + 1, Static287.anIntArrayArrayArray18[arg0][arg1][arg2], local26 + 1) && Static79.method1420(local22 + 128 - 1, Static287.anIntArrayArrayArray18[arg0][arg1 + 1][arg2], local26 + 1) && Static79.method1420(local22 + 128 - 1, Static287.anIntArrayArrayArray18[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static79.method1420(local22 + 1, Static287.anIntArrayArrayArray18[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static254.anIntArrayArrayArray16[arg0][arg1][arg2] = Static219.anInt4904;
				return true;
			} else {
				Static254.anIntArrayArrayArray16[arg0][arg1][arg2] = -Static219.anInt4904;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)Z")
	public static boolean method4488() {
		try {
			return Static73.method1362();
		} catch (@Pc(13) IOException local13) {
			Static104.method835();
			return true;
		} catch (@Pc(18) Exception local18) {
			@Pc(59) String local59 = "T2 - " + Static80.anInt1911 + "," + Static254.anInt5398 + "," + Static199.anInt4491 + " - " + Static5.anInt141 + "," + (Static239.aClass25_Sub1_Sub1_2.anIntArray172[0] + Static82.anInt1972) + "," + (Static266.anInt5790 + Static239.aClass25_Sub1_Sub1_2.anIntArray173[0]) + " - ";
			for (@Pc(61) int local61 = 0; Static5.anInt141 > local61 && local61 < 50; local61++) {
				local59 = local59 + Static222.aClass1_Sub16_Sub1_3.aByteArray39[local61] + ",";
			}
			Static217.method3829(local59, local18);
			Static267.method2725();
			return true;
		}
	}
}

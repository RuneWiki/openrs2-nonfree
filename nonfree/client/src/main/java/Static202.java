import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIII)I")
	public static int method3108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static256.aClass70Array2 == null) {
			return 0;
		}
		if (arg4 < 3) {
			@Pc(21) int local21 = arg3 >> 7;
			@Pc(25) int local25 = arg1 >> 7;
			if (arg2 < 0 || arg0 < 0 || arg2 > Static80.anInt6558 - 1 || Static104.anInt2048 - 1 < arg0) {
				return 0;
			}
			if (local21 < 1 || local25 < 1 || local21 > Static80.anInt6558 - 1 || Static104.anInt2048 - 1 < local25) {
				return 0;
			}
			@Pc(88) boolean local88 = (Static228.aByteArrayArrayArray8[1][arg3 >> 7][arg1 >> 7] & 0x2) != 0;
			@Pc(113) boolean local113;
			@Pc(129) boolean local129;
			if ((arg3 & 0x7F) == 0) {
				local113 = (Static228.aByteArrayArrayArray8[1][local21 - 1][arg1 >> 7] & 0x2) != 0;
				local129 = (Static228.aByteArrayArrayArray8[1][local21][arg1 >> 7] & 0x2) != 0;
				if (local129 != local113) {
					local88 = (Static228.aByteArrayArrayArray8[1][arg2][arg0] & 0x2) != 0;
				}
			}
			if ((arg1 & 0x7F) == 0) {
				local113 = (Static228.aByteArrayArrayArray8[1][arg3 >> 7][local25 - 1] & 0x2) != 0;
				local129 = (Static228.aByteArrayArrayArray8[1][arg3 >> 7][local25] & 0x2) != 0;
				if (local113 != local129) {
					local88 = (Static228.aByteArrayArrayArray8[1][arg2][arg0] & 0x2) != 0;
				}
			}
			if (local88) {
				arg4++;
			}
		}
		return Static256.aClass70Array2[arg4].va(arg3, arg1);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	public static void method3109() {
		Static167.anIntArray228 = Static98.method1593(0.4F);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!tn;IBI)V")
	public static void method3110(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static217.aBoolean311) {
			@Pc(180) Class108 local180 = Static308.anInt7729 == -1 ? null : Static192.aClass75_1.method1517(Static308.anInt7729);
			if (!Static51.method751(arg0).method959() || (Static93.anInt1804 & 0x20) == 0) {
				return;
			}
			if (local180 == null || arg0.method5380(Static308.anInt7729, local180.anInt2527) != local180.anInt2527) {
				Static379.method5349(arg0.anInt6918, Static36.anInt7708, Static363.aString75 + " -> " + arg0.aString82, Static225.aString52, arg0.anInt6860, false, 0L, 30, true, arg0.anInt6923);
			}
			return;
		}
		@Pc(19) String local19;
		for (@Pc(12) int local12 = 9; local12 >= 5; local12--) {
			local19 = Static68.method1006(arg0, local12);
			if (local19 != null) {
				Static379.method5349(arg0.anInt6918, Static358.method5117(arg0, local12), arg0.aString82, local19, arg0.anInt6860, false, (long) (local12 + 1), 1002, true, arg0.anInt6923);
			}
		}
		local19 = Static224.method3275(arg0);
		if (local19 != null) {
			Static379.method5349(arg0.anInt6918, arg0.anInt6911, arg0.aString82, local19, arg0.anInt6860, false, 0L, 46, true, arg0.anInt6923);
		}
		for (@Pc(80) int local80 = 4; local80 >= 0; local80--) {
			@Pc(87) String local87 = Static68.method1006(arg0, local80);
			if (local87 != null) {
				Static379.method5349(arg0.anInt6918, Static358.method5117(arg0, local80), arg0.aString82, local87, arg0.anInt6860, false, (long) (local80 + 1), 15, true, arg0.anInt6923);
			}
		}
		if (!Static51.method751(arg0).method963()) {
			return;
		}
		if (arg0.aString78 == null) {
			Static379.method5349(arg0.anInt6918, -1, "", Static238.aClass96_67.method1935(Static389.anInt7061), arg0.anInt6860, false, 0L, 47, true, arg0.anInt6923);
			return;
		}
		Static379.method5349(arg0.anInt6918, -1, "", arg0.aString78, arg0.anInt6860, false, 0L, 47, true, arg0.anInt6923);
		return;
	}
}

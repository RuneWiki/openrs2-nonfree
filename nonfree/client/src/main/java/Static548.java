import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "Lclient!fg;")
	public static Class102 aClass102_14;

	@OriginalMember(owner = "client!vca", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray32;

	@OriginalMember(owner = "client!vca", name = "c", descriptor = "I")
	public static int anInt8574 = 0;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIBI)Z")
	public static boolean method7005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!Static419.aBoolean572) {
			return false;
		} else if (Static286.anInt8220 < 100) {
			return false;
		} else {
			@Pc(27) int local27 = Static172.anIntArrayArrayArray4[arg0][arg1][arg2];
			if (local27 == -Static465.anInt7972) {
				return false;
			} else if (local27 == Static465.anInt7972) {
				return true;
			} else if (Static557.aClass47Array3 == Static199.aClass47Array1) {
				return false;
			} else {
				@Pc(51) int local51 = arg1 << Static351.anInt5832;
				@Pc(55) int local55 = arg2 << Static351.anInt5832;
				if (Static188.method2907(Static199.aClass47Array1[arg0].method7545(arg1 + 1, arg2 - -1), local55 + 1, local51 - -1, Static199.aClass47Array1[arg0].method7545(arg1, arg2 + 1), Static379.anInt6307 + local55 - 1, Static379.anInt6307 + -1 + local55, local51 + Static379.anInt6307 - 1, local51 + 1, Static199.aClass47Array1[arg0].method7545(arg1, arg2)) && Static188.method2907(Static199.aClass47Array1[arg0].method7545(arg1 + 1, arg2), local55 + 1, local51 - -Static379.anInt6307 + -1, Static199.aClass47Array1[arg0].method7545(arg1 + 1, arg2 + 1), local55 + 1, local55 + Static379.anInt6307 + -1, local51 + Static379.anInt6307 - 1, local51 + 1, Static199.aClass47Array1[arg0].method7545(arg1, arg2))) {
					Static31.anInt507++;
					Static172.anIntArrayArrayArray4[arg0][arg1][arg2] = Static465.anInt7972;
					return true;
				} else {
					Static172.anIntArrayArrayArray4[arg0][arg1][arg2] = -Static465.anInt7972;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)V")
	public static void method7012() {
		for (@Pc(3) int local3 = 0; local3 < Static455.aByteArrayArrayArray17.length; local3++) {
			for (@Pc(15) int local15 = 0; local15 < Static455.aByteArrayArrayArray17[0].length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < Static455.aByteArrayArrayArray17[0][0].length; local19++) {
					Static455.aByteArrayArrayArray17[local3][local15][local19] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(BI)Lclient!wb;")
	public static Class352 method7013(@OriginalArg(1) int arg0) {
		@Pc(15) Class352 local15 = (Class352) Static390.aClass222_41.method4430((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static228.aClass270_48.method5704(0, arg0);
		local15 = new Class352();
		if (local25 != null) {
			local15.method7672(arg0, new Class1_Sub35(local25));
		}
		Static390.aClass222_41.method4434(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!vca", name = "c", descriptor = "(I)V")
	public static void method7014() {
		Static316.aClass1_Sub51_4 = new Class1_Sub51(Static568.aClass351_8.method7651(Static307.anInt5279), "", Static447.anInt7729, 1002, -1, 0L, 0, 0, true, false);
	}
}

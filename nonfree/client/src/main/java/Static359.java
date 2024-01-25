import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Lclient!la;")
	public static Class63 aClass63_11;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	public static int anInt5713;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V")
	public static void method4607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22;
		if (arg2 <= arg1) {
			for (local22 = arg2; local22 < arg1; local22++) {
				Static353.anIntArrayArray48[local22][arg3] = arg0;
			}
		} else {
			for (local22 = arg1; local22 < arg2; local22++) {
				Static353.anIntArrayArray48[local22][arg3] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZIZ)V")
	public static void method4608(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class7_Sub27 local10 = Static288.method3810(arg0, arg1);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray323.length; local15++) {
				local10.anIntArray323[local15] = -1;
				local10.anIntArray324[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIFIZIII)[I")
	public static int[] method4609(@OriginalArg(2) float arg0) {
		@Pc(14) int[] local14 = new int[2048];
		@Pc(18) Class7_Sub3_Sub4 local18 = new Class7_Sub3_Sub4();
		local18.anInt526 = 35;
		local18.anInt522 = 4;
		local18.aBoolean19 = true;
		local18.anInt530 = 8;
		local18.anInt519 = (int) (arg0 * 4096.0F);
		local18.anInt525 = 8;
		local18.method5593();
		Static27.method304(1, 2048);
		local18.method413(local14, 0);
		return local14;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Lclient!cs;")
	public static Class7_Sub11 method4610() {
		if (Static93.aClass85_28 == null || Static267.aClass12_1 == null) {
			return null;
		}
		for (@Pc(20) Class7_Sub11 local20 = (Class7_Sub11) Static267.aClass12_1.method95(); local20 != null; local20 = (Class7_Sub11) Static267.aClass12_1.method95()) {
			@Pc(28) Class20 local28 = Static93.aClass62_4.method1481(local20.anInt1062);
			if (local28 != null && local28.aBoolean8 && local28.method228(Static93.anInterface1_2)) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	public static void method4612() {
		Static81.method1414(Static226.aClass2_64);
		Static255.aClass7_Sub14_Sub1_2.method3970(0);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)V")
	public static void method4613() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static172.aBooleanArray15[local7] = false;
		}
		Static397.anInt6335 = Static9.anInt55;
		Static31.anInt529 = -1;
		Static90.anInt1869 = Static92.anInt1897;
		Static9.anInt60 = 5;
		Static131.anInt2511 = 0;
		Static316.anInt5194 = 0;
		Static316.anInt5193 = Static46.anInt737;
		Static48.anInt751 = Static274.anInt4617;
		Static194.anInt3448 = Static212.anInt3801;
		Static119.anInt2395 = Static181.anInt3254;
		Static352.anInt5640 = -1;
	}
}

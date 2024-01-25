import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!hq", name = "t", descriptor = "Lclient!sh;")
	public static Class211 aClass211_67;

	@OriginalMember(owner = "client!hq", name = "q", descriptor = "Lclient!at;")
	public static final Class17 aClass17_27 = new Class17();

	@OriginalMember(owner = "client!hq", name = "u", descriptor = "[I")
	public static final int[] anIntArray324 = new int[2048];

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIII)V")
	public static void method2174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg4) {
			Static319.method4699(arg1, arg0, arg2, arg3);
		} else if (Static372.anInt1561 <= arg0 - arg1 && arg1 + arg0 <= Static98.anInt1774 && Static194.anInt3448 <= arg3 - arg4 && Static264.anInt4589 >= arg4 + arg3) {
			Static157.method2352(arg4, arg0, arg3, arg1, arg2);
		} else {
			Static93.method1366(arg1, arg2, arg4, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BLclient!ui;)V")
	public static void method2182(@OriginalArg(1) Class230 arg0) {
		Static107.anInt5816 = arg0.method4970("p11_full");
		Static160.anInt2900 = arg0.method4970("p12_full");
		Static241.anInt4030 = arg0.method4970("b12_full");
		Static263.anInt4585 = arg0.method4970("hitmarks");
		Static16.anInt280 = arg0.method4970("hitbar_default");
		Static308.anInt5220 = arg0.method4970("timerbar_default");
		Static257.anInt4441 = arg0.method4970("headicons_pk");
		Static28.anInt625 = arg0.method4970("headicons_prayer");
		Static275.anInt4799 = arg0.method4970("hint_headicons");
		Static46.anInt909 = arg0.method4970("hint_mapmarkers");
		Static291.anInt5038 = arg0.method4970("mapflag");
		Static268.anInt4680 = arg0.method4970("cross");
		Static337.anInt5594 = arg0.method4970("mapdots");
		Static202.anInt3547 = arg0.method4970("scrollbar");
		Static82.anInt1521 = arg0.method4970("name_icons");
		Static196.anInt3486 = arg0.method4970("floorshadows");
		Static279.anInt4857 = arg0.method4970("compass");
		Static97.anInt1744 = arg0.method4970("otherlevel");
		Static216.anInt3711 = arg0.method4970("hint_mapedge");
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB)V")
	public static void method2184(@OriginalArg(0) int arg0) {
		if (!Static345.method4878(arg0)) {
			return;
		}
		@Pc(14) Class117[] local14 = Static137.aClass117ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local14.length; local21++) {
			@Pc(27) Class117 local27 = local14[local21];
			if (local27 != null) {
				local27.anInt3057 = 1;
				local27.anInt3059 = 0;
				local27.anInt3044 = 0;
			}
		}
	}
}

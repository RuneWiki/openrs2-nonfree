import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
	public static int anInt1469 = 0;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
	public static int anInt1470 = 50;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)V")
	public static void method1021(@OriginalArg(1) int arg0) {
		if (!Static156.method2772(arg0)) {
			return;
		}
		@Pc(14) Class122[] local14 = Static80.aClass122ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class122 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt4666 = 0;
				local22.anInt4675 = 0;
				local22.anInt4647 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZIIIIII)V")
	public static void method1022(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 >= Static167.anInt3907 && arg5 <= Static150.anInt3860 && arg3 >= Static202.anInt4469 && Static94.anInt4237 >= arg6) {
			Static71.method1367(arg1, arg2, arg3, arg4, arg5, arg6, arg0);
		} else {
			Static98.method2083(arg6, arg3, arg4, arg5, arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I")
	public static int method1023(@OriginalArg(0) int arg0) {
		if (Static34.aClass109_2 != null) {
			Static34.aClass109_2.method3141();
			Static34.aClass109_2 = null;
		}
		Static197.anInt2399++;
		if (Static197.anInt2399 > 4) {
			Static197.anInt2399 = 0;
			Static191.anInt4274 = 0;
			return arg0;
		}
		if (Static191.anInt4270 == Static11.anInt494) {
			Static191.anInt4270 = Static115.anInt3010;
		} else {
			Static191.anInt4270 = Static11.anInt494;
		}
		Static191.anInt4274 = 0;
		return -1;
	}
}

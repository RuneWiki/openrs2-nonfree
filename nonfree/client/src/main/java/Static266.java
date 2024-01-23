import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!ue", name = "P", descriptor = "Z")
	public static boolean aBoolean410 = false;

	@OriginalMember(owner = "client!ue", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString179 = null;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method4096(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(38) long local38 = arg0;
			@Pc(40) int local40 = 0;
			while (local38 != 0L) {
				local38 /= 37L;
				local40++;
			}
			@Pc(58) StringBuffer local58 = new StringBuffer(local40);
			while (arg0 != 0L) {
				@Pc(64) long local64 = arg0;
				arg0 /= 37L;
				@Pc(78) char local78 = Static38.aCharArray5[(int) (local64 - arg0 * 37L)];
				if (local78 == '_') {
					local78 = ' ';
					@Pc(90) int local90 = local58.length() - 1;
					local58.setCharAt(local90, Character.toUpperCase(local58.charAt(local90)));
				}
				local58.append(local78);
			}
			local58.reverse();
			local58.setCharAt(0, Character.toUpperCase(local58.charAt(0)));
			return local58.toString();
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BIIIIII)V")
	public static void method4097(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static245.anInt1237 <= arg0 && Static28.anInt606 >= arg3 && arg2 >= Static24.anInt556 && Static284.anInt5643 >= arg1) {
			if (arg4 == 1) {
				Static129.method3075(arg5, arg3, arg1, arg0, arg2);
			} else {
				Static290.method4461(arg1, arg2, arg3, arg4, arg0, arg5);
			}
		} else if (arg4 == 1) {
			Static1.method3(arg3, arg0, arg1, arg5, arg2);
		} else {
			Static202.method3142(arg2, arg4, arg3, arg1, arg5, arg0);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)Z")
	public static boolean method4099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static58.anIntArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == -Static123.anInt2372) {
			return false;
		} else if (local7 == Static123.anInt2372) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static191.method2911(local22 + 1, Static163.anIntArrayArrayArray16[arg0][arg1][arg2], local26 + 1) && Static191.method2911(local22 + 128 - 1, Static163.anIntArrayArrayArray16[arg0][arg1 + 1][arg2], local26 + 1) && Static191.method2911(local22 + 128 - 1, Static163.anIntArrayArrayArray16[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static191.method2911(local22 + 1, Static163.anIntArrayArrayArray16[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static58.anIntArrayArrayArray7[arg0][arg1][arg2] = Static123.anInt2372;
				return true;
			} else {
				Static58.anIntArrayArrayArray7[arg0][arg1][arg2] = -Static123.anInt2372;
				return false;
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
	public static int anInt4667;

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray59 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method3452(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % (long) 37 == 0L) {
			return null;
		} else {
			@Pc(31) int local31 = 0;
			@Pc(33) long local33 = arg0;
			while (local33 != 0L) {
				local33 /= 37L;
				local31++;
			}
			@Pc(51) StringBuffer local51 = new StringBuffer(local31);
			while (arg0 != 0L) {
				@Pc(59) long local59 = arg0;
				arg0 /= 37L;
				@Pc(73) char local73 = Static309.aCharArray7[(int) (local59 - arg0 * 37L)];
				if (local73 == '_') {
					local73 = ' ';
					@Pc(85) int local85 = local51.length() - 1;
					local51.setCharAt(local85, Character.toUpperCase(local51.charAt(local85)));
				}
				local51.append(local73);
			}
			local51.reverse();
			local51.setCharAt(0, Character.toUpperCase(local51.charAt(0)));
			return local51.toString();
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BJ)V")
	public static void method3453(@OriginalArg(1) long arg0) {
		if (!Static211.aBoolean285) {
			Static27.aFloat44 += (float) arg0 * Static249.aFloat50 / 40.0F;
			Static62.aFloat16 += Static96.aFloat30 * (float) arg0 / 40.0F;
		}
		@Pc(31) int local31 = Static69.anInt1442 + Static56.aClass2_Sub4_Sub2_1.anInt2846;
		@Pc(37) int local37 = Static56.aClass2_Sub4_Sub2_1.anInt2794 + Static101.anInt163;
		if (Static28.anInt741 - local31 < -500 || Static28.anInt741 - local31 > 500 || Static315.anInt6303 - local37 < -500 || Static315.anInt6303 - local37 > 500) {
			Static28.anInt741 = local31;
			Static315.anInt6303 = local37;
		}
		@Pc(79) int local79;
		@Pc(87) int local87;
		if (local31 != Static28.anInt741) {
			local79 = local31 - Static28.anInt741;
			local87 = (int) ((long) local79 * arg0 / 320L);
			if (local79 > 0) {
				if (local87 == 0) {
					local87 = 1;
				} else if (local87 > local79) {
					local87 = local79;
				}
			} else if (local87 == 0) {
				local87 = -1;
			} else if (local79 > local87) {
				local87 = local79;
			}
			Static28.anInt741 += local87;
		}
		if (local37 != Static315.anInt6303) {
			local79 = local37 - Static315.anInt6303;
			local87 = (int) ((long) local79 * arg0 / 320L);
			if (local79 > 0) {
				if (local87 == 0) {
					local87 = 1;
				} else if (local87 > local79) {
					local87 = local79;
				}
			} else if (local87 == 0) {
				local87 = -1;
			} else if (local79 > local87) {
				local87 = local79;
			}
			Static315.anInt6303 += local87;
		}
		Static140.method2324();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)I")
	public static int method3455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}
}

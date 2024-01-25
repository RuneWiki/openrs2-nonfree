import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!vl", name = "P", descriptor = "Lclient!jg;")
	public static Class124 aClass124_4;

	@OriginalMember(owner = "client!vl", name = "o", descriptor = "[[S")
	public static final short[][] aShortArrayArray47 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!vl", name = "rb", descriptor = "[Z")
	public static final boolean[] aBooleanArray143 = new boolean[100];

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IZ)V")
	public static void method5570(@OriginalArg(1) boolean arg0) {
		Static209.method3549();
		if (Static344.anInt6327 != 30 && Static344.anInt6327 != 25) {
			return;
		}
		Static69.anInt1312++;
		if (Static69.anInt1312 < 50 && !arg0) {
			return;
		}
		Static69.anInt1312 = 0;
		if (!Static226.aBoolean325 && Static169.aClass124_3 != null) {
			Static19.method552(Static76.aClass41_37);
			try {
				Static169.aClass124_3.method2717(Static39.aClass2_Sub13_Sub2_4.anInt4788, Static39.aClass2_Sub13_Sub2_4.aByteArray77);
				Static39.aClass2_Sub13_Sub2_4.anInt4788 = 0;
			} catch (@Pc(57) IOException local57) {
				Static226.aBoolean325 = true;
			}
		}
		Static209.method3549();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method5573(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(39) int local39 = 0;
			@Pc(41) long local41 = arg0;
			while (local41 != 0L) {
				local41 /= 37L;
				local39++;
			}
			@Pc(59) StringBuffer local59 = new StringBuffer(local39);
			while (arg0 != 0L) {
				@Pc(63) long local63 = arg0;
				arg0 /= 37L;
				@Pc(77) char local77 = Static93.aCharArray3[(int) (local63 - arg0 * 37L)];
				if (local77 == '_') {
					@Pc(85) int local85 = local59.length() - 1;
					local59.setCharAt(local85, Character.toUpperCase(local59.charAt(local85)));
					local77 = ' ';
				}
				local59.append(local77);
			}
			local59.reverse();
			local59.setCharAt(0, Character.toUpperCase(local59.charAt(0)));
			return local59.toString();
		}
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V")
	public static void method5577() {
		Static267.aClass82_6.method4457(((float) Static146.anInt2670 * 0.1F + 0.7F) * 1.1523438F);
		Static267.aClass82_6.method4520(Static16.anInt401, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static267.aClass82_6.method4519(Static125.anInt2377, -1);
		Static267.aClass82_6.method4508(Static321.aClass21_2);
	}
}

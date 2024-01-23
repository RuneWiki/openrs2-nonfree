import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "[I")
	public static int[] anIntArray601 = new int[50];

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString327 = "skill: ";

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
	public static int anInt5346 = -1;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
	public static void method4355() {
		while (true) {
			if (Static189.aClass4_Sub10_Sub1_2.method4688(Static21.anInt1052) >= 11) {
				@Pc(18) int local18 = Static189.aClass4_Sub10_Sub1_2.method4689(11);
				if (local18 != 2047) {
					@Pc(27) boolean local27 = false;
					if (Static182.aClass53_Sub1_Sub1Array1[local18] == null) {
						local27 = true;
						Static182.aClass53_Sub1_Sub1Array1[local18] = new Class53_Sub1_Sub1();
						if (Static242.aClass4_Sub10Array1[local18] != null) {
							Static182.aClass53_Sub1_Sub1Array1[local18].method1170(Static242.aClass4_Sub10Array1[local18]);
						}
					}
					Static172.anIntArray317[Static129.anInt2510++] = local18;
					@Pc(65) Class53_Sub1_Sub1 local65 = Static182.aClass53_Sub1_Sub1Array1[local18];
					local65.anInt3990 = Static50.anInt954;
					@Pc(75) int local75 = Static18.anIntArray27[Static189.aClass4_Sub10_Sub1_2.method4689(3)];
					if (local27) {
						local65.anInt4017 = local65.anInt4031 = local75;
					}
					@Pc(88) int local88 = Static189.aClass4_Sub10_Sub1_2.method4689(5);
					if (local88 > 15) {
						local88 -= 32;
					}
					@Pc(97) int local97 = Static189.aClass4_Sub10_Sub1_2.method4689(1);
					@Pc(102) int local102 = Static189.aClass4_Sub10_Sub1_2.method4689(1);
					if (local102 == 1) {
						Static275.anIntArray587[Static250.anInt4761++] = local18;
					}
					@Pc(119) int local119 = Static189.aClass4_Sub10_Sub1_2.method4689(5);
					if (local119 > 15) {
						local119 -= 32;
					}
					local65.method1174(Static154.aClass53_Sub1_Sub1_2.anIntArray426[0] + local119, local97 == 1, Static154.aClass53_Sub1_Sub1_2.anIntArray422[0] + local88);
					continue;
				}
			}
			Static189.aClass4_Sub10_Sub1_2.method4681();
			return;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method4356(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(31) int local31 = 0;
			for (@Pc(33) long local33 = arg0; local33 != 0L; local33 /= 37L) {
				local31++;
			}
			@Pc(49) StringBuffer local49 = new StringBuffer(local31);
			while (arg0 != 0L) {
				@Pc(57) long local57 = arg0;
				arg0 /= 37L;
				local49.append(Static157.aCharArray1[(int) (local57 - arg0 * 37L)]);
			}
			return local49.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
	public static void method4358() {
		for (@Pc(14) Class4_Sub3_Sub6 local14 = (Class4_Sub3_Sub6) Static73.aClass114_8.method2623(); local14 != null; local14 = (Class4_Sub3_Sub6) Static73.aClass114_8.method2629()) {
			@Pc(20) Class53_Sub5 local20 = local14.aClass53_Sub5_1;
			if (local20.anInt3655 != Static281.anInt5335 || local20.aBoolean265) {
				local14.method4854();
			} else if (Static50.anInt954 >= local20.anInt3665) {
				local20.method3071(Static211.anInt4156);
				if (local20.aBoolean265) {
					local14.method4854();
				} else {
					Static40.method637(local20.anInt3655, local20.anInt3647, local20.anInt3653, local20.anInt3648, 60, local20, 0, -1L, false);
				}
			}
		}
	}
}

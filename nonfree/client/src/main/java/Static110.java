import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!gs", name = "B", descriptor = "I")
	public static int anInt2508;

	@OriginalMember(owner = "client!gs", name = "Y", descriptor = "I")
	public static int anInt2524 = 127;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method2130(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			@Pc(31) long local31 = arg0;
			while (local31 != 0L) {
				local31 /= 37L;
				local29++;
			}
			@Pc(46) StringBuffer local46 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(49) long local49 = arg0;
				arg0 /= 37L;
				@Pc(63) char local63 = Static175.aCharArray6[(int) (local49 - arg0 * 37L)];
				if (local63 == '_') {
					@Pc(73) int local73 = local46.length() - 1;
					local63 = ' ';
					local46.setCharAt(local73, Character.toUpperCase(local46.charAt(local73)));
				}
				local46.append(local63);
			}
			local46.reverse();
			local46.setCharAt(0, Character.toUpperCase(local46.charAt(0)));
			return local46.toString();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BI)S")
	public static short method2132(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(20) int local20 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(41) int local41 = local24 <= 64 ? local20 * local24 >> 7 : local20 * (127 - local24) >> 7;
		@Pc(45) int local45 = local24 + local41;
		@Pc(54) int local54;
		if (local45 == 0) {
			local54 = local41 << 1;
		} else {
			local54 = (local41 << 8) / local45;
		}
		return (short) (local45 | local54 >> 4 << 7 | local9 << 10);
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(Z)Z")
	public static boolean method2134() {
		try {
			if (Static129.anInt2826 == 2) {
				if (Static55.aClass7_Sub38_1 == null) {
					Static55.aClass7_Sub38_1 = Static368.method5112(Static98.aClass180_12, Static61.anInt1532, Static250.anInt4908);
					if (Static55.aClass7_Sub38_1 == null) {
						return false;
					}
				}
				if (Static10.aClass100_1 == null) {
					Static10.aClass100_1 = new Class100(Static310.aClass180_88, Static261.aClass180_69);
				}
				if (Static214.aClass7_Sub8_Sub2_3.method3112(Static10.aClass100_1, Static55.aClass7_Sub38_1, Static263.aClass180_70)) {
					Static214.aClass7_Sub8_Sub2_3.method3126();
					Static214.aClass7_Sub8_Sub2_3.method3092(Static254.anInt4944);
					Static214.aClass7_Sub8_Sub2_3.method3091(Static55.aClass7_Sub38_1, Static301.aBoolean425);
					Static129.anInt2826 = 0;
					Static98.aClass180_12 = null;
					Static10.aClass100_1 = null;
					Static55.aClass7_Sub38_1 = null;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static214.aClass7_Sub8_Sub2_3.method3114();
			Static129.anInt2826 = 0;
			Static98.aClass180_12 = null;
			Static10.aClass100_1 = null;
			Static55.aClass7_Sub38_1 = null;
		}
		return false;
	}
}

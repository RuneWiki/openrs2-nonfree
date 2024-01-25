import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
	public static int anInt7203;

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_116 = new Class25(32, 6);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II[Ljava/lang/String;B)Ljava/lang/String;")
	public static String method5920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String[] arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(26) String local26 = arg2[arg1];
			return local26 == null ? "null" : local26.toString();
		} else {
			@Pc(38) int local38 = arg0 + arg1;
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = arg1; local42 < local38; local42++) {
				@Pc(48) String local48 = arg2[local42];
				if (local48 == null) {
					local40 += 4;
				} else {
					local40 += local48.length();
				}
			}
			@Pc(71) StringBuffer local71 = new StringBuffer(local40);
			for (@Pc(73) int local73 = arg1; local73 < local38; local73++) {
				@Pc(79) String local79 = arg2[local73];
				if (local79 == null) {
					local71.append("null");
				} else {
					local71.append(local79);
				}
			}
			return local71.toString();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!qq;I)V")
	public static void method5921(@OriginalArg(0) Class28 arg0) {
		arg0.method3570(0, 0, Static235.anInt4053, 350);
		arg0.method3559(0, 0, Static235.anInt4053, 350, Static42.anInt908 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static290.anInt4868;
		@Pc(35) int local35;
		if (Static371.anInt6171 > 0) {
			local35 = 346 - Static290.anInt4868 - 4;
			@Pc(46) int local46 = local27 * local35 / (local27 + Static371.anInt6171 - 1);
			@Pc(48) int local48 = 4;
			if (Static371.anInt6171 > 1) {
				local48 = (local35 - local46) * (-Static59.anInt1234 + -1 + Static371.anInt6171) / (Static371.anInt6171 - 1) + 4;
			}
			arg0.method3559(Static235.anInt4053 - 16, local48, 12, local46, Static42.anInt908 << 24 | 0x332277, 2);
			for (@Pc(86) int local86 = Static59.anInt1234; local86 < local27 + Static59.anInt1234 && local86 < Static371.anInt6171; local86++) {
				@Pc(95) String[] local95 = Static109.method1808('\b', Static183.aStringArray40[local86]);
				@Pc(104) int local104 = (Static235.anInt4053 - 8 - 16) / local95.length;
				for (@Pc(106) int local106 = 0; local106 < local95.length; local106++) {
					@Pc(114) int local114 = local104 * local106 + 8;
					arg0.method3570(local114, 0, local114 + local104 - 8, 350);
					Static60.aClass92_2.method5638(-1, 350 - Static196.aClass201_4.anInt5070 - Static341.anInt5728 - Static290.anInt4868 * (-Static59.anInt1234 + local86) - 2, local114, local95[local106], -16777216);
				}
			}
		}
		arg0.method3570(0, 0, Static235.anInt4053, 350);
		arg0.method3477(350 - Static341.anInt5728, -1, Static235.anInt4053, 0);
		Static45.aClass92_1.method5638(-1, 349 - Static252.aClass201_5.anInt5070, 10, "--> " + Static427.aString67, -16777216);
		local35 = -1;
		if (Static125.anInt2225 % 30 > 15) {
			local35 = 16777215;
		}
		arg0.method3534(Static252.aClass201_5.method4452("--> " + Static427.aString67.substring(0, Static255.anInt4369)) + 10, -Static252.aClass201_5.anInt5070 + -11 + 350, local35, 12);
	}
}

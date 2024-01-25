import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_211 = new Class272(42, 5);

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_42 = new Class10(4);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)[Lclient!cu;")
	public static Class54[] method5756() {
		if (Static182.aClass54Array1 == null) {
			@Pc(19) Class54[] local19 = Static221.method5007(Static409.aClass221_6);
			@Pc(23) Class54[] local23 = new Class54[local19.length];
			@Pc(25) int local25 = 0;
			@Pc(30) int local30 = Static278.aClass3_Sub13_Sub1_1.method4483(Static260.anInt4932);
			@Pc(85) int local85;
			@Pc(91) Class54 local91;
			label70: for (@Pc(32) int local32 = 0; local32 < local19.length; local32++) {
				@Pc(38) Class54 local38 = local19[local32];
				if ((local38.anInt1992 <= 0 || local38.anInt1992 >= 24) && local38.anInt1990 >= 800 && local38.anInt1988 >= 600 && (local30 != 2 || local38.anInt1990 <= 800 && local38.anInt1988 <= 600) && (local30 != 1 || local38.anInt1990 <= 1024 && local38.anInt1988 <= 768)) {
					for (local85 = 0; local85 < local25; local85++) {
						local91 = local23[local85];
						if (local38.anInt1990 == local91.anInt1990 && local91.anInt1988 == local38.anInt1988) {
							if (local91.anInt1992 < local38.anInt1992) {
								local23[local85] = local38;
							}
							continue label70;
						}
					}
					local23[local25] = local38;
					local25++;
				}
			}
			Static182.aClass54Array1 = new Class54[local25];
			Static604.method5912(local23, 0, Static182.aClass54Array1, 0, local25);
			@Pc(151) int[] local151 = new int[Static182.aClass54Array1.length];
			for (local85 = 0; local85 < Static182.aClass54Array1.length; local85++) {
				local91 = Static182.aClass54Array1[local85];
				local151[local85] = local91.anInt1990 * local91.anInt1988;
			}
			Static312.method4880(local151, Static182.aClass54Array1);
		}
		return Static182.aClass54Array1;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!r;Ljava/lang/String;ZLclient!la;Lclient!daa;B)V")
	public static void method5757(@OriginalArg(0) Class43 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class117 arg3, @OriginalArg(4) Class58 arg4) {
		@Pc(17) boolean local17 = !Static305.aBoolean455 || Static239.method3994();
		if (!local17) {
			return;
		}
		@Pc(39) int local39;
		@Pc(48) int local48;
		if (Static305.aBoolean455 && local17) {
			@Pc(26) Class58 local26 = Static228.aClass58_5;
			@Pc(32) Class117 local32 = arg0.method7139(local26, Static349.aClass355Array1);
			local39 = local26.method1766(arg1, null, 250);
			local48 = local26.method1771(arg1, 250, local26.anInt2033, null);
			@Pc(51) int local51 = Static293.aClass355_3.anInt9165;
			@Pc(55) int local55 = local51 + 4;
			local39 += local55 * 2;
			local48 += local55 * 2;
			if (Static95.anInt667 > local39) {
				local39 = Static95.anInt667;
			}
			if (Static59.anInt5157 > local48) {
				local48 = Static59.anInt5157;
			}
			@Pc(86) int local86 = Static12.aClass300_1.method6502(local39, Static1.anInt7) + Static571.anInt8441;
			@Pc(95) int local95 = Static162.aClass140_4.method3723(Static283.anInt2480, local48) + Static548.anInt8859;
			arg0.method7205(Static332.aClass355_4, false).DA(Static515.aClass355_2.anInt9165 + local86, local95 - -Static515.aClass355_2.anInt9162, local39 - Static515.aClass355_2.anInt9165 * 2, -(Static515.aClass355_2.anInt9162 * 2) + local48, 1, 0, 0);
			arg0.method7205(Static515.aClass355_2, true).method7606(local86, local95);
			Static515.aClass355_2.method7598();
			arg0.method7205(Static515.aClass355_2, true).method7606(local86 + local39 - local51, local95);
			Static515.aClass355_2.method7602();
			arg0.method7205(Static515.aClass355_2, true).method7606(local86 + local39 - local51, -local51 + local48 + local95);
			Static515.aClass355_2.method7598();
			arg0.method7205(Static515.aClass355_2, true).method7606(local86, local95 + local48 - local51);
			Static515.aClass355_2.method7602();
			arg0.method7205(Static293.aClass355_3, true).method7612(local86, local95 + Static515.aClass355_2.anInt9162, local51, local48 - Static515.aClass355_2.anInt9162 * 2);
			Static293.aClass355_3.method7600();
			arg0.method7205(Static293.aClass355_3, true).method7612(local86 + Static515.aClass355_2.anInt9165, local95, local39 - Static515.aClass355_2.anInt9165 * 2, local51);
			Static293.aClass355_3.method7600();
			arg0.method7205(Static293.aClass355_3, true).method7612(local86 + local39 - local51, Static515.aClass355_2.anInt9162 + local95, local51, local48 - Static515.aClass355_2.anInt9162 * 2);
			Static293.aClass355_3.method7600();
			arg0.method7205(Static293.aClass355_3, true).method7612(local86 + Static515.aClass355_2.anInt9165, -local51 + local48 + local95, local39 - Static515.aClass355_2.anInt9165 * 2, local51);
			Static293.aClass355_3.method7600();
			local32.method7650(-1, local55 + local95, null, 1, Static152.anInt3135 | 0xFF000000, local48 - local55 * 2, arg1, null, null, 0, local39 - local55 * 2, 0, local86 + local55, 1, 0);
			Static482.method6578(local48, local86, local39, local95);
		} else {
			local39 = arg4.method1766(arg1, null, 250);
			local48 = arg4.method1775(250, arg1, null) * 13;
			arg0.J(6, 6, local39 + 4 + 4, local48 - -4 + 4, -16777216, 0);
			arg0.method7170(6, 6, local39 + 4 + 4, local48 + 8, -1, 0);
			arg3.method7650(-1, 10, null, 1, -1, local48, arg1, null, null, 0, local39, 0, 10, 1, 0);
			Static482.method6578(local48 + 4 + 4, 6, local39 + 4 + 4, 6);
		}
		if (arg2) {
			try {
				arg0.method7197();
			} catch (@Pc(431) Exception_Sub1 local431) {
			}
		}
	}
}

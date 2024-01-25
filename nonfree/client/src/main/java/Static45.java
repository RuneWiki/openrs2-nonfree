import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_25 = new Class200(68, 6);

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "Lclient!sf;")
	public static final Class312 aClass312_2 = new Class312("", 14);

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "[I")
	public static final int[] anIntArray74 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
	public static final int anInt1208 = 0;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method1177(@OriginalArg(0) String arg0) {
		@Pc(7) String local7 = null;
		@Pc(11) int local11 = arg0.indexOf("--> ");
		if (local11 >= 0) {
			local7 = arg0.substring(0, local11 + 4);
			arg0 = arg0.substring(local11 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(39) int local39 = arg0.indexOf(" ", "directlogin ".length());
			if (local39 >= 0) {
				@Pc(47) int local47 = arg0.length();
				arg0 = arg0.substring(0, local39) + " ";
				for (@Pc(63) int local63 = local39 + 1; local63 < local47; local63++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 == null ? arg0 : local7 + arg0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBZLjava/lang/String;)V")
	public static void method1179(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		Static352.method5271();
		if (arg0 == 0) {
			Static141.aClass13_27 = Static620.method8621(0, Static150.aCanvas4, Static173.anInterface2_7, Static305.aClass2_Sub49_15.aClass33_Sub7_2.method2924() * 2, Static98.aClass238_299);
			if (arg2 != null) {
				Static141.aClass13_27.GA(0);
				@Pc(34) Class183 local34 = Static28.method8897(Static574.anInt9375, Static419.aClass238_210);
				@Pc(43) Class37 local43 = Static141.aClass13_27.method8136(local34, Static654.method3463(Static497.aClass238_223, Static574.anInt9375));
				Static123.method2208();
				Static24.method603(local43, Static141.aClass13_27, true, local34, arg2);
			}
		} else {
			@Pc(55) Class13 local55 = null;
			@Pc(83) Class37 local83;
			if (arg2 != null) {
				local55 = Static620.method8621(0, Static150.aCanvas4, Static173.anInterface2_7, 0, Static98.aClass238_299);
				local55.GA(0);
				@Pc(74) Class183 local74 = Static28.method8897(Static574.anInt9375, Static419.aClass238_210);
				local83 = local55.method8136(local74, Static654.method3463(Static497.aClass238_223, Static574.anInt9375));
				Static123.method2208();
				Static24.method603(local83, local55, true, local74, arg2);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static141.aClass13_27 = Static620.method8621(arg0, Static150.aCanvas4, Static173.anInterface2_7, Static305.aClass2_Sub49_15.aClass33_Sub7_2.method2924() * 2, Static98.aClass238_299);
					if (arg2 != null) {
						local55.GA(0);
						@Pc(116) Class183 local116 = Static28.method8897(Static574.anInt9375, Static419.aClass238_210);
						@Pc(125) Class37 local125 = local55.method8136(local116, Static654.method3463(Static497.aClass238_223, Static574.anInt9375));
						Static123.method2208();
						Static24.method603(local125, local55, true, local116, arg2);
					}
					if (Static141.aClass13_27.method8142()) {
						@Pc(139) boolean local139 = true;
						try {
							local139 = Static153.aClass2_Sub42_1.anInt9302 > 256;
						} catch (@Pc(151) Throwable local151) {
						}
						@Pc(157) Class2_Sub40 local157;
						if (local139) {
							local157 = Static141.aClass13_27.method8162(146800640);
						} else {
							local157 = Static141.aClass13_27.method8162(104857600);
						}
						Static141.aClass13_27.method8158(local157);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(167) Throwable local167) {
					@Pc(172) int local172 = Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687();
					if (local172 == 2) {
						Static223.aBoolean283 = true;
					}
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub28_1, 0);
					method1179(local172, arg1, arg2);
					@Pc(189) Object local189 = null;
					var14 = false;
				} finally {
					if (var14) {
						local83 = null;
						if (local55 != null) {
							try {
								local55.method8117();
							} catch (@Pc(338) Throwable local338) {
							}
						}
					}
				}
				if (local55 != null) {
					try {
						local55.method8117();
					} catch (@Pc(318) Throwable local318) {
					}
				}
				return;
			}
			local83 = null;
			if (local55 != null) {
				try {
					local55.method8117();
				} catch (@Pc(328) Throwable local328) {
				}
			}
		}
		Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8686(!arg1);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub28_1, arg0);
		Static515.method7137();
		Static141.aClass13_27.method8105();
		Static141.aClass13_27.X(32);
		Static46.aClass51_5 = Static141.aClass13_27.method8137();
		Static113.aClass51_3 = Static141.aClass13_27.method8137();
		Static550.method7586();
		Static141.aClass13_27.method8098(Static305.aClass2_Sub49_15.aClass33_Sub15_1.method4982() == 1);
		if (Static141.aClass13_27.method8128()) {
			Static431.method6717(Static305.aClass2_Sub49_15.aClass33_Sub26_1.method8367() == 1);
		}
		Static360.method5383(Static141.aClass13_27, Static5.anInt112 >> 3, Static456.anInt7428 >> 3);
		Static350.method5258();
		Static301.aClass279Array1 = null;
		Static35.aBoolean69 = true;
		Static406.aBoolean496 = false;
		Static7.method101();
	}
}

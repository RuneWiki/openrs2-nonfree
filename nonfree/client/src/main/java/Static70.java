import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Lclient!en;")
	public static Class47 aClass47_2;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString92 = "Loaded defaults";

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray15 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)I")
	public static int method1177() {
		return ((Static286.anInt5742 == 0 ? 0 : 1) << 22) + ((Static57.anInt6309 == 0 ? 0 : 1) << 20) + ((Static202.aBoolean276 ? 1 : 0) << 16) + ((Static255.aBoolean321 ? 1 : 0) << 15) + ((Static208.anInt4490 & 0x3) << 11) + ((Static282.aBoolean355 ? 1 : 0) << 9) + ((Static280.aBoolean353 ? 1 : 0) << 7) + ((Static41.aBoolean72 ? 1 : 0) << 6) + ((Static293.aBoolean364 ? 1 : 0) << 5) + ((Static72.aBoolean118 ? 1 : 0) << 4) + (Static166.anInt3743 & 0x7) + ((Static316.aBoolean419 ? 1 : 0) << 3) + ((Static125.aBoolean164 ? 1 : 0) << 8) + ((Static35.aBoolean65 ? 1 : 0) << 10) + ((Static65.aBoolean96 ? 1 : 0) << 13) + (Static266.anInt5317 << 17) - (-((Static11.aBoolean17 ? 1 : 0) << 19) - (((Static87.anInt2035 == 0 ? 0 : 1) << 21) + (Static42.method849() << 23)));
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBILclient!jh;)V")
	public static void method1180(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub4_Sub2 arg2) {
		if ((arg0 & 0x10) != 0) {
			arg2.anInt2775 = Static140.aClass1_Sub14_Sub1_2.method2242();
			arg2.anInt2821 = Static140.aClass1_Sub14_Sub1_2.method2243();
		}
		@Pc(35) int local35;
		if ((arg0 & 0x4) != 0) {
			local35 = Static140.aClass1_Sub14_Sub1_2.method2229();
			@Pc(38) byte[] local38 = new byte[local35];
			@Pc(43) Class1_Sub14 local43 = new Class1_Sub14(local38);
			Static140.aClass1_Sub14_Sub1_2.method2197(local35, local38);
			Static62.aClass1_Sub14Array1[arg1] = local43;
			arg2.method2108(local43, arg1);
		}
		@Pc(74) int local74;
		if ((arg0 & 0x8) != 0) {
			local35 = Static140.aClass1_Sub14_Sub1_2.method2187();
			local74 = Static140.aClass1_Sub14_Sub1_2.method2229();
			arg2.method2091(local35, local74, Static133.anInt3061);
			arg2.anInt2769 = Static133.anInt3061 + 300;
			arg2.anInt2807 = Static140.aClass1_Sub14_Sub1_2.method2227();
		}
		if ((arg0 & 0x800) != 0) {
			local35 = Static140.aClass1_Sub14_Sub1_2.method2241();
			@Pc(103) int[] local103 = new int[local35];
			@Pc(106) int[] local106 = new int[local35];
			@Pc(109) int[] local109 = new int[local35];
			for (@Pc(111) int local111 = 0; local111 < local35; local111++) {
				@Pc(122) int local122 = Static140.aClass1_Sub14_Sub1_2.method2243();
				if (local122 == 65535) {
					local122 = -1;
				}
				local103[local111] = local122;
				local106[local111] = Static140.aClass1_Sub14_Sub1_2.method2199();
				local109[local111] = Static140.aClass1_Sub14_Sub1_2.method2244();
			}
			Static200.method3201(arg2, local103, local106, local109);
		}
		if ((arg0 & 0x400) != 0) {
			local35 = Static140.aClass1_Sub14_Sub1_2.method2187();
			local74 = Static140.aClass1_Sub14_Sub1_2.method2241();
			arg2.method2091(local35, local74, Static133.anInt3061);
		}
		if ((arg0 & 0x40) != 0) {
			arg2.aString177 = Static140.aClass1_Sub14_Sub1_2.method2237();
			if (arg2.aString177.charAt(0) == '~') {
				arg2.aString177 = arg2.aString177.substring(1);
				Static147.method2381(0, arg2.aString177, 2, arg2.method2104(true), arg2.method2104(false));
			} else if (Static56.aClass2_Sub4_Sub2_1 == arg2) {
				Static147.method2381(0, arg2.aString177, 2, arg2.method2104(true), arg2.method2104(false));
			}
			arg2.anInt2836 = 150;
			arg2.anInt2801 = 0;
			arg2.anInt2771 = 0;
		}
		@Pc(259) int local259;
		if ((arg0 & 0x80) != 0) {
			local35 = Static140.aClass1_Sub14_Sub1_2.method2242();
			local74 = Static140.aClass1_Sub14_Sub1_2.method2199();
			@Pc(256) int local256 = Static140.aClass1_Sub14_Sub1_2.method2241();
			local259 = Static140.aClass1_Sub14_Sub1_2.anInt3000;
			@Pc(267) boolean local267 = (local35 & 0x8000) != 0;
			if (arg2.aString182 != null && arg2.aClass167_1 != null) {
				@Pc(278) boolean local278 = false;
				if (local74 <= 1) {
					if (!local267 && (Static50.aBoolean16 && !Static159.aBoolean228 || Static80.aBoolean125)) {
						local278 = true;
					} else if (Static269.method4067(arg2.aString182)) {
						local278 = true;
					}
				}
				if (!local278 && Static286.anInt5741 == 0) {
					Static225.aClass1_Sub14_8.anInt3000 = 0;
					Static140.aClass1_Sub14_Sub1_2.method2209(Static225.aClass1_Sub14_8.aByteArray55, local256);
					@Pc(323) int local323 = -1;
					Static225.aClass1_Sub14_8.anInt3000 = 0;
					@Pc(345) String local345;
					if (local267) {
						@Pc(332) Class84 local332 = Static248.method3835(Static225.aClass1_Sub14_8);
						local35 &= 0x7FFF;
						local323 = local332.anInt2714;
						local345 = local332.aClass1_Sub3_Sub17_1.method3301(Static225.aClass1_Sub14_8);
					} else {
						local345 = Static45.method3520(Static75.method1318(Static265.method4016(Static225.aClass1_Sub14_8)));
					}
					@Pc(368) int local368;
					if (local74 == 1 || local74 == 2) {
						local368 = local267 ? 17 : 1;
					} else {
						local368 = local267 ? 17 : 2;
					}
					arg2.aString177 = local345.trim();
					arg2.anInt2836 = 150;
					arg2.anInt2771 = local35 & 0xFF;
					arg2.anInt2801 = local35 >> 8;
					if (local74 == 2) {
						Static215.method3446("<img=1>" + arg2.method2104(true), local345, null, "<img=1>" + arg2.method2104(false), local368, local323, 0);
					} else if (local74 == 1) {
						Static215.method3446("<img=0>" + arg2.method2104(true), local345, null, "<img=0>" + arg2.method2104(false), local368, local323, 0);
					} else {
						Static215.method3446(arg2.method2104(true), local345, null, arg2.method2104(false), local368, local323, 0);
					}
				}
			}
			Static140.aClass1_Sub14_Sub1_2.anInt3000 = local256 + local259;
		}
		if ((arg0 & 0x2) != 0) {
			local35 = Static140.aClass1_Sub14_Sub1_2.method2243();
			local74 = Static140.aClass1_Sub14_Sub1_2.method2229();
			if (local35 == 65535) {
				local35 = -1;
			}
			Static105.method1738(arg2, local74, local35);
		}
		if ((arg0 & 0x100) != 0) {
			@Pc(523) boolean local523 = true;
			local35 = Static140.aClass1_Sub14_Sub1_2.method2238();
			if (local35 == 65535) {
				local35 = -1;
			}
			local74 = Static140.aClass1_Sub14_Sub1_2.method2245();
			if (local35 != -1 && arg2.anInt2825 != -1 && Static202.method3231(Static28.method611(local35).anInt3368).anInt967 < Static202.method3231(Static28.method611(arg2.anInt2825).anInt3368).anInt967) {
				local523 = false;
			}
			if (local523) {
				arg2.anInt2808 = 0;
				arg2.anInt2785 = 1;
				arg2.anInt2837 = 0;
				arg2.anInt2786 = Static133.anInt3061 + (local74 & 0xFFFF);
				arg2.anInt2825 = local35;
				arg2.anInt2792 = local74 >> 16;
				if (arg2.anInt2786 > Static133.anInt3061) {
					arg2.anInt2837 = -1;
				}
				if (arg2.anInt2825 != -1 && arg2.anInt2786 == Static133.anInt3061) {
					local259 = Static28.method611(arg2.anInt2825).anInt3368;
					if (local259 != -1) {
						@Pc(627) Class32 local627 = Static202.method3231(local259);
						if (local627 != null && local627.anIntArray123 != null) {
							Static154.method2507(Static56.aClass2_Sub4_Sub2_1 == arg2, arg2.anInt2846, arg2.anInt2794, 0, local627);
						}
					}
				}
			}
		}
		if ((arg0 & 0x1) != 0) {
			arg2.anInt2838 = Static140.aClass1_Sub14_Sub1_2.method2243();
			if (arg2.anInt2838 == 65535) {
				arg2.anInt2838 = -1;
			}
		}
		if ((arg0 & 0x200) == 0) {
			return;
		}
		arg2.anInt2834 = Static140.aClass1_Sub14_Sub1_2.method2227();
		arg2.anInt2810 = Static140.aClass1_Sub14_Sub1_2.method2241();
		arg2.anInt2782 = Static140.aClass1_Sub14_Sub1_2.method2241();
		arg2.anInt2806 = Static140.aClass1_Sub14_Sub1_2.method2241();
		arg2.anInt2798 = Static140.aClass1_Sub14_Sub1_2.method2243() + Static133.anInt3061;
		arg2.anInt2767 = Static140.aClass1_Sub14_Sub1_2.method2244() + Static133.anInt3061;
		arg2.anInt2839 = Static140.aClass1_Sub14_Sub1_2.method2227();
		arg2.anInt2787 = 1;
		arg2.anInt2778 = 0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!oj", name = "E", descriptor = "[Z")
	public static boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_182 = new Class103(71, 7);

	@OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
	public static int anInt5046 = 0;

	@OriginalMember(owner = "client!oj", name = "B", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_134 = new Class12(3, 7);

	@OriginalMember(owner = "client!oj", name = "C", descriptor = "Z")
	public static boolean aBoolean575 = false;

	@OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
	public static int anInt5049 = 0;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "()V")
	public static void method3952() {
		for (@Pc(1) int local1 = 0; local1 < Static358.anInt1533; local1++) {
			if (!Static321.aBooleanArray19[local1]) {
				@Pc(10) Class137 local10 = Static45.aClass137Array4[local1];
				@Pc(13) Class1_Sub7 local13 = local10.aClass1_Sub7_2;
				@Pc(16) int local16 = local10.anInt3864;
				@Pc(22) int local22 = local13.method5120() - Static341.anInt5832;
				@Pc(30) int local30 = (local22 * 2 >> Static215.anInt4460) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method5113() - local22 >> Static215.anInt4460;
				@Pc(53) int local53 = local13.method5117() - local22 >> Static215.anInt4460;
				@Pc(61) int local61 = local13.method5117() + local22 >> Static215.anInt4460;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static408.anInt6716) {
					local61 = Static408.anInt6716 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray61[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static37.anInt666) {
						local108 = Static37.anInt666 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class25_Sub5 local141 = Static364.method2862(local16, local125, local78, ns.class);
						if (local141 != null && local141.aByte95 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte95 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray61[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray61[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 4;
								} else if (local168 && !local159) {
									local128 = 2;
								}
							} else {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 - 1 >= local53) {
									local182 = local10.aShortArray61[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray61[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 3;
								} else if (local168 && !local159) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static321.aBooleanArray19[local1] = true;
				Static94.aClass157Array1[local16].method4948(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3958(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static107.anInt2042 >= 100 && !Static334.aBoolean649 || Static107.anInt2042 >= 200) {
			Static208.method2938(Static46.aClass119_19.method2673(Static394.anInt6582));
			return;
		}
		@Pc(29) String local29 = Static440.method5809(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(72) String local72;
		for (@Pc(34) int local34 = 0; local34 < Static107.anInt2042; local34++) {
			@Pc(42) String local42 = Static440.method5809(Static320.aStringArray44[local34]);
			if (local42 != null && local42.equals(local29)) {
				Static208.method2938(arg0 + Static418.aClass119_168.method2673(Static394.anInt6582));
				return;
			}
			if (Static355.aStringArray41[local34] != null) {
				local72 = Static440.method5809(Static355.aStringArray41[local34]);
				if (local72 != null && local72.equals(local29)) {
					Static208.method2938(arg0 + Static418.aClass119_168.method2673(Static394.anInt6582));
					return;
				}
			}
		}
		for (@Pc(107) int local107 = 0; local107 < Static446.anInt7396; local107++) {
			local72 = Static440.method5809(Static264.aStringArray29[local107]);
			if (local72 != null && local72.equals(local29)) {
				Static208.method2938(Static105.aClass119_53.method2673(Static394.anInt6582) + arg0 + Static111.aClass119_61.method2673(Static394.anInt6582));
				return;
			}
			if (Static80.aStringArray10[local107] != null) {
				@Pc(150) String local150 = Static440.method5809(Static80.aStringArray10[local107]);
				if (local150 != null && local150.equals(local29)) {
					Static208.method2938(Static105.aClass119_53.method2673(Static394.anInt6582) + arg0 + Static111.aClass119_61.method2673(Static394.anInt6582));
					return;
				}
			}
		}
		if (Static440.method5809(Static447.aClass25_Sub5_Sub1_Sub2_4.aString51).equals(local29)) {
			Static208.method2938(Static93.aClass119_46.method2673(Static394.anInt6582));
		} else {
			Static52.method867(Static315.aClass103_199);
			Static18.aClass1_Sub28_Sub1_1.method5398(Static349.method4734(arg0));
			Static18.aClass1_Sub28_Sub1_1.method5364(arg0);
		}
	}
}

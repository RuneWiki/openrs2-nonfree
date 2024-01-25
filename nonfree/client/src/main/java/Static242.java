import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!pg", name = "J", descriptor = "[Lclient!lg;")
	public static Class60[] aClass60Array14;

	@OriginalMember(owner = "client!pg", name = "X", descriptor = "Lclient!jp;")
	public static Class106 aClass106_7;

	@OriginalMember(owner = "client!pg", name = "Z", descriptor = "I")
	public static int anInt5093 = 1;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIILclient!hs;)V")
	public static void method4203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub3 arg4) {
		arg4.anInt3567 = (arg1 << 7) + 64;
		arg4.anInt3568 = arg3;
		arg4.anInt3572 = (arg2 << 7) + 64;
		@Pc(24) Class57 local24 = Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2];
		if (local24 != null) {
			@Pc(28) int local28 = 0;
			for (@Pc(31) Class95 local31 = local24.aClass95_2; local31 != null; local31 = local31.aClass95_3) {
				if (local31.aClass2_Sub2_1.aBoolean565) {
					@Pc(41) int local41 = local31.aClass2_Sub2_1.method5416();
					if (local41 != -32768 && local41 < local28) {
						local28 = local41;
					}
				}
			}
			if (local28 < 0) {
				arg4.anInt3568 += local28;
				arg4.aBoolean295 = true;
			}
		}
		if (Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static333.method78(arg0, arg1, arg2);
		}
		Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2].aClass2_Sub3_1 = arg4;
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)V")
	public static void method4204() {
		if (Static17.anInt362 < 102) {
			Static17.anInt362 += 6;
		}
		for (@Pc(14) int local14 = 0; local14 < Static352.anInt6604; local14++) {
			@Pc(20) int local20 = Static129.anIntArray269[local14];
			@Pc(25) char local25 = (char) Static305.anIntArray501[local14];
			if (local20 == 84) {
				Static128.method2579();
			} else if (Static77.aBooleanArray13[82] && local20 == 66) {
				if (Static301.aClipboard1 != null) {
					@Pc(45) String local45 = "";
					for (@Pc(50) int local50 = Static154.aStringArray27.length - 1; local50 >= 0; local50--) {
						if (Static154.aStringArray27[local50] != null && Static154.aStringArray27[local50].length() > 0) {
							local45 = local45 + Static154.aStringArray27[local50] + '\n';
						}
					}
					Static301.aClipboard1.setContents(new StringSelection(local45), null);
				}
			} else if (Static77.aBooleanArray13[82] && local20 == 67) {
				if (Static301.aClipboard1 != null) {
					@Pc(196) Transferable local196 = Static301.aClipboard1.getContents(null);
					if (local196 != null) {
						try {
							@Pc(203) String local203 = (String) local196.getTransferData(DataFlavor.stringFlavor);
							if (local203 != null) {
								@Pc(210) String[] local210 = Static304.method5143(local203, '\n');
								if (local210.length <= 1) {
									Static260.aString193 = Static260.aString193 + local203;
								} else {
									for (@Pc(227) int local227 = 0; local227 < local210.length; local227++) {
										Static260.aString193 = local210[local227];
										Static128.method2579();
									}
								}
							}
						} catch (@Pc(242) Exception local242) {
						}
					}
				}
			} else if (local20 == 85 && Static260.aString193.length() > 0) {
				Static260.aString193 = Static260.aString193.substring(0, Static260.aString193.length() - 1);
			} else if (local20 == 104 && Static137.anInt3096 < Static154.aStringArray27.length) {
				Static137.anInt3096++;
				Static241.method4169();
			} else if (local20 == 105 && Static137.anInt3096 > 0) {
				Static137.anInt3096--;
				Static241.method4169();
			} else if (Static276.method4776(local25) || local25 == ',' || local25 == ' ' || local25 == '_' || local25 == '-' || local25 == '+') {
				Static260.aString193 = Static260.aString193 + (char) Static305.anIntArray501[local14];
			}
		}
		Static352.anInt6604 = 0;
		for (@Pc(263) int local263 = 0; local263 < 100; local263++) {
			@Pc(273) int local273;
			if (Static327.aBooleanArray31[local263]) {
				local273 = Static258.anIntArray440[local263]++;
				if (Static258.anIntArray440[local263] > 102) {
					Static327.aBooleanArray31[local263] = false;
				}
			} else {
				local273 = Static258.anIntArray440[local263]--;
				if (Static258.anIntArray440[local263] < 0) {
					Static139.anIntArray281[local263] = (int) ((double) Static202.anInt4258 * Math.random());
					Static327.anIntArray509[local263] = (int) (Math.random() * 350.0D);
					Static258.anIntArray440[local263] = 0;
					Static327.aBooleanArray31[local263] = true;
				}
			}
		}
		Static240.method4159();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!hd;Z)Z")
	public static boolean method4205(@OriginalArg(0) Class2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static307.aClass26Array3 == Static5.aClass26Array1;
		@Pc(8) int local8 = 0;
		arg0.method5415();
		if (arg0.aShort85 < 0 || arg0.aShort84 < 0 || arg0.aShort83 >= Static151.anInt3338 || arg0.aShort82 >= Static220.anInt4569) {
			return false;
		}
		@Pc(34) int local34;
		@Pc(37) int local37;
		for (@Pc(30) int local30 = arg0.aShort85; local30 <= arg0.aShort83; local30++) {
			for (local34 = arg0.aShort84; local34 <= arg0.aShort82; local34++) {
				local37 = 0;
				if (local30 > arg0.aShort85) {
					local37++;
				}
				if (local30 < arg0.aShort83) {
					local37 += 4;
				}
				if (local34 > arg0.aShort84) {
					local37 += 8;
				}
				if (local34 < arg0.aShort82) {
					local37 += 2;
				}
				Static333.method78(arg0.aByte73, local30, local34);
				@Pc(71) Class57 local71 = Static18.aClass57ArrayArrayArray1[arg0.aByte73][local30][local34];
				@Pc(76) Class95 local76 = Static240.method4158(local37, arg0);
				@Pc(79) Class95 local79 = local71.aClass95_2;
				if (local79 == null) {
					local71.aClass95_2 = local76;
				} else {
					while (local79.aClass95_3 != null) {
						local79 = local79.aClass95_3;
					}
					local79.aClass95_3 = local76;
				}
				local71.aByte30 = (byte) (local71.aByte30 | local37);
				if (local6 && Static170.anIntArrayArray37[local30][local34] != 0) {
					local8 = Static170.anIntArrayArray37[local30][local34];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local34 = arg0.aShort85; local34 <= arg0.aShort83; local34++) {
				for (local37 = arg0.aShort84; local37 <= arg0.aShort82; local37++) {
					if (Static170.anIntArrayArray37[local34][local37] == 0) {
						Static170.anIntArrayArray37[local34][local37] = local8;
					}
				}
			}
		}
		if (arg1) {
			Static124.aClass2_Sub2Array2[Static246.anInt5145++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([I[JIZI)V")
	public static void method4209(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(18) int local18 = (arg2 + arg3) / 2;
		@Pc(20) int local20 = arg2;
		@Pc(24) long local24 = arg1[local18];
		arg1[local18] = arg1[arg3];
		arg1[arg3] = local24;
		@Pc(38) int local38 = arg0[local18];
		arg0[local18] = arg0[arg3];
		arg0[arg3] = local38;
		for (@Pc(50) int local50 = arg2; local50 < arg3; local50++) {
			if (arg1[local50] < (long) (local50 & 0x1) + local24) {
				@Pc(67) long local67 = arg1[local50];
				arg1[local50] = arg1[local20];
				arg1[local20] = local67;
				@Pc(81) int local81 = arg0[local50];
				arg0[local50] = arg0[local20];
				arg0[local20++] = local81;
			}
		}
		arg1[arg3] = arg1[local20];
		arg1[local20] = local24;
		arg0[arg3] = arg0[local20];
		arg0[local20] = local38;
		method4209(arg0, arg1, arg2, local20 - 1);
		method4209(arg0, arg1, local20 + 1, arg3);
	}
}

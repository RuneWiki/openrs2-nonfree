import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	public static int anInt30;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
	public static int anInt33;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "[I")
	public static final int[] anIntArray2 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "Lclient!oq;")
	public static final Class193 aClass193_1 = new Class193("", 13);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public static void method26() {
		for (@Pc(15) Class48_Sub4 local15 = (Class48_Sub4) Static328.aClass128_9.method2830(); local15 != null; local15 = (Class48_Sub4) Static328.aClass128_9.method2830()) {
			Static218.method3364(local15);
		}
		@Pc(38) int local38;
		@Pc(37) int local37;
		if (Static8.aClass173_Sub1_1.method3965(Static155.anInt2774)) {
			local38 = 0;
			local37 = 3;
		} else {
			local37 = Static3.anInt6323;
			local38 = Static3.anInt6323;
		}
		Static54.method1022();
		for (@Pc(47) int local47 = local38; local47 <= local37; local47++) {
			Static54.method1027();
			Static54.method1029(local47);
			Static54.method1030(local47);
		}
		Static54.method1018();
		Static54.method1019();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZ)I")
	public static int method27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(49) int local49 = Static277.method4191(arg1 - 1, arg0 + -1) + Static277.method4191(arg1 - 1, arg0 + 1) + Static277.method4191(arg1 - -1, arg0 + -1) + Static277.method4191(arg1 + 1, arg0 + 1);
		@Pc(78) int local78 = Static277.method4191(arg1, arg0 - 1) + Static277.method4191(arg1, arg0 + 1) + Static277.method4191(arg1 + -1, arg0) + Static277.method4191(arg1 + 1, arg0);
		@Pc(83) int local83 = Static277.method4191(arg1, arg0);
		return local83 / 4 + local78 / 8 + local49 / 16;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "()V")
	public static void method29() {
		for (@Pc(1) int local1 = 0; local1 < Static208.anInt3623; local1++) {
			if (!Static198.aBooleanArray18[local1]) {
				@Pc(10) Class66 local10 = Static304.aClass66Array1[local1];
				@Pc(13) Class6_Sub6 local13 = local10.aClass6_Sub6_1;
				@Pc(16) int local16 = local10.anInt1662;
				@Pc(22) int local22 = local13.method1162() - Static25.anInt7191;
				@Pc(30) int local30 = (local22 * 2 >> Static301.anInt2759) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method1163() - local22 >> Static301.anInt2759;
				@Pc(53) int local53 = local13.method1169() - local22 >> Static301.anInt2759;
				@Pc(61) int local61 = local13.method1169() + local22 >> Static301.anInt2759;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static364.anInt6134) {
					local61 = Static364.anInt6134 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray29[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static401.anInt6621) {
						local108 = Static401.anInt6621 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class3_Sub3 local141 = Static49.method903(local16, local125, local78, hs.class);
						if (local141 != null && local141.aByte94 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte94 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray29[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray29[local32 - 1];
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
									local182 = local10.aShortArray29[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray29[local32 + 1];
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
				Static198.aBooleanArray18[local1] = true;
				Static420.aClass84Array4[local16].method5323(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!tq;)Ljava/lang/String;")
	public static String method30(@OriginalArg(1) Class239 arg0) {
		if (Static54.method1017(arg0).method4842() == 0) {
			return null;
		} else if (arg0.aString58 == null || arg0.aString58.trim().length() == 0) {
			return Static268.aBoolean330 ? "Hidden-use" : null;
		} else {
			return arg0.aString58;
		}
	}
}

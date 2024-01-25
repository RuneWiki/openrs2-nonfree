import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!at", name = "g", descriptor = "[Lclient!bj;")
	public static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!at", name = "j", descriptor = "Lclient!fg;")
	public static Class4_Sub18 aClass4_Sub18_1;

	@OriginalMember(owner = "client!at", name = "m", descriptor = "I")
	public static int anInt439;

	@OriginalMember(owner = "client!at", name = "h", descriptor = "Lclient!gf;")
	public static final Class120 aClass120_2 = new Class120();

	@OriginalMember(owner = "client!at", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray15 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(I)V")
	public static void method426() {
		if (Static147.aClass161_4.aBoolean344 && Static132.aClass300_2.anInt7993 != -1) {
			Static132.method2774(Static132.aClass300_2.aString89, Static132.aClass300_2.anInt7993);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BLclient!cea;I)V")
	public static void method427(@OriginalArg(1) Class4_Sub9_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static295.anInt5451 = 0;
		Static39.aBoolean66 = false;
		Static363.method5447(arg0);
		Static157.method5009(arg0);
		if (Static39.aBoolean66) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt7219 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt7219 + " psize:" + arg1);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(CI)B")
	public static byte method428(@OriginalArg(0) char arg0) {
		@Pc(26) byte local26;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local26 = (byte) arg0;
		} else if (arg0 == '€') {
			local26 = -128;
		} else if (arg0 == '‚') {
			local26 = -126;
		} else if (arg0 == 'ƒ') {
			local26 = -125;
		} else if (arg0 == '„') {
			local26 = -124;
		} else if (arg0 == '…') {
			local26 = -123;
		} else if (arg0 == '†') {
			local26 = -122;
		} else if (arg0 == '‡') {
			local26 = -121;
		} else if (arg0 == 'ˆ') {
			local26 = -120;
		} else if (arg0 == '‰') {
			local26 = -119;
		} else if (arg0 == 'Š') {
			local26 = -118;
		} else if (arg0 == '‹') {
			local26 = -117;
		} else if (arg0 == 'Œ') {
			local26 = -116;
		} else if (arg0 == 'Ž') {
			local26 = -114;
		} else if (arg0 == '‘') {
			local26 = -111;
		} else if (arg0 == '’') {
			local26 = -110;
		} else if (arg0 == '“') {
			local26 = -109;
		} else if (arg0 == '”') {
			local26 = -108;
		} else if (arg0 == '•') {
			local26 = -107;
		} else if (arg0 == '–') {
			local26 = -106;
		} else if (arg0 == '—') {
			local26 = -105;
		} else if (arg0 == '˜') {
			local26 = -104;
		} else if (arg0 == '™') {
			local26 = -103;
		} else if (arg0 == 'š') {
			local26 = -102;
		} else if (arg0 == '›') {
			local26 = -101;
		} else if (arg0 == 'œ') {
			local26 = -100;
		} else if (arg0 == 'ž') {
			local26 = -98;
		} else if (arg0 == 'Ÿ') {
			local26 = -97;
		} else {
			local26 = 63;
		}
		return local26;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "()V")
	public static void method430() {
		for (@Pc(1) int local1 = 0; local1 < Static413.anInt7145; local1++) {
			if (!Static396.aBooleanArray28[local1]) {
				@Pc(10) Class32 local10 = aClass32Array1[local1];
				@Pc(13) Class4_Sub32 local13 = local10.aClass4_Sub32_2;
				@Pc(16) int local16 = local10.anInt781;
				@Pc(22) int local22 = local13.method6621() - Static436.anInt7494;
				@Pc(30) int local30 = (local22 * 2 >> Static41.anInt810) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method6614() - local22 >> Static41.anInt810;
				@Pc(53) int local53 = local13.method6617() - local22 >> Static41.anInt810;
				@Pc(61) int local61 = local13.method6617() + local22 >> Static41.anInt810;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static357.anInt6212) {
					local61 = Static357.anInt6212 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray20[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static173.anInt3719) {
						local108 = Static173.anInt3719 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class10_Sub1 local141 = Static541.method7510(local16, local125, local78, ag.class);
						if (local141 != null && local141.aByte102 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte102 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray20[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray20[local32 - 1];
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
									local182 = local10.aShortArray20[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray20[local32 + 1];
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
				Static396.aBooleanArray28[local1] = true;
				Static112.aClass16Array3[local16].method8042(local13, local37);
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!lu", name = "q", descriptor = "F")
	public static float aFloat119;

	@OriginalMember(owner = "client!lu", name = "r", descriptor = "I")
	public static int anInt5430;

	@OriginalMember(owner = "client!lu", name = "s", descriptor = "Lclient!ls;")
	public static Class220 aClass220_2;

	@OriginalMember(owner = "client!lu", name = "t", descriptor = "Lclient!bt;")
	public static Class34 aClass34_79;

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V")
	public static void method4777() {
		@Pc(10) Class4_Sub27 local10;
		for (local10 = (Class4_Sub27) Static26.aClass163_13.method3639(); local10 != null; local10 = (Class4_Sub27) Static26.aClass163_13.method3640()) {
			if (local10.aBoolean348) {
				local10.method9000();
			} else {
				local10.aBoolean347 = true;
				if (local10.anInt4663 >= 0 && local10.anInt4666 >= 0 && local10.anInt4663 < Static224.anInt3557 && local10.anInt4666 < Static267.anInt4309) {
					Static464.method6459(local10);
				}
			}
		}
		for (local10 = (Class4_Sub27) Static450.aClass163_49.method3639(); local10 != null; local10 = (Class4_Sub27) Static450.aClass163_49.method3640()) {
			if (local10.aBoolean348) {
				local10.method9000();
			} else {
				local10.aBoolean347 = true;
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(CI)C")
	public static char method4778(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "()V")
	public static void method4780() {
		for (@Pc(1) int local1 = 0; local1 < Static355.anInt5402; local1++) {
			if (!Static17.aBooleanArray2[local1]) {
				@Pc(10) Class85 local10 = Static217.aClass85Array1[local1];
				@Pc(13) Class4_Sub29 local13 = local10.aClass4_Sub29_2;
				@Pc(16) int local16 = local10.anInt2270;
				@Pc(22) int local22 = local13.method7632() - Static85.anInt1770;
				@Pc(30) int local30 = (local22 * 2 >> Static273.anInt4424) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method7627() - local22 >> Static273.anInt4424;
				@Pc(53) int local53 = local13.method7628() - local22 >> Static273.anInt4424;
				@Pc(61) int local61 = local13.method7628() + local22 >> Static273.anInt4424;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static245.anInt7888) {
					local61 = Static245.anInt7888 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray34[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static51.anInt1108) {
						local108 = Static51.anInt1108 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class3_Sub1_Sub2 local141 = Static130.method2321(local16, local125, local78, ar.class);
						if (local141 != null && local141.aByte143 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte143 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray34[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray34[local32 - 1];
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
									local182 = local10.aShortArray34[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray34[local32 + 1];
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
				Static17.aBooleanArray2[local1] = true;
				Static140.aClass42Array4[local16].method7451(local13, local37);
			}
		}
	}
}

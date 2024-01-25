import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "Lclient!wk;")
	public static Class271 aClass271_2;

	@OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
	public static int anInt2374;

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_43 = new Class242(6, -1);

	@OriginalMember(owner = "client!hf", name = "O", descriptor = "[I")
	public static final int[] anIntArray197 = new int[14];

	@OriginalMember(owner = "client!hf", name = "R", descriptor = "[F")
	public static final float[] aFloatArray6 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(III)Z")
	public static boolean method1909(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)V")
	public static void method1910(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub3_Sub1 local12 = Static427.method5426(arg0, 1);
		local12.method385();
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "()V")
	public static void method1913() {
		for (@Pc(1) int local1 = 0; local1 < Static24.anInt352; local1++) {
			@Pc(6) Class11_Sub1 local6 = Static56.aClass11_Sub1Array1[local1];
			Static311.method4112(local6);
			Static56.aClass11_Sub1Array1[local1] = null;
		}
		Static24.anInt352 = 0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZILclient!oi;I)Lclient!ul;")
	public static Class252 method1914(@OriginalArg(2) Class185 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte[] local14 = arg0.method4002(arg1, 0);
		return local14 == null ? null : new Class252(local14);
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "()V")
	public static void method1915() {
		for (@Pc(1) int local1 = 0; local1 < Static395.anInt6364; local1++) {
			if (!Static192.aBooleanArray75[local1]) {
				@Pc(10) Class93 local10 = Static203.aClass93Array1[local1];
				@Pc(13) Class1_Sub29 local13 = local10.aClass1_Sub29_2;
				@Pc(16) int local16 = local10.anInt2079;
				@Pc(22) int local22 = local13.method5840() - Static324.anInt5325;
				@Pc(30) int local30 = (local22 * 2 >> Static41.anInt612) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method5837() - local22 >> Static41.anInt612;
				@Pc(53) int local53 = local13.method5838() - local22 >> Static41.anInt612;
				@Pc(61) int local61 = local13.method5838() + local22 >> Static41.anInt612;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static325.anInt5351) {
					local61 = Static325.anInt5351 - 1;
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
					if (local108 >= Static174.anInt2873) {
						local108 = Static174.anInt2873 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class11_Sub1 local141 = Static423.method5398(local16, local125, local78, eq.class);
						if (local141 != null && local141.aByte89 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte89 == 1) {
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
				Static192.aBooleanArray75[local1] = true;
				Static452.aClass139Array3[local16].method5365(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
	public static void method1917() {
		for (@Pc(10) Class1_Sub20 local10 = (Class1_Sub20) Static303.aClass14_33.method203(); local10 != null; local10 = (Class1_Sub20) Static303.aClass14_33.method208()) {
			if (local10.anInt2541 > 0) {
				local10.anInt2541--;
			}
			if (local10.anInt2541 != 0) {
				if (local10.anInt2533 > 0) {
					local10.anInt2533--;
				}
				if (local10.anInt2533 == 0 && local10.anInt2536 >= 1 && local10.anInt2539 >= 1 && Static147.anInt2300 - 2 >= local10.anInt2536 && local10.anInt2539 <= Static293.anInt4886 - 2 && (local10.anInt2546 < 0 || Static108.method1351(local10.anInt2546, local10.anInt2543))) {
					Static298.method3979(local10.anInt2543, local10.anInt2542, local10.anInt2539, local10.anInt2544, local10.anInt2536, local10.anInt2546, local10.anInt2537, -1);
					local10.anInt2533 = -1;
					if (local10.anInt2546 == local10.anInt2534 && local10.anInt2534 == -1) {
						local10.method5953();
					} else if (local10.anInt2534 == local10.anInt2546 && local10.anInt2540 == local10.anInt2544 && local10.anInt2535 == local10.anInt2543) {
						local10.method5953();
					}
				}
			} else if (local10.anInt2534 < 0 || Static108.method1351(local10.anInt2534, local10.anInt2535)) {
				Static298.method3979(local10.anInt2535, local10.anInt2542, local10.anInt2539, local10.anInt2540, local10.anInt2536, local10.anInt2534, local10.anInt2537, -1);
				local10.method5953();
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "Lclient!pu;")
	public static Class270 aClass270_111;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_266 = new Class235(22, 14);

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "Lclient!uc;")
	public static final Class324 aClass324_50 = new Class324("", 13);

	@OriginalMember(owner = "client!ui", name = "s", descriptor = "[F")
	public static final float[] aFloatArray60 = new float[4];

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "Z")
	public static boolean aBoolean692 = false;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "()V")
	public static void method7278() {
		for (@Pc(1) int local1 = 0; local1 < Static369.anInt6129; local1++) {
			if (!Static571.aBooleanArray25[local1]) {
				@Pc(10) Class79 local10 = Static172.aClass79Array1[local1];
				@Pc(13) Class1_Sub18 local13 = local10.aClass1_Sub18_2;
				@Pc(16) int local16 = local10.anInt2033;
				@Pc(22) int local22 = local13.method4104() - Static142.anInt2687;
				@Pc(30) int local30 = (local22 * 2 >> Static351.anInt5832) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method4107() - local22 >> Static351.anInt5832;
				@Pc(53) int local53 = local13.method4098() - local22 >> Static351.anInt5832;
				@Pc(61) int local61 = local13.method4098() + local22 >> Static351.anInt5832;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static507.anInt8645) {
					local61 = Static507.anInt8645 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray45[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static27.anInt373) {
						local108 = Static27.anInt373 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class8_Sub3_Sub3 local141 = Static14.method147(local16, local125, local78, mw.class);
						if (local141 != null && local141.aByte125 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte125 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray45[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray45[local32 - 1];
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
									local182 = local10.aShortArray45[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray45[local32 + 1];
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
				Static571.aBooleanArray25[local1] = true;
				Static199.aClass47Array1[local16].method7542(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!de;[I[I[IB)V")
	public static void method7279(@OriginalArg(0) Class8_Sub3_Sub3_Sub1_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(11) int local11 = arg2[local3];
			@Pc(15) int local15 = arg3[local3];
			@Pc(19) int local19 = arg1[local3];
			for (@Pc(21) int local21 = 0; local15 != 0 && arg0.aClass255Array3.length > local21; local21++) {
				if ((local15 & 0x1) != 0) {
					if (local11 == -1) {
						arg0.aClass255Array3[local21] = null;
					} else {
						@Pc(39) Class290 local39 = Static192.aClass211_1.method4277(local11);
						@Pc(42) int local42 = local39.anInt7801;
						@Pc(47) Class255 local47 = arg0.aClass255Array3[local21];
						if (local47 != null) {
							if (local47.anInt6889 == local11) {
								if (local42 == 0) {
									local47 = arg0.aClass255Array3[local21] = null;
								} else if (local42 == 1) {
									local47.anInt6893 = 0;
									local47.anInt6887 = local19;
									local47.anInt6896 = 0;
									local47.anInt6888 = 0;
									local47.anInt6897 = 1;
									Static137.method2090(local39, arg0.anInt9365, 0, arg0 == Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1, arg0.anInt9370, arg0.aByte123);
								} else if (local42 == 2) {
									local47.anInt6896 = 0;
								}
							} else if (local39.anInt7802 >= Static192.aClass211_1.method4277(local47.anInt6889).anInt7802) {
								local47 = arg0.aClass255Array3[local21] = null;
							}
						}
						if (local47 == null) {
							local47 = arg0.aClass255Array3[local21] = new Class255();
							local47.anInt6893 = 0;
							local47.anInt6896 = 0;
							local47.anInt6888 = 0;
							local47.anInt6887 = local19;
							local47.anInt6897 = 1;
							local47.anInt6889 = local11;
							Static137.method2090(local39, arg0.anInt9365, 0, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 == arg0, arg0.anInt9370, arg0.aByte123);
						}
					}
				}
				local15 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!mo;B)Lclient!ul;")
	public static Class332 method7280(@OriginalArg(0) Class1_Sub35 arg0) {
		@Pc(15) int local15 = arg0.method5771();
		return new Class332(local15);
	}
}

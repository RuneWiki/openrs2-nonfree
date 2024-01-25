import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!rr", name = "A", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_127 = new Class45(66, 9);

	@OriginalMember(owner = "client!rr", name = "C", descriptor = "I")
	public static int anInt8018 = 0;

	@OriginalMember(owner = "client!rr", name = "D", descriptor = "Z")
	public static boolean aBoolean553 = false;

	@OriginalMember(owner = "client!rr", name = "E", descriptor = "I")
	public static int anInt8019 = 0;

	@OriginalMember(owner = "client!rr", name = "H", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_232 = new Class88("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!rr", name = "I", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_233 = new Class88("Loaded HW3D", "HW3D geladen", "HW3D chargé", "HW3D carregado");

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(III)I")
	public static int method6625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(39) int local39 = Static298.method2938(arg1 + 45365, 4, arg0 + 91923) + (Static298.method2938(arg1 + 10294, 2, arg0 + 37821) - 128 >> 1) + (Static298.method2938(arg1, 1, arg0) + -128 >> 2) - 128;
		local39 = (int) ((double) local39 * 0.3D) + 35;
		if (local39 < 10) {
			local39 = 10;
		} else if (local39 > 60) {
			local39 = 60;
		}
		return local39;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "()V")
	public static void method6627() {
		for (@Pc(1) int local1 = 0; local1 < Static423.anInt78; local1++) {
			if (!Static449.aBooleanArray45[local1]) {
				@Pc(10) Class97 local10 = Static485.aClass97Array1[local1];
				@Pc(13) Class12_Sub7 local13 = local10.aClass12_Sub7_1;
				@Pc(16) int local16 = local10.anInt2937;
				@Pc(22) int local22 = local13.method5123() - Static225.anInt4810;
				@Pc(30) int local30 = (local22 * 2 >> Static193.anInt4311) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method5124() - local22 >> Static193.anInt4311;
				@Pc(53) int local53 = local13.method5117() - local22 >> Static193.anInt4311;
				@Pc(61) int local61 = local13.method5117() + local22 >> Static193.anInt4311;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static509.anInt9164) {
					local61 = Static509.anInt9164 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray43[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static537.anInt9566) {
						local108 = Static537.anInt9566 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class30_Sub1 local141 = Static531.method7866(local16, local125, local78, lm.class);
						if (local141 != null && local141.aByte100 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte100 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray43[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray43[local32 - 1];
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
									local182 = local10.aShortArray43[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray43[local32 + 1];
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
				Static449.aBooleanArray45[local1] = true;
				Static51.aClass215Array6[local16].method7834(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BI)V")
	public static void method6628(@OriginalArg(1) int arg0) {
		Static439.method6676();
		@Pc(11) int local11 = Static367.aClass146_1.method3868(arg0).anInt8682;
		if (local11 == 0) {
			return;
		}
		@Pc(23) int local23 = Static393.aClass31_1.anIntArray117[arg0];
		if (local11 == 6) {
			Static261.anInt5287 = local23;
		}
		if (local11 == 5) {
			Static268.anInt5393 = local23;
		}
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(III)I")
	public static int method6629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static268.anIntArray378[arg0 & 0x3] : Static417.anIntArray685[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(III)Z")
	public static boolean method6630(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}
}

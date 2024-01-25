import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ct", name = "bc", descriptor = "Lclient!pl;")
	public static Class1_Sub35 aClass1_Sub35_1;

	@OriginalMember(owner = "client!ct", name = "ec", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_35 = new Class158("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!ct", name = "gc", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_27 = new Class177(51, 3);

	@OriginalMember(owner = "client!ct", name = "hc", descriptor = "Lclient!ui;")
	public static final Class248 aClass248_2 = new Class248("WTQA", 2);

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!ih;B)V")
	public static void method1229(@OriginalArg(0) Class106_Sub2 arg0) {
		@Pc(12) byte[] local12;
		if (Static201.anObject10 == null) {
			@Pc(5) Class70_Sub1_Sub1 local5 = new Class70_Sub1_Sub1();
			local12 = local5.method1628();
			Static201.anObject10 = Static320.method4547(local12);
		}
		if (Static433.anObject19 == null) {
			@Pc(27) Class70_Sub2_Sub1 local27 = new Class70_Sub2_Sub1();
			local12 = local27.method5674();
			Static433.anObject19 = Static320.method4547(local12);
		}
		@Pc(42) Class110 local42 = arg0.aClass110_1;
		if (local42.method2637() && Static24.anObject1 == null) {
			local12 = Static45.method856(new Class12_Sub1(419684), 16.0F, 4.0F, 0.6F, 0.5F, 4.0F);
			Static24.anObject1 = Static320.method4547(local12);
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZIIIILclient!qs;I)V")
	public static void method1230(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class211 arg2) {
		Static199.anInt4097 = arg1;
		Static249.anInt4852 = 0;
		Static353.aBoolean476 = false;
		Static385.anInt7047 = 2;
		Static269.anInt5203 = arg0;
		Static225.aClass211_57 = arg2;
		Static133.anInt2954 = 1;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(ZI)I")
	public static int method1233(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public static String method1234(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "()V")
	public static void method1235() {
		for (@Pc(1) int local1 = 0; local1 < Static315.anInt5904; local1++) {
			if (!Static278.aBooleanArray19[local1]) {
				@Pc(10) Class75 local10 = Static135.aClass75Array1[local1];
				@Pc(13) Class1_Sub4 local13 = local10.aClass1_Sub4_2;
				@Pc(16) int local16 = local10.anInt2355;
				@Pc(22) int local22 = local13.method3805() - Static333.anInt6111;
				@Pc(30) int local30 = (local22 * 2 >> Static198.anInt7947) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method3813() - local22 >> Static198.anInt7947;
				@Pc(53) int local53 = local13.method3809() - local22 >> Static198.anInt7947;
				@Pc(61) int local61 = local13.method3809() + local22 >> Static198.anInt7947;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static198.anInt7949) {
					local61 = Static198.anInt7949 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray55[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static216.anInt4346) {
						local108 = Static216.anInt4346 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class30_Sub1 local141 = Static461.method5974(local16, local125, local78, ol.class);
						if (local141 != null && local141.aByte103 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte103 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray55[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray55[local32 - 1];
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
									local182 = local10.aShortArray55[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray55[local32 + 1];
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
				Static278.aBooleanArray19[local1] = true;
				Static396.aClass96Array5[local16].method4430(local13, local37);
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!tp", name = "l", descriptor = "Lclient!qa;")
	public static Class26 aClass26_9;

	@OriginalMember(owner = "client!tp", name = "p", descriptor = "Ljava/lang/Object;")
	public static Object anObject8;

	@OriginalMember(owner = "client!tp", name = "i", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_61 = new Class129(4);

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_139 = new Class256("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!tp", name = "n", descriptor = "[Lclient!dr;")
	public static final Class2_Sub2_Sub7[] aClass2_Sub2_Sub7Array3 = new Class2_Sub2_Sub7[14];

	@OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
	public static int anInt6831 = 0;

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V")
	public static void method5352() {
		Static20.aClass245_1.method5497();
		Static400.aClass239_5.method5401();
		Static10.aClass61_1.method1484();
		Static406.aClass150_3.method3513();
		Static417.aClass234_2.method5357();
		Static350.aClass149_2.method3493();
		Static9.aClass194_1.method4378();
		Static137.aClass16_2.method250();
		Static363.aClass165_1.method3914();
		Static417.aClass237_1.method5378();
		Static4.aClass136_1.method3180();
		Static325.aClass221_4.method5017();
		Static304.aClass173_4.method4020();
		Static31.aClass93_2.method1861();
		Static150.aClass43_1.method1211();
		Static303.aClass35_1.method995();
		Static148.aClass123_1.method2824();
		Static48.aClass97_1.method1988();
		Static164.aClass246_2.method5509();
		Static56.aClass252_1.method5645();
		Static296.method4312();
		Static189.method2980();
		Static274.method4073();
		Static132.method1918();
		Static356.aClass129_54.method3026();
		Static342.aClass129_53.method3026();
		Static190.aClass129_30.method3026();
		Static173.aClass129_27.method3026();
		Static290.aClass129_49.method3026();
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "()V")
	public static void method5353() {
		for (@Pc(1) int local1 = 0; local1 < Static149.anInt2847; local1++) {
			if (!Static448.aBooleanArray54[local1]) {
				@Pc(10) Class168 local10 = Static77.aClass168Array9[local1];
				@Pc(13) Class2_Sub7 local13 = local10.aClass2_Sub7_2;
				@Pc(16) int local16 = local10.anInt4872;
				@Pc(22) int local22 = local13.method2992() - Static176.anInt3421;
				@Pc(30) int local30 = (local22 * 2 >> Static250.anInt4056) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method2991() - local22 >> Static250.anInt4056;
				@Pc(53) int local53 = local13.method2997() - local22 >> Static250.anInt4056;
				@Pc(61) int local61 = local13.method2997() + local22 >> Static250.anInt4056;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static360.anInt6340) {
					local61 = Static360.anInt6340 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray54[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static86.anInt2009) {
						local108 = Static86.anInt2009 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class4_Sub2 local141 = Static80.method1405(local16, local125, local78, dm.class);
						if (local141 != null && local141.aByte91 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte91 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray54[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray54[local32 - 1];
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
									local182 = local10.aShortArray54[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray54[local32 + 1];
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
				Static448.aBooleanArray54[local1] = true;
				Static372.aClass106Array11[local16].method5480(local13, local37);
			}
		}
	}
}

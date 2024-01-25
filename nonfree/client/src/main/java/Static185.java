import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!he", name = "e", descriptor = "I")
	public static int anInt3726;

	@OriginalMember(owner = "client!he", name = "f", descriptor = "I")
	public static int anInt3727;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_50 = new Class276(106, 0);

	@OriginalMember(owner = "client!he", name = "c", descriptor = "[I")
	public static int[] anIntArray262 = new int[1];

	@OriginalMember(owner = "client!he", name = "d", descriptor = "Lclient!en;")
	public static final Class87 aClass87_6 = new Class87(1);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIII)V")
	public static void method3271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == arg1) {
			Static337.method5790(arg3, arg2, arg4, arg0);
		} else if (Static535.anInt9696 <= arg0 - arg4 && Static35.anInt993 >= arg0 + arg4 && Static55.anInt1303 <= arg2 - arg1 && Static208.anInt4309 >= arg1 + arg2) {
			Static321.method5544(arg1, arg4, arg2, arg0, arg3);
		} else {
			Static110.method2296(arg3, arg1, arg0, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
	public static void method3273() {
		for (@Pc(1) int local1 = 0; local1 < Static464.anInt8684; local1++) {
			if (!Static395.aBooleanArray16[local1]) {
				@Pc(10) Class212 local10 = Static464.aClass212Array1[local1];
				@Pc(13) Class3_Sub28 local13 = local10.aClass3_Sub28_2;
				@Pc(16) int local16 = local10.anInt6629;
				@Pc(22) int local22 = local13.method8154() - Static377.anInt7321;
				@Pc(30) int local30 = (local22 * 2 >> Static309.anInt6172) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method8156() - local22 >> Static309.anInt6172;
				@Pc(53) int local53 = local13.method8158() - local22 >> Static309.anInt6172;
				@Pc(61) int local61 = local13.method8158() + local22 >> Static309.anInt6172;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static416.anInt10065) {
					local61 = Static416.anInt10065 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray97[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static223.anInt4520) {
						local108 = Static223.anInt4520 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class2_Sub2 local141 = Static200.method3364(local16, local125, local78, mca.class);
						if (local141 != null && local141.aByte104 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte104 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray97[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray97[local32 - 1];
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
									local182 = local10.aShortArray97[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray97[local32 + 1];
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
				Static395.aBooleanArray16[local1] = true;
				Static224.aClass4Array3[local16].method8448(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	public static void method3274() {
		@Pc(5) int local5 = 0;
		if (Static455.aClass3_Sub27_Sub1_1 != null) {
			local5 = Static455.aClass3_Sub27_Sub1_1.method4058(Static275.anInt5823);
		}
		@Pc(38) int local38;
		@Pc(45) int local45;
		if (local5 == 2) {
			local38 = Static3.anInt172 <= 800 ? Static3.anInt172 : 800;
			local45 = Static232.anInt4725 > 600 ? 600 : Static232.anInt4725;
			Static524.anInt9579 = (Static3.anInt172 - local38) / 2;
			Static582.anInt10234 = local38;
			Static426.anInt8255 = 0;
			Static294.anInt10217 = local45;
		} else if (local5 == 1) {
			local38 = Static3.anInt172 <= 1024 ? Static3.anInt172 : 1024;
			local45 = Static232.anInt4725 > 768 ? 768 : Static232.anInt4725;
			Static582.anInt10234 = local38;
			Static524.anInt9579 = (Static3.anInt172 - local38) / 2;
			Static294.anInt10217 = local45;
			Static426.anInt8255 = 0;
		} else {
			Static524.anInt9579 = 0;
			Static294.anInt10217 = Static232.anInt4725;
			Static582.anInt10234 = Static3.anInt172;
			Static426.anInt8255 = 0;
		}
	}
}

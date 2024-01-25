import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!aia", name = "o", descriptor = "I")
	public static int anInt324;

	@OriginalMember(owner = "client!aia", name = "l", descriptor = "Lclient!si;")
	public static final Class335 aClass335_2 = new Class335(64);

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "()V")
	public static void method345() {
		for (@Pc(1) int local1 = 0; local1 < Static262.anInt5002; local1++) {
			if (!Static345.aBooleanArray36[local1]) {
				@Pc(10) Class84 local10 = Static320.aClass84Array8[local1];
				@Pc(13) Class2_Sub13 local13 = local10.aClass2_Sub13_1;
				@Pc(16) int local16 = local10.anInt2418;
				@Pc(22) int local22 = local13.method9407() - Static124.anInt2431;
				@Pc(30) int local30 = (local22 * 2 >> Static170.anInt3602) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method9411() - local22 >> Static170.anInt3602;
				@Pc(53) int local53 = local13.method9406() - local22 >> Static170.anInt3602;
				@Pc(61) int local61 = local13.method9406() + local22 >> Static170.anInt3602;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static202.anInt4238) {
					local61 = Static202.anInt4238 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray50[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static585.anInt10170) {
						local108 = Static585.anInt10170 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class15_Sub3_Sub3 local141 = Static174.method3415(local16, local125, local78, km.class);
						if (local141 != null && local141.aByte86 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte86 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray50[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray50[local32 - 1];
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
									local182 = local10.aShortArray50[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray50[local32 + 1];
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
				Static345.aBooleanArray36[local1] = true;
				Static245.aClass18Array14[local16].method8543(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ILclient!s;)V")
	public static void method346(@OriginalArg(0) int arg0, @OriginalArg(1) Class18 arg1) {
		Static245.aClass18Array14[arg0] = arg1;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ZII)V")
	public static void method347(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class2_Sub30 local15 = arg0 ? Static366.aClass2_Sub30_1 : Static396.aClass2_Sub30_2;
		if (local15 == null || arg1 < 0 || local15.anInt4562 <= arg1) {
			return;
		}
		@Pc(32) Class11 local32 = local15.aClass11Array1[arg1];
		if (local32.aByte1 != -1) {
			return;
		}
		@Pc(40) String local40 = local32.aString1;
		@Pc(45) Class2_Sub52 local45 = Static311.method5098(Static339.aClass341_63, Static125.aClass179_1);
		local45.aClass2_Sub8_Sub2_2.method5170(Static297.method4908(local40) + 3);
		local45.aClass2_Sub8_Sub2_2.method5170(arg0 ? 1 : 0);
		local45.aClass2_Sub8_Sub2_2.method5192(arg1);
		local45.aClass2_Sub8_Sub2_2.method5212(local40);
		Static38.method791(local45);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)V")
	public static void method348() {
		if (Static454.anIntArray310 != null) {
			return;
		}
		Static454.anIntArray310 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
			@Pc(38) float local38 = ((float) (local24 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(47) float local47 = (float) (local24 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(49) int local49 = 0; local49 < 128; local49++) {
				@Pc(56) float local56 = (float) local49 / 128.0F;
				@Pc(58) float local58 = 0.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(66) float local66 = local38 / 60.0F;
				@Pc(69) int local69 = (int) local66;
				@Pc(73) int local73 = local69 % 6;
				@Pc(79) float local79 = (float) -local69 + local66;
				@Pc(85) float local85 = local56 * (1.0F - local47);
				@Pc(94) float local94 = (1.0F - local79 * local47) * local56;
				@Pc(105) float local105 = (1.0F - (1.0F - local79) * local47) * local56;
				if (local73 == 0) {
					local58 = local56;
					local60 = local105;
					local62 = local85;
				} else if (local73 == 1) {
					local60 = local56;
					local62 = local85;
					local58 = local94;
				} else if (local73 == 2) {
					local60 = local56;
					local62 = local105;
					local58 = local85;
				} else if (local73 == 3) {
					local58 = local85;
					local60 = local94;
					local62 = local56;
				} else if (local73 == 4) {
					local58 = local105;
					local62 = local56;
					local60 = local85;
				} else if (local73 == 5) {
					local58 = local56;
					local62 = local94;
					local60 = local85;
				}
				local58 = (float) Math.pow((double) local58, local20);
				local60 = (float) Math.pow((double) local60, local20);
				local62 = (float) Math.pow((double) local62, local20);
				@Pc(198) int local198 = (int) (local58 * 256.0F);
				@Pc(203) int local203 = (int) (local60 * 256.0F);
				@Pc(208) int local208 = (int) (local62 * 256.0F);
				@Pc(220) int local220 = local208 + (local198 << 16) + (local203 << 8) - 16777216;
				Static454.anIntArray310[local22++] = local220;
			}
		}
	}

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(Z)Lclient!jo;")
	public static Class185 method349() {
		try {
			return (Class185) Class.forName("Class185_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(16) Throwable local16) {
			return null;
		}
	}
}

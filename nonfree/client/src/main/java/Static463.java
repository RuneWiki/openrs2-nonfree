import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!qga", name = "f", descriptor = "I")
	public static int anInt7854;

	@OriginalMember(owner = "client!qga", name = "h", descriptor = "I")
	public static int anInt7856;

	@OriginalMember(owner = "client!qga", name = "e", descriptor = "I")
	public static int anInt7853 = 0;

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "()V")
	public static void method6866() {
		for (@Pc(1) int local1 = 0; local1 < Static181.anInt3279; local1++) {
			if (!Static467.aBooleanArray48[local1]) {
				@Pc(10) Class175 local10 = Static580.aClass175Array12[local1];
				@Pc(13) Class5_Sub27 local13 = local10.aClass5_Sub27_2;
				@Pc(16) int local16 = local10.anInt4431;
				@Pc(22) int local22 = local13.method6338() - Static617.anInt10032;
				@Pc(30) int local30 = (local22 * 2 >> Static162.anInt2830) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method6330() - local22 >> Static162.anInt2830;
				@Pc(53) int local53 = local13.method6335() - local22 >> Static162.anInt2830;
				@Pc(61) int local61 = local13.method6335() + local22 >> Static162.anInt2830;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static150.anInt2400) {
					local61 = Static150.anInt2400 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray59[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static129.anInt6336) {
						local108 = Static129.anInt6336 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class14_Sub1_Sub1 local141 = Static1.method5727(local16, local125, local78, fb.class);
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
									local182 = local10.aShortArray59[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray59[local32 - 1];
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
									local182 = local10.aShortArray59[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray59[local32 + 1];
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
				Static467.aBooleanArray48[local1] = true;
				Static299.aClass40Array1[local16].method8438(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(BLclient!wd;)V")
	public static void method6867(@OriginalArg(1) Class5_Sub12_Sub2 arg0) {
		arg0.method8667();
		@Pc(15) int local15 = Static620.anInt10055;
		@Pc(25) Class14_Sub1_Sub1_Sub3_Sub1 local25 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local15] = new Class14_Sub1_Sub1_Sub3_Sub1();
		local25.anInt2960 = local15;
		@Pc(35) int local35 = arg0.method8670(30);
		@Pc(40) byte local40 = (byte) (local35 >> 28);
		@Pc(46) int local46 = local35 >> 14 & 0x3FFF;
		local25.anIntArray253[0] = local46 - Static113.anInt1785;
		@Pc(57) int local57 = local35 & 0x3FFF;
		local25.anInt9317 = (local25.anIntArray253[0] << 9) + (local25.method2509() << 8);
		local25.anIntArray252[0] = local57 - Static622.anInt10087;
		local25.anInt9315 = (local25.anIntArray252[0] << 9) + (local25.method2509() << 8);
		Static299.anInt4751 = local25.aByte125 = local25.aByte126 = local40;
		if (Static353.method5596(local25.anIntArray253[0], local25.anIntArray252[0])) {
			local25.aByte126++;
		}
		if (Static578.aClass5_Sub12Array1[local15] != null) {
			local25.method2369(Static578.aClass5_Sub12Array1[local15]);
		}
		Static227.anInt3948 = 0;
		Static467.anIntArray632[Static227.anInt3948++] = local15;
		Static353.aByteArray48[local15] = 0;
		Static161.anInt2820 = 0;
		for (@Pc(150) int local150 = 1; local150 < 2048; local150++) {
			if (local15 != local150) {
				@Pc(164) int local164 = arg0.method8670(18);
				@Pc(168) int local168 = local164 >> 16;
				@Pc(174) int local174 = local164 >> 8 & 0xFF;
				@Pc(178) int local178 = local164 & 0xFF;
				@Pc(186) Class127 local186 = Static495.aClass127Array3[local150] = new Class127();
				local186.anInt3248 = 0;
				local186.anInt3247 = -1;
				local186.anInt3245 = local178 + (local168 << 28) + (local174 << 14);
				local186.aBoolean271 = false;
				Static45.anIntArray59[Static161.anInt2820++] = local150;
				Static353.aByteArray48[local150] = 0;
			}
		}
		arg0.method8666();
	}
}

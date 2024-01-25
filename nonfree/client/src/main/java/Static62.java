import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "Lclient!wp;")
	public static Class270 aClass270_2;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIILclient!za;Lclient!wk;Lclient!rk;Lclient!vp;I)V")
	public static void method1042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class50 arg3, @OriginalArg(4) Class10_Sub46 arg4, @OriginalArg(5) Class208 arg5, @OriginalArg(6) Class262 arg6) {
		@Pc(15) int local15 = arg4.anInt7520 - arg0 / 2 - 5;
		@Pc(19) int local19 = arg1 + 2;
		if (arg5.anInt5995 != 0) {
			arg3.method5853(local19, local15, arg5.anInt5995, arg1 + arg2 * arg6.method5749() + 1 - local19, arg0 + 10);
		}
		if (arg5.anInt6022 != 0) {
			arg3.method5834(arg0 + 10, local15, arg5.anInt6022, arg6.method5749() * arg2 + arg1 + 1 - local19, local19);
		}
		@Pc(74) int local74 = arg5.anInt5991;
		if (arg4.aBoolean496 && arg5.anInt6016 != -1) {
			local74 = arg5.anInt6016;
		}
		for (@Pc(90) int local90 = 0; local90 < arg2; local90++) {
			@Pc(96) String local96 = Static369.aStringArray45[local90];
			if (local90 < arg2 - 1) {
				local96 = local96.substring(0, local96.length() - 4);
			}
			arg6.method5745(arg3, local96, arg4.anInt7520, arg1, local74);
			arg1 += arg6.method5749();
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)Z")
	public static boolean method1044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!wk;BLclient!rk;Lclient!za;)V")
	public static void method1045(@OriginalArg(0) Class10_Sub46 arg0, @OriginalArg(2) Class208 arg1, @OriginalArg(3) Class50 arg2) {
		@Pc(10) Class80 local10 = arg1.method4755(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.YA();
		if (local16 < local10.ZA()) {
			local16 = local10.ZA();
		}
		@Pc(32) int local32 = arg0.anInt7520;
		@Pc(35) int local35 = arg0.anInt7525;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(78) int local78;
		if (arg1.aString55 != null) {
			local37 = Static38.aClass79_1.method1986(Static369.aStringArray45, arg1.aString55, null, null);
			for (local55 = 0; local55 < local37; local55++) {
				@Pc(61) String local61 = Static369.aStringArray45[local55];
				if (local37 - 1 > local55) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local78 = Static299.aClass262_7.method5750(local61);
				if (local39 < local78) {
					local39 = local78;
				}
			}
			local41 = Static299.aClass262_7.method5749() * local37 + Static299.aClass262_7.method5748() / 2;
		}
		local55 = local16 / 2 + arg0.anInt7520;
		@Pc(112) int local112 = arg0.anInt7525;
		if (local32 < Static143.anInt2860 + local16) {
			local55 = local39 / 2 + local16 / 2 + Static143.anInt2860 + 10 + 5;
			local32 = Static143.anInt2860;
		} else if (local32 > Static143.anInt2866 - local16) {
			local55 = Static143.anInt2866 - local16 / 2 - local39 / 2 - 10 - 5;
			local32 = Static143.anInt2866 - local16;
		}
		if (local16 + Static143.anInt2862 > local35) {
			local35 = Static143.anInt2862;
			local112 = local16 / 2 + Static143.anInt2862 + 10;
		} else if (Static143.anInt2864 - local16 < local35) {
			local112 = Static143.anInt2864 - local41 - local16 / 2 - 10;
			local35 = Static143.anInt2864 - local16;
		}
		local78 = (int) (Math.atan2((double) (local32 - arg0.anInt7520), (double) (local35 - arg0.anInt7525)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5561((float) local16 / 2.0F + (float) local32, (float) local35 + (float) local16 / 2.0F, 4096, local78);
		@Pc(254) int local254 = -2;
		@Pc(256) int local256 = -2;
		@Pc(258) int local258 = -2;
		@Pc(260) int local260 = -2;
		if (arg1.aString55 != null) {
			local254 = local55 - local39 / 2 - 5;
			local256 = local112;
			local260 = local112 + local37 * Static299.aClass262_7.method5749() + 3;
			local258 = local254 + local39 + 10;
			if (arg1.anInt5995 != 0) {
				arg2.method5853(local112, local254, arg1.anInt5995, local260 - local112, -local254 + local258);
			}
			if (arg1.anInt6022 != 0) {
				arg2.method5834(local258 - local254, local254, arg1.anInt6022, local260 - local112, local112);
			}
			for (@Pc(328) int local328 = 0; local328 < local37; local328++) {
				@Pc(334) String local334 = Static369.aStringArray45[local328];
				if (local328 < local37 - 1) {
					local334 = local334.substring(0, local334.length() - 4);
				}
				Static299.aClass262_7.method5745(arg2, local334, local55, local112, arg1.anInt5991);
				local112 += Static299.aClass262_7.method5749();
			}
		}
		if (arg1.anInt6000 == -1 && arg1.aString55 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(381) Class10_Sub5 local381 = new Class10_Sub5(arg0);
		local381.anInt566 = local35 + local16;
		local381.anInt569 = local254;
		local381.anInt570 = local16 + local32;
		local381.anInt567 = local258;
		local381.anInt563 = local32 - local16;
		local381.anInt561 = local256;
		local381.anInt565 = local260;
		local381.anInt562 = local35 - local16;
		Static339.aClass163_38.method3613(local381);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!za;Z)V")
	public static void method1046(@OriginalArg(0) Class50 arg0) {
		if (Static207.anInt4055 < 2 && !Static401.aBoolean489 || Static458.aClass89_14 != null) {
			return;
		}
		@Pc(42) String local42;
		if (Static401.aBoolean489 && Static207.anInt4055 < 2) {
			local42 = Static312.aString52 + Static395.aClass182_227.method4155(Static191.anInt3842) + Static70.aString10 + " ->";
		} else if (Static106.aBoolean134 && Static197.aClass245_1.method5907(81) && Static207.anInt4055 > 2) {
			local42 = Static3.method3431((Class10_Sub45) Static70.aClass163_13.aClass10_149.aClass10_264.aClass10_264);
		} else {
			@Pc(49) Class10_Sub45 local49 = (Class10_Sub45) Static70.aClass163_13.aClass10_149.aClass10_264;
			local42 = Static3.method3431(local49);
			@Pc(55) int[] local55 = null;
			if (Static252.method3680(local49.anInt7505)) {
				local55 = Static313.aClass272_2.method6068((int) local49.aLong261).anIntArray131;
			} else if (local49.anInt7506 != -1) {
				local55 = Static313.aClass272_2.method6068(local49.anInt7506).anIntArray131;
			} else if (Static114.method1979(local49.anInt7505)) {
				@Pc(133) Class10_Sub26 local133 = (Class10_Sub26) Static424.aClass167_33.method3709((long) local49.aLong261);
				if (local133 != null) {
					@Pc(138) Class24_Sub3_Sub2_Sub1 local138 = local133.aClass24_Sub3_Sub2_Sub1_2;
					@Pc(141) Class222 local141 = local138.aClass222_1;
					if (local141.anIntArray613 != null) {
						local141 = local141.method4938(Static329.aClass201_9);
					}
					if (local141 != null) {
						local55 = local141.anIntArray615;
					}
				}
			} else if (Static380.method5132(local49.anInt7505)) {
				@Pc(102) Class126 local102;
				if (local49.anInt7505 == 1003) {
					local102 = Static342.aClass237_4.method5212((int) local49.aLong261);
				} else {
					local102 = Static342.aClass237_4.method5212((int) (local49.aLong261 >>> 32 & 0x7FFFFFFFL));
				}
				if (local102.anIntArray380 != null) {
					local102 = local102.method3009(Static329.aClass201_9);
				}
				if (local102 != null) {
					local55 = local102.anIntArray384;
				}
			}
			if (local55 != null) {
				local42 = local42 + Static87.method1638(local55);
			}
		}
		if (Static207.anInt4055 > 2) {
			local42 = local42 + "<col=ffffff> / " + (Static207.anInt4055 - 2) + Static101.aClass182_261.method4155(Static191.anInt3842);
		}
		if (Static119.aClass89_6 != null) {
			@Pc(224) Class57 local224 = Static119.aClass89_6.method2291(arg0);
			if (local224 == null) {
				local224 = Static330.aClass57_3;
			}
			local224.method5944(Static119.aClass89_6.anInt2686, Static119.aClass89_6.anInt2662, Static119.aClass89_6.anInt2682, Static119.aClass89_6.anInt2741, Static377.aRandom2, Static271.aClass80Array14, Static56.anIntArray89, local42, Static126.anInt2599, Static269.anInt4744, Static119.aClass89_6.anInt2743, Static397.anInt6726, Static119.aClass89_6.anInt2703, Static117.anIntArray214);
			Static457.method6059(Static117.anIntArray214[2], Static117.anIntArray214[1], Static117.anIntArray214[3], Static117.anIntArray214[0]);
		} else if (Static236.aClass89_8 != null && Static102.aClass147_3 == Static53.aClass147_2) {
			@Pc(290) int local290 = Static330.aClass57_3.method5957(Static107.anInt2163 + 16, Static56.anIntArray89, Static271.aClass80Array14, Static20.anInt355 + 4, Static269.anInt4744, Static377.aRandom2, local42);
			Static457.method6059(Static450.aClass79_10.method1977(local42) + local290, Static107.anInt2163, 16, Static20.anInt355 + 4);
		}
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(Z)V")
	public static void method1047() {
		Static265.aClass267_46.method6011();
	}
}

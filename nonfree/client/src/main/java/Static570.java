import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!vp", name = "z", descriptor = "I")
	public static int anInt9340;

	@OriginalMember(owner = "client!vp", name = "B", descriptor = "I")
	public static int anInt9342;

	@OriginalMember(owner = "client!vp", name = "F", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_126;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!oa;Z)V")
	public static void method7637(@OriginalArg(0) Class14 arg0) {
		@Pc(7) int local7 = Static574.anInt9422;
		@Pc(9) int local9 = Static397.anInt6954;
		@Pc(11) int local11 = Static363.anInt6354;
		@Pc(13) int local13 = Static144.anInt3166;
		arg0.method6859(local11, local9, local7, -10660793, local13);
		arg0.method6859(local11 - 2, local9 - -1, local7 + 1, -16777216, 16);
		arg0.method6904(local13 - 19, -16777216, local7 + 1, local9 + 18, local11 + -2);
		Static114.aClass92_4.method6390(local9 + 14, -10660793, local7 + 3, -1, Static230.aClass156_23.method4065(Static25.anInt769));
		@Pc(72) int local72 = Static164.aClass173_1.method6487();
		@Pc(76) int local76 = Static164.aClass173_1.method6489();
		@Pc(78) int local78 = 0;
		for (@Pc(83) Class6_Sub45 local83 = (Class6_Sub45) Static182.aClass361_23.method7838(); local83 != null; local83 = (Class6_Sub45) Static182.aClass361_23.method7845()) {
			@Pc(98) int local98 = local9 + (Static421.anInt7365 + -1 + -local78) * 16 + 31;
			@Pc(100) short local100 = -1;
			if (local72 > local7 && local72 < local7 + local11 && local76 > local98 - 13 && local98 + 3 > local76 && local83.aBoolean634) {
				local100 = -256;
			}
			@Pc(138) int[] local138 = null;
			if (Static189.method3425(local83.anInt8730)) {
				local138 = Static444.aClass322_2.method7141((int) local83.aLong235).anIntArray485;
			} else if (local83.anInt8734 != -1) {
				local138 = Static444.aClass322_2.method7141(local83.anInt8734).anIntArray485;
			} else if (Static280.method4614(local83.anInt8730)) {
				@Pc(178) Class6_Sub34 local178 = (Class6_Sub34) Static593.aClass128_43.method3263((long) local83.aLong235);
				if (local178 != null) {
					@Pc(183) Class4_Sub1_Sub1_Sub1 local183 = local178.aClass4_Sub1_Sub1_Sub1_2;
					@Pc(186) Class273 local186 = local183.aClass273_1;
					if (local186.anIntArray537 != null) {
						local186 = local186.method6159(Static498.aClass101_1);
					}
					if (local186 != null) {
						local138 = local186.anIntArray535;
					}
				}
			} else if (Static357.method5419(local83.anInt8730)) {
				@Pc(224) Class252 local224;
				if (local83.anInt8730 == 1011) {
					local224 = Static412.aClass307_4.method6636((int) local83.aLong235);
				} else {
					local224 = Static412.aClass307_4.method6636((int) (local83.aLong235 >>> 32 & 0x7FFFFFFFL));
				}
				if (local224.anIntArray506 != null) {
					local224 = local224.method5799(Static498.aClass101_1);
				}
				if (local224 != null) {
					local138 = local224.anIntArray508;
				}
			}
			@Pc(249) String local249 = Static55.method1204(local83);
			if (local138 != null) {
				local249 = local249 + Static493.method6728(local138);
			}
			Static114.aClass92_4.method6402(local100, local249, local98, Static218.anIntArray272, Static194.aClass58Array9, local7 + 3);
			local78++;
			if (local83.aBoolean633) {
				Static313.aClass58_29.method7666(Static555.aClass327_13.method7196(local249) + local7 + 5, local98 + -12);
			}
		}
		Static9.method204(Static144.anInt3166, Static574.anInt9422, Static397.anInt6954, Static363.anInt6354);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!qj;B)[Lclient!dm;")
	public static Class71[] method7638(@OriginalArg(0) Class272 arg0) {
		if (!arg0.method6118()) {
			return new Class71[0];
		}
		@Pc(16) Class331 local16 = arg0.method6133();
		while (local16.anInt8818 == 0) {
			Static318.method4952(10L);
		}
		if (local16.anInt8818 == 2) {
			return new Class71[0];
		}
		@Pc(42) int[] local42 = (int[]) local16.anObject18;
		@Pc(48) Class71[] local48 = new Class71[local42.length >> 2];
		for (@Pc(50) int local50 = 0; local50 < local48.length; local50++) {
			@Pc(56) Class71 local56 = new Class71();
			local48[local50] = local56;
			local56.anInt1785 = local42[local50 << 2];
			local56.anInt1784 = local42[(local50 << 2) + 1];
			local56.anInt1788 = local42[(local50 << 2) + 2];
			local56.anInt1787 = local42[(local50 << 2) + 3];
		}
		return local48;
	}
}

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ch", name = "y", descriptor = "[[Lclient!uv;")
	public static Class344[][] aClass344ArrayArray1;

	@OriginalMember(owner = "client!ch", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIILclient!km;I)V")
	public static void method1229(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub31 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt5932 == -1 && arg3.anIntArray317 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(25) int local25 = arg3.anInt5931 * Static32.aClass3_Sub41_3.aClass7_Sub15_5.method5663() >> 8;
		if (arg2 > arg3.anInt5947) {
			local15 = arg2 - arg3.anInt5947;
		} else if (arg3.anInt5941 > arg2) {
			local15 = arg3.anInt5941 - arg2;
		}
		if (arg4 > arg3.anInt5934) {
			local15 += arg4 - arg3.anInt5934;
		} else if (arg3.anInt5937 > arg4) {
			local15 += arg3.anInt5937 - arg4;
		}
		if (arg3.anInt5936 == 0 || arg3.anInt5936 < local15 - 256 || Static32.aClass3_Sub41_3.aClass7_Sub15_5.method5663() == 0 || arg3.anInt5940 != arg1) {
			if (arg3.aClass3_Sub3_Sub5_3 != null) {
				Static304.aClass3_Sub3_Sub3_3.method2976(arg3.aClass3_Sub3_Sub5_3);
				arg3.aClass3_Sub28_2 = null;
				arg3.aClass3_Sub18_Sub1_4 = null;
				arg3.aClass3_Sub3_Sub5_3 = null;
			}
			if (arg3.aClass3_Sub3_Sub5_4 != null) {
				Static304.aClass3_Sub3_Sub3_3.method2976(arg3.aClass3_Sub3_Sub5_4);
				arg3.aClass3_Sub18_Sub1_3 = null;
				arg3.aClass3_Sub3_Sub5_4 = null;
				arg3.aClass3_Sub28_3 = null;
			}
			return;
		}
		local15 -= 256;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(152) int local152 = arg3.anInt5936 - arg3.anInt5949;
		if (local152 < 0) {
			local152 = arg3.anInt5936;
		}
		@Pc(162) int local162 = local25;
		@Pc(168) int local168 = local15 - arg3.anInt5949;
		if (local168 > 0 && local152 > 0) {
			local162 = local25 * (local152 - local168) / local152;
		}
		Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.method8619();
		@Pc(187) int local187 = 8192;
		@Pc(198) int local198 = (arg3.anInt5941 + arg3.anInt5947) / 2 - arg2;
		@Pc(208) int local208 = (arg3.anInt5937 + arg3.anInt5934) / 2 - arg4;
		@Pc(236) int local236;
		@Pc(260) int local260;
		if (local198 != 0 || local208 != 0) {
			local236 = -Static35.anInt545 - (int) (Math.atan2((double) local198, (double) local208) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local236 > 8192) {
				local236 = 16384 - local236;
			}
			if (local15 <= 0) {
				local260 = 8192;
			} else if (local15 < 4096) {
				local260 = local15 * 8192 / 4096 + 8192;
			} else {
				local260 = 16384;
			}
			local187 = local236 * local260 / 8192 + (16384 - local260 >> 1);
		}
		@Pc(377) Class3_Sub3_Sub5 local377;
		if (arg3.aClass3_Sub3_Sub5_3 != null) {
			arg3.aClass3_Sub3_Sub5_3.method4684(local162);
			arg3.aClass3_Sub3_Sub5_3.method4688(local187);
		} else if (arg3.anInt5932 >= 0) {
			local236 = arg3.anInt5935 == 256 && arg3.anInt5938 == 256 ? 256 : Static395.method6222(arg3.anInt5938, arg3.anInt5935);
			if (arg3.aBoolean436) {
				if (arg3.aClass3_Sub28_2 == null) {
					arg3.aClass3_Sub28_2 = Static288.method4662(Static311.aClass343_155, arg3.anInt5932);
				}
				if (arg3.aClass3_Sub28_2 != null) {
					if (arg3.aClass3_Sub18_Sub1_4 == null) {
						arg3.aClass3_Sub18_Sub1_4 = arg3.aClass3_Sub28_2.method4672(new int[] { 22050 });
					}
					if (arg3.aClass3_Sub18_Sub1_4 != null) {
						local377 = Static655.method4686(arg3.aClass3_Sub18_Sub1_4, local236, local162 << 6, local187);
						local377.method4716(-1);
						Static304.aClass3_Sub3_Sub3_3.method2975(local377);
						arg3.aClass3_Sub3_Sub5_3 = local377;
					}
				}
			} else {
				@Pc(313) Class120 local313 = Static654.method2849(Static155.aClass343_77, arg3.anInt5932, 0);
				if (local313 != null) {
					@Pc(320) Class3_Sub18_Sub1 local320 = local313.method2850().method8589(Static415.aClass208_2);
					@Pc(328) Class3_Sub3_Sub5 local328 = Static655.method4686(local320, local236, local162 << 6, local187);
					local328.method4716(-1);
					Static304.aClass3_Sub3_Sub3_3.method2975(local328);
					arg3.aClass3_Sub3_Sub5_3 = local328;
				}
			}
		}
		if (arg3.aClass3_Sub3_Sub5_4 != null) {
			arg3.aClass3_Sub3_Sub5_4.method4684(local162);
			arg3.aClass3_Sub3_Sub5_4.method4688(local187);
			if (arg3.aClass3_Sub3_Sub5_4.method8683()) {
				return;
			}
			arg3.aClass3_Sub18_Sub1_3 = null;
			arg3.aClass3_Sub3_Sub5_4 = null;
			arg3.aClass3_Sub28_3 = null;
		} else if (arg3.anIntArray317 != null && (arg3.anInt5946 -= arg0) <= 0) {
			local236 = arg3.anInt5935 == 256 && arg3.anInt5938 == 256 ? 256 : arg3.anInt5938 + (int) ((double) (arg3.anInt5935 - arg3.anInt5938) * Math.random());
			if (arg3.aBoolean435) {
				if (arg3.aClass3_Sub28_3 == null) {
					local260 = (int) ((double) arg3.anIntArray317.length * Math.random());
					arg3.aClass3_Sub28_3 = Static288.method4662(Static311.aClass343_155, arg3.anIntArray317[local260]);
				}
				if (arg3.aClass3_Sub28_3 != null) {
					if (arg3.aClass3_Sub18_Sub1_3 == null) {
						arg3.aClass3_Sub18_Sub1_3 = arg3.aClass3_Sub28_3.method4672(new int[] { 22050 });
					}
					if (arg3.aClass3_Sub18_Sub1_3 != null) {
						local377 = Static655.method4686(arg3.aClass3_Sub18_Sub1_3, local236, local162 << 6, local187);
						local377.method4716(0);
						Static304.aClass3_Sub3_Sub3_3.method2975(local377);
						arg3.anInt5946 = (int) ((double) (arg3.anInt5939 - arg3.anInt5943) * Math.random()) + arg3.anInt5943;
						arg3.aClass3_Sub3_Sub5_4 = local377;
						return;
					}
				}
				return;
			}
			local260 = (int) (Math.random() * (double) arg3.anIntArray317.length);
			@Pc(531) Class120 local531 = Static654.method2849(Static155.aClass343_77, arg3.anIntArray317[local260], 0);
			if (local531 != null) {
				@Pc(538) Class3_Sub18_Sub1 local538 = local531.method2850().method8589(Static415.aClass208_2);
				@Pc(546) Class3_Sub3_Sub5 local546 = Static655.method4686(local538, local236, local162 << 6, local187);
				local546.method4716(0);
				Static304.aClass3_Sub3_Sub3_3.method2975(local546);
				arg3.anInt5946 = arg3.anInt5943 + (int) ((double) (arg3.anInt5939 - arg3.anInt5943) * Math.random());
				arg3.aClass3_Sub3_Sub5_4 = local546;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method1230(@OriginalArg(1) Class82 arg0) {
		if (Static423.aClass216_53.method5460() == 0) {
			return;
		}
		@Pc(60) Class3_Sub39 local60;
		if (Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181() == 0) {
			for (local60 = (Class3_Sub39) Static423.aClass216_53.method5457(); local60 != null; local60 = (Class3_Sub39) Static423.aClass216_53.method5458()) {
				Static298.aClass132_1.method3066(local60.anInt7256, local60.anInt7259, local60.anInt7261, Static227.aClass63_5, false, false, local60.aBoolean519 ? Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass375_1 : null, arg0, local60.anInt7254, arg0, local60.anInt7258);
				local60.method8682();
			}
			Static647.method8677();
			return;
		}
		if (Static470.aClass82_13 == null) {
			@Pc(28) Canvas local28 = new Canvas();
			local28.setSize(36, 32);
			Static470.aClass82_13 = Static205.method7240(0, local28, Static567.aClass343_251, Static621.anInterface5_12, 0);
			Static521.aClass63_14 = Static470.aClass82_13.method6127(Static210.method3285(Static8.anInt127, Static394.aClass343_188), Static656.method6338(Static419.aClass343_200, Static8.anInt127));
		}
		for (local60 = (Class3_Sub39) Static423.aClass216_53.method5457(); local60 != null; local60 = (Class3_Sub39) Static423.aClass216_53.method5458()) {
			Static298.aClass132_1.method3066(local60.anInt7256, local60.anInt7259, local60.anInt7261, Static521.aClass63_14, false, false, local60.aBoolean519 ? Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass375_1 : null, arg0, local60.anInt7254, Static470.aClass82_13, local60.anInt7258);
			local60.method8682();
		}
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)V")
	public static void method1232() {
		Static468.aClass136_55.method3142();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLclient!ab;ZZ)V")
	public static void method1233(@OriginalArg(1) Class3_Sub1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) int local12 = arg0.anInt24;
		@Pc(16) int local16 = (int) arg0.aLong277;
		arg0.method8682();
		if (arg1) {
			Static494.method7222(local12);
		}
		Static176.method2901(local12);
		@Pc(31) Class344 local31 = Static324.method5363(local16);
		if (local31 != null) {
			Static605.method8323(local31);
		}
		Static246.method4161();
		if (!arg2 && Static528.anInt8950 != -1) {
			Static24.method329(Static528.anInt8950, 1);
		}
		@Pc(53) Class332 local53 = new Class332(Static128.aClass25_7);
		for (@Pc(58) Class3_Sub1 local58 = (Class3_Sub1) local53.method7958(); local58 != null; local58 = (Class3_Sub1) local53.method7960()) {
			if (!local58.method8683()) {
				local58 = (Class3_Sub1) local53.method7958();
				if (local58 == null) {
					return;
				}
			}
			if (local58.anInt25 == 3) {
				@Pc(80) int local80 = (int) local58.aLong277;
				if (local80 >>> 16 == local12) {
					method1233(local58, true, arg2);
				}
			}
		}
	}
}

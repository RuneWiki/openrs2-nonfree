import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!fl", name = "Sc", descriptor = "Z")
	public static boolean aBoolean260 = false;

	@OriginalMember(owner = "client!fl", name = "kd", descriptor = "[I")
	public static final int[] anIntArray223 = new int[14];

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "(I)V")
	public static void method2909() {
		for (@Pc(7) int local7 = 0; local7 < Static344.anInt6196; local7++) {
			@Pc(13) int local13 = Static256.anIntArray321[local7];
			@Pc(21) Class23_Sub2_Sub1_Sub2_Sub2 local21 = ((Class3_Sub11) Static500.aClass62_40.method1682((long) local13)).aClass23_Sub2_Sub1_Sub2_Sub2_1;
			@Pc(25) int local25 = Static67.aClass3_Sub17_Sub2_4.method4888();
			if ((local25 & 0x10) != 0) {
				local25 += Static67.aClass3_Sub17_Sub2_4.method4888() << 8;
			}
			if ((local25 & 0x2000) != 0) {
				local25 += Static67.aClass3_Sub17_Sub2_4.method4888() << 16;
			}
			@Pc(65) int local65;
			@Pc(69) int local69;
			@Pc(78) int local78;
			@Pc(82) int local82;
			@Pc(88) int local88;
			if ((local25 & 0x40000) != 0) {
				local65 = Static67.aClass3_Sub17_Sub2_4.method4858();
				local69 = Static67.aClass3_Sub17_Sub2_4.method4851();
				if (local65 == 65535) {
					local65 = -1;
				}
				local78 = Static67.aClass3_Sub17_Sub2_4.method4850();
				local82 = local78 & 0x7;
				local88 = local78 >> 3 & 0xF;
				if (local88 == 15) {
					local88 = -1;
				}
				local21.method8624(2, local69, local65, local82, local88);
			}
			if ((local25 & 0x8) != 0) {
				local65 = Static67.aClass3_Sub17_Sub2_4.method4858();
				local69 = Static67.aClass3_Sub17_Sub2_4.method4851();
				if (local65 == 65535) {
					local65 = -1;
				}
				local78 = Static67.aClass3_Sub17_Sub2_4.method4844();
				local82 = local78 & 0x7;
				local88 = local78 >> 3 & 0xF;
				if (local88 == 15) {
					local88 = -1;
				}
				local21.method8624(0, local69, local65, local82, local88);
			}
			if ((local25 & 0x100) != 0) {
				local65 = Static67.aClass3_Sub17_Sub2_4.method4884();
				local21.anInt10157 = Static67.aClass3_Sub17_Sub2_4.method4874();
				local21.anInt10144 = Static67.aClass3_Sub17_Sub2_4.method4844();
				local21.aBoolean746 = (local65 & 0x8000) != 0;
				local21.anInt10142 = local65 & 0x7FFF;
				local21.anInt10173 = local21.anInt10157 + local21.anInt10142 + Static621.anInt9665;
			}
			@Pc(254) int local254;
			@Pc(282) int local282;
			@Pc(313) int local313;
			@Pc(272) short[] local272;
			@Pc(242) int[] local242;
			@Pc(301) short[] local301;
			@Pc(344) long local344;
			if ((local25 & 0x10000) != 0) {
				local65 = local21.aClass5_1.anIntArray4.length;
				local69 = 0;
				if (local21.aClass5_1.aShortArray1 != null) {
					local69 = local21.aClass5_1.aShortArray1.length;
				}
				if (local21.aClass5_1.aShortArray4 != null) {
					local69 = local21.aClass5_1.aShortArray4.length;
				}
				local82 = Static67.aClass3_Sub17_Sub2_4.method4874();
				if ((local82 & 0x1) != 1) {
					local242 = null;
					if ((local82 & 0x2) == 2) {
						local242 = new int[local65];
						for (local254 = 0; local254 < local65; local254++) {
							local242[local254] = Static67.aClass3_Sub17_Sub2_4.method4884();
						}
					}
					local272 = null;
					if ((local82 & 0x4) == 4) {
						local272 = new short[local69];
						for (local282 = 0; local282 < local69; local282++) {
							local272[local282] = (short) Static67.aClass3_Sub17_Sub2_4.method4872();
						}
					}
					local301 = null;
					if ((local82 & 0x8) == 8) {
						local301 = new short[0];
						for (local313 = 0; local313 < 0; local313++) {
							local301[local313] = (short) Static67.aClass3_Sub17_Sub2_4.method4872();
						}
					}
					local344 = (long) local13 | (long) local21.anInt10204++ << 32;
					new Class220(local344, local242, local272, local301);
				}
			}
			if ((local25 & 0x20000) != 0) {
				local21.aString132 = Static67.aClass3_Sub17_Sub2_4.method4847();
				if ("".equals(local21.aString132) || local21.aString132.equals(local21.aClass5_1.aString1)) {
					local21.aString132 = local21.aClass5_1.aString1;
				}
			}
			if ((local25 & 0x200) != 0) {
				local21.aByte148 = Static67.aClass3_Sub17_Sub2_4.method4880();
				local21.aByte145 = Static67.aClass3_Sub17_Sub2_4.method4861();
				local21.aByte147 = Static67.aClass3_Sub17_Sub2_4.method4880();
				local21.aByte146 = (byte) Static67.aClass3_Sub17_Sub2_4.method4844();
				local21.anInt10176 = Static621.anInt9665 + Static67.aClass3_Sub17_Sub2_4.method4858();
				local21.anInt10152 = Static621.anInt9665 + Static67.aClass3_Sub17_Sub2_4.method4858();
			}
			@Pc(435) int[] local435;
			@Pc(432) int[] local432;
			if ((local25 & 0x4000) != 0) {
				local65 = Static67.aClass3_Sub17_Sub2_4.method4850();
				local432 = new int[local65];
				local435 = new int[local65];
				@Pc(438) int[] local438 = new int[local65];
				for (local88 = 0; local88 < local65; local88++) {
					local254 = Static67.aClass3_Sub17_Sub2_4.method4872();
					if (local254 == 65535) {
						local254 = -1;
					}
					local432[local88] = local254;
					local435[local88] = Static67.aClass3_Sub17_Sub2_4.method4874();
					local438[local88] = Static67.aClass3_Sub17_Sub2_4.method4884();
				}
				Static482.method6861(local435, local438, local432, local21);
			}
			if ((local25 & 0x2) != 0) {
				@Pc(489) int[] local489 = new int[4];
				for (local69 = 0; local69 < 4; local69++) {
					local489[local69] = Static67.aClass3_Sub17_Sub2_4.method4872();
					if (local489[local69] == 65535) {
						local489[local69] = -1;
					}
				}
				local78 = Static67.aClass3_Sub17_Sub2_4.method4888();
				Static305.method4698(local489, local78, local21);
			}
			if ((local25 & 0x80) != 0) {
				local65 = Static67.aClass3_Sub17_Sub2_4.method4874();
				if (local65 > 0) {
					for (local69 = 0; local69 < local65; local69++) {
						local82 = -1;
						local88 = -1;
						local78 = Static67.aClass3_Sub17_Sub2_4.method4841();
						local254 = -1;
						if (local78 == 32767) {
							local78 = Static67.aClass3_Sub17_Sub2_4.method4841();
							local88 = Static67.aClass3_Sub17_Sub2_4.method4841();
							local82 = Static67.aClass3_Sub17_Sub2_4.method4841();
							local254 = Static67.aClass3_Sub17_Sub2_4.method4841();
						} else if (local78 == 32766) {
							local78 = -1;
						} else {
							local88 = Static67.aClass3_Sub17_Sub2_4.method4841();
						}
						local282 = Static67.aClass3_Sub17_Sub2_4.method4841();
						local313 = Static67.aClass3_Sub17_Sub2_4.method4888();
						local21.method8620(local254, local282, local88, local313, local82, Static621.anInt9665, local78);
					}
				}
			}
			if ((local25 & 0x400) != 0) {
				local65 = Static67.aClass3_Sub17_Sub2_4.method4844();
				local432 = new int[local65];
				local435 = new int[local65];
				for (local82 = 0; local82 < local65; local82++) {
					local88 = Static67.aClass3_Sub17_Sub2_4.method4858();
					if ((local88 & 0xC000) == 49152) {
						local254 = Static67.aClass3_Sub17_Sub2_4.method4858();
						local432[local82] = local254 | local88 << 16;
					} else {
						local432[local82] = local88;
					}
					local435[local82] = Static67.aClass3_Sub17_Sub2_4.method4872();
				}
				local21.method8619(local432, local435);
			}
			if ((local25 & 0x4) != 0) {
				local21.anInt10178 = Static67.aClass3_Sub17_Sub2_4.method4872();
				if (local21.anInt10178 == 65535) {
					local21.anInt10178 = -1;
				}
			}
			if ((local25 & 0x1) != 0) {
				local21.anInt10192 = Static67.aClass3_Sub17_Sub2_4.method4884();
				local21.anInt10208 = Static67.aClass3_Sub17_Sub2_4.method4879();
			}
			if ((local25 & 0x1000) != 0) {
				local65 = local21.aClass5_1.anIntArray3.length;
				local69 = 0;
				if (local21.aClass5_1.aShortArray1 != null) {
					local69 = local21.aClass5_1.aShortArray1.length;
				}
				local78 = 0;
				if (local21.aClass5_1.aShortArray4 != null) {
					local78 = local21.aClass5_1.aShortArray4.length;
				}
				local82 = Static67.aClass3_Sub17_Sub2_4.method4844();
				if ((local82 & 0x1) == 1) {
					local21.aClass220_1 = null;
				} else {
					local242 = null;
					if ((local82 & 0x2) == 2) {
						local242 = new int[local65];
						for (local254 = 0; local254 < local65; local254++) {
							local242[local254] = Static67.aClass3_Sub17_Sub2_4.method4872();
						}
					}
					local272 = null;
					if ((local82 & 0x4) == 4) {
						local272 = new short[local69];
						for (local282 = 0; local282 < local69; local282++) {
							local272[local282] = (short) Static67.aClass3_Sub17_Sub2_4.method4879();
						}
					}
					local301 = null;
					if ((local82 & 0x8) == 8) {
						local301 = new short[local78];
						for (local313 = 0; local313 < local78; local313++) {
							local301[local313] = (short) Static67.aClass3_Sub17_Sub2_4.method4858();
						}
					}
					local344 = (long) local21.anInt10206++ << 32 | (long) local13;
					local21.aClass220_1 = new Class220(local344, local242, local272, local301);
				}
			}
			if ((local25 & 0x8000) != 0) {
				local65 = Static67.aClass3_Sub17_Sub2_4.method4884();
				if (local65 == 65535) {
					local65 = -1;
				}
				local69 = Static67.aClass3_Sub17_Sub2_4.method4867();
				local78 = Static67.aClass3_Sub17_Sub2_4.method4850();
				local82 = local78 & 0x7;
				local88 = local78 >> 3 & 0xF;
				if (local88 == 15) {
					local88 = -1;
				}
				local21.method8624(1, local69, local65, local82, local88);
			}
			if ((local25 & 0x20) != 0) {
				if (local21.aClass5_1.method61()) {
					Static360.method5393(local21);
				}
				local21.method8636(Static481.aClass241_2.method5582(Static67.aClass3_Sub17_Sub2_4.method4858()));
				local21.method8621(local21.aClass5_1.anInt66);
				local21.anInt10133 = local21.aClass5_1.anInt55 << 3;
				if (local21.aClass5_1.method61()) {
					Static420.method5992(local21.anIntArray660[0], local21.aByte142, (Class178) null, 0, local21.anIntArray659[0], (Class23_Sub2_Sub1_Sub2_Sub1) null, local21);
				}
			}
			if ((local25 & 0x800) != 0) {
				local21.anInt10129 = Static67.aClass3_Sub17_Sub2_4.method4861();
				local21.anInt10134 = Static67.aClass3_Sub17_Sub2_4.method4866();
				local21.anInt10130 = Static67.aClass3_Sub17_Sub2_4.method4880();
				local21.anInt10159 = Static67.aClass3_Sub17_Sub2_4.method4861();
				local21.anInt10151 = Static67.aClass3_Sub17_Sub2_4.method4858() + Static621.anInt9665;
				local21.anInt10162 = Static67.aClass3_Sub17_Sub2_4.method4884() + Static621.anInt9665;
				local21.anInt10139 = Static67.aClass3_Sub17_Sub2_4.method4850();
				local21.anInt10129 += local21.anIntArray659[0];
				local21.anInt10190 = 1;
				local21.anInt10159 += local21.anIntArray660[0];
				local21.anInt10130 += local21.anIntArray659[0];
				local21.anInt10189 = 0;
				local21.anInt10134 += local21.anIntArray660[0];
			}
			if ((local25 & 0x40) != 0) {
				local21.aString131 = Static67.aClass3_Sub17_Sub2_4.method4847();
				local21.anInt10132 = 100;
			}
			if ((local25 & 0x80000) != 0) {
				local21.anInt10202 = Static67.aClass3_Sub17_Sub2_4.method4872();
				if (local21.anInt10202 == 65535) {
					local21.anInt10202 = local21.aClass5_1.anInt68;
				}
			}
		}
	}
}

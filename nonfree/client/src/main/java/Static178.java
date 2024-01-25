import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!gea", name = "g", descriptor = "I")
	public static int anInt4288 = -1;

	@OriginalMember(owner = "client!gea", name = "o", descriptor = "Z")
	public static boolean aBoolean319 = true;

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)V")
	public static void method3747() {
		Static8.aClass379_1.method9220();
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIBLclient!hf;)V")
	public static void method3748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub21 arg4) {
		if (arg4.anInt4686 == -1 && arg4.anIntArray235 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(25) int local25 = arg4.anInt4681 * Static74.aClass2_Sub13_5.aClass14_Sub6_2.method3223() >> 8;
		if (arg4.anInt4693 < arg1) {
			local15 = arg1 - arg4.anInt4693;
		} else if (arg1 < arg4.anInt4682) {
			local15 = arg4.anInt4682 - arg1;
		}
		if (arg4.anInt4687 < arg3) {
			local15 += arg3 - arg4.anInt4687;
		} else if (arg4.anInt4688 > arg3) {
			local15 += arg4.anInt4688 - arg3;
		}
		if (arg4.anInt4691 == 0 || arg4.anInt4691 < local15 - 256 || Static74.aClass2_Sub13_5.aClass14_Sub6_2.method3223() == 0 || arg4.anInt4690 != arg2) {
			if (arg4.aClass2_Sub8_Sub5_3 != null) {
				Static614.aClass2_Sub8_Sub4_2.method7925(arg4.aClass2_Sub8_Sub5_3);
				arg4.aClass2_Sub29_Sub1_2 = null;
				arg4.aClass2_Sub8_Sub5_3 = null;
				arg4.aClass2_Sub22_3 = null;
			}
			if (arg4.aClass2_Sub8_Sub5_2 != null) {
				Static614.aClass2_Sub8_Sub4_2.method7925(arg4.aClass2_Sub8_Sub5_2);
				arg4.aClass2_Sub8_Sub5_2 = null;
				arg4.aClass2_Sub22_2 = null;
				arg4.aClass2_Sub29_Sub1_3 = null;
			}
			return;
		}
		local15 -= 256;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(162) int local162 = (arg4.anInt4691 - local15) * local25 / arg4.anInt4691;
		Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.method5214();
		@Pc(172) int local172 = 8192;
		@Pc(183) int local183 = (arg4.anInt4682 + arg4.anInt4693) / 2 - arg1;
		@Pc(195) int local195 = (arg4.anInt4687 + arg4.anInt4688) / 2 - arg3;
		@Pc(219) int local219;
		@Pc(230) int local230;
		if (local183 != 0 || local195 != 0) {
			local219 = -Static189.anInt11070 - (int) (Math.atan2((double) local183, (double) local195) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local219 > 8192) {
				local219 = 16384 - local219;
			}
			if (local15 <= 0) {
				local230 = 8192;
			} else if (local15 < 4096) {
				local230 = local15 * 8192 / 4096 + 8192;
			} else {
				local230 = 16384;
			}
			local172 = (16384 - local230 >> 1) + local230 * local219 / 8192;
		}
		@Pc(372) Class2_Sub8_Sub5 local372;
		if (arg4.aClass2_Sub8_Sub5_3 != null) {
			arg4.aClass2_Sub8_Sub5_3.method8848(local162);
			arg4.aClass2_Sub8_Sub5_3.method8842(local172);
		} else if (arg4.anInt4686 >= 0) {
			local219 = arg4.anInt4684 == 256 && arg4.anInt4692 == 256 ? 256 : Static107.method7092(arg4.anInt4684, arg4.anInt4692);
			if (arg4.aBoolean343) {
				if (arg4.aClass2_Sub22_3 == null) {
					arg4.aClass2_Sub22_3 = Static220.method4252(Static282.aClass157_139, arg4.anInt4686);
				}
				if (arg4.aClass2_Sub22_3 != null) {
					if (arg4.aClass2_Sub29_Sub1_2 == null) {
						arg4.aClass2_Sub29_Sub1_2 = arg4.aClass2_Sub22_3.method4250(new int[] { 22050 });
					}
					if (arg4.aClass2_Sub29_Sub1_2 != null) {
						local372 = Static654.method8844(arg4.aClass2_Sub29_Sub1_2, local219, local162 << 6, local172);
						local372.method8850(-1);
						Static614.aClass2_Sub8_Sub4_2.method7928(local372);
						arg4.aClass2_Sub8_Sub5_3 = local372;
					}
				}
			} else {
				@Pc(308) Class61 local308 = Static647.method2140(Static377.aClass157_192, arg4.anInt4686, 0);
				if (local308 != null) {
					@Pc(315) Class2_Sub29_Sub1 local315 = local308.method2137().method6418(Static28.aClass257_1);
					@Pc(323) Class2_Sub8_Sub5 local323 = Static654.method8844(local315, local219, local162 << 6, local172);
					local323.method8850(-1);
					Static614.aClass2_Sub8_Sub4_2.method7928(local323);
					arg4.aClass2_Sub8_Sub5_3 = local323;
				}
			}
		}
		if (arg4.aClass2_Sub8_Sub5_2 != null) {
			arg4.aClass2_Sub8_Sub5_2.method8848(local162);
			arg4.aClass2_Sub8_Sub5_2.method8842(local172);
			if (arg4.aClass2_Sub8_Sub5_2.method9250()) {
				return;
			}
			arg4.aClass2_Sub22_2 = null;
			arg4.aClass2_Sub29_Sub1_3 = null;
			arg4.aClass2_Sub8_Sub5_2 = null;
		} else if (arg4.anIntArray235 != null && (arg4.anInt4677 -= arg0) <= 0) {
			local219 = arg4.anInt4684 == 256 && arg4.anInt4692 == 256 ? 256 : arg4.anInt4692 + (int) (Math.random() * (double) (arg4.anInt4684 - arg4.anInt4692));
			if (arg4.aBoolean345) {
				if (arg4.aClass2_Sub22_2 == null) {
					local230 = (int) ((double) arg4.anIntArray235.length * Math.random());
					arg4.aClass2_Sub22_2 = Static220.method4252(Static282.aClass157_139, arg4.anIntArray235[local230]);
				}
				if (arg4.aClass2_Sub22_2 != null) {
					if (arg4.aClass2_Sub29_Sub1_3 == null) {
						arg4.aClass2_Sub29_Sub1_3 = arg4.aClass2_Sub22_2.method4250(new int[] { 22050 });
					}
					if (arg4.aClass2_Sub29_Sub1_3 != null) {
						local372 = Static654.method8844(arg4.aClass2_Sub29_Sub1_3, local219, local162 << 6, local172);
						local372.method8850(0);
						Static614.aClass2_Sub8_Sub4_2.method7928(local372);
						arg4.aClass2_Sub8_Sub5_2 = local372;
						arg4.anInt4677 = (int) ((double) (arg4.anInt4675 - arg4.anInt4683) * Math.random()) + arg4.anInt4683;
						return;
					}
				}
				return;
			}
			local230 = (int) (Math.random() * (double) arg4.anIntArray235.length);
			@Pc(510) Class61 local510 = Static647.method2140(Static377.aClass157_192, arg4.anIntArray235[local230], 0);
			if (local510 != null) {
				@Pc(517) Class2_Sub29_Sub1 local517 = local510.method2137().method6418(Static28.aClass257_1);
				@Pc(525) Class2_Sub8_Sub5 local525 = Static654.method8844(local517, local219, local162 << 6, local172);
				local525.method8850(0);
				Static614.aClass2_Sub8_Sub4_2.method7928(local525);
				arg4.anInt4677 = (int) ((double) (arg4.anInt4675 - arg4.anInt4683) * Math.random()) + arg4.anInt4683;
				arg4.aClass2_Sub8_Sub5_2 = local525;
				return;
			}
		}
	}
}

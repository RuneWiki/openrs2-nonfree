import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!wf", name = "C", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread3;

	@OriginalMember(owner = "client!wf", name = "dc", descriptor = "I")
	public static int anInt5939 = 0;

	@OriginalMember(owner = "client!wf", name = "sc", descriptor = "[S")
	public static short[] aShortArray122 = new short[] { 43, 29, 60, 31, 22, 14, 24, 12 };

	@OriginalMember(owner = "client!wf", name = "Dc", descriptor = "I")
	public static int anInt5950 = 0;

	@OriginalMember(owner = "client!wf", name = "Tc", descriptor = "I")
	public static int anInt5960 = 0;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
	public static void method4764() {
		Static202.aClass26_42.method517(5);
		Static240.aClass26_46.method517(5);
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(BI)Lclient!sa;")
	public static Class156 method4768(@OriginalArg(1) int arg0) {
		@Pc(10) Class156 local10 = (Class156) Static81.aClass26_16.method518((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static251.aClass58_90.method1372(30, arg0);
		local10 = new Class156();
		if (local22 != null) {
			local10.method3923(arg0, new Class4_Sub10(local22));
		}
		Static81.aClass26_16.method510(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BII)V")
	public static void method4773(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static110.aClass4_Sub10_Sub1_1.method4687(178);
		Static110.aClass4_Sub10_Sub1_1.method4650(arg0);
		Static110.aClass4_Sub10_Sub1_1.method4621(arg1);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "()V")
	public static void method4774() {
		Static208.anInt4112 = 0;
		label194: for (@Pc(3) int local3 = 0; local3 < Static77.anInt1742; local3++) {
			@Pc(10) Class188 local10 = Static294.aClass188Array13[local3];
			@Pc(14) int local14;
			if (Static98.anIntArray170 != null) {
				for (local14 = 0; local14 < Static98.anIntArray170.length; local14++) {
					if (Static98.anIntArray170[local14] != -1000000 && (local10.anInt5876 <= Static98.anIntArray170[local14] || local10.anInt5885 <= Static98.anIntArray170[local14]) && (local10.anInt5866 <= Static193.anIntArray399[local14] || local10.anInt5881 <= Static193.anIntArray399[local14]) && (local10.anInt5866 >= Static47.anIntArray63[local14] || local10.anInt5881 >= Static47.anIntArray63[local14]) && (local10.anInt5864 <= Static165.anIntArray309[local14] || local10.anInt5883 <= Static165.anIntArray309[local14]) && (local10.anInt5864 >= Static136.anIntArray226[local14] || local10.anInt5883 >= Static136.anIntArray226[local14])) {
						continue label194;
					}
				}
			}
			@Pc(115) int local115;
			@Pc(126) int local126;
			@Pc(158) int local158;
			@Pc(137) boolean local137;
			if (local10.anInt5870 == 1) {
				local14 = local10.anInt5871 + Static164.anInt3253 - Static239.anInt4514;
				if (local14 >= 0 && local14 <= Static164.anInt3253 + Static164.anInt3253) {
					local115 = local10.anInt5880 + Static164.anInt3253 - Static172.anInt3329;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt5874 + Static164.anInt3253 - Static172.anInt3329;
					if (local126 > Static164.anInt3253 + Static164.anInt3253) {
						local126 = Static164.anInt3253 + Static164.anInt3253;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static160.aBooleanArrayArray5[local14][local115++]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static277.anInt5282 - local10.anInt5866;
						if (local158 > 32) {
							local10.anInt5877 = 1;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt5877 = 2;
							local158 = -local158;
						}
						local10.anInt5868 = (local10.anInt5864 - Static230.anInt4401 << 8) / local158;
						local10.anInt5878 = (local10.anInt5883 - Static230.anInt4401 << 8) / local158;
						local10.anInt5873 = (local10.anInt5876 - Static228.anInt4376 << 8) / local158;
						local10.anInt5872 = (local10.anInt5885 - Static228.anInt4376 << 8) / local158;
						Static241.aClass188Array12[Static208.anInt4112++] = local10;
					}
				}
			} else if (local10.anInt5870 == 2) {
				local14 = local10.anInt5880 + Static164.anInt3253 - Static172.anInt3329;
				if (local14 >= 0 && local14 <= Static164.anInt3253 + Static164.anInt3253) {
					local115 = local10.anInt5871 + Static164.anInt3253 - Static239.anInt4514;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt5862 + Static164.anInt3253 - Static239.anInt4514;
					if (local126 > Static164.anInt3253 + Static164.anInt3253) {
						local126 = Static164.anInt3253 + Static164.anInt3253;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static160.aBooleanArrayArray5[local115++][local14]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static230.anInt4401 - local10.anInt5864;
						if (local158 > 32) {
							local10.anInt5877 = 3;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt5877 = 4;
							local158 = -local158;
						}
						local10.anInt5865 = (local10.anInt5866 - Static277.anInt5282 << 8) / local158;
						local10.anInt5882 = (local10.anInt5881 - Static277.anInt5282 << 8) / local158;
						local10.anInt5873 = (local10.anInt5876 - Static228.anInt4376 << 8) / local158;
						local10.anInt5872 = (local10.anInt5885 - Static228.anInt4376 << 8) / local158;
						Static241.aClass188Array12[Static208.anInt4112++] = local10;
					}
				}
			} else if (local10.anInt5870 == 4) {
				local14 = local10.anInt5876 - Static228.anInt4376;
				if (local14 > 128) {
					local115 = local10.anInt5880 + Static164.anInt3253 - Static172.anInt3329;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt5874 + Static164.anInt3253 - Static172.anInt3329;
					if (local126 > Static164.anInt3253 + Static164.anInt3253) {
						local126 = Static164.anInt3253 + Static164.anInt3253;
					}
					if (local115 <= local126) {
						@Pc(408) int local408 = local10.anInt5871 + Static164.anInt3253 - Static239.anInt4514;
						if (local408 < 0) {
							local408 = 0;
						}
						local158 = local10.anInt5862 + Static164.anInt3253 - Static239.anInt4514;
						if (local158 > Static164.anInt3253 + Static164.anInt3253) {
							local158 = Static164.anInt3253 + Static164.anInt3253;
						}
						@Pc(430) boolean local430 = false;
						label166: for (@Pc(432) int local432 = local408; local432 <= local158; local432++) {
							for (@Pc(437) int local437 = local115; local437 <= local126; local437++) {
								if (Static160.aBooleanArrayArray5[local432][local437]) {
									local430 = true;
									break label166;
								}
							}
						}
						if (local430) {
							local10.anInt5877 = 5;
							local10.anInt5865 = (local10.anInt5866 - Static277.anInt5282 << 8) / local14;
							local10.anInt5882 = (local10.anInt5881 - Static277.anInt5282 << 8) / local14;
							local10.anInt5868 = (local10.anInt5864 - Static230.anInt4401 << 8) / local14;
							local10.anInt5878 = (local10.anInt5883 - Static230.anInt4401 << 8) / local14;
							Static241.aClass188Array12[Static208.anInt4112++] = local10;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(III)J")
	public static long method4776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub19 local7 = Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass186_1 == null ? 0L : local7.aClass186_1.aLong199;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIIILclient!qf;Lclient!fa;Lclient!xa;I)V")
	public static void method5465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class245 arg4, @OriginalArg(5) Class10 arg5, @OriginalArg(6) Class119 arg6) {
		if (arg6 == null) {
			return;
		}
		@Pc(18) int local18;
		if (Static305.anInt5998 == 4) {
			local18 = (int) Static487.aFloat258 & 0x3FFF;
		} else {
			local18 = Static262.anInt5488 + (int) Static487.aFloat258 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg4.anInt7249 / 2, arg4.anInt7229 / 2) + 10;
		@Pc(45) int local45 = arg1 * arg1 + arg2 * arg2;
		if (local45 > local37 * local37) {
			return;
		}
		@Pc(55) int local55 = Class5.anIntArray761[local18];
		@Pc(59) int local59 = Class5.anIntArray760[local18];
		if (Static305.anInt5998 != 4) {
			local59 = local59 * 256 / (Static509.anInt8869 + 256);
			local55 = local55 * 256 / (Static509.anInt8869 + 256);
		}
		@Pc(88) int local88 = arg2 * local59 + local55 * arg1 >> 14;
		@Pc(99) int local99 = local59 * arg1 - local55 * arg2 >> 14;
		arg6.method6677(local88 + arg4.anInt7249 / 2 + arg3 - arg6.AA() / 2, -local99 + arg4.anInt7229 / 2 + arg0 + -(arg6.a() / 2), arg5, arg3, arg0);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIILclient!oa;Lclient!e;II)V")
	public static void method5473(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5 arg2, @OriginalArg(4) Interface4 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static133.anInt2744 < 100) {
			Static129.method2263(arg2, arg3);
		}
		arg2.ca(arg4, arg5, arg1 + arg4, arg5 - -arg0);
		@Pc(32) int local32;
		@Pc(51) int local51;
		if (Static133.anInt2744 < 100) {
			local32 = arg1 / 2 + arg4;
			arg2.C(arg4, arg5, arg1, arg0, -16777216, 0);
			local51 = arg0 / 2 + arg5 - 38;
			arg2.method7484(local32 - 152, local51, 304, 34, Static8.aColorArray1[Static11.anInt628].getRGB(), 0);
			arg2.C(local32 - 150, local51 + 2, Static133.anInt2744 * 3, 30, Static153.aColorArray2[Static11.anInt628].getRGB(), 0);
			Static294.aClass59_2.method7265(Static320.aColorArray3[Static11.anInt628].getRGB(), local51 + 20, Static228.aClass67_72.method1934(Static193.anInt7803), -1, local32);
			return;
		}
		@Pc(108) int local108 = Static256.anInt5191 - (int) ((float) arg1 / Static55.aFloat69);
		local32 = Static129.anInt2692 + (int) ((float) arg0 / Static55.aFloat69);
		local51 = (int) ((float) arg1 / Static55.aFloat69) + Static256.anInt5191;
		@Pc(132) int local132 = Static129.anInt2692 - (int) ((float) arg0 / Static55.aFloat69);
		Static271.anInt5622 = Static256.anInt5191 - (int) ((float) arg1 / Static55.aFloat69);
		Static447.anInt8185 = (int) ((float) (arg1 * 2) / Static55.aFloat69);
		Static298.anInt9334 = Static129.anInt2692 - (int) ((float) arg0 / Static55.aFloat69);
		Static123.anInt2605 = (int) ((float) (arg0 * 2) / Static55.aFloat69);
		Static55.method1835(Static55.anInt1978 + local108, Static55.anInt1974 + local32, local51 + Static55.anInt1978, local132 + Static55.anInt1974, arg4, arg5, arg4 + arg1, arg0 + arg5 - -1);
		Static55.method1850(arg2);
		@Pc(198) Class71 local198 = Static55.method1846(arg2);
		Static543.method7768(arg2, local198);
		if (Static307.anInt4841 > 0) {
			Static106.anInt2360--;
			if (Static106.anInt2360 == 0) {
				Static307.anInt4841--;
				Static106.anInt2360 = 20;
			}
		}
		if (!Static120.aBoolean193) {
			return;
		}
		@Pc(229) int local229 = arg1 + arg4 - 5;
		@Pc(235) int local235 = arg0 + arg5 - 8;
		Static164.aClass59_1.method7277(16776960, local229, "Fps:" + Static111.anInt8371, local235);
		@Pc(252) int local252 = local235 - 15;
		@Pc(254) Runtime local254 = Runtime.getRuntime();
		@Pc(264) int local264 = (int) ((local254.totalMemory() - local254.freeMemory()) / 1024L);
		@Pc(266) int local266 = 16776960;
		if (local264 > 65536) {
			local266 = 16711680;
		}
		Static164.aClass59_1.method7277(local266, local229, "Mem:" + local264 + "k", local252);
		local235 = local252 - 15;
	}

	@OriginalMember(owner = "client!oba", name = "e", descriptor = "(Z)Z")
	public static boolean method5478(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static392.anInt7211; local1 < Static399.anInt7385; local1++) {
			@Pc(6) Class290[][] local6 = Static279.aClass290ArrayArrayArray7[local1];
			for (@Pc(9) int local9 = -Static345.anInt6586; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static227.anInt4884 + local9;
				@Pc(18) int local18 = Static227.anInt4884 - local9;
				if (local14 >= Static165.anInt3845 || local18 < Static44.anInt1046) {
					for (@Pc(27) int local27 = -Static345.anInt6586; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static320.anInt6157 + local27;
						@Pc(36) int local36 = Static320.anInt6157 - local27;
						@Pc(48) Class290 local48;
						if (local14 >= Static165.anInt3845) {
							if (local32 >= Static407.anInt7474) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean640) {
									Static526.aBoolean673 = arg0;
									Static442.aClass7_1.method1150(local48);
									Static442.aClass7_1.method1155();
								}
							}
							if (local36 < Static33.anInt875) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean640) {
									Static526.aBoolean673 = arg0;
									Static442.aClass7_1.method1150(local48);
									Static442.aClass7_1.method1155();
								}
							}
						}
						if (local18 < Static44.anInt1046) {
							if (local32 >= Static407.anInt7474) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean640) {
									Static526.aBoolean673 = arg0;
									Static442.aClass7_1.method1150(local48);
									Static442.aClass7_1.method1155();
								}
							}
							if (local36 < Static33.anInt875) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean640) {
									Static526.aBoolean673 = arg0;
									Static442.aClass7_1.method1150(local48);
									Static442.aClass7_1.method1155();
								}
							}
						}
						if (Static265.anInt5515 == 0) {
							if (Static531.aBoolean676) {
								Static442.aClass7_1.method1154(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}

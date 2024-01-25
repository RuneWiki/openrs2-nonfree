import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!uq", name = "k", descriptor = "[I")
	public static int[] anIntArray545;

	@OriginalMember(owner = "client!uq", name = "q", descriptor = "Lclient!f;")
	public static Class78 aClass78_22;

	@OriginalMember(owner = "client!uq", name = "i", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_105 = new Class96(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "[I")
	public static final int[] anIntArray546 = new int[100];

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)I")
	public static int method5588(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(32) int local32 = (local9 & 0x33333333) + ((local9 & 0xCCCCCCCE) >>> 2);
		@Pc(40) int local40 = (local32 >>> 4) + local32 & 0xF0F0F0F;
		@Pc(46) int local46 = local40 + (local40 >>> 8);
		@Pc(52) int local52 = local46 + (local46 >>> 16);
		return local52 & 0xFF;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIII)V")
	public static void method5589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static357.anInt6537 && Static85.anInt1517 >= arg0) {
			@Pc(11) int local11 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg3);
			@Pc(17) int local17 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg1);
			Static22.method259(arg2, local17, local11, arg0);
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIB)Z")
	public static boolean method5592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) boolean local10 = true;
		@Pc(16) Interface11 local16 = (Interface11) Static208.method3165(arg1, arg0, arg2);
		if (local16 != null) {
			local10 = Static403.method5492(local16) & true;
		}
		local16 = (Interface11) Static286.method3918(arg1, arg0, arg2, rq.class);
		if (local16 != null) {
			local10 &= Static403.method5492(local16);
		}
		local16 = (Interface11) Static112.method1764(arg1, arg0, arg2);
		if (local16 != null) {
			local10 &= Static403.method5492(local16);
		}
		return local10;
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(I)V")
	public static void method5593() {
		if (Static90.aFloat25 < 1024.0F) {
			Static90.aFloat25 = 1024.0F;
		}
		while (Static147.aFloat59 >= 16384.0F) {
			Static147.aFloat59 -= 16384.0F;
		}
		if (Static90.aFloat25 > 3072.0F) {
			Static90.aFloat25 = 3072.0F;
		}
		while (Static147.aFloat59 < 0.0F) {
			Static147.aFloat59 += 16384.0F;
		}
		@Pc(45) int local45 = Static34.anInt572 >> 7;
		@Pc(49) int local49 = Static241.anInt4245 >> 7;
		@Pc(55) int local55 = Static405.method5510(Static241.anInt4245, Static34.anInt572, Static1.anInt41);
		@Pc(57) int local57 = 0;
		@Pc(87) int local87;
		if (local45 > 3 && local49 > 3 && local45 < Static80.anInt6558 - 4 && Static104.anInt2048 - 4 > local49) {
			for (local87 = local45 - 4; local87 <= local45 + 4; local87++) {
				for (@Pc(93) int local93 = local49 - 4; local93 <= local49 + 4; local93++) {
					@Pc(97) int local97 = Static1.anInt41;
					if (local97 < 3 && Static195.method3034(local87, local93)) {
						local97++;
					}
					@Pc(108) int local108 = 0;
					if (Static72.aClass71_Sub1_1.aByteArrayArrayArray13 != null && Static72.aClass71_Sub1_1.aByteArrayArrayArray13[local97] != null) {
						local108 = (Static72.aClass71_Sub1_1.aByteArrayArrayArray13[local97][local87][local93] & 0xFF) * 8;
					}
					@Pc(140) int local140 = local55 + local108 - Static256.aClass70Array2[local97].I(local87, local93);
					if (local57 < local140) {
						local57 = local140;
					}
				}
			}
		}
		local87 = (local57 >> 0) * 1536;
		if (local87 > 786432) {
			local87 = 786432;
		}
		if (local87 < 262144) {
			local87 = 262144;
		}
		if (local87 > Static321.anInt5592) {
			Static321.anInt5592 += (local87 - Static321.anInt5592) / 24;
		} else if (Static321.anInt5592 > local87) {
			Static321.anInt5592 += (local87 - Static321.anInt5592) / 80;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIIB)V")
	public static void method5594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static309.anInt5229 = arg4;
		Static295.anInt4939 = arg0;
		Static417.anInt7327 = arg2;
		Static57.anInt868 = arg3;
		Static183.anInt3440 = arg5;
		Static84.anInt6176 = arg1;
	}
}

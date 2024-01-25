import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!oaa", name = "tb", descriptor = "Lclient!uq;")
	public static Class362 aClass362_90;

	@OriginalMember(owner = "client!oaa", name = "Ab", descriptor = "[Lclient!tm;")
	public static Class341[] aClass341Array1;

	@OriginalMember(owner = "client!oaa", name = "r", descriptor = "[I")
	public static int[] anIntArray363 = new int[2];

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZJ)V")
	public static void method5763(@OriginalArg(1) long arg0) {
		if (Static254.aClass368ArrayArrayArray2 != null) {
			if (Static451.anInt7263 == 1 || Static451.anInt7263 == 5) {
				Static601.method7984(arg0);
			} else if (Static451.anInt7263 == 4) {
				Static214.method8045(arg0);
			}
		}
		Static302.method4384((long) Static122.anInt2190, Static119.aClass95_4);
		if (Static187.anInt3418 != -1) {
			Static340.method4972(Static187.anInt3418);
		}
		for (@Pc(40) int local40 = 0; local40 < Static514.anInt8102; local40++) {
			if (Static89.aBooleanArray7[local40]) {
				Static170.aBooleanArray10[local40] = true;
			}
			Static68.aBooleanArray4[local40] = Static89.aBooleanArray7[local40];
			Static89.aBooleanArray7[local40] = false;
		}
		Static493.anInt7812 = Static122.anInt2190;
		Static103.method1672((Class265) null, -1, -1);
		Static421.method5795(-1, -1, (Class265) null);
		if (Static187.anInt3418 != -1) {
			Static514.anInt8102 = 0;
			Static181.method2866();
		}
		Static119.aClass95_4.la();
		Static182.method2873(Static119.aClass95_4);
		@Pc(109) int local109 = Static544.method6986();
		if (local109 == -1) {
			local109 = Static530.anInt8325;
		}
		if (local109 == -1) {
			local109 = Static452.anInt7275;
		}
		Static108.method1705(local109);
		@Pc(128) int local128 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.method7866() << 8;
		Static273.method4019(Static281.anInt4774, local128 + Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132, local128 + Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614);
		Static281.anInt4774 = 0;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)V")
	public static void method5764() {
		@Pc(5) Class295 local5 = Static582.aClass295_66;
		synchronized (Static582.aClass295_66) {
			Static582.aClass295_66.method6462(5);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!ofa;ILclient!ha;BIIILclient!aa;I)V")
	public static void method5773(@OriginalArg(0) Class265 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class95 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7) {
		@Pc(18) Class188 local18 = Static61.aClass378_1.method8708(arg7);
		if (local18 == null || !local18.aBoolean330 || !local18.method4283(Static210.aClass262_1)) {
			return;
		}
		@Pc(38) int local38;
		if (local18.anIntArray282 != null) {
			@Pc(36) int[] local36 = new int[local18.anIntArray282.length];
			@Pc(48) int local48;
			@Pc(62) int local62;
			@Pc(66) int local66;
			for (local38 = 0; local38 < local36.length / 2; local38++) {
				if (Static451.anInt7263 == 4) {
					local48 = (int) Static318.aFloat81 & 0x3FFF;
				} else {
					local48 = (int) Static318.aFloat81 + Static234.anInt4142 & 0x3FFF;
				}
				local62 = Class94.anIntArray561[local48];
				local66 = Class94.anIntArray560[local48];
				if (Static451.anInt7263 != 4) {
					local62 = local62 * 256 / (Static30.anInt1549 + 256);
					local66 = local66 * 256 / (Static30.anInt1549 + 256);
				}
				local36[local38 * 2] = (local62 * (local18.anIntArray282[local38 * 2 + 1] * 4 + arg4) + local66 * (local18.anIntArray282[local38 * 2] * 4 + arg1) >> 14) + (arg5 + (arg0.anInt7024 / 2));
				local36[local38 * 2 + 1] = arg3 + arg0.anInt6997 / 2 - ((local18.anIntArray282[local38 * 2 + 1] * 4 + arg4) * local66 - local62 * (local18.anIntArray282[local38 * 2] * 4 + arg1) >> 14);
			}
			Static497.method6523(arg2, local36, local18.anInt4959, arg0.anIntArray381, arg0.anIntArray378);
			if (local18.anInt4971 > 0) {
				@Pc(221) int local221;
				@Pc(231) int local231;
				@Pc(236) int local236;
				@Pc(238) int local238;
				for (local48 = 0; local48 < local36.length / 2 - 1; local48++) {
					local62 = local36[local48 * 2];
					local66 = local36[local48 * 2 + 1];
					local221 = local36[local48 * 2 + 2];
					local231 = local36[(local48 + 1) * 2 + 1];
					if (local62 > local221) {
						local236 = local62;
						local238 = local66;
						local62 = local221;
						local221 = local236;
						local66 = local231;
						local231 = local238;
					} else if (local221 == local62 && local66 > local231) {
						local236 = local66;
						local66 = local231;
						local231 = local236;
					}
					arg2.method7990(local62, local66, local221, local231, local18.anIntArray281[local18.aByteArray42[local48] & 0xFF], arg6, arg5, arg3, local18.anInt4971, local18.anInt4965, local18.anInt4948);
				}
				local62 = local36[local36.length - 2];
				local66 = local36[local36.length - 1];
				local221 = local36[0];
				local231 = local36[1];
				if (local62 > local221) {
					local236 = local62;
					local238 = local66;
					local62 = local221;
					local66 = local231;
					local221 = local236;
					local231 = local238;
				} else if (local221 == local62 && local66 > local231) {
					local236 = local66;
					local66 = local231;
					local231 = local236;
				}
				arg2.method7990(local62, local66, local221, local231, local18.anIntArray281[local18.aByteArray42[local18.aByteArray42.length - 1] & 0xFF], arg6, arg5, arg3, local18.anInt4971, local18.anInt4965, local18.anInt4948);
			} else {
				for (local48 = 0; local48 < local36.length / 2 - 1; local48++) {
					arg2.method8040(local36[local48 * 2], local36[local48 * 2 + 1], local36[local48 * 2 + 2], local36[(local48 + 1) * 2 + 1], local18.anIntArray281[local18.aByteArray42[local48] & 0xFF], arg6, arg5, arg3);
				}
				arg2.method8040(local36[local36.length - 2], local36[local36.length - 1], local36[0], local36[1], local18.anIntArray281[local18.aByteArray42[local18.aByteArray42.length - 1] & 0xFF], arg6, arg5, arg3);
			}
		}
		@Pc(483) Class6 local483 = null;
		if (local18.anInt4962 != -1) {
			local483 = local18.method4291(false, arg2);
			if (local483 != null) {
				Static429.method5923(arg4, arg1, arg5, arg3, arg0, arg6, local483);
			}
		}
		if (local18.aString62 == null) {
			return;
		}
		local38 = 0;
		if (local483 != null) {
			local38 = local483.method5136();
		}
		@Pc(517) Class67 local517 = Static261.aClass67_5;
		@Pc(519) Class91 local519 = Static285.aClass91_8;
		if (local18.anInt4967 == 1) {
			local517 = Static184.aClass67_3;
			local519 = Static513.aClass91_12;
		}
		if (local18.anInt4967 == 2) {
			local519 = Static281.aClass91_7;
			local517 = Static293.aClass67_14;
		}
		Static97.method1620(arg6, arg0, local18.anInt4960, arg3, local519, local38, local18.aString62, local517, arg4, arg1, arg5);
		return;
	}
}

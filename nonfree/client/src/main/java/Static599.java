import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!vfa", name = "d", descriptor = "Lclient!kq;")
	public static Class197 aClass197_4;

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "I")
	public static int anInt9692 = 1;

	@OriginalMember(owner = "client!vfa", name = "g", descriptor = "[I")
	public static final int[] anIntArray664 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I[Ljava/awt/Rectangle;Z)V")
	public static void method8098(@OriginalArg(0) int arg0, @OriginalArg(1) Rectangle[] arg1) throws Exception_Sub1 {
		if (Static491.anInt8078 == 1) {
			Static361.aClass95_9.method6943(arg1, arg0, Static589.anInt9580, Static290.anInt4733);
		} else {
			Static361.aClass95_9.method6943(arg1, arg0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BLclient!eg;)V")
	public static void method8100(@OriginalArg(1) Class86 arg0) {
		Static106.aClass86_1 = arg0;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIIIZ)V")
	public static void method8102(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && Static22.anInt551 == arg1 && arg2 == Static8.anInt114 && (Static91.anInt1705 == Static130.anInt2239 || Static234.aClass2_Sub5_48.aClass6_Sub13_1.method3763() == 1)) {
			return;
		}
		Static130.anInt2239 = Static91.anInt1705;
		Static22.anInt551 = arg1;
		Static8.anInt114 = arg2;
		if (Static234.aClass2_Sub5_48.aClass6_Sub13_1.method3763() == 1) {
			Static130.anInt2239 = 0;
		}
		Static158.method2370(arg0);
		Static445.method6068(Static389.aClass256_13, Static434.aClass271_12.method5972(Static483.anInt7694), Static505.aClass62_21, true, Static192.aClass95_4);
		@Pc(56) int local56 = Static132.anInt2246;
		@Pc(58) int local58 = Static123.anInt2176;
		Static132.anInt2246 = (Static22.anInt551 - (Static228.anInt3704 >> 4)) * 8;
		Static123.anInt2176 = (Static8.anInt114 - (Static162.anInt2911 >> 4)) * 8;
		Static61.aClass2_Sub2_Sub9_1 = Static193.method1286(Static22.anInt551 * 8, Static8.anInt114 * 8);
		Static146.aClass84_3 = null;
		@Pc(90) int local90 = Static132.anInt2246 - local56;
		@Pc(95) int local95 = Static123.anInt2176 - local58;
		@Pc(102) int local102;
		@Pc(115) int local115;
		@Pc(224) int local224;
		@Pc(177) int local177;
		if (arg0 == 11) {
			for (local102 = 0; local102 < Static645.anInt9916; local102++) {
				@Pc(108) Class2_Sub43 local108 = Static38.aClass2_Sub43Array1[local102];
				if (local108 != null) {
					@Pc(113) Class13_Sub1_Sub1_Sub1_Sub1 local113 = local108.aClass13_Sub1_Sub1_Sub1_Sub1_2;
					for (local115 = 0; local115 < 10; local115++) {
						local113.anIntArray307[local115] -= local90;
						local113.anIntArray306[local115] -= local95;
					}
					local113.anInt10089 -= local95 * 512;
					local113.anInt10090 -= local90 * 512;
				}
			}
		} else {
			Static639.anInt10306 = 0;
			@Pc(165) boolean local165 = false;
			@Pc(171) int local171 = Static228.anInt3704 * 512 - 512;
			local177 = (Static162.anInt2911 - 1) * 512;
			for (local115 = 0; local115 < Static645.anInt9916; local115++) {
				@Pc(185) Class2_Sub43 local185 = Static38.aClass2_Sub43Array1[local115];
				if (local185 != null) {
					@Pc(190) Class13_Sub1_Sub1_Sub1_Sub1 local190 = local185.aClass13_Sub1_Sub1_Sub1_Sub1_2;
					local190.anInt10089 -= local95 * 512;
					local190.anInt10090 -= local90 * 512;
					if (local190.anInt10090 >= 0 && local190.anInt10090 <= local171 && local190.anInt10089 >= 0 && local190.anInt10089 <= local177) {
						@Pc(222) boolean local222 = true;
						for (local224 = 0; local224 < 10; local224++) {
							local190.anIntArray307[local224] -= local90;
							local190.anIntArray306[local224] -= local95;
							if (local190.anIntArray307[local224] < 0 || Static228.anInt3704 <= local190.anIntArray307[local224] || local190.anIntArray306[local224] < 0 || local190.anIntArray306[local224] >= Static162.anInt2911) {
								local222 = false;
							}
						}
						if (local222) {
							Static147.anIntArray182[Static639.anInt10306++] = local190.anInt4582;
						} else {
							local190.method405(null);
							local185.method8653();
							local165 = true;
						}
					} else {
						local190.method405(null);
						local165 = true;
						local185.method8653();
					}
				}
			}
			if (local165) {
				Static645.anInt9916 = Static440.aClass118_41.method2602();
				Static440.aClass118_41.method2598(Static38.aClass2_Sub43Array1);
			}
		}
		for (local102 = 0; local102 < 2048; local102++) {
			@Pc(334) Class13_Sub1_Sub1_Sub1_Sub2 local334 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local102];
			if (local334 != null) {
				for (local177 = 0; local177 < 10; local177++) {
					local334.anIntArray307[local177] -= local90;
					local334.anIntArray306[local177] -= local95;
				}
				local334.anInt10090 -= local90 * 512;
				local334.anInt10089 -= local95 * 512;
			}
		}
		@Pc(384) Class372[] local384 = Static341.aClass372Array1;
		for (local177 = 0; local177 < local384.length; local177++) {
			@Pc(392) Class372 local392 = local384[local177];
			if (local392 != null) {
				local392.anInt9972 -= local90 * 512;
				local392.anInt9975 -= local95 * 512;
			}
		}
		for (@Pc(420) Class2_Sub52 local420 = (Class2_Sub52) Static212.aClass109_28.method2325(); local420 != null; local420 = (Class2_Sub52) Static212.aClass109_28.method2318()) {
			local420.anInt9838 -= local95;
			local420.anInt9843 -= local90;
			if (Static592.anInt9602 != 4 && (local420.anInt9843 < 0 || local420.anInt9838 < 0 || Static228.anInt3704 <= local420.anInt9843 || local420.anInt9838 >= Static162.anInt2911)) {
				local420.method8653();
			}
		}
		if (Static592.anInt9602 != 4) {
			for (@Pc(486) Class2_Sub11 local486 = (Class2_Sub11) Static41.aClass118_6.method2596(); local486 != null; local486 = (Class2_Sub11) Static41.aClass118_6.method2597()) {
				@Pc(494) int local494 = (int) (local486.aLong280 & 0x3FFFL);
				@Pc(499) int local499 = local494 - Static132.anInt2246;
				local224 = (int) (local486.aLong280 >> 14 & 0x3FFFL);
				@Pc(511) int local511 = local224 - Static123.anInt2176;
				if (local499 < 0 || local511 < 0 || Static228.anInt3704 <= local499 || Static162.anInt2911 <= local511) {
					local486.method8653();
				}
			}
		}
		if (Static621.anInt9980 != 0) {
			Static507.anInt8466 -= local95;
			Static621.anInt9980 -= local90;
		}
		Static613.method8240();
		if (arg0 != 11) {
			Static507.anInt8477 -= local95;
			Static639.anInt10305 -= local95;
			Static250.anInt4000 -= local90 * 512;
			Static644.anInt10376 -= local95 * 512;
			Static2.anInt54 -= local90;
			Static209.anInt4595 -= local90;
			if (Math.abs(local90) > Static228.anInt3704 || Math.abs(local95) > Static162.anInt2911) {
				Static249.method3418();
			}
		} else if (Static445.anInt7122 == 4) {
			Static319.anInt5080 -= local90 * 512;
			Static418.anInt6556 -= local95 * 512;
			Static263.anInt4236 -= local95 * 512;
			Static203.anInt3426 -= local90 * 512;
		} else {
			Static12.anInt159 = -1;
			Static8.anInt107 = -1;
			Static445.anInt7122 = 1;
		}
		Static111.method1666();
		Static174.method2588();
		Static616.aClass109_73.method2329();
		Static378.aClass109_71.method2329();
		Static246.aClass171_4.method3755();
		Static556.method8651();
	}
}

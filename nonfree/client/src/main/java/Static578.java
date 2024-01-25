import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
	public static int anInt9401;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "Lclient!wl;")
	public static final Class360 aClass360_6 = new Class360("WIP", 2);

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "Z")
	public static boolean aBoolean720 = false;

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "[Lclient!dr;")
	public static final Class84[] aClass84Array4 = new Class84[14];

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!r;)V")
	public static void method7802(@OriginalArg(1) Class100 arg0) {
		@Pc(7) int local7 = Static344.anInt6231;
		@Pc(9) int local9 = Static202.anInt3966;
		@Pc(11) int local11 = Static23.anInt642;
		@Pc(13) int local13 = Static306.anInt5446;
		arg0.method6261(-10660793, local7, local9, local13, local11);
		arg0.method6261(-16777216, local7 + 1, local9 + 1, 16, local11 - 2);
		arg0.method6200(local11 - 2, local9 + 18, local13 - 19, local7 + 1, -16777216);
		Static419.aClass29_13.method7111(-10660793, local7 + 3, Static290.aClass198_26.method4365(Static52.anInt1264), -1, local9 + 14);
		@Pc(80) int local80 = Static326.aClass149_1.method5879();
		@Pc(93) int local93 = Static326.aClass149_1.method5875();
		@Pc(95) int local95 = 0;
		for (@Pc(102) Class2_Sub5 local102 = (Class2_Sub5) Static375.aClass8_38.method210(); local102 != null; local102 = (Class2_Sub5) Static375.aClass8_38.method218()) {
			@Pc(117) int local117 = (Static347.anInt6255 - local95 - 1) * 16 + local9 + 31;
			@Pc(119) short local119 = -1;
			if (local7 < local80 && local80 < local11 + local7 && local117 - 13 < local93 && local117 + 3 > local93 && local102.aBoolean61) {
				local119 = -256;
			}
			@Pc(160) int[] local160 = null;
			if (Static370.method5499(local102.anInt902)) {
				local160 = Static296.aClass218_1.method5067((int) local102.aLong30).anIntArray648;
			} else if (local102.anInt896 != -1) {
				local160 = Static296.aClass218_1.method5067(local102.anInt896).anIntArray648;
			} else if (Static489.method6854(local102.anInt902)) {
				@Pc(200) Class2_Sub32 local200 = (Class2_Sub32) Static544.aClass162_40.method3519((long) local102.aLong30);
				if (local200 != null) {
					@Pc(205) Class6_Sub1_Sub1_Sub1_Sub1 local205 = local200.aClass6_Sub1_Sub1_Sub1_Sub1_1;
					@Pc(208) Class86 local208 = local205.aClass86_1;
					if (local208.anIntArray136 != null) {
						local208 = local208.method1567(Static70.aClass78_1);
					}
					if (local208 != null) {
						local160 = local208.anIntArray135;
					}
				}
			} else if (Static205.method3315(local102.anInt902)) {
				@Pc(248) Class32 local248;
				if (local102.anInt902 == 1008) {
					local248 = Static541.aClass97_4.method1794((int) local102.aLong30);
				} else {
					local248 = Static541.aClass97_4.method1794((int) (local102.aLong30 >>> 32 & 0x7FFFFFFFL));
				}
				if (local248.anIntArray50 != null) {
					local248 = local248.method552(Static70.aClass78_1);
				}
				if (local248 != null) {
					local160 = local248.anIntArray45;
				}
			}
			@Pc(277) String local277 = Static374.method5546(local102);
			if (local160 != null) {
				local277 = local277 + Static362.method5082(local160);
			}
			Static419.aClass29_13.method7112(Static126.aClass39Array14, local117, Static402.anIntArray482, local119, local7 + 3, local277);
			if (local102.aBoolean60) {
				Static525.aClass39_38.method7851(Static83.aClass294_6.method6718(local277) + local7 + 5, local117 + -12);
			}
			local95++;
		}
		Static573.method7737(Static202.anInt3966, Static344.anInt6231, Static23.anInt642, Static306.anInt5446);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
	public static void method7803() {
		if (Static568.anIntArray675 != null) {
			return;
		}
		Static568.anIntArray675 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(21) int local21 = 0;
		for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
			@Pc(41) float local41 = ((float) (local28 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(50) float local50 = (float) (local28 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(52) int local52 = 0; local52 < 128; local52++) {
				@Pc(59) float local59 = (float) local52 / 128.0F;
				@Pc(61) float local61 = 0.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(69) float local69 = local41 / 60.0F;
				@Pc(72) int local72 = (int) local69;
				@Pc(76) int local76 = local72 % 6;
				@Pc(82) float local82 = (float) -local72 + local69;
				@Pc(89) float local89 = local59 * (1.0F - local50);
				@Pc(97) float local97 = local59 * (1.0F - local50 * local82);
				@Pc(108) float local108 = (1.0F - local50 * (1.0F - local82)) * local59;
				if (local76 == 0) {
					local61 = local59;
					local63 = local108;
					local65 = local89;
				} else if (local76 == 1) {
					local61 = local97;
					local65 = local89;
					local63 = local59;
				} else if (local76 == 2) {
					local63 = local59;
					local65 = local108;
					local61 = local89;
				} else if (local76 == 3) {
					local61 = local89;
					local65 = local59;
					local63 = local97;
				} else if (local76 == 4) {
					local61 = local108;
					local63 = local89;
					local65 = local59;
				} else if (local76 == 5) {
					local61 = local59;
					local65 = local97;
					local63 = local89;
				}
				local61 = (float) Math.pow((double) local61, local19);
				local63 = (float) Math.pow((double) local63, local19);
				local65 = (float) Math.pow((double) local65, local19);
				@Pc(201) int local201 = (int) (local61 * 256.0F);
				@Pc(206) int local206 = (int) (local63 * 256.0F);
				@Pc(211) int local211 = (int) (local65 * 256.0F);
				@Pc(223) int local223 = local211 + (local201 << 16) + (local206 << 8) - 16777216;
				Static568.anIntArray675[local21++] = local223;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([S[Ljava/lang/String;I)V")
	public static void method7805(@OriginalArg(0) short[] arg0, @OriginalArg(1) String[] arg1) {
		Static213.method3442(0, arg1, arg1.length - 1, arg0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLclient!es;)Lclient!mj;")
	public static Class221_Sub1 method7807(@OriginalArg(1) Class2_Sub15 arg0) {
		return new Class221_Sub1(arg0.method4334(), arg0.method4334(), arg0.method4334(), arg0.method4334(), arg0.method4341(), arg0.method4341(), arg0.method4325());
	}
}

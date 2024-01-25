import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!vda", name = "C", descriptor = "I")
	public static int anInt9765;

	@OriginalMember(owner = "client!vda", name = "p", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_184 = new Class136(95, 6);

	@OriginalMember(owner = "client!vda", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString136 = null;

	@OriginalMember(owner = "client!vda", name = "B", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_185 = new Class136(79, 6);

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ZZ)I")
	public static int method8365(@OriginalArg(0) boolean arg0) {
		@Pc(10) int local10 = Static453.anInt7627;
		if (local10 == 0) {
			return arg0 ? 0 : Static355.anInt6322;
		} else if (local10 == 1) {
			return Static355.anInt6322;
		} else if (local10 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIB)V")
	public static void method8366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(10) Class5_Sub52 local10 = (Class5_Sub52) Static250.aClass306_16.method7313(); local10 != null; local10 = (Class5_Sub52) Static250.aClass306_16.method7301()) {
			Static361.method5655(local10, arg3, arg2, arg0, arg1);
		}
		@Pc(191) boolean local191;
		for (@Pc(36) Class5_Sub52 local36 = (Class5_Sub52) Static573.aClass306_59.method7313(); local36 != null; local36 = (Class5_Sub52) Static573.aClass306_59.method7301()) {
			@Pc(40) byte local40 = 1;
			@Pc(45) Class295 local45 = local36.aClass14_Sub1_Sub1_Sub3_Sub2_2.method2519();
			if (local36.aClass14_Sub1_Sub1_Sub3_Sub2_2.anInt2924 == -1 || local36.aClass14_Sub1_Sub1_Sub3_Sub2_2.aBoolean257) {
				local40 = 0;
			} else if (local45.anInt7956 == local36.aClass14_Sub1_Sub1_Sub3_Sub2_2.anInt2924 || local45.anInt7959 == local36.aClass14_Sub1_Sub1_Sub3_Sub2_2.anInt2924 || local36.aClass14_Sub1_Sub1_Sub3_Sub2_2.anInt2924 == local45.anInt7984 || local45.anInt7970 == local36.aClass14_Sub1_Sub1_Sub3_Sub2_2.anInt2924) {
				local40 = 2;
			} else if (local36.aClass14_Sub1_Sub1_Sub3_Sub2_2.anInt2924 == local45.anInt7969 || local45.anInt8001 == local36.aClass14_Sub1_Sub1_Sub3_Sub2_2.anInt2924 || local45.anInt7997 == local36.aClass14_Sub1_Sub1_Sub3_Sub2_2.anInt2924 || local45.anInt7958 == local36.aClass14_Sub1_Sub1_Sub3_Sub2_2.anInt2924) {
				local40 = 3;
			}
			if (local40 != local36.anInt10414) {
				@Pc(142) int local142 = Static138.method2075(local36.aClass14_Sub1_Sub1_Sub3_Sub2_2);
				@Pc(146) Class271 local146 = local36.aClass14_Sub1_Sub1_Sub3_Sub2_2.aClass271_1;
				if (local146.anIntArray591 != null) {
					local146 = local146.method6476(Static564.aClass304_1);
				}
				if (local146 == null || local142 == -1) {
					local36.anInt10414 = local40;
					local36.aBoolean837 = false;
					local36.anInt10410 = -1;
				} else if (local36.anInt10410 == local142 && local36.aBoolean837 == local146.aBoolean612) {
					local36.anInt10414 = local40;
					local36.anInt10425 = local146.anInt7313;
				} else {
					local191 = false;
					if (local36.aClass5_Sub16_Sub2_4 == null) {
						local191 = true;
					} else {
						local36.anInt10425 -= 512;
						if (local36.anInt10425 <= 0) {
							Static287.aClass5_Sub16_Sub3_1.method6144(local36.aClass5_Sub16_Sub2_4);
							local36.aClass5_Sub16_Sub2_4 = null;
							local191 = true;
						}
					}
					if (local191) {
						local36.aClass5_Sub38_3 = null;
						local36.anInt10425 = local146.anInt7313;
						local36.anInt10414 = local40;
						local36.aClass5_Sub11_Sub1_4 = null;
						local36.aBoolean837 = local146.aBoolean612;
						local36.anInt10410 = local142;
					}
				}
			}
			local36.anInt10413 = local36.aClass14_Sub1_Sub1_Sub3_Sub2_2.anInt9317;
			local36.anInt10421 = local36.aClass14_Sub1_Sub1_Sub3_Sub2_2.anInt9317 + (local36.aClass14_Sub1_Sub1_Sub3_Sub2_2.method2509() << 8);
			local36.anInt10409 = local36.aClass14_Sub1_Sub1_Sub3_Sub2_2.anInt9315;
			local36.anInt10420 = local36.aClass14_Sub1_Sub1_Sub3_Sub2_2.anInt9315 + (local36.aClass14_Sub1_Sub1_Sub3_Sub2_2.method2509() << 8);
			Static361.method5655(local36, arg3, arg2, arg0, arg1);
		}
		for (@Pc(294) Class5_Sub52 local294 = (Class5_Sub52) Static616.aClass81_73.method1608(); local294 != null; local294 = (Class5_Sub52) Static616.aClass81_73.method1610()) {
			@Pc(298) byte local298 = 1;
			@Pc(303) Class295 local303 = local294.aClass14_Sub1_Sub1_Sub3_Sub1_2.method2519();
			if (local294.aClass14_Sub1_Sub1_Sub3_Sub1_2.anInt2924 == -1 || local294.aClass14_Sub1_Sub1_Sub3_Sub1_2.aBoolean257) {
				local298 = 0;
			} else if (local294.aClass14_Sub1_Sub1_Sub3_Sub1_2.anInt2924 == local303.anInt7956 || local294.aClass14_Sub1_Sub1_Sub3_Sub1_2.anInt2924 == local303.anInt7959 || local303.anInt7984 == local294.aClass14_Sub1_Sub1_Sub3_Sub1_2.anInt2924 || local303.anInt7970 == local294.aClass14_Sub1_Sub1_Sub3_Sub1_2.anInt2924) {
				local298 = 2;
			} else if (local294.aClass14_Sub1_Sub1_Sub3_Sub1_2.anInt2924 == local303.anInt7969 || local303.anInt8001 == local294.aClass14_Sub1_Sub1_Sub3_Sub1_2.anInt2924 || local303.anInt7997 == local294.aClass14_Sub1_Sub1_Sub3_Sub1_2.anInt2924 || local294.aClass14_Sub1_Sub1_Sub3_Sub1_2.anInt2924 == local303.anInt7958) {
				local298 = 3;
			}
			if (local298 != local294.anInt10414) {
				@Pc(400) int local400 = Static94.method8744(local294.aClass14_Sub1_Sub1_Sub3_Sub1_2);
				if (local400 == local294.anInt10410 && local294.aClass14_Sub1_Sub1_Sub3_Sub1_2.aBoolean239 == local294.aBoolean837) {
					local294.anInt10414 = local298;
					local294.anInt10425 = local294.aClass14_Sub1_Sub1_Sub3_Sub1_2.anInt2737;
				} else {
					local191 = false;
					if (local294.aClass5_Sub16_Sub2_4 == null) {
						local191 = true;
					} else {
						local294.anInt10425 -= 512;
						if (local294.anInt10425 <= 0) {
							Static287.aClass5_Sub16_Sub3_1.method6144(local294.aClass5_Sub16_Sub2_4);
							local294.aClass5_Sub16_Sub2_4 = null;
							local191 = true;
						}
					}
					if (local191) {
						local294.aClass5_Sub11_Sub1_4 = null;
						local294.aClass5_Sub38_3 = null;
						local294.anInt10425 = local294.aClass14_Sub1_Sub1_Sub3_Sub1_2.anInt2737;
						local294.anInt10414 = local298;
						local294.aBoolean837 = local294.aClass14_Sub1_Sub1_Sub3_Sub1_2.aBoolean239;
						local294.anInt10410 = local400;
					}
				}
			}
			local294.anInt10413 = local294.aClass14_Sub1_Sub1_Sub3_Sub1_2.anInt9317;
			local294.anInt10421 = local294.aClass14_Sub1_Sub1_Sub3_Sub1_2.anInt9317 + (local294.aClass14_Sub1_Sub1_Sub3_Sub1_2.method2509() << 8);
			local294.anInt10409 = local294.aClass14_Sub1_Sub1_Sub3_Sub1_2.anInt9315;
			local294.anInt10420 = local294.aClass14_Sub1_Sub1_Sub3_Sub1_2.anInt9315 + (local294.aClass14_Sub1_Sub1_Sub3_Sub1_2.method2509() << 8);
			Static361.method5655(local294, arg3, arg2, arg0, arg1);
		}
	}
}

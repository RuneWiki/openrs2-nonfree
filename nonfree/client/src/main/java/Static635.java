import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static635 {

	@OriginalMember(owner = "client!via", name = "j", descriptor = "J")
	public static long aLong288;

	@OriginalMember(owner = "client!via", name = "m", descriptor = "Lclient!wia;")
	public static Class386 aClass386_136;

	@OriginalMember(owner = "client!via", name = "n", descriptor = "F")
	public static float aFloat261;

	@OriginalMember(owner = "client!via", name = "f", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_135 = new Class100(7, 7);

	@OriginalMember(owner = "client!via", name = "k", descriptor = "Z")
	public static boolean aBoolean732 = false;

	@OriginalMember(owner = "client!via", name = "l", descriptor = "Lclient!dt;")
	public static final Class77 aClass77_9 = new Class77("stellardawn", "Stellar Dawn", 1);

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(B)V")
	public static void method8862() {
		@Pc(11) short local11 = 1024;
		@Pc(13) short local13 = 3072;
		if (Static401.aBoolean511) {
			if (Static521.aBoolean635) {
				local11 = 2048;
			}
			local13 = 4096;
		}
		if ((float) local11 > Static2.aFloat1) {
			Static2.aFloat1 = (float) local11;
		}
		if ((float) local13 < Static2.aFloat1) {
			Static2.aFloat1 = (float) local13;
		}
		while (Static543.aFloat228 >= 16384.0F) {
			Static543.aFloat228 -= 16384.0F;
		}
		while (Static543.aFloat228 < 0.0F) {
			Static543.aFloat228 += 16384.0F;
		}
		@Pc(61) int local61 = Static569.anInt9811 >> 9;
		@Pc(65) int local65 = Static59.anInt1432 >> 9;
		@Pc(71) int local71 = Static152.method2434(Static569.anInt9811, Static586.anInt10060, Static59.anInt1432);
		@Pc(73) int local73 = 0;
		@Pc(99) int local99;
		if (local61 > 3 && local65 > 3 && Static26.anInt462 - 4 > local61 && Static445.anInt6140 - 4 > local65) {
			for (local99 = local61 - 4; local99 <= local61 + 4; local99++) {
				for (@Pc(105) int local105 = local65 - 4; local105 <= local65 + 4; local105++) {
					@Pc(109) int local109 = Static586.anInt10060;
					if (local109 < 3 && Static329.method5158(local105, local99)) {
						local109++;
					}
					@Pc(122) int local122 = 0;
					if (Static143.aClass49_Sub1_1.aByteArrayArrayArray14 != null && Static143.aClass49_Sub1_1.aByteArrayArrayArray14[local109] != null) {
						local122 = (Static143.aClass49_Sub1_1.aByteArrayArrayArray14[local109][local99][local105] & 0xFF) * 8 << 2;
					}
					if (Static576.aClass51Array3 != null && Static576.aClass51Array3[local109] != null) {
						@Pc(165) int local165 = local71 + local122 - Static576.aClass51Array3[local109].method7857(local105, local99);
						if (local165 > local73) {
							local73 = local165;
						}
					}
				}
			}
		}
		local99 = (local73 >> 2) * 1536;
		if (local99 > 786432) {
			local99 = 786432;
		}
		if (local99 < 262144) {
			local99 = 262144;
		}
		if (local99 > Static258.anInt4460) {
			Static258.anInt4460 += (local99 - Static258.anInt4460) / 24;
		} else if (Static258.anInt4460 > local99) {
			Static258.anInt4460 += (local99 - Static258.anInt4460) / 80;
		}
	}

	@OriginalMember(owner = "client!via", name = "c", descriptor = "(I)V")
	public static void method8867() {
		@Pc(5) Class264 local5 = Static566.aClass264_56;
		synchronized (Static566.aClass264_56) {
			Static566.aClass264_56.method6368();
		}
	}
}

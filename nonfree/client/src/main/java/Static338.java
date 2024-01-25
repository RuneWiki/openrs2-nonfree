import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!r", name = "e", descriptor = "[S")
	public static final short[] aShortArray99 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!r", name = "j", descriptor = "Lclient!lh;")
	public static final Class151 aClass151_145 = new Class151(200);

	@OriginalMember(owner = "client!r", name = "k", descriptor = "[F")
	public static final float[] aFloatArray39 = new float[16];

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public static void method4861() {
		@Pc(9) int local9 = Static229.anInt3930 * 128 + 64;
		@Pc(15) int local15 = Static322.anInt4035 * 128 + 64;
		@Pc(31) int local31 = Static405.method5510(local15, local9, Static1.anInt41) - Static224.anInt3893;
		if (Static398.anInt7110 < 100) {
			if (Static302.anInt5030 < local9) {
				Static302.anInt5030 += Static68.anInt1239 + Static398.anInt7110 * (local9 - Static302.anInt5030) / 1000;
				if (local9 < Static302.anInt5030) {
					Static302.anInt5030 = local9;
				}
			}
			if (local31 > Static264.anInt4481) {
				Static264.anInt4481 += Static398.anInt7110 * (local31 - Static264.anInt4481) / 1000 + Static68.anInt1239;
				if (Static264.anInt4481 > local31) {
					Static264.anInt4481 = local31;
				}
			}
			if (local9 < Static302.anInt5030) {
				Static302.anInt5030 -= (Static302.anInt5030 - local9) * Static398.anInt7110 / 1000 + Static68.anInt1239;
				if (local9 > Static302.anInt5030) {
					Static302.anInt5030 = local9;
				}
			}
			if (local31 < Static264.anInt4481) {
				Static264.anInt4481 -= Static398.anInt7110 * (Static264.anInt4481 - local31) / 1000 + Static68.anInt1239;
				if (Static264.anInt4481 < local31) {
					Static264.anInt4481 = local31;
				}
			}
			if (Static4.anInt149 < local15) {
				Static4.anInt149 += (local15 - Static4.anInt149) * Static398.anInt7110 / 1000 + Static68.anInt1239;
				if (local15 < Static4.anInt149) {
					Static4.anInt149 = local15;
				}
			}
			if (local15 < Static4.anInt149) {
				Static4.anInt149 -= Static68.anInt1239 + (Static4.anInt149 - local15) * Static398.anInt7110 / 1000;
				if (Static4.anInt149 < local15) {
					Static4.anInt149 = local15;
				}
			}
		} else {
			Static4.anInt149 = Static322.anInt4035 * 128 + 64;
			Static302.anInt5030 = Static229.anInt3930 * 128 + 64;
			Static264.anInt4481 = Static405.method5510(Static4.anInt149, Static302.anInt5030, Static1.anInt41) - Static224.anInt3893;
		}
		local9 = Static382.anInt5701 * 128 + 64;
		local15 = Static321.anInt5590 * 128 + 64;
		local31 = Static405.method5510(local15, local9, Static1.anInt41) - Static84.anInt6174;
		@Pc(226) int local226 = local9 - Static302.anInt5030;
		@Pc(230) int local230 = local31 - Static264.anInt4481;
		@Pc(235) int local235 = local15 - Static4.anInt149;
		@Pc(246) int local246 = (int) Math.sqrt((double) (local226 * local226 + local235 * local235));
		@Pc(257) int local257 = (int) (Math.atan2((double) local230, (double) local246) * 2607.5945876176133D) & 0x3FFF;
		@Pc(268) int local268 = (int) (-2607.5945876176133D * Math.atan2((double) local226, (double) local235)) & 0x3FFF;
		if (local257 < 1024) {
			local257 = 1024;
		}
		if (local257 > 3072) {
			local257 = 3072;
		}
		if (Static401.anInt7130 < local257) {
			Static401.anInt7130 += Static383.anInt3787 + Static207.anInt3759 * (local257 - Static401.anInt7130 >> 3) / 1000 << 3;
			if (local257 < Static401.anInt7130) {
				Static401.anInt7130 = local257;
			}
		}
		if (Static401.anInt7130 > local257) {
			Static401.anInt7130 -= Static207.anInt3759 * (Static401.anInt7130 - local257 >> 3) / 1000 + Static383.anInt3787 << 3;
			if (Static401.anInt7130 < local257) {
				Static401.anInt7130 = local257;
			}
		}
		@Pc(338) int local338 = local268 - Static432.anInt7548;
		if (local338 > 8192) {
			local338 -= 16384;
		}
		if (local338 < -8192) {
			local338 += 16384;
		}
		local338 >>= 0x3;
		if (local338 > 0) {
			Static432.anInt7548 += local338 * Static207.anInt3759 / 1000 + Static383.anInt3787 << 3;
			Static432.anInt7548 &= 0x3FFF;
		}
		if (local338 < 0) {
			Static432.anInt7548 -= -local338 * Static207.anInt3759 / 1000 + Static383.anInt3787 << 3;
			Static432.anInt7548 &= 0x3FFF;
		}
		@Pc(396) int local396 = local268 - Static432.anInt7548;
		if (local396 > 8192) {
			local396 -= 16384;
		}
		if (local396 < -8192) {
			local396 += 16384;
		}
		Static423.anInt7380 = 0;
		if (local396 < 0 && local338 > 0 || local396 > 0 && local338 < 0) {
			Static432.anInt7548 = local268;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!hh;)I")
	public static int method4863(@OriginalArg(1) Class109 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method2348(Static406.anInt7171)) {
			local5++;
		}
		if (arg0.method2348(Static349.anInt6364)) {
			local5++;
		}
		if (arg0.method2348(Static355.anInt6512)) {
			local5++;
		}
		if (arg0.method2348(Static61.anInt1110)) {
			local5++;
		}
		if (arg0.method2348(Static239.anInt4211)) {
			local5++;
		}
		if (arg0.method2348(Static427.anInt7220)) {
			local5++;
		}
		if (arg0.method2348(Static68.anInt1240)) {
			local5++;
		}
		if (arg0.method2348(Static118.anInt2253)) {
			local5++;
		}
		if (arg0.method2348(Static291.anInt7741)) {
			local5++;
		}
		if (arg0.method2348(Static290.anInt4864)) {
			local5++;
		}
		if (arg0.method2348(Static274.anInt4620)) {
			local5++;
		}
		if (arg0.method2348(Static442.anInt7682)) {
			local5++;
		}
		if (arg0.method2348(Static111.anInt2134)) {
			local5++;
		}
		if (arg0.method2348(Static250.anInt4324)) {
			local5++;
		}
		if (arg0.method2348(Static165.anInt4809)) {
			local5++;
		}
		if (arg0.method2348(Static40.anInt624)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)V")
	public static void method4864(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub1_Sub1 local8 = Static190.method3007(arg0, 14);
		local8.method28();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_129 = new Class218(29, 3);

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray10 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V")
	public static void method7726() {
		Static314.method5350(-1, 255);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!dv;I)I")
	public static int method7729(@OriginalArg(0) Class2_Sub3_Sub1_Sub2_Sub1 arg0) {
		@Pc(8) Class22 local8 = arg0.aClass22_1;
		if (local8.anIntArray29 != null) {
			local8 = local8.method425(Static514.aClass166_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt402;
		@Pc(27) Class232 local27 = arg0.method5304();
		if (arg0.anInt6273 == -1 || arg0.aBoolean531) {
			local23 = local8.anInt415;
		} else if (arg0.anInt6273 == local27.anInt7157 || arg0.anInt6273 == local27.anInt7185 || local27.anInt7153 == arg0.anInt6273 || arg0.anInt6273 == local27.anInt7161) {
			local23 = local8.anInt390;
		} else if (local27.anInt7175 == arg0.anInt6273 || local27.anInt7188 == arg0.anInt6273 || arg0.anInt6273 == local27.anInt7178 || arg0.anInt6273 == local27.anInt7150) {
			local23 = local8.anInt426;
		}
		return local23;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
	public static void method7730() {
		Static553.anInt9450 = (int) ((double) Static394.anInt7540 * 34.46D);
		Static378.anInt7159 = 200;
		Static553.anInt9450 <<= 0x2;
		if (Static47.aClass33_3.method6192()) {
			Static553.anInt9450 += 512;
		}
		Static648.method8676(false);
	}
}

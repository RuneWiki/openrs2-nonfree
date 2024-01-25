import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!uh", name = "K", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_320 = new Class288(107, 6);

	@OriginalMember(owner = "client!uh", name = "P", descriptor = "[J")
	public static final long[] aLongArray48 = new long[32];

	@OriginalMember(owner = "client!uh", name = "R", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_321 = new Class288(56, 6);

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "(I)V")
	public static void method7859() {
		if (Static133.anInt2248 == -1 || Static239.anInt3904 == -1) {
			return;
		}
		@Pc(29) int local29 = (Static261.anInt4097 * (Static473.anInt7589 - Static177.anInt8966) >> 16) + Static177.anInt8966;
		Static261.anInt4097 += local29;
		if (Static261.anInt4097 >= 65535) {
			if (Static163.aBoolean222) {
				Static208.aBoolean252 = false;
			} else {
				Static208.aBoolean252 = true;
			}
			Static261.anInt4097 = 65535;
			Static163.aBoolean222 = true;
		} else {
			Static208.aBoolean252 = false;
			Static163.aBoolean222 = false;
		}
		@Pc(61) float local61 = (float) Static261.anInt4097 / 65535.0F;
		@Pc(64) float[] local64 = new float[3];
		@Pc(68) int local68 = Static620.anInt9963 * 2;
		@Pc(94) int local94;
		@Pc(128) int local128;
		@Pc(136) int local136;
		@Pc(140) int local140;
		@Pc(149) int local149;
		@Pc(167) int local167;
		for (@Pc(70) int local70 = 0; local70 < 3; local70++) {
			@Pc(82) int local82 = Static543.anIntArrayArrayArray19[Static133.anInt2248][local68][local70] * 3;
			local94 = Static543.anIntArrayArrayArray19[Static133.anInt2248][local68 + 1][local70] * 3;
			local128 = (Static543.anIntArrayArrayArray19[Static133.anInt2248][local68 + 2][local70] + Static543.anIntArrayArrayArray19[Static133.anInt2248][local68 + 2][local70] - Static543.anIntArrayArrayArray19[Static133.anInt2248][local68 + 3][local70]) * 3;
			local136 = Static543.anIntArrayArrayArray19[Static133.anInt2248][local68][local70];
			local140 = local94 - local82;
			local149 = local128 + local82 - local94 * 2;
			local167 = local94 + Static543.anIntArrayArrayArray19[Static133.anInt2248][local68 + 2][local70] - local136 - local128;
			local64[local70] = (float) local136 + local61 * (((float) local149 + local61 * (float) local167) * local61 + (float) local140);
		}
		Static250.anInt4000 = (int) local64[0] - Static132.anInt2246 * 512;
		Static220.anInt3605 = (int) local64[1] * -1;
		Static644.anInt10376 = (int) local64[2] - Static123.anInt2176 * 512;
		@Pc(222) float[] local222 = new float[3];
		local94 = Static541.anInt8878 * 2;
		for (local128 = 0; local128 < 3; local128++) {
			local136 = Static543.anIntArrayArrayArray19[Static239.anInt3904][local94][local128] * 3;
			local140 = Static543.anIntArrayArrayArray19[Static239.anInt3904][local94 + 1][local128] * 3;
			local149 = (Static543.anIntArrayArrayArray19[Static239.anInt3904][local94 + 2][local128] + Static543.anIntArrayArrayArray19[Static239.anInt3904][local94 + 2][local128] - Static543.anIntArrayArrayArray19[Static239.anInt3904][local94 + 3][local128]) * 3;
			local167 = Static543.anIntArrayArrayArray19[Static239.anInt3904][local94][local128];
			@Pc(297) int local297 = local140 - local136;
			@Pc(305) int local305 = local149 + local136 - local140 * 2;
			@Pc(324) int local324 = Static543.anIntArrayArrayArray19[Static239.anInt3904][local94 + 2][local128] + local140 - local167 - local149;
			local222[local128] = (float) local167 + local61 * ((float) local297 + ((float) local305 + local61 * (float) local324) * local61);
		}
		@Pc(358) float local358 = local222[0] - local64[0];
		@Pc(369) float local369 = -1.0F * (local222[1] - local64[1]);
		@Pc(377) float local377 = local222[2] - local64[2];
		@Pc(387) double local387 = Math.sqrt((double) (local358 * local358 + local377 * local377));
		Static440.anInt7072 = (int) (Math.atan2((double) local369, local387) * 2607.5945876176133D) & 0x3FFF;
		Static338.anInt5355 = (int) (-Math.atan2((double) local358, (double) local377) * 2607.5945876176133D) & 0x3FFF;
		Static161.anInt2901 = ((Static543.anIntArrayArrayArray19[Static133.anInt2248][local68 + 2][3] - Static543.anIntArrayArrayArray19[Static133.anInt2248][local68][3]) * Static261.anInt4097 >> 16) + Static543.anIntArrayArrayArray19[Static133.anInt2248][local68][3];
	}

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "(I)V")
	public static void method7860() {
		Static228.aClass32_37.method640();
	}
}

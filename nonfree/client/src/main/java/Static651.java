import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static651 {

	@OriginalMember(owner = "client!uh", name = "K", descriptor = "I")
	public static int anInt10057;

	@OriginalMember(owner = "client!uh", name = "H", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_99 = new Class144(67, 2);

	@OriginalMember(owner = "client!uh", name = "J", descriptor = "[J")
	public static final long[] aLongArray25 = new long[32];

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)V")
	public static void method8576() {
		@Pc(7) short local7 = 1024;
		@Pc(9) short local9 = 3072;
		if (Static444.aBoolean451) {
			local9 = 4096;
			if (Static120.aBoolean161) {
				local7 = 2048;
			}
		}
		if (Static447.aFloat107 < (float) local7) {
			Static447.aFloat107 = (float) local7;
		}
		while (Static382.aFloat40 >= 16384.0F) {
			Static382.aFloat40 -= 16384.0F;
		}
		if ((float) local9 < Static447.aFloat107) {
			Static447.aFloat107 = (float) local9;
		}
		while (Static382.aFloat40 < 0.0F) {
			Static382.aFloat40 += 16384.0F;
		}
		@Pc(74) int local74 = Static690.anInt10754 >> 9;
		@Pc(78) int local78 = Static504.anInt8040 >> 9;
		@Pc(84) int local84 = Static77.method1633(Static504.anInt8040, Static690.anInt10754, Static723.anInt11225);
		@Pc(86) int local86 = 0;
		@Pc(124) int local124;
		if (local74 > 3 && local78 > 3 && local74 < Static497.anInt7926 - 4 && Static646.anInt9979 - 4 > local78) {
			for (local124 = local74 - 4; local124 <= local74 + 4; local124++) {
				for (@Pc(132) int local132 = local78 - 4; local132 <= local78 + 4; local132++) {
					@Pc(136) int local136 = Static723.anInt11225;
					if (local136 < 3 && Static574.method7435(local124, local132)) {
						local136++;
					}
					@Pc(151) int local151 = 0;
					if (Static414.aClass114_Sub1_15.aByteArrayArrayArray14 != null && Static414.aClass114_Sub1_15.aByteArrayArrayArray14[local136] != null) {
						local151 = (Static414.aClass114_Sub1_15.aByteArrayArrayArray14[local136][local124][local132] & 0xFF) * 8 << 2;
					}
					if (Static477.aClass259Array3 != null && Static477.aClass259Array3[local136] != null) {
						@Pc(196) int local196 = local84 + local151 - Static477.aClass259Array3[local136].method9295(local132, local124);
						if (local86 < local196) {
							local86 = local196;
						}
					}
				}
			}
		}
		local124 = (local86 >> 2) * 1536;
		if (local124 > 786432) {
			local124 = 786432;
		}
		if (local124 < 262144) {
			local124 = 262144;
		}
		if (Static13.anInt569 < local124) {
			Static13.anInt569 += (local124 - Static13.anInt569) / 24;
		} else if (local124 < Static13.anInt569) {
			Static13.anInt569 += (local124 - Static13.anInt569) / 80;
		}
	}
}

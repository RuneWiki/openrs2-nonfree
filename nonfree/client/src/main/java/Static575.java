import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
	public static final int anInt10030 = Static8.method135(1600);

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "([[BLclient!qv;I)V")
	public static void method8733(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class29_Sub1 arg1) {
		@Pc(8) int local8 = Static617.aByteArrayArray24.length;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) byte[] local23 = arg0[local17];
			if (local23 != null) {
				@Pc(36) int local36 = (Static437.anIntArray399[local17] >> 8) * 64 - Static640.anInt11085;
				@Pc(47) int local47 = (Static437.anIntArray399[local17] & 0xFF) * 64 - Static490.anInt8763;
				Static25.method456();
				arg1.method7863(Static607.aClass101_15, local47, Static196.aClass200Array1, local23, local36);
			}
		}
	}
}

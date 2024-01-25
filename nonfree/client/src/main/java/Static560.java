import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
	public static int anInt9971;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILjava/lang/String;[B)I")
	public static int method8099(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(15) int local15 = arg0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg1.charAt(local17);
			if (local23 <= '\u007f') {
				arg2[local15++] = (byte) local23;
			} else if (local23 <= '\u07ff') {
				arg2[local15++] = (byte) (local23 >> 6 | 0xC0);
				arg2[local15++] = (byte) (local23 & 0x3F | 0x80);
			} else {
				arg2[local15++] = (byte) (local23 >> 12 | 0xE0);
				arg2[local15++] = (byte) (local23 >> 6 & 0x3F | 0x80);
				arg2[local15++] = (byte) (local23 & 0x3F | 0x80);
			}
		}
		return local15 - arg0;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIII)I")
	public static int method8100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static130.anInt2933 < 100) {
			return -2;
		}
		@Pc(10) int local10 = -2;
		@Pc(12) int local12 = Integer.MAX_VALUE;
		@Pc(16) int local16 = arg0 - Static87.anInt6928;
		@Pc(21) int local21 = arg1 - Static87.anInt6924;
		for (@Pc(26) Class3_Sub32 local26 = (Class3_Sub32) Static87.aClass183_42.method4795(); local26 != null; local26 = (Class3_Sub32) Static87.aClass183_42.method4793()) {
			if (local26.anInt5918 == arg2) {
				@Pc(47) int local47 = local26.anInt5917;
				@Pc(50) int local50 = local26.anInt5916;
				@Pc(61) int local61 = local47 + Static87.anInt6928 << 14 | Static87.anInt6924 + local50;
				@Pc(80) int local80 = (local16 - local47) * (local16 - local47) + (local21 - local50) * (-local50 + local21);
				if (local10 < 0 || local80 < local12) {
					local12 = local80;
					local10 = local61;
				}
			}
		}
		return local10;
	}
}

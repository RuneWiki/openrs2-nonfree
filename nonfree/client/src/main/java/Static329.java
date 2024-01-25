import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)I")
	public static int method5150(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(24) int local24 = (local14 >>> 2 & 0x33333333) + (local14 & 0x33333333);
		@Pc(32) int local32 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(45) int local45 = local32 + (local32 >>> 8);
		@Pc(51) int local51 = local45 + (local45 >>> 16);
		return local51 & 0xFF;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(IZ)I")
	public static int method5151(@OriginalArg(1) boolean arg0) {
		if (Static540.anIntArray254 == null) {
			return 0;
		} else if (arg0 || Static510.aClass139Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(22) int local22 = 0; local22 < Static540.anIntArray254.length; local22++) {
				@Pc(28) int local28 = Static540.anIntArray254[local22];
				if (Static400.aClass251_96.method5782(local28)) {
					local20++;
				}
				if (Static1.aClass251_127.method5782(local28)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static540.anIntArray254.length * 2;
		}
	}
}

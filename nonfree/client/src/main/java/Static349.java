import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
	public static int anInt6137;

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
	public static int anInt6143;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
	public static void method5248() {
		@Pc(7) Class286 local7 = null;
		try {
			@Pc(13) Class366 local13 = Static294.aClass230_3.method5344("2");
			while (local13.anInt10206 == 0) {
				Static351.method5279(1L);
			}
			if (local13.anInt10206 == 1) {
				local7 = (Class286) local13.anObject18;
				@Pc(44) byte[] local44 = new byte[(int) local7.method6823()];
				@Pc(58) int local58;
				for (@Pc(46) int local46 = 0; local46 < local44.length; local46 += local58) {
					local58 = local7.method6822(local44.length - local46, local44, local46);
					if (local58 == -1) {
						throw new IOException("EOF");
					}
				}
				Static375.method5511(new Class5_Sub23(local44), 46);
			}
		} catch (@Pc(85) Exception local85) {
		}
		try {
			if (local7 != null) {
				local7.method6820();
			}
		} catch (@Pc(92) Exception local92) {
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)Z")
	public static boolean method5252(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)J")
	public static long method5257(@OriginalArg(0) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}
}

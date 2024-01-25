import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!mf", name = "jb", descriptor = "[I")
	public static final int[] anIntArray429 = new int[3];

	@OriginalMember(owner = "client!mf", name = "kb", descriptor = "[I")
	public static final int[] anIntArray430 = new int[1];

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "(I)Lclient!hd;")
	public static Class4_Sub20 method4906() {
		@Pc(7) Class80 local7 = null;
		@Pc(13) Class4_Sub20 local13 = new Class4_Sub20(Static333.aClass234_5, 0);
		try {
			@Pc(19) Class281 local19 = Static239.aClass207_2.method4574("");
			while (local19.anInt7338 == 0) {
				Static491.method6679(1L);
			}
			if (local19.anInt7338 == 1) {
				local7 = (Class80) local19.anObject17;
				@Pc(48) byte[] local48 = new byte[(int) local7.method2120()];
				@Pc(63) int local63;
				for (@Pc(50) int local50 = 0; local50 < local48.length; local50 += local63) {
					local63 = local7.method2121(local50, local48.length - local50, local48);
					if (local63 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class4_Sub20(new Class4_Sub11(local48), Static333.aClass234_5, 0);
			}
		} catch (@Pc(91) Exception local91) {
		}
		try {
			if (local7 != null) {
				local7.method2118();
			}
		} catch (@Pc(98) Exception local98) {
		}
		return local13;
	}
}

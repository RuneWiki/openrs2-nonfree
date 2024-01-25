import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
	public static int anInt4696;

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "Lclient!qn;")
	public static Class211 aClass211_70;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_178 = new Class56(51, -1);

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
	public static int anInt4697 = 0;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB[BI)I")
	public static int method3734(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = -1;
		for (@Pc(18) int local18 = arg0; local18 < arg2; local18++) {
			local16 = local16 >>> 8 ^ Class230.anIntArray479[(arg1[local18] ^ local16) & 0xFF];
		}
		return ~local16;
	}
}

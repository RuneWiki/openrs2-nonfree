import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!kl", name = "N", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_239 = new Class305(87, -1);

	@OriginalMember(owner = "client!kl", name = "Q", descriptor = "I")
	public static int anInt4946 = 0;

	@OriginalMember(owner = "client!kl", name = "S", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_72 = new Class252(27, 8);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BB)C")
	public static char method4580(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(41) char local41 = Static115.aCharArray5[local7 - 128];
			if (local41 == '\u0000') {
				local41 = '?';
			}
			local7 = local41;
		}
		return (char) local7;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_68 = new Class243(49, 6);

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "Z")
	public static boolean aBoolean522 = false;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[BI)I")
	public static int method5902(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = arg2; local7 < arg0; local7++) {
			local5 = local5 >>> 8 ^ Class2_Sub13_Sub17.anIntArray644[(local5 ^ arg1[local7]) & 0xFF];
		}
		return ~local5;
	}
}

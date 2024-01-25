import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!vu", name = "D", descriptor = "F")
	public static float aFloat204;

	@OriginalMember(owner = "client!vu", name = "B", descriptor = "I")
	public static int anInt10049 = -1;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(II[BI)I")
	public static int method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = arg1; local7 < arg0; local7++) {
			local5 = local5 >>> 8 ^ Class231.anIntArray451[(local5 ^ arg2[local7]) & 0xFF];
		}
		return ~local5;
	}
}

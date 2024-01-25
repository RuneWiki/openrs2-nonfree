import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
	public static int anInt7931;

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "Lclient!jia;")
	public static Class193 aClass193_48 = new Class193();

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[BII)I")
	public static int method6642(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = -1;
		for (@Pc(17) int local17 = arg2; local17 < arg1; local17++) {
			local15 = Class17_Sub8.anIntArray262[(arg0[local17] ^ local15) & 0xFF] ^ local15 >>> 8;
		}
		return ~local15;
	}
}

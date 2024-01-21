import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class88 {

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "[I")
	public static int[] anIntArray580 = new int[256];

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1595;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "Lclient!td;")
	public static Class79 aClass79_28;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "[I")
	public static int[] anIntArray581;

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
	public static int anInt4185;

	static {
		@Pc(7) int local7;
		@Pc(4) int local4;
		@Pc(9) int local9;
		for (local4 = 0; local4 < 256; local4++) {
			local7 = local4;
			for (local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray580[local4] = local7;
		}
		aClass23_1595 = Static169.method2903("(U3");
		aClass79_28 = new Class79(64);
		anIntArray581 = new int[99];
		anInt4185 = 0;
		local7 = 0;
		for (local4 = 0; local4 < 99; local4++) {
			local9 = local4 + 1;
			@Pc(78) int local78 = (int) (Math.pow(2.0D, (double) local9 / 7.0D) * 300.0D + (double) local9);
			local7 += local78;
			anIntArray581[local4] = local7 / 4;
		}
	}
}

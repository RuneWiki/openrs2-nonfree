import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "[I")
	public static int[] anIntArray6 = new int[256];

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "Lclient!ea;")
	public Class18 aClass18_67;

	static {
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			@Pc(21) int local21 = local18;
			for (@Pc(23) int local23 = 0; local23 < 8; local23++) {
				if ((local21 & 0x1) == 1) {
					local21 = local21 >>> 1 ^ 0xEDB88320;
				} else {
					local21 >>>= 0x1;
				}
			}
			anIntArray6[local18] = local21;
		}
	}
}

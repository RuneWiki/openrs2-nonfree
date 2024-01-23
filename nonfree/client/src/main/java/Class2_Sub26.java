import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class2_Sub26 extends Class2 {

	@OriginalMember(owner = "client!ti", name = "u", descriptor = "[I")
	public static int[] anIntArray450 = new int[256];

	@OriginalMember(owner = "client!ti", name = "v", descriptor = "Lclient!i;")
	public Class41 aClass41_1152;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray450[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
	public Class2_Sub26() {
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!i;)V")
	public Class2_Sub26(@OriginalArg(0) Class41 arg0) {
		this.aClass41_1152 = arg0;
	}
}

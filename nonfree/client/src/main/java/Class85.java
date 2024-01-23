import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class85 {

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "[I")
	public static int[] anIntArray694 = new int[256];

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	public int anInt4286;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
	public int anInt4287;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	public int anInt4289;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
	public int anInt4290;

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
			anIntArray694[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public Class85() {
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!sd;)V")
	public Class85(@OriginalArg(0) Class85 arg0) {
		this.anInt4289 = arg0.anInt4289;
		this.anInt4290 = arg0.anInt4290;
		this.anInt4287 = arg0.anInt4287;
		this.anInt4286 = arg0.anInt4286;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class5_Sub38 extends Class5 {

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "[I")
	public static final int[] anIntArray419 = new int[256];

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
	public final int anInt5573;

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
	public final int anInt5575;

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
			anIntArray419[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(II)V")
	public Class5_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5573 = arg1;
		this.anInt5575 = arg0;
	}
}

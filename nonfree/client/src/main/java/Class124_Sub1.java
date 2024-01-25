import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class124_Sub1 extends Class124 {

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "[I")
	public static final int[] anIntArray304 = new int[256];

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "[I")
	public final int[] anIntArray305;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "[I")
	public final int[] anIntArray307;

	static {
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(15) int local15 = local12;
			for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
				if ((local15 & 0x1) == 1) {
					local15 = local15 >>> 1 ^ 0xEDB88320;
				} else {
					local15 >>>= 0x1;
				}
			}
			anIntArray304[local12] = local15;
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(II[I[I)V")
	public Class124_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray305 = arg3;
		this.anIntArray307 = arg2;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class156_Sub2 extends Class156 {

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "[I")
	public static final int[] anIntArray397 = new int[256];

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "[I")
	public final int[] anIntArray398;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "[I")
	public final int[] anIntArray399;

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(9) int local9 = local6;
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if ((local9 & 0x1) == 1) {
					local9 = local9 >>> 1 ^ 0xEDB88320;
				} else {
					local9 >>>= 0x1;
				}
			}
			anIntArray397[local6] = local9;
		}
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(II[I[I)V")
	public Class156_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray398 = arg3;
		this.anIntArray399 = arg2;
	}
}

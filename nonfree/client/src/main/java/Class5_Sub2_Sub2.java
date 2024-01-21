import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class5_Sub2_Sub2 extends Class5_Sub2 {

	@OriginalMember(owner = "client!af", name = "K", descriptor = "[I")
	public static final int[] anIntArray11 = new int[256];

	@OriginalMember(owner = "client!af", name = "M", descriptor = "[B")
	public final byte[] aByteArray1;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(11) int local11 = local8;
			for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
				if ((local11 & 0x1) == 1) {
					local11 = local11 >>> 1 ^ 0xEDB88320;
				} else {
					local11 >>>= 0x1;
				}
			}
			anIntArray11[local8] = local11;
		}
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "([B)V")
	public Class5_Sub2_Sub2(@OriginalArg(0) byte[] arg0) {
		this.aByteArray1 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class105_Sub2_Sub2 extends Class105_Sub2 {

	@OriginalMember(owner = "client!tj", name = "G", descriptor = "[J")
	public static final long[] aLongArray20 = new long[256];

	@OriginalMember(owner = "client!tj", name = "I", descriptor = "[B")
	private byte[] aByteArray109;

	static {
		for (@Pc(51) int local51 = 0; local51 < 256; local51++) {
			@Pc(55) long local55 = (long) local51;
			for (@Pc(57) int local57 = 0; local57 < 8; local57++) {
				if ((local55 & 0x1L) == 1L) {
					local55 = local55 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local55 >>>= 0x1;
				}
			}
			aLongArray20[local51] = local55;
		}
	}

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
	public Class105_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method8375(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(12) int local12 = arg0 * 2;
		@Pc(21) byte local21 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(24) int local24 = local12;
		@Pc(25) int local25 = local12 + 1;
		this.aByteArray109[local24] = local21;
		this.aByteArray109[local25] = local21;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)[B")
	public byte[] method8384() {
		this.aByteArray109 = new byte[524288];
		this.method8368();
		return this.aByteArray109;
	}
}

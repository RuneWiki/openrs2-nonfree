import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class6_Sub16 extends Class6 {

	@OriginalMember(owner = "client!hj", name = "q", descriptor = "[J")
	public static final long[] aLongArray4 = new long[256];

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "[B")
	public final byte[] aByteArray46;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(12) long local12 = (long) local8;
			for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
				if ((local12 & 0x1L) == 1L) {
					local12 = local12 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local12 >>>= 0x1;
				}
			}
			aLongArray4[local8] = local12;
		}
	}

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "([B)V")
	public Class6_Sub16(@OriginalArg(0) byte[] arg0) {
		this.aByteArray46 = arg0;
	}
}

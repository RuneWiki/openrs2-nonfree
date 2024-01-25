import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class3_Sub49 extends Class3 {

	@OriginalMember(owner = "client!vu", name = "l", descriptor = "[J")
	public static final long[] aLongArray17 = new long[256];

	@OriginalMember(owner = "client!vu", name = "n", descriptor = "J")
	public long aLong260;

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(10) long local10 = (long) local6;
			for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
				if ((local10 & 0x1L) == 1L) {
					local10 = local10 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local10 >>>= 0x1;
				}
			}
			aLongArray17[local6] = local10;
		}
	}

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V")
	private Class3_Sub49() {
	}

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(J)V")
	public Class3_Sub49(@OriginalArg(0) long arg0) {
		this.aLong260 = arg0;
	}
}

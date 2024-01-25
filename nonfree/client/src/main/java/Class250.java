import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class250 {

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "[J")
	public static final long[] aLongArray28 = new long[256];

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
	public int anInt6329;

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
	public int anInt6330;

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
	public int anInt6331;

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
	public int anInt6332;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
	public int anInt6333;

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
	public int anInt6334;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(8) long local8 = (long) local4;
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				if ((local8 & 0x1L) == 1L) {
					local8 = local8 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local8 >>>= 0x1;
				}
			}
			aLongArray28[local4] = local8;
		}
	}
}

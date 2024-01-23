import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class61 {

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "[J")
	public static long[] aLongArray39 = new long[256];

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "Lclient!h;")
	public Class22 aClass22_2;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
	public int anInt1538;

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
	public int anInt1539;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
	public int anInt1541;

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "Lclient!h;")
	public Class22 aClass22_3;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
	public int anInt1544;

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
	public int anInt1545;

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "J")
	public long aLong65 = 0L;

	static {
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(20) long local20 = (long) local12;
			for (@Pc(22) int local22 = 0; local22 < 8; local22++) {
				if ((local20 & 0x1L) == 1L) {
					local20 = local20 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local20 >>>= 0x1;
				}
			}
			aLongArray39[local12] = local20;
		}
	}
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class51 {

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "[J")
	public static final long[] aLongArray25 = new long[256];

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
	public int anInt1994;

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
	public int anInt1995;

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
	public int anInt1996;

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
	public int anInt1999;

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
	public int anInt2000;

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
	public int anInt2001;

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
	public int anInt2004;

	static {
		for (@Pc(27) int local27 = 0; local27 < 256; local27++) {
			@Pc(31) long local31 = (long) local27;
			for (@Pc(33) int local33 = 0; local33 < 8; local33++) {
				if ((local31 & 0x1L) == 1L) {
					local31 = local31 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local31 >>>= 0x1;
				}
			}
			aLongArray25[local27] = local31;
		}
	}
}

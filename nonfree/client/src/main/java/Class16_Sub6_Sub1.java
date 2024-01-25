import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public class Class16_Sub6_Sub1 extends Class16_Sub6 {

	@OriginalMember(owner = "client!l", name = "s", descriptor = "[J")
	public static final long[] aLongArray17 = new long[256];

	@OriginalMember(owner = "client!l", name = "t", descriptor = "I")
	public int anInt10125;

	@OriginalMember(owner = "client!l", name = "w", descriptor = "I")
	public int anInt10126;

	@OriginalMember(owner = "client!l", name = "x", descriptor = "Z")
	public boolean aBoolean730;

	@OriginalMember(owner = "client!l", name = "y", descriptor = "I")
	public int anInt10127;

	@OriginalMember(owner = "client!l", name = "A", descriptor = "I")
	public int anInt10129;

	@OriginalMember(owner = "client!l", name = "B", descriptor = "I")
	public int anInt10130;

	@OriginalMember(owner = "client!l", name = "C", descriptor = "I")
	public int anInt10131;

	@OriginalMember(owner = "client!l", name = "v", descriptor = "B")
	public byte aByte133 = 5;

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
			aLongArray17[local4] = local8;
		}
	}

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	protected Class16_Sub6_Sub1() {
	}
}

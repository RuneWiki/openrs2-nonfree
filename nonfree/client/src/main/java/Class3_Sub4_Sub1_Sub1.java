import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class3_Sub4_Sub1_Sub1 extends Class3_Sub4_Sub1 {

	@OriginalMember(owner = "client!jb", name = "V", descriptor = "[J")
	public static long[] aLongArray6 = new long[256];

	@OriginalMember(owner = "client!jb", name = "N", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!jb", name = "P", descriptor = "Lclient!th;")
	public Class171 aClass171_2;

	@OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
	public int anInt2446;

	static {
		for (@Pc(9) int local9 = 0; local9 < 256; local9++) {
			@Pc(17) long local17 = (long) local9;
			for (@Pc(19) int local19 = 0; local19 < 8; local19++) {
				if ((local17 & 0x1L) == 1L) {
					local17 = local17 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local17 >>>= 0x1;
				}
			}
			aLongArray6[local9] = local17;
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)[B")
	@Override
	public byte[] method3528() {
		if (this.aBoolean297) {
			throw new RuntimeException();
		}
		return this.aByteArray35;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)I")
	@Override
	public int method3534() {
		return this.aBoolean297 ? 0 : 100;
	}
}

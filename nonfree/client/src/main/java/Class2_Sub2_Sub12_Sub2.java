import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class2_Sub2_Sub12_Sub2 extends Class2_Sub2_Sub12 {

	@OriginalMember(owner = "client!rh", name = "G", descriptor = "[J")
	public static final long[] aLongArray6 = new long[256];

	@OriginalMember(owner = "client!rh", name = "F", descriptor = "Lclient!oc;")
	public Class175 aClass175_4;

	@OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
	public int anInt5981;

	@OriginalMember(owner = "client!rh", name = "K", descriptor = "[B")
	public byte[] aByteArray165;

	static {
		for (@Pc(9) int local9 = 0; local9 < 256; local9++) {
			@Pc(13) long local13 = (long) local9;
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if ((local13 & 0x1L) == 1L) {
					local13 = local13 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local13 >>>= 0x1;
				}
			}
			aLongArray6[local9] = local13;
		}
	}

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "(B)I")
	@Override
	public int method4777() {
		return super.aBoolean526 ? 0 : 100;
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(B)[B")
	@Override
	public byte[] method4775() {
		if (super.aBoolean526) {
			throw new RuntimeException();
		}
		return this.aByteArray165;
	}
}

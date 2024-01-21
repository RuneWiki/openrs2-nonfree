import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class1_Sub2_Sub12 extends Class1_Sub2 {

	@OriginalMember(owner = "client!me", name = "Y", descriptor = "[J")
	public static long[] aLongArray5 = new long[256];

	@OriginalMember(owner = "client!me", name = "L", descriptor = "I")
	public int anInt2971;

	@OriginalMember(owner = "client!me", name = "M", descriptor = "B")
	public byte aByte6;

	@OriginalMember(owner = "client!me", name = "Q", descriptor = "Lclient!o;")
	public Class4_Sub1 aClass4_Sub1_39;

	static {
		for (@Pc(34) int local34 = 0; local34 < 256; local34++) {
			@Pc(38) long local38 = (long) local34;
			for (@Pc(40) int local40 = 0; local40 < 8; local40++) {
				if ((local38 & 0x1L) == 1L) {
					local38 = local38 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local38 >>>= 0x1;
				}
			}
			aLongArray5[local34] = local38;
		}
	}
}

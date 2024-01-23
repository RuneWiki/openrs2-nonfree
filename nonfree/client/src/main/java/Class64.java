import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class64 {

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "[J")
	public static long[] aLongArray8 = new long[256];

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "[I")
	public int[] anIntArray314;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "[Lclient!i;")
	public Class41[] aClass41Array43;

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "Lclient!wh;")
	public Class2_Sub2_Sub28 aClass2_Sub2_Sub28_1;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
	public int anInt2958 = -1;

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
			aLongArray8[local9] = local13;
		}
	}
}

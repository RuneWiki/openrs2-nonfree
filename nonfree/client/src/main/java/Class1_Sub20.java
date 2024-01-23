import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class1_Sub20 extends Class1 {

	@OriginalMember(owner = "client!lh", name = "x", descriptor = "[J")
	public static long[] aLongArray9 = new long[256];

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "[Lclient!vd;")
	public Class185[] aClass185Array1;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "[I")
	public int[] anIntArray261;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
	public int anInt3137;

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "[I")
	public int[] anIntArray262;

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "[Lclient!vd;")
	public Class185[] aClass185Array2;

	@OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
	public int anInt3142;

	@OriginalMember(owner = "client!lh", name = "y", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!lh", name = "z", descriptor = "[I")
	public int[] anIntArray264;

	static {
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(13) long local13 = (long) local7;
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if ((local13 & 0x1L) == 1L) {
					local13 = local13 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local13 >>>= 0x1;
				}
			}
			aLongArray9[local7] = local13;
		}
	}
}

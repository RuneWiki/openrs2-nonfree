import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class4_Sub1_Sub15_Sub1 extends Class4_Sub1_Sub15 {

	@OriginalMember(owner = "client!va", name = "Y", descriptor = "[J")
	public static long[] aLongArray11 = new long[256];

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(14) long local14 = (long) local6;
			for (@Pc(16) int local16 = 0; local16 < 8; local16++) {
				if ((local14 & 0x1L) == 1L) {
					local14 = local14 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local14 >>>= 0x1;
				}
			}
			aLongArray11[local6] = local14;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4542(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = this.aClass113_41.method2911(arg0);
		if (this.aClass113_41.aBoolean232 && this.method4403()) {
			@Pc(32) int[] local32 = local19[1];
			@Pc(36) int[] local36 = local19[0];
			@Pc(40) int[] local40 = local19[2];
			@Pc(48) int local48 = this.anInt5524 * (arg0 % this.anInt5524);
			for (@Pc(50) int local50 = 0; local50 < Static68.anInt1753; local50++) {
				@Pc(63) int local63 = this.anIntArray437[local48 + local50 % this.anInt5528];
				local40[local50] = (local63 & 0xFF) << 4;
				local32[local50] = local63 >> 4 & 0xFF0;
				local36[local50] = local63 >> 12 & 0xFF0;
			}
		}
		return local19;
	}
}

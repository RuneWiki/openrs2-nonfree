import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class3_Sub1_Sub37 extends Class3_Sub1 {

	@OriginalMember(owner = "client!vh", name = "db", descriptor = "[J")
	public static long[] aLongArray10 = new long[256];

	@OriginalMember(owner = "client!vh", name = "fb", descriptor = "I")
	private int anInt4144;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(12) long local12 = (long) local8;
			for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
				if ((local12 & 0x1L) == 1L) {
					local12 = local12 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local12 >>>= 0x1;
				}
			}
			aLongArray10[local8] = local12;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(21) int[] local21 = this.method3120(0, arg0 - 1 & Static106.anInt2755);
			@Pc(27) int[] local27 = this.method3120(0, arg0);
			@Pc(37) int[] local37 = this.method3120(0, arg0 + 1 & Static106.anInt2755);
			for (@Pc(39) int local39 = 0; local39 < Static129.anInt3285; local39++) {
				@Pc(53) int local53 = (local37[local39] - local21[local39]) * this.anInt4144;
				@Pc(73) int local73 = this.anInt4144 * (local27[Static105.anInt2733 & local39 + 1] - local27[local39 - 1 & Static105.anInt2733]);
				@Pc(77) int local77 = local73 >> 12;
				@Pc(83) int local83 = local77 * local77 >> 12;
				@Pc(87) int local87 = local53 >> 12;
				@Pc(93) int local93 = local87 * local87 >> 12;
				@Pc(107) int local107 = (int) (Math.sqrt((double) ((local83 + local93 + 4096) / 4096)) * 4096.0D);
				@Pc(118) int local118 = local107 == 0 ? 0 : 16777216 / local107;
				local7[local39] = 4096 - local118;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt4144 = arg1.method1510();
		}
	}
}

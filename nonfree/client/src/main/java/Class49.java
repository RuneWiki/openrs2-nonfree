import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class49 {

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
	private final int anInt2135;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
	private final int anInt2136;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(II)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = Static90.method1575(arg1, arg0);
		@Pc(12) int local12 = arg0 / local8;
		this.anInt2135 = local12;
		@Pc(19) int local19 = arg1 / local8;
		this.anInt2136 = local19;
		if (local19 != local12) {
			this.anIntArrayArray18 = new int[local12][14];
			for (@Pc(33) int local33 = 0; local33 < local12; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray18[local33];
				@Pc(48) double local48 = (double) local33 / (double) local12 + 6.0D;
				@Pc(54) double local54 = (double) local19 / (double) local12;
				@Pc(62) int local62 = (int) Math.floor(local48 + 1.0D - 7.0D);
				@Pc(68) int local68 = (int) Math.ceil(local48 + 7.0D);
				if (local62 < 0) {
					local62 = 0;
				}
				if (local68 > 14) {
					local68 = 14;
				}
				while (local68 > local62) {
					@Pc(84) double local84 = local54;
					@Pc(92) double local92 = ((double) local62 - local48) * 3.141592653589793D;
					if (local92 < -1.0E-4D || local92 > 1.0E-4D) {
						local84 = local54 * (Math.sin(local92) / local92);
					}
					local84 *= Math.cos(((double) local62 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local62] = (int) Math.floor(local84 * 65536.0D + 0.5D);
					local62++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)I")
	public int method1488(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray18 != null) {
			arg0 = this.anInt2136 * arg0 / this.anInt2135 + 7;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)I")
	public int method1490(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray18 != null) {
			arg0 = this.anInt2136 * arg0 / this.anInt2135;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([BZ)[B")
	public byte[] method1493(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray18 != null) {
			@Pc(19) int local19 = arg0.length * this.anInt2136 / this.anInt2135 + 14;
			@Pc(21) int local21 = 0;
			@Pc(24) int[] local24 = new int[local19];
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray18[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local24[local41 + local21] += local39[local41] * local34;
				}
				local26 += this.anInt2136;
				@Pc(70) int local70 = local26 / this.anInt2135;
				local26 -= local70 * this.anInt2135;
				local21 += local70;
			}
			arg0 = new byte[local19];
			for (@Pc(91) int local91 = 0; local91 < local19; local91++) {
				@Pc(101) int local101 = local24[local91] + 32768 >> 16;
				if (local101 < -128) {
					arg0[local91] = -128;
				} else if (local101 > 127) {
					arg0[local91] = 127;
				} else {
					arg0[local91] = (byte) local101;
				}
			}
		}
		return arg0;
	}
}

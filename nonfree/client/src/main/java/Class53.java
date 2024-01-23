import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class53 {

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
	private int anInt2285;

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
	private int anInt2287;

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(II)V")
	public Class53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static194.method3015(arg0, arg1);
			@Pc(20) int local20 = arg1 / local16;
			this.anInt2285 = local20;
			@Pc(27) int local27 = arg0 / local16;
			this.anInt2287 = local27;
			this.anIntArrayArray39 = new int[local27][14];
			for (@Pc(37) int local37 = 0; local37 < local27; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray39[local37];
				@Pc(52) double local52 = (double) local37 / (double) local27 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				@Pc(76) double local76 = (double) local20 / (double) local27;
				if (local70 > 14) {
					local70 = 14;
				}
				while (local70 > local60) {
					@Pc(85) double local85 = local76;
					@Pc(92) double local92 = ((double) local60 - local52) * 3.141592653589793D;
					if (local92 < -1.0E-4D || local92 > 1.0E-4D) {
						local85 = local76 * (Math.sin(local92) / local92);
					}
					local85 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local85 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
	public int method1725(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray39 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2285 / (long) this.anInt2287);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)I")
	public int method1726(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray39 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2285 / (long) this.anInt2287) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([BB)[B")
	public byte[] method1727(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray39 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt2285 / (long) this.anInt2287) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(35) int[] local35 = this.anIntArrayArray39[local24];
				@Pc(39) byte local39 = arg0[local28];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local26 + local41] += local39 * local35[local41];
				}
				local24 += this.anInt2285;
				@Pc(70) int local70 = local24 / this.anInt2287;
				local26 += local70;
				local24 -= this.anInt2287 * local70;
			}
			arg0 = new byte[local19];
			for (@Pc(91) int local91 = 0; local91 < local19; local91++) {
				@Pc(101) int local101 = local22[local91] + 32768 >> 16;
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

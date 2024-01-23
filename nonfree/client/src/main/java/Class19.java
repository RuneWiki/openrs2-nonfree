import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class19 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
	private int anInt531;

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
	private int anInt537;

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(II)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(13) int local13 = Static117.method3402(arg0, arg1);
			@Pc(17) int local17 = arg1 / local13;
			this.anInt531 = local17;
			@Pc(24) int local24 = arg0 / local13;
			this.anInt537 = local24;
			this.anIntArrayArray9 = new int[local24][14];
			for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
				@Pc(45) double local45 = (double) local34 / (double) local24 + 6.0D;
				@Pc(50) int[] local50 = this.anIntArrayArray9[local34];
				@Pc(56) double local56 = (double) local17 / (double) local24;
				@Pc(64) int local64 = (int) Math.floor(local45 + 1.0D - 7.0D);
				@Pc(70) int local70 = (int) Math.ceil(local45 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				if (local64 < 0) {
					local64 = 0;
				}
				while (local64 < local70) {
					@Pc(92) double local92 = ((double) local64 - local45) * 3.141592653589793D;
					@Pc(94) double local94 = local56;
					if (-1.0E-4D > local92 || local92 > 1.0E-4D) {
						local94 = local56 * (Math.sin(local92) / local92);
					}
					local94 *= Math.cos(((double) local64 - local45) * 0.2243994752564138D) * 0.46D + 0.54D;
					local50[local64] = (int) Math.floor(local94 * 65536.0D + 0.5D);
					local64++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)I")
	public int method427(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray9 != null) {
			arg0 = (int) ((long) this.anInt531 * (long) arg0 / (long) this.anInt537);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[B)[B")
	public byte[] method428(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray9 != null) {
			@Pc(24) int local24 = (int) ((long) arg0.length * (long) this.anInt531 / (long) this.anInt537) + 14;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(29) int local29 = 0;
			@Pc(31) int local31 = 0;
			@Pc(33) int local33;
			for (local33 = 0; local33 < arg0.length; local33++) {
				@Pc(46) int[] local46 = this.anIntArrayArray9[local31];
				@Pc(50) byte local50 = arg0[local33];
				@Pc(52) int local52;
				for (local52 = 0; local52 < 14; local52++) {
					local27[local52 + local29] += local46[local52] * local50;
				}
				local31 += this.anInt531;
				local52 = local31 / this.anInt537;
				local29 += local52;
				local31 -= local52 * this.anInt537;
			}
			arg0 = new byte[local24];
			for (local33 = 0; local33 < local24; local33++) {
				@Pc(111) int local111 = local27[local33] + 32768 >> 16;
				if (local111 < -128) {
					arg0[local33] = -128;
				} else if (local111 > 127) {
					arg0[local33] = 127;
				} else {
					arg0[local33] = (byte) local111;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)I")
	public int method429(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray9 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt531 / (long) this.anInt537) + 6;
		}
		return arg0;
	}
}

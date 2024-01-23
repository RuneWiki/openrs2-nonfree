import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class143 {

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
	private int anInt4391;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
	private int anInt4394;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(II)V")
	public Class143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(13) int local13 = Static171.method2929(arg1, arg0);
			@Pc(17) int local17 = arg1 / local13;
			@Pc(21) int local21 = arg0 / local13;
			this.anInt4391 = local21;
			this.anInt4394 = local17;
			this.anIntArrayArray26 = new int[local21][14];
			for (@Pc(34) int local34 = 0; local34 < local21; local34++) {
				@Pc(42) int[] local42 = this.anIntArrayArray26[local34];
				@Pc(50) double local50 = (double) local34 / (double) local21 + 6.0D;
				@Pc(58) int local58 = (int) Math.floor(local50 + 1.0D - 7.0D);
				@Pc(64) int local64 = (int) Math.ceil(local50 + 7.0D);
				if (local64 > 14) {
					local64 = 14;
				}
				if (local58 < 0) {
					local58 = 0;
				}
				@Pc(86) double local86 = (double) local17 / (double) local21;
				while (local58 < local64) {
					@Pc(96) double local96 = ((double) local58 - local50) * 3.141592653589793D;
					@Pc(98) double local98 = local86;
					if (-1.0E-4D > local96 || local96 > 1.0E-4D) {
						local98 = local86 * (Math.sin(local96) / local96);
					}
					local98 *= Math.cos(((double) local58 - local50) * 0.2243994752564138D) * 0.46D + 0.54D;
					local42[local58] = (int) Math.floor(local98 * 65536.0D + 0.5D);
					local58++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([BI)[B")
	public byte[] method3480(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray26 != null) {
			@Pc(20) int local20 = (int) ((long) this.anInt4394 * (long) arg0.length / (long) this.anInt4391) + 14;
			@Pc(23) int[] local23 = new int[local20];
			@Pc(25) int local25 = 0;
			@Pc(27) int local27 = 0;
			@Pc(29) int local29;
			for (local29 = 0; local29 < arg0.length; local29++) {
				@Pc(37) byte local37 = arg0[local29];
				@Pc(42) int[] local42 = this.anIntArrayArray26[local27];
				@Pc(44) int local44;
				for (local44 = 0; local44 < 14; local44++) {
					local23[local44 + local25] += local37 * local42[local44];
				}
				local27 += this.anInt4394;
				local44 = local27 / this.anInt4391;
				local27 -= local44 * this.anInt4391;
				local25 += local44;
			}
			arg0 = new byte[local20];
			for (local29 = 0; local29 < local20; local29++) {
				@Pc(103) int local103 = local23[local29] + 32768 >> 16;
				if (local103 < -128) {
					arg0[local29] = -128;
				} else if (local103 <= 127) {
					arg0[local29] = (byte) local103;
				} else {
					arg0[local29] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)I")
	public int method3481(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray26 != null) {
			arg0 = (int) ((long) this.anInt4394 * (long) arg0 / (long) this.anInt4391) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)I")
	public int method3484(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray26 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt4394 / (long) this.anInt4391);
		}
		return arg0;
	}
}

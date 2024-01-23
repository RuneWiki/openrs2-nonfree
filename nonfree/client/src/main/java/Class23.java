import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class23 {

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
	private int anInt647;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
	private int anInt654;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(II)V")
	public Class23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(13) int local13 = Static249.method3919(arg1, arg0);
			@Pc(17) int local17 = arg1 / local13;
			this.anInt647 = local17;
			@Pc(24) int local24 = arg0 / local13;
			this.anIntArrayArray2 = new int[local24][14];
			this.anInt654 = local24;
			for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
				@Pc(43) double local43 = (double) local17 / (double) local24;
				@Pc(48) int[] local48 = this.anIntArrayArray2[local34];
				@Pc(56) double local56 = (double) local34 / (double) local24 + 6.0D;
				@Pc(64) int local64 = (int) Math.floor(local56 + 1.0D - 7.0D);
				if (local64 < 0) {
					local64 = 0;
				}
				@Pc(78) int local78 = (int) Math.ceil(local56 + 7.0D);
				if (local78 > 14) {
					local78 = 14;
				}
				while (local78 > local64) {
					@Pc(98) double local98 = ((double) local64 - local56) * 3.141592653589793D;
					@Pc(100) double local100 = local43;
					if (local98 < -1.0E-4D || local98 > 1.0E-4D) {
						local100 = local43 * (Math.sin(local98) / local98);
					}
					local100 *= Math.cos(((double) local64 - local56) * 0.2243994752564138D) * 0.46D + 0.54D;
					local48[local64] = (int) Math.floor(local100 * 65536.0D + 0.5D);
					local64++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)I")
	public int method571(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray2 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt647 / (long) this.anInt654);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZ)I")
	public int method573(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray2 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt647 / (long) this.anInt654) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I[B)[B")
	public byte[] method578(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray2 != null) {
			@Pc(25) int local25 = (int) ((long) this.anInt647 * (long) arg0.length / (long) this.anInt654) + 14;
			@Pc(28) int[] local28 = new int[local25];
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			@Pc(34) int local34;
			for (local34 = 0; local34 < arg0.length; local34++) {
				@Pc(46) byte local46 = arg0[local34];
				@Pc(51) int[] local51 = this.anIntArrayArray2[local32];
				@Pc(53) int local53;
				for (local53 = 0; local53 < 14; local53++) {
					local28[local30 + local53] += local51[local53] * local46;
				}
				local32 += this.anInt647;
				local53 = local32 / this.anInt654;
				local32 -= this.anInt654 * local53;
				local30 += local53;
			}
			arg0 = new byte[local25];
			for (local34 = 0; local34 < local25; local34++) {
				@Pc(115) int local115 = local28[local34] + 32768 >> 16;
				if (local115 < -128) {
					arg0[local34] = -128;
				} else if (local115 > 127) {
					arg0[local34] = 127;
				} else {
					arg0[local34] = (byte) local115;
				}
			}
		}
		return arg0;
	}
}

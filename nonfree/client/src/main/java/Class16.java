import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class16 {

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
	private int anInt609;

	@OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
	private int anInt613;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(II)V")
	public Class16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(13) int local13 = Static38.method720(arg1, arg0);
			@Pc(17) int local17 = arg0 / local13;
			this.anIntArrayArray9 = new int[local17][14];
			this.anInt609 = local17;
			@Pc(29) int local29 = arg1 / local13;
			this.anInt613 = local29;
			for (@Pc(34) int local34 = 0; local34 < local17; local34++) {
				@Pc(46) int[] local46 = this.anIntArrayArray9[local34];
				@Pc(54) double local54 = (double) local34 / (double) local17 + 6.0D;
				@Pc(62) int local62 = (int) Math.floor(local54 + 1.0D - 7.0D);
				if (local62 < 0) {
					local62 = 0;
				}
				@Pc(73) int local73 = (int) Math.ceil(local54 + 7.0D);
				if (local73 > 14) {
					local73 = 14;
				}
				@Pc(85) double local85 = (double) local29 / (double) local17;
				while (local73 > local62) {
					@Pc(100) double local100 = ((double) local62 - local54) * 3.141592653589793D;
					@Pc(102) double local102 = local85;
					if (-1.0E-4D > local100 || local100 > 1.0E-4D) {
						local102 = local85 * (Math.sin(local100) / local100);
					}
					local102 *= Math.cos(((double) local62 - local54) * 0.2243994752564138D) * 0.46D + 0.54D;
					local46[local62] = (int) Math.floor(local102 * 65536.0D + 0.5D);
					local62++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "([BI)[B")
	public byte[] method587(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray9 != null) {
			@Pc(20) int local20 = (int) ((long) this.anInt613 * (long) arg0.length / (long) this.anInt609) + 14;
			@Pc(23) int[] local23 = new int[local20];
			@Pc(25) int local25 = 0;
			@Pc(27) int local27 = 0;
			@Pc(29) int local29;
			for (local29 = 0; local29 < arg0.length; local29++) {
				@Pc(37) byte local37 = arg0[local29];
				@Pc(42) int[] local42 = this.anIntArrayArray9[local27];
				@Pc(44) int local44;
				for (local44 = 0; local44 < 14; local44++) {
					local23[local44 + local25] += local37 * local42[local44];
				}
				local27 += this.anInt613;
				local44 = local27 / this.anInt609;
				local27 -= this.anInt609 * local44;
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

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)I")
	public int method589(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray9 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt613 / (long) this.anInt609);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)I")
	public int method591(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray9 != null) {
			arg0 = (int) ((long) this.anInt613 * (long) arg0 / (long) this.anInt609) + 6;
		}
		return arg0;
	}
}

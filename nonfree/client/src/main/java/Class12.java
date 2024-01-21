import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class12 {

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
	private final int anInt467;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
	private final int anInt469;

	@OriginalMember(owner = "client!cd", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(II)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = Static24.method440(arg1, arg0);
		@Pc(12) int local12 = arg1 / local8;
		this.anInt467 = local12;
		@Pc(19) int local19 = arg0 / local8;
		this.anInt469 = local19;
		if (local12 != local19) {
			this.anIntArrayArray3 = new int[local19][14];
			for (@Pc(33) int local33 = 0; local33 < local19; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray3[local33];
				@Pc(48) double local48 = (double) local33 / (double) local19 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local48 + 7.0D);
				@Pc(75) double local75 = (double) local12 / (double) local19;
				if (local69 > 14) {
					local69 = 14;
				}
				while (local56 < local69) {
					@Pc(91) double local91 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(93) double local93 = local75;
					if (local91 < -1.0E-4D || local91 > 1.0E-4D) {
						local93 = local75 * (Math.sin(local91) / local91);
					}
					local93 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local93 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B[B)[B")
	public byte[] method306(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray3 != null) {
			@Pc(20) int local20 = arg0.length * this.anInt467 / this.anInt469 + 14;
			@Pc(23) int[] local23 = new int[local20];
			@Pc(25) int local25 = 0;
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < arg0.length; local29++) {
				@Pc(36) int[] local36 = this.anIntArrayArray3[local27];
				@Pc(40) byte local40 = arg0[local29];
				for (@Pc(42) int local42 = 0; local42 < 14; local42++) {
					local23[local25 + local42] += local40 * local36[local42];
				}
				local27 += this.anInt467;
				@Pc(72) int local72 = local27 / this.anInt469;
				local25 += local72;
				local27 -= this.anInt469 * local72;
			}
			arg0 = new byte[local20];
			for (@Pc(93) int local93 = 0; local93 < local20; local93++) {
				@Pc(103) int local103 = local23[local93] + 32768 >> 16;
				if (local103 < -128) {
					arg0[local93] = -128;
				} else if (local103 <= 127) {
					arg0[local93] = (byte) local103;
				} else {
					arg0[local93] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)I")
	public int method307(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray3 != null) {
			arg0 = this.anInt467 * arg0 / this.anInt469;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)I")
	public int method312(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray3 != null) {
			arg0 = arg0 * this.anInt467 / this.anInt469 + 7;
		}
		return arg0;
	}
}

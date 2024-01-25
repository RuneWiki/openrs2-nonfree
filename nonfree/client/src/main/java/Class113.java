import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class113 {

	@OriginalMember(owner = "client!j", name = "g", descriptor = "I")
	private int anInt3236;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!j", name = "f", descriptor = "I")
	private int anInt3235;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(II)V")
	public Class113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static303.method6086(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anInt3236 = local16;
			this.anIntArrayArray17 = new int[local16][14];
			this.anInt3235 = local20;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray17[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local48 + 7.0D);
				if (local69 > 14) {
					local69 = 14;
				}
				@Pc(80) double local80 = (double) local20 / (double) local16;
				while (local69 > local56) {
					@Pc(89) double local89 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(91) double local91 = local80;
					if (local89 < -1.0E-4D || local89 > 1.0E-4D) {
						local91 = local80 * (Math.sin(local89) / local89);
					}
					local91 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local91 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)I")
	public int method2767(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray17 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt3235 / (long) this.anInt3236);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BI)I")
	public int method2768(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray17 != null) {
			arg0 = (int) ((long) this.anInt3235 * (long) arg0 / (long) this.anInt3236) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I[B)[B")
	public byte[] method2769(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray17 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt3235 / (long) this.anInt3236) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray17[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local41 + local24] += local34 * local39[local41];
				}
				local26 += this.anInt3235;
				@Pc(72) int local72 = local26 / this.anInt3236;
				local24 += local72;
				local26 -= local72 * this.anInt3236;
			}
			arg0 = new byte[local19];
			for (@Pc(93) int local93 = 0; local93 < local19; local93++) {
				@Pc(103) int local103 = local22[local93] + 32768 >> 16;
				if (local103 < -128) {
					arg0[local93] = -128;
				} else if (local103 > 127) {
					arg0[local93] = 127;
				} else {
					arg0[local93] = (byte) local103;
				}
			}
		}
		return arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class61 {

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
	private int anInt3020;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
	private int anInt3021;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(II)V")
	public Class61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static14.method396(arg1, arg0);
			@Pc(20) int local20 = arg0 / local16;
			this.anIntArrayArray29 = new int[local20][14];
			@Pc(29) int local29 = arg1 / local16;
			this.anInt3020 = local20;
			this.anInt3021 = local29;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray29[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(58) double local58 = (double) local29 / (double) local20;
				@Pc(66) int local66 = (int) Math.floor(local52 + 1.0D - 7.0D);
				@Pc(72) int local72 = (int) Math.ceil(local52 + 7.0D);
				if (local66 < 0) {
					local66 = 0;
				}
				if (local72 > 14) {
					local72 = 14;
				}
				while (local72 > local66) {
					@Pc(90) double local90 = ((double) local66 - local52) * 3.141592653589793D;
					@Pc(92) double local92 = local58;
					if (local90 < -1.0E-4D || local90 > 1.0E-4D) {
						local92 = local58 * (Math.sin(local90) / local90);
					}
					local92 *= Math.cos(((double) local66 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local66] = (int) Math.floor(local92 * 65536.0D + 0.5D);
					local66++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)I")
	public int method2072(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray29 != null) {
			arg0 = (int) ((long) this.anInt3021 * (long) arg0 / (long) this.anInt3020);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[B)[B")
	public byte[] method2075(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray29 != null) {
			@Pc(19) int local19 = (int) ((long) this.anInt3021 * (long) arg0.length / (long) this.anInt3020) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray29[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local41 + local24] += local34 * local39[local41];
				}
				local26 += this.anInt3021;
				@Pc(72) int local72 = local26 / this.anInt3020;
				local24 += local72;
				local26 -= this.anInt3020 * local72;
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

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)I")
	public int method2076(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray29 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt3021 / (long) this.anInt3020) + 6;
		}
		return arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class158 {

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
	private int anInt3766;

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
	private int anInt3765;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(II)V")
	public Class158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(10) int local10 = Static372.method5466(arg1, arg0);
			@Pc(14) int local14 = arg1 / local10;
			@Pc(18) int local18 = arg0 / local10;
			this.anInt3766 = local18;
			this.anInt3765 = local14;
			this.anIntArrayArray33 = new int[local18][14];
			for (@Pc(31) int local31 = 0; local31 < local18; local31++) {
				@Pc(37) int[] local37 = this.anIntArrayArray33[local31];
				@Pc(45) double local45 = (double) local31 / (double) local18 + 6.0D;
				@Pc(53) int local53 = (int) Math.floor(local45 + 1.0D - 7.0D);
				if (local53 < 0) {
					local53 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local45 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				@Pc(77) double local77 = (double) local14 / (double) local18;
				while (local53 < local66) {
					@Pc(85) double local85 = ((double) local53 - local45) * 3.141592653589793D;
					@Pc(87) double local87 = local77;
					if (local85 < -1.0E-4D || local85 > 1.0E-4D) {
						local87 = local77 * (Math.sin(local85) / local85);
					}
					local87 *= Math.cos(((double) local53 - local45) * 0.2243994752564138D) * 0.46D + 0.54D;
					local37[local53] = (int) Math.floor(local87 * 65536.0D + 0.5D);
					local53++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BI)I")
	public int method3328(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray33 != null) {
			arg0 = (int) ((long) this.anInt3765 * (long) arg0 / (long) this.anInt3766);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "([BI)[B")
	public byte[] method3329(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray33 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt3765 / (long) this.anInt3766) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray33[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local41 + local24] += local39[local41] * local34;
				}
				local26 += this.anInt3765;
				@Pc(70) int local70 = local26 / this.anInt3766;
				local26 -= local70 * this.anInt3766;
				local24 += local70;
			}
			arg0 = new byte[local19];
			for (@Pc(95) int local95 = 0; local95 < local19; local95++) {
				@Pc(105) int local105 = local22[local95] + 32768 >> 16;
				if (local105 < -128) {
					arg0[local95] = -128;
				} else if (local105 > 127) {
					arg0[local95] = 127;
				} else {
					arg0[local95] = (byte) local105;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "([SB)[S")
	public short[] method3331(@OriginalArg(0) short[] arg0) {
		if (this.anIntArrayArray33 != null) {
			@Pc(23) int local23 = (int) ((long) this.anInt3765 * (long) arg0.length / (long) this.anInt3766) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) short local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray33[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local28 + local45] += local38 * local43[local45] >> 2;
				}
				local30 += this.anInt3765;
				@Pc(79) int local79 = local30 / this.anInt3766;
				local28 += local79;
				local30 -= local79 * this.anInt3766;
			}
			arg0 = new short[local23];
			for (@Pc(100) int local100 = 0; local100 < local23; local100++) {
				@Pc(110) int local110 = local26[local100] + 8192 >> 14;
				if (local110 < -32768) {
					arg0[local100] = -32768;
				} else if (local110 > 32767) {
					arg0[local100] = 32767;
				} else {
					arg0[local100] = (short) local110;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)I")
	public int method3332(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray33 != null) {
			arg0 = (int) ((long) this.anInt3765 * (long) arg0 / (long) this.anInt3766) + 6;
		}
		return arg0;
	}
}

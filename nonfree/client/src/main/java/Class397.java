import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class397 {

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
	private int anInt10436;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
	private int anInt10440;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(II)V")
	public Class397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static182.method3444(arg1, arg0);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anIntArrayArray62 = new int[local20][14];
			this.anInt10436 = local20;
			this.anInt10440 = local24;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray62[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(73) int local73 = (int) Math.ceil(local52 + 7.0D);
				if (local73 > 14) {
					local73 = 14;
				}
				@Pc(84) double local84 = (double) local24 / (double) local20;
				while (local60 < local73) {
					@Pc(94) double local94 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(96) double local96 = local84;
					if (local94 < -1.0E-4D || local94 > 1.0E-4D) {
						local96 = local84 * (Math.sin(local94) / local94);
					}
					local96 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local96 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BI)I")
	public int method8967(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray62 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt10440 / (long) this.anInt10436) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I[S)[S")
	public short[] method8968(@OriginalArg(1) short[] arg0) {
		if (this.anIntArrayArray62 != null) {
			@Pc(32) int local32 = (int) ((long) this.anInt10440 * (long) arg0.length / (long) this.anInt10436) + 14;
			@Pc(35) int[] local35 = new int[local32];
			@Pc(37) int local37 = 0;
			@Pc(39) int local39 = 0;
			for (@Pc(41) int local41 = 0; local41 < arg0.length; local41++) {
				@Pc(47) short local47 = arg0[local41];
				@Pc(52) int[] local52 = this.anIntArrayArray62[local39];
				for (@Pc(54) int local54 = 0; local54 < 14; local54++) {
					local35[local54 + local37] += local47 * local52[local54] >> 2;
				}
				local39 += this.anInt10440;
				@Pc(89) int local89 = local39 / this.anInt10436;
				local37 += local89;
				local39 -= this.anInt10436 * local89;
			}
			arg0 = new short[local32];
			for (@Pc(112) int local112 = 0; local112 < local32; local112++) {
				@Pc(124) int local124 = local35[local112] + 8192 >> 14;
				if (local124 < -32768) {
					arg0[local112] = -32768;
				} else if (local124 <= 32767) {
					arg0[local112] = (short) local124;
				} else {
					arg0[local112] = 32767;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)I")
	public int method8969(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray62 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt10440 / (long) this.anInt10436);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I[B)[B")
	public byte[] method8970(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray62 != null) {
			@Pc(19) int local19 = (int) ((long) this.anInt10440 * (long) arg0.length / (long) this.anInt10436) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray62[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local24 + local41] += local39[local41] * local34;
				}
				local26 += this.anInt10440;
				@Pc(73) int local73 = local26 / this.anInt10436;
				local24 += local73;
				local26 -= this.anInt10436 * local73;
			}
			arg0 = new byte[local19];
			for (@Pc(100) int local100 = 0; local100 < local19; local100++) {
				@Pc(112) int local112 = local22[local100] + 32768 >> 16;
				if (local112 < -128) {
					arg0[local100] = -128;
				} else if (local112 > 127) {
					arg0[local100] = 127;
				} else {
					arg0[local100] = (byte) local112;
				}
			}
		}
		return arg0;
	}
}

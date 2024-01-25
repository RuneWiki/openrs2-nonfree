import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class272 {

	@OriginalMember(owner = "client!om", name = "h", descriptor = "I")
	private int anInt8120;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "I")
	private int anInt8125;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(II)V")
	public Class272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static405.method6057(arg0, arg1);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anInt8120 = local20;
			this.anIntArrayArray42 = new int[local24][14];
			this.anInt8125 = local24;
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray42[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(73) int local73 = (int) Math.ceil(local52 + 7.0D);
				if (local73 > 14) {
					local73 = 14;
				}
				@Pc(84) double local84 = (double) local20 / (double) local24;
				while (local73 > local60) {
					@Pc(93) double local93 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(95) double local95 = local84;
					if (local93 < -1.0E-4D || local93 > 1.0E-4D) {
						local95 = local84 * (Math.sin(local93) / local93);
					}
					local95 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local95 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZ)I")
	public int method6847(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray42 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt8120 / (long) this.anInt8125) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "([BB)[B")
	public byte[] method6848(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray42 != null) {
			@Pc(33) int local33 = (int) ((long) arg0.length * (long) this.anInt8120 / (long) this.anInt8125) + 14;
			@Pc(36) int[] local36 = new int[local33];
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < arg0.length; local42++) {
				@Pc(48) byte local48 = arg0[local42];
				@Pc(53) int[] local53 = this.anIntArrayArray42[local40];
				for (@Pc(55) int local55 = 0; local55 < 14; local55++) {
					local36[local38 + local55] += local53[local55] * local48;
				}
				local40 += this.anInt8120;
				@Pc(86) int local86 = local40 / this.anInt8125;
				local38 += local86;
				local40 -= local86 * this.anInt8125;
			}
			arg0 = new byte[local33];
			for (@Pc(109) int local109 = 0; local109 < local33; local109++) {
				@Pc(121) int local121 = local36[local109] + 32768 >> 16;
				if (local121 < -128) {
					arg0[local109] = -128;
				} else if (local121 <= 127) {
					arg0[local109] = (byte) local121;
				} else {
					arg0[local109] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZI)I")
	public int method6849(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray42 != null) {
			arg0 = (int) ((long) this.anInt8120 * (long) arg0 / (long) this.anInt8125);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "([SB)[S")
	public short[] method6850(@OriginalArg(0) short[] arg0) {
		if (this.anIntArrayArray42 != null) {
			@Pc(19) int local19 = (int) ((long) this.anInt8120 * (long) arg0.length / (long) this.anInt8125) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) short local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray42[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local41 + local24] += local34 * local39[local41] >> 2;
				}
				local26 += this.anInt8120;
				@Pc(76) int local76 = local26 / this.anInt8125;
				local24 += local76;
				local26 -= local76 * this.anInt8125;
			}
			arg0 = new short[local19];
			for (@Pc(103) int local103 = 0; local103 < local19; local103++) {
				@Pc(115) int local115 = local22[local103] + 8192 >> 14;
				if (local115 < -32768) {
					arg0[local103] = -32768;
				} else if (local115 > 32767) {
					arg0[local103] = 32767;
				} else {
					arg0[local103] = (short) local115;
				}
			}
		}
		return arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class355 {

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
	private int anInt9442;

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
	private int anInt9435;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(II)V")
	public Class355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static30.method503(arg0, arg1);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anIntArrayArray56 = new int[local20][14];
			this.anInt9442 = local20;
			this.anInt9435 = local16;
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray56[local33];
				@Pc(48) double local48 = (double) local33 / (double) local20 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local48 + 7.0D);
				if (local69 > 14) {
					local69 = 14;
				}
				@Pc(82) double local82 = (double) local16 / (double) local20;
				while (local56 < local69) {
					@Pc(92) double local92 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(94) double local94 = local82;
					if (local92 < -1.0E-4D || local92 > 1.0E-4D) {
						local94 = local82 * (Math.sin(local92) / local92);
					}
					local94 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local94 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)I")
	public int method8031(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray56 != null) {
			arg0 = (int) ((long) this.anInt9435 * (long) arg0 / (long) this.anInt9442) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I[B)[B")
	public byte[] method8033(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray56 != null) {
			@Pc(32) int local32 = (int) ((long) arg0.length * (long) this.anInt9435 / (long) this.anInt9442) + 14;
			@Pc(35) int[] local35 = new int[local32];
			@Pc(37) int local37 = 0;
			@Pc(39) int local39 = 0;
			for (@Pc(41) int local41 = 0; local41 < arg0.length; local41++) {
				@Pc(47) byte local47 = arg0[local41];
				@Pc(52) int[] local52 = this.anIntArrayArray56[local39];
				for (@Pc(54) int local54 = 0; local54 < 14; local54++) {
					local35[local37 + local54] += local52[local54] * local47;
				}
				local39 += this.anInt9435;
				@Pc(88) int local88 = local39 / this.anInt9442;
				local37 += local88;
				local39 -= this.anInt9442 * local88;
			}
			arg0 = new byte[local32];
			for (@Pc(115) int local115 = 0; local115 < local32; local115++) {
				@Pc(127) int local127 = local35[local115] + 32768 >> 16;
				if (local127 < -128) {
					arg0[local115] = -128;
				} else if (local127 > 127) {
					arg0[local115] = 127;
				} else {
					arg0[local115] = (byte) local127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "([SB)[S")
	public short[] method8036(@OriginalArg(0) short[] arg0) {
		if (this.anIntArrayArray56 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt9435 / (long) this.anInt9442) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) short local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray56[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local41 + local24] += local39[local41] * local34 >> 2;
				}
				local26 += this.anInt9435;
				@Pc(76) int local76 = local26 / this.anInt9442;
				local26 -= this.anInt9442 * local76;
				local24 += local76;
			}
			arg0 = new short[local19];
			for (@Pc(103) int local103 = 0; local103 < local19; local103++) {
				@Pc(115) int local115 = local22[local103] + 8192 >> 14;
				if (local115 < -32768) {
					arg0[local103] = -32768;
				} else if (local115 <= 32767) {
					arg0[local103] = (short) local115;
				} else {
					arg0[local103] = 32767;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)I")
	public int method8037(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray56 != null) {
			arg0 = (int) ((long) this.anInt9435 * (long) arg0 / (long) this.anInt9442);
		}
		return arg0;
	}
}

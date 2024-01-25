import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class334 {

	@OriginalMember(owner = "client!td", name = "h", descriptor = "I")
	private int anInt9060;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "I")
	private int anInt9061;

	@OriginalMember(owner = "client!td", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray94;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(II)V")
	public Class334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static270.method4304(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anInt9060 = local20;
			this.anInt9061 = local16;
			this.anIntArrayArray94 = new int[local16][14];
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray94[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local48 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				@Pc(79) double local79 = (double) local20 / (double) local16;
				while (local56 < local66) {
					@Pc(88) double local88 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(90) double local90 = local79;
					if (local88 < -1.0E-4D || local88 > 1.0E-4D) {
						local90 = local79 * (Math.sin(local88) / local88);
					}
					local90 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local90 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([SZ)[S")
	public short[] method7681(@OriginalArg(0) short[] arg0) {
		if (this.anIntArrayArray94 != null) {
			@Pc(24) int local24 = (int) ((long) arg0.length * (long) this.anInt9060 / (long) this.anInt9061) + 14;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(29) int local29 = 0;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
				@Pc(39) short local39 = arg0[local33];
				@Pc(44) int[] local44 = this.anIntArrayArray94[local31];
				for (@Pc(46) int local46 = 0; local46 < 14; local46++) {
					local27[local29 + local46] += local39 * local44[local46] >> 2;
				}
				local31 += this.anInt9060;
				@Pc(78) int local78 = local31 / this.anInt9061;
				local31 -= this.anInt9061 * local78;
				local29 += local78;
			}
			arg0 = new short[local24];
			for (@Pc(99) int local99 = 0; local99 < local24; local99++) {
				@Pc(109) int local109 = local27[local99] + 8192 >> 14;
				if (local109 < -32768) {
					arg0[local99] = -32768;
				} else if (local109 > 32767) {
					arg0[local99] = 32767;
				} else {
					arg0[local99] = (short) local109;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)I")
	public int method7683(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray94 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt9060 / (long) this.anInt9061) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)I")
	public int method7684(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray94 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt9060 / (long) this.anInt9061);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I[B)[B")
	public byte[] method7686(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray94 != null) {
			@Pc(27) int local27 = (int) ((long) this.anInt9060 * (long) arg0.length / (long) this.anInt9061) + 14;
			@Pc(30) int[] local30 = new int[local27];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
				@Pc(42) byte local42 = arg0[local36];
				@Pc(47) int[] local47 = this.anIntArrayArray94[local34];
				for (@Pc(49) int local49 = 0; local49 < 14; local49++) {
					local30[local32 + local49] += local42 * local47[local49];
				}
				local34 += this.anInt9060;
				@Pc(79) int local79 = local34 / this.anInt9061;
				local32 += local79;
				local34 -= local79 * this.anInt9061;
			}
			arg0 = new byte[local27];
			for (@Pc(104) int local104 = 0; local104 < local27; local104++) {
				@Pc(114) int local114 = local30[local104] + 32768 >> 16;
				if (local114 < -128) {
					arg0[local104] = -128;
				} else if (local114 > 127) {
					arg0[local104] = 127;
				} else {
					arg0[local104] = (byte) local114;
				}
			}
		}
		return arg0;
	}
}

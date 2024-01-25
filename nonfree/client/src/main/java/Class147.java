import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class147 {

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
	private int anInt4176;

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
	private int anInt4182;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(II)V")
	public Class147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static43.method932(arg1, arg0);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anIntArrayArray31 = new int[local16][14];
			this.anInt4176 = local16;
			this.anInt4182 = local20;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray31[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local48 + 7.0D);
				if (local69 > 14) {
					local69 = 14;
				}
				@Pc(82) double local82 = (double) local20 / (double) local16;
				while (local69 > local56) {
					@Pc(91) double local91 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(93) double local93 = local82;
					if (local91 < -1.0E-4D || local91 > 1.0E-4D) {
						local93 = local82 * (Math.sin(local91) / local91);
					}
					local93 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local93 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)I")
	public int method3459(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray31 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt4182 / (long) this.anInt4176) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "([SI)[S")
	public short[] method3461(@OriginalArg(0) short[] arg0) {
		if (this.anIntArrayArray31 != null) {
			@Pc(19) int local19 = (int) ((long) this.anInt4182 * (long) arg0.length / (long) this.anInt4176) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) short local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray31[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local24 + local41] += local34 * local39[local41] >> 2;
				}
				local26 += this.anInt4182;
				@Pc(73) int local73 = local26 / this.anInt4176;
				local26 -= this.anInt4176 * local73;
				local24 += local73;
			}
			arg0 = new short[local19];
			for (@Pc(94) int local94 = 0; local94 < local19; local94++) {
				@Pc(104) int local104 = local22[local94] + 8192 >> 14;
				if (local104 < -32768) {
					arg0[local94] = -32768;
				} else if (local104 > 32767) {
					arg0[local94] = 32767;
				} else {
					arg0[local94] = (short) local104;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZ)I")
	public int method3465(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray31 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt4182 / (long) this.anInt4176);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I[B)[B")
	public byte[] method3467(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray31 != null) {
			@Pc(27) int local27 = (int) ((long) this.anInt4182 * (long) arg0.length / (long) this.anInt4176) + 14;
			@Pc(30) int[] local30 = new int[local27];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
				@Pc(42) byte local42 = arg0[local36];
				@Pc(47) int[] local47 = this.anIntArrayArray31[local34];
				for (@Pc(49) int local49 = 0; local49 < 14; local49++) {
					local30[local49 + local32] += local42 * local47[local49];
				}
				local34 += this.anInt4182;
				@Pc(80) int local80 = local34 / this.anInt4176;
				local32 += local80;
				local34 -= this.anInt4176 * local80;
			}
			arg0 = new byte[local27];
			for (@Pc(101) int local101 = 0; local101 < local27; local101++) {
				@Pc(111) int local111 = local30[local101] + 32768 >> 16;
				if (local111 < -128) {
					arg0[local101] = -128;
				} else if (local111 <= 127) {
					arg0[local101] = (byte) local111;
				} else {
					arg0[local101] = 127;
				}
			}
		}
		return arg0;
	}
}

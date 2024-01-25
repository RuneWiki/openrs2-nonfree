import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class101 {

	@OriginalMember(owner = "client!ew", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "I")
	private int anInt3063;

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
	private int anInt3058;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(II)V")
	public Class101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(14) int local14 = Static134.method2599(arg0, arg1);
			@Pc(18) int local18 = arg0 / local14;
			@Pc(22) int local22 = arg1 / local14;
			this.anIntArrayArray21 = new int[local18][14];
			this.anInt3063 = local18;
			this.anInt3058 = local22;
			for (@Pc(35) int local35 = 0; local35 < local18; local35++) {
				@Pc(41) int[] local41 = this.anIntArrayArray21[local35];
				@Pc(49) double local49 = (double) local35 / (double) local18 + 6.0D;
				@Pc(57) int local57 = (int) Math.floor(local49 + 1.0D - 7.0D);
				if (local57 < 0) {
					local57 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local49 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(83) double local83 = (double) local22 / (double) local18;
				while (local57 < local70) {
					@Pc(91) double local91 = ((double) local57 - local49) * 3.141592653589793D;
					@Pc(93) double local93 = local83;
					if (local91 < -1.0E-4D || local91 > 1.0E-4D) {
						local93 = local83 * (Math.sin(local91) / local91);
					}
					local93 *= Math.cos(((double) local57 - local49) * 0.2243994752564138D) * 0.46D + 0.54D;
					local41[local57] = (int) Math.floor(local93 * 65536.0D + 0.5D);
					local57++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)I")
	public int method2616(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray21 != null) {
			arg0 = (int) ((long) this.anInt3058 * (long) arg0 / (long) this.anInt3063);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(B[S)[S")
	public short[] method2617(@OriginalArg(1) short[] arg0) {
		if (this.anIntArrayArray21 != null) {
			@Pc(19) int local19 = (int) ((long) this.anInt3058 * (long) arg0.length / (long) this.anInt3063) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) short local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray21[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local41 + local24] += local34 * local39[local41] >> 2;
				}
				local26 += this.anInt3058;
				@Pc(74) int local74 = local26 / this.anInt3063;
				local26 -= this.anInt3063 * local74;
				local24 += local74;
			}
			arg0 = new short[local19];
			for (@Pc(95) int local95 = 0; local95 < local19; local95++) {
				@Pc(105) int local105 = local22[local95] + 8192 >> 14;
				if (local105 < -32768) {
					arg0[local95] = -32768;
				} else if (local105 > 32767) {
					arg0[local95] = 32767;
				} else {
					arg0[local95] = (short) local105;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(II)I")
	public int method2618(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray21 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt3058 / (long) this.anInt3063) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(B[B)[B")
	public byte[] method2620(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray21 != null) {
			@Pc(19) int local19 = (int) ((long) this.anInt3058 * (long) arg0.length / (long) this.anInt3063) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray21[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local24 + local41] += local39[local41] * local34;
				}
				local26 += this.anInt3058;
				@Pc(70) int local70 = local26 / this.anInt3063;
				local24 += local70;
				local26 -= local70 * this.anInt3063;
			}
			arg0 = new byte[local19];
			for (@Pc(91) int local91 = 0; local91 < local19; local91++) {
				@Pc(101) int local101 = local22[local91] + 32768 >> 16;
				if (local101 < -128) {
					arg0[local91] = -128;
				} else if (local101 > 127) {
					arg0[local91] = 127;
				} else {
					arg0[local91] = (byte) local101;
				}
			}
		}
		return arg0;
	}
}

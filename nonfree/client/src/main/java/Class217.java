import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class217 {

	@OriginalMember(owner = "client!md", name = "f", descriptor = "I")
	private int anInt5401;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "I")
	private int anInt5398;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(II)V")
	public Class217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static204.method2873(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anInt5401 = local24;
			this.anInt5398 = local20;
			this.anIntArrayArray29 = new int[local24][14];
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray29[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(83) double local83 = (double) local20 / (double) local24;
				while (local60 < local70) {
					@Pc(93) double local93 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(95) double local95 = local83;
					if (local93 < -1.0E-4D || local93 > 1.0E-4D) {
						local95 = local83 * (Math.sin(local93) / local93);
					}
					local95 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local95 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([BI)[B")
	public byte[] method4587(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray29 != null) {
			@Pc(23) int local23 = (int) ((long) this.anInt5398 * (long) arg0.length / (long) this.anInt5401) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) byte local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray29[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local28 + local45] += local38 * local43[local45];
				}
				local30 += this.anInt5398;
				@Pc(77) int local77 = local30 / this.anInt5401;
				local30 -= this.anInt5401 * local77;
				local28 += local77;
			}
			arg0 = new byte[local23];
			for (@Pc(98) int local98 = 0; local98 < local23; local98++) {
				@Pc(108) int local108 = local26[local98] + 32768 >> 16;
				if (local108 < -128) {
					arg0[local98] = -128;
				} else if (local108 > 127) {
					arg0[local98] = 127;
				} else {
					arg0[local98] = (byte) local108;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I[S)[S")
	public short[] method4588(@OriginalArg(1) short[] arg0) {
		if (this.anIntArrayArray29 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt5398 / (long) this.anInt5401) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) short local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray29[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local24 + local41] += local39[local41] * local34 >> 2;
				}
				local26 += this.anInt5398;
				@Pc(74) int local74 = local26 / this.anInt5401;
				local24 += local74;
				local26 -= local74 * this.anInt5401;
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

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)I")
	public int method4589(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray29 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt5398 / (long) this.anInt5401);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)I")
	public int method4591(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray29 != null) {
			arg0 = (int) ((long) this.anInt5398 * (long) arg0 / (long) this.anInt5401) + 6;
		}
		return arg0;
	}
}

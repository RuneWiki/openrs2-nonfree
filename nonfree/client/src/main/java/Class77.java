import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class77 {

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
	private int anInt4257;

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
	private int anInt4256;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(II)V")
	public Class77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static9.method275(arg0, arg1);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anInt4257 = local24;
			this.anIntArrayArray35 = new int[local20][14];
			this.anInt4256 = local20;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray35[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(83) double local83 = (double) local24 / (double) local20;
				while (local70 > local60) {
					@Pc(87) double local87 = local83;
					@Pc(95) double local95 = ((double) local60 - local52) * 3.141592653589793D;
					if (local95 < -1.0E-4D || local95 > 1.0E-4D) {
						local87 = local83 * (Math.sin(local95) / local95);
					}
					local87 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local87 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)I")
	public int method3263(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray35 != null) {
			arg0 = (int) ((long) this.anInt4257 * (long) arg0 / (long) this.anInt4256);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[B)[B")
	public byte[] method3264(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray35 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt4257 / (long) this.anInt4256) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray35[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local24 + local41] += local39[local41] * local34;
				}
				local26 += this.anInt4257;
				@Pc(70) int local70 = local26 / this.anInt4256;
				local24 += local70;
				local26 -= this.anInt4256 * local70;
			}
			arg0 = new byte[local19];
			for (@Pc(95) int local95 = 0; local95 < local19; local95++) {
				@Pc(105) int local105 = local22[local95] + 32768 >> 16;
				if (local105 < -128) {
					arg0[local95] = -128;
				} else if (local105 <= 127) {
					arg0[local95] = (byte) local105;
				} else {
					arg0[local95] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)I")
	public int method3266(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray35 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt4257 / (long) this.anInt4256) + 6;
		}
		return arg0;
	}
}

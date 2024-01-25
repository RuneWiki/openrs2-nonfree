import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class166 {

	@OriginalMember(owner = "client!js", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray103;

	@OriginalMember(owner = "client!js", name = "b", descriptor = "I")
	private int anInt4580;

	@OriginalMember(owner = "client!js", name = "g", descriptor = "I")
	private int anInt4585;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(II)V")
	public Class166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static455.method6388(arg1, arg0);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anIntArrayArray103 = new int[local20][14];
			this.anInt4580 = local24;
			this.anInt4585 = local20;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray103[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(81) double local81 = (double) local24 / (double) local20;
				while (local70 > local60) {
					@Pc(90) double local90 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(92) double local92 = local81;
					if (local90 < -1.0E-4D || local90 > 1.0E-4D) {
						local92 = local81 * (Math.sin(local90) / local90);
					}
					local92 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local92 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([BI)[B")
	public byte[] method3988(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray103 != null) {
			@Pc(29) int local29 = (int) ((long) this.anInt4580 * (long) arg0.length / (long) this.anInt4585) + 14;
			@Pc(32) int[] local32 = new int[local29];
			@Pc(34) int local34 = 0;
			@Pc(36) int local36 = 0;
			for (@Pc(38) int local38 = 0; local38 < arg0.length; local38++) {
				@Pc(44) byte local44 = arg0[local38];
				@Pc(49) int[] local49 = this.anIntArrayArray103[local36];
				for (@Pc(51) int local51 = 0; local51 < 14; local51++) {
					local32[local51 + local34] += local44 * local49[local51];
				}
				local36 += this.anInt4580;
				@Pc(82) int local82 = local36 / this.anInt4585;
				local36 -= local82 * this.anInt4585;
				local34 += local82;
			}
			arg0 = new byte[local29];
			for (@Pc(103) int local103 = 0; local103 < local29; local103++) {
				@Pc(113) int local113 = local32[local103] + 32768 >> 16;
				if (local113 < -128) {
					arg0[local103] = -128;
				} else if (local113 > 127) {
					arg0[local103] = 127;
				} else {
					arg0[local103] = (byte) local113;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)I")
	public int method3989(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray103 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt4580 / (long) this.anInt4585) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BI)I")
	public int method3991(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray103 != null) {
			arg0 = (int) ((long) this.anInt4580 * (long) arg0 / (long) this.anInt4585);
		}
		return arg0;
	}
}

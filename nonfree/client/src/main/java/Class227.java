import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class227 {

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
	private int anInt6051;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
	private int anInt6050;

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(II)V")
	public Class227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static48.method6685(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anInt6051 = local20;
			this.anInt6050 = local24;
			this.anIntArrayArray30 = new int[local24][14];
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray30[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(81) double local81 = (double) local20 / (double) local24;
				while (local60 < local70) {
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

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I[B)[B")
	public byte[] method4901(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray30 != null) {
			@Pc(31) int local31 = (int) ((long) this.anInt6051 * (long) arg0.length / (long) this.anInt6050) + 14;
			@Pc(34) int[] local34 = new int[local31];
			@Pc(36) int local36 = 0;
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < arg0.length; local40++) {
				@Pc(46) byte local46 = arg0[local40];
				@Pc(51) int[] local51 = this.anIntArrayArray30[local38];
				for (@Pc(53) int local53 = 0; local53 < 14; local53++) {
					local34[local53 + local36] += local51[local53] * local46;
				}
				local38 += this.anInt6051;
				@Pc(84) int local84 = local38 / this.anInt6050;
				local38 -= this.anInt6050 * local84;
				local36 += local84;
			}
			arg0 = new byte[local31];
			for (@Pc(109) int local109 = 0; local109 < local31; local109++) {
				@Pc(119) int local119 = local34[local109] + 32768 >> 16;
				if (local119 < -128) {
					arg0[local109] = -128;
				} else if (local119 <= 127) {
					arg0[local109] = (byte) local119;
				} else {
					arg0[local109] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IB)I")
	public int method4904(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray30 != null) {
			arg0 = (int) ((long) this.anInt6051 * (long) arg0 / (long) this.anInt6050) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)I")
	public int method4905(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray30 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt6051 / (long) this.anInt6050);
		}
		return arg0;
	}
}

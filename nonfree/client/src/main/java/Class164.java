import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class164 {

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
	private int anInt4657;

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
	private int anInt4658;

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(II)V")
	public Class164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static46.method878(arg0, arg1);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anInt4657 = local24;
			this.anInt4658 = local20;
			this.anIntArrayArray40 = new int[local20][14];
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray40[local37];
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
				while (local73 > local60) {
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

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)I")
	public int method3850(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray40 != null) {
			arg0 = (int) ((long) this.anInt4657 * (long) arg0 / (long) this.anInt4658);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I[B)[B")
	public byte[] method3852(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray40 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt4657 / (long) this.anInt4658) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray40[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local24 + local41] += local39[local41] * local34;
				}
				local26 += this.anInt4657;
				@Pc(73) int local73 = local26 / this.anInt4658;
				local24 += local73;
				local26 -= local73 * this.anInt4658;
			}
			arg0 = new byte[local19];
			for (@Pc(94) int local94 = 0; local94 < local19; local94++) {
				@Pc(104) int local104 = local22[local94] + 32768 >> 16;
				if (local104 < -128) {
					arg0[local94] = -128;
				} else if (local104 > 127) {
					arg0[local94] = 127;
				} else {
					arg0[local94] = (byte) local104;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)I")
	public int method3857(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray40 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt4657 / (long) this.anInt4658) + 6;
		}
		return arg0;
	}
}

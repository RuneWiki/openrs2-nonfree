import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class154 {

	@OriginalMember(owner = "client!it", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!it", name = "j", descriptor = "I")
	private int anInt4427;

	@OriginalMember(owner = "client!it", name = "b", descriptor = "I")
	private int anInt4422;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(II)V")
	public Class154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static40.method4036(arg0, arg1);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anIntArrayArray34 = new int[local20][14];
			this.anInt4427 = local20;
			this.anInt4422 = local16;
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray34[local33];
				@Pc(48) double local48 = (double) local33 / (double) local20 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local48 + 7.0D);
				if (local69 > 14) {
					local69 = 14;
				}
				@Pc(80) double local80 = (double) local16 / (double) local20;
				while (local69 > local56) {
					@Pc(89) double local89 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(91) double local91 = local80;
					if (local89 < -1.0E-4D || local89 > 1.0E-4D) {
						local91 = local80 * (Math.sin(local89) / local89);
					}
					local91 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local91 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(II)I")
	public int method3923(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray34 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt4422 / (long) this.anInt4427) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(B[B)[B")
	public byte[] method3924(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray34 != null) {
			@Pc(19) int local19 = (int) ((long) this.anInt4422 * (long) arg0.length / (long) this.anInt4427) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray34[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local41 + local24] += local34 * local39[local41];
				}
				local26 += this.anInt4422;
				@Pc(70) int local70 = local26 / this.anInt4427;
				local24 += local70;
				local26 -= local70 * this.anInt4427;
			}
			arg0 = new byte[local19];
			for (@Pc(95) int local95 = 0; local95 < local19; local95++) {
				@Pc(105) int local105 = local22[local95] + 32768 >> 16;
				if (local105 < -128) {
					arg0[local95] = -128;
				} else if (local105 > 127) {
					arg0[local95] = 127;
				} else {
					arg0[local95] = (byte) local105;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IZ)I")
	public int method3925(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray34 != null) {
			arg0 = (int) ((long) this.anInt4422 * (long) arg0 / (long) this.anInt4427);
		}
		return arg0;
	}
}

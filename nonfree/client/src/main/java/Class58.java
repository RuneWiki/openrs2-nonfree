import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class58 {

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
	private int anInt1806;

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
	private int anInt1807;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(II)V")
	public Class58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static54.method1027(arg1, arg0);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anInt1806 = local24;
			this.anInt1807 = local20;
			this.anIntArrayArray20 = new int[local20][14];
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(47) double local47 = (double) local37 / (double) local20 + 6.0D;
				@Pc(52) int[] local52 = this.anIntArrayArray20[local37];
				@Pc(60) int local60 = (int) Math.floor(local47 + 1.0D - 7.0D);
				@Pc(66) int local66 = (int) Math.ceil(local47 + 7.0D);
				@Pc(72) double local72 = (double) local24 / (double) local20;
				if (local60 < 0) {
					local60 = 0;
				}
				if (local66 > 14) {
					local66 = 14;
				}
				while (local60 < local66) {
					@Pc(87) double local87 = local72;
					@Pc(94) double local94 = ((double) local60 - local47) * 3.141592653589793D;
					if (local94 < -1.0E-4D || local94 > 1.0E-4D) {
						local87 = local72 * (Math.sin(local94) / local94);
					}
					local87 *= Math.cos(((double) local60 - local47) * 0.2243994752564138D) * 0.46D + 0.54D;
					local52[local60] = (int) Math.floor(local87 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I")
	public int method1380(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray20 != null) {
			arg0 = (int) ((long) this.anInt1806 * (long) arg0 / (long) this.anInt1807);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[B)[B")
	public byte[] method1382(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray20 != null) {
			@Pc(28) int local28 = (int) ((long) this.anInt1806 * (long) arg0.length / (long) this.anInt1807) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray20[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local33 + local50] += local43 * local48[local50];
				}
				local35 += this.anInt1806;
				@Pc(79) int local79 = local35 / this.anInt1807;
				local33 += local79;
				local35 -= local79 * this.anInt1807;
			}
			arg0 = new byte[local28];
			for (@Pc(100) int local100 = 0; local100 < local28; local100++) {
				@Pc(110) int local110 = local31[local100] + 32768 >> 16;
				if (local110 < -128) {
					arg0[local100] = -128;
				} else if (local110 > 127) {
					arg0[local100] = 127;
				} else {
					arg0[local100] = (byte) local110;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)I")
	public int method1384(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray20 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1806 / (long) this.anInt1807) + 6;
		}
		return arg0;
	}
}

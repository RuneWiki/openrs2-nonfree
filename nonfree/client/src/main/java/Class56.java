import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class56 {

	@OriginalMember(owner = "client!h", name = "a", descriptor = "I")
	private int anInt1913;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!h", name = "q", descriptor = "I")
	private int anInt1925;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(II)V")
	public Class56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static223.method3572(arg0, arg1);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anInt1913 = local16;
			this.anIntArrayArray20 = new int[local20][14];
			this.anInt1925 = local20;
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(45) int[] local45 = this.anIntArrayArray20[local33];
				@Pc(53) double local53 = (double) local33 / (double) local20 + 6.0D;
				@Pc(59) double local59 = (double) local16 / (double) local20;
				@Pc(67) int local67 = (int) Math.floor(local53 + 1.0D - 7.0D);
				if (local67 < 0) {
					local67 = 0;
				}
				@Pc(81) int local81 = (int) Math.ceil(local53 + 7.0D);
				if (local81 > 14) {
					local81 = 14;
				}
				while (local81 > local67) {
					@Pc(101) double local101 = ((double) local67 - local53) * 3.141592653589793D;
					@Pc(103) double local103 = local59;
					if (local101 < -1.0E-4D || local101 > 1.0E-4D) {
						local103 = local59 * (Math.sin(local101) / local101);
					}
					local103 *= Math.cos(((double) local67 - local53) * 0.2243994752564138D) * 0.46D + 0.54D;
					local45[local67] = (int) Math.floor(local103 * 65536.0D + 0.5D);
					local67++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)I")
	public int method1491(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray20 != null) {
			arg0 = (int) ((long) this.anInt1913 * (long) arg0 / (long) this.anInt1925) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)I")
	public int method1493(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray20 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1913 / (long) this.anInt1925);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([BZ)[B")
	public byte[] method1497(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray20 != null) {
			@Pc(16) int local16 = 0;
			@Pc(31) int local31 = (int) ((long) this.anInt1913 * (long) arg0.length / (long) this.anInt1925) + 14;
			@Pc(34) int[] local34 = new int[local31];
			@Pc(36) int local36 = 0;
			@Pc(38) int local38;
			for (local38 = 0; local38 < arg0.length; local38++) {
				@Pc(50) byte local50 = arg0[local38];
				@Pc(55) int[] local55 = this.anIntArrayArray20[local36];
				@Pc(57) int local57;
				for (local57 = 0; local57 < 14; local57++) {
					local34[local16 + local57] += local55[local57] * local50;
				}
				local36 += this.anInt1913;
				local57 = local36 / this.anInt1925;
				local16 += local57;
				local36 -= local57 * this.anInt1925;
			}
			arg0 = new byte[local31];
			for (local38 = 0; local38 < local31; local38++) {
				@Pc(120) int local120 = local34[local38] + 32768 >> 16;
				if (local120 < -128) {
					arg0[local38] = -128;
				} else if (local120 > 127) {
					arg0[local38] = 127;
				} else {
					arg0[local38] = (byte) local120;
				}
			}
		}
		return arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class56 {

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
	private int anInt2639;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
	private int anInt2636;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(II)V")
	public Class56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static23.method1667(arg1, arg0);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anIntArrayArray65 = new int[local16][14];
			this.anInt2639 = local16;
			this.anInt2636 = local20;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(43) double local43 = (double) local33 / (double) local16 + 6.0D;
				@Pc(48) int[] local48 = this.anIntArrayArray65[local33];
				@Pc(56) int local56 = (int) Math.floor(local43 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) double local69 = (double) local20 / (double) local16;
				@Pc(75) int local75 = (int) Math.ceil(local43 + 7.0D);
				if (local75 > 14) {
					local75 = 14;
				}
				while (local56 < local75) {
					@Pc(89) double local89 = ((double) local56 - local43) * 3.141592653589793D;
					@Pc(91) double local91 = local69;
					if (local89 < -1.0E-4D || local89 > 1.0E-4D) {
						local91 = local69 * (Math.sin(local89) / local89);
					}
					local91 *= Math.cos(((double) local56 - local43) * 0.2243994752564138D) * 0.46D + 0.54D;
					local48[local56] = (int) Math.floor(local91 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)I")
	public int method1707(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray65 != null) {
			arg0 = (int) ((long) this.anInt2636 * (long) arg0 / (long) this.anInt2639);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)I")
	public int method1708(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray65 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2636 / (long) this.anInt2639) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([BB)[B")
	public byte[] method1709(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray65 != null) {
			@Pc(19) int local19 = (int) ((long) this.anInt2636 * (long) arg0.length / (long) this.anInt2639) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray65[local24];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local41 + local26] += local39[local41] * local34;
				}
				local24 += this.anInt2636;
				@Pc(72) int local72 = local24 / this.anInt2639;
				local24 -= local72 * this.anInt2639;
				local26 += local72;
			}
			arg0 = new byte[local19];
			for (@Pc(97) int local97 = 0; local97 < local19; local97++) {
				@Pc(107) int local107 = local22[local97] + 32768 >> 16;
				if (local107 < -128) {
					arg0[local97] = -128;
				} else if (local107 <= 127) {
					arg0[local97] = (byte) local107;
				} else {
					arg0[local97] = 127;
				}
			}
		}
		return arg0;
	}
}

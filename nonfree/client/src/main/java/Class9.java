import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class9 {

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(II)V")
	public Class9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static122.method2769(arg1, arg0);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anIntArrayArray4 = new int[local20][14];
			this.anInt390 = local24;
			this.anInt389 = local20;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(47) double local47 = (double) local37 / (double) local20 + 6.0D;
				@Pc(52) int[] local52 = this.anIntArrayArray4[local37];
				@Pc(60) int local60 = (int) Math.floor(local47 + 1.0D - 7.0D);
				@Pc(66) double local66 = (double) local24 / (double) local20;
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(76) int local76 = (int) Math.ceil(local47 + 7.0D);
				if (local76 > 14) {
					local76 = 14;
				}
				while (local60 < local76) {
					@Pc(93) double local93 = ((double) local60 - local47) * 3.141592653589793D;
					@Pc(95) double local95 = local66;
					if (local93 < -1.0E-4D || local93 > 1.0E-4D) {
						local95 = local66 * (Math.sin(local93) / local93);
					}
					local95 *= Math.cos(((double) local60 - local47) * 0.2243994752564138D) * 0.46D + 0.54D;
					local52[local60] = (int) Math.floor(local95 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
	public int method212(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray4 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt390 / (long) this.anInt389);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)I")
	public int method213(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray4 != null) {
			arg0 = (int) ((long) this.anInt390 * (long) arg0 / (long) this.anInt389) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([BI)[B")
	public byte[] method215(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray4 != null) {
			@Pc(19) int local19 = (int) ((long) this.anInt390 * (long) arg0.length / (long) this.anInt389) + 14;
			@Pc(21) int local21 = 0;
			@Pc(24) int[] local24 = new int[local19];
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray4[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local24[local41 + local21] += local34 * local39[local41];
				}
				local26 += this.anInt390;
				@Pc(72) int local72 = local26 / this.anInt389;
				local21 += local72;
				local26 -= local72 * this.anInt389;
			}
			arg0 = new byte[local19];
			for (@Pc(97) int local97 = 0; local97 < local19; local97++) {
				@Pc(107) int local107 = local24[local97] + 32768 >> 16;
				if (local107 < -128) {
					arg0[local97] = -128;
				} else if (local107 > 127) {
					arg0[local97] = 127;
				} else {
					arg0[local97] = (byte) local107;
				}
			}
		}
		return arg0;
	}
}

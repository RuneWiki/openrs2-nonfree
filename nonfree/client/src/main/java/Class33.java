import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class33 {

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(II)V")
	public Class33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static6.method112(arg1, arg0);
			@Pc(16) int local16 = arg1 / local12;
			this.anInt1024 = local16;
			@Pc(23) int local23 = arg0 / local12;
			this.anInt1028 = local23;
			this.anIntArrayArray10 = new int[local23][14];
			for (@Pc(33) int local33 = 0; local33 < local23; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray10[local33];
				@Pc(48) double local48 = (double) local33 / (double) local23 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local48 + 7.0D);
				if (local69 > 14) {
					local69 = 14;
				}
				@Pc(82) double local82 = (double) local16 / (double) local23;
				while (local69 > local56) {
					@Pc(91) double local91 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(93) double local93 = local82;
					if (local91 < -1.0E-4D || local91 > 1.0E-4D) {
						local93 = local82 * (Math.sin(local91) / local91);
					}
					local93 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local93 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B[B)[B")
	public byte[] method730(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray10 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt1024 / (long) this.anInt1028) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray10[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local41 + local24] += local34 * local39[local41];
				}
				local26 += this.anInt1024;
				@Pc(72) int local72 = local26 / this.anInt1028;
				local26 -= this.anInt1028 * local72;
				local24 += local72;
			}
			arg0 = new byte[local19];
			for (@Pc(97) int local97 = 0; local97 < local19; local97++) {
				@Pc(107) int local107 = local22[local97] + 32768 >> 16;
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

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)I")
	public int method734(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray10 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1024 / (long) this.anInt1028);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)I")
	public int method735(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray10 != null) {
			arg0 = (int) ((long) this.anInt1024 * (long) arg0 / (long) this.anInt1028) + 6;
		}
		return arg0;
	}
}

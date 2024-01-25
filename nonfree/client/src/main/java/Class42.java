import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class42 {

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
	private int anInt1511;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
	private int anInt1512;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(II)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(10) int local10 = Static161.method3234(arg1, arg0);
			@Pc(14) int local14 = arg1 / local10;
			@Pc(18) int local18 = arg0 / local10;
			this.anInt1511 = local18;
			this.anIntArrayArray22 = new int[local18][14];
			this.anInt1512 = local14;
			for (@Pc(31) int local31 = 0; local31 < local18; local31++) {
				@Pc(37) int[] local37 = this.anIntArrayArray22[local31];
				@Pc(45) double local45 = (double) local31 / (double) local18 + 6.0D;
				@Pc(53) int local53 = (int) Math.floor(local45 + 1.0D - 7.0D);
				if (local53 < 0) {
					local53 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local45 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				@Pc(77) double local77 = (double) local14 / (double) local18;
				while (local66 > local53) {
					@Pc(86) double local86 = ((double) local53 - local45) * 3.141592653589793D;
					@Pc(88) double local88 = local77;
					if (local86 < -1.0E-4D || local86 > 1.0E-4D) {
						local88 = local77 * (Math.sin(local86) / local86);
					}
					local88 *= Math.cos(((double) local53 - local45) * 0.2243994752564138D) * 0.46D + 0.54D;
					local37[local53] = (int) Math.floor(local88 * 65536.0D + 0.5D);
					local53++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I[B)[B")
	public byte[] method1503(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray22 != null) {
			@Pc(17) int local17 = (int) ((long) arg0.length * (long) this.anInt1512 / (long) this.anInt1511) + 14;
			@Pc(20) int[] local20 = new int[local17];
			@Pc(22) int local22 = 0;
			@Pc(24) int local24 = 0;
			for (@Pc(26) int local26 = 0; local26 < arg0.length; local26++) {
				@Pc(31) byte local31 = arg0[local26];
				@Pc(36) int[] local36 = this.anIntArrayArray22[local24];
				for (@Pc(38) int local38 = 0; local38 < 14; local38++) {
					local20[local38 + local22] += local31 * local36[local38];
				}
				local24 += this.anInt1512;
				@Pc(66) int local66 = local24 / this.anInt1511;
				local22 += local66;
				local24 -= local66 * this.anInt1511;
			}
			arg0 = new byte[local17];
			for (@Pc(87) int local87 = 0; local87 < local17; local87++) {
				@Pc(96) int local96 = local20[local87] + 32768 >> 16;
				if (local96 < -128) {
					arg0[local87] = -128;
				} else if (local96 > 127) {
					arg0[local87] = 127;
				} else {
					arg0[local87] = (byte) local96;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)I")
	public int method1505(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray22 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1512 / (long) this.anInt1511) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I")
	public int method1506(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray22 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1512 / (long) this.anInt1511);
		}
		return arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class26 {

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
	private int anInt1389;

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
	private int anInt1393;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(II)V")
	public Class26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static72.method1287(arg0, arg1);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anInt1389 = local20;
			this.anInt1393 = local24;
			this.anIntArrayArray27 = new int[local24][14];
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray27[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(58) double local58 = (double) local20 / (double) local24;
				@Pc(66) int local66 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local66 < 0) {
					local66 = 0;
				}
				@Pc(76) int local76 = (int) Math.ceil(local52 + 7.0D);
				if (local76 > 14) {
					local76 = 14;
				}
				while (local76 > local66) {
					@Pc(87) double local87 = local58;
					@Pc(94) double local94 = ((double) local66 - local52) * 3.141592653589793D;
					if (local94 < -1.0E-4D || local94 > 1.0E-4D) {
						local87 = local58 * (Math.sin(local94) / local94);
					}
					local87 *= Math.cos(((double) local66 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local66] = (int) Math.floor(local87 * 65536.0D + 0.5D);
					local66++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z[B)[B")
	public byte[] method865(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray27 != null) {
			@Pc(17) int local17 = (int) ((long) arg0.length * (long) this.anInt1389 / (long) this.anInt1393) + 14;
			@Pc(19) int local19 = 0;
			@Pc(22) int[] local22 = new int[local17];
			@Pc(24) int local24 = 0;
			for (@Pc(26) int local26 = 0; local26 < arg0.length; local26++) {
				@Pc(31) byte local31 = arg0[local26];
				@Pc(36) int[] local36 = this.anIntArrayArray27[local24];
				for (@Pc(38) int local38 = 0; local38 < 14; local38++) {
					local22[local19 + local38] += local36[local38] * local31;
				}
				local24 += this.anInt1389;
				@Pc(69) int local69 = local24 / this.anInt1393;
				local24 -= this.anInt1393 * local69;
				local19 += local69;
			}
			arg0 = new byte[local17];
			for (@Pc(94) int local94 = 0; local94 < local17; local94++) {
				@Pc(103) int local103 = local22[local94] + 32768 >> 16;
				if (local103 < -128) {
					arg0[local94] = -128;
				} else if (local103 <= 127) {
					arg0[local94] = (byte) local103;
				} else {
					arg0[local94] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)I")
	public int method870(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray27 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1389 / (long) this.anInt1393) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)I")
	public int method872(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray27 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1389 / (long) this.anInt1393);
		}
		return arg0;
	}
}

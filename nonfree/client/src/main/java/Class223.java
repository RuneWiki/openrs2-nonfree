import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class223 {

	@OriginalMember(owner = "client!th", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!th", name = "d", descriptor = "I")
	private int anInt5632;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "I")
	private int anInt5631;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(II)V")
	public Class223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static12.method256(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anIntArrayArray47 = new int[local24][14];
			this.anInt5632 = local20;
			this.anInt5631 = local24;
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray47[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(83) double local83 = (double) local20 / (double) local24;
				while (local60 < local70) {
					@Pc(92) double local92 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(94) double local94 = local83;
					if (local92 < -1.0E-4D || local92 > 1.0E-4D) {
						local94 = local83 * (Math.sin(local92) / local92);
					}
					local94 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local94 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(II)I")
	public int method4854(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray47 != null) {
			arg0 = (int) ((long) this.anInt5632 * (long) arg0 / (long) this.anInt5631);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "([BB)[B")
	public byte[] method4855(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray47 != null) {
			@Pc(17) int local17 = (int) ((long) arg0.length * (long) this.anInt5632 / (long) this.anInt5631) + 14;
			@Pc(20) int[] local20 = new int[local17];
			@Pc(22) int local22 = 0;
			@Pc(24) int local24 = 0;
			for (@Pc(26) int local26 = 0; local26 < arg0.length; local26++) {
				@Pc(31) byte local31 = arg0[local26];
				@Pc(36) int[] local36 = this.anIntArrayArray47[local24];
				for (@Pc(38) int local38 = 0; local38 < 14; local38++) {
					local20[local38 + local22] += local36[local38] * local31;
				}
				local24 += this.anInt5632;
				@Pc(66) int local66 = local24 / this.anInt5631;
				local22 += local66;
				local24 -= local66 * this.anInt5631;
			}
			arg0 = new byte[local17];
			for (@Pc(87) int local87 = 0; local87 < local17; local87++) {
				@Pc(96) int local96 = local20[local87] + 32768 >> 16;
				if (local96 < -128) {
					arg0[local87] = -128;
				} else if (local96 <= 127) {
					arg0[local87] = (byte) local96;
				} else {
					arg0[local87] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)I")
	public int method4857(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray47 != null) {
			arg0 = (int) ((long) this.anInt5632 * (long) arg0 / (long) this.anInt5631) + 6;
		}
		return arg0;
	}
}

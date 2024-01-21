import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class49 {

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
	private int anInt2060;

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
	private int anInt2049;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(II)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static127.method1984(arg1, arg0);
			@Pc(20) int local20 = arg0 / local16;
			this.anInt2060 = local20;
			this.anIntArrayArray17 = new int[local20][14];
			@Pc(32) int local32 = arg1 / local16;
			this.anInt2049 = local32;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray17[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(83) double local83 = (double) local32 / (double) local20;
				while (local70 > local60) {
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

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([BI)[B")
	public byte[] method1395(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray17 != null) {
			@Pc(28) int local28 = (int) ((long) arg0.length * (long) this.anInt2049 / (long) this.anInt2060) + 14;
			@Pc(30) int local30 = 0;
			@Pc(33) int[] local33 = new int[local28];
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray17[local30];
				@Pc(48) byte local48 = arg0[local37];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local33[local35 + local50] += local44[local50] * local48;
				}
				local30 += this.anInt2049;
				@Pc(82) int local82 = local30 / this.anInt2060;
				local35 += local82;
				local30 -= local82 * this.anInt2060;
			}
			arg0 = new byte[local28];
			for (@Pc(103) int local103 = 0; local103 < local28; local103++) {
				@Pc(113) int local113 = local33[local103] + 32768 >> 16;
				if (local113 < -128) {
					arg0[local103] = -128;
				} else if (local113 > 127) {
					arg0[local103] = 127;
				} else {
					arg0[local103] = (byte) local113;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I")
	public int method1396(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray17 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2049 / (long) this.anInt2060);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)I")
	public int method1402(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray17 != null) {
			arg0 = (int) ((long) this.anInt2049 * (long) arg0 / (long) this.anInt2060) + 6;
		}
		return arg0;
	}
}

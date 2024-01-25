import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class70 {

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
	private int anInt2314;

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
	private int anInt2312;

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(II)V")
	public Class70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static366.method6067(arg0, arg1);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anInt2314 = local20;
			this.anInt2312 = local24;
			this.anIntArrayArray19 = new int[local24][14];
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray19[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(81) double local81 = (double) local20 / (double) local24;
				while (local70 > local60) {
					@Pc(90) double local90 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(92) double local92 = local81;
					if (local90 < -1.0E-4D || local90 > 1.0E-4D) {
						local92 = local81 * (Math.sin(local90) / local90);
					}
					local92 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local92 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)I")
	public int method2224(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray19 != null) {
			arg0 = (int) ((long) this.anInt2314 * (long) arg0 / (long) this.anInt2312);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)I")
	public int method2225(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray19 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2314 / (long) this.anInt2312) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B[B)[B")
	public byte[] method2227(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray19 != null) {
			@Pc(28) int local28 = (int) ((long) arg0.length * (long) this.anInt2314 / (long) this.anInt2312) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray19[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local50 + local33] += local43 * local48[local50];
				}
				local35 += this.anInt2314;
				@Pc(79) int local79 = local35 / this.anInt2312;
				local35 -= local79 * this.anInt2312;
				local33 += local79;
			}
			arg0 = new byte[local28];
			for (@Pc(100) int local100 = 0; local100 < local28; local100++) {
				@Pc(110) int local110 = local31[local100] + 32768 >> 16;
				if (local110 < -128) {
					arg0[local100] = -128;
				} else if (local110 <= 127) {
					arg0[local100] = (byte) local110;
				} else {
					arg0[local100] = 127;
				}
			}
		}
		return arg0;
	}
}

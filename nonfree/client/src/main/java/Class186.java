import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class186 {

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
	private int anInt5629;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
	private int anInt5628;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(II)V")
	public Class186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static126.method2444(arg1, arg0);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anInt5629 = local20;
			this.anIntArrayArray43 = new int[local20][14];
			this.anInt5628 = local24;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray43[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(83) double local83 = (double) local24 / (double) local20;
				while (local70 > local60) {
					@Pc(93) double local93 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(95) double local95 = local83;
					if (local93 < -1.0E-4D || local93 > 1.0E-4D) {
						local95 = local83 * (Math.sin(local93) / local93);
					}
					local95 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local95 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)I")
	public int method4980(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray43 != null) {
			arg0 = (int) ((long) this.anInt5628 * (long) arg0 / (long) this.anInt5629) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)I")
	public int method4981(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray43 != null) {
			arg0 = (int) ((long) this.anInt5628 * (long) arg0 / (long) this.anInt5629);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I[B)[B")
	public byte[] method4982(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray43 != null) {
			@Pc(28) int local28 = (int) ((long) arg0.length * (long) this.anInt5628 / (long) this.anInt5629) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray43[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local50 + local33] += local43 * local48[local50];
				}
				local35 += this.anInt5628;
				@Pc(79) int local79 = local35 / this.anInt5629;
				local33 += local79;
				local35 -= this.anInt5629 * local79;
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

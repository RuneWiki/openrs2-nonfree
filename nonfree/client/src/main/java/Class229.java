import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class229 {

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray188;

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
	private int anInt6821;

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
	private int anInt6824;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(II)V")
	public Class229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static188.method2886(arg0, arg1);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anIntArrayArray188 = new int[local20][14];
			this.anInt6821 = local24;
			this.anInt6824 = local20;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray188[local37];
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

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(II)I")
	public int method5353(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray188 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt6821 / (long) this.anInt6824) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I[B)[B")
	public byte[] method5354(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray188 != null) {
			@Pc(23) int local23 = (int) ((long) arg0.length * (long) this.anInt6821 / (long) this.anInt6824) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) byte local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray188[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local45 + local28] += local38 * local43[local45];
				}
				local30 += this.anInt6821;
				@Pc(76) int local76 = local30 / this.anInt6824;
				local28 += local76;
				local30 -= local76 * this.anInt6824;
			}
			arg0 = new byte[local23];
			for (@Pc(97) int local97 = 0; local97 < local23; local97++) {
				@Pc(107) int local107 = local26[local97] + 32768 >> 16;
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

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(II)I")
	public int method5355(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray188 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt6821 / (long) this.anInt6824);
		}
		return arg0;
	}
}

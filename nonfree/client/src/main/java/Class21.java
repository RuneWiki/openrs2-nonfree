import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class21 {

	@OriginalMember(owner = "client!au", name = "d", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "client!au", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!au", name = "b", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(II)V")
	public Class21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static176.method2699(arg0, arg1);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anInt384 = local20;
			this.anIntArrayArray5 = new int[local20][14];
			this.anInt382 = local24;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray5[local37];
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

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)I")
	public int method300(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray5 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt382 / (long) this.anInt384);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I[B)[B")
	public byte[] method304(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray5 != null) {
			@Pc(23) int local23 = (int) ((long) arg0.length * (long) this.anInt382 / (long) this.anInt384) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) byte local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray5[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local28 + local45] += local38 * local43[local45];
				}
				local30 += this.anInt382;
				@Pc(77) int local77 = local30 / this.anInt384;
				local30 -= this.anInt384 * local77;
				local28 += local77;
			}
			arg0 = new byte[local23];
			for (@Pc(102) int local102 = 0; local102 < local23; local102++) {
				@Pc(112) int local112 = local26[local102] + 32768 >> 16;
				if (local112 < -128) {
					arg0[local102] = -128;
				} else if (local112 <= 127) {
					arg0[local102] = (byte) local112;
				} else {
					arg0[local102] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(II)I")
	public int method305(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray5 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt382 / (long) this.anInt384) + 6;
		}
		return arg0;
	}
}

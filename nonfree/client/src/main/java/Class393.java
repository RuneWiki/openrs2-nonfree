import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class393 {

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "I")
	private int anInt10810;

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
	private int anInt10805;

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(II)V")
	public Class393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static576.method8275(arg0, arg1);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anInt10810 = local20;
			this.anInt10805 = local24;
			this.anIntArrayArray60 = new int[local20][14];
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray60[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(81) double local81 = (double) local24 / (double) local20;
				while (local60 < local70) {
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

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I[B)[B")
	public byte[] method9298(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray60 != null) {
			@Pc(29) int local29 = (int) ((long) this.anInt10805 * (long) arg0.length / (long) this.anInt10810) + 14;
			@Pc(32) int[] local32 = new int[local29];
			@Pc(34) int local34 = 0;
			@Pc(36) int local36 = 0;
			for (@Pc(38) int local38 = 0; local38 < arg0.length; local38++) {
				@Pc(44) byte local44 = arg0[local38];
				@Pc(49) int[] local49 = this.anIntArrayArray60[local36];
				for (@Pc(51) int local51 = 0; local51 < 14; local51++) {
					local32[local51 + local34] += local49[local51] * local44;
				}
				local36 += this.anInt10805;
				@Pc(84) int local84 = local36 / this.anInt10810;
				local34 += local84;
				local36 -= local84 * this.anInt10810;
			}
			arg0 = new byte[local29];
			for (@Pc(111) int local111 = 0; local111 < local29; local111++) {
				@Pc(123) int local123 = local32[local111] + 32768 >> 16;
				if (local123 < -128) {
					arg0[local111] = -128;
				} else if (local123 > 127) {
					arg0[local111] = 127;
				} else {
					arg0[local111] = (byte) local123;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)I")
	public int method9300(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray60 != null) {
			arg0 = (int) ((long) this.anInt10805 * (long) arg0 / (long) this.anInt10810) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I[S)[S")
	public short[] method9302(@OriginalArg(1) short[] arg0) {
		if (this.anIntArrayArray60 != null) {
			@Pc(30) int local30 = (int) ((long) this.anInt10805 * (long) arg0.length / (long) this.anInt10810) + 14;
			@Pc(33) int[] local33 = new int[local30];
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = 0;
			for (@Pc(39) int local39 = 0; local39 < arg0.length; local39++) {
				@Pc(45) short local45 = arg0[local39];
				@Pc(50) int[] local50 = this.anIntArrayArray60[local37];
				for (@Pc(52) int local52 = 0; local52 < 14; local52++) {
					local33[local52 + local35] += local45 * local50[local52] >> 2;
				}
				local37 += this.anInt10805;
				@Pc(85) int local85 = local37 / this.anInt10810;
				local37 -= this.anInt10810 * local85;
				local35 += local85;
			}
			arg0 = new short[local30];
			for (@Pc(112) int local112 = 0; local112 < local30; local112++) {
				@Pc(124) int local124 = local33[local112] + 8192 >> 14;
				if (local124 < -32768) {
					arg0[local112] = -32768;
				} else if (local124 > 32767) {
					arg0[local112] = 32767;
				} else {
					arg0[local112] = (short) local124;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BI)I")
	public int method9303(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray60 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt10805 / (long) this.anInt10810);
		}
		return arg0;
	}
}

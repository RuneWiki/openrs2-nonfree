import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class276 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
	private int anInt7665;

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
	private int anInt7668;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(II)V")
	public Class276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static144.method2598(arg1, arg0);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anIntArrayArray40 = new int[local16][14];
			this.anInt7665 = local20;
			this.anInt7668 = local16;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray40[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local48 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				@Pc(79) double local79 = (double) local20 / (double) local16;
				while (local66 > local56) {
					@Pc(89) double local89 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(91) double local91 = local79;
					if (local89 < -1.0E-4D || local89 > 1.0E-4D) {
						local91 = local79 * (Math.sin(local89) / local89);
					}
					local91 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local91 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[S)[S")
	public short[] method6477(@OriginalArg(1) short[] arg0) {
		if (this.anIntArrayArray40 != null) {
			@Pc(24) int local24 = (int) ((long) this.anInt7665 * (long) arg0.length / (long) this.anInt7668) + 14;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(29) int local29 = 0;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
				@Pc(39) short local39 = arg0[local33];
				@Pc(44) int[] local44 = this.anIntArrayArray40[local31];
				for (@Pc(46) int local46 = 0; local46 < 14; local46++) {
					local27[local29 + local46] += local39 * local44[local46] >> 2;
				}
				local31 += this.anInt7665;
				@Pc(80) int local80 = local31 / this.anInt7668;
				local29 += local80;
				local31 -= this.anInt7668 * local80;
			}
			arg0 = new short[local24];
			for (@Pc(101) int local101 = 0; local101 < local24; local101++) {
				@Pc(111) int local111 = local27[local101] + 8192 >> 14;
				if (local111 < -32768) {
					arg0[local101] = -32768;
				} else if (local111 > 32767) {
					arg0[local101] = 32767;
				} else {
					arg0[local101] = (short) local111;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I")
	public int method6478(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray40 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt7665 / (long) this.anInt7668) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)I")
	public int method6479(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray40 != null) {
			arg0 = (int) ((long) this.anInt7665 * (long) arg0 / (long) this.anInt7668);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "([BB)[B")
	public byte[] method6480(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray40 != null) {
			@Pc(19) int local19 = (int) ((long) this.anInt7665 * (long) arg0.length / (long) this.anInt7668) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray40[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local41 + local24] += local39[local41] * local34;
				}
				local26 += this.anInt7665;
				@Pc(70) int local70 = local26 / this.anInt7668;
				local24 += local70;
				local26 -= this.anInt7668 * local70;
			}
			arg0 = new byte[local19];
			for (@Pc(95) int local95 = 0; local95 < local19; local95++) {
				@Pc(105) int local105 = local22[local95] + 32768 >> 16;
				if (local105 < -128) {
					arg0[local95] = -128;
				} else if (local105 <= 127) {
					arg0[local95] = (byte) local105;
				} else {
					arg0[local95] = 127;
				}
			}
		}
		return arg0;
	}
}

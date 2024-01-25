import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class269 {

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
	private int anInt8016;

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
	private int anInt8018;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(II)V")
	public Class269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static401.method6612(arg1, arg0);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anInt8016 = local20;
			this.anIntArrayArray36 = new int[local20][14];
			this.anInt8018 = local16;
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray36[local33];
				@Pc(48) double local48 = (double) local33 / (double) local20 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local48 + 7.0D);
				if (local69 > 14) {
					local69 = 14;
				}
				@Pc(82) double local82 = (double) local16 / (double) local20;
				while (local69 > local56) {
					@Pc(91) double local91 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(93) double local93 = local82;
					if (local91 < -1.0E-4D || local91 > 1.0E-4D) {
						local93 = local82 * (Math.sin(local91) / local91);
					}
					local93 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local93 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z[B)[B")
	public byte[] method7160(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray36 != null) {
			@Pc(28) int local28 = (int) ((long) arg0.length * (long) this.anInt8018 / (long) this.anInt8016) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray36[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local50 + local33] += local48[local50] * local43;
				}
				local35 += this.anInt8018;
				@Pc(79) int local79 = local35 / this.anInt8016;
				local35 -= this.anInt8016 * local79;
				local33 += local79;
			}
			arg0 = new byte[local28];
			for (@Pc(104) int local104 = 0; local104 < local28; local104++) {
				@Pc(114) int local114 = local31[local104] + 32768 >> 16;
				if (local114 < -128) {
					arg0[local104] = -128;
				} else if (local114 > 127) {
					arg0[local104] = 127;
				} else {
					arg0[local104] = (byte) local114;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(BI)I")
	public int method7162(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray36 != null) {
			arg0 = (int) ((long) this.anInt8018 * (long) arg0 / (long) this.anInt8016);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I[S)[S")
	public short[] method7163(@OriginalArg(1) short[] arg0) {
		if (this.anIntArrayArray36 != null) {
			@Pc(23) int local23 = (int) ((long) arg0.length * (long) this.anInt8018 / (long) this.anInt8016) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) short local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray36[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local28 + local45] += local43[local45] * local38 >> 2;
				}
				local30 += this.anInt8018;
				@Pc(77) int local77 = local30 / this.anInt8016;
				local30 -= local77 * this.anInt8016;
				local28 += local77;
			}
			arg0 = new short[local23];
			for (@Pc(102) int local102 = 0; local102 < local23; local102++) {
				@Pc(112) int local112 = local26[local102] + 8192 >> 14;
				if (local112 < -32768) {
					arg0[local102] = -32768;
				} else if (local112 > 32767) {
					arg0[local102] = 32767;
				} else {
					arg0[local102] = (short) local112;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)I")
	public int method7164(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray36 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt8018 / (long) this.anInt8016) + 6;
		}
		return arg0;
	}
}

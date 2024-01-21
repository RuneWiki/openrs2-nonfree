import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class9 {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "I")
	private int anInt296;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!be", name = "r", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(II)V")
	public Class9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static23.method879(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			this.anInt296 = local20;
			@Pc(27) int local27 = arg0 / local16;
			this.anIntArrayArray2 = new int[local27][14];
			this.anInt303 = local27;
			for (@Pc(37) int local37 = 0; local37 < local27; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray2[local37];
				@Pc(52) double local52 = (double) local37 / (double) local27 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(83) double local83 = (double) local20 / (double) local27;
				while (local70 > local60) {
					@Pc(87) double local87 = local83;
					@Pc(94) double local94 = ((double) local60 - local52) * 3.141592653589793D;
					if (local94 < -1.0E-4D || local94 > 1.0E-4D) {
						local87 = local83 * (Math.sin(local94) / local94);
					}
					local87 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local87 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([BI)[B")
	public byte[] method175(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray2 != null) {
			@Pc(26) int local26 = (int) ((long) this.anInt296 * (long) arg0.length / (long) this.anInt303) + 14;
			@Pc(29) int[] local29 = new int[local26];
			@Pc(31) int local31 = 0;
			@Pc(33) int local33 = 0;
			for (@Pc(35) int local35 = 0; local35 < arg0.length; local35++) {
				@Pc(42) int[] local42 = this.anIntArrayArray2[local31];
				@Pc(46) byte local46 = arg0[local35];
				for (@Pc(48) int local48 = 0; local48 < 14; local48++) {
					local29[local48 + local33] += local46 * local42[local48];
				}
				local31 += this.anInt296;
				@Pc(77) int local77 = local31 / this.anInt303;
				local31 -= local77 * this.anInt303;
				local33 += local77;
			}
			arg0 = new byte[local26];
			for (@Pc(102) int local102 = 0; local102 < local26; local102++) {
				@Pc(112) int local112 = local29[local102] + 32768 >> 16;
				if (local112 < -128) {
					arg0[local102] = -128;
				} else if (local112 > 127) {
					arg0[local102] = 127;
				} else {
					arg0[local102] = (byte) local112;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)I")
	public int method176(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray2 != null) {
			arg0 = (int) ((long) this.anInt296 * (long) arg0 / (long) this.anInt303);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(II)I")
	public int method178(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray2 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt296 / (long) this.anInt303) + 6;
		}
		return arg0;
	}
}

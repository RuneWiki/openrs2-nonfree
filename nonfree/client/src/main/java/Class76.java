import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class76 {

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
	private int anInt1954;

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
	private int anInt1952;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(II)V")
	public Class76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static271.method4258(arg0, arg1);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anIntArrayArray9 = new int[local20][14];
			this.anInt1954 = local20;
			this.anInt1952 = local16;
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray9[local33];
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
				while (local56 < local69) {
					@Pc(92) double local92 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(94) double local94 = local82;
					if (local92 < -1.0E-4D || local92 > 1.0E-4D) {
						local94 = local82 * (Math.sin(local92) / local92);
					}
					local94 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local94 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)I")
	public int method1782(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray9 != null) {
			arg0 = (int) ((long) this.anInt1952 * (long) arg0 / (long) this.anInt1954) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)I")
	public int method1783(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray9 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1952 / (long) this.anInt1954);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "([BI)[B")
	public byte[] method1785(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray9 != null) {
			@Pc(24) int local24 = (int) ((long) arg0.length * (long) this.anInt1952 / (long) this.anInt1954) + 14;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(29) int local29 = 0;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
				@Pc(39) byte local39 = arg0[local33];
				@Pc(44) int[] local44 = this.anIntArrayArray9[local31];
				for (@Pc(46) int local46 = 0; local46 < 14; local46++) {
					local27[local29 + local46] += local44[local46] * local39;
				}
				local31 += this.anInt1952;
				@Pc(77) int local77 = local31 / this.anInt1954;
				local29 += local77;
				local31 -= local77 * this.anInt1954;
			}
			arg0 = new byte[local24];
			for (@Pc(102) int local102 = 0; local102 < local24; local102++) {
				@Pc(112) int local112 = local27[local102] + 32768 >> 16;
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
}

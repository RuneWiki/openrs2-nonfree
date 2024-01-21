import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class4 {

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
	private int anInt152;

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(II)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static39.method779(arg0, arg1);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anIntArrayArray9 = new int[local20][14];
			this.anInt152 = local20;
			this.anInt160 = local24;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray9[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				@Pc(76) double local76 = (double) local24 / (double) local20;
				if (local70 > 14) {
					local70 = 14;
				}
				while (local70 > local60) {
					@Pc(93) double local93 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(95) double local95 = local76;
					if (local93 < -1.0E-4D || local93 > 1.0E-4D) {
						local95 = local76 * (Math.sin(local93) / local93);
					}
					local95 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local95 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)I")
	public int method177(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray9 != null) {
			arg0 = (int) ((long) this.anInt160 * (long) arg0 / (long) this.anInt152) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)I")
	public int method179(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray9 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt160 / (long) this.anInt152);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z[B)[B")
	public byte[] method180(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray9 != null) {
			@Pc(11) int local11 = 0;
			@Pc(26) int local26 = (int) ((long) this.anInt160 * (long) arg0.length / (long) this.anInt152) + 14;
			@Pc(28) int local28 = 0;
			@Pc(31) int[] local31 = new int[local26];
			for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
				@Pc(39) byte local39 = arg0[local33];
				@Pc(44) int[] local44 = this.anIntArrayArray9[local28];
				for (@Pc(46) int local46 = 0; local46 < 14; local46++) {
					local31[local11 + local46] += local39 * local44[local46];
				}
				local28 += this.anInt160;
				@Pc(76) int local76 = local28 / this.anInt152;
				local11 += local76;
				local28 -= local76 * this.anInt152;
			}
			arg0 = new byte[local26];
			for (@Pc(101) int local101 = 0; local101 < local26; local101++) {
				@Pc(111) int local111 = local31[local101] + 32768 >> 16;
				if (local111 < -128) {
					arg0[local101] = -128;
				} else if (local111 > 127) {
					arg0[local101] = 127;
				} else {
					arg0[local101] = (byte) local111;
				}
			}
		}
		return arg0;
	}
}

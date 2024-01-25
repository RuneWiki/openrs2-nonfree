import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class83 {

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
	private int anInt2415;

	@OriginalMember(owner = "client!gp", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
	private int anInt2416;

	static {
		new Class140("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(II)V")
	public Class83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static45.method855(arg0, arg1);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anInt2415 = local20;
			this.anIntArrayArray21 = new int[local20][14];
			this.anInt2416 = local16;
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray21[local33];
				@Pc(48) double local48 = (double) local33 / (double) local20 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local48 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				@Pc(77) double local77 = (double) local16 / (double) local20;
				while (local56 < local66) {
					@Pc(87) double local87 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(89) double local89 = local77;
					if (local87 < -1.0E-4D || local87 > 1.0E-4D) {
						local89 = local77 * (Math.sin(local87) / local87);
					}
					local89 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local89 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IB)I")
	public int method2239(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray21 != null) {
			arg0 = (int) ((long) this.anInt2416 * (long) arg0 / (long) this.anInt2415);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I[B)[B")
	public byte[] method2240(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray21 != null) {
			@Pc(31) int local31 = (int) ((long) this.anInt2416 * (long) arg0.length / (long) this.anInt2415) + 14;
			@Pc(34) int[] local34 = new int[local31];
			@Pc(36) int local36 = 0;
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < arg0.length; local40++) {
				@Pc(46) byte local46 = arg0[local40];
				@Pc(51) int[] local51 = this.anIntArrayArray21[local38];
				for (@Pc(53) int local53 = 0; local53 < 14; local53++) {
					local34[local36 + local53] += local46 * local51[local53];
				}
				local38 += this.anInt2416;
				@Pc(84) int local84 = local38 / this.anInt2415;
				local36 += local84;
				local38 -= this.anInt2415 * local84;
			}
			arg0 = new byte[local31];
			for (@Pc(109) int local109 = 0; local109 < local31; local109++) {
				@Pc(119) int local119 = local34[local109] + 32768 >> 16;
				if (local119 < -128) {
					arg0[local109] = -128;
				} else if (local119 > 127) {
					arg0[local109] = 127;
				} else {
					arg0[local109] = (byte) local119;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(IB)I")
	public int method2242(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray21 != null) {
			arg0 = (int) ((long) this.anInt2416 * (long) arg0 / (long) this.anInt2415) + 6;
		}
		return arg0;
	}
}

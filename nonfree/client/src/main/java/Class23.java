import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class23 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
	private int anInt676;

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
	private int anInt682;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(II)V")
	public Class23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static135.method2416(arg1, arg0);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anInt676 = local20;
			this.anInt682 = local16;
			this.anIntArrayArray3 = new int[local20][14];
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray3[local33];
				@Pc(48) double local48 = (double) local33 / (double) local20 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				@Pc(62) int local62 = (int) Math.ceil(local48 + 7.0D);
				@Pc(68) double local68 = (double) local16 / (double) local20;
				if (local56 < 0) {
					local56 = 0;
				}
				if (local62 > 14) {
					local62 = 14;
				}
				while (local62 > local56) {
					@Pc(81) double local81 = local68;
					@Pc(89) double local89 = ((double) local56 - local48) * 3.141592653589793D;
					if (local89 < -1.0E-4D || local89 > 1.0E-4D) {
						local81 = local68 * (Math.sin(local89) / local89);
					}
					local81 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local81 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[B)[B")
	public byte[] method528(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray3 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt682 / (long) this.anInt676) + 14;
			@Pc(21) int local21 = 0;
			@Pc(24) int[] local24 = new int[local19];
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray3[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local24[local41 + local21] += local34 * local39[local41];
				}
				local26 += this.anInt682;
				@Pc(70) int local70 = local26 / this.anInt676;
				local26 -= this.anInt676 * local70;
				local21 += local70;
			}
			arg0 = new byte[local19];
			for (@Pc(95) int local95 = 0; local95 < local19; local95++) {
				@Pc(105) int local105 = local24[local95] + 32768 >> 16;
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

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZI)I")
	public int method529(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray3 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt682 / (long) this.anInt676) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(ZI)I")
	public int method532(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray3 != null) {
			arg0 = (int) ((long) this.anInt682 * (long) arg0 / (long) this.anInt676);
		}
		return arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class23 {

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
	private int anInt684;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
	private int anInt676;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(II)V")
	public Class23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static14.method274(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			this.anIntArrayArray4 = new int[local16][14];
			this.anInt684 = local16;
			@Pc(28) int local28 = arg1 / local12;
			this.anInt676 = local28;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray4[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				@Pc(62) int local62 = (int) Math.ceil(local48 + 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(72) double local72 = (double) local28 / (double) local16;
				if (local62 > 14) {
					local62 = 14;
				}
				while (local62 > local56) {
					@Pc(89) double local89 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(91) double local91 = local72;
					if (local89 < -1.0E-4D || local89 > 1.0E-4D) {
						local91 = local72 * (Math.sin(local89) / local89);
					}
					local91 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local91 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([BB)[B")
	public byte[] method489(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray4 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt676 / (long) this.anInt684) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray4[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local24 + local41] += local34 * local39[local41];
				}
				local26 += this.anInt676;
				@Pc(70) int local70 = local26 / this.anInt684;
				local24 += local70;
				local26 -= local70 * this.anInt684;
			}
			arg0 = new byte[local19];
			for (@Pc(95) int local95 = 0; local95 < local19; local95++) {
				@Pc(105) int local105 = local22[local95] + 32768 >> 16;
				if (local105 < -128) {
					arg0[local95] = -128;
				} else if (local105 > 127) {
					arg0[local95] = 127;
				} else {
					arg0[local95] = (byte) local105;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I")
	public int method491(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray4 != null) {
			arg0 = (int) ((long) this.anInt676 * (long) arg0 / (long) this.anInt684);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)I")
	public int method493(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray4 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt676 / (long) this.anInt684) + 6;
		}
		return arg0;
	}
}

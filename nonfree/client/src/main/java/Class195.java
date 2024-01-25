import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class195 {

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
	private int anInt5041;

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
	private int anInt5043;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(II)V")
	public Class195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static386.method5464(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anIntArrayArray55 = new int[local24][14];
			this.anInt5041 = local24;
			this.anInt5043 = local20;
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray55[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(73) int local73 = (int) Math.ceil(local52 + 7.0D);
				if (local73 > 14) {
					local73 = 14;
				}
				@Pc(86) double local86 = (double) local20 / (double) local24;
				while (local60 < local73) {
					@Pc(95) double local95 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(97) double local97 = local86;
					if (local95 < -1.0E-4D || local95 > 1.0E-4D) {
						local97 = local86 * (Math.sin(local95) / local95);
					}
					local97 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local97 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)I")
	public int method4434(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray55 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt5043 / (long) this.anInt5041);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BI)I")
	public int method4435(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray55 != null) {
			arg0 = (int) ((long) this.anInt5043 * (long) arg0 / (long) this.anInt5041) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[B)[B")
	public byte[] method4436(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray55 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt5043 / (long) this.anInt5041) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray55[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local41 + local24] += local34 * local39[local41];
				}
				local26 += this.anInt5043;
				@Pc(72) int local72 = local26 / this.anInt5041;
				local26 -= this.anInt5041 * local72;
				local24 += local72;
			}
			arg0 = new byte[local19];
			for (@Pc(93) int local93 = 0; local93 < local19; local93++) {
				@Pc(103) int local103 = local22[local93] + 32768 >> 16;
				if (local103 < -128) {
					arg0[local93] = -128;
				} else if (local103 <= 127) {
					arg0[local93] = (byte) local103;
				} else {
					arg0[local93] = 127;
				}
			}
		}
		return arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class151 {

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
	private int anInt5051;

	@OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
	private int anInt5054;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(II)V")
	public Class151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(17) int local17 = Static165.method2527(arg1, arg0);
			@Pc(21) int local21 = arg1 / local17;
			@Pc(25) int local25 = arg0 / local17;
			this.anIntArrayArray42 = new int[local25][14];
			this.anInt5051 = local21;
			this.anInt5054 = local25;
			for (@Pc(38) int local38 = 0; local38 < local25; local38++) {
				@Pc(50) int[] local50 = this.anIntArrayArray42[local38];
				@Pc(58) double local58 = (double) local38 / (double) local25 + 6.0D;
				@Pc(66) int local66 = (int) Math.floor(local58 + 1.0D - 7.0D);
				@Pc(72) double local72 = (double) local21 / (double) local25;
				if (local66 < 0) {
					local66 = 0;
				}
				@Pc(86) int local86 = (int) Math.ceil(local58 + 7.0D);
				if (local86 > 14) {
					local86 = 14;
				}
				while (local86 > local66) {
					@Pc(96) double local96 = local72;
					@Pc(103) double local103 = ((double) local66 - local58) * 3.141592653589793D;
					if (-1.0E-4D > local103 || local103 > 1.0E-4D) {
						local96 = local72 * (Math.sin(local103) / local103);
					}
					local96 *= Math.cos(((double) local66 - local58) * 0.2243994752564138D) * 0.46D + 0.54D;
					local50[local66] = (int) Math.floor(local96 * 65536.0D + 0.5D);
					local66++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)I")
	public int method3876(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray42 != null) {
			arg0 = (int) ((long) this.anInt5051 * (long) arg0 / (long) this.anInt5054);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BI)I")
	public int method3879(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray42 != null) {
			arg0 = (int) ((long) this.anInt5051 * (long) arg0 / (long) this.anInt5054) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I[B)[B")
	public byte[] method3880(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray42 != null) {
			@Pc(34) int local34 = (int) ((long) this.anInt5051 * (long) arg0.length / (long) this.anInt5054) + 14;
			@Pc(37) int[] local37 = new int[local34];
			@Pc(39) int local39 = 0;
			@Pc(41) int local41 = 0;
			@Pc(43) int local43;
			for (local43 = 0; local43 < arg0.length; local43++) {
				@Pc(55) byte local55 = arg0[local43];
				@Pc(60) int[] local60 = this.anIntArrayArray42[local41];
				@Pc(62) int local62;
				for (local62 = 0; local62 < 14; local62++) {
					local37[local62 + local39] += local55 * local60[local62];
				}
				local41 += this.anInt5051;
				local62 = local41 / this.anInt5054;
				local41 -= this.anInt5054 * local62;
				local39 += local62;
			}
			arg0 = new byte[local34];
			for (local43 = 0; local43 < local34; local43++) {
				@Pc(121) int local121 = local37[local43] + 32768 >> 16;
				if (local121 < -128) {
					arg0[local43] = -128;
				} else if (local121 > 127) {
					arg0[local43] = 127;
				} else {
					arg0[local43] = (byte) local121;
				}
			}
		}
		return arg0;
	}
}

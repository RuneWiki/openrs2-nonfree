import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class18 {

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	private int anInt1092;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	private int anInt1084;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(II)V")
	public Class18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static119.method997(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anIntArrayArray17 = new int[local24][14];
			this.anInt1092 = local20;
			this.anInt1084 = local24;
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(47) double local47 = (double) local37 / (double) local24 + 6.0D;
				@Pc(52) int[] local52 = this.anIntArrayArray17[local37];
				@Pc(60) int local60 = (int) Math.floor(local47 + 1.0D - 7.0D);
				@Pc(66) int local66 = (int) Math.ceil(local47 + 7.0D);
				@Pc(72) double local72 = (double) local20 / (double) local24;
				if (local60 < 0) {
					local60 = 0;
				}
				if (local66 > 14) {
					local66 = 14;
				}
				while (local66 > local60) {
					@Pc(90) double local90 = local72;
					@Pc(97) double local97 = ((double) local60 - local47) * 3.141592653589793D;
					if (local97 < -1.0E-4D || local97 > 1.0E-4D) {
						local90 = local72 * (Math.sin(local97) / local97);
					}
					local90 *= Math.cos(((double) local60 - local47) * 0.2243994752564138D) * 0.46D + 0.54D;
					local52[local60] = (int) Math.floor(local90 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)I")
	public int method573(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray17 != null) {
			arg0 = (int) ((long) this.anInt1092 * (long) arg0 / (long) this.anInt1084) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I")
	public int method579(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray17 != null) {
			arg0 = (int) ((long) this.anInt1092 * (long) arg0 / (long) this.anInt1084);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([BI)[B")
	public byte[] method581(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray17 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt1092 / (long) this.anInt1084) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray17[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local24 + local41] += local39[local41] * local34;
				}
				local26 += this.anInt1092;
				@Pc(73) int local73 = local26 / this.anInt1084;
				local24 += local73;
				local26 -= local73 * this.anInt1084;
			}
			arg0 = new byte[local19];
			for (@Pc(98) int local98 = 0; local98 < local19; local98++) {
				@Pc(108) int local108 = local22[local98] + 32768 >> 16;
				if (local108 < -128) {
					arg0[local98] = -128;
				} else if (local108 <= 127) {
					arg0[local98] = (byte) local108;
				} else {
					arg0[local98] = 127;
				}
			}
		}
		return arg0;
	}
}

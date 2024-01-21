import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class88 {

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
	private int anInt3541;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
	private int anInt3538;

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(II)V")
	public Class88(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static188.method2859(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anInt3541 = local20;
			this.anInt3538 = local24;
			this.anIntArrayArray25 = new int[local24][14];
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray25[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				@Pc(66) double local66 = (double) local20 / (double) local24;
				@Pc(72) int local72 = (int) Math.ceil(local52 + 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				if (local72 > 14) {
					local72 = 14;
				}
				while (local72 > local60) {
					@Pc(88) double local88 = local66;
					@Pc(96) double local96 = ((double) local60 - local52) * 3.141592653589793D;
					if (local96 < -1.0E-4D || local96 > 1.0E-4D) {
						local88 = local66 * (Math.sin(local96) / local96);
					}
					local88 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local88 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
	public int method2658(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray25 != null) {
			arg0 = (int) ((long) this.anInt3541 * (long) arg0 / (long) this.anInt3538);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)I")
	public int method2659(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray25 != null) {
			arg0 = (int) ((long) this.anInt3541 * (long) arg0 / (long) this.anInt3538) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "([BI)[B")
	public byte[] method2660(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray25 != null) {
			@Pc(24) int local24 = (int) ((long) this.anInt3541 * (long) arg0.length / (long) this.anInt3538) + 14;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(29) int local29 = 0;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
				@Pc(39) byte local39 = arg0[local33];
				@Pc(44) int[] local44 = this.anIntArrayArray25[local31];
				for (@Pc(46) int local46 = 0; local46 < 14; local46++) {
					local27[local46 + local29] += local39 * local44[local46];
				}
				local31 += this.anInt3541;
				@Pc(77) int local77 = local31 / this.anInt3538;
				local31 -= this.anInt3538 * local77;
				local29 += local77;
			}
			arg0 = new byte[local24];
			for (@Pc(98) int local98 = 0; local98 < local24; local98++) {
				@Pc(108) int local108 = local27[local98] + 32768 >> 16;
				if (local108 < -128) {
					arg0[local98] = -128;
				} else if (local108 > 127) {
					arg0[local98] = 127;
				} else {
					arg0[local98] = (byte) local108;
				}
			}
		}
		return arg0;
	}
}

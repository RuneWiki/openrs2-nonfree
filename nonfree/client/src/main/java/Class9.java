import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class9 {

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
	private int anInt240;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(II)V")
	public Class9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static10.method188(arg0, arg1);
			@Pc(16) int local16 = arg1 / local12;
			this.anInt237 = local16;
			@Pc(23) int local23 = arg0 / local12;
			this.anIntArrayArray3 = new int[local23][14];
			this.anInt240 = local23;
			for (@Pc(33) int local33 = 0; local33 < local23; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray3[local33];
				@Pc(46) double local46 = (double) local16 / (double) local23;
				@Pc(54) double local54 = (double) local33 / (double) local23 + 6.0D;
				@Pc(62) int local62 = (int) Math.floor(local54 + 1.0D - 7.0D);
				if (local62 < 0) {
					local62 = 0;
				}
				@Pc(75) int local75 = (int) Math.ceil(local54 + 7.0D);
				if (local75 > 14) {
					local75 = 14;
				}
				while (local62 < local75) {
					@Pc(92) double local92 = ((double) local62 - local54) * 3.141592653589793D;
					@Pc(94) double local94 = local46;
					if (local92 < -1.0E-4D || local92 > 1.0E-4D) {
						local94 = local46 * (Math.sin(local92) / local92);
					}
					local94 *= Math.cos(((double) local62 - local54) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local62] = (int) Math.floor(local94 * 65536.0D + 0.5D);
					local62++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)I")
	public int method190(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray3 != null) {
			arg0 = (int) ((long) this.anInt237 * (long) arg0 / (long) this.anInt240) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)I")
	public int method194(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray3 != null) {
			arg0 = (int) ((long) this.anInt237 * (long) arg0 / (long) this.anInt240);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([BI)[B")
	public byte[] method195(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray3 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt237 / (long) this.anInt240) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(35) int[] local35 = this.anIntArrayArray3[local26];
				@Pc(39) byte local39 = arg0[local28];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local41 + local24] += local35[local41] * local39;
				}
				local26 += this.anInt237;
				@Pc(72) int local72 = local26 / this.anInt240;
				local26 -= this.anInt240 * local72;
				local24 += local72;
			}
			arg0 = new byte[local19];
			for (@Pc(97) int local97 = 0; local97 < local19; local97++) {
				@Pc(107) int local107 = local22[local97] + 32768 >> 16;
				if (local107 < -128) {
					arg0[local97] = -128;
				} else if (local107 > 127) {
					arg0[local97] = 127;
				} else {
					arg0[local97] = (byte) local107;
				}
			}
		}
		return arg0;
	}
}

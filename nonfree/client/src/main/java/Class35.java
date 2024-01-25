import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class35 {

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
	private int anInt673;

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
	private int anInt675;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(II)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static294.method3907(arg1, arg0);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anInt673 = local20;
			this.anInt675 = local16;
			this.anIntArrayArray13 = new int[local16][14];
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray13[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local48 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				@Pc(79) double local79 = (double) local20 / (double) local16;
				while (local56 < local66) {
					@Pc(88) double local88 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(90) double local90 = local79;
					if (local88 < -1.0E-4D || local88 > 1.0E-4D) {
						local90 = local79 * (Math.sin(local88) / local88);
					}
					local90 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local90 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)I")
	public int method630(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray13 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt673 / (long) this.anInt675) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([BI)[B")
	public byte[] method631(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray13 != null) {
			@Pc(19) int local19 = (int) ((long) this.anInt673 * (long) arg0.length / (long) this.anInt675) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray13[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local24 + local41] += local39[local41] * local34;
				}
				local26 += this.anInt673;
				@Pc(70) int local70 = local26 / this.anInt675;
				local26 -= this.anInt675 * local70;
				local24 += local70;
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

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)I")
	public int method633(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray13 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt673 / (long) this.anInt675);
		}
		return arg0;
	}
}

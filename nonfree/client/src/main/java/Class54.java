import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class54 {

	@OriginalMember(owner = "client!q", name = "p", descriptor = "I")
	private int anInt2078;

	@OriginalMember(owner = "client!q", name = "o", descriptor = "I")
	private int anInt2077;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(II)V")
	public Class54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static35.method724(arg1, arg0);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anInt2078 = local16;
			this.anInt2077 = local20;
			this.anIntArrayArray24 = new int[local16][14];
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray24[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) double local66 = (double) local20 / (double) local16;
				@Pc(72) int local72 = (int) Math.ceil(local48 + 7.0D);
				if (local72 > 14) {
					local72 = 14;
				}
				while (local56 < local72) {
					@Pc(88) double local88 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(90) double local90 = local66;
					if (local88 < -1.0E-4D || local88 > 1.0E-4D) {
						local90 = local66 * (Math.sin(local88) / local88);
					}
					local90 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local90 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)I")
	public int method1495(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray24 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2077 / (long) this.anInt2078) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([BZ)[B")
	public byte[] method1496(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray24 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt2077 / (long) this.anInt2078) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray24[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local24 + local41] += local39[local41] * local34;
				}
				local26 += this.anInt2077;
				@Pc(73) int local73 = local26 / this.anInt2078;
				local26 -= local73 * this.anInt2078;
				local24 += local73;
			}
			arg0 = new byte[local19];
			for (@Pc(94) int local94 = 0; local94 < local19; local94++) {
				@Pc(104) int local104 = local22[local94] + 32768 >> 16;
				if (local104 < -128) {
					arg0[local94] = -128;
				} else if (local104 <= 127) {
					arg0[local94] = (byte) local104;
				} else {
					arg0[local94] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(II)I")
	public int method1498(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray24 != null) {
			arg0 = (int) ((long) this.anInt2077 * (long) arg0 / (long) this.anInt2078);
		}
		return arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ifa")
public final class Class151 {

	@OriginalMember(owner = "client!ifa", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "I")
	private int anInt4647;

	@OriginalMember(owner = "client!ifa", name = "f", descriptor = "I")
	private int anInt4648;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(II)V")
	public Class151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static116.method2336(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anIntArrayArray31 = new int[local16][14];
			this.anInt4647 = local20;
			this.anInt4648 = local16;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray31[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local48 + 7.0D);
				if (local69 > 14) {
					local69 = 14;
				}
				@Pc(82) double local82 = (double) local20 / (double) local16;
				while (local56 < local69) {
					@Pc(91) double local91 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(93) double local93 = local82;
					if (local91 < -1.0E-4D || local91 > 1.0E-4D) {
						local93 = local82 * (Math.sin(local91) / local91);
					}
					local93 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local93 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B[B)[B")
	public byte[] method3994(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray31 != null) {
			@Pc(25) int local25 = (int) ((long) arg0.length * (long) this.anInt4647 / (long) this.anInt4648) + 14;
			@Pc(28) int[] local28 = new int[local25];
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = 0; local34 < arg0.length; local34++) {
				@Pc(40) byte local40 = arg0[local34];
				@Pc(45) int[] local45 = this.anIntArrayArray31[local32];
				for (@Pc(47) int local47 = 0; local47 < 14; local47++) {
					local28[local47 + local30] += local45[local47] * local40;
				}
				local32 += this.anInt4647;
				@Pc(78) int local78 = local32 / this.anInt4648;
				local30 += local78;
				local32 -= local78 * this.anInt4648;
			}
			arg0 = new byte[local25];
			for (@Pc(103) int local103 = 0; local103 < local25; local103++) {
				@Pc(113) int local113 = local28[local103] + 32768 >> 16;
				if (local113 < -128) {
					arg0[local103] = -128;
				} else if (local113 <= 127) {
					arg0[local103] = (byte) local113;
				} else {
					arg0[local103] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(II)I")
	public int method3996(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray31 != null) {
			arg0 = (int) ((long) this.anInt4647 * (long) arg0 / (long) this.anInt4648) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZI)I")
	public int method3998(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray31 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt4647 / (long) this.anInt4648);
		}
		return arg0;
	}
}

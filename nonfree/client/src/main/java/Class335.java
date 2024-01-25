import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class335 {

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
	private int anInt8794;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
	private int anInt8799;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(II)V")
	public Class335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static284.method4225(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anIntArrayArray59 = new int[local16][14];
			this.anInt8794 = local16;
			this.anInt8799 = local20;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray59[local33];
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
				while (local66 > local56) {
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

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I")
	public int method7346(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray59 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt8799 / (long) this.anInt8794);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)I")
	public int method7348(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray59 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt8799 / (long) this.anInt8794) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z[B)[B")
	public byte[] method7349(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray59 != null) {
			@Pc(28) int local28 = (int) ((long) arg0.length * (long) this.anInt8799 / (long) this.anInt8794) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray59[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local33 + local50] += local48[local50] * local43;
				}
				local35 += this.anInt8799;
				@Pc(82) int local82 = local35 / this.anInt8794;
				local35 -= this.anInt8794 * local82;
				local33 += local82;
			}
			arg0 = new byte[local28];
			for (@Pc(103) int local103 = 0; local103 < local28; local103++) {
				@Pc(113) int local113 = local31[local103] + 32768 >> 16;
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
}

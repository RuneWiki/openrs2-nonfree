import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class342 {

	@OriginalMember(owner = "client!uw", name = "d", descriptor = "I")
	private int anInt9174;

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray75;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "I")
	private int anInt9172;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(II)V")
	public Class342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static116.method2403(arg0, arg1);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anInt9174 = local20;
			this.anIntArrayArray75 = new int[local20][14];
			this.anInt9172 = local16;
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray75[local33];
				@Pc(48) double local48 = (double) local33 / (double) local20 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local48 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				@Pc(79) double local79 = (double) local16 / (double) local20;
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

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(II)I")
	public int method7548(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray75 != null) {
			arg0 = (int) ((long) this.anInt9172 * (long) arg0 / (long) this.anInt9174);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(II)I")
	public int method7550(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray75 != null) {
			arg0 = (int) ((long) this.anInt9172 * (long) arg0 / (long) this.anInt9174) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "([BI)[B")
	public byte[] method7551(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray75 != null) {
			@Pc(28) int local28 = (int) ((long) this.anInt9172 * (long) arg0.length / (long) this.anInt9174) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray75[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local33 + local50] += local48[local50] * local43;
				}
				local35 += this.anInt9172;
				@Pc(80) int local80 = local35 / this.anInt9174;
				local35 -= local80 * this.anInt9174;
				local33 += local80;
			}
			arg0 = new byte[local28];
			for (@Pc(101) int local101 = 0; local101 < local28; local101++) {
				@Pc(111) int local111 = local31[local101] + 32768 >> 16;
				if (local111 < -128) {
					arg0[local101] = -128;
				} else if (local111 <= 127) {
					arg0[local101] = (byte) local111;
				} else {
					arg0[local101] = 127;
				}
			}
		}
		return arg0;
	}
}

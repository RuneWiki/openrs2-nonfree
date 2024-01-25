import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public final class Class222 {

	@OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
	private int anInt6977;

	@OriginalMember(owner = "client!nba", name = "j", descriptor = "I")
	private int anInt6980;

	@OriginalMember(owner = "client!nba", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(II)V")
	public Class222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static484.method7403(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anInt6977 = local20;
			this.anInt6980 = local16;
			this.anIntArrayArray57 = new int[local16][14];
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray57[local33];
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

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)I")
	public int method5808(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray57 != null) {
			arg0 = (int) ((long) this.anInt6977 * (long) arg0 / (long) this.anInt6980) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(II)I")
	public int method5811(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray57 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt6977 / (long) this.anInt6980);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "([BB)[B")
	public byte[] method5813(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray57 != null) {
			@Pc(21) int local21 = (int) ((long) this.anInt6977 * (long) arg0.length / (long) this.anInt6980) + 14;
			@Pc(24) int[] local24 = new int[local21];
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			for (@Pc(30) int local30 = 0; local30 < arg0.length; local30++) {
				@Pc(35) byte local35 = arg0[local30];
				@Pc(40) int[] local40 = this.anIntArrayArray57[local28];
				for (@Pc(42) int local42 = 0; local42 < 14; local42++) {
					local24[local42 + local26] += local35 * local40[local42];
				}
				local28 += this.anInt6977;
				@Pc(72) int local72 = local28 / this.anInt6980;
				local26 += local72;
				local28 -= this.anInt6980 * local72;
			}
			arg0 = new byte[local21];
			for (@Pc(93) int local93 = 0; local93 < local21; local93++) {
				@Pc(102) int local102 = local24[local93] + 32768 >> 16;
				if (local102 < -128) {
					arg0[local93] = -128;
				} else if (local102 > 127) {
					arg0[local93] = 127;
				} else {
					arg0[local93] = (byte) local102;
				}
			}
		}
		return arg0;
	}
}

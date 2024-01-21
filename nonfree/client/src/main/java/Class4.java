import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class4 {

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
	private int anInt127;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
	private int anInt132;

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(II)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static164.method2805(arg1, arg0);
			@Pc(16) int local16 = arg0 / local12;
			this.anInt127 = local16;
			@Pc(23) int local23 = arg1 / local12;
			this.anInt132 = local23;
			this.anIntArrayArray1 = new int[local16][14];
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray1[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) double local66 = (double) local23 / (double) local16;
				@Pc(72) int local72 = (int) Math.ceil(local48 + 7.0D);
				if (local72 > 14) {
					local72 = 14;
				}
				while (local56 < local72) {
					@Pc(87) double local87 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(89) double local89 = local66;
					if (local87 < -1.0E-4D || local87 > 1.0E-4D) {
						local89 = local66 * (Math.sin(local87) / local87);
					}
					local89 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local89 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)I")
	public int method102(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray1 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt132 / (long) this.anInt127) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI)I")
	public int method105(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray1 != null) {
			arg0 = (int) ((long) this.anInt132 * (long) arg0 / (long) this.anInt127);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([BB)[B")
	public byte[] method107(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray1 != null) {
			@Pc(28) int local28 = (int) ((long) arg0.length * (long) this.anInt132 / (long) this.anInt127) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray1[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local33 + local50] += local43 * local48[local50];
				}
				local35 += this.anInt132;
				@Pc(80) int local80 = local35 / this.anInt127;
				local33 += local80;
				local35 -= local80 * this.anInt127;
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

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class17 {

	@OriginalMember(owner = "client!av", name = "i", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!av", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(II)V")
	public Class17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static17.method270(arg0, arg1);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anInt322 = local16;
			this.anIntArrayArray6 = new int[local20][14];
			this.anInt318 = local20;
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray6[local33];
				@Pc(48) double local48 = (double) local33 / (double) local20 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local48 + 7.0D);
				if (local69 > 14) {
					local69 = 14;
				}
				@Pc(80) double local80 = (double) local16 / (double) local20;
				while (local69 > local56) {
					@Pc(90) double local90 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(92) double local92 = local80;
					if (local90 < -1.0E-4D || local90 > 1.0E-4D) {
						local92 = local80 * (Math.sin(local90) / local90);
					}
					local92 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local92 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(II)I")
	public int method293(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray6 != null) {
			arg0 = (int) ((long) this.anInt322 * (long) arg0 / (long) this.anInt318);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IB)I")
	public int method295(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray6 != null) {
			arg0 = (int) ((long) this.anInt322 * (long) arg0 / (long) this.anInt318) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B[B)[B")
	public byte[] method296(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray6 != null) {
			@Pc(28) int local28 = (int) ((long) this.anInt322 * (long) arg0.length / (long) this.anInt318) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray6[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local50 + local33] += local48[local50] * local43;
				}
				local35 += this.anInt322;
				@Pc(81) int local81 = local35 / this.anInt318;
				local33 += local81;
				local35 -= this.anInt318 * local81;
			}
			arg0 = new byte[local28];
			for (@Pc(106) int local106 = 0; local106 < local28; local106++) {
				@Pc(116) int local116 = local31[local106] + 32768 >> 16;
				if (local116 < -128) {
					arg0[local106] = -128;
				} else if (local116 > 127) {
					arg0[local106] = 127;
				} else {
					arg0[local106] = (byte) local116;
				}
			}
		}
		return arg0;
	}
}

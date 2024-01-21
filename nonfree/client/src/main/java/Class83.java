import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class83 {

	@OriginalMember(owner = "client!w", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!w", name = "p", descriptor = "I")
	private int anInt4155;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "I")
	private int anInt4150;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(II)V")
	public Class83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static55.method1226(arg1, arg0);
			@Pc(16) int local16 = arg0 / local12;
			this.anIntArrayArray37 = new int[local16][14];
			this.anInt4155 = local16;
			@Pc(28) int local28 = arg1 / local12;
			this.anInt4150 = local28;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(43) double local43 = (double) local33 / (double) local16 + 6.0D;
				@Pc(48) int[] local48 = this.anIntArrayArray37[local33];
				@Pc(56) int local56 = (int) Math.floor(local43 + 1.0D - 7.0D);
				@Pc(62) double local62 = (double) local28 / (double) local16;
				@Pc(68) int local68 = (int) Math.ceil(local43 + 7.0D);
				if (local68 > 14) {
					local68 = 14;
				}
				if (local56 < 0) {
					local56 = 0;
				}
				while (local56 < local68) {
					@Pc(90) double local90 = ((double) local56 - local43) * 3.141592653589793D;
					@Pc(92) double local92 = local62;
					if (local90 < -1.0E-4D || local90 > 1.0E-4D) {
						local92 = local62 * (Math.sin(local90) / local90);
					}
					local92 *= Math.cos(((double) local56 - local43) * 0.2243994752564138D) * 0.46D + 0.54D;
					local48[local56] = (int) Math.floor(local92 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I")
	public int method3140(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray37 != null) {
			arg0 = (int) ((long) this.anInt4150 * (long) arg0 / (long) this.anInt4155) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(II)I")
	public int method3143(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray37 != null) {
			arg0 = (int) ((long) this.anInt4150 * (long) arg0 / (long) this.anInt4155);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([BI)[B")
	public byte[] method3147(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray37 != null) {
			@Pc(21) int local21 = (int) ((long) this.anInt4150 * (long) arg0.length / (long) this.anInt4155) + 14;
			@Pc(23) int local23 = 0;
			@Pc(25) int local25 = 0;
			@Pc(28) int[] local28 = new int[local21];
			for (@Pc(30) int local30 = 0; local30 < arg0.length; local30++) {
				@Pc(35) byte local35 = arg0[local30];
				@Pc(40) int[] local40 = this.anIntArrayArray37[local25];
				for (@Pc(42) int local42 = 0; local42 < 14; local42++) {
					local28[local23 + local42] += local40[local42] * local35;
				}
				local25 += this.anInt4150;
				@Pc(72) int local72 = local25 / this.anInt4155;
				local25 -= this.anInt4155 * local72;
				local23 += local72;
			}
			arg0 = new byte[local21];
			for (@Pc(93) int local93 = 0; local93 < local21; local93++) {
				@Pc(102) int local102 = local28[local93] + 32768 >> 16;
				if (local102 < -128) {
					arg0[local93] = -128;
				} else if (local102 <= 127) {
					arg0[local93] = (byte) local102;
				} else {
					arg0[local93] = 127;
				}
			}
		}
		return arg0;
	}
}

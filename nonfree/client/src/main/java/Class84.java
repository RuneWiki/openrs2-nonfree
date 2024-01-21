import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class84 {

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
	private int anInt4259;

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
	private int anInt4267;

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(II)V")
	public Class84(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static31.method771(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			this.anInt4259 = local20;
			@Pc(27) int local27 = arg0 / local16;
			this.anInt4267 = local27;
			this.anIntArrayArray27 = new int[local27][14];
			for (@Pc(37) int local37 = 0; local37 < local27; local37++) {
				@Pc(47) double local47 = (double) local37 / (double) local27 + 6.0D;
				@Pc(52) int[] local52 = this.anIntArrayArray27[local37];
				@Pc(60) int local60 = (int) Math.floor(local47 + 1.0D - 7.0D);
				@Pc(66) double local66 = (double) local20 / (double) local27;
				@Pc(72) int local72 = (int) Math.ceil(local47 + 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				if (local72 > 14) {
					local72 = 14;
				}
				while (local72 > local60) {
					@Pc(95) double local95 = ((double) local60 - local47) * 3.141592653589793D;
					@Pc(97) double local97 = local66;
					if (local95 < -1.0E-4D || local95 > 1.0E-4D) {
						local97 = local66 * (Math.sin(local95) / local95);
					}
					local97 *= Math.cos(((double) local60 - local47) * 0.2243994752564138D) * 0.46D + 0.54D;
					local52[local60] = (int) Math.floor(local97 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "([BI)[B")
	public byte[] method3270(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray27 != null) {
			@Pc(28) int local28 = (int) ((long) arg0.length * (long) this.anInt4259 / (long) this.anInt4267) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray27[local33];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local35 + local50] += local48[local50] * local43;
				}
				local33 += this.anInt4259;
				@Pc(81) int local81 = local33 / this.anInt4267;
				local33 -= this.anInt4267 * local81;
				local35 += local81;
			}
			arg0 = new byte[local28];
			for (@Pc(102) int local102 = 0; local102 < local28; local102++) {
				@Pc(112) int local112 = local31[local102] + 32768 >> 16;
				if (local112 < -128) {
					arg0[local102] = -128;
				} else if (local112 <= 127) {
					arg0[local102] = (byte) local112;
				} else {
					arg0[local102] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)I")
	public int method3271(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray27 != null) {
			arg0 = (int) ((long) this.anInt4259 * (long) arg0 / (long) this.anInt4267);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)I")
	public int method3273(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray27 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt4259 / (long) this.anInt4267) + 6;
		}
		return arg0;
	}
}

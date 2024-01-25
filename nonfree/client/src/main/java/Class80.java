import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class80 {

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
	private int anInt2067;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
	private int anInt2065;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(II)V")
	public Class80(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static444.method4103(arg1, arg0);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anInt2067 = local20;
			this.anInt2065 = local24;
			this.anIntArrayArray51 = new int[local20][14];
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray51[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(81) double local81 = (double) local24 / (double) local20;
				while (local70 > local60) {
					@Pc(90) double local90 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(92) double local92 = local81;
					if (local90 < -1.0E-4D || local90 > 1.0E-4D) {
						local92 = local81 * (Math.sin(local90) / local90);
					}
					local92 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local92 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)I")
	public int method1684(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray51 != null) {
			arg0 = (int) ((long) this.anInt2065 * (long) arg0 / (long) this.anInt2067) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([BI)[B")
	public byte[] method1686(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray51 != null) {
			@Pc(28) int local28 = (int) ((long) arg0.length * (long) this.anInt2065 / (long) this.anInt2067) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray51[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local50 + local33] += local43 * local48[local50];
				}
				local35 += this.anInt2065;
				@Pc(81) int local81 = local35 / this.anInt2067;
				local33 += local81;
				local35 -= this.anInt2067 * local81;
			}
			arg0 = new byte[local28];
			for (@Pc(102) int local102 = 0; local102 < local28; local102++) {
				@Pc(112) int local112 = local31[local102] + 32768 >> 16;
				if (local112 < -128) {
					arg0[local102] = -128;
				} else if (local112 > 127) {
					arg0[local102] = 127;
				} else {
					arg0[local102] = (byte) local112;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)I")
	public int method1689(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray51 != null) {
			arg0 = (int) ((long) this.anInt2065 * (long) arg0 / (long) this.anInt2067);
		}
		return arg0;
	}
}

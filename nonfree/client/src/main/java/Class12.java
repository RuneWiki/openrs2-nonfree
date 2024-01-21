import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class12 {

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
	private final int anInt466;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
	private final int anInt463;

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(II)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = Static44.method719(arg0, arg1);
		@Pc(12) int local12 = arg1 / local8;
		@Pc(16) int local16 = arg0 / local8;
		this.anInt466 = local16;
		this.anInt463 = local12;
		if (local12 != local16) {
			this.anIntArrayArray4 = new int[local16][14];
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(43) double local43 = (double) local33 / (double) local16 + 6.0D;
				@Pc(49) double local49 = (double) local12 / (double) local16;
				@Pc(54) int[] local54 = this.anIntArrayArray4[local33];
				@Pc(62) int local62 = (int) Math.floor(local43 + 1.0D - 7.0D);
				@Pc(68) int local68 = (int) Math.ceil(local43 + 7.0D);
				if (local68 > 14) {
					local68 = 14;
				}
				if (local62 < 0) {
					local62 = 0;
				}
				while (local62 < local68) {
					@Pc(81) double local81 = local49;
					@Pc(88) double local88 = ((double) local62 - local43) * 3.141592653589793D;
					if (local88 < -1.0E-4D || local88 > 1.0E-4D) {
						local81 = local49 * (Math.sin(local88) / local88);
					}
					local81 *= Math.cos(((double) local62 - local43) * 0.2243994752564138D) * 0.46D + 0.54D;
					local54[local62] = (int) Math.floor(local81 * 65536.0D + 0.5D);
					local62++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)I")
	public int method320(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray4 != null) {
			arg0 = this.anInt463 * arg0 / this.anInt466;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)I")
	public int method322(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray4 != null) {
			arg0 = this.anInt463 * arg0 / this.anInt466 + 7;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "([BI)[B")
	public byte[] method325(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray4 != null) {
			@Pc(15) int local15 = arg0.length * this.anInt463 / this.anInt466 + 14;
			@Pc(18) int[] local18 = new int[local15];
			@Pc(20) int local20 = 0;
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < arg0.length; local24++) {
				@Pc(30) byte local30 = arg0[local24];
				@Pc(35) int[] local35 = this.anIntArrayArray4[local22];
				for (@Pc(37) int local37 = 0; local37 < 14; local37++) {
					local18[local20 + local37] += local35[local37] * local30;
				}
				local22 += this.anInt463;
				@Pc(68) int local68 = local22 / this.anInt466;
				local20 += local68;
				local22 -= this.anInt466 * local68;
			}
			arg0 = new byte[local15];
			for (@Pc(89) int local89 = 0; local89 < local15; local89++) {
				@Pc(99) int local99 = local18[local89] + 32768 >> 16;
				if (local99 < -128) {
					arg0[local89] = -128;
				} else if (local99 <= 127) {
					arg0[local89] = (byte) local99;
				} else {
					arg0[local89] = 127;
				}
			}
		}
		return arg0;
	}
}

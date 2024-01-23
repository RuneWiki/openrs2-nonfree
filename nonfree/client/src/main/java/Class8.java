import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class8 {

	@OriginalMember(owner = "client!b", name = "o", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!b", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!b", name = "k", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(II)V")
	public Class8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static119.method1891(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			this.anInt244 = local20;
			@Pc(27) int local27 = arg0 / local16;
			this.anIntArrayArray1 = new int[local27][14];
			this.anInt242 = local27;
			for (@Pc(37) int local37 = 0; local37 < local27; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray1[local37];
				@Pc(52) double local52 = (double) local37 / (double) local27 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(81) double local81 = (double) local20 / (double) local27;
				while (local70 > local60) {
					@Pc(91) double local91 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(93) double local93 = local81;
					if (local91 < -1.0E-4D || local91 > 1.0E-4D) {
						local93 = local81 * (Math.sin(local91) / local91);
					}
					local93 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local93 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)I")
	public int method184(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray1 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt244 / (long) this.anInt242);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([BI)[B")
	public byte[] method185(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray1 != null) {
			@Pc(19) int local19 = (int) ((long) this.anInt244 * (long) arg0.length / (long) this.anInt242) + 14;
			@Pc(21) int local21 = 0;
			@Pc(24) int[] local24 = new int[local19];
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray1[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local24[local21 + local41] += local39[local41] * local34;
				}
				local26 += this.anInt244;
				@Pc(71) int local71 = local26 / this.anInt242;
				local21 += local71;
				local26 -= local71 * this.anInt242;
			}
			arg0 = new byte[local19];
			for (@Pc(96) int local96 = 0; local96 < local19; local96++) {
				@Pc(106) int local106 = local24[local96] + 32768 >> 16;
				if (local106 < -128) {
					arg0[local96] = -128;
				} else if (local106 <= 127) {
					arg0[local96] = (byte) local106;
				} else {
					arg0[local96] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)I")
	public int method186(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray1 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt244 / (long) this.anInt242) + 6;
		}
		return arg0;
	}
}

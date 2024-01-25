import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class63 {

	@OriginalMember(owner = "client!en", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!en", name = "e", descriptor = "I")
	private int anInt1393;

	@OriginalMember(owner = "client!en", name = "i", descriptor = "I")
	private int anInt1397;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(II)V")
	public Class63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static221.method3913(arg0, arg1);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anIntArrayArray49 = new int[local24][14];
			this.anInt1393 = local20;
			this.anInt1397 = local24;
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray49[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(73) int local73 = (int) Math.ceil(local52 + 7.0D);
				if (local73 > 14) {
					local73 = 14;
				}
				@Pc(86) double local86 = (double) local20 / (double) local24;
				while (local73 > local60) {
					@Pc(96) double local96 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(98) double local98 = local86;
					if (local96 < -1.0E-4D || local96 > 1.0E-4D) {
						local98 = local86 * (Math.sin(local96) / local96);
					}
					local98 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local98 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IB)I")
	public int method1310(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray49 != null) {
			arg0 = (int) ((long) this.anInt1393 * (long) arg0 / (long) this.anInt1397) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([BI)[B")
	public byte[] method1313(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray49 != null) {
			@Pc(19) int local19 = (int) ((long) this.anInt1393 * (long) arg0.length / (long) this.anInt1397) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray49[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local41 + local24] += local39[local41] * local34;
				}
				local26 += this.anInt1393;
				@Pc(70) int local70 = local26 / this.anInt1397;
				local24 += local70;
				local26 -= this.anInt1397 * local70;
			}
			arg0 = new byte[local19];
			for (@Pc(95) int local95 = 0; local95 < local19; local95++) {
				@Pc(105) int local105 = local22[local95] + 32768 >> 16;
				if (local105 < -128) {
					arg0[local95] = -128;
				} else if (local105 <= 127) {
					arg0[local95] = (byte) local105;
				} else {
					arg0[local95] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II)I")
	public int method1314(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray49 != null) {
			arg0 = (int) ((long) this.anInt1393 * (long) arg0 / (long) this.anInt1397);
		}
		return arg0;
	}
}

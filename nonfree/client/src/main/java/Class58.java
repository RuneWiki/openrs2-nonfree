import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class58 {

	@OriginalMember(owner = "client!li", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!li", name = "n", descriptor = "I")
	private int anInt2469;

	@OriginalMember(owner = "client!li", name = "j", descriptor = "I")
	private int anInt2468;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(II)V")
	public Class58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static82.method1177(arg1, arg0);
			@Pc(20) int local20 = arg0 / local16;
			this.anIntArrayArray16 = new int[local20][14];
			this.anInt2469 = local20;
			@Pc(32) int local32 = arg1 / local16;
			this.anInt2468 = local32;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray16[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				@Pc(76) double local76 = (double) local32 / (double) local20;
				if (local70 > 14) {
					local70 = 14;
				}
				while (local70 > local60) {
					@Pc(85) double local85 = local76;
					@Pc(93) double local93 = ((double) local60 - local52) * 3.141592653589793D;
					if (local93 < -1.0E-4D || local93 > 1.0E-4D) {
						local85 = local76 * (Math.sin(local93) / local93);
					}
					local85 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local85 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BI)I")
	public int method1749(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray16 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2468 / (long) this.anInt2469);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([BB)[B")
	public byte[] method1750(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray16 != null) {
			@Pc(27) int local27 = (int) ((long) this.anInt2468 * (long) arg0.length / (long) this.anInt2469) + 14;
			@Pc(30) int[] local30 = new int[local27];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
				@Pc(43) int[] local43 = this.anIntArrayArray16[local34];
				@Pc(47) byte local47 = arg0[local36];
				for (@Pc(49) int local49 = 0; local49 < 14; local49++) {
					local30[local49 + local32] += local47 * local43[local49];
				}
				local34 += this.anInt2468;
				@Pc(80) int local80 = local34 / this.anInt2469;
				local32 += local80;
				local34 -= this.anInt2469 * local80;
			}
			arg0 = new byte[local27];
			for (@Pc(101) int local101 = 0; local101 < local27; local101++) {
				@Pc(111) int local111 = local30[local101] + 32768 >> 16;
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

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)I")
	public int method1753(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray16 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2468 / (long) this.anInt2469) + 6;
		}
		return arg0;
	}
}

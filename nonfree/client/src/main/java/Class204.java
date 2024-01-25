import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class204 {

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray93;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
	private int anInt6368;

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
	private int anInt6366;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(II)V")
	public Class204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static267.method4559(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anIntArrayArray93 = new int[local24][14];
			this.anInt6368 = local24;
			this.anInt6366 = local20;
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray93[local37];
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
					@Pc(95) double local95 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(97) double local97 = local86;
					if (local95 < -1.0E-4D || local95 > 1.0E-4D) {
						local97 = local86 * (Math.sin(local95) / local95);
					}
					local97 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local97 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)I")
	public int method5669(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray93 != null) {
			arg0 = (int) ((long) this.anInt6366 * (long) arg0 / (long) this.anInt6368);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)I")
	public int method5670(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray93 != null) {
			arg0 = (int) ((long) this.anInt6366 * (long) arg0 / (long) this.anInt6368) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([BI)[B")
	public byte[] method5671(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray93 != null) {
			@Pc(27) int local27 = (int) ((long) this.anInt6366 * (long) arg0.length / (long) this.anInt6368) + 14;
			@Pc(30) int[] local30 = new int[local27];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
				@Pc(42) byte local42 = arg0[local36];
				@Pc(47) int[] local47 = this.anIntArrayArray93[local34];
				for (@Pc(49) int local49 = 0; local49 < 14; local49++) {
					local30[local32 + local49] += local42 * local47[local49];
				}
				local34 += this.anInt6366;
				@Pc(80) int local80 = local34 / this.anInt6368;
				local34 -= this.anInt6368 * local80;
				local32 += local80;
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
}

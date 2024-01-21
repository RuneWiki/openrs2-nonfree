import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class51 {

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	private int anInt1849;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
	private int anInt1846;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(II)V")
	public Class51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static78.method1123(arg1, arg0);
			@Pc(20) int local20 = arg0 / local16;
			this.anInt1849 = local20;
			this.anIntArrayArray16 = new int[local20][14];
			@Pc(32) int local32 = arg1 / local16;
			this.anInt1846 = local32;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray16[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(73) int local73 = (int) Math.ceil(local52 + 7.0D);
				@Pc(79) double local79 = (double) local32 / (double) local20;
				if (local73 > 14) {
					local73 = 14;
				}
				while (local73 > local60) {
					@Pc(93) double local93 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(95) double local95 = local79;
					if (local93 < -1.0E-4D || local93 > 1.0E-4D) {
						local95 = local79 * (Math.sin(local93) / local93);
					}
					local95 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local95 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B[B)[B")
	public byte[] method1124(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray16 != null) {
			@Pc(6) int local6 = 0;
			@Pc(8) int local8 = 0;
			@Pc(23) int local23 = (int) ((long) arg0.length * (long) this.anInt1846 / (long) this.anInt1849) + 14;
			@Pc(26) int[] local26 = new int[local23];
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray16[local8];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local26[local41 + local6] += local34 * local39[local41];
				}
				local8 += this.anInt1846;
				@Pc(70) int local70 = local8 / this.anInt1849;
				local6 += local70;
				local8 -= local70 * this.anInt1849;
			}
			arg0 = new byte[local23];
			for (@Pc(91) int local91 = 0; local91 < local23; local91++) {
				@Pc(101) int local101 = local26[local91] + 32768 >> 16;
				if (local101 < -128) {
					arg0[local91] = -128;
				} else if (local101 > 127) {
					arg0[local91] = 127;
				} else {
					arg0[local91] = (byte) local101;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I")
	public int method1126(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray16 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1846 / (long) this.anInt1849);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)I")
	public int method1127(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray16 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1846 / (long) this.anInt1849) + 6;
		}
		return arg0;
	}
}

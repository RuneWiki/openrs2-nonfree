import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class144 {

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
	private int anInt4555;

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
	private int anInt4562;

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(II)V")
	public Class144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static31.method679(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anInt4555 = local16;
			this.anInt4562 = local20;
			this.anIntArrayArray45 = new int[local16][14];
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray45[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local48 + 7.0D);
				if (local69 > 14) {
					local69 = 14;
				}
				@Pc(82) double local82 = (double) local20 / (double) local16;
				while (local56 < local69) {
					@Pc(92) double local92 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(94) double local94 = local82;
					if (local92 < -1.0E-4D || local92 > 1.0E-4D) {
						local94 = local82 * (Math.sin(local92) / local92);
					}
					local94 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local94 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[B)[B")
	public byte[] method3830(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray45 != null) {
			@Pc(27) int local27 = (int) ((long) arg0.length * (long) this.anInt4562 / (long) this.anInt4555) + 14;
			@Pc(30) int[] local30 = new int[local27];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
				@Pc(42) byte local42 = arg0[local36];
				@Pc(47) int[] local47 = this.anIntArrayArray45[local34];
				for (@Pc(49) int local49 = 0; local49 < 14; local49++) {
					local30[local49 + local32] += local47[local49] * local42;
				}
				local34 += this.anInt4562;
				@Pc(78) int local78 = local34 / this.anInt4555;
				local34 -= local78 * this.anInt4555;
				local32 += local78;
			}
			arg0 = new byte[local27];
			for (@Pc(103) int local103 = 0; local103 < local27; local103++) {
				@Pc(113) int local113 = local30[local103] + 32768 >> 16;
				if (local113 < -128) {
					arg0[local103] = -128;
				} else if (local113 > 127) {
					arg0[local103] = 127;
				} else {
					arg0[local103] = (byte) local113;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)I")
	public int method3832(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray45 != null) {
			arg0 = (int) ((long) this.anInt4562 * (long) arg0 / (long) this.anInt4555) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)I")
	public int method3834(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray45 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt4562 / (long) this.anInt4555);
		}
		return arg0;
	}
}

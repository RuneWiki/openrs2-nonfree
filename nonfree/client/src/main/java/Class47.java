import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class47 {

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
	private final int anInt2136;

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
	private final int anInt2135;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(II)V")
	public Class47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = Static35.method689(arg1, arg0);
		@Pc(12) int local12 = arg0 / local8;
		this.anInt2136 = local12;
		@Pc(19) int local19 = arg1 / local8;
		this.anInt2135 = local19;
		if (local12 != local19) {
			this.anIntArrayArray55 = new int[local12][14];
			for (@Pc(37) int local37 = 0; local37 < local12; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray55[local37];
				@Pc(52) double local52 = (double) local37 / (double) local12 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(73) double local73 = (double) local19 / (double) local12;
				@Pc(79) int local79 = (int) Math.ceil(local52 + 7.0D);
				if (local79 > 14) {
					local79 = 14;
				}
				while (local79 > local60) {
					@Pc(90) double local90 = local73;
					@Pc(98) double local98 = ((double) local60 - local52) * 3.141592653589793D;
					if (local98 < -1.0E-4D || local98 > 1.0E-4D) {
						local90 = local73 * (Math.sin(local98) / local98);
					}
					local90 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local90 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)I")
	public int method1509(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray55 != null) {
			arg0 = this.anInt2135 * arg0 / this.anInt2136 + 7;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z[B)[B")
	public byte[] method1511(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray55 != null) {
			@Pc(19) int local19 = arg0.length * this.anInt2135 / this.anInt2136 + 14;
			@Pc(21) int local21 = 0;
			@Pc(23) int local23 = 0;
			@Pc(26) int[] local26 = new int[local19];
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray55[local23];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local26[local21 + local41] += local34 * local39[local41];
				}
				local23 += this.anInt2135;
				@Pc(70) int local70 = local23 / this.anInt2136;
				local21 += local70;
				local23 -= this.anInt2136 * local70;
			}
			arg0 = new byte[local19];
			for (@Pc(95) int local95 = 0; local95 < local19; local95++) {
				@Pc(105) int local105 = local26[local95] + 32768 >> 16;
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

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)I")
	public int method1512(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray55 != null) {
			arg0 = arg0 * this.anInt2135 / this.anInt2136;
		}
		return arg0;
	}
}

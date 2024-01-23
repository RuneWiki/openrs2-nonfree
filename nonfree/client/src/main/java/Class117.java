import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class117 {

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
	private int anInt3508;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
	private int anInt3505;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(II)V")
	public Class117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(13) int local13 = Static242.method3803(arg1, arg0);
			@Pc(17) int local17 = arg0 / local13;
			@Pc(21) int local21 = arg1 / local13;
			this.anIntArrayArray27 = new int[local17][14];
			this.anInt3508 = local21;
			this.anInt3505 = local17;
			for (@Pc(34) int local34 = 0; local34 < local17; local34++) {
				@Pc(42) int[] local42 = this.anIntArrayArray27[local34];
				@Pc(50) double local50 = (double) local34 / (double) local17 + 6.0D;
				@Pc(56) double local56 = (double) local21 / (double) local17;
				@Pc(64) int local64 = (int) Math.floor(local50 + 1.0D - 7.0D);
				if (local64 < 0) {
					local64 = 0;
				}
				@Pc(75) int local75 = (int) Math.ceil(local50 + 7.0D);
				if (local75 > 14) {
					local75 = 14;
				}
				while (local64 < local75) {
					@Pc(95) double local95 = ((double) local64 - local50) * 3.141592653589793D;
					@Pc(97) double local97 = local56;
					if (-1.0E-4D > local95 || local95 > 1.0E-4D) {
						local97 = local56 * (Math.sin(local95) / local95);
					}
					local97 *= Math.cos(((double) local64 - local50) * 0.2243994752564138D) * 0.46D + 0.54D;
					local42[local64] = (int) Math.floor(local97 * 65536.0D + 0.5D);
					local64++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[B)[B")
	public byte[] method3001(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray27 != null) {
			@Pc(29) int local29 = (int) ((long) arg0.length * (long) this.anInt3508 / (long) this.anInt3505) + 14;
			@Pc(32) int[] local32 = new int[local29];
			@Pc(34) int local34 = 0;
			@Pc(36) int local36 = 0;
			@Pc(38) int local38;
			for (local38 = 0; local38 < arg0.length; local38++) {
				@Pc(47) int[] local47 = this.anIntArrayArray27[local36];
				@Pc(51) byte local51 = arg0[local38];
				@Pc(53) int local53;
				for (local53 = 0; local53 < 14; local53++) {
					local32[local53 + local34] += local47[local53] * local51;
				}
				local36 += this.anInt3508;
				local53 = local36 / this.anInt3505;
				local36 -= local53 * this.anInt3505;
				local34 += local53;
			}
			arg0 = new byte[local29];
			for (local38 = 0; local38 < local29; local38++) {
				@Pc(118) int local118 = local32[local38] + 32768 >> 16;
				if (local118 < -128) {
					arg0[local38] = -128;
				} else if (local118 <= 127) {
					arg0[local38] = (byte) local118;
				} else {
					arg0[local38] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)I")
	public int method3003(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray27 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt3508 / (long) this.anInt3505) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
	public int method3004(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray27 != null) {
			arg0 = (int) ((long) this.anInt3508 * (long) arg0 / (long) this.anInt3505);
		}
		return arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class173 {

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
	private int anInt5322;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
	private int anInt5321;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(II)V")
	public Class173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static228.method3640(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			this.anIntArrayArray47 = new int[local16][14];
			@Pc(25) int local25 = arg1 / local12;
			this.anInt5322 = local16;
			this.anInt5321 = local25;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(53) int[] local53 = this.anIntArrayArray47[local33];
				@Pc(61) int local61 = (int) Math.floor(local48 + 1.0D - 7.0D);
				@Pc(67) int local67 = (int) Math.ceil(local48 + 7.0D);
				if (local67 > 14) {
					local67 = 14;
				}
				@Pc(78) double local78 = (double) local25 / (double) local16;
				if (local61 < 0) {
					local61 = 0;
				}
				while (local61 < local67) {
					@Pc(96) double local96 = ((double) local61 - local48) * 3.141592653589793D;
					@Pc(98) double local98 = local78;
					if (-1.0E-4D > local96 || local96 > 1.0E-4D) {
						local98 = local78 * (Math.sin(local96) / local96);
					}
					local98 *= Math.cos(((double) local61 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local53[local61] = (int) Math.floor(local98 * 65536.0D + 0.5D);
					local61++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)I")
	public int method4339(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray47 != null) {
			arg0 = (int) ((long) this.anInt5321 * (long) arg0 / (long) this.anInt5322);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)I")
	public int method4340(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray47 != null) {
			arg0 = (int) ((long) this.anInt5321 * (long) arg0 / (long) this.anInt5322) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B[B)[B")
	public byte[] method4342(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray47 != null) {
			@Pc(29) int local29 = (int) ((long) this.anInt5321 * (long) arg0.length / (long) this.anInt5322) + 14;
			@Pc(31) int local31 = 0;
			@Pc(34) int[] local34 = new int[local29];
			@Pc(36) int local36 = 0;
			@Pc(38) int local38;
			for (local38 = 0; local38 < arg0.length; local38++) {
				@Pc(46) byte local46 = arg0[local38];
				@Pc(51) int[] local51 = this.anIntArrayArray47[local36];
				@Pc(53) int local53;
				for (local53 = 0; local53 < 14; local53++) {
					local34[local31 + local53] += local51[local53] * local46;
				}
				local36 += this.anInt5321;
				local53 = local36 / this.anInt5322;
				local31 += local53;
				local36 -= this.anInt5322 * local53;
			}
			arg0 = new byte[local29];
			for (local38 = 0; local38 < local29; local38++) {
				@Pc(116) int local116 = local34[local38] + 32768 >> 16;
				if (local116 < -128) {
					arg0[local38] = -128;
				} else if (local116 > 127) {
					arg0[local38] = 127;
				} else {
					arg0[local38] = (byte) local116;
				}
			}
		}
		return arg0;
	}
}

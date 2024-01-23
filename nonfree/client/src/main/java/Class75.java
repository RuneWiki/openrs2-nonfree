import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class75 {

	@OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
	private int anInt2209;

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
	private int anInt2206;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(II)V")
	public Class75(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(17) int local17 = Static113.method1841(arg1, arg0);
			@Pc(21) int local21 = arg0 / local17;
			@Pc(25) int local25 = arg1 / local17;
			this.anInt2209 = local21;
			this.anIntArrayArray11 = new int[local21][14];
			this.anInt2206 = local25;
			for (@Pc(38) int local38 = 0; local38 < local21; local38++) {
				@Pc(50) int[] local50 = this.anIntArrayArray11[local38];
				@Pc(58) double local58 = (double) local38 / (double) local21 + 6.0D;
				@Pc(66) int local66 = (int) Math.floor(local58 + 1.0D - 7.0D);
				if (local66 < 0) {
					local66 = 0;
				}
				@Pc(79) int local79 = (int) Math.ceil(local58 + 7.0D);
				@Pc(85) double local85 = (double) local25 / (double) local21;
				if (local79 > 14) {
					local79 = 14;
				}
				while (local66 < local79) {
					@Pc(108) double local108 = ((double) local66 - local58) * 3.141592653589793D;
					@Pc(110) double local110 = local85;
					if (-1.0E-4D > local108 || local108 > 1.0E-4D) {
						local110 = local85 * (Math.sin(local108) / local108);
					}
					local110 *= Math.cos(((double) local66 - local58) * 0.2243994752564138D) * 0.46D + 0.54D;
					local50[local66] = (int) Math.floor(local110 * 65536.0D + 0.5D);
					local66++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)I")
	public int method1707(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray11 != null) {
			arg0 = (int) ((long) this.anInt2206 * (long) arg0 / (long) this.anInt2209) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "([BI)[B")
	public byte[] method1709(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray11 != null) {
			@Pc(30) int local30 = (int) ((long) arg0.length * (long) this.anInt2206 / (long) this.anInt2209) + 14;
			@Pc(32) int local32 = 0;
			@Pc(35) int[] local35 = new int[local30];
			@Pc(37) int local37 = 0;
			@Pc(39) int local39;
			for (local39 = 0; local39 < arg0.length; local39++) {
				@Pc(51) byte local51 = arg0[local39];
				@Pc(56) int[] local56 = this.anIntArrayArray11[local32];
				@Pc(58) int local58;
				for (local58 = 0; local58 < 14; local58++) {
					local35[local58 + local37] += local56[local58] * local51;
				}
				local32 += this.anInt2206;
				local58 = local32 / this.anInt2209;
				local37 += local58;
				local32 -= local58 * this.anInt2209;
			}
			arg0 = new byte[local30];
			for (local39 = 0; local39 < local30; local39++) {
				@Pc(123) int local123 = local35[local39] + 32768 >> 16;
				if (local123 < -128) {
					arg0[local39] = -128;
				} else if (local123 > 127) {
					arg0[local39] = 127;
				} else {
					arg0[local39] = (byte) local123;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IB)I")
	public int method1710(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray11 != null) {
			arg0 = (int) ((long) this.anInt2206 * (long) arg0 / (long) this.anInt2209);
		}
		return arg0;
	}
}

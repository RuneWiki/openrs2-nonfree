import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class108 {

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
	private int anInt4235;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
	private int anInt4234;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(II)V")
	public Class108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static173.method2751(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			this.anInt4235 = local16;
			@Pc(23) int local23 = arg1 / local12;
			this.anIntArrayArray36 = new int[local16][14];
			this.anInt4234 = local23;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(43) double local43 = (double) local33 / (double) local16 + 6.0D;
				@Pc(48) int[] local48 = this.anIntArrayArray36[local33];
				@Pc(56) int local56 = (int) Math.floor(local43 + 1.0D - 7.0D);
				@Pc(62) double local62 = (double) local23 / (double) local16;
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(75) int local75 = (int) Math.ceil(local43 + 7.0D);
				if (local75 > 14) {
					local75 = 14;
				}
				while (local75 > local56) {
					@Pc(89) double local89 = ((double) local56 - local43) * 3.141592653589793D;
					@Pc(91) double local91 = local62;
					if (local89 < -1.0E-4D || local89 > 1.0E-4D) {
						local91 = local62 * (Math.sin(local89) / local89);
					}
					local91 *= Math.cos(((double) local56 - local43) * 0.2243994752564138D) * 0.46D + 0.54D;
					local48[local56] = (int) Math.floor(local91 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I")
	public int method3119(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray36 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt4234 / (long) this.anInt4235);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B[B)[B")
	public byte[] method3121(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray36 != null) {
			@Pc(15) int local15 = 0;
			@Pc(30) int local30 = (int) ((long) arg0.length * (long) this.anInt4234 / (long) this.anInt4235) + 14;
			@Pc(33) int[] local33 = new int[local30];
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray36[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local33[local50 + local15] += local48[local50] * local43;
				}
				local35 += this.anInt4234;
				@Pc(79) int local79 = local35 / this.anInt4235;
				local15 += local79;
				local35 -= this.anInt4235 * local79;
			}
			arg0 = new byte[local30];
			for (@Pc(104) int local104 = 0; local104 < local30; local104++) {
				@Pc(114) int local114 = local33[local104] + 32768 >> 16;
				if (local114 < -128) {
					arg0[local104] = -128;
				} else if (local114 <= 127) {
					arg0[local104] = (byte) local114;
				} else {
					arg0[local104] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)I")
	public int method3124(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray36 != null) {
			arg0 = (int) ((long) this.anInt4234 * (long) arg0 / (long) this.anInt4235) + 6;
		}
		return arg0;
	}
}

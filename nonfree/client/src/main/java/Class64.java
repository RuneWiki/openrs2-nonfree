import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class64 {

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
	private int anInt2741;

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
	private int anInt2742;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(II)V")
	public Class64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static143.method2365(arg0, arg1);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anIntArrayArray29 = new int[local24][14];
			this.anInt2741 = local24;
			this.anInt2742 = local20;
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(47) double local47 = (double) local37 / (double) local24 + 6.0D;
				@Pc(52) int[] local52 = this.anIntArrayArray29[local37];
				@Pc(60) int local60 = (int) Math.floor(local47 + 1.0D - 7.0D);
				@Pc(66) int local66 = (int) Math.ceil(local47 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(81) double local81 = (double) local20 / (double) local24;
				while (local60 < local66) {
					@Pc(85) double local85 = local81;
					@Pc(92) double local92 = ((double) local60 - local47) * 3.141592653589793D;
					if (local92 < -1.0E-4D || local92 > 1.0E-4D) {
						local85 = local81 * (Math.sin(local92) / local92);
					}
					local85 *= Math.cos(((double) local60 - local47) * 0.2243994752564138D) * 0.46D + 0.54D;
					local52[local60] = (int) Math.floor(local85 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)I")
	public int method2147(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray29 != null) {
			arg0 = (int) ((long) this.anInt2742 * (long) arg0 / (long) this.anInt2741) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[B)[B")
	public byte[] method2150(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray29 != null) {
			@Pc(28) int local28 = (int) ((long) arg0.length * (long) this.anInt2742 / (long) this.anInt2741) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray29[local35];
				@Pc(48) byte local48 = arg0[local37];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local50 + local33] += local44[local50] * local48;
				}
				local35 += this.anInt2742;
				@Pc(79) int local79 = local35 / this.anInt2741;
				local33 += local79;
				local35 -= local79 * this.anInt2741;
			}
			arg0 = new byte[local28];
			for (@Pc(100) int local100 = 0; local100 < local28; local100++) {
				@Pc(110) int local110 = local31[local100] + 32768 >> 16;
				if (local110 < -128) {
					arg0[local100] = -128;
				} else if (local110 > 127) {
					arg0[local100] = 127;
				} else {
					arg0[local100] = (byte) local110;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)I")
	public int method2151(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray29 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2742 / (long) this.anInt2741);
		}
		return arg0;
	}
}

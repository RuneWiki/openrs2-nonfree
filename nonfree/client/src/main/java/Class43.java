import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class43 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "I")
	private int anInt2438;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!k", name = "l", descriptor = "I")
	private int anInt2446;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(II)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static57.method1346(arg0, arg1);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anInt2438 = local24;
			this.anIntArrayArray20 = new int[local20][14];
			this.anInt2446 = local20;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray20[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(58) double local58 = (double) local24 / (double) local20;
				@Pc(66) int local66 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local66 < 0) {
					local66 = 0;
				}
				@Pc(76) int local76 = (int) Math.ceil(local52 + 7.0D);
				if (local76 > 14) {
					local76 = 14;
				}
				while (local76 > local66) {
					@Pc(92) double local92 = ((double) local66 - local52) * 3.141592653589793D;
					@Pc(94) double local94 = local58;
					if (local92 < -1.0E-4D || local92 > 1.0E-4D) {
						local94 = local58 * (Math.sin(local92) / local92);
					}
					local94 *= Math.cos(((double) local66 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local66] = (int) Math.floor(local94 * 65536.0D + 0.5D);
					local66++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI)I")
	public int method1823(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray20 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2438 / (long) this.anInt2446) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)I")
	public int method1825(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray20 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2438 / (long) this.anInt2446);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "([BB)[B")
	public byte[] method1826(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray20 != null) {
			@Pc(15) int local15 = 0;
			@Pc(30) int local30 = (int) ((long) this.anInt2438 * (long) arg0.length / (long) this.anInt2446) + 14;
			@Pc(32) int local32 = 0;
			@Pc(35) int[] local35 = new int[local30];
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray20[local32];
				@Pc(48) byte local48 = arg0[local37];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local35[local15 + local50] += local44[local50] * local48;
				}
				local32 += this.anInt2438;
				@Pc(81) int local81 = local32 / this.anInt2446;
				local32 -= this.anInt2446 * local81;
				local15 += local81;
			}
			arg0 = new byte[local30];
			for (@Pc(106) int local106 = 0; local106 < local30; local106++) {
				@Pc(116) int local116 = local35[local106] + 32768 >> 16;
				if (local116 < -128) {
					arg0[local106] = -128;
				} else if (local116 > 127) {
					arg0[local106] = 127;
				} else {
					arg0[local106] = (byte) local116;
				}
			}
		}
		return arg0;
	}
}

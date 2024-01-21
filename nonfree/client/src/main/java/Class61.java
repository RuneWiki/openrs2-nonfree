import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class61 {

	@OriginalMember(owner = "client!v", name = "c", descriptor = "I")
	private final int anInt2746;

	@OriginalMember(owner = "client!v", name = "y", descriptor = "I")
	private final int anInt2759;

	@OriginalMember(owner = "client!v", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(II)V")
	public Class61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = Static63.method1334(arg1, arg0);
		@Pc(12) int local12 = arg1 / local8;
		@Pc(16) int local16 = arg0 / local8;
		this.anInt2746 = local12;
		this.anInt2759 = local16;
		if (local16 != local12) {
			this.anIntArrayArray26 = new int[local16][14];
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray26[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local48 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				@Pc(77) double local77 = (double) local12 / (double) local16;
				while (local66 > local56) {
					@Pc(86) double local86 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(88) double local88 = local77;
					if (local86 < -1.0E-4D || local86 > 1.0E-4D) {
						local88 = local77 * (Math.sin(local86) / local86);
					}
					local88 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local88 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B[B)[B")
	public byte[] method1960(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray26 != null) {
			@Pc(15) int local15 = arg0.length * this.anInt2746 / this.anInt2759 + 14;
			@Pc(18) int[] local18 = new int[local15];
			@Pc(20) int local20 = 0;
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < arg0.length; local24++) {
				@Pc(30) byte local30 = arg0[local24];
				@Pc(35) int[] local35 = this.anIntArrayArray26[local22];
				for (@Pc(37) int local37 = 0; local37 < 14; local37++) {
					local18[local37 + local20] += local35[local37] * local30;
				}
				local22 += this.anInt2746;
				@Pc(66) int local66 = local22 / this.anInt2759;
				local22 -= this.anInt2759 * local66;
				local20 += local66;
			}
			arg0 = new byte[local15];
			for (@Pc(87) int local87 = 0; local87 < local15; local87++) {
				@Pc(97) int local97 = local18[local87] + 32768 >> 16;
				if (local97 < -128) {
					arg0[local87] = -128;
				} else if (local97 <= 127) {
					arg0[local87] = (byte) local97;
				} else {
					arg0[local87] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)I")
	public int method1961(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray26 != null) {
			arg0 = arg0 * this.anInt2746 / this.anInt2759 + 7;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)I")
	public int method1962(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray26 != null) {
			arg0 = this.anInt2746 * arg0 / this.anInt2759;
		}
		return arg0;
	}
}

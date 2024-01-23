import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class9 {

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(II)V")
	public Class9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(13) int local13 = Static217.method3661(arg1, arg0);
			@Pc(17) int local17 = arg0 / local13;
			@Pc(21) int local21 = arg1 / local13;
			this.anInt286 = local17;
			this.anIntArrayArray1 = new int[local17][14];
			this.anInt291 = local21;
			for (@Pc(34) int local34 = 0; local34 < local17; local34++) {
				@Pc(42) int[] local42 = this.anIntArrayArray1[local34];
				@Pc(50) double local50 = (double) local34 / (double) local17 + 6.0D;
				@Pc(58) int local58 = (int) Math.floor(local50 + 1.0D - 7.0D);
				@Pc(64) double local64 = (double) local21 / (double) local17;
				if (local58 < 0) {
					local58 = 0;
				}
				@Pc(77) int local77 = (int) Math.ceil(local50 + 7.0D);
				if (local77 > 14) {
					local77 = 14;
				}
				while (local58 < local77) {
					@Pc(93) double local93 = ((double) local58 - local50) * 3.141592653589793D;
					@Pc(95) double local95 = local64;
					if (local93 < -1.0E-4D || local93 > 1.0E-4D) {
						local95 = local64 * (Math.sin(local93) / local93);
					}
					local95 *= Math.cos(((double) local58 - local50) * 0.2243994752564138D) * 0.46D + 0.54D;
					local42[local58] = (int) Math.floor(local95 * 65536.0D + 0.5D);
					local58++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "([BI)[B")
	public byte[] method249(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray1 != null) {
			@Pc(24) int local24 = (int) ((long) arg0.length * (long) this.anInt291 / (long) this.anInt286) + 14;
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(31) int[] local31 = new int[local24];
			@Pc(33) int local33;
			for (local33 = 0; local33 < arg0.length; local33++) {
				@Pc(42) int[] local42 = this.anIntArrayArray1[local28];
				@Pc(46) byte local46 = arg0[local33];
				@Pc(48) int local48;
				for (local48 = 0; local48 < 14; local48++) {
					local31[local48 + local26] += local46 * local42[local48];
				}
				local28 += this.anInt291;
				local48 = local28 / this.anInt286;
				local26 += local48;
				local28 -= this.anInt286 * local48;
			}
			arg0 = new byte[local24];
			for (local33 = 0; local33 < local24; local33++) {
				@Pc(107) int local107 = local31[local33] + 32768 >> 16;
				if (local107 < -128) {
					arg0[local33] = -128;
				} else if (local107 <= 127) {
					arg0[local33] = (byte) local107;
				} else {
					arg0[local33] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)I")
	public int method250(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray1 != null) {
			arg0 = (int) ((long) this.anInt291 * (long) arg0 / (long) this.anInt286);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)I")
	public int method253(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray1 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt291 / (long) this.anInt286) + 6;
		}
		return arg0;
	}
}

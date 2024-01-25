import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class76 {

	@OriginalMember(owner = "client!fm", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
	private int anInt2273;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
	private int anInt2268;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(II)V")
	public Class76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static334.method5307(arg1, arg0);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anIntArrayArray19 = new int[local20][14];
			this.anInt2273 = local20;
			this.anInt2268 = local16;
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray19[local33];
				@Pc(48) double local48 = (double) local33 / (double) local20 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local48 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				@Pc(77) double local77 = (double) local16 / (double) local20;
				while (local56 < local66) {
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

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)I")
	public int method1853(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray19 != null) {
			arg0 = (int) ((long) this.anInt2268 * (long) arg0 / (long) this.anInt2273) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)I")
	public int method1855(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray19 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2268 / (long) this.anInt2273);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I[B)[B")
	public byte[] method1861(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray19 != null) {
			@Pc(25) int local25 = (int) ((long) this.anInt2268 * (long) arg0.length / (long) this.anInt2273) + 14;
			@Pc(28) int[] local28 = new int[local25];
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = 0; local34 < arg0.length; local34++) {
				@Pc(39) byte local39 = arg0[local34];
				@Pc(44) int[] local44 = this.anIntArrayArray19[local32];
				for (@Pc(46) int local46 = 0; local46 < 14; local46++) {
					local28[local30 + local46] += local39 * local44[local46];
				}
				local32 += this.anInt2268;
				@Pc(74) int local74 = local32 / this.anInt2273;
				local30 += local74;
				local32 -= local74 * this.anInt2273;
			}
			arg0 = new byte[local25];
			for (@Pc(99) int local99 = 0; local99 < local25; local99++) {
				@Pc(108) int local108 = local28[local99] + 32768 >> 16;
				if (local108 < -128) {
					arg0[local99] = -128;
				} else if (local108 > 127) {
					arg0[local99] = 127;
				} else {
					arg0[local99] = (byte) local108;
				}
			}
		}
		return arg0;
	}
}

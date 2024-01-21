import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class18 {

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
	private int anInt1059;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(II)V")
	public Class18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static75.method1327(arg0, arg1);
			@Pc(20) int local20 = arg0 / local16;
			this.anIntArrayArray6 = new int[local20][14];
			this.anInt1056 = local20;
			@Pc(32) int local32 = arg1 / local16;
			this.anInt1059 = local32;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray6[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(58) double local58 = (double) local32 / (double) local20;
				@Pc(66) int local66 = (int) Math.floor(local52 + 1.0D - 7.0D);
				@Pc(72) int local72 = (int) Math.ceil(local52 + 7.0D);
				if (local72 > 14) {
					local72 = 14;
				}
				if (local66 < 0) {
					local66 = 0;
				}
				while (local66 < local72) {
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

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I")
	public int method797(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray6 != null) {
			arg0 = (int) ((long) this.anInt1059 * (long) arg0 / (long) this.anInt1056) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)I")
	public int method801(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray6 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1059 / (long) this.anInt1056);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[B)[B")
	public byte[] method802(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray6 != null) {
			@Pc(23) int local23 = (int) ((long) this.anInt1059 * (long) arg0.length / (long) this.anInt1056) + 14;
			@Pc(25) int local25 = 0;
			@Pc(27) int local27 = 0;
			@Pc(30) int[] local30 = new int[local23];
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(39) int[] local39 = this.anIntArrayArray6[local25];
				@Pc(43) byte local43 = arg0[local32];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local30[local27 + local45] += local39[local45] * local43;
				}
				local25 += this.anInt1059;
				@Pc(77) int local77 = local25 / this.anInt1056;
				local25 -= this.anInt1056 * local77;
				local27 += local77;
			}
			arg0 = new byte[local23];
			for (@Pc(98) int local98 = 0; local98 < local23; local98++) {
				@Pc(108) int local108 = local30[local98] + 32768 >> 16;
				if (local108 < -128) {
					arg0[local98] = -128;
				} else if (local108 > 127) {
					arg0[local98] = 127;
				} else {
					arg0[local98] = (byte) local108;
				}
			}
		}
		return arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class213 {

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
	private int anInt6376;

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
	private int anInt6372;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(II)V")
	public Class213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static268.method4677(arg1, arg0);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anInt6376 = local16;
			this.anIntArrayArray64 = new int[local16][14];
			this.anInt6372 = local20;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray64[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local48 + 7.0D);
				if (local69 > 14) {
					local69 = 14;
				}
				@Pc(82) double local82 = (double) local20 / (double) local16;
				while (local69 > local56) {
					@Pc(91) double local91 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(93) double local93 = local82;
					if (local91 < -1.0E-4D || local91 > 1.0E-4D) {
						local93 = local82 * (Math.sin(local91) / local91);
					}
					local93 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local93 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "([BI)[B")
	public byte[] method5576(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray64 != null) {
			@Pc(23) int local23 = (int) ((long) arg0.length * (long) this.anInt6372 / (long) this.anInt6376) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) byte local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray64[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local28 + local45] += local43[local45] * local38;
				}
				local30 += this.anInt6372;
				@Pc(77) int local77 = local30 / this.anInt6376;
				local30 -= local77 * this.anInt6376;
				local28 += local77;
			}
			arg0 = new byte[local23];
			for (@Pc(102) int local102 = 0; local102 < local23; local102++) {
				@Pc(112) int local112 = local26[local102] + 32768 >> 16;
				if (local112 < -128) {
					arg0[local102] = -128;
				} else if (local112 <= 127) {
					arg0[local102] = (byte) local112;
				} else {
					arg0[local102] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZ)I")
	public int method5577(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray64 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt6372 / (long) this.anInt6376);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IB)I")
	public int method5580(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray64 != null) {
			arg0 = (int) ((long) this.anInt6372 * (long) arg0 / (long) this.anInt6376) + 6;
		}
		return arg0;
	}
}

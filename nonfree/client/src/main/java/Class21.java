import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class21 {

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
	private int anInt677;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
	private int anInt675;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(II)V")
	public Class21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static236.method3286(arg1, arg0);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anInt677 = local16;
			this.anInt675 = local20;
			this.anIntArrayArray8 = new int[local20][14];
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray8[local33];
				@Pc(48) double local48 = (double) local33 / (double) local20 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local48 + 7.0D);
				if (local69 > 14) {
					local69 = 14;
				}
				@Pc(82) double local82 = (double) local16 / (double) local20;
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

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([BB)[B")
	public byte[] method536(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray8 != null) {
			@Pc(23) int local23 = (int) ((long) this.anInt677 * (long) arg0.length / (long) this.anInt675) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) byte local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray8[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local28 + local45] += local38 * local43[local45];
				}
				local30 += this.anInt677;
				@Pc(77) int local77 = local30 / this.anInt675;
				local30 -= local77 * this.anInt675;
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

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I")
	public int method537(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray8 != null) {
			arg0 = (int) ((long) this.anInt677 * (long) arg0 / (long) this.anInt675);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)I")
	public int method538(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray8 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt677 / (long) this.anInt675) + 6;
		}
		return arg0;
	}
}

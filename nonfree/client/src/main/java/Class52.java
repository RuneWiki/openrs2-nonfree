import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class52 {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
	private int anInt1772;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	private int anInt1771;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(II)V")
	public Class52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static30.method525(arg0, arg1);
			@Pc(16) int local16 = arg1 / local12;
			this.anInt1772 = local16;
			@Pc(23) int local23 = arg0 / local12;
			this.anInt1771 = local23;
			this.anIntArrayArray14 = new int[local23][14];
			for (@Pc(33) int local33 = 0; local33 < local23; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray14[local33];
				@Pc(48) double local48 = (double) local33 / (double) local23 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				@Pc(62) int local62 = (int) Math.ceil(local48 + 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				if (local62 > 14) {
					local62 = 14;
				}
				@Pc(77) double local77 = (double) local16 / (double) local23;
				while (local62 > local56) {
					@Pc(81) double local81 = local77;
					@Pc(89) double local89 = ((double) local56 - local48) * 3.141592653589793D;
					if (local89 < -1.0E-4D || local89 > 1.0E-4D) {
						local81 = local77 * (Math.sin(local89) / local89);
					}
					local81 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local81 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)I")
	public int method1210(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray14 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1772 / (long) this.anInt1771);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([BI)[B")
	public byte[] method1211(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray14 != null) {
			@Pc(28) int local28 = (int) ((long) arg0.length * (long) this.anInt1772 / (long) this.anInt1771) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray14[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local33 + local50] += local48[local50] * local43;
				}
				local35 += this.anInt1772;
				@Pc(82) int local82 = local35 / this.anInt1771;
				local33 += local82;
				local35 -= local82 * this.anInt1771;
			}
			arg0 = new byte[local28];
			for (@Pc(107) int local107 = 0; local107 < local28; local107++) {
				@Pc(117) int local117 = local31[local107] + 32768 >> 16;
				if (local117 < -128) {
					arg0[local107] = -128;
				} else if (local117 <= 127) {
					arg0[local107] = (byte) local117;
				} else {
					arg0[local107] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)I")
	public int method1217(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray14 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1772 / (long) this.anInt1771) + 6;
		}
		return arg0;
	}
}

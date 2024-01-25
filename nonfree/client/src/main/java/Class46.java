import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class46 {

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
	private int anInt1327;

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
	private int anInt1326;

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(II)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static163.method1563(arg1, arg0);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anInt1327 = local16;
			this.anInt1326 = local20;
			this.anIntArrayArray40 = new int[local16][14];
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray40[local33];
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

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IZ)I")
	public int method1385(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray40 != null) {
			arg0 = (int) ((long) this.anInt1326 * (long) arg0 / (long) this.anInt1327);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(B[B)[B")
	public byte[] method1387(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray40 != null) {
			@Pc(28) int local28 = (int) ((long) arg0.length * (long) this.anInt1326 / (long) this.anInt1327) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray40[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local50 + local33] += local43 * local48[local50];
				}
				local35 += this.anInt1326;
				@Pc(79) int local79 = local35 / this.anInt1327;
				local33 += local79;
				local35 -= this.anInt1327 * local79;
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

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BI)I")
	public int method1391(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray40 != null) {
			arg0 = (int) ((long) this.anInt1326 * (long) arg0 / (long) this.anInt1327) + 6;
		}
		return arg0;
	}
}

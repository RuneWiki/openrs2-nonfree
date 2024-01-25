import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class173 {

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
	private int anInt4751;

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
	private int anInt4757;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(II)V")
	public Class173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static189.method2969(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anIntArrayArray48 = new int[local16][14];
			this.anInt4751 = local20;
			this.anInt4757 = local16;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray48[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local48 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				@Pc(79) double local79 = (double) local20 / (double) local16;
				while (local56 < local66) {
					@Pc(88) double local88 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(90) double local90 = local79;
					if (local88 < -1.0E-4D || local88 > 1.0E-4D) {
						local90 = local79 * (Math.sin(local88) / local88);
					}
					local90 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local90 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([BI)[B")
	public byte[] method3948(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray48 != null) {
			@Pc(23) int local23 = (int) ((long) arg0.length * (long) this.anInt4751 / (long) this.anInt4757) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) byte local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray48[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local28 + local45] += local38 * local43[local45];
				}
				local30 += this.anInt4751;
				@Pc(77) int local77 = local30 / this.anInt4757;
				local30 -= local77 * this.anInt4757;
				local28 += local77;
			}
			arg0 = new byte[local23];
			for (@Pc(102) int local102 = 0; local102 < local23; local102++) {
				@Pc(112) int local112 = local26[local102] + 32768 >> 16;
				if (local112 < -128) {
					arg0[local102] = -128;
				} else if (local112 > 127) {
					arg0[local102] = 127;
				} else {
					arg0[local102] = (byte) local112;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)I")
	public int method3950(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray48 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt4751 / (long) this.anInt4757);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI)I")
	public int method3951(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray48 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt4751 / (long) this.anInt4757) + 6;
		}
		return arg0;
	}
}

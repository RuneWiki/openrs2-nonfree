import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class103 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "I")
	private int anInt2478;

	@OriginalMember(owner = "client!io", name = "c", descriptor = "I")
	private int anInt2480;

	@OriginalMember(owner = "client!io", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(II)V")
	public Class103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static130.method4121(arg0, arg1);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anInt2478 = local16;
			this.anInt2480 = local20;
			this.anIntArrayArray23 = new int[local20][14];
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray23[local33];
				@Pc(48) double local48 = (double) local33 / (double) local20 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local48 + 7.0D);
				if (local69 > 14) {
					local69 = 14;
				}
				@Pc(80) double local80 = (double) local16 / (double) local20;
				while (local56 < local69) {
					@Pc(89) double local89 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(91) double local91 = local80;
					if (local89 < -1.0E-4D || local89 > 1.0E-4D) {
						local91 = local80 * (Math.sin(local89) / local89);
					}
					local91 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local91 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "([BI)[B")
	public byte[] method2067(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray23 != null) {
			@Pc(23) int local23 = (int) ((long) this.anInt2478 * (long) arg0.length / (long) this.anInt2480) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) byte local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray23[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local28 + local45] += local43[local45] * local38;
				}
				local30 += this.anInt2478;
				@Pc(74) int local74 = local30 / this.anInt2480;
				local28 += local74;
				local30 -= this.anInt2480 * local74;
			}
			arg0 = new byte[local23];
			for (@Pc(99) int local99 = 0; local99 < local23; local99++) {
				@Pc(109) int local109 = local26[local99] + 32768 >> 16;
				if (local109 < -128) {
					arg0[local99] = -128;
				} else if (local109 > 127) {
					arg0[local99] = 127;
				} else {
					arg0[local99] = (byte) local109;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)I")
	public int method2069(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray23 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2478 / (long) this.anInt2480) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)I")
	public int method2070(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray23 != null) {
			arg0 = (int) ((long) this.anInt2478 * (long) arg0 / (long) this.anInt2480);
		}
		return arg0;
	}
}

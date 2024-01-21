import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class44 {

	@OriginalMember(owner = "client!p", name = "i", descriptor = "I")
	private final int anInt2253;

	@OriginalMember(owner = "client!p", name = "j", descriptor = "I")
	private final int anInt2254;

	@OriginalMember(owner = "client!p", name = "v", descriptor = "[[I")
	private int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(II)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = Static16.method516(arg1, arg0);
		@Pc(12) int local12 = arg0 / local8;
		@Pc(16) int local16 = arg1 / local8;
		this.anInt2253 = local16;
		this.anInt2254 = local12;
		if (local12 != local16) {
			this.anIntArrayArray60 = new int[local12][14];
			for (@Pc(33) int local33 = 0; local33 < local12; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray60[local33];
				@Pc(48) double local48 = (double) local33 / (double) local12 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local48 + 7.0D);
				@Pc(72) double local72 = (double) local16 / (double) local12;
				if (local66 > 14) {
					local66 = 14;
				}
				while (local56 < local66) {
					@Pc(89) double local89 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(91) double local91 = local72;
					if (local89 < -1.0E-4D || local89 > 1.0E-4D) {
						local91 = local72 * (Math.sin(local89) / local89);
					}
					local91 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local91 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)I")
	public int method1413(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray60 != null) {
			arg0 = this.anInt2253 * arg0 / this.anInt2254;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)I")
	public int method1415(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray60 != null) {
			arg0 = arg0 * this.anInt2253 / this.anInt2254 + 7;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "([BI)[B")
	public byte[] method1417(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray60 != null) {
			@Pc(23) int local23 = arg0.length * this.anInt2253 / this.anInt2254 + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) byte local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray60[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local45 + local28] += local38 * local43[local45];
				}
				local30 += this.anInt2253;
				@Pc(76) int local76 = local30 / this.anInt2254;
				local30 -= this.anInt2254 * local76;
				local28 += local76;
			}
			arg0 = new byte[local23];
			for (@Pc(97) int local97 = 0; local97 < local23; local97++) {
				@Pc(107) int local107 = local26[local97] + 32768 >> 16;
				if (local107 < -128) {
					arg0[local97] = -128;
				} else if (local107 > 127) {
					arg0[local97] = 127;
				} else {
					arg0[local97] = (byte) local107;
				}
			}
		}
		return arg0;
	}
}

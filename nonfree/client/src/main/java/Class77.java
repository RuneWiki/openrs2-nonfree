import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class77 {

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
	private int anInt2722;

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
	private int anInt2714;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(II)V")
	public Class77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static28.method378(arg1, arg0);
			@Pc(16) int local16 = arg1 / local12;
			this.anInt2722 = local16;
			@Pc(23) int local23 = arg0 / local12;
			this.anInt2714 = local23;
			this.anIntArrayArray26 = new int[local23][14];
			for (@Pc(33) int local33 = 0; local33 < local23; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray26[local33];
				@Pc(48) double local48 = (double) local33 / (double) local23 + 6.0D;
				@Pc(54) double local54 = (double) local16 / (double) local23;
				@Pc(62) int local62 = (int) Math.floor(local48 + 1.0D - 7.0D);
				@Pc(68) int local68 = (int) Math.ceil(local48 + 7.0D);
				if (local68 > 14) {
					local68 = 14;
				}
				if (local62 < 0) {
					local62 = 0;
				}
				while (local62 < local68) {
					@Pc(81) double local81 = local54;
					@Pc(89) double local89 = ((double) local62 - local48) * 3.141592653589793D;
					if (local89 < -1.0E-4D || local89 > 1.0E-4D) {
						local81 = local54 * (Math.sin(local89) / local89);
					}
					local81 *= Math.cos(((double) local62 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local62] = (int) Math.floor(local81 * 65536.0D + 0.5D);
					local62++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)I")
	public int method1899(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray26 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2722 / (long) this.anInt2714) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)I")
	public int method1900(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray26 != null) {
			arg0 = (int) ((long) this.anInt2722 * (long) arg0 / (long) this.anInt2714);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[B)[B")
	public byte[] method1901(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray26 != null) {
			@Pc(23) int local23 = (int) ((long) this.anInt2722 * (long) arg0.length / (long) this.anInt2714) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) byte local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray26[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local45 + local28] += local38 * local43[local45];
				}
				local30 += this.anInt2722;
				@Pc(74) int local74 = local30 / this.anInt2714;
				local30 -= local74 * this.anInt2714;
				local28 += local74;
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
}

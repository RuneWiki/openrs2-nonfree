import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class44 {

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
	private int anInt1687;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
	private int anInt1686;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(II)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static180.method2781(arg1, arg0);
			@Pc(16) int local16 = arg1 / local12;
			this.anInt1687 = local16;
			@Pc(23) int local23 = arg0 / local12;
			this.anIntArrayArray13 = new int[local23][14];
			this.anInt1686 = local23;
			for (@Pc(33) int local33 = 0; local33 < local23; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray13[local33];
				@Pc(48) double local48 = (double) local33 / (double) local23 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local48 + 7.0D);
				@Pc(75) double local75 = (double) local16 / (double) local23;
				if (local69 > 14) {
					local69 = 14;
				}
				while (local56 < local69) {
					@Pc(84) double local84 = local75;
					@Pc(91) double local91 = ((double) local56 - local48) * 3.141592653589793D;
					if (local91 < -1.0E-4D || local91 > 1.0E-4D) {
						local84 = local75 * (Math.sin(local91) / local91);
					}
					local84 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local84 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)I")
	public int method1300(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray13 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1687 / (long) this.anInt1686) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)I")
	public int method1301(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray13 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1687 / (long) this.anInt1686);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "([BB)[B")
	public byte[] method1303(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray13 != null) {
			@Pc(19) int local19 = (int) ((long) this.anInt1687 * (long) arg0.length / (long) this.anInt1686) + 14;
			@Pc(21) int local21 = 0;
			@Pc(23) int local23 = 0;
			@Pc(26) int[] local26 = new int[local19];
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray13[local23];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local26[local41 + local21] += local39[local41] * local34;
				}
				local23 += this.anInt1687;
				@Pc(70) int local70 = local23 / this.anInt1686;
				local21 += local70;
				local23 -= this.anInt1686 * local70;
			}
			arg0 = new byte[local19];
			for (@Pc(91) int local91 = 0; local91 < local19; local91++) {
				@Pc(101) int local101 = local26[local91] + 32768 >> 16;
				if (local101 < -128) {
					arg0[local91] = -128;
				} else if (local101 <= 127) {
					arg0[local91] = (byte) local101;
				} else {
					arg0[local91] = 127;
				}
			}
		}
		return arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class59 {

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
	private int anInt1965;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
	private int anInt1962;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(II)V")
	public Class59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static541.method7420(arg1, arg0);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anIntArrayArray14 = new int[local16][14];
			this.anInt1965 = local20;
			this.anInt1962 = local16;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray14[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local48 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				@Pc(77) double local77 = (double) local20 / (double) local16;
				while (local66 > local56) {
					@Pc(87) double local87 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(89) double local89 = local77;
					if (local87 < -1.0E-4D || local87 > 1.0E-4D) {
						local89 = local77 * (Math.sin(local87) / local87);
					}
					local89 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local89 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z[B)[B")
	public byte[] method1721(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray14 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt1965 / (long) this.anInt1962) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray14[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local24 + local41] += local39[local41] * local34;
				}
				local26 += this.anInt1965;
				@Pc(71) int local71 = local26 / this.anInt1962;
				local24 += local71;
				local26 -= this.anInt1962 * local71;
			}
			arg0 = new byte[local19];
			for (@Pc(92) int local92 = 0; local92 < local19; local92++) {
				@Pc(102) int local102 = local22[local92] + 32768 >> 16;
				if (local102 < -128) {
					arg0[local92] = -128;
				} else if (local102 > 127) {
					arg0[local92] = 127;
				} else {
					arg0[local92] = (byte) local102;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BI)I")
	public int method1722(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray14 != null) {
			arg0 = (int) ((long) this.anInt1965 * (long) arg0 / (long) this.anInt1962) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)I")
	public int method1724(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray14 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1965 / (long) this.anInt1962);
		}
		return arg0;
	}
}

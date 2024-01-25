import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class132 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "I")
	private int anInt3998;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "I")
	private int anInt4002;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(II)V")
	public Class132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static33.method637(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anInt3998 = local16;
			this.anIntArrayArray35 = new int[local16][14];
			this.anInt4002 = local20;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray35[local33];
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
					@Pc(86) double local86 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(88) double local88 = local77;
					if (local86 < -1.0E-4D || local86 > 1.0E-4D) {
						local88 = local77 * (Math.sin(local86) / local86);
					}
					local88 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local88 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI)I")
	public int method3419(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray35 != null) {
			arg0 = (int) ((long) this.anInt4002 * (long) arg0 / (long) this.anInt3998) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I[B)[B")
	public byte[] method3422(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray35 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt4002 / (long) this.anInt3998) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray35[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local41 + local24] += local34 * local39[local41];
				}
				local26 += this.anInt4002;
				@Pc(72) int local72 = local26 / this.anInt3998;
				local24 += local72;
				local26 -= local72 * this.anInt3998;
			}
			arg0 = new byte[local19];
			for (@Pc(97) int local97 = 0; local97 < local19; local97++) {
				@Pc(107) int local107 = local22[local97] + 32768 >> 16;
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

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)I")
	public int method3423(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray35 != null) {
			arg0 = (int) ((long) this.anInt4002 * (long) arg0 / (long) this.anInt3998);
		}
		return arg0;
	}
}

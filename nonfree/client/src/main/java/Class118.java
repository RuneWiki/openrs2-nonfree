import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class118 {

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
	private int anInt3776;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
	private int anInt3774;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(II)V")
	public Class118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static41.method775(arg1, arg0);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anIntArrayArray38 = new int[local20][14];
			this.anInt3776 = local16;
			this.anInt3774 = local20;
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray38[local33];
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
				while (local69 > local56) {
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

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)I")
	public int method3196(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray38 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt3776 / (long) this.anInt3774) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[B)[B")
	public byte[] method3199(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray38 != null) {
			@Pc(28) int local28 = (int) ((long) arg0.length * (long) this.anInt3776 / (long) this.anInt3774) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray38[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local50 + local33] += local43 * local48[local50];
				}
				local35 += this.anInt3776;
				@Pc(79) int local79 = local35 / this.anInt3774;
				local35 -= local79 * this.anInt3774;
				local33 += local79;
			}
			arg0 = new byte[local28];
			for (@Pc(100) int local100 = 0; local100 < local28; local100++) {
				@Pc(110) int local110 = local31[local100] + 32768 >> 16;
				if (local110 < -128) {
					arg0[local100] = -128;
				} else if (local110 <= 127) {
					arg0[local100] = (byte) local110;
				} else {
					arg0[local100] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZI)I")
	public int method3203(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray38 != null) {
			arg0 = (int) ((long) this.anInt3776 * (long) arg0 / (long) this.anInt3774);
		}
		return arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class148 {

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
	private int anInt3710;

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray94;

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
	private int anInt3708;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(II)V")
	public Class148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(10) int local10 = Static289.method4095(arg0, arg1);
			@Pc(14) int local14 = arg0 / local10;
			@Pc(18) int local18 = arg1 / local10;
			this.anInt3710 = local14;
			this.anIntArrayArray94 = new int[local14][14];
			this.anInt3708 = local18;
			for (@Pc(31) int local31 = 0; local31 < local14; local31++) {
				@Pc(37) int[] local37 = this.anIntArrayArray94[local31];
				@Pc(45) double local45 = (double) local31 / (double) local14 + 6.0D;
				@Pc(53) int local53 = (int) Math.floor(local45 + 1.0D - 7.0D);
				if (local53 < 0) {
					local53 = 0;
				}
				@Pc(63) int local63 = (int) Math.ceil(local45 + 7.0D);
				if (local63 > 14) {
					local63 = 14;
				}
				@Pc(76) double local76 = (double) local18 / (double) local14;
				while (local53 < local63) {
					@Pc(85) double local85 = ((double) local53 - local45) * 3.141592653589793D;
					@Pc(87) double local87 = local76;
					if (local85 < -1.0E-4D || local85 > 1.0E-4D) {
						local87 = local76 * (Math.sin(local85) / local85);
					}
					local87 *= Math.cos(((double) local53 - local45) * 0.2243994752564138D) * 0.46D + 0.54D;
					local37[local53] = (int) Math.floor(local87 * 65536.0D + 0.5D);
					local53++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "([BI)[B")
	public byte[] method3056(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray94 != null) {
			@Pc(30) int local30 = (int) ((long) arg0.length * (long) this.anInt3708 / (long) this.anInt3710) + 14;
			@Pc(33) int[] local33 = new int[local30];
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = 0;
			for (@Pc(39) int local39 = 0; local39 < arg0.length; local39++) {
				@Pc(45) byte local45 = arg0[local39];
				@Pc(50) int[] local50 = this.anIntArrayArray94[local37];
				for (@Pc(52) int local52 = 0; local52 < 14; local52++) {
					local33[local52 + local35] += local45 * local50[local52];
				}
				local37 += this.anInt3708;
				@Pc(83) int local83 = local37 / this.anInt3710;
				local37 -= this.anInt3710 * local83;
				local35 += local83;
			}
			arg0 = new byte[local30];
			for (@Pc(108) int local108 = 0; local108 < local30; local108++) {
				@Pc(118) int local118 = local33[local108] + 32768 >> 16;
				if (local118 < -128) {
					arg0[local108] = -128;
				} else if (local118 <= 127) {
					arg0[local108] = (byte) local118;
				} else {
					arg0[local108] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BI)I")
	public int method3058(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray94 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt3708 / (long) this.anInt3710);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)I")
	public int method3059(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray94 != null) {
			arg0 = (int) ((long) this.anInt3708 * (long) arg0 / (long) this.anInt3710) + 6;
		}
		return arg0;
	}
}

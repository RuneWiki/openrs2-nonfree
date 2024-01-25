import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class261 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
	private int anInt7171;

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
	private int anInt7176;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(II)V")
	public Class261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static432.method5493(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anInt7171 = local20;
			this.anIntArrayArray60 = new int[local16][14];
			this.anInt7176 = local16;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray60[local33];
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

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)I")
	public int method5550(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray60 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt7171 / (long) this.anInt7176) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([BI)[B")
	public byte[] method5551(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray60 != null) {
			@Pc(29) int local29 = (int) ((long) this.anInt7171 * (long) arg0.length / (long) this.anInt7176) + 14;
			@Pc(32) int[] local32 = new int[local29];
			@Pc(34) int local34 = 0;
			@Pc(36) int local36 = 0;
			for (@Pc(38) int local38 = 0; local38 < arg0.length; local38++) {
				@Pc(44) byte local44 = arg0[local38];
				@Pc(49) int[] local49 = this.anIntArrayArray60[local36];
				for (@Pc(51) int local51 = 0; local51 < 14; local51++) {
					local32[local34 + local51] += local49[local51] * local44;
				}
				local36 += this.anInt7171;
				@Pc(80) int local80 = local36 / this.anInt7176;
				local34 += local80;
				local36 -= local80 * this.anInt7176;
			}
			arg0 = new byte[local29];
			for (@Pc(101) int local101 = 0; local101 < local29; local101++) {
				@Pc(111) int local111 = local32[local101] + 32768 >> 16;
				if (local111 < -128) {
					arg0[local101] = -128;
				} else if (local111 > 127) {
					arg0[local101] = 127;
				} else {
					arg0[local101] = (byte) local111;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
	public int method5552(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray60 != null) {
			arg0 = (int) ((long) this.anInt7171 * (long) arg0 / (long) this.anInt7176);
		}
		return arg0;
	}
}

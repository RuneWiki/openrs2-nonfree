import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class391 {

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
	private int anInt10564;

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
	private int anInt10568;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(II)V")
	public Class391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static144.method2500(arg1, arg0);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anInt10564 = local24;
			this.anIntArrayArray65 = new int[local20][14];
			this.anInt10568 = local20;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray65[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(73) int local73 = (int) Math.ceil(local52 + 7.0D);
				if (local73 > 14) {
					local73 = 14;
				}
				@Pc(86) double local86 = (double) local24 / (double) local20;
				while (local60 < local73) {
					@Pc(96) double local96 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(98) double local98 = local86;
					if (local96 < -1.0E-4D || local96 > 1.0E-4D) {
						local98 = local86 * (Math.sin(local96) / local96);
					}
					local98 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local98 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZI)I")
	public int method8931(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray65 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt10564 / (long) this.anInt10568) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)I")
	public int method8933(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray65 != null) {
			arg0 = (int) ((long) this.anInt10564 * (long) arg0 / (long) this.anInt10568);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "([SB)[S")
	public short[] method8934(@OriginalArg(0) short[] arg0) {
		if (this.anIntArrayArray65 != null) {
			@Pc(27) int local27 = (int) ((long) this.anInt10564 * (long) arg0.length / (long) this.anInt10568) + 14;
			@Pc(30) int[] local30 = new int[local27];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
				@Pc(42) short local42 = arg0[local36];
				@Pc(47) int[] local47 = this.anIntArrayArray65[local34];
				for (@Pc(49) int local49 = 0; local49 < 14; local49++) {
					local30[local49 + local32] += local42 * local47[local49] >> 2;
				}
				local34 += this.anInt10564;
				@Pc(80) int local80 = local34 / this.anInt10568;
				local32 += local80;
				local34 -= local80 * this.anInt10568;
			}
			arg0 = new short[local27];
			for (@Pc(105) int local105 = 0; local105 < local27; local105++) {
				@Pc(115) int local115 = local30[local105] + 8192 >> 14;
				if (local115 < -32768) {
					arg0[local105] = -32768;
				} else if (local115 > 32767) {
					arg0[local105] = 32767;
				} else {
					arg0[local105] = (short) local115;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I[B)[B")
	public byte[] method8935(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray65 != null) {
			@Pc(23) int local23 = (int) ((long) arg0.length * (long) this.anInt10564 / (long) this.anInt10568) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) byte local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray65[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local45 + local28] += local38 * local43[local45];
				}
				local30 += this.anInt10564;
				@Pc(76) int local76 = local30 / this.anInt10568;
				local30 -= this.anInt10568 * local76;
				local28 += local76;
			}
			arg0 = new byte[local23];
			for (@Pc(101) int local101 = 0; local101 < local23; local101++) {
				@Pc(111) int local111 = local26[local101] + 32768 >> 16;
				if (local111 < -128) {
					arg0[local101] = -128;
				} else if (local111 <= 127) {
					arg0[local101] = (byte) local111;
				} else {
					arg0[local101] = 127;
				}
			}
		}
		return arg0;
	}
}

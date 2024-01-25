import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class381 {

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
	private int anInt10536;

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
	private int anInt10539;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray105;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(II)V")
	public Class381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static198.method3933(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anInt10536 = local24;
			this.anInt10539 = local20;
			this.anIntArrayArray105 = new int[local24][14];
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray105[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(81) double local81 = (double) local20 / (double) local24;
				while (local70 > local60) {
					@Pc(91) double local91 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(93) double local93 = local81;
					if (local91 < -1.0E-4D || local91 > 1.0E-4D) {
						local93 = local81 * (Math.sin(local91) / local91);
					}
					local93 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local93 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I[B)[B")
	public byte[] method8653(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray105 != null) {
			@Pc(27) int local27 = (int) ((long) arg0.length * (long) this.anInt10539 / (long) this.anInt10536) + 14;
			@Pc(30) int[] local30 = new int[local27];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
				@Pc(42) byte local42 = arg0[local36];
				@Pc(47) int[] local47 = this.anIntArrayArray105[local34];
				for (@Pc(49) int local49 = 0; local49 < 14; local49++) {
					local30[local32 + local49] += local42 * local47[local49];
				}
				local34 += this.anInt10539;
				@Pc(78) int local78 = local34 / this.anInt10536;
				local34 -= this.anInt10536 * local78;
				local32 += local78;
			}
			arg0 = new byte[local27];
			for (@Pc(103) int local103 = 0; local103 < local27; local103++) {
				@Pc(113) int local113 = local30[local103] + 32768 >> 16;
				if (local113 < -128) {
					arg0[local103] = -128;
				} else if (local113 <= 127) {
					arg0[local103] = (byte) local113;
				} else {
					arg0[local103] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZI)I")
	public int method8655(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray105 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt10539 / (long) this.anInt10536) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "([SI)[S")
	public short[] method8656(@OriginalArg(0) short[] arg0) {
		if (this.anIntArrayArray105 != null) {
			@Pc(28) int local28 = (int) ((long) arg0.length * (long) this.anInt10539 / (long) this.anInt10536) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) short local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray105[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local33 + local50] += local43 * local48[local50] >> 2;
				}
				local35 += this.anInt10539;
				@Pc(83) int local83 = local35 / this.anInt10536;
				local35 -= this.anInt10536 * local83;
				local33 += local83;
			}
			arg0 = new short[local28];
			for (@Pc(104) int local104 = 0; local104 < local28; local104++) {
				@Pc(114) int local114 = local31[local104] + 8192 >> 14;
				if (local114 < -32768) {
					arg0[local104] = -32768;
				} else if (local114 <= 32767) {
					arg0[local104] = (short) local114;
				} else {
					arg0[local104] = 32767;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)I")
	public int method8657(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray105 != null) {
			arg0 = (int) ((long) this.anInt10539 * (long) arg0 / (long) this.anInt10536);
		}
		return arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class359 {

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "[J")
	public static final long[] aLongArray24 = new long[256];

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
	private int anInt9696;

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
	private int anInt9692;

	static {
		for (@Pc(69) int local69 = 0; local69 < 256; local69++) {
			@Pc(73) long local73 = (long) local69;
			for (@Pc(75) int local75 = 0; local75 < 8; local75++) {
				if ((local73 & 0x1L) == 1L) {
					local73 = local73 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local73 >>>= 0x1;
				}
			}
			aLongArray24[local69] = local73;
		}
	}

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(II)V")
	public Class359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static460.method6241(arg1, arg0);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anIntArrayArray50 = new int[local20][14];
			this.anInt9696 = local24;
			this.anInt9692 = local20;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray50[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(83) double local83 = (double) local24 / (double) local20;
				while (local60 < local70) {
					@Pc(92) double local92 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(94) double local94 = local83;
					if (local92 < -1.0E-4D || local92 > 1.0E-4D) {
						local94 = local83 * (Math.sin(local92) / local92);
					}
					local94 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local94 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I[B)[B")
	public byte[] method8258(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray50 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt9696 / (long) this.anInt9692) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray50[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local24 + local41] += local34 * local39[local41];
				}
				local26 += this.anInt9696;
				@Pc(74) int local74 = local26 / this.anInt9692;
				local24 += local74;
				local26 -= this.anInt9692 * local74;
			}
			arg0 = new byte[local19];
			for (@Pc(101) int local101 = 0; local101 < local19; local101++) {
				@Pc(113) int local113 = local22[local101] + 32768 >> 16;
				if (local113 < -128) {
					arg0[local101] = -128;
				} else if (local113 <= 127) {
					arg0[local101] = (byte) local113;
				} else {
					arg0[local101] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IB)I")
	public int method8259(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray50 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt9696 / (long) this.anInt9692);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)I")
	public int method8263(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray50 != null) {
			arg0 = (int) ((long) this.anInt9696 * (long) arg0 / (long) this.anInt9692) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "([SZ)[S")
	public short[] method8264(@OriginalArg(0) short[] arg0) {
		if (this.anIntArrayArray50 != null) {
			@Pc(26) int local26 = (int) ((long) arg0.length * (long) this.anInt9696 / (long) this.anInt9692) + 14;
			@Pc(29) int[] local29 = new int[local26];
			@Pc(31) int local31 = 0;
			@Pc(33) int local33 = 0;
			for (@Pc(35) int local35 = 0; local35 < arg0.length; local35++) {
				@Pc(41) short local41 = arg0[local35];
				@Pc(46) int[] local46 = this.anIntArrayArray50[local33];
				for (@Pc(48) int local48 = 0; local48 < 14; local48++) {
					local29[local48 + local31] += local41 * local46[local48] >> 2;
				}
				local33 += this.anInt9696;
				@Pc(83) int local83 = local33 / this.anInt9692;
				local31 += local83;
				local33 -= local83 * this.anInt9692;
			}
			arg0 = new short[local26];
			for (@Pc(110) int local110 = 0; local110 < local26; local110++) {
				@Pc(122) int local122 = local29[local110] + 8192 >> 14;
				if (local122 < -32768) {
					arg0[local110] = -32768;
				} else if (local122 > 32767) {
					arg0[local110] = 32767;
				} else {
					arg0[local110] = (short) local122;
				}
			}
		}
		return arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class225 {

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
	private int anInt6066;

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
	private int anInt6063;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(II)V")
	public Class225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static248.method4121(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anInt6066 = local24;
			this.anIntArrayArray37 = new int[local24][14];
			this.anInt6063 = local20;
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray37[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(73) int local73 = (int) Math.ceil(local52 + 7.0D);
				if (local73 > 14) {
					local73 = 14;
				}
				@Pc(86) double local86 = (double) local20 / (double) local24;
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

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "([SI)[S")
	public short[] method5473(@OriginalArg(0) short[] arg0) {
		if (this.anIntArrayArray37 != null) {
			@Pc(25) int local25 = (int) ((long) this.anInt6063 * (long) arg0.length / (long) this.anInt6066) + 14;
			@Pc(28) int[] local28 = new int[local25];
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = 0; local34 < arg0.length; local34++) {
				@Pc(40) short local40 = arg0[local34];
				@Pc(45) int[] local45 = this.anIntArrayArray37[local32];
				for (@Pc(47) int local47 = 0; local47 < 14; local47++) {
					local28[local47 + local30] += local40 * local45[local47] >> 2;
				}
				local32 += this.anInt6063;
				@Pc(78) int local78 = local32 / this.anInt6066;
				local30 += local78;
				local32 -= this.anInt6066 * local78;
			}
			arg0 = new short[local25];
			for (@Pc(99) int local99 = 0; local99 < local25; local99++) {
				@Pc(109) int local109 = local28[local99] + 8192 >> 14;
				if (local109 < -32768) {
					arg0[local99] = -32768;
				} else if (local109 > 32767) {
					arg0[local99] = 32767;
				} else {
					arg0[local99] = (short) local109;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IB)I")
	public int method5475(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray37 != null) {
			arg0 = (int) ((long) this.anInt6063 * (long) arg0 / (long) this.anInt6066);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "([BI)[B")
	public byte[] method5476(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray37 != null) {
			@Pc(24) int local24 = (int) ((long) arg0.length * (long) this.anInt6063 / (long) this.anInt6066) + 14;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(29) int local29 = 0;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
				@Pc(39) byte local39 = arg0[local33];
				@Pc(44) int[] local44 = this.anIntArrayArray37[local31];
				for (@Pc(46) int local46 = 0; local46 < 14; local46++) {
					local27[local46 + local29] += local39 * local44[local46];
				}
				local31 += this.anInt6063;
				@Pc(75) int local75 = local31 / this.anInt6066;
				local31 -= local75 * this.anInt6066;
				local29 += local75;
			}
			arg0 = new byte[local24];
			for (@Pc(100) int local100 = 0; local100 < local24; local100++) {
				@Pc(110) int local110 = local27[local100] + 32768 >> 16;
				if (local110 < -128) {
					arg0[local100] = -128;
				} else if (local110 > 127) {
					arg0[local100] = 127;
				} else {
					arg0[local100] = (byte) local110;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BI)I")
	public int method5477(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray37 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt6063 / (long) this.anInt6066) + 6;
		}
		return arg0;
	}
}

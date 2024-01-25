import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class257 {

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
	private int anInt7952;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
	private int anInt7955;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(II)V")
	public Class257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static40.method1355(arg0, arg1);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anIntArrayArray44 = new int[local20][14];
			this.anInt7952 = local24;
			this.anInt7955 = local20;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray44[local37];
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
				while (local73 > local60) {
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

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[S)[S")
	public short[] method6787(@OriginalArg(1) short[] arg0) {
		if (this.anIntArrayArray44 != null) {
			@Pc(31) int local31 = (int) ((long) this.anInt7952 * (long) arg0.length / (long) this.anInt7955) + 14;
			@Pc(34) int[] local34 = new int[local31];
			@Pc(36) int local36 = 0;
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < arg0.length; local40++) {
				@Pc(46) short local46 = arg0[local40];
				@Pc(51) int[] local51 = this.anIntArrayArray44[local38];
				for (@Pc(53) int local53 = 0; local53 < 14; local53++) {
					local34[local36 + local53] += local46 * local51[local53] >> 2;
				}
				local38 += this.anInt7952;
				@Pc(86) int local86 = local38 / this.anInt7955;
				local38 -= this.anInt7955 * local86;
				local36 += local86;
			}
			arg0 = new short[local31];
			for (@Pc(111) int local111 = 0; local111 < local31; local111++) {
				@Pc(121) int local121 = local34[local111] + 8192 >> 14;
				if (local121 < -32768) {
					arg0[local111] = -32768;
				} else if (local121 > 32767) {
					arg0[local111] = 32767;
				} else {
					arg0[local111] = (short) local121;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)I")
	public int method6789(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray44 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt7952 / (long) this.anInt7955);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([BI)[B")
	public byte[] method6791(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray44 != null) {
			@Pc(28) int local28 = (int) ((long) this.anInt7952 * (long) arg0.length / (long) this.anInt7955) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray44[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local33 + local50] += local43 * local48[local50];
				}
				local35 += this.anInt7952;
				@Pc(79) int local79 = local35 / this.anInt7955;
				local35 -= this.anInt7955 * local79;
				local33 += local79;
			}
			arg0 = new byte[local28];
			for (@Pc(100) int local100 = 0; local100 < local28; local100++) {
				@Pc(110) int local110 = local31[local100] + 32768 >> 16;
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

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
	public int method6794(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray44 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt7952 / (long) this.anInt7955) + 6;
		}
		return arg0;
	}
}

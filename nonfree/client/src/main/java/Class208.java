import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class208 {

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
	private int anInt6241;

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
	private int anInt6247;

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(II)V")
	public Class208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static496.method780(arg0, arg1);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anInt6241 = local24;
			this.anInt6247 = local20;
			this.anIntArrayArray26 = new int[local20][14];
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray26[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(73) int local73 = (int) Math.ceil(local52 + 7.0D);
				if (local73 > 14) {
					local73 = 14;
				}
				@Pc(84) double local84 = (double) local24 / (double) local20;
				while (local73 > local60) {
					@Pc(93) double local93 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(95) double local95 = local84;
					if (local93 < -1.0E-4D || local93 > 1.0E-4D) {
						local95 = local84 * (Math.sin(local93) / local93);
					}
					local95 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local95 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B[B)[B")
	public byte[] method5387(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray26 != null) {
			@Pc(28) int local28 = (int) ((long) this.anInt6241 * (long) arg0.length / (long) this.anInt6247) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray26[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local50 + local33] += local43 * local48[local50];
				}
				local35 += this.anInt6241;
				@Pc(81) int local81 = local35 / this.anInt6247;
				local33 += local81;
				local35 -= this.anInt6247 * local81;
			}
			arg0 = new byte[local28];
			for (@Pc(102) int local102 = 0; local102 < local28; local102++) {
				@Pc(112) int local112 = local31[local102] + 32768 >> 16;
				if (local112 < -128) {
					arg0[local102] = -128;
				} else if (local112 > 127) {
					arg0[local102] = 127;
				} else {
					arg0[local102] = (byte) local112;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B[S)[S")
	public short[] method5388(@OriginalArg(1) short[] arg0) {
		if (this.anIntArrayArray26 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt6241 / (long) this.anInt6247) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) short local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray26[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local24 + local41] += local39[local41] * local34 >> 2;
				}
				local26 += this.anInt6241;
				@Pc(73) int local73 = local26 / this.anInt6247;
				local24 += local73;
				local26 -= this.anInt6247 * local73;
			}
			arg0 = new short[local19];
			for (@Pc(94) int local94 = 0; local94 < local19; local94++) {
				@Pc(104) int local104 = local22[local94] + 8192 >> 14;
				if (local104 < -32768) {
					arg0[local94] = -32768;
				} else if (local104 <= 32767) {
					arg0[local94] = (short) local104;
				} else {
					arg0[local94] = 32767;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)I")
	public int method5390(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray26 != null) {
			arg0 = (int) ((long) this.anInt6241 * (long) arg0 / (long) this.anInt6247);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(II)I")
	public int method5392(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray26 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt6241 / (long) this.anInt6247) + 6;
		}
		return arg0;
	}
}

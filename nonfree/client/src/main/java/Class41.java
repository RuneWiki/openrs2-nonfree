import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class41 {

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(II)V")
	public Class41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static222.method3705(arg0, arg1);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anInt969 = local20;
			this.anInt970 = local24;
			this.anIntArrayArray7 = new int[local20][14];
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray7[local37];
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
				while (local60 < local73) {
					@Pc(94) double local94 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(96) double local96 = local84;
					if (local94 < -1.0E-4D || local94 > 1.0E-4D) {
						local96 = local84 * (Math.sin(local94) / local94);
					}
					local96 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local96 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)I")
	public int method861(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray7 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt970 / (long) this.anInt969);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B[B)[B")
	public byte[] method865(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray7 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt970 / (long) this.anInt969) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray7[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local24 + local41] += local39[local41] * local34;
				}
				local26 += this.anInt970;
				@Pc(71) int local71 = local26 / this.anInt969;
				local26 -= local71 * this.anInt969;
				local24 += local71;
			}
			arg0 = new byte[local19];
			for (@Pc(92) int local92 = 0; local92 < local19; local92++) {
				@Pc(102) int local102 = local22[local92] + 32768 >> 16;
				if (local102 < -128) {
					arg0[local92] = -128;
				} else if (local102 <= 127) {
					arg0[local92] = (byte) local102;
				} else {
					arg0[local92] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)I")
	public int method866(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray7 != null) {
			arg0 = (int) ((long) this.anInt970 * (long) arg0 / (long) this.anInt969) + 6;
		}
		return arg0;
	}
}

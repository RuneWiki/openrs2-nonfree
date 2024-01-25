import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class63 {

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	private int anInt1776;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
	private int anInt1777;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(II)V")
	public Class63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static318.method5331(arg0, arg1);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anInt1776 = local20;
			this.anIntArrayArray11 = new int[local20][14];
			this.anInt1777 = local24;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray11[local37];
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
				while (local70 > local60) {
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

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I")
	public int method1473(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray11 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1777 / (long) this.anInt1776) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZI)I")
	public int method1476(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray11 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1777 / (long) this.anInt1776);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[B)[B")
	public byte[] method1479(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray11 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt1777 / (long) this.anInt1776) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray11[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local24 + local41] += local34 * local39[local41];
				}
				local26 += this.anInt1777;
				@Pc(71) int local71 = local26 / this.anInt1776;
				local24 += local71;
				local26 -= local71 * this.anInt1776;
			}
			arg0 = new byte[local19];
			for (@Pc(92) int local92 = 0; local92 < local19; local92++) {
				@Pc(102) int local102 = local22[local92] + 32768 >> 16;
				if (local102 < -128) {
					arg0[local92] = -128;
				} else if (local102 > 127) {
					arg0[local92] = 127;
				} else {
					arg0[local92] = (byte) local102;
				}
			}
		}
		return arg0;
	}
}

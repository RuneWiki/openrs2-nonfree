import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class56 {

	@OriginalMember(owner = "client!t", name = "g", descriptor = "I")
	private final int anInt2129;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "I")
	private final int anInt2127;

	@OriginalMember(owner = "client!t", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
	public Class56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = Static67.method1100(arg1, arg0);
		@Pc(12) int local12 = arg1 / local8;
		this.anInt2129 = local12;
		@Pc(19) int local19 = arg0 / local8;
		this.anInt2127 = local19;
		if (local19 != local12) {
			this.anIntArrayArray23 = new int[local19][14];
			for (@Pc(37) int local37 = 0; local37 < local19; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray23[local37];
				@Pc(52) double local52 = (double) local37 / (double) local19 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(73) int local73 = (int) Math.ceil(local52 + 7.0D);
				if (local73 > 14) {
					local73 = 14;
				}
				@Pc(84) double local84 = (double) local12 / (double) local19;
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

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)I")
	public int method1462(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray23 != null) {
			arg0 = this.anInt2129 * arg0 / this.anInt2127 + 7;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(II)I")
	public int method1463(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray23 != null) {
			arg0 = arg0 * this.anInt2129 / this.anInt2127;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I[B)[B")
	public byte[] method1465(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray23 != null) {
			@Pc(15) int local15 = this.anInt2129 * arg0.length / this.anInt2127 + 14;
			@Pc(18) int[] local18 = new int[local15];
			@Pc(20) int local20 = 0;
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < arg0.length; local24++) {
				@Pc(31) int[] local31 = this.anIntArrayArray23[local20];
				@Pc(35) byte local35 = arg0[local24];
				for (@Pc(37) int local37 = 0; local37 < 14; local37++) {
					local18[local22 + local37] += local35 * local31[local37];
				}
				local20 += this.anInt2129;
				@Pc(67) int local67 = local20 / this.anInt2127;
				local22 += local67;
				local20 -= this.anInt2127 * local67;
			}
			arg0 = new byte[local15];
			for (@Pc(92) int local92 = 0; local92 < local15; local92++) {
				@Pc(102) int local102 = local18[local92] + 32768 >> 16;
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
}

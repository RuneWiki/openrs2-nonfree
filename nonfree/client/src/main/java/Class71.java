import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class71 {

	@OriginalMember(owner = "client!td", name = "m", descriptor = "I")
	private int anInt2803;

	@OriginalMember(owner = "client!td", name = "y", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!td", name = "j", descriptor = "I")
	private int anInt2800;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(II)V")
	public Class71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static63.method1253(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			this.anInt2803 = local20;
			@Pc(27) int local27 = arg0 / local16;
			this.anIntArrayArray29 = new int[local27][14];
			this.anInt2800 = local27;
			for (@Pc(37) int local37 = 0; local37 < local27; local37++) {
				@Pc(47) double local47 = (double) local37 / (double) local27 + 6.0D;
				@Pc(52) int[] local52 = this.anIntArrayArray29[local37];
				@Pc(58) double local58 = (double) local20 / (double) local27;
				@Pc(66) int local66 = (int) Math.floor(local47 + 1.0D - 7.0D);
				@Pc(72) int local72 = (int) Math.ceil(local47 + 7.0D);
				if (local66 < 0) {
					local66 = 0;
				}
				if (local72 > 14) {
					local72 = 14;
				}
				while (local72 > local66) {
					@Pc(92) double local92 = ((double) local66 - local47) * 3.141592653589793D;
					@Pc(94) double local94 = local58;
					if (local92 < -1.0E-4D || local92 > 1.0E-4D) {
						local94 = local58 * (Math.sin(local92) / local92);
					}
					local94 *= Math.cos(((double) local66 - local47) * 0.2243994752564138D) * 0.46D + 0.54D;
					local52[local66] = (int) Math.floor(local94 * 65536.0D + 0.5D);
					local66++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B[B)[B")
	public byte[] method1925(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray29 != null) {
			@Pc(28) int local28 = (int) ((long) this.anInt2803 * (long) arg0.length / (long) this.anInt2800) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray29[local35];
				@Pc(48) byte local48 = arg0[local37];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local50 + local33] += local44[local50] * local48;
				}
				local35 += this.anInt2803;
				@Pc(81) int local81 = local35 / this.anInt2800;
				local33 += local81;
				local35 -= local81 * this.anInt2800;
			}
			arg0 = new byte[local28];
			for (@Pc(102) int local102 = 0; local102 < local28; local102++) {
				@Pc(112) int local112 = local31[local102] + 32768 >> 16;
				if (local112 < -128) {
					arg0[local102] = -128;
				} else if (local112 <= 127) {
					arg0[local102] = (byte) local112;
				} else {
					arg0[local102] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(BI)I")
	public int method1927(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray29 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2803 / (long) this.anInt2800);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)I")
	public int method1928(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray29 != null) {
			arg0 = (int) ((long) this.anInt2803 * (long) arg0 / (long) this.anInt2800) + 6;
		}
		return arg0;
	}
}

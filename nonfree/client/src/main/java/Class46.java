import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class46 {

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
	private int anInt2046;

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
	private int anInt2047;

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(II)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static217.method3555(arg0, arg1);
			@Pc(16) int local16 = arg1 / local12;
			this.anInt2046 = local16;
			@Pc(23) int local23 = arg0 / local12;
			this.anInt2047 = local23;
			this.anIntArrayArray16 = new int[local23][14];
			for (@Pc(33) int local33 = 0; local33 < local23; local33++) {
				@Pc(43) double local43 = (double) local33 / (double) local23 + 6.0D;
				@Pc(48) int[] local48 = this.anIntArrayArray16[local33];
				@Pc(56) int local56 = (int) Math.floor(local43 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local43 + 7.0D);
				if (local69 > 14) {
					local69 = 14;
				}
				@Pc(80) double local80 = (double) local16 / (double) local23;
				while (local56 < local69) {
					@Pc(84) double local84 = local80;
					@Pc(91) double local91 = ((double) local56 - local43) * 3.141592653589793D;
					if (local91 < -1.0E-4D || local91 > 1.0E-4D) {
						local84 = local80 * (Math.sin(local91) / local91);
					}
					local84 *= Math.cos(((double) local56 - local43) * 0.2243994752564138D) * 0.46D + 0.54D;
					local48[local56] = (int) Math.floor(local84 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)I")
	public int method1473(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray16 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2046 / (long) this.anInt2047) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B[B)[B")
	public byte[] method1475(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray16 != null) {
			@Pc(6) int local6 = 0;
			@Pc(21) int local21 = (int) ((long) arg0.length * (long) this.anInt2046 / (long) this.anInt2047) + 14;
			@Pc(23) int local23 = 0;
			@Pc(26) int[] local26 = new int[local21];
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray16[local23];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local26[local41 + local6] += local39[local41] * local34;
				}
				local23 += this.anInt2046;
				@Pc(72) int local72 = local23 / this.anInt2047;
				local6 += local72;
				local23 -= this.anInt2047 * local72;
			}
			arg0 = new byte[local21];
			for (@Pc(93) int local93 = 0; local93 < local21; local93++) {
				@Pc(103) int local103 = local26[local93] + 32768 >> 16;
				if (local103 < -128) {
					arg0[local93] = -128;
				} else if (local103 > 127) {
					arg0[local93] = 127;
				} else {
					arg0[local93] = (byte) local103;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)I")
	public int method1476(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray16 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2046 / (long) this.anInt2047);
		}
		return arg0;
	}
}

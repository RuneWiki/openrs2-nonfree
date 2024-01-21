import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class15 {

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
	private int anInt544;

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
	private int anInt547;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(II)V")
	public Class15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static30.method3171(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			this.anInt544 = local20;
			@Pc(27) int local27 = arg0 / local16;
			this.anInt547 = local27;
			this.anIntArrayArray6 = new int[local27][14];
			for (@Pc(37) int local37 = 0; local37 < local27; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray6[local37];
				@Pc(52) double local52 = (double) local37 / (double) local27 + 6.0D;
				@Pc(58) double local58 = (double) local20 / (double) local27;
				@Pc(66) int local66 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local66 < 0) {
					local66 = 0;
				}
				@Pc(79) int local79 = (int) Math.ceil(local52 + 7.0D);
				if (local79 > 14) {
					local79 = 14;
				}
				while (local66 < local79) {
					@Pc(94) double local94 = ((double) local66 - local52) * 3.141592653589793D;
					@Pc(96) double local96 = local58;
					if (local94 < -1.0E-4D || local94 > 1.0E-4D) {
						local96 = local58 * (Math.sin(local94) / local94);
					}
					local96 *= Math.cos(((double) local66 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local66] = (int) Math.floor(local96 * 65536.0D + 0.5D);
					local66++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)I")
	public int method364(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray6 != null) {
			arg0 = (int) ((long) this.anInt544 * (long) arg0 / (long) this.anInt547);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)I")
	public int method365(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray6 != null) {
			arg0 = (int) ((long) this.anInt544 * (long) arg0 / (long) this.anInt547) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[B)[B")
	public byte[] method367(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray6 != null) {
			@Pc(28) int local28 = (int) ((long) arg0.length * (long) this.anInt544 / (long) this.anInt547) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray6[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local50 + local33] += local48[local50] * local43;
				}
				local35 += this.anInt544;
				@Pc(81) int local81 = local35 / this.anInt547;
				local33 += local81;
				local35 -= this.anInt547 * local81;
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
}

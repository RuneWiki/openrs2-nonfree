import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class217 {

	@OriginalMember(owner = "client!lt", name = "j", descriptor = "I")
	private int anInt6036;

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
	private int anInt6030;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(II)V")
	public Class217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static433.method7308(arg1, arg0);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anInt6036 = local20;
			this.anIntArrayArray38 = new int[local16][14];
			this.anInt6030 = local16;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray38[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local48 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				@Pc(77) double local77 = (double) local20 / (double) local16;
				while (local56 < local66) {
					@Pc(87) double local87 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(89) double local89 = local77;
					if (local87 < -1.0E-4D || local87 > 1.0E-4D) {
						local89 = local77 * (Math.sin(local87) / local87);
					}
					local89 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local89 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I[S)[S")
	public short[] method5102(@OriginalArg(1) short[] arg0) {
		if (this.anIntArrayArray38 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt6036 / (long) this.anInt6030) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) short local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray38[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local24 + local41] += local39[local41] * local34 >> 2;
				}
				local26 += this.anInt6036;
				@Pc(73) int local73 = local26 / this.anInt6030;
				local24 += local73;
				local26 -= this.anInt6030 * local73;
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

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I[B)[B")
	public byte[] method5105(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray38 != null) {
			@Pc(27) int local27 = (int) ((long) this.anInt6036 * (long) arg0.length / (long) this.anInt6030) + 14;
			@Pc(30) int[] local30 = new int[local27];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
				@Pc(42) byte local42 = arg0[local36];
				@Pc(47) int[] local47 = this.anIntArrayArray38[local34];
				for (@Pc(49) int local49 = 0; local49 < 14; local49++) {
					local30[local49 + local32] += local47[local49] * local42;
				}
				local34 += this.anInt6036;
				@Pc(80) int local80 = local34 / this.anInt6030;
				local32 += local80;
				local34 -= this.anInt6030 * local80;
			}
			arg0 = new byte[local27];
			for (@Pc(105) int local105 = 0; local105 < local27; local105++) {
				@Pc(115) int local115 = local30[local105] + 32768 >> 16;
				if (local115 < -128) {
					arg0[local105] = -128;
				} else if (local115 > 127) {
					arg0[local105] = 127;
				} else {
					arg0[local105] = (byte) local115;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IZ)I")
	public int method5108(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray38 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt6036 / (long) this.anInt6030);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IB)I")
	public int method5109(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray38 != null) {
			arg0 = (int) ((long) this.anInt6036 * (long) arg0 / (long) this.anInt6030) + 6;
		}
		return arg0;
	}
}

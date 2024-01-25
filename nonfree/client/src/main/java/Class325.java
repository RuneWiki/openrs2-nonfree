import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class325 {

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
	private int anInt9017;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
	private int anInt9014;

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(II)V")
	public Class325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static186.method2985(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anInt9017 = local16;
			this.anInt9014 = local20;
			this.anIntArrayArray53 = new int[local16][14];
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray53[local33];
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

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([SI)[S")
	public short[] method7727(@OriginalArg(0) short[] arg0) {
		if (this.anIntArrayArray53 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt9014 / (long) this.anInt9017) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) short local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray53[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local41 + local24] += local34 * local39[local41] >> 2;
				}
				local26 += this.anInt9014;
				@Pc(74) int local74 = local26 / this.anInt9017;
				local24 += local74;
				local26 -= this.anInt9017 * local74;
			}
			arg0 = new short[local19];
			for (@Pc(99) int local99 = 0; local99 < local19; local99++) {
				@Pc(109) int local109 = local22[local99] + 8192 >> 14;
				if (local109 < -32768) {
					arg0[local99] = -32768;
				} else if (local109 <= 32767) {
					arg0[local99] = (short) local109;
				} else {
					arg0[local99] = 32767;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)I")
	public int method7728(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray53 != null) {
			arg0 = (int) ((long) this.anInt9014 * (long) arg0 / (long) this.anInt9017);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)I")
	public int method7729(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray53 != null) {
			arg0 = (int) ((long) this.anInt9014 * (long) arg0 / (long) this.anInt9017) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([BI)[B")
	public byte[] method7730(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray53 != null) {
			@Pc(27) int local27 = (int) ((long) arg0.length * (long) this.anInt9014 / (long) this.anInt9017) + 14;
			@Pc(30) int[] local30 = new int[local27];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
				@Pc(42) byte local42 = arg0[local36];
				@Pc(47) int[] local47 = this.anIntArrayArray53[local34];
				for (@Pc(49) int local49 = 0; local49 < 14; local49++) {
					local30[local32 + local49] += local47[local49] * local42;
				}
				local34 += this.anInt9014;
				@Pc(80) int local80 = local34 / this.anInt9017;
				local32 += local80;
				local34 -= local80 * this.anInt9017;
			}
			arg0 = new byte[local27];
			for (@Pc(101) int local101 = 0; local101 < local27; local101++) {
				@Pc(111) int local111 = local30[local101] + 32768 >> 16;
				if (local111 < -128) {
					arg0[local101] = -128;
				} else if (local111 <= 127) {
					arg0[local101] = (byte) local111;
				} else {
					arg0[local101] = 127;
				}
			}
		}
		return arg0;
	}
}

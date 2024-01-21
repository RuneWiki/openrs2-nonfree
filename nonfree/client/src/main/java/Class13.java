import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class13 {

	@OriginalMember(owner = "client!d", name = "l", descriptor = "I")
	private int anInt758;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "I")
	private int anInt750;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(II)V")
	public Class13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static22.method366(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			this.anInt758 = local16;
			@Pc(23) int local23 = arg1 / local12;
			this.anIntArrayArray8 = new int[local16][14];
			this.anInt750 = local23;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray8[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local48 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				@Pc(77) double local77 = (double) local23 / (double) local16;
				while (local56 < local66) {
					@Pc(86) double local86 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(88) double local88 = local77;
					if (local86 < -1.0E-4D || local86 > 1.0E-4D) {
						local88 = local77 * (Math.sin(local86) / local86);
					}
					local88 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local88 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZI)I")
	public int method594(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray8 != null) {
			arg0 = (int) ((long) this.anInt750 * (long) arg0 / (long) this.anInt758);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)I")
	public int method596(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray8 != null) {
			arg0 = (int) ((long) this.anInt750 * (long) arg0 / (long) this.anInt758) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([BB)[B")
	public byte[] method598(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray8 != null) {
			@Pc(27) int local27 = (int) ((long) this.anInt750 * (long) arg0.length / (long) this.anInt758) + 14;
			@Pc(30) int[] local30 = new int[local27];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
				@Pc(43) int[] local43 = this.anIntArrayArray8[local32];
				@Pc(47) byte local47 = arg0[local36];
				for (@Pc(49) int local49 = 0; local49 < 14; local49++) {
					local30[local34 + local49] += local43[local49] * local47;
				}
				local32 += this.anInt750;
				@Pc(81) int local81 = local32 / this.anInt758;
				local32 -= local81 * this.anInt758;
				local34 += local81;
			}
			arg0 = new byte[local27];
			for (@Pc(102) int local102 = 0; local102 < local27; local102++) {
				@Pc(112) int local112 = local30[local102] + 32768 >> 16;
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

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class250 {

	@OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
	private int anInt7804;

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray69;

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
	private int anInt7800;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(II)V")
	public Class250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static450.method6873(arg0, arg1);
			@Pc(16) int local16 = arg0 / local12;
			@Pc(20) int local20 = arg1 / local12;
			this.anInt7804 = local16;
			this.anIntArrayArray69 = new int[local16][14];
			this.anInt7800 = local20;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray69[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local48 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				@Pc(79) double local79 = (double) local20 / (double) local16;
				while (local66 > local56) {
					@Pc(89) double local89 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(91) double local91 = local79;
					if (local89 < -1.0E-4D || local89 > 1.0E-4D) {
						local91 = local79 * (Math.sin(local89) / local89);
					}
					local91 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local91 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "([BZ)[B")
	public byte[] method6532(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray69 != null) {
			@Pc(27) int local27 = (int) ((long) arg0.length * (long) this.anInt7800 / (long) this.anInt7804) + 14;
			@Pc(30) int[] local30 = new int[local27];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
				@Pc(42) byte local42 = arg0[local36];
				@Pc(47) int[] local47 = this.anIntArrayArray69[local34];
				for (@Pc(49) int local49 = 0; local49 < 14; local49++) {
					local30[local32 + local49] += local42 * local47[local49];
				}
				local34 += this.anInt7800;
				@Pc(81) int local81 = local34 / this.anInt7804;
				local32 += local81;
				local34 -= this.anInt7804 * local81;
			}
			arg0 = new byte[local27];
			for (@Pc(106) int local106 = 0; local106 < local27; local106++) {
				@Pc(116) int local116 = local30[local106] + 32768 >> 16;
				if (local116 < -128) {
					arg0[local106] = -128;
				} else if (local116 > 127) {
					arg0[local106] = 127;
				} else {
					arg0[local106] = (byte) local116;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZ)I")
	public int method6533(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray69 != null) {
			arg0 = (int) ((long) this.anInt7800 * (long) arg0 / (long) this.anInt7804);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)I")
	public int method6534(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray69 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt7800 / (long) this.anInt7804) + 6;
		}
		return arg0;
	}
}

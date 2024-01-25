import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class260 {

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
	private int anInt7620;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
	private int anInt7622;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(II)V")
	public Class260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static328.method5377(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anInt7620 = local20;
			this.anIntArrayArray44 = new int[local24][14];
			this.anInt7622 = local24;
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray44[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(73) int local73 = (int) Math.ceil(local52 + 7.0D);
				if (local73 > 14) {
					local73 = 14;
				}
				@Pc(86) double local86 = (double) local20 / (double) local24;
				while (local73 > local60) {
					@Pc(96) double local96 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(98) double local98 = local86;
					if (local96 < -1.0E-4D || local96 > 1.0E-4D) {
						local98 = local86 * (Math.sin(local96) / local96);
					}
					local98 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local98 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([BZ)[B")
	public byte[] method6287(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray44 != null) {
			@Pc(27) int local27 = (int) ((long) this.anInt7620 * (long) arg0.length / (long) this.anInt7622) + 14;
			@Pc(30) int[] local30 = new int[local27];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
				@Pc(42) byte local42 = arg0[local36];
				@Pc(47) int[] local47 = this.anIntArrayArray44[local34];
				for (@Pc(49) int local49 = 0; local49 < 14; local49++) {
					local30[local32 + local49] += local47[local49] * local42;
				}
				local34 += this.anInt7620;
				@Pc(81) int local81 = local34 / this.anInt7622;
				local34 -= local81 * this.anInt7622;
				local32 += local81;
			}
			arg0 = new byte[local27];
			for (@Pc(106) int local106 = 0; local106 < local27; local106++) {
				@Pc(116) int local116 = local30[local106] + 32768 >> 16;
				if (local116 < -128) {
					arg0[local106] = -128;
				} else if (local116 <= 127) {
					arg0[local106] = (byte) local116;
				} else {
					arg0[local106] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)I")
	public int method6288(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray44 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt7620 / (long) this.anInt7622) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)I")
	public int method6289(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray44 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt7620 / (long) this.anInt7622);
		}
		return arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nga")
public final class Class250 {

	@OriginalMember(owner = "client!nga", name = "e", descriptor = "I")
	private int anInt7034;

	@OriginalMember(owner = "client!nga", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!nga", name = "i", descriptor = "I")
	private int anInt7029;

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(II)V")
	public Class250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(10) int local10 = Static28.method5492(arg1, arg0);
			@Pc(14) int local14 = arg1 / local10;
			@Pc(18) int local18 = arg0 / local10;
			this.anInt7034 = local14;
			this.anIntArrayArray46 = new int[local18][14];
			this.anInt7029 = local18;
			for (@Pc(31) int local31 = 0; local31 < local18; local31++) {
				@Pc(37) int[] local37 = this.anIntArrayArray46[local31];
				@Pc(45) double local45 = (double) local31 / (double) local18 + 6.0D;
				@Pc(53) int local53 = (int) Math.floor(local45 + 1.0D - 7.0D);
				if (local53 < 0) {
					local53 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local45 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				@Pc(79) double local79 = (double) local14 / (double) local18;
				while (local66 > local53) {
					@Pc(88) double local88 = ((double) local53 - local45) * 3.141592653589793D;
					@Pc(90) double local90 = local79;
					if (local88 < -1.0E-4D || local88 > 1.0E-4D) {
						local90 = local79 * (Math.sin(local88) / local88);
					}
					local90 *= Math.cos(((double) local53 - local45) * 0.2243994752564138D) * 0.46D + 0.54D;
					local37[local53] = (int) Math.floor(local90 * 65536.0D + 0.5D);
					local53++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IB)I")
	public int method6130(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray46 != null) {
			arg0 = (int) ((long) this.anInt7034 * (long) arg0 / (long) this.anInt7029) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "([BI)[B")
	public byte[] method6131(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray46 != null) {
			@Pc(33) int local33 = (int) ((long) this.anInt7034 * (long) arg0.length / (long) this.anInt7029) + 14;
			@Pc(36) int[] local36 = new int[local33];
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < arg0.length; local42++) {
				@Pc(48) byte local48 = arg0[local42];
				@Pc(53) int[] local53 = this.anIntArrayArray46[local40];
				for (@Pc(55) int local55 = 0; local55 < 14; local55++) {
					local36[local55 + local38] += local53[local55] * local48;
				}
				local40 += this.anInt7034;
				@Pc(86) int local86 = local40 / this.anInt7029;
				local38 += local86;
				local40 -= this.anInt7029 * local86;
			}
			arg0 = new byte[local33];
			for (@Pc(113) int local113 = 0; local113 < local33; local113++) {
				@Pc(125) int local125 = local36[local113] + 32768 >> 16;
				if (local125 < -128) {
					arg0[local113] = -128;
				} else if (local125 <= 127) {
					arg0[local113] = (byte) local125;
				} else {
					arg0[local113] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "([SB)[S")
	public short[] method6132(@OriginalArg(0) short[] arg0) {
		if (this.anIntArrayArray46 != null) {
			@Pc(29) int local29 = (int) ((long) this.anInt7034 * (long) arg0.length / (long) this.anInt7029) + 14;
			@Pc(32) int[] local32 = new int[local29];
			@Pc(34) int local34 = 0;
			@Pc(36) int local36 = 0;
			for (@Pc(38) int local38 = 0; local38 < arg0.length; local38++) {
				@Pc(43) short local43 = arg0[local38];
				@Pc(48) int[] local48 = this.anIntArrayArray46[local36];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local32[local50 + local34] += local48[local50] * local43 >> 2;
				}
				local36 += this.anInt7034;
				@Pc(82) int local82 = local36 / this.anInt7029;
				local34 += local82;
				local36 -= this.anInt7029 * local82;
			}
			arg0 = new short[local29];
			for (@Pc(107) int local107 = 0; local107 < local29; local107++) {
				@Pc(116) int local116 = local32[local107] + 8192 >> 14;
				if (local116 < -32768) {
					arg0[local107] = -32768;
				} else if (local116 > 32767) {
					arg0[local107] = 32767;
				} else {
					arg0[local107] = (short) local116;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(II)I")
	public int method6133(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray46 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt7034 / (long) this.anInt7029);
		}
		return arg0;
	}
}

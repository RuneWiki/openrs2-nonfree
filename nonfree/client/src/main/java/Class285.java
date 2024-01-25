import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class285 {

	@OriginalMember(owner = "client!qu", name = "f", descriptor = "[C")
	public static final char[] aCharArray8 = new char[64];

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
	private int anInt8435;

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
	private int anInt8433;

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray8[local4] = (char) (local4 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray8[local20] = (char) (local20 + 71);
		}
		for (@Pc(34) int local34 = 52; local34 < 62; local34++) {
			aCharArray8[local34] = (char) (local34 - 4);
		}
		aCharArray8[62] = '+';
		aCharArray8[63] = '/';
	}

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(II)V")
	public Class285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static566.method7998(arg1, arg0);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anInt8435 = local20;
			this.anInt8433 = local24;
			this.anIntArrayArray49 = new int[local20][14];
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray49[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(81) double local81 = (double) local24 / (double) local20;
				while (local60 < local70) {
					@Pc(91) double local91 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(93) double local93 = local81;
					if (local91 < -1.0E-4D || local91 > 1.0E-4D) {
						local93 = local81 * (Math.sin(local91) / local91);
					}
					local93 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local93 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)I")
	public int method6531(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray49 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt8433 / (long) this.anInt8435) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I[B)[B")
	public byte[] method6532(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray49 != null) {
			@Pc(24) int local24 = (int) ((long) this.anInt8433 * (long) arg0.length / (long) this.anInt8435) + 14;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(29) int local29 = 0;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
				@Pc(39) byte local39 = arg0[local33];
				@Pc(44) int[] local44 = this.anIntArrayArray49[local31];
				for (@Pc(46) int local46 = 0; local46 < 14; local46++) {
					local27[local29 + local46] += local39 * local44[local46];
				}
				local31 += this.anInt8433;
				@Pc(77) int local77 = local31 / this.anInt8435;
				local29 += local77;
				local31 -= this.anInt8435 * local77;
			}
			arg0 = new byte[local24];
			for (@Pc(102) int local102 = 0; local102 < local24; local102++) {
				@Pc(112) int local112 = local27[local102] + 32768 >> 16;
				if (local112 < -128) {
					arg0[local102] = -128;
				} else if (local112 > 127) {
					arg0[local102] = 127;
				} else {
					arg0[local102] = (byte) local112;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(II)I")
	public int method6536(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray49 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt8433 / (long) this.anInt8435);
		}
		return arg0;
	}
}

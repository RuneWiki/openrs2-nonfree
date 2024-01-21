import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class16 {

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
	private final int anInt563;

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
	private final int anInt565;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(II)V")
	public Class16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = Static83.method1516(arg0, arg1);
		@Pc(12) int local12 = arg1 / local8;
		this.anInt563 = local12;
		@Pc(19) int local19 = arg0 / local8;
		this.anInt565 = local19;
		if (local12 != local19) {
			this.anIntArrayArray2 = new int[local19][14];
			for (@Pc(33) int local33 = 0; local33 < local19; local33++) {
				@Pc(43) double local43 = (double) local33 / (double) local19 + 6.0D;
				@Pc(48) int[] local48 = this.anIntArrayArray2[local33];
				@Pc(56) int local56 = (int) Math.floor(local43 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local43 + 7.0D);
				@Pc(75) double local75 = (double) local12 / (double) local19;
				if (local69 > 14) {
					local69 = 14;
				}
				while (local69 > local56) {
					@Pc(86) double local86 = local75;
					@Pc(93) double local93 = ((double) local56 - local43) * 3.141592653589793D;
					if (local93 < -1.0E-4D || local93 > 1.0E-4D) {
						local86 = local75 * (Math.sin(local93) / local93);
					}
					local86 *= Math.cos(((double) local56 - local43) * 0.2243994752564138D) * 0.46D + 0.54D;
					local48[local56] = (int) Math.floor(local86 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)I")
	public int method408(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray2 != null) {
			arg0 = arg0 * this.anInt563 / this.anInt565 + 7;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)I")
	public int method409(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray2 != null) {
			arg0 = this.anInt563 * arg0 / this.anInt565;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B[B)[B")
	public byte[] method410(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray2 != null) {
			@Pc(24) int local24 = arg0.length * this.anInt563 / this.anInt565 + 14;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(29) int local29 = 0;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
				@Pc(39) byte local39 = arg0[local33];
				@Pc(44) int[] local44 = this.anIntArrayArray2[local31];
				for (@Pc(46) int local46 = 0; local46 < 14; local46++) {
					local27[local46 + local29] += local39 * local44[local46];
				}
				local31 += this.anInt563;
				@Pc(77) int local77 = local31 / this.anInt565;
				local31 -= this.anInt565 * local77;
				local29 += local77;
			}
			arg0 = new byte[local24];
			for (@Pc(102) int local102 = 0; local102 < local24; local102++) {
				@Pc(112) int local112 = local27[local102] + 32768 >> 16;
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

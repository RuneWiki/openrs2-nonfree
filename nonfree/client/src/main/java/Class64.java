import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class64 {

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	private int anInt1891;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
	private int anInt1893;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(II)V")
	public Class64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static72.method1240(arg0, arg1);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anInt1891 = local20;
			this.anIntArrayArray19 = new int[local24][14];
			this.anInt1893 = local24;
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray19[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) double local70 = (double) local20 / (double) local24;
				@Pc(76) int local76 = (int) Math.ceil(local52 + 7.0D);
				if (local76 > 14) {
					local76 = 14;
				}
				while (local76 > local60) {
					@Pc(90) double local90 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(92) double local92 = local70;
					if (local90 < -1.0E-4D || local90 > 1.0E-4D) {
						local92 = local70 * (Math.sin(local90) / local90);
					}
					local92 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local92 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZ)I")
	public int method1442(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray19 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1891 / (long) this.anInt1893) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)I")
	public int method1445(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray19 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt1891 / (long) this.anInt1893);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[B)[B")
	public byte[] method1446(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray19 != null) {
			@Pc(27) int local27 = (int) ((long) arg0.length * (long) this.anInt1891 / (long) this.anInt1893) + 14;
			@Pc(29) int local29 = 0;
			@Pc(31) int local31 = 0;
			@Pc(34) int[] local34 = new int[local27];
			for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
				@Pc(42) byte local42 = arg0[local36];
				@Pc(47) int[] local47 = this.anIntArrayArray19[local31];
				for (@Pc(49) int local49 = 0; local49 < 14; local49++) {
					local34[local49 + local29] += local42 * local47[local49];
				}
				local31 += this.anInt1891;
				@Pc(80) int local80 = local31 / this.anInt1893;
				local31 -= local80 * this.anInt1893;
				local29 += local80;
			}
			arg0 = new byte[local27];
			for (@Pc(101) int local101 = 0; local101 < local27; local101++) {
				@Pc(111) int local111 = local34[local101] + 32768 >> 16;
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

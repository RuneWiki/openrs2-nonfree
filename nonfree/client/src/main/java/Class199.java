import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class199 {

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
	private int anInt6228;

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
	private int anInt6225;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	static {
		new Class175(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(II)V")
	public Class199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static240.method3750(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anInt6228 = local24;
			this.anInt6225 = local20;
			this.anIntArrayArray51 = new int[local24][14];
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray51[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(73) int local73 = (int) Math.ceil(local52 + 7.0D);
				if (local73 > 14) {
					local73 = 14;
				}
				@Pc(84) double local84 = (double) local20 / (double) local24;
				while (local73 > local60) {
					@Pc(94) double local94 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(96) double local96 = local84;
					if (local94 < -1.0E-4D || local94 > 1.0E-4D) {
						local96 = local84 * (Math.sin(local94) / local94);
					}
					local96 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local96 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)I")
	public int method4903(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray51 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt6225 / (long) this.anInt6228);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)I")
	public int method4905(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray51 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt6225 / (long) this.anInt6228) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I[B)[B")
	public byte[] method4906(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray51 != null) {
			@Pc(17) int local17 = (int) ((long) arg0.length * (long) this.anInt6225 / (long) this.anInt6228) + 14;
			@Pc(20) int[] local20 = new int[local17];
			@Pc(22) int local22 = 0;
			@Pc(24) int local24 = 0;
			for (@Pc(26) int local26 = 0; local26 < arg0.length; local26++) {
				@Pc(31) byte local31 = arg0[local26];
				@Pc(36) int[] local36 = this.anIntArrayArray51[local24];
				for (@Pc(38) int local38 = 0; local38 < 14; local38++) {
					local20[local22 + local38] += local31 * local36[local38];
				}
				local24 += this.anInt6225;
				@Pc(66) int local66 = local24 / this.anInt6228;
				local24 -= local66 * this.anInt6228;
				local22 += local66;
			}
			arg0 = new byte[local17];
			for (@Pc(91) int local91 = 0; local91 < local17; local91++) {
				@Pc(100) int local100 = local20[local91] + 32768 >> 16;
				if (local100 < -128) {
					arg0[local91] = -128;
				} else if (local100 <= 127) {
					arg0[local91] = (byte) local100;
				} else {
					arg0[local91] = 127;
				}
			}
		}
		return arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pea")
public final class Class250 {

	@OriginalMember(owner = "client!pea", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "I")
	private int anInt6843;

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "I")
	private int anInt6841;

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(II)V")
	public Class250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static54.method1200(arg0, arg1);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anIntArrayArray62 = new int[local24][14];
			this.anInt6843 = local20;
			this.anInt6841 = local24;
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray62[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(81) double local81 = (double) local20 / (double) local24;
				while (local60 < local70) {
					@Pc(90) double local90 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(92) double local92 = local81;
					if (local90 < -1.0E-4D || local90 > 1.0E-4D) {
						local92 = local81 * (Math.sin(local90) / local90);
					}
					local92 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local92 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(BI)I")
	public int method5742(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray62 != null) {
			arg0 = (int) ((long) this.anInt6843 * (long) arg0 / (long) this.anInt6841);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(B[B)[B")
	public byte[] method5743(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray62 != null) {
			@Pc(27) int local27 = (int) ((long) arg0.length * (long) this.anInt6843 / (long) this.anInt6841) + 14;
			@Pc(30) int[] local30 = new int[local27];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
				@Pc(42) byte local42 = arg0[local36];
				@Pc(47) int[] local47 = this.anIntArrayArray62[local34];
				for (@Pc(49) int local49 = 0; local49 < 14; local49++) {
					local30[local49 + local32] += local47[local49] * local42;
				}
				local34 += this.anInt6843;
				@Pc(80) int local80 = local34 / this.anInt6841;
				local32 += local80;
				local34 -= local80 * this.anInt6841;
			}
			arg0 = new byte[local27];
			for (@Pc(105) int local105 = 0; local105 < local27; local105++) {
				@Pc(115) int local115 = local30[local105] + 32768 >> 16;
				if (local115 < -128) {
					arg0[local105] = -128;
				} else if (local115 <= 127) {
					arg0[local105] = (byte) local115;
				} else {
					arg0[local105] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(II)I")
	public int method5745(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray62 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt6843 / (long) this.anInt6841) + 6;
		}
		return arg0;
	}
}

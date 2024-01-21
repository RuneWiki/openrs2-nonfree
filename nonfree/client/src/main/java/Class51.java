import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class51 {

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
	private int anInt2000;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
	private int anInt2002;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(II)V")
	public Class51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static106.method1687(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			this.anInt2000 = local20;
			@Pc(27) int local27 = arg0 / local16;
			this.anIntArrayArray25 = new int[local27][14];
			this.anInt2002 = local27;
			for (@Pc(37) int local37 = 0; local37 < local27; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray25[local37];
				@Pc(52) double local52 = (double) local37 / (double) local27 + 6.0D;
				@Pc(58) double local58 = (double) local20 / (double) local27;
				@Pc(66) int local66 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local66 < 0) {
					local66 = 0;
				}
				@Pc(76) int local76 = (int) Math.ceil(local52 + 7.0D);
				if (local76 > 14) {
					local76 = 14;
				}
				while (local76 > local66) {
					@Pc(90) double local90 = ((double) local66 - local52) * 3.141592653589793D;
					@Pc(92) double local92 = local58;
					if (local90 < -1.0E-4D || local90 > 1.0E-4D) {
						local92 = local58 * (Math.sin(local90) / local90);
					}
					local92 *= Math.cos(((double) local66 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local66] = (int) Math.floor(local92 * 65536.0D + 0.5D);
					local66++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B[B)[B")
	public byte[] method1346(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray25 != null) {
			@Pc(29) int local29 = (int) ((long) arg0.length * (long) this.anInt2000 / (long) this.anInt2002) + 14;
			@Pc(32) int[] local32 = new int[local29];
			@Pc(34) int local34 = 0;
			@Pc(36) int local36 = 0;
			for (@Pc(38) int local38 = 0; local38 < arg0.length; local38++) {
				@Pc(45) int[] local45 = this.anIntArrayArray25[local34];
				@Pc(49) byte local49 = arg0[local38];
				for (@Pc(51) int local51 = 0; local51 < 14; local51++) {
					local32[local51 + local36] += local49 * local45[local51];
				}
				local34 += this.anInt2000;
				@Pc(80) int local80 = local34 / this.anInt2002;
				local36 += local80;
				local34 -= this.anInt2002 * local80;
			}
			arg0 = new byte[local29];
			for (@Pc(105) int local105 = 0; local105 < local29; local105++) {
				@Pc(115) int local115 = local32[local105] + 32768 >> 16;
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

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)I")
	public int method1348(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray25 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2000 / (long) this.anInt2002) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(BI)I")
	public int method1352(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray25 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2000 / (long) this.anInt2002);
		}
		return arg0;
	}
}

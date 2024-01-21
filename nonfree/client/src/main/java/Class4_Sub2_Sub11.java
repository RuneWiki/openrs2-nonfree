import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class4_Sub2_Sub11 extends Class4_Sub2 {

	@OriginalMember(owner = "client!nf", name = "jb", descriptor = "[I")
	public static int[] anIntArray220 = new int[99];

	@OriginalMember(owner = "client!nf", name = "X", descriptor = "I")
	public int anInt1926;

	@OriginalMember(owner = "client!nf", name = "Y", descriptor = "I")
	public int anInt1927;

	@OriginalMember(owner = "client!nf", name = "bb", descriptor = "I")
	public int anInt1929;

	@OriginalMember(owner = "client!nf", name = "fb", descriptor = "I")
	public int anInt1933;

	@OriginalMember(owner = "client!nf", name = "ib", descriptor = "I")
	private int anInt1934 = 0;

	static {
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < 99; local22++) {
			@Pc(27) int local27 = local22 + 1;
			@Pc(40) int local40 = (int) ((double) local27 + Math.pow(2.0D, (double) local27 / 7.0D) * 300.0D);
			local20 += local40;
			anIntArray220[local22] = local20 / 4;
		}
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(II)V")
	private void method1363(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(27) double local27 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(34) double local34 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(36) double local36 = local27;
		if (local14 < local27) {
			local36 = local14;
		}
		@Pc(44) double local44 = local27;
		@Pc(46) double local46 = 0.0D;
		if (local27 < local14) {
			local44 = local14;
		}
		if (local44 < local34) {
			local44 = local34;
		}
		@Pc(60) double local60 = 0.0D;
		if (local36 > local34) {
			local36 = local34;
		}
		@Pc(72) double local72 = (local44 + local36) / 2.0D;
		this.anInt1929 = (int) (local72 * 256.0D);
		if (local36 != local44) {
			if (local27 == local44) {
				local46 = (local14 - local34) / (local44 - local36);
			} else if (local14 == local44) {
				local46 = (local34 - local27) / (local44 - local36) + 2.0D;
			} else if (local34 == local44) {
				local46 = (local27 - local14) / (local44 - local36) + 4.0D;
			}
			if (local72 < 0.5D) {
				local60 = (local44 - local36) / (local36 + local44);
			}
			if (local72 >= 0.5D) {
				local60 = (local44 - local36) / (2.0D - local44 - local36);
			}
		}
		if (this.anInt1929 < 0) {
			this.anInt1929 = 0;
		} else if (this.anInt1929 > 255) {
			this.anInt1929 = 255;
		}
		local46 /= 6.0D;
		if (local72 > 0.5D) {
			this.anInt1926 = (int) (local60 * (1.0D - local72) * 512.0D);
		} else {
			this.anInt1926 = (int) (local72 * 512.0D * local60);
		}
		if (this.anInt1926 < 1) {
			this.anInt1926 = 1;
		}
		this.anInt1933 = (int) (local60 * 256.0D);
		this.anInt1927 = (int) (local46 * (double) this.anInt1926);
		if (this.anInt1933 < 0) {
			this.anInt1933 = 0;
		} else if (this.anInt1933 > 255) {
			this.anInt1933 = 255;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!s;B)V")
	public void method1366(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub16 arg1) {
		while (true) {
			@Pc(17) int local17 = arg1.method1474();
			if (local17 == 0) {
				return;
			}
			this.method1367(arg0, local17, arg1);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBILclient!s;)V")
	private void method1367(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub16 arg2) {
		if (arg1 == 1) {
			this.anInt1934 = arg2.method1475();
		}
	}

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "(B)V")
	public void method1368() {
		this.method1363(this.anInt1934);
	}
}

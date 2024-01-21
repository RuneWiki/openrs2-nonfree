import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!t", name = "Z", descriptor = "[I")
	public static int[] anIntArray343 = new int[99];

	@OriginalMember(owner = "client!t", name = "S", descriptor = "I")
	public int anInt2705;

	@OriginalMember(owner = "client!t", name = "eb", descriptor = "I")
	public int anInt2715;

	@OriginalMember(owner = "client!t", name = "fb", descriptor = "I")
	public int anInt2716;

	@OriginalMember(owner = "client!t", name = "gb", descriptor = "I")
	public int anInt2717;

	@OriginalMember(owner = "client!t", name = "db", descriptor = "I")
	private int anInt2714 = 0;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) (Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D + (double) local11);
			local4 += local24;
			anIntArray343[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)V")
	private void method1812(@OriginalArg(0) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(19) double local19 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local10;
		@Pc(32) double local32 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(34) double local34 = local10;
		@Pc(36) double local36 = 0.0D;
		if (local10 < local19) {
			local34 = local19;
		}
		if (local32 > local34) {
			local34 = local32;
		}
		@Pc(50) double local50 = 0.0D;
		if (local10 > local19) {
			local25 = local19;
		}
		if (local32 < local25) {
			local25 = local32;
		}
		@Pc(68) double local68 = (local25 + local34) / 2.0D;
		this.anInt2716 = (int) (local68 * 256.0D);
		if (this.anInt2716 < 0) {
			this.anInt2716 = 0;
		} else if (this.anInt2716 > 255) {
			this.anInt2716 = 255;
		}
		if (local34 != local25) {
			if (local68 < 0.5D) {
				local36 = (local34 - local25) / (local25 + local34);
			}
			if (local68 >= 0.5D) {
				local36 = (local34 - local25) / (2.0D - local25 - local34);
			}
			if (local34 == local10) {
				local50 = (local19 - local32) / (local34 - local25);
			} else if (local34 == local19) {
				local50 = (local32 - local10) / (-local25 + local34) + 2.0D;
			} else if (local32 == local34) {
				local50 = (local10 - local19) / (local34 - local25) + 4.0D;
			}
		}
		this.anInt2715 = (int) (local36 * 256.0D);
		if (local68 > 0.5D) {
			this.anInt2705 = (int) (local36 * 512.0D * (1.0D - local68));
		} else {
			this.anInt2705 = (int) (local36 * 512.0D * local68);
		}
		local50 /= 6.0D;
		if (this.anInt2715 < 0) {
			this.anInt2715 = 0;
		} else if (this.anInt2715 > 255) {
			this.anInt2715 = 255;
		}
		if (this.anInt2705 < 1) {
			this.anInt2705 = 1;
		}
		this.anInt2717 = (int) ((double) this.anInt2705 * local50);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!of;II)V")
	public void method1815(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(13) int local13 = arg0.method2072();
			if (local13 == 0) {
				return;
			}
			this.method1821(arg0, local13, arg1);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
	public void method1820() {
		this.method1812(this.anInt2714);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!of;II)V")
	private void method1821(@OriginalArg(1) Class1_Sub19 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt2714 = arg0.method2048();
		}
	}
}

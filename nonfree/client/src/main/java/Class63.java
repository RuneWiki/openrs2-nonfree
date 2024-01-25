import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class63 {

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
	public int anInt2330;

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
	public int anInt2331;

	@OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
	public int anInt2336;

	@OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
	public int anInt2339;

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
	public int anInt2332 = -1;

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
	public int anInt2334 = 128;

	@OriginalMember(owner = "client!dp", name = "n", descriptor = "Z")
	public boolean aBoolean167 = true;

	@OriginalMember(owner = "client!dp", name = "p", descriptor = "I")
	private int anInt2340 = 0;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V")
	private void method2169(@OriginalArg(0) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(36) double local36 = local12;
		if (local12 > local21) {
			local36 = local21;
		}
		if (local36 > local28) {
			local36 = local28;
		}
		@Pc(50) double local50 = local12;
		if (local21 > local12) {
			local50 = local21;
		}
		if (local50 < local28) {
			local50 = local28;
		}
		@Pc(64) double local64 = 0.0D;
		@Pc(66) double local66 = 0.0D;
		@Pc(72) double local72 = (local36 + local50) / 2.0D;
		if (local50 != local36) {
			if (local72 < 0.5D) {
				local66 = (local50 - local36) / (local50 + local36);
			}
			if (local12 == local50) {
				local64 = (local21 - local28) / (-local36 + local50);
			} else if (local21 == local50) {
				local64 = (local28 - local12) / (-local36 + local50) + 2.0D;
			} else if (local50 == local28) {
				local64 = (local12 - local21) / (local50 - local36) + 4.0D;
			}
			if (local72 >= 0.5D) {
				local66 = (local50 - local36) / (2.0D - local50 - local36);
			}
		}
		this.anInt2330 = (int) (local72 * 256.0D);
		local64 /= 6.0D;
		this.anInt2339 = (int) (local66 * 256.0D);
		if (this.anInt2339 < 0) {
			this.anInt2339 = 0;
		} else if (this.anInt2339 > 255) {
			this.anInt2339 = 255;
		}
		if (this.anInt2330 < 0) {
			this.anInt2330 = 0;
		} else if (this.anInt2330 > 255) {
			this.anInt2330 = 255;
		}
		if (local72 > 0.5D) {
			this.anInt2331 = (int) (local66 * (1.0D - local72) * 512.0D);
		} else {
			this.anInt2331 = (int) (local72 * local66 * 512.0D);
		}
		if (this.anInt2331 < 1) {
			this.anInt2331 = 1;
		}
		this.anInt2336 = (int) ((double) this.anInt2331 * local64);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!gw;ZI)V")
	private void method2170(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2340 = arg0.method3039();
			this.method2169(this.anInt2340);
		} else if (arg1 == 2) {
			this.anInt2332 = arg0.method3056();
			if (this.anInt2332 == 65535) {
				this.anInt2332 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt2334 = arg0.method3056() << 0;
		} else if (arg1 == 4) {
			this.aBoolean167 = false;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!gw;B)V")
	public void method2171(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method3043();
			if (local7 == 0) {
				return;
			}
			this.method2170(arg0, local7);
		}
	}
}

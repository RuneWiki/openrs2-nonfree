import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class221 {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
	public int anInt6341;

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
	public int anInt6342;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
	public int anInt6343;

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
	public int anInt6348;

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "Z")
	public boolean aBoolean579 = true;

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
	public int anInt6345 = -1;

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
	private int anInt6347 = 0;

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
	public int anInt6353 = 128;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BI)V")
	private void method4956(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(64) double local64 = 0.0D;
		@Pc(66) double local66 = 0.0D;
		@Pc(72) double local72 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local72 < 0.5D) {
				local66 = (local46 - local32) / (local32 + local46);
			}
			if (local14 == local46) {
				local64 = (local23 - local30) / (-local32 + local46);
			} else if (local46 == local23) {
				local64 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local64 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local72 >= 0.5D) {
				local66 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		this.anInt6341 = (int) (local66 * 256.0D);
		this.anInt6343 = (int) (local72 * 256.0D);
		local64 /= 6.0D;
		if (this.anInt6343 < 0) {
			this.anInt6343 = 0;
		} else if (this.anInt6343 > 255) {
			this.anInt6343 = 255;
		}
		if (local72 > 0.5D) {
			this.anInt6342 = (int) (local66 * 512.0D * (1.0D - local72));
		} else {
			this.anInt6342 = (int) (local72 * local66 * 512.0D);
		}
		if (this.anInt6341 < 0) {
			this.anInt6341 = 0;
		} else if (this.anInt6341 > 255) {
			this.anInt6341 = 255;
		}
		if (this.anInt6342 < 1) {
			this.anInt6342 = 1;
		}
		this.anInt6348 = (int) (local64 * (double) this.anInt6342);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILclient!iv;)V")
	public void method4960(@OriginalArg(1) Class4_Sub12 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2490();
			if (local17 == 0) {
				return;
			}
			this.method4961(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!iv;II)V")
	private void method4961(@OriginalArg(0) Class4_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6347 = arg0.method2493();
			this.method4956(this.anInt6347);
		} else if (arg1 == 2) {
			this.anInt6345 = arg0.method2536();
			if (this.anInt6345 == 65535) {
				this.anInt6345 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt6353 = arg0.method2536() << 0;
		} else if (arg1 == 4) {
			this.aBoolean579 = false;
		}
	}
}

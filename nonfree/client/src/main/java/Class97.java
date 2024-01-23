import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class97 {

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
	public int anInt2802;

	@OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
	public int anInt2803;

	@OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
	public int anInt2804;

	@OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
	public int anInt2806;

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
	public int anInt2795 = 128;

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "Z")
	public boolean aBoolean232 = true;

	@OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
	private int anInt2808 = 0;

	@OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
	public int anInt2807 = -1;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!aj;IZI)V")
	private void method2236(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt2808 = arg0.method2323();
			this.method2243(this.anInt2808);
		} else if (arg2 == 2) {
			this.anInt2807 = arg0.method2375();
			if (this.anInt2807 == 65535) {
				this.anInt2807 = -1;
			}
		} else if (arg2 == 3) {
			this.anInt2795 = arg0.method2375();
		} else if (arg2 == 4) {
			this.aBoolean232 = false;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!aj;II)V")
	public void method2242(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(15) int local15 = arg0.method2334();
			if (local15 == 0) {
				return;
			}
			this.method2236(arg0, arg1, local15);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IB)V")
	private void method2243(@OriginalArg(0) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local10;
		@Pc(34) double local34 = local10;
		if (local23 > local10) {
			local34 = local23;
		}
		if (local34 < local30) {
			local34 = local30;
		}
		if (local23 < local10) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(72) double local72 = (local34 + local32) / 2.0D;
		@Pc(74) double local74 = 0.0D;
		this.anInt2806 = (int) (local72 * 256.0D);
		@Pc(82) double local82 = 0.0D;
		if (local32 != local34) {
			if (local34 == local10) {
				local74 = (local23 - local30) / (local34 - local32);
			} else if (local34 == local23) {
				local74 = (local30 - local10) / (-local32 + local34) + 2.0D;
			} else if (local34 == local30) {
				local74 = (local10 - local23) / (-local32 + local34) + 4.0D;
			}
			if (local72 < 0.5D) {
				local82 = (local34 - local32) / (local32 + local34);
			}
			if (local72 >= 0.5D) {
				local82 = (local34 - local32) / (2.0D - local34 - local32);
			}
		}
		if (local72 > 0.5D) {
			this.anInt2804 = (int) ((1.0D - local72) * local82 * 512.0D);
		} else {
			this.anInt2804 = (int) (local82 * 512.0D * local72);
		}
		if (this.anInt2806 < 0) {
			this.anInt2806 = 0;
		} else if (this.anInt2806 > 255) {
			this.anInt2806 = 255;
		}
		if (this.anInt2804 < 1) {
			this.anInt2804 = 1;
		}
		local74 /= 6.0D;
		this.anInt2802 = (int) (local74 * (double) this.anInt2804);
		this.anInt2803 = (int) (local82 * 256.0D);
		if (this.anInt2803 < 0) {
			this.anInt2803 = 0;
		} else if (this.anInt2803 > 255) {
			this.anInt2803 = 255;
		}
	}
}

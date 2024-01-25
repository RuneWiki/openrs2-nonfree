import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class77 {

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
	public int anInt2362;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
	public int anInt2364;

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
	public int anInt2367;

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
	public int anInt2368;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "Z")
	public boolean aBoolean156 = true;

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
	public int anInt2363 = -1;

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "Z")
	public boolean aBoolean157 = true;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
	private int anInt2374 = 0;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
	public int anInt2371 = 512;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)V")
	private void method2186(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(55) double local55 = local14;
		if (local23 > local14) {
			local55 = local23;
		}
		if (local55 < local30) {
			local55 = local30;
		}
		@Pc(69) double local69 = 0.0D;
		@Pc(71) double local71 = 0.0D;
		@Pc(77) double local77 = (local32 + local55) / 2.0D;
		if (local55 != local32) {
			if (local77 < 0.5D) {
				local71 = (local55 - local32) / (local55 + local32);
			}
			if (local77 >= 0.5D) {
				local71 = (local55 - local32) / (2.0D - local55 - local32);
			}
			if (local55 == local14) {
				local69 = (local23 - local30) / (local55 - local32);
			} else if (local55 == local23) {
				local69 = (local30 - local14) / (-local32 + local55) + 2.0D;
			} else if (local30 == local55) {
				local69 = (local14 - local23) / (-local32 + local55) + 4.0D;
			}
		}
		this.anInt2362 = (int) (local71 * 256.0D);
		local69 /= 6.0D;
		this.anInt2364 = (int) (local77 * 256.0D);
		if (local77 > 0.5D) {
			this.anInt2367 = (int) (local71 * 512.0D * (1.0D - local77));
		} else {
			this.anInt2367 = (int) (local77 * 512.0D * local71);
		}
		if (this.anInt2362 < 0) {
			this.anInt2362 = 0;
		} else if (this.anInt2362 > 255) {
			this.anInt2362 = 255;
		}
		if (this.anInt2364 < 0) {
			this.anInt2364 = 0;
		} else if (this.anInt2364 > 255) {
			this.anInt2364 = 255;
		}
		if (this.anInt2367 < 1) {
			this.anInt2367 = 1;
		}
		this.anInt2368 = (int) ((double) this.anInt2367 * local69);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!ika;Z)V")
	public void method2187(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method2048(255);
			if (local14 == 0) {
				return;
			}
			this.method2188(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZLclient!ika;I)V")
	private void method2188(@OriginalArg(1) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2374 = arg0.method2061();
			this.method2186(this.anInt2374);
		} else if (arg1 == 2) {
			this.anInt2363 = arg0.method2028(-14795);
			if (this.anInt2363 == 65535) {
				this.anInt2363 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt2371 = arg0.method2028(-14795) << 2;
		} else if (arg1 == 4) {
			this.aBoolean156 = false;
		} else if (arg1 == 5) {
			this.aBoolean157 = false;
		}
	}
}

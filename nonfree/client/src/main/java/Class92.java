import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class92 {

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
	public int anInt2916;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
	public int anInt2923;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
	public int anInt2927;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
	public int anInt2928;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
	public int anInt2924 = 128;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "Z")
	public boolean aBoolean188 = true;

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
	public int anInt2917 = -1;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
	private int anInt2922 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!wn;Z)V")
	public void method2612(@OriginalArg(0) Class4_Sub20 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4614();
			if (local13 == 0) {
				return;
			}
			this.method2615(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!wn;)V")
	private void method2615(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt2922 = arg1.method4582();
			this.method2617(this.anInt2922);
		} else if (arg0 == 2) {
			this.anInt2917 = arg1.method4560();
			if (this.anInt2917 != 65535) {
				return;
			}
			this.anInt2917 = -1;
		} else if (arg0 == 3) {
			this.anInt2924 = arg1.method4560() << 0;
			return;
		} else if (arg0 == 4) {
			this.aBoolean188 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V")
	private void method2617(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(64) double local64 = 0.0D;
		@Pc(66) double local66 = 0.0D;
		@Pc(72) double local72 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local72 < 0.5D) {
				local66 = (local46 - local32) / (local32 + local46);
			}
			if (local72 >= 0.5D) {
				local66 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local46 == local14) {
				local64 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local64 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local64 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		this.anInt2927 = (int) (local66 * 256.0D);
		local64 /= 6.0D;
		this.anInt2916 = (int) (local72 * 256.0D);
		if (local72 > 0.5D) {
			this.anInt2928 = (int) ((1.0D - local72) * local66 * 512.0D);
		} else {
			this.anInt2928 = (int) (local66 * local72 * 512.0D);
		}
		if (this.anInt2927 < 0) {
			this.anInt2927 = 0;
		} else if (this.anInt2927 > 255) {
			this.anInt2927 = 255;
		}
		if (this.anInt2916 < 0) {
			this.anInt2916 = 0;
		} else if (this.anInt2916 > 255) {
			this.anInt2916 = 255;
		}
		if (this.anInt2928 < 1) {
			this.anInt2928 = 1;
		}
		this.anInt2923 = (int) ((double) this.anInt2928 * local64);
	}
}

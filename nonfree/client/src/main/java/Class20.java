import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class20 {

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
	public int anInt450;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
	public int anInt455;

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
	public int anInt456;

	@OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
	public int anInt462;

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
	private int anInt457 = 0;

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
	public int anInt458 = -1;

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
	public int anInt461 = 128;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "Z")
	public boolean aBoolean23 = true;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
	private void method471(@OriginalArg(0) int arg0) {
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
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / ((2.0D - local46) - local32);
			}
		}
		local60 /= 6.0D;
		this.anInt455 = (int) ((double) 256 * local68);
		this.anInt462 = (int) (local62 * 256.0D);
		if (this.anInt462 < 0) {
			this.anInt462 = 0;
		} else if (this.anInt462 > 255) {
			this.anInt462 = 255;
		}
		if (this.anInt455 < 0) {
			this.anInt455 = 0;
		} else if (this.anInt455 > 255) {
			this.anInt455 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt450 = (int) ((1.0D - local68) * local62 * 512.0D);
		} else {
			this.anInt450 = (int) (local68 * 512.0D * local62);
		}
		if (this.anInt450 < 1) {
			this.anInt450 = 1;
		}
		this.anInt456 = (int) ((double) this.anInt450 * local60);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!nj;Z)V")
	public void method472(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4096();
			if (local5 == 0) {
				return;
			}
			this.method474(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!nj;B)V")
	private void method474(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub25 arg1) {
		if (arg0 == 1) {
			this.anInt457 = arg1.method4099();
			this.method471(this.anInt457);
		} else if (arg0 == 2) {
			this.anInt458 = arg1.method4083();
			if (this.anInt458 == 65535) {
				this.anInt458 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt461 = arg1.method4083() << 0;
		} else if (arg0 == 4) {
			this.aBoolean23 = false;
		}
	}
}

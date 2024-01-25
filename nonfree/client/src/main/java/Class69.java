import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class69 {

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
	public int anInt2620;

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
	public int anInt2621;

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
	public int anInt2624;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
	public int anInt2629;

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "Z")
	public boolean aBoolean212 = true;

	@OriginalMember(owner = "client!ds", name = "o", descriptor = "Z")
	public boolean aBoolean213 = true;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
	private int anInt2619 = 0;

	@OriginalMember(owner = "client!ds", name = "t", descriptor = "I")
	public int anInt2632 = 512;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
	public int anInt2630 = -1;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)V")
	private void method2565(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(36) double local36 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(38) double local38 = local14;
		if (local14 > local23) {
			local38 = local23;
		}
		if (local38 > local36) {
			local38 = local36;
		}
		@Pc(52) double local52 = local14;
		if (local23 > local14) {
			local52 = local23;
		}
		if (local36 > local52) {
			local52 = local36;
		}
		@Pc(66) double local66 = 0.0D;
		@Pc(68) double local68 = 0.0D;
		@Pc(74) double local74 = (local52 + local38) / 2.0D;
		if (local52 != local38) {
			if (local74 < 0.5D) {
				local68 = (local52 - local38) / (local38 + local52);
			}
			if (local14 == local52) {
				local66 = (local23 - local36) / (-local38 + local52);
			} else if (local52 == local23) {
				local66 = (local36 - local14) / (local52 - local38) + 2.0D;
			} else if (local36 == local52) {
				local66 = (local14 - local23) / (local52 - local38) + 4.0D;
			}
			if (local74 >= 0.5D) {
				local68 = (local52 - local38) / ((2.0D - local52) - local38);
			}
		}
		this.anInt2621 = (int) (local74 * 256.0D);
		local66 /= 6.0D;
		this.anInt2629 = (int) (local68 * 256.0D);
		if (this.anInt2621 < 0) {
			this.anInt2621 = 0;
		} else if (this.anInt2621 > 255) {
			this.anInt2621 = 255;
		}
		if (local74 > 0.5D) {
			this.anInt2620 = (int) ((1.0D - local74) * 512.0D * local68);
		} else {
			this.anInt2620 = (int) (local68 * local74 * 512.0D);
		}
		if (this.anInt2629 < 0) {
			this.anInt2629 = 0;
		} else if (this.anInt2629 > 255) {
			this.anInt2629 = 255;
		}
		if (this.anInt2620 < 1) {
			this.anInt2620 = 1;
		}
		this.anInt2624 = (int) (local66 * (double) this.anInt2620);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BLclient!tn;)V")
	public void method2566(@OriginalArg(1) Class3_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8401();
			if (local5 == 0) {
				return;
			}
			this.method2567(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!tn;ZI)V")
	private void method2567(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2619 = arg0.method8421();
			this.method2565(this.anInt2619);
		} else if (arg1 == 2) {
			this.anInt2630 = arg0.method8414();
			if (this.anInt2630 == 65535) {
				this.anInt2630 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt2632 = arg0.method8414() << 2;
		} else if (arg1 == 4) {
			this.aBoolean213 = false;
		} else if (arg1 == 5) {
			this.aBoolean212 = false;
			return;
		}
	}
}

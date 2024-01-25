import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class20 {

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
	public int anInt459;

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
	public int anInt463;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
	public int anInt464;

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
	public int anInt466;

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "Z")
	public boolean aBoolean47 = true;

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
	public int anInt461 = -1;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "Z")
	public boolean aBoolean46 = true;

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
	public int anInt460 = 512;

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
	private int anInt468 = 0;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V")
	private void method568(@OriginalArg(0) int arg0) {
		@Pc(18) double local18 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(27) double local27 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(34) double local34 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(36) double local36 = local18;
		if (local18 > local27) {
			local36 = local27;
		}
		if (local36 > local34) {
			local36 = local34;
		}
		@Pc(50) double local50 = local18;
		if (local27 > local18) {
			local50 = local27;
		}
		if (local34 > local50) {
			local50 = local34;
		}
		@Pc(64) double local64 = 0.0D;
		@Pc(66) double local66 = 0.0D;
		@Pc(72) double local72 = (local36 + local50) / 2.0D;
		if (local50 != local36) {
			if (local72 < 0.5D) {
				local66 = (local50 - local36) / (local36 + local50);
			}
			if (local72 >= 0.5D) {
				local66 = (local50 - local36) / (2.0D - local50 - local36);
			}
			if (local18 == local50) {
				local64 = (local27 - local34) / (-local36 + local50);
			} else if (local27 == local50) {
				local64 = (local34 - local18) / (-local36 + local50) + 2.0D;
			} else if (local50 == local34) {
				local64 = (local18 - local27) / (local50 - local36) + 4.0D;
			}
		}
		local64 /= 6.0D;
		this.anInt463 = (int) (local72 * 256.0D);
		this.anInt464 = (int) (local66 * 256.0D);
		if (local72 > 0.5D) {
			this.anInt459 = (int) (local66 * 512.0D * (1.0D - local72));
		} else {
			this.anInt459 = (int) (local72 * local66 * 512.0D);
		}
		if (this.anInt463 < 0) {
			this.anInt463 = 0;
		} else if (this.anInt463 > 255) {
			this.anInt463 = 255;
		}
		if (this.anInt464 < 0) {
			this.anInt464 = 0;
		} else if (this.anInt464 > 255) {
			this.anInt464 = 255;
		}
		if (this.anInt459 < 1) {
			this.anInt459 = 1;
		}
		this.anInt466 = (int) ((double) this.anInt459 * local64);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!sl;B)V")
	public void method570(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2859();
			if (local3 == 0) {
				return;
			}
			this.method571(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IBLclient!sl;)V")
	private void method571(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt468 = arg1.method2835();
			this.method568(this.anInt468);
		} else if (arg0 == 2) {
			this.anInt461 = arg1.method2825();
			if (this.anInt461 == 65535) {
				this.anInt461 = -1;
				return;
			}
		} else if (arg0 == 3) {
			this.anInt460 = arg1.method2825() << 2;
		} else {
			if (arg0 == 4) {
				this.aBoolean46 = false;
			} else if (arg0 == 5) {
				this.aBoolean47 = false;
				return;
			}
			return;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class172 {

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
	public int anInt5442;

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
	public int anInt5443;

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
	public int anInt5445;

	@OriginalMember(owner = "client!qq", name = "p", descriptor = "I")
	public int anInt5453;

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
	public int anInt5444 = -1;

	@OriginalMember(owner = "client!qq", name = "k", descriptor = "Z")
	public boolean aBoolean483 = true;

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "I")
	public int anInt5451 = 128;

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
	private int anInt5448 = 0;

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(II)V")
	private void method4643(@OriginalArg(1) int arg0) {
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
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		this.anInt5443 = (int) (local68 * 256.0D);
		this.anInt5442 = (int) (local62 * 256.0D);
		local60 /= 6.0D;
		if (local68 > 0.5D) {
			this.anInt5453 = (int) ((1.0D - local68) * local62 * 512.0D);
		} else {
			this.anInt5453 = (int) (local62 * 512.0D * local68);
		}
		if (this.anInt5442 < 0) {
			this.anInt5442 = 0;
		} else if (this.anInt5442 > 255) {
			this.anInt5442 = 255;
		}
		if (this.anInt5443 < 0) {
			this.anInt5443 = 0;
		} else if (this.anInt5443 > 255) {
			this.anInt5443 = 255;
		}
		if (this.anInt5453 < 1) {
			this.anInt5453 = 1;
		}
		this.anInt5445 = (int) ((double) this.anInt5453 * local60);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZLclient!tq;I)V")
	public void method4646(@OriginalArg(1) Class4_Sub7 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method2380();
			if (local9 == 0) {
				return;
			}
			this.method4647(arg0, local9, arg1);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!tq;III)V")
	private void method4647(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt5448 = arg0.method2402();
			this.method4643(this.anInt5448);
		} else if (arg1 == 2) {
			this.anInt5444 = arg0.method2404();
			if (this.anInt5444 == 65535) {
				this.anInt5444 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt5451 = arg0.method2404();
		} else if (arg1 == 4) {
			this.aBoolean483 = false;
		}
	}
}

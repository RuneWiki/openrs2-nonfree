import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gda")
public final class Class121 {

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "I")
	public int anInt3486;

	@OriginalMember(owner = "client!gda", name = "g", descriptor = "I")
	public int anInt3488;

	@OriginalMember(owner = "client!gda", name = "i", descriptor = "I")
	public int anInt3490;

	@OriginalMember(owner = "client!gda", name = "k", descriptor = "I")
	public int anInt3492;

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "Z")
	public boolean aBoolean288 = true;

	@OriginalMember(owner = "client!gda", name = "f", descriptor = "Z")
	public boolean aBoolean289 = true;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "I")
	private int anInt3485 = 0;

	@OriginalMember(owner = "client!gda", name = "m", descriptor = "I")
	public int anInt3494 = -1;

	@OriginalMember(owner = "client!gda", name = "o", descriptor = "I")
	public int anInt3496 = 512;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ILclient!es;I)V")
	private void method2886(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt3485 = arg1.method4341();
			this.method2888(this.anInt3485);
		} else if (arg0 == 2) {
			this.anInt3494 = arg1.method4294();
			if (this.anInt3494 != 65535) {
				return;
			}
			this.anInt3494 = -1;
		} else if (arg0 == 3) {
			this.anInt3496 = arg1.method4294() << 2;
			return;
		} else if (arg0 == 4) {
			this.aBoolean288 = false;
			return;
		} else if (arg0 == 5) {
			this.aBoolean289 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)V")
	private void method2888(@OriginalArg(1) int arg0) {
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
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local60 /= 6.0D;
		this.anInt3490 = (int) (local68 * 256.0D);
		this.anInt3492 = (int) (local62 * 256.0D);
		if (this.anInt3490 < 0) {
			this.anInt3490 = 0;
		} else if (this.anInt3490 > 255) {
			this.anInt3490 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt3488 = (int) (local62 * (1.0D - local68) * 512.0D);
		} else {
			this.anInt3488 = (int) (local68 * 512.0D * local62);
		}
		if (this.anInt3492 < 0) {
			this.anInt3492 = 0;
		} else if (this.anInt3492 > 255) {
			this.anInt3492 = 255;
		}
		if (this.anInt3488 < 1) {
			this.anInt3488 = 1;
		}
		this.anInt3486 = (int) (local60 * (double) this.anInt3488);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lclient!es;I)V")
	public void method2889(@OriginalArg(0) Class2_Sub15 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4325();
			if (local17 == 0) {
				return;
			}
			this.method2886(local17, arg0);
		}
	}
}

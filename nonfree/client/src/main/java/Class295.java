import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class295 {

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
	public int anInt8376;

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
	public int anInt8378;

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
	public int anInt8383;

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
	public int anInt8384;

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
	public int anInt8380 = 512;

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "Z")
	public boolean aBoolean607 = true;

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "Z")
	public boolean aBoolean606 = true;

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
	private int anInt8375 = 0;

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
	public int anInt8385 = -1;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!dc;I)V")
	public void method7221(@OriginalArg(0) Class3_Sub9 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5633();
			if (local14 == 0) {
				return;
			}
			this.method7223(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!dc;IB)V")
	private void method7223(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt8375 = arg0.method5604();
			this.method7227(this.anInt8375);
		} else if (arg1 == 2) {
			this.anInt8385 = arg0.method5610();
			if (this.anInt8385 == 65535) {
				this.anInt8385 = -1;
				return;
			}
		} else if (arg1 == 3) {
			this.anInt8380 = arg0.method5610() << 2;
			return;
		} else {
			if (arg1 == 4) {
				this.aBoolean606 = false;
			} else if (arg1 == 5) {
				this.aBoolean607 = false;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(BI)V")
	private void method7227(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local32 > local30) {
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
		@Pc(68) double local68 = 0.0D;
		@Pc(74) double local74 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local74 < 0.5D) {
				local68 = (local46 - local32) / (local32 + local46);
			}
			if (local74 >= 0.5D) {
				local68 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		this.anInt8376 = (int) (local74 * 256.0D);
		this.anInt8383 = (int) (local68 * 256.0D);
		local60 /= 6.0D;
		if (this.anInt8383 < 0) {
			this.anInt8383 = 0;
		} else if (this.anInt8383 > 255) {
			this.anInt8383 = 255;
		}
		if (this.anInt8376 < 0) {
			this.anInt8376 = 0;
		} else if (this.anInt8376 > 255) {
			this.anInt8376 = 255;
		}
		if (local74 > 0.5D) {
			this.anInt8384 = (int) (local68 * (1.0D - local74) * 512.0D);
		} else {
			this.anInt8384 = (int) (local68 * 512.0D * local74);
		}
		if (this.anInt8384 < 1) {
			this.anInt8384 = 1;
		}
		this.anInt8378 = (int) ((double) this.anInt8384 * local60);
	}
}

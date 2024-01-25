import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class278 {

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
	public int anInt8018;

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
	public int anInt8023;

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
	public int anInt8026;

	@OriginalMember(owner = "client!pv", name = "n", descriptor = "I")
	public int anInt8028;

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
	public int anInt8019 = 512;

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
	public int anInt8020 = -1;

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
	private int anInt8022 = 0;

	@OriginalMember(owner = "client!pv", name = "o", descriptor = "Z")
	public boolean aBoolean553 = true;

	@OriginalMember(owner = "client!pv", name = "q", descriptor = "Z")
	public boolean aBoolean554 = true;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IZLclient!gga;)V")
	private void method6862(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub23 arg1) {
		if (arg0 == 1) {
			this.anInt8022 = arg1.method8344();
			this.method6865(this.anInt8022);
		} else if (arg0 == 2) {
			this.anInt8020 = arg1.method8363();
			if (this.anInt8020 == 65535) {
				this.anInt8020 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt8019 = arg1.method8363() << 2;
		} else if (arg0 == 4) {
			this.aBoolean554 = false;
		} else if (arg0 == 5) {
			this.aBoolean553 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!gga;B)V")
	public void method6864(@OriginalArg(0) Class6_Sub23 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8374();
			if (local17 == 0) {
				return;
			}
			this.method6862(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(II)V")
	private void method6865(@OriginalArg(1) int arg0) {
		@Pc(20) double local20 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(29) double local29 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(36) double local36 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(38) double local38 = local20;
		if (local29 < local20) {
			local38 = local29;
		}
		if (local36 < local38) {
			local38 = local36;
		}
		@Pc(52) double local52 = local20;
		if (local20 < local29) {
			local52 = local29;
		}
		if (local52 < local36) {
			local52 = local36;
		}
		@Pc(66) double local66 = 0.0D;
		@Pc(68) double local68 = 0.0D;
		@Pc(74) double local74 = (local52 + local38) / 2.0D;
		if (local38 != local52) {
			if (local74 < 0.5D) {
				local68 = (local52 - local38) / (local52 + local38);
			}
			if (local74 >= 0.5D) {
				local68 = (local52 - local38) / (2.0D - local52 - local38);
			}
			if (local52 == local20) {
				local66 = (local29 - local36) / (local52 - local38);
			} else if (local52 == local29) {
				local66 = (local36 - local20) / (local52 - local38) + 2.0D;
			} else if (local52 == local36) {
				local66 = (local20 - local29) / (-local38 + local52) + 4.0D;
			}
		}
		this.anInt8023 = (int) (local68 * 256.0D);
		local66 /= 6.0D;
		this.anInt8026 = (int) (local74 * 256.0D);
		if (local74 > 0.5D) {
			this.anInt8018 = (int) ((1.0D - local74) * 512.0D * local68);
		} else {
			this.anInt8018 = (int) (local74 * 512.0D * local68);
		}
		if (this.anInt8026 < 0) {
			this.anInt8026 = 0;
		} else if (this.anInt8026 > 255) {
			this.anInt8026 = 255;
		}
		if (this.anInt8023 < 0) {
			this.anInt8023 = 0;
		} else if (this.anInt8023 > 255) {
			this.anInt8023 = 255;
		}
		if (this.anInt8018 < 1) {
			this.anInt8018 = 1;
		}
		this.anInt8028 = (int) (local66 * (double) this.anInt8018);
	}
}

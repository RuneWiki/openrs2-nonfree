import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sca")
public final class Class266 {

	@OriginalMember(owner = "client!sca", name = "e", descriptor = "I")
	public int anInt8018;

	@OriginalMember(owner = "client!sca", name = "k", descriptor = "I")
	public int anInt8023;

	@OriginalMember(owner = "client!sca", name = "l", descriptor = "I")
	public int anInt8024;

	@OriginalMember(owner = "client!sca", name = "q", descriptor = "I")
	public int anInt8027;

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "Z")
	public boolean aBoolean572 = true;

	@OriginalMember(owner = "client!sca", name = "h", descriptor = "I")
	public int anInt8021 = 512;

	@OriginalMember(owner = "client!sca", name = "f", descriptor = "I")
	public int anInt8019 = -1;

	@OriginalMember(owner = "client!sca", name = "n", descriptor = "I")
	private int anInt8025 = 0;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!rt;I)V")
	public void method6633(@OriginalArg(0) Class3_Sub27 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7548();
			if (local9 == 0) {
				return;
			}
			this.method6634(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(ILclient!rt;B)V")
	private void method6634(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27 arg1) {
		if (arg0 == 1) {
			this.anInt8025 = arg1.method7551();
			this.method6636(this.anInt8025);
		} else if (arg0 == 2) {
			this.anInt8019 = arg1.method7591();
			if (this.anInt8019 == 65535) {
				this.anInt8019 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt8021 = arg1.method7591() << 2;
		} else if (arg0 == 4) {
			this.aBoolean572 = false;
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(II)V")
	private void method6636(@OriginalArg(0) int arg0) {
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
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		local60 /= 6.0D;
		this.anInt8018 = (int) (local62 * 256.0D);
		this.anInt8023 = (int) (local68 * 256.0D);
		if (this.anInt8018 < 0) {
			this.anInt8018 = 0;
		} else if (this.anInt8018 > 255) {
			this.anInt8018 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt8027 = (int) ((1.0D - local68) * local62 * 512.0D);
		} else {
			this.anInt8027 = (int) (local68 * 512.0D * local62);
		}
		if (this.anInt8023 < 0) {
			this.anInt8023 = 0;
		} else if (this.anInt8023 > 255) {
			this.anInt8023 = 255;
		}
		if (this.anInt8027 < 1) {
			this.anInt8027 = 1;
		}
		this.anInt8024 = (int) ((double) this.anInt8027 * local60);
	}
}

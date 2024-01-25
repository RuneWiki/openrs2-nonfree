import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public final class Class274 {

	@OriginalMember(owner = "client!pba", name = "f", descriptor = "I")
	public int anInt7518;

	@OriginalMember(owner = "client!pba", name = "c", descriptor = "I")
	public int anInt7519;

	@OriginalMember(owner = "client!pba", name = "m", descriptor = "I")
	public int anInt7521;

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "I")
	public int anInt7522;

	@OriginalMember(owner = "client!pba", name = "k", descriptor = "I")
	private int anInt7515 = 0;

	@OriginalMember(owner = "client!pba", name = "d", descriptor = "Z")
	public boolean aBoolean585 = true;

	@OriginalMember(owner = "client!pba", name = "p", descriptor = "I")
	public int anInt7514 = 512;

	@OriginalMember(owner = "client!pba", name = "g", descriptor = "Z")
	public boolean aBoolean586 = true;

	@OriginalMember(owner = "client!pba", name = "o", descriptor = "I")
	public int anInt7524 = -1;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILclient!ib;)V")
	public void method6496(@OriginalArg(1) Class5_Sub23 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8529();
			if (local9 == 0) {
				return;
			}
			this.method6499(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(BI)V")
	private void method6498(@OriginalArg(1) int arg0) {
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
		if (local23 > local14) {
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
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local32 - local46);
			}
		}
		this.anInt7522 = (int) (local62 * 256.0D);
		this.anInt7518 = (int) (local68 * 256.0D);
		local60 /= 6.0D;
		if (this.anInt7522 < 0) {
			this.anInt7522 = 0;
		} else if (this.anInt7522 > 255) {
			this.anInt7522 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt7519 = (int) (local62 * (1.0D - local68) * 512.0D);
		} else {
			this.anInt7519 = (int) (local68 * 512.0D * local62);
		}
		if (this.anInt7518 < 0) {
			this.anInt7518 = 0;
		} else if (this.anInt7518 > 255) {
			this.anInt7518 = 255;
		}
		if (this.anInt7519 < 1) {
			this.anInt7519 = 1;
		}
		this.anInt7521 = (int) ((double) this.anInt7519 * local60);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IILclient!ib;)V")
	private void method6499(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 1) {
			this.anInt7515 = arg1.method8510();
			this.method6498(this.anInt7515);
		} else if (arg0 == 2) {
			this.anInt7524 = arg1.method8519();
			if (this.anInt7524 == 65535) {
				this.anInt7524 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt7514 = arg1.method8519() << 2;
		} else if (arg0 == 4) {
			this.aBoolean586 = false;
		} else if (arg0 == 5) {
			this.aBoolean585 = false;
		}
	}
}

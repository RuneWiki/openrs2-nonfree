import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pja")
public final class Class271 {

	@OriginalMember(owner = "client!pja", name = "c", descriptor = "I")
	public int anInt7603;

	@OriginalMember(owner = "client!pja", name = "f", descriptor = "I")
	public int anInt7606;

	@OriginalMember(owner = "client!pja", name = "l", descriptor = "I")
	public int anInt7610;

	@OriginalMember(owner = "client!pja", name = "p", descriptor = "I")
	public int anInt7613;

	@OriginalMember(owner = "client!pja", name = "h", descriptor = "Z")
	public boolean aBoolean565 = true;

	@OriginalMember(owner = "client!pja", name = "n", descriptor = "Z")
	public boolean aBoolean566 = true;

	@OriginalMember(owner = "client!pja", name = "m", descriptor = "I")
	private int anInt7611 = 0;

	@OriginalMember(owner = "client!pja", name = "r", descriptor = "I")
	public int anInt7615 = 512;

	@OriginalMember(owner = "client!pja", name = "e", descriptor = "I")
	public int anInt7605 = -1;

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(ILclient!jp;B)V")
	private void method6713(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub25 arg1) {
		if (arg0 == 1) {
			this.anInt7611 = arg1.method8607();
			this.method6714(this.anInt7611);
		} else if (arg0 == 2) {
			this.anInt7605 = arg1.method8593();
			if (this.anInt7605 == 65535) {
				this.anInt7605 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt7615 = arg1.method8593() << 2;
		} else if (arg0 == 4) {
			this.aBoolean565 = false;
		} else if (arg0 == 5) {
			this.aBoolean566 = false;
		}
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(II)V")
	private void method6714(@OriginalArg(1) int arg0) {
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
		@Pc(68) double local68 = 0.0D;
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local32 + local46) / 2.0D;
		if (local46 != local32) {
			if (local76 < 0.5D) {
				local70 = (local46 - local32) / (local46 + local32);
			}
			if (local76 >= 0.5D) {
				local70 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local14 == local46) {
				local68 = (local23 - local30) / (-local32 + local46);
			} else if (local23 == local46) {
				local68 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local68 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		local68 /= 6.0D;
		this.anInt7603 = (int) (local76 * 256.0D);
		this.anInt7613 = (int) (local70 * 256.0D);
		if (this.anInt7603 < 0) {
			this.anInt7603 = 0;
		} else if (this.anInt7603 > 255) {
			this.anInt7603 = 255;
		}
		if (local76 > 0.5D) {
			this.anInt7610 = (int) ((1.0D - local76) * 512.0D * local70);
		} else {
			this.anInt7610 = (int) (local70 * local76 * 512.0D);
		}
		if (this.anInt7613 < 0) {
			this.anInt7613 = 0;
		} else if (this.anInt7613 > 255) {
			this.anInt7613 = 255;
		}
		if (this.anInt7610 < 1) {
			this.anInt7610 = 1;
		}
		this.anInt7606 = (int) (local68 * (double) this.anInt7610);
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(ILclient!jp;)V")
	public void method6715(@OriginalArg(1) Class3_Sub25 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8632();
			if (local17 == 0) {
				return;
			}
			this.method6713(local17, arg0);
		}
	}
}

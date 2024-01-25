import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Class287 {

	@OriginalMember(owner = "client!pfa", name = "h", descriptor = "I")
	public int anInt7729;

	@OriginalMember(owner = "client!pfa", name = "e", descriptor = "I")
	public int anInt7732;

	@OriginalMember(owner = "client!pfa", name = "c", descriptor = "I")
	public int anInt7734;

	@OriginalMember(owner = "client!pfa", name = "i", descriptor = "I")
	public int anInt7736;

	@OriginalMember(owner = "client!pfa", name = "m", descriptor = "I")
	public int anInt7730 = -1;

	@OriginalMember(owner = "client!pfa", name = "l", descriptor = "I")
	public int anInt7733 = 512;

	@OriginalMember(owner = "client!pfa", name = "f", descriptor = "Z")
	public boolean aBoolean676 = true;

	@OriginalMember(owner = "client!pfa", name = "d", descriptor = "Z")
	public boolean aBoolean675 = true;

	@OriginalMember(owner = "client!pfa", name = "n", descriptor = "I")
	private int anInt7738 = 0;

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Lclient!et;II)V")
	private void method6906(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7738 = arg0.method8583();
			this.method6909(this.anInt7738);
		} else if (arg1 == 2) {
			this.anInt7730 = arg0.method8575();
			if (this.anInt7730 == 65535) {
				this.anInt7730 = -1;
				return;
			}
		} else if (arg1 == 3) {
			this.anInt7733 = arg0.method8575() << 2;
		} else if (arg1 == 4) {
			this.aBoolean675 = false;
			return;
		} else if (arg1 == 5) {
			this.aBoolean676 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ILclient!et;)V")
	public void method6908(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8581(-17416);
			if (local5 == 0) {
				return;
			}
			this.method6906(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(II)V")
	private void method6909(@OriginalArg(0) int arg0) {
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
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		this.anInt7734 = (int) (local68 * 256.0D);
		local60 /= 6.0D;
		this.anInt7736 = (int) (local62 * 256.0D);
		if (this.anInt7736 < 0) {
			this.anInt7736 = 0;
		} else if (this.anInt7736 > 255) {
			this.anInt7736 = 255;
		}
		if (this.anInt7734 < 0) {
			this.anInt7734 = 0;
		} else if (this.anInt7734 > 255) {
			this.anInt7734 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt7732 = (int) (local62 * (1.0D - local68) * 512.0D);
		} else {
			this.anInt7732 = (int) (local62 * 512.0D * local68);
		}
		if (this.anInt7732 < 1) {
			this.anInt7732 = 1;
		}
		this.anInt7729 = (int) ((double) this.anInt7732 * local60);
	}
}

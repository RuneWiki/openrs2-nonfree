import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class267 {

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
	public int anInt7699;

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
	public int anInt7701;

	@OriginalMember(owner = "client!wp", name = "o", descriptor = "I")
	public int anInt7707;

	@OriginalMember(owner = "client!wp", name = "q", descriptor = "I")
	public int anInt7709;

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
	public int anInt7698 = -1;

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "Z")
	public boolean aBoolean490 = true;

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
	private int anInt7708 = 0;

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
	public int anInt7705 = 128;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!lh;I)V")
	private void method6006(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1 arg1) {
		if (arg0 == 1) {
			this.anInt7708 = arg1.method4142();
			this.method6009(this.anInt7708);
		} else if (arg0 == 2) {
			this.anInt7698 = arg1.method4093();
			if (this.anInt7698 != 65535) {
				return;
			}
			this.anInt7698 = -1;
		} else if (arg0 == 3) {
			this.anInt7705 = arg1.method4093() << 0;
			return;
		} else if (arg0 == 4) {
			this.aBoolean490 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)V")
	private void method6009(@OriginalArg(1) int arg0) {
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
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local32 - local46);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		this.anInt7699 = (int) (local62 * 256.0D);
		this.anInt7707 = (int) (local68 * (double) 256);
		local60 /= 6.0D;
		if (local68 > 0.5D) {
			this.anInt7701 = (int) (local62 * (1.0D - local68) * 512.0D);
		} else {
			this.anInt7701 = (int) (local68 * 512.0D * local62);
		}
		if (this.anInt7707 < 0) {
			this.anInt7707 = 0;
		} else if (this.anInt7707 > 255) {
			this.anInt7707 = 255;
		}
		if (this.anInt7699 < 0) {
			this.anInt7699 = 0;
		} else if (this.anInt7699 > 255) {
			this.anInt7699 = 255;
		}
		if (this.anInt7701 < 1) {
			this.anInt7701 = 1;
		}
		this.anInt7709 = (int) (local60 * (double) this.anInt7701);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!lh;)V")
	public void method6010(@OriginalArg(1) Class1_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4130();
			if (local5 == 0) {
				return;
			}
			this.method6006(local5, arg0);
		}
	}
}

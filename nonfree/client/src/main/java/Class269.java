import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class269 {

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
	public int anInt7198;

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
	public int anInt7199;

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
	public int anInt7200;

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
	public int anInt7208;

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
	public int anInt7202 = 128;

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
	private int anInt7206 = 0;

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "Z")
	public boolean aBoolean523 = true;

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
	public int anInt7207 = -1;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILclient!sv;I)V")
	private void method5660(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt7206 = arg1.method3563();
			this.method5661(this.anInt7206);
		} else if (arg0 == 2) {
			this.anInt7207 = arg1.method3555();
			if (this.anInt7207 == 65535) {
				this.anInt7207 = -1;
				return;
			}
		} else if (arg0 == 3) {
			this.anInt7202 = arg1.method3555() << 0;
			return;
		} else if (arg0 == 4) {
			this.aBoolean523 = false;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BI)V")
	private void method5661(@OriginalArg(1) int arg0) {
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
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local32 - local46);
			}
		}
		this.anInt7200 = (int) (local62 * 256.0D);
		this.anInt7198 = (int) (local68 * 256.0D);
		local60 /= 6.0D;
		if (local68 > 0.5D) {
			this.anInt7199 = (int) ((1.0D - local68) * local62 * 512.0D);
		} else {
			this.anInt7199 = (int) (local68 * 512.0D * local62);
		}
		if (this.anInt7198 < 0) {
			this.anInt7198 = 0;
		} else if (this.anInt7198 > 255) {
			this.anInt7198 = 255;
		}
		if (this.anInt7200 < 0) {
			this.anInt7200 = 0;
		} else if (this.anInt7200 > 255) {
			this.anInt7200 = 255;
		}
		if (this.anInt7199 < 1) {
			this.anInt7199 = 1;
		}
		this.anInt7208 = (int) ((double) this.anInt7199 * local60);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLclient!sv;)V")
	public void method5662(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3580();
			if (local15 == 0) {
				return;
			}
			this.method5660(local15, arg0);
		}
	}
}

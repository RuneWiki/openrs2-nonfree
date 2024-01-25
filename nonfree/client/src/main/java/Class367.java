import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class367 {

	@OriginalMember(owner = "client!un", name = "h", descriptor = "I")
	public int anInt9835;

	@OriginalMember(owner = "client!un", name = "b", descriptor = "I")
	public int anInt9838;

	@OriginalMember(owner = "client!un", name = "f", descriptor = "I")
	public int anInt9843;

	@OriginalMember(owner = "client!un", name = "g", descriptor = "I")
	public int anInt9845;

	@OriginalMember(owner = "client!un", name = "e", descriptor = "I")
	private int anInt9839 = 0;

	@OriginalMember(owner = "client!un", name = "l", descriptor = "I")
	public int anInt9840 = -1;

	@OriginalMember(owner = "client!un", name = "p", descriptor = "I")
	public int anInt9841 = 512;

	@OriginalMember(owner = "client!un", name = "d", descriptor = "Z")
	public boolean aBoolean691 = true;

	@OriginalMember(owner = "client!un", name = "o", descriptor = "Z")
	public boolean aBoolean692 = true;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!wq;I)V")
	public void method8374(@OriginalArg(0) Class5_Sub36 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method7291();
			if (local13 == 0) {
				return;
			}
			this.method8377(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)V")
	private void method8376(@OriginalArg(0) int arg0) {
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
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		this.anInt9838 = (int) (local62 * 256.0D);
		this.anInt9845 = (int) (local68 * 256.0D);
		local60 /= 6.0D;
		if (this.anInt9845 < 0) {
			this.anInt9845 = 0;
		} else if (this.anInt9845 > 255) {
			this.anInt9845 = 255;
		}
		if (this.anInt9838 < 0) {
			this.anInt9838 = 0;
		} else if (this.anInt9838 > 255) {
			this.anInt9838 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt9835 = (int) ((1.0D - local68) * 512.0D * local62);
		} else {
			this.anInt9835 = (int) (local68 * local62 * 512.0D);
		}
		if (this.anInt9835 < 1) {
			this.anInt9835 = 1;
		}
		this.anInt9843 = (int) ((double) this.anInt9835 * local60);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IILclient!wq;)V")
	private void method8377(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub36 arg1) {
		if (arg0 == 1) {
			this.anInt9839 = arg1.method7331();
			this.method8376(this.anInt9839);
		} else if (arg0 == 2) {
			this.anInt9840 = arg1.method7333();
			if (this.anInt9840 == 65535) {
				this.anInt9840 = -1;
				return;
			}
			return;
		} else if (arg0 == 3) {
			this.anInt9841 = arg1.method7333() << 2;
			return;
		} else if (arg0 == 4) {
			this.aBoolean692 = false;
			return;
		} else if (arg0 == 5) {
			this.aBoolean691 = false;
			return;
		}
	}
}

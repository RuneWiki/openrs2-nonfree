import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class269 {

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
	public int anInt7436;

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
	public int anInt7437;

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
	public int anInt7440;

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
	public int anInt7443;

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
	public int anInt7438 = -1;

	@OriginalMember(owner = "client!wv", name = "k", descriptor = "I")
	public int anInt7444 = 128;

	@OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
	private int anInt7445 = 0;

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "Z")
	public boolean aBoolean489 = true;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)V")
	private void method5859(@OriginalArg(0) int arg0) {
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
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		this.anInt7437 = (int) (local62 * 256.0D);
		local60 /= 6.0D;
		this.anInt7443 = (int) (local68 * 256.0D);
		if (local68 > 0.5D) {
			this.anInt7440 = (int) ((1.0D - local68) * local62 * 512.0D);
		} else {
			this.anInt7440 = (int) (local62 * 512.0D * local68);
		}
		if (this.anInt7437 < 0) {
			this.anInt7437 = 0;
		} else if (this.anInt7437 > 255) {
			this.anInt7437 = 255;
		}
		if (this.anInt7443 < 0) {
			this.anInt7443 = 0;
		} else if (this.anInt7443 > 255) {
			this.anInt7443 = 255;
		}
		if (this.anInt7440 < 1) {
			this.anInt7440 = 1;
		}
		this.anInt7436 = (int) ((double) this.anInt7440 * local60);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!si;I)V")
	public void method5863(@OriginalArg(0) Class2_Sub23 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5495();
			if (local17 == 0) {
				return;
			}
			this.method5864(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IBLclient!si;)V")
	private void method5864(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub23 arg1) {
		if (arg0 == 1) {
			this.anInt7445 = arg1.method5485();
			this.method5859(this.anInt7445);
		} else if (arg0 == 2) {
			this.anInt7438 = arg1.method5500();
			if (this.anInt7438 == 65535) {
				this.anInt7438 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt7444 = arg1.method5500() << 0;
		} else if (arg0 == 4) {
			this.aBoolean489 = false;
		}
	}
}

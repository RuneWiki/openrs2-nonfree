import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class120 {

	@OriginalMember(owner = "client!go", name = "b", descriptor = "I")
	public int anInt3815;

	@OriginalMember(owner = "client!go", name = "d", descriptor = "I")
	public int anInt3817;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "I")
	public int anInt3821;

	@OriginalMember(owner = "client!go", name = "i", descriptor = "I")
	public int anInt3822;

	@OriginalMember(owner = "client!go", name = "f", descriptor = "I")
	public int anInt3819 = -1;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "I")
	public int anInt3818 = 128;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "I")
	private int anInt3820 = 0;

	@OriginalMember(owner = "client!go", name = "n", descriptor = "Z")
	public boolean aBoolean314 = true;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)V")
	private void method3351(@OriginalArg(0) int arg0) {
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
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		this.anInt3821 = (int) (local68 * 256.0D);
		local60 /= 6.0D;
		this.anInt3815 = (int) (local62 * 256.0D);
		if (this.anInt3821 < 0) {
			this.anInt3821 = 0;
		} else if (this.anInt3821 > 255) {
			this.anInt3821 = 255;
		}
		if (this.anInt3815 < 0) {
			this.anInt3815 = 0;
		} else if (this.anInt3815 > 255) {
			this.anInt3815 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt3822 = (int) ((1.0D - local68) * 512.0D * local62);
		} else {
			this.anInt3822 = (int) (local68 * 512.0D * local62);
		}
		if (this.anInt3822 < 1) {
			this.anInt3822 = 1;
		}
		this.anInt3817 = (int) ((double) this.anInt3822 * local60);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILclient!daa;I)V")
	private void method3352(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt3820 = arg1.method5195();
			this.method3351(this.anInt3820);
		} else if (arg0 == 2) {
			this.anInt3819 = arg1.method5199();
			if (this.anInt3819 == 65535) {
				this.anInt3819 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt3818 = arg1.method5199() << 0;
		} else if (arg0 == 4) {
			this.aBoolean314 = false;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!daa;Z)V")
	public void method3354(@OriginalArg(0) Class12_Sub8 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5216();
			if (local14 == 0) {
				return;
			}
			this.method3352(local14, arg0);
		}
	}
}

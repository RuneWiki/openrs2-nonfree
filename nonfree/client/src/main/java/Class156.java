import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class156 {

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
	public int anInt4819;

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
	public int anInt4820;

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
	public int anInt4825;

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
	public int anInt4827;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
	public int anInt4818 = 128;

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
	private int anInt4822 = 0;

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "Z")
	public boolean aBoolean364 = true;

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
	public int anInt4824 = -1;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V")
	private void method4260(@OriginalArg(1) int arg0) {
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
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / ((2.0D - local46) - local32);
			}
		}
		this.anInt4827 = (int) (local62 * 256.0D);
		this.anInt4825 = (int) (local68 * 256.0D);
		local60 /= 6.0D;
		if (this.anInt4827 < 0) {
			this.anInt4827 = 0;
		} else if (this.anInt4827 > 255) {
			this.anInt4827 = 255;
		}
		if (this.anInt4825 < 0) {
			this.anInt4825 = 0;
		} else if (this.anInt4825 > 255) {
			this.anInt4825 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt4820 = (int) (local62 * 512.0D * (1.0D - local68));
		} else {
			this.anInt4820 = (int) (local62 * local68 * 512.0D);
		}
		if (this.anInt4820 < 1) {
			this.anInt4820 = 1;
		}
		this.anInt4819 = (int) ((double) this.anInt4820 * local60);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!lf;IZ)V")
	public void method4261(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(14) int local14 = arg0.method3440();
			if (local14 == 0) {
				return;
			}
			this.method4263(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BILclient!lf;I)V")
	private void method4263(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt4822 = arg1.method3442();
			this.method4260(this.anInt4822);
		} else if (arg0 == 2) {
			this.anInt4824 = arg1.method3401();
			if (this.anInt4824 == 65535) {
				this.anInt4824 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt4818 = arg1.method3401();
		} else if (arg0 == 4) {
			this.aBoolean364 = false;
		}
	}
}

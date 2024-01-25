import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class135 {

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
	public int anInt4842;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
	public int anInt4844;

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
	public int anInt4850;

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
	public int anInt4851;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
	public int anInt4841 = -1;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
	public int anInt4845 = 512;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
	private int anInt4846 = 0;

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "Z")
	public boolean aBoolean361 = true;

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "Z")
	public boolean aBoolean362 = true;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!cea;I)V")
	public void method4183(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method8383();
			if (local11 == 0) {
				return;
			}
			this.method4184(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IILclient!cea;)V")
	private void method4184(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt4846 = arg1.method8347();
			this.method4185(this.anInt4846);
		} else if (arg0 == 2) {
			this.anInt4841 = arg1.method8326();
			if (this.anInt4841 == 65535) {
				this.anInt4841 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt4845 = arg1.method8326() << 2;
		} else if (arg0 == 4) {
			this.aBoolean362 = false;
		} else if (arg0 == 5) {
			this.aBoolean361 = false;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)V")
	private void method4185(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
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
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / ((2.0D - local46) - local32);
			}
		}
		this.anInt4842 = (int) (local62 * 256.0D);
		local60 /= 6.0D;
		this.anInt4844 = (int) (local68 * 256.0D);
		if (this.anInt4842 < 0) {
			this.anInt4842 = 0;
		} else if (this.anInt4842 > 255) {
			this.anInt4842 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt4851 = (int) ((1.0D - local68) * 512.0D * local62);
		} else {
			this.anInt4851 = (int) (local68 * 512.0D * local62);
		}
		if (this.anInt4844 < 0) {
			this.anInt4844 = 0;
		} else if (this.anInt4844 > 255) {
			this.anInt4844 = 255;
		}
		if (this.anInt4851 < 1) {
			this.anInt4851 = 1;
		}
		this.anInt4850 = (int) (local60 * (double) this.anInt4851);
	}
}

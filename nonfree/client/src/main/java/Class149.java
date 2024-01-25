import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class149 {

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
	public int anInt4252;

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
	public int anInt4254;

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
	public int anInt4256;

	@OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
	public int anInt4259;

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "Z")
	public boolean aBoolean317 = true;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
	private int anInt4246 = 0;

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
	public int anInt4251 = -1;

	@OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
	public int anInt4258 = 512;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLclient!eh;)V")
	public void method3604(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6015();
			if (local9 == 0) {
				return;
			}
			this.method3608(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)V")
	private void method3606(@OriginalArg(0) int arg0) {
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
		if (local14 < local23) {
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
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local32 - local46);
			}
		}
		local60 /= 6.0D;
		this.anInt4259 = (int) (local62 * 256.0D);
		this.anInt4256 = (int) (local68 * 256.0D);
		if (this.anInt4259 < 0) {
			this.anInt4259 = 0;
		} else if (this.anInt4259 > 255) {
			this.anInt4259 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt4254 = (int) (local62 * (1.0D - local68) * 512.0D);
		} else {
			this.anInt4254 = (int) (local62 * 512.0D * local68);
		}
		if (this.anInt4256 < 0) {
			this.anInt4256 = 0;
		} else if (this.anInt4256 > 255) {
			this.anInt4256 = 255;
		}
		if (this.anInt4254 < 1) {
			this.anInt4254 = 1;
		}
		this.anInt4252 = (int) ((double) this.anInt4254 * local60);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!eh;I)V")
	private void method3608(@OriginalArg(1) Class4_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4246 = arg0.method6023();
			this.method3606(this.anInt4246);
		} else if (arg1 == 2) {
			this.anInt4251 = arg0.method5982();
			if (this.anInt4251 == 65535) {
				this.anInt4251 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt4258 = arg0.method5982() << 2;
		} else if (arg1 == 4) {
			this.aBoolean317 = false;
		}
	}
}

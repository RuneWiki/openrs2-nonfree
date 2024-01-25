import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class192 {

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
	public int anInt5269;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
	public int anInt5272;

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
	public int anInt5273;

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
	public int anInt5274;

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "Z")
	public boolean aBoolean387 = true;

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
	private int anInt5271 = 0;

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
	public int anInt5270 = -1;

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
	public int anInt5275 = 128;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!vt;I)V")
	private void method4702(@OriginalArg(1) Class2_Sub24 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5271 = arg0.method5736();
			this.method4703(this.anInt5271);
		} else if (arg1 == 2) {
			this.anInt5270 = arg0.method5753();
			if (this.anInt5270 == 65535) {
				this.anInt5270 = -1;
				return;
			}
		} else if (arg1 == 3) {
			this.anInt5275 = arg0.method5753();
		} else if (arg1 == 4) {
			this.aBoolean387 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BI)V")
	private void method4703(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
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
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / ((2.0D - local46) - local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		this.anInt5269 = (int) (local68 * 256.0D);
		this.anInt5272 = (int) (local62 * 256.0D);
		local60 /= 6.0D;
		if (this.anInt5269 < 0) {
			this.anInt5269 = 0;
		} else if (this.anInt5269 > 255) {
			this.anInt5269 = 255;
		}
		if (this.anInt5272 < 0) {
			this.anInt5272 = 0;
		} else if (this.anInt5272 > 255) {
			this.anInt5272 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt5273 = (int) (local62 * (1.0D - local68) * 512.0D);
		} else {
			this.anInt5273 = (int) (local68 * local62 * 512.0D);
		}
		if (this.anInt5273 < 1) {
			this.anInt5273 = 1;
		}
		this.anInt5274 = (int) (local60 * (double) this.anInt5273);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!vt;I)V")
	public void method4705(@OriginalArg(0) Class2_Sub24 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5732();
			if (local5 == 0) {
				return;
			}
			this.method4702(arg0, local5);
		}
	}
}

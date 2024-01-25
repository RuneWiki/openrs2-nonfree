import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class76 {

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
	public int anInt2354;

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
	public int anInt2358;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
	public int anInt2360;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
	public int anInt2362;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
	private int anInt2353 = 0;

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
	public int anInt2364 = -1;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "Z")
	public boolean aBoolean173 = true;

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
	public int anInt2363 = 512;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "Z")
	public boolean aBoolean174 = true;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!rg;II)V")
	private void method1988(@OriginalArg(0) Class6_Sub40 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2353 = arg0.method8606();
			this.method1990(this.anInt2353);
		} else if (arg1 == 2) {
			this.anInt2364 = arg0.method8571();
			if (this.anInt2364 == 65535) {
				this.anInt2364 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt2363 = arg0.method8571() << 2;
		} else if (arg1 == 4) {
			this.aBoolean173 = false;
		} else if (arg1 == 5) {
			this.aBoolean174 = false;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!rg;)V")
	public void method1989(@OriginalArg(1) Class6_Sub40 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method8604();
			if (local7 == 0) {
				return;
			}
			this.method1988(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
	private void method1990(@OriginalArg(1) int arg0) {
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
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		this.anInt2354 = (int) (local62 * 256.0D);
		this.anInt2360 = (int) (local68 * 256.0D);
		local60 /= 6.0D;
		if (local68 > 0.5D) {
			this.anInt2362 = (int) (local62 * (1.0D - local68) * 512.0D);
		} else {
			this.anInt2362 = (int) (local62 * local68 * 512.0D);
		}
		if (this.anInt2360 < 0) {
			this.anInt2360 = 0;
		} else if (this.anInt2360 > 255) {
			this.anInt2360 = 255;
		}
		if (this.anInt2354 < 0) {
			this.anInt2354 = 0;
		} else if (this.anInt2354 > 255) {
			this.anInt2354 = 255;
		}
		if (this.anInt2362 < 1) {
			this.anInt2362 = 1;
		}
		this.anInt2358 = (int) ((double) this.anInt2362 * local60);
	}
}

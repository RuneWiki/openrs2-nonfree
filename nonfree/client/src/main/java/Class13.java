import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class13 {

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
	public int anInt405;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
	public int anInt406;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
	public int anInt413;

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
	public int anInt415;

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "Z")
	public boolean aBoolean17 = true;

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
	public int anInt409 = -1;

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
	private int anInt407 = 0;

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
	public int anInt416 = 128;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!tl;IB)V")
	private void method338(@OriginalArg(0) Class4_Sub30 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt407 = arg0.method4887();
			this.method342(this.anInt407);
		} else if (arg1 == 2) {
			this.anInt409 = arg0.method4877();
			if (this.anInt409 == 65535) {
				this.anInt409 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt416 = arg0.method4877() << 0;
		} else if (arg1 == 4) {
			this.aBoolean17 = false;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!tl;I)V")
	public void method339(@OriginalArg(0) Class4_Sub30 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method4864();
			if (local16 == 0) {
				return;
			}
			this.method338(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)V")
	private void method342(@OriginalArg(0) int arg0) {
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
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		this.anInt406 = (int) (local62 * 256.0D);
		local60 /= 6.0D;
		this.anInt413 = (int) (local68 * 256.0D);
		if (local68 > 0.5D) {
			this.anInt405 = (int) ((1.0D - local68) * 512.0D * local62);
		} else {
			this.anInt405 = (int) (local62 * local68 * 512.0D);
		}
		if (this.anInt406 < 0) {
			this.anInt406 = 0;
		} else if (this.anInt406 > 255) {
			this.anInt406 = 255;
		}
		if (this.anInt413 < 0) {
			this.anInt413 = 0;
		} else if (this.anInt413 > 255) {
			this.anInt413 = 255;
		}
		if (this.anInt405 < 1) {
			this.anInt405 = 1;
		}
		this.anInt415 = (int) ((double) this.anInt405 * local60);
	}
}

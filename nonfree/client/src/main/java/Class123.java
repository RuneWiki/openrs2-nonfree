import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class123 {

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
	public int anInt3425;

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "I")
	public int anInt3426;

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
	public int anInt3427;

	@OriginalMember(owner = "client!hca", name = "h", descriptor = "I")
	public int anInt3430;

	@OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
	public int anInt3431 = -1;

	@OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
	private int anInt3432 = 0;

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "Z")
	public boolean aBoolean277 = true;

	@OriginalMember(owner = "client!hca", name = "n", descriptor = "I")
	public int anInt3435 = 128;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(BLclient!os;)V")
	public void method3201(@OriginalArg(1) Class1_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4487();
			if (local5 == 0) {
				return;
			}
			this.method3203(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IILclient!os;)V")
	private void method3203(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt3432 = arg1.method4486();
			this.method3205(this.anInt3432);
		} else if (arg0 == 2) {
			this.anInt3431 = arg1.method4494();
			if (this.anInt3431 == 65535) {
				this.anInt3431 = -1;
				return;
			}
		} else if (arg0 == 3) {
			this.anInt3435 = arg1.method4494() << 0;
			return;
		} else if (arg0 == 4) {
			this.aBoolean277 = false;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IB)V")
	private void method3205(@OriginalArg(0) int arg0) {
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
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		this.anInt3425 = (int) (local68 * 256.0D);
		local60 /= 6.0D;
		this.anInt3426 = (int) (local62 * 256.0D);
		if (this.anInt3425 < 0) {
			this.anInt3425 = 0;
		} else if (this.anInt3425 > 255) {
			this.anInt3425 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt3430 = (int) ((1.0D - local68) * 512.0D * local62);
		} else {
			this.anInt3430 = (int) (local68 * local62 * 512.0D);
		}
		if (this.anInt3426 < 0) {
			this.anInt3426 = 0;
		} else if (this.anInt3426 > 255) {
			this.anInt3426 = 255;
		}
		if (this.anInt3430 < 1) {
			this.anInt3430 = 1;
		}
		this.anInt3427 = (int) (local60 * (double) this.anInt3430);
	}
}

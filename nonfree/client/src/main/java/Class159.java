import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class159 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
	public int anInt4468;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
	public int anInt4469;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
	public int anInt4471;

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
	public int anInt4477;

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "Z")
	public boolean aBoolean343 = true;

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
	public int anInt4474 = 512;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
	private int anInt4470 = 0;

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
	public int anInt4472 = -1;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!fd;)V")
	public void method3778(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6538();
			if (local9 == 0) {
				return;
			}
			this.method3779(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!fd;I)V")
	private void method3779(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt4470 = arg1.method6506();
			this.method3780(this.anInt4470);
		} else if (arg0 == 2) {
			this.anInt4472 = arg1.method6535();
			if (this.anInt4472 == 65535) {
				this.anInt4472 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt4474 = arg1.method6535() << 2;
		} else if (arg0 == 4) {
			this.aBoolean343 = false;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)V")
	private void method3780(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(36) double local36 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(38) double local38 = local12;
		if (local21 < local12) {
			local38 = local21;
		}
		if (local36 < local38) {
			local38 = local36;
		}
		@Pc(52) double local52 = local12;
		if (local12 < local21) {
			local52 = local21;
		}
		if (local36 > local52) {
			local52 = local36;
		}
		@Pc(66) double local66 = 0.0D;
		@Pc(68) double local68 = 0.0D;
		@Pc(74) double local74 = (local52 + local38) / 2.0D;
		if (local38 != local52) {
			if (local74 < 0.5D) {
				local68 = (local52 - local38) / (local52 + local38);
			}
			if (local52 == local12) {
				local66 = (local21 - local36) / (local52 - local38);
			} else if (local52 == local21) {
				local66 = (local36 - local12) / (local52 - local38) + 2.0D;
			} else if (local52 == local36) {
				local66 = (local12 - local21) / (-local38 + local52) + 4.0D;
			}
			if (local74 >= 0.5D) {
				local68 = (local52 - local38) / ((2.0D - local52) - local38);
			}
		}
		this.anInt4469 = (int) (local74 * 256.0D);
		local66 /= 6.0D;
		this.anInt4477 = (int) (local68 * 256.0D);
		if (local74 > 0.5D) {
			this.anInt4468 = (int) (local68 * (1.0D - local74) * 512.0D);
		} else {
			this.anInt4468 = (int) (local74 * 512.0D * local68);
		}
		if (this.anInt4477 < 0) {
			this.anInt4477 = 0;
		} else if (this.anInt4477 > 255) {
			this.anInt4477 = 255;
		}
		if (this.anInt4469 < 0) {
			this.anInt4469 = 0;
		} else if (this.anInt4469 > 255) {
			this.anInt4469 = 255;
		}
		if (this.anInt4468 < 1) {
			this.anInt4468 = 1;
		}
		this.anInt4471 = (int) (local66 * (double) this.anInt4468);
	}
}

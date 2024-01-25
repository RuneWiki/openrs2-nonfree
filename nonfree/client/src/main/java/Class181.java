import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class181 {

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
	public int anInt5613;

	@OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
	public int anInt5619;

	@OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
	public int anInt5620;

	@OriginalMember(owner = "client!rn", name = "p", descriptor = "I")
	public int anInt5621;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
	private int anInt5615 = 0;

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "Z")
	public boolean aBoolean545 = true;

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
	public int anInt5616 = 128;

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
	public int anInt5618 = -1;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILclient!bg;I)V")
	private void method4811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub8 arg2) {
		if (arg1 == 1) {
			this.anInt5615 = arg2.method4514();
			this.method4813(this.anInt5615);
		} else if (arg1 == 2) {
			this.anInt5618 = arg2.method4556();
			if (this.anInt5618 == 65535) {
				this.anInt5618 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt5616 = arg2.method4556();
		} else if (arg1 == 4) {
			this.aBoolean545 = false;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILclient!bg;)V")
	public void method4812(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method4532();
			if (local5 == 0) {
				return;
			}
			this.method4811(arg0, local5, arg1);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZI)V")
	private void method4813(@OriginalArg(1) int arg0) {
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
		if (local30 > local46) {
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
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		this.anInt5621 = (int) (local62 * 256.0D);
		local60 /= 6.0D;
		this.anInt5620 = (int) (local68 * 256.0D);
		if (local68 > 0.5D) {
			this.anInt5613 = (int) ((1.0D - local68) * local62 * 512.0D);
		} else {
			this.anInt5613 = (int) (local68 * local62 * 512.0D);
		}
		if (this.anInt5620 < 0) {
			this.anInt5620 = 0;
		} else if (this.anInt5620 > 255) {
			this.anInt5620 = 255;
		}
		if (this.anInt5621 < 0) {
			this.anInt5621 = 0;
		} else if (this.anInt5621 > 255) {
			this.anInt5621 = 255;
		}
		if (this.anInt5613 < 1) {
			this.anInt5613 = 1;
		}
		this.anInt5619 = (int) ((double) this.anInt5613 * local60);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class87 {

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
	public int anInt2590;

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
	public int anInt2591;

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
	public int anInt2594;

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
	public int anInt2599;

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
	public int anInt2586 = -1;

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
	private int anInt2589 = 0;

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
	public int anInt2593 = 128;

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "Z")
	public boolean aBoolean199 = true;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)V")
	private void method2219(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local14;
		@Pc(27) double local27 = local14;
		@Pc(38) double local38 = 0.0D;
		if (local23 > local14) {
			local27 = local23;
		}
		@Pc(46) double local46 = 0.0D;
		@Pc(53) double local53 = (double) (arg0 & 0xFF) / 256.0D;
		if (local23 < local14) {
			local25 = local23;
		}
		if (local25 > local53) {
			local25 = local53;
		}
		if (local27 < local53) {
			local27 = local53;
		}
		@Pc(78) double local78 = (local25 + local27) / 2.0D;
		this.anInt2599 = (int) (local78 * 256.0D);
		if (local27 != local25) {
			if (local78 < 0.5D) {
				local46 = (local27 - local25) / (local25 + local27);
			}
			if (local27 == local14) {
				local38 = (local23 - local53) / (local27 - local25);
			} else if (local23 == local27) {
				local38 = (local53 - local14) / (local27 - local25) + 2.0D;
			} else if (local27 == local53) {
				local38 = (local14 - local23) / (local27 - local25) + 4.0D;
			}
			if (local78 >= 0.5D) {
				local46 = (local27 - local25) / (2.0D - local27 - local25);
			}
		}
		local38 /= 6.0D;
		if (this.anInt2599 < 0) {
			this.anInt2599 = 0;
		} else if (this.anInt2599 > 255) {
			this.anInt2599 = 255;
		}
		if (local78 > 0.5D) {
			this.anInt2594 = (int) (local46 * (1.0D - local78) * 512.0D);
		} else {
			this.anInt2594 = (int) (local46 * 512.0D * local78);
		}
		if (this.anInt2594 < 1) {
			this.anInt2594 = 1;
		}
		this.anInt2590 = (int) (local46 * 256.0D);
		this.anInt2591 = (int) (local38 * (double) this.anInt2594);
		if (this.anInt2590 < 0) {
			this.anInt2590 = 0;
		} else if (this.anInt2590 > 255) {
			this.anInt2590 = 255;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!wm;BI)V")
	public void method2220(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method4261();
			if (local9 == 0) {
				return;
			}
			this.method2223(local9, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!wm;IB)V")
	private void method2223(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub26 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.anInt2589 = arg1.method4245();
			this.method2219(this.anInt2589);
		} else if (arg0 == 2) {
			this.anInt2586 = arg1.method4242();
			if (this.anInt2586 == 65535) {
				this.anInt2586 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt2593 = arg1.method4242();
		} else if (arg0 == 4) {
			this.aBoolean199 = false;
		}
	}
}

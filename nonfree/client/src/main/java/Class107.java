import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class107 {

	@OriginalMember(owner = "client!il", name = "d", descriptor = "I")
	public int anInt2595;

	@OriginalMember(owner = "client!il", name = "g", descriptor = "I")
	public int anInt2597;

	@OriginalMember(owner = "client!il", name = "l", descriptor = "I")
	public int anInt2600;

	@OriginalMember(owner = "client!il", name = "r", descriptor = "I")
	public int anInt2606;

	@OriginalMember(owner = "client!il", name = "c", descriptor = "I")
	public int anInt2594 = 128;

	@OriginalMember(owner = "client!il", name = "e", descriptor = "Z")
	public boolean aBoolean210 = true;

	@OriginalMember(owner = "client!il", name = "k", descriptor = "I")
	private int anInt2599 = 0;

	@OriginalMember(owner = "client!il", name = "o", descriptor = "I")
	public int anInt2603 = -1;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V")
	private void method2201(@OriginalArg(1) int arg0) {
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
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / ((2.0D - local46) - local32);
			}
		}
		this.anInt2597 = (int) (local62 * 256.0D);
		this.anInt2606 = (int) (local68 * 256.0D);
		local60 /= 6.0D;
		if (this.anInt2597 < 0) {
			this.anInt2597 = 0;
		} else if (this.anInt2597 > 255) {
			this.anInt2597 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt2600 = (int) ((1.0D - local68) * 512.0D * local62);
		} else {
			this.anInt2600 = (int) (local62 * local68 * 512.0D);
		}
		if (this.anInt2606 < 0) {
			this.anInt2606 = 0;
		} else if (this.anInt2606 > 255) {
			this.anInt2606 = 255;
		}
		if (this.anInt2600 < 1) {
			this.anInt2600 = 1;
		}
		this.anInt2595 = (int) ((double) this.anInt2600 * local60);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!nj;III)V")
	private void method2202(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt2599 = arg0.method5705();
			this.method2201(this.anInt2599);
		} else if (arg2 == 2) {
			this.anInt2603 = arg0.method5715();
			if (this.anInt2603 == 65535) {
				this.anInt2603 = -1;
				return;
			}
		} else if (arg2 == 3) {
			this.anInt2594 = arg0.method5715();
		} else if (arg2 == 4) {
			this.aBoolean210 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!nj;BI)V")
	public void method2204(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method5720();
			if (local5 == 0) {
				return;
			}
			this.method2202(arg0, arg1, local5);
		}
	}
}

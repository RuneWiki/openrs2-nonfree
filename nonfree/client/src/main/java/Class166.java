import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class166 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "I")
	public int anInt4598;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "I")
	public int anInt4600;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "I")
	public int anInt4602;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "I")
	public int anInt4608;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Z")
	public boolean aBoolean357 = true;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "I")
	private int anInt4599 = 0;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "I")
	public int anInt4606 = 512;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "Z")
	public boolean aBoolean358 = true;

	@OriginalMember(owner = "client!je", name = "i", descriptor = "I")
	public int anInt4605 = -1;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!io;II)V")
	private void method3957(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4599 = arg0.method4396();
			this.method3958(this.anInt4599);
		} else if (arg1 == 2) {
			this.anInt4605 = arg0.method4426();
			if (this.anInt4605 == 65535) {
				this.anInt4605 = -1;
				return;
			}
		} else if (arg1 == 3) {
			this.anInt4606 = arg0.method4426() << 2;
		} else {
			if (arg1 == 4) {
				this.aBoolean358 = false;
			} else if (arg1 == 5) {
				this.aBoolean357 = false;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
	private void method3958(@OriginalArg(1) int arg0) {
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
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local60 /= 6.0D;
		this.anInt4598 = (int) ((double) 256 * local62);
		this.anInt4608 = (int) (local68 * 256.0D);
		if (this.anInt4598 < 0) {
			this.anInt4598 = 0;
		} else if (this.anInt4598 > 255) {
			this.anInt4598 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt4600 = (int) ((1.0D - local68) * local62 * 512.0D);
		} else {
			this.anInt4600 = (int) (local68 * local62 * 512.0D);
		}
		if (this.anInt4608 < 0) {
			this.anInt4608 = 0;
		} else if (this.anInt4608 > 255) {
			this.anInt4608 = 255;
		}
		if (this.anInt4600 < 1) {
			this.anInt4600 = 1;
		}
		this.anInt4602 = (int) (local60 * (double) this.anInt4600);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!io;I)V")
	public void method3959(@OriginalArg(0) Class1_Sub20 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4393();
			if (local17 == 0) {
				return;
			}
			this.method3957(arg0, local17);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
	public int anInt329;

	@OriginalMember(owner = "client!cb", name = "Z", descriptor = "I")
	public int anInt332;

	@OriginalMember(owner = "client!cb", name = "ib", descriptor = "I")
	public int anInt338;

	@OriginalMember(owner = "client!cb", name = "lb", descriptor = "I")
	public int anInt339;

	@OriginalMember(owner = "client!cb", name = "pb", descriptor = "I")
	private int anInt340 = 0;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ka;IZ)V")
	public void method249(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(10) int local10 = arg0.method1186();
			if (local10 == 0) {
				return;
			}
			this.method250(arg1, local10, arg0);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIILclient!ka;)V")
	private void method250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub8 arg2) {
		if (arg1 == 1) {
			this.anInt340 = arg2.method1202();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)V")
	private void method254(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local30;
		if (local30 > local21) {
			local32 = local21;
		}
		@Pc(40) double local40 = local30;
		@Pc(42) double local42 = 0.0D;
		if (local30 < local21) {
			local40 = local21;
		}
		if (local8 < local32) {
			local32 = local8;
		}
		if (local8 > local40) {
			local40 = local8;
		}
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local40 + local32) / 2.0D;
		if (local32 != local40) {
			if (local30 == local40) {
				local42 = (local21 - local8) / (-local32 + local40);
			} else if (local21 == local40) {
				local42 = (local8 - local30) / (local40 - local32) + 2.0D;
			} else if (local8 == local40) {
				local42 = (local30 - local21) / (-local32 + local40) + 4.0D;
			}
			if (local76 < 0.5D) {
				local70 = (local40 - local32) / (local40 + local32);
			}
			if (local76 >= 0.5D) {
				local70 = (local40 - local32) / (2.0D - local40 - local32);
			}
		}
		if (local76 > 0.5D) {
			this.anInt332 = (int) (local70 * (1.0D - local76) * 512.0D);
		} else {
			this.anInt332 = (int) (local76 * 512.0D * local70);
		}
		this.anInt339 = (int) (local70 * 256.0D);
		if (this.anInt332 < 1) {
			this.anInt332 = 1;
		}
		this.anInt329 = (int) (local76 * 256.0D);
		if (this.anInt329 < 0) {
			this.anInt329 = 0;
		} else if (this.anInt329 > 255) {
			this.anInt329 = 255;
		}
		local42 /= 6.0D;
		if (this.anInt339 < 0) {
			this.anInt339 = 0;
		} else if (this.anInt339 > 255) {
			this.anInt339 = 255;
		}
		this.anInt338 = (int) ((double) this.anInt332 * local42);
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)V")
	public void method255() {
		this.method254(this.anInt340);
	}
}

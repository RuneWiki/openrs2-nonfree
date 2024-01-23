import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class54 {

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
	public int anInt1428;

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
	public int anInt1431;

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
	public int anInt1440;

	@OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
	public int anInt1442;

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
	public int anInt1433 = 128;

	@OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
	public int anInt1443 = -1;

	@OriginalMember(owner = "client!fj", name = "q", descriptor = "Z")
	public boolean aBoolean117 = true;

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
	private int anInt1438 = 0;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILclient!sb;)V")
	public void method1199(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		while (true) {
			@Pc(13) int local13 = arg1.method2595();
			if (local13 == 0) {
				return;
			}
			this.method1205(local13, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V")
	private void method1204(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local23;
		if (local23 > local14) {
			local25 = local14;
		}
		@Pc(46) double local46 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(48) double local48 = 0.0D;
		@Pc(50) double local50 = local23;
		@Pc(52) double local52 = 0.0D;
		if (local46 < local25) {
			local25 = local46;
		}
		if (local23 < local14) {
			local50 = local14;
		}
		if (local50 < local46) {
			local50 = local46;
		}
		@Pc(78) double local78 = (local25 + local50) / 2.0D;
		if (local50 != local25) {
			if (local78 < 0.5D) {
				local52 = (local50 - local25) / (local25 + local50);
			}
			if (local78 >= 0.5D) {
				local52 = (local50 - local25) / (2.0D - local50 - local25);
			}
			if (local50 == local23) {
				local48 = (local14 - local46) / (local50 - local25);
			} else if (local14 == local50) {
				local48 = (local46 - local23) / (-local25 + local50) + 2.0D;
			} else if (local46 == local50) {
				local48 = (local23 - local14) / (local50 - local25) + 4.0D;
			}
		}
		this.anInt1442 = (int) (local78 * 256.0D);
		this.anInt1428 = (int) (local52 * 256.0D);
		if (this.anInt1442 < 0) {
			this.anInt1442 = 0;
		} else if (this.anInt1442 > 255) {
			this.anInt1442 = 255;
		}
		local48 /= 6.0D;
		if (this.anInt1428 < 0) {
			this.anInt1428 = 0;
		} else if (this.anInt1428 > 255) {
			this.anInt1428 = 255;
		}
		if (local78 > 0.5D) {
			this.anInt1431 = (int) (local52 * 512.0D * (1.0D - local78));
		} else {
			this.anInt1431 = (int) (local78 * local52 * 512.0D);
		}
		if (this.anInt1431 < 1) {
			this.anInt1431 = 1;
		}
		this.anInt1440 = (int) (local48 * (double) this.anInt1431);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BILclient!sb;I)V")
	private void method1205(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt1438 = arg1.method2588();
			this.method1204(this.anInt1438);
		} else if (arg0 == 2) {
			this.anInt1443 = arg1.method2593();
			if (this.anInt1443 == 65535) {
				this.anInt1443 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt1433 = arg1.method2593();
		} else if (arg0 == 4) {
			this.aBoolean117 = false;
		}
	}
}

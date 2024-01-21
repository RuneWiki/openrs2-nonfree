import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!re", name = "Z", descriptor = "I")
	public int anInt2675;

	@OriginalMember(owner = "client!re", name = "cb", descriptor = "I")
	public int anInt2678;

	@OriginalMember(owner = "client!re", name = "eb", descriptor = "I")
	public int anInt2679;

	@OriginalMember(owner = "client!re", name = "ib", descriptor = "I")
	public int anInt2681;

	@OriginalMember(owner = "client!re", name = "W", descriptor = "I")
	private int anInt2673 = 0;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(II)V")
	private void method1878(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = local21;
		@Pc(25) double local25 = local21;
		@Pc(38) double local38 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		if (local21 > local38) {
			local23 = local38;
		}
		if (local23 > local12) {
			local23 = local12;
		}
		if (local38 > local21) {
			local25 = local38;
		}
		@Pc(58) double local58 = 0.0D;
		if (local12 > local25) {
			local25 = local12;
		}
		@Pc(66) double local66 = 0.0D;
		@Pc(72) double local72 = (local23 + local25) / 2.0D;
		if (local23 != local25) {
			if (local72 < 0.5D) {
				local66 = (local25 - local23) / (local23 + local25);
			}
			if (local21 == local25) {
				local58 = (local38 - local12) / (local25 - local23);
			} else if (local25 == local38) {
				local58 = (local12 - local21) / (-local23 + local25) + 2.0D;
			} else if (local12 == local25) {
				local58 = (local21 - local38) / (local25 - local23) + 4.0D;
			}
			if (local72 >= 0.5D) {
				local66 = (local25 - local23) / (2.0D - local25 - local23);
			}
		}
		if (local72 > 0.5D) {
			this.anInt2678 = (int) (local66 * (1.0D - local72) * 512.0D);
		} else {
			this.anInt2678 = (int) (local72 * 512.0D * local66);
		}
		this.anInt2679 = (int) (local72 * 256.0D);
		if (this.anInt2679 < 0) {
			this.anInt2679 = 0;
		} else if (this.anInt2679 > 255) {
			this.anInt2679 = 255;
		}
		local58 /= 6.0D;
		if (this.anInt2678 < 1) {
			this.anInt2678 = 1;
		}
		this.anInt2675 = (int) ((double) this.anInt2678 * local58);
		this.anInt2681 = (int) (local66 * 256.0D);
		if (this.anInt2681 < 0) {
			this.anInt2681 = 0;
		} else if (this.anInt2681 > 255) {
			this.anInt2681 = 255;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!qc;I)V")
	public void method1880(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method2169();
			if (local9 == 0) {
				return;
			}
			this.method1883(local9, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(B)V")
	public void method1881() {
		this.method1878(this.anInt2673);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIILclient!qc;)V")
	private void method1883(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub18 arg2) {
		if (arg0 == 1) {
			this.anInt2673 = arg2.method2145();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class10 {

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
	public int anInt323;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	public int anInt328;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	public int anInt329;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
	public int anInt331;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
	private int anInt319 = -1;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
	private int anInt330 = 0;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBILclient!vf;)V")
	private void method327(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub26 arg2) {
		if (arg0 == 1) {
			this.anInt330 = arg2.method2937();
			this.method332(this.anInt330);
		} else if (arg0 == 2) {
			this.anInt319 = arg2.method2964();
			if (this.anInt319 == 65535) {
				this.anInt319 = -1;
			}
		} else if (arg0 == 3) {
			arg2.method2964();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!vf;II)V")
	public void method331(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method2945();
			if (local9 == 0) {
				return;
			}
			this.method327(local9, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)V")
	private void method332(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(19) double local19 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = local19;
		@Pc(32) double local32 = (double) (arg0 & 0xFF) / 256.0D;
		if (local19 > local10) {
			local21 = local10;
		}
		@Pc(47) double local47 = local19;
		if (local21 > local32) {
			local21 = local32;
		}
		@Pc(55) double local55 = 0.0D;
		if (local19 < local10) {
			local47 = local10;
		}
		if (local32 > local47) {
			local47 = local32;
		}
		@Pc(69) double local69 = 0.0D;
		@Pc(75) double local75 = (local47 + local21) / 2.0D;
		this.anInt329 = (int) (local75 * 256.0D);
		if (local47 != local21) {
			if (local75 < 0.5D) {
				local69 = (local47 - local21) / (local47 + local21);
			}
			if (local47 == local19) {
				local55 = (local10 - local32) / (local47 - local21);
			} else if (local47 == local10) {
				local55 = (local32 - local19) / (local47 - local21) + 2.0D;
			} else if (local47 == local32) {
				local55 = (local19 - local10) / (-local21 + local47) + 4.0D;
			}
			if (local75 >= 0.5D) {
				local69 = (local47 - local21) / ((2.0D - local47) - local21);
			}
		}
		if (local75 > 0.5D) {
			this.anInt328 = (int) (local69 * (1.0D - local75) * 512.0D);
		} else {
			this.anInt328 = (int) (local69 * 512.0D * local75);
		}
		this.anInt323 = (int) (local69 * 256.0D);
		if (this.anInt328 < 1) {
			this.anInt328 = 1;
		}
		if (this.anInt329 < 0) {
			this.anInt329 = 0;
		} else if (this.anInt329 > 255) {
			this.anInt329 = 255;
		}
		if (this.anInt323 < 0) {
			this.anInt323 = 0;
		} else if (this.anInt323 > 255) {
			this.anInt323 = 255;
		}
		local55 /= 6.0D;
		this.anInt331 = (int) ((double) this.anInt328 * local55);
	}
}

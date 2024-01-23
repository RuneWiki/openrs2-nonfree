import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class172 {

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
	public int anInt5461;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
	public int anInt5465;

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
	public int anInt5466;

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
	public int anInt5468;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
	private int anInt5463 = 0;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
	public int anInt5456 = 128;

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
	public int anInt5457 = -1;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "Z")
	public boolean aBoolean363 = true;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILclient!oe;I)V")
	public void method4325(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method2146();
			if (local5 == 0) {
				return;
			}
			this.method4328(local5, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)V")
	private void method4326(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local14;
		@Pc(32) double local32 = local14;
		if (local28 < local14) {
			local32 = local28;
		}
		if (local14 < local28) {
			local30 = local28;
		}
		@Pc(53) double local53 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(55) double local55 = 0.0D;
		if (local30 < local53) {
			local30 = local53;
		}
		if (local32 > local53) {
			local32 = local53;
		}
		@Pc(69) double local69 = 0.0D;
		@Pc(75) double local75 = (local30 + local32) / 2.0D;
		this.anInt5461 = (int) (local75 * 256.0D);
		if (local32 != local30) {
			if (local14 == local30) {
				local55 = (local28 - local53) / (local30 - local32);
			} else if (local28 == local30) {
				local55 = (local53 - local14) / (-local32 + local30) + 2.0D;
			} else if (local30 == local53) {
				local55 = (local14 - local28) / (-local32 + local30) + 4.0D;
			}
			if (local75 < 0.5D) {
				local69 = (local30 - local32) / (local32 + local30);
			}
			if (local75 >= 0.5D) {
				local69 = (local30 - local32) / (2.0D - local32 - local30);
			}
		}
		if (local75 > 0.5D) {
			this.anInt5465 = (int) (local69 * (1.0D - local75) * 512.0D);
		} else {
			this.anInt5465 = (int) (local69 * local75 * 512.0D);
		}
		if (this.anInt5461 < 0) {
			this.anInt5461 = 0;
		} else if (this.anInt5461 > 255) {
			this.anInt5461 = 255;
		}
		this.anInt5466 = (int) (local69 * 256.0D);
		local55 /= 6.0D;
		if (this.anInt5466 < 0) {
			this.anInt5466 = 0;
		} else if (this.anInt5466 > 255) {
			this.anInt5466 = 255;
		}
		if (this.anInt5465 < 1) {
			this.anInt5465 = 1;
		}
		this.anInt5468 = (int) ((double) this.anInt5465 * local55);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIILclient!oe;)V")
	private void method4328(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub16 arg2) {
		if (arg0 == 1) {
			this.anInt5463 = arg2.method2166();
			this.method4326(this.anInt5463);
		} else if (arg0 == 2) {
			this.anInt5457 = arg2.method2130();
			if (this.anInt5457 == 65535) {
				this.anInt5457 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt5456 = arg2.method2130();
		} else if (arg0 == 4) {
			this.aBoolean363 = false;
		}
	}
}

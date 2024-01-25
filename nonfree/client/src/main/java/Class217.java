import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class217 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
	public int anInt6516;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
	public int anInt6518;

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
	public int anInt6521;

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
	public int anInt6522;

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "Z")
	public boolean aBoolean410 = true;

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
	public int anInt6523 = 128;

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
	public int anInt6517 = -1;

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
	private int anInt6527 = 0;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ia;I)V")
	public void method4974(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1171();
			if (local15 == 0) {
				return;
			}
			this.method4977(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ)V")
	private void method4976(@OriginalArg(0) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local12;
		if (local12 > local21) {
			local30 = local21;
		}
		if (local30 > local28) {
			local30 = local28;
		}
		@Pc(44) double local44 = local12;
		if (local12 < local21) {
			local44 = local21;
		}
		if (local44 < local28) {
			local44 = local28;
		}
		@Pc(58) double local58 = 0.0D;
		@Pc(60) double local60 = 0.0D;
		@Pc(66) double local66 = (local44 + local30) / 2.0D;
		if (local44 != local30) {
			if (local66 < 0.5D) {
				local60 = (local44 - local30) / (local30 + local44);
			}
			if (local66 >= 0.5D) {
				local60 = (local44 - local30) / ((2.0D - local44) - local30);
			}
			if (local12 == local44) {
				local58 = (local21 - local28) / (local44 - local30);
			} else if (local44 == local21) {
				local58 = (local28 - local12) / (local44 - local30) + 2.0D;
			} else if (local28 == local44) {
				local58 = (local12 - local21) / (-local30 + local44) + 4.0D;
			}
		}
		local58 /= 6.0D;
		this.anInt6516 = (int) (local60 * 256.0D);
		this.anInt6522 = (int) (local66 * 256.0D);
		if (this.anInt6516 < 0) {
			this.anInt6516 = 0;
		} else if (this.anInt6516 > 255) {
			this.anInt6516 = 255;
		}
		if (this.anInt6522 < 0) {
			this.anInt6522 = 0;
		} else if (this.anInt6522 > 255) {
			this.anInt6522 = 255;
		}
		if (local66 > 0.5D) {
			this.anInt6521 = (int) ((1.0D - local66) * 512.0D * local60);
		} else {
			this.anInt6521 = (int) (local66 * 512.0D * local60);
		}
		if (this.anInt6521 < 1) {
			this.anInt6521 = 1;
		}
		this.anInt6518 = (int) ((double) this.anInt6521 * local58);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ia;BI)V")
	private void method4977(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6527 = arg0.method1226();
			this.method4976(this.anInt6527);
		} else if (arg1 == 2) {
			this.anInt6517 = arg0.method1177();
			if (this.anInt6517 == 65535) {
				this.anInt6517 = -1;
				return;
			}
		} else if (arg1 == 3) {
			this.anInt6523 = arg0.method1177() << 0;
			return;
		} else if (arg1 == 4) {
			this.aBoolean410 = false;
		} else {
			return;
		}
	}
}

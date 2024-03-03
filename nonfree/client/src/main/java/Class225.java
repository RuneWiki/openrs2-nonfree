import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class225 {

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "[I")
	public static final int[] anIntArray429 = new int[14];

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
	public int anInt6360;

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
	public int anInt6366;

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
	public int anInt6367;

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
	public int anInt6369;

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
	private int anInt6362 = 0;

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "Z")
	public boolean aBoolean430 = true;

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
	public int anInt6365 = 128;

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
	public int anInt6372 = -1;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IB)V", line = 148)
	private void method5772(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(64) double local64 = 0.0D;
		@Pc(66) double local66 = 0.0D;
		@Pc(72) double local72 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local72 < 0.5D) {
				local66 = (local46 - local32) / (local46 + local32);
			}
			if (local72 >= 0.5D) {
				local66 = (local46 - local32) / ((2.0D - local46) - local32);
			}
			if (local14 == local46) {
				local64 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local64 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local64 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		local64 /= 6.0D;
		this.anInt6369 = (int) (local72 * 256.0D);
		this.anInt6367 = (int) (local66 * 256.0D);
		if (local72 > 0.5D) {
			this.anInt6360 = (int) (local66 * 512.0D * (1.0D - local72));
		} else {
			this.anInt6360 = (int) (local72 * local66 * 512.0D);
		}
		if (this.anInt6369 < 0) {
			this.anInt6369 = 0;
		} else if (this.anInt6369 > 255) {
			this.anInt6369 = 255;
		}
		if (this.anInt6367 < 0) {
			this.anInt6367 = 0;
		} else if (this.anInt6367 > 255) {
			this.anInt6367 = 255;
		}
		if (this.anInt6360 < 1) {
			this.anInt6360 = 1;
		}
		this.anInt6366 = (int) ((double) this.anInt6360 * local64);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!bt;I)V", line = 258)
	public void method5774(@OriginalArg(0) Class2_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4816();
			if (local5 == 0) {
				return;
			}
			this.method5775(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!bt;IZ)V", line = 283)
	private void method5775(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6362 = arg0.method4834();
			this.method5772(this.anInt6362);
		} else if (arg1 == 2) {
			this.anInt6372 = arg0.method4830();
			if (this.anInt6372 == 65535) {
				this.anInt6372 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt6365 = arg0.method4830();
		} else if (arg1 == 4) {
			this.aBoolean430 = false;
		}
	}
}

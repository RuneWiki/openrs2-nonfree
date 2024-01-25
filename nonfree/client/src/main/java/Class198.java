import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class198 {

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public int anInt5545;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
	public int anInt5547;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
	public int anInt5552;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
	public int anInt5554;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Z")
	public boolean aBoolean363 = true;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
	public int anInt5550 = 128;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	private int anInt5546 = 0;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
	public int anInt5555 = -1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!nn;Z)V")
	public void method4422(@OriginalArg(0) Class10_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2502();
			if (local9 == 0) {
				return;
			}
			this.method4426(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
	private void method4423(@OriginalArg(1) int arg0) {
		@Pc(18) double local18 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(27) double local27 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(34) double local34 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(36) double local36 = local18;
		if (local27 < local18) {
			local36 = local27;
		}
		if (local34 < local36) {
			local36 = local34;
		}
		@Pc(50) double local50 = local18;
		if (local18 < local27) {
			local50 = local27;
		}
		if (local50 < local34) {
			local50 = local34;
		}
		@Pc(64) double local64 = 0.0D;
		@Pc(66) double local66 = 0.0D;
		@Pc(72) double local72 = (local50 + local36) / 2.0D;
		if (local50 != local36) {
			if (local72 < 0.5D) {
				local66 = (local50 - local36) / (local50 + local36);
			}
			if (local18 == local50) {
				local64 = (local27 - local34) / (local50 - local36);
			} else if (local27 == local50) {
				local64 = (local34 - local18) / (local50 - local36) + 2.0D;
			} else if (local50 == local34) {
				local64 = (local18 - local27) / (-local36 + local50) + 4.0D;
			}
			if (local72 >= 0.5D) {
				local66 = (local50 - local36) / (2.0D - local36 - local50);
			}
		}
		this.anInt5554 = (int) (local72 * 256.0D);
		this.anInt5547 = (int) (local66 * 256.0D);
		local64 /= 6.0D;
		if (this.anInt5554 < 0) {
			this.anInt5554 = 0;
		} else if (this.anInt5554 > 255) {
			this.anInt5554 = 255;
		}
		if (this.anInt5547 < 0) {
			this.anInt5547 = 0;
		} else if (this.anInt5547 > 255) {
			this.anInt5547 = 255;
		}
		if (local72 > 0.5D) {
			this.anInt5552 = (int) ((1.0D - local72) * local66 * 512.0D);
		} else {
			this.anInt5552 = (int) (local66 * 512.0D * local72);
		}
		if (this.anInt5552 < 1) {
			this.anInt5552 = 1;
		}
		this.anInt5545 = (int) ((double) this.anInt5552 * local64);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBLclient!nn;)V")
	private void method4426(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt5546 = arg1.method2507();
			this.method4423(this.anInt5546);
		} else if (arg0 == 2) {
			this.anInt5555 = arg1.method2485();
			if (this.anInt5555 == 65535) {
				this.anInt5555 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt5550 = arg1.method2485() << 0;
		} else if (arg0 == 4) {
			this.aBoolean363 = false;
		}
	}
}

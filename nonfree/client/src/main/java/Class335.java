import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class335 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
	public int anInt9173;

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
	public int anInt9176;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
	public int anInt9178;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
	public int anInt9180;

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
	public int anInt9177 = -1;

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "Z")
	public boolean aBoolean785 = true;

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
	private int anInt9182 = 0;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
	public int anInt9183 = 512;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "Z")
	public boolean aBoolean786 = true;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!mc;II)V")
	private void method7759(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9182 = arg0.method7807();
			this.method7761(this.anInt9182);
		} else if (arg1 == 2) {
			this.anInt9177 = arg0.method7860();
			if (this.anInt9177 == 65535) {
				this.anInt9177 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt9183 = arg0.method7860() << 2;
		} else if (arg1 == 4) {
			this.aBoolean785 = false;
		} else if (arg1 == 5) {
			this.aBoolean786 = false;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!mc;I)V")
	public void method7760(@OriginalArg(0) Class5_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method7816();
			if (local3 == 0) {
				return;
			}
			this.method7759(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
	private void method7761(@OriginalArg(1) int arg0) {
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
		@Pc(48) double local48 = local12;
		if (local12 < local21) {
			local48 = local21;
		}
		if (local28 > local48) {
			local48 = local28;
		}
		@Pc(62) double local62 = 0.0D;
		@Pc(64) double local64 = 0.0D;
		@Pc(70) double local70 = (local30 + local48) / 2.0D;
		if (local30 != local48) {
			if (local70 < 0.5D) {
				local64 = (local48 - local30) / (local48 + local30);
			}
			if (local70 >= 0.5D) {
				local64 = (local48 - local30) / ((2.0D - local48) - local30);
			}
			if (local48 == local12) {
				local62 = (local21 - local28) / (local48 - local30);
			} else if (local48 == local21) {
				local62 = (local28 - local12) / (-local30 + local48) + 2.0D;
			} else if (local28 == local48) {
				local62 = (local12 - local21) / (-local30 + local48) + 4.0D;
			}
		}
		this.anInt9178 = (int) (local70 * 256.0D);
		local62 /= 6.0D;
		this.anInt9180 = (int) (local64 * 256.0D);
		if (local70 > 0.5D) {
			this.anInt9176 = (int) (local64 * (1.0D - local70) * 512.0D);
		} else {
			this.anInt9176 = (int) (local64 * local70 * 512.0D);
		}
		if (this.anInt9180 < 0) {
			this.anInt9180 = 0;
		} else if (this.anInt9180 > 255) {
			this.anInt9180 = 255;
		}
		if (this.anInt9178 < 0) {
			this.anInt9178 = 0;
		} else if (this.anInt9178 > 255) {
			this.anInt9178 = 255;
		}
		if (this.anInt9176 < 1) {
			this.anInt9176 = 1;
		}
		this.anInt9173 = (int) ((double) this.anInt9176 * local62);
	}
}

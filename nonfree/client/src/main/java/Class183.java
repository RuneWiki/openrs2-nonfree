import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class183 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
	public int anInt5051;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
	public int anInt5053;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
	public int anInt5056;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
	public int anInt5062;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
	public int anInt5052 = -1;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
	private int anInt5057 = 0;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Z")
	public boolean aBoolean394 = true;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "Z")
	public boolean aBoolean395 = true;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
	public int anInt5055 = 512;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!qh;B)V")
	public void method4397(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3118();
			if (local11 == 0) {
				return;
			}
			this.method4400(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZI)V")
	private void method4399(@OriginalArg(1) int arg0) {
		@Pc(21) double local21 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(37) double local37 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(39) double local39 = local21;
		if (local21 > local30) {
			local39 = local30;
		}
		if (local39 > local37) {
			local39 = local37;
		}
		@Pc(53) double local53 = local21;
		if (local30 > local21) {
			local53 = local30;
		}
		if (local53 < local37) {
			local53 = local37;
		}
		@Pc(67) double local67 = 0.0D;
		@Pc(69) double local69 = 0.0D;
		@Pc(75) double local75 = (local53 + local39) / 2.0D;
		if (local53 != local39) {
			if (local75 < 0.5D) {
				local69 = (local53 - local39) / (local53 + local39);
			}
			if (local75 >= 0.5D) {
				local69 = (local53 - local39) / (2.0D - local53 - local39);
			}
			if (local53 == local21) {
				local67 = (local30 - local37) / (local53 - local39);
			} else if (local30 == local53) {
				local67 = (local37 - local21) / (local53 - local39) + 2.0D;
			} else if (local37 == local53) {
				local67 = (local21 - local30) / (-local39 + local53) + 4.0D;
			}
		}
		local67 /= 6.0D;
		this.anInt5051 = (int) (local75 * 256.0D);
		this.anInt5053 = (int) (local69 * 256.0D);
		if (this.anInt5051 < 0) {
			this.anInt5051 = 0;
		} else if (this.anInt5051 > 255) {
			this.anInt5051 = 255;
		}
		if (local75 > 0.5D) {
			this.anInt5056 = (int) (local69 * 512.0D * (1.0D - local75));
		} else {
			this.anInt5056 = (int) (local69 * local75 * 512.0D);
		}
		if (this.anInt5053 < 0) {
			this.anInt5053 = 0;
		} else if (this.anInt5053 > 255) {
			this.anInt5053 = 255;
		}
		if (this.anInt5056 < 1) {
			this.anInt5056 = 1;
		}
		this.anInt5062 = (int) (local67 * (double) this.anInt5056);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZILclient!qh;)V")
	private void method4400(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt5057 = arg1.method3126();
			this.method4399(this.anInt5057);
		} else if (arg0 == 2) {
			this.anInt5052 = arg1.method3109();
			if (this.anInt5052 == 65535) {
				this.anInt5052 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt5055 = arg1.method3109() << 2;
		} else if (arg0 == 4) {
			this.aBoolean395 = false;
		} else if (arg0 == 5) {
			this.aBoolean394 = false;
		}
	}
}

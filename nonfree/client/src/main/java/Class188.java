import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class188 {

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
	public int anInt5714;

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
	public int anInt5716;

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
	public int anInt5717;

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
	public int anInt5718;

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "Z")
	public boolean aBoolean389 = true;

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "Z")
	public boolean aBoolean390 = true;

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
	private int anInt5719 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
	public int anInt5711 = -1;

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
	public int anInt5721 = 512;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!ie;II)V")
	private void method4635(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5719 = arg0.method6830();
			this.method4638(this.anInt5719);
		} else if (arg1 == 2) {
			this.anInt5711 = arg0.method6811();
			if (this.anInt5711 == 65535) {
				this.anInt5711 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt5721 = arg0.method6811() << 2;
		} else if (arg1 == 4) {
			this.aBoolean389 = false;
		} else if (arg1 == 5) {
			this.aBoolean390 = false;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!ie;)V")
	public void method4637(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6814();
			if (local5 == 0) {
				return;
			}
			this.method4635(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
	private void method4638(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local14;
		if (local23 < local14) {
			local40 = local23;
		}
		if (local30 < local40) {
			local40 = local30;
		}
		@Pc(54) double local54 = local14;
		if (local23 > local14) {
			local54 = local23;
		}
		if (local30 > local54) {
			local54 = local30;
		}
		@Pc(68) double local68 = 0.0D;
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local54 + local40) / 2.0D;
		if (local40 != local54) {
			if (local76 < 0.5D) {
				local70 = (local54 - local40) / (local40 + local54);
			}
			if (local76 >= 0.5D) {
				local70 = (local54 - local40) / (2.0D - local54 - local40);
			}
			if (local14 == local54) {
				local68 = (local23 - local30) / (local54 - local40);
			} else if (local23 == local54) {
				local68 = (local30 - local14) / (-local40 + local54) + 2.0D;
			} else if (local30 == local54) {
				local68 = (local14 - local23) / (-local40 + local54) + 4.0D;
			}
		}
		this.anInt5718 = (int) (local70 * 256.0D);
		this.anInt5717 = (int) (local76 * 256.0D);
		local68 /= 6.0D;
		if (local76 > 0.5D) {
			this.anInt5714 = (int) (local70 * 512.0D * (1.0D - local76));
		} else {
			this.anInt5714 = (int) (local70 * 512.0D * local76);
		}
		if (this.anInt5717 < 0) {
			this.anInt5717 = 0;
		} else if (this.anInt5717 > 255) {
			this.anInt5717 = 255;
		}
		if (this.anInt5718 < 0) {
			this.anInt5718 = 0;
		} else if (this.anInt5718 > 255) {
			this.anInt5718 = 255;
		}
		if (this.anInt5714 < 1) {
			this.anInt5714 = 1;
		}
		this.anInt5716 = (int) (local68 * (double) this.anInt5714);
	}
}

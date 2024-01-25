import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class89 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
	public int anInt2404;

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
	public int anInt2406;

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
	public int anInt2414;

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
	public int anInt2417;

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
	public int anInt2408 = -1;

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "Z")
	public boolean aBoolean164 = true;

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
	public int anInt2413 = 128;

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
	private int anInt2411 = 0;

	static {
		new Class198(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)V")
	private void method1946(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		this.anInt2406 = (int) (local62 * 256.0D);
		local60 /= 6.0D;
		this.anInt2414 = (int) (local68 * 256.0D);
		if (this.anInt2406 < 0) {
			this.anInt2406 = 0;
		} else if (this.anInt2406 > 255) {
			this.anInt2406 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt2417 = (int) (local62 * 512.0D * (1.0D - local68));
		} else {
			this.anInt2417 = (int) (local68 * 512.0D * local62);
		}
		if (this.anInt2414 < 0) {
			this.anInt2414 = 0;
		} else if (this.anInt2414 > 255) {
			this.anInt2414 = 255;
		}
		if (this.anInt2417 < 1) {
			this.anInt2417 = 1;
		}
		this.anInt2404 = (int) (local60 * (double) this.anInt2417);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILclient!fh;)V")
	public void method1947(@OriginalArg(1) Class5_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5539();
			if (local9 == 0) {
				return;
			}
			this.method1950(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZLclient!fh;)V")
	private void method1950(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt2411 = arg1.method5541();
			this.method1946(this.anInt2411);
		} else if (arg0 == 2) {
			this.anInt2408 = arg1.method5598();
			if (this.anInt2408 == 65535) {
				this.anInt2408 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt2413 = arg1.method5598() << 0;
		} else if (arg0 == 4) {
			this.aBoolean164 = false;
		}
	}
}

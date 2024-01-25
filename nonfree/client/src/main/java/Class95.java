import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class95 {

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
	public int anInt2891;

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
	public int anInt2895;

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
	public int anInt2897;

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
	public int anInt2898;

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "Z")
	public boolean aBoolean185 = true;

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
	public int anInt2892 = -1;

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
	private int anInt2890 = 0;

	@OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
	public int anInt2899 = 128;

	static {
		new Class267("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!ae;I)V")
	public void method2411(@OriginalArg(0) Class6_Sub1 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6433();
			if (local13 == 0) {
				return;
			}
			this.method2415(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)V")
	private void method2412(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(61) double local61 = (double) 0;
		@Pc(63) double local63 = 0.0D;
		@Pc(69) double local69 = (local46 + local32) / 2.0D;
		if (local32 != local46) {
			if (local69 < 0.5D) {
				local63 = (local46 - local32) / (local46 + local32);
			}
			if (local46 == local14) {
				local61 = (local23 - local30) / (-local32 + local46);
			} else if (local46 == local23) {
				local61 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local61 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local69 >= 0.5D) {
				local63 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local61 /= 6.0D;
		this.anInt2895 = (int) (local63 * 256.0D);
		this.anInt2898 = (int) (local69 * 256.0D);
		if (local69 > 0.5D) {
			this.anInt2897 = (int) (local63 * 512.0D * (1.0D - local69));
		} else {
			this.anInt2897 = (int) (local69 * 512.0D * local63);
		}
		if (this.anInt2895 < 0) {
			this.anInt2895 = 0;
		} else if (this.anInt2895 > 255) {
			this.anInt2895 = 255;
		}
		if (this.anInt2898 < 0) {
			this.anInt2898 = 0;
		} else if (this.anInt2898 > 255) {
			this.anInt2898 = 255;
		}
		if (this.anInt2897 < 1) {
			this.anInt2897 = 1;
		}
		this.anInt2891 = (int) ((double) this.anInt2897 * local61);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!ae;BI)V")
	private void method2415(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2890 = arg0.method6435();
			this.method2412(this.anInt2890);
		} else if (arg1 == 2) {
			this.anInt2892 = arg0.method6485();
			if (this.anInt2892 == 65535) {
				this.anInt2892 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt2899 = arg0.method6485() << 0;
		} else if (arg1 == 4) {
			this.aBoolean185 = false;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class220 {

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
	public int anInt5963;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
	public int anInt5964;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
	public int anInt5968;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
	public int anInt5969;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
	private int anInt5962 = 0;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
	public int anInt5967 = -1;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "Z")
	public boolean aBoolean416 = true;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
	public int anInt5966 = 128;

	static {
		new Class7("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V")
	private void method4967(@OriginalArg(1) int arg0) {
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
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(61) double local61 = (double) 0;
		@Pc(63) double local63 = 0.0D;
		@Pc(69) double local69 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local69 < 0.5D) {
				local63 = (local46 - local32) / (local32 + local46);
			}
			if (local69 >= 0.5D) {
				local63 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local46 == local14) {
				local61 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local61 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local61 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		this.anInt5969 = (int) (local69 * 256.0D);
		this.anInt5963 = (int) (local63 * 256.0D);
		local61 /= 6.0D;
		if (local69 > 0.5D) {
			this.anInt5968 = (int) (local63 * 512.0D * (1.0D - local69));
		} else {
			this.anInt5968 = (int) (local69 * local63 * 512.0D);
		}
		if (this.anInt5963 < 0) {
			this.anInt5963 = 0;
		} else if (this.anInt5963 > 255) {
			this.anInt5963 = 255;
		}
		if (this.anInt5969 < 0) {
			this.anInt5969 = 0;
		} else if (this.anInt5969 > 255) {
			this.anInt5969 = 255;
		}
		if (this.anInt5968 < 1) {
			this.anInt5968 = 1;
		}
		this.anInt5964 = (int) (local61 * (double) this.anInt5968);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!hp;II)V")
	private void method4969(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5962 = arg0.method5399();
			this.method4967(this.anInt5962);
		} else if (arg1 == 2) {
			this.anInt5967 = arg0.method5362();
			if (this.anInt5967 == 65535) {
				this.anInt5967 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt5966 = arg0.method5362() << 0;
		} else if (arg1 == 4) {
			this.aBoolean416 = false;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLclient!hp;)V")
	public void method4971(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5366();
			if (local17 == 0) {
				return;
			}
			this.method4969(arg0, local17);
		}
	}
}

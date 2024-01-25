import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class14 {

	@OriginalMember(owner = "client!as", name = "c", descriptor = "F")
	public float aFloat5 = 1.0F;

	@OriginalMember(owner = "client!as", name = "d", descriptor = "F")
	public float aFloat6 = 1.0F;

	@OriginalMember(owner = "client!as", name = "h", descriptor = "F")
	public float aFloat7 = 0.25F;

	@OriginalMember(owner = "client!as", name = "l", descriptor = "F")
	public final float aFloat8;

	@OriginalMember(owner = "client!as", name = "j", descriptor = "I")
	public final int anInt571;

	@OriginalMember(owner = "client!as", name = "o", descriptor = "F")
	public final float aFloat9;

	@OriginalMember(owner = "client!as", name = "b", descriptor = "I")
	public final int anInt566;

	@OriginalMember(owner = "client!as", name = "g", descriptor = "I")
	public final int anInt569;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "F")
	public final float aFloat4;

	@OriginalMember(owner = "client!as", name = "i", descriptor = "I")
	public final int anInt570;

	@OriginalMember(owner = "client!as", name = "m", descriptor = "Lclient!vh;")
	public final Class7 aClass7_1;

	@OriginalMember(owner = "client!as", name = "p", descriptor = "I")
	public final int anInt574;

	@OriginalMember(owner = "client!as", name = "k", descriptor = "I")
	public final int anInt572;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V")
	public Class14() {
		this.aFloat8 = 0.69921875F;
		this.anInt571 = 0;
		this.aFloat9 = 1.1523438F;
		this.anInt566 = Static314.anInt5710;
		this.anInt569 = -50;
		this.aFloat4 = 1.2F;
		this.anInt570 = -50;
		this.aClass7_1 = Static399.aClass7_4;
		this.anInt574 = -60;
		this.anInt572 = Static46.anInt1156;
	}

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Class14(@OriginalArg(0) Class3_Sub2 arg0) {
		@Pc(16) int local16 = arg0.method6053();
		if (Static123.aClass21_Sub1_1.method780(Static347.anInt6318) && Static115.aClass75_3.method2584() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt572 = Static46.anInt1156;
			} else {
				this.anInt572 = arg0.method6014();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat9 = 1.1523438F;
			} else {
				this.aFloat9 = (float) arg0.method6004() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat8 = 0.69921875F;
			} else {
				this.aFloat8 = (float) arg0.method6004() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat4 = 1.2F;
			} else {
				this.aFloat4 = (float) arg0.method6004() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method6014();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method6004();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method6004();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method6004();
			}
			this.aFloat4 = 1.2F;
			this.aFloat8 = 0.69921875F;
			this.anInt572 = Static46.anInt1156;
			this.aFloat9 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt570 = -50;
			this.anInt569 = -50;
			this.anInt574 = -60;
		} else {
			this.anInt570 = arg0.method6039();
			this.anInt574 = arg0.method6039();
			this.anInt569 = arg0.method6039();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt566 = Static314.anInt5710;
		} else {
			this.anInt566 = arg0.method6014();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt571 = 0;
		} else {
			this.anInt571 = arg0.method6004();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass7_1 = Static399.aClass7_4;
		} else {
			@Pc(220) int local220 = arg0.method6004();
			@Pc(224) int local224 = arg0.method6004();
			@Pc(228) int local228 = arg0.method6004();
			@Pc(232) int local232 = arg0.method6004();
			@Pc(236) int local236 = arg0.method6004();
			@Pc(240) int local240 = arg0.method6004();
			this.aClass7_1 = Static430.method5689(local228, local220, local236, local232, local240, local224);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!as;Z)Z")
	public boolean method540(@OriginalArg(0) Class14 arg0) {
		return arg0.anInt572 == this.anInt572 && arg0.aFloat9 == this.aFloat9 && this.aFloat8 == arg0.aFloat8 && arg0.aFloat4 == this.aFloat4 && this.aFloat7 == arg0.aFloat7 && this.aFloat6 == arg0.aFloat6 && this.aFloat5 == arg0.aFloat5 && arg0.anInt566 == this.anInt566 && arg0.anInt571 == this.anInt571 && this.aClass7_1 == arg0.aClass7_1;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BLclient!bt;)V")
	public void method541(@OriginalArg(1) Class3_Sub2 arg0) {
		this.aFloat6 = (float) (arg0.method6053() * 8) / 255.0F;
		this.aFloat7 = (float) (arg0.method6053() * 8) / 255.0F;
		this.aFloat5 = (float) (arg0.method6053() * 8) / 255.0F;
	}
}

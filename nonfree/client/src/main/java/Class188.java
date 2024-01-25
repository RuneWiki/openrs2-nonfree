import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class188 {

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "F")
	public float aFloat111 = 0.25F;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "F")
	public float aFloat110 = 1.0F;

	@OriginalMember(owner = "client!sn", name = "t", descriptor = "F")
	public float aFloat112 = 1.0F;

	@OriginalMember(owner = "client!sn", name = "y", descriptor = "F")
	public final float aFloat114;

	@OriginalMember(owner = "client!sn", name = "v", descriptor = "I")
	public final int anInt5708;

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
	public final int anInt5699;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
	public final int anInt5696;

	@OriginalMember(owner = "client!sn", name = "u", descriptor = "F")
	public final float aFloat113;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "F")
	public final float aFloat109;

	@OriginalMember(owner = "client!sn", name = "r", descriptor = "Lclient!ma;")
	public final Class67 aClass67_4;

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
	public final int anInt5700;

	@OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
	public final int anInt5704;

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
	public final int anInt5703;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V")
	public Class188() {
		this.aFloat114 = 0.69921875F;
		this.anInt5708 = Static49.anInt1233;
		this.anInt5699 = -50;
		this.anInt5696 = Static259.anInt4951;
		this.aFloat113 = 1.2F;
		this.aFloat109 = 1.1523438F;
		this.aClass67_4 = Static2.aClass67_1;
		this.anInt5700 = -60;
		this.anInt5704 = -50;
		this.anInt5703 = 0;
	}

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!jg;)V")
	public Class188(@OriginalArg(0) Class14_Sub4 arg0) {
		@Pc(16) int local16 = arg0.method2548();
		if (Static9.aBoolean10 && Static262.aClass46_7.method5135() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt5696 = Static259.anInt4951;
			} else {
				this.anInt5696 = arg0.method2510();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat109 = 1.1523438F;
			} else {
				this.aFloat109 = (float) arg0.method2498() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat114 = 0.69921875F;
			} else {
				this.aFloat114 = (float) arg0.method2498() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat113 = 1.2F;
			} else {
				this.aFloat113 = (float) arg0.method2498() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method2510();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method2498();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method2498();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method2498();
			}
			this.aFloat109 = 1.1523438F;
			this.anInt5696 = Static259.anInt4951;
			this.aFloat114 = 0.69921875F;
			this.aFloat113 = 1.2F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt5699 = -50;
			this.anInt5700 = -60;
			this.anInt5704 = -50;
		} else {
			this.anInt5699 = arg0.method2502();
			this.anInt5700 = arg0.method2502();
			this.anInt5704 = arg0.method2502();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt5708 = Static49.anInt1233;
		} else {
			this.anInt5708 = arg0.method2510();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt5703 = 0;
		} else {
			this.anInt5703 = arg0.method2498();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass67_4 = Static2.aClass67_1;
		} else {
			this.aClass67_4 = Static50.method1220(arg0.method2498(), arg0.method2498(), arg0.method2498(), arg0.method2498(), arg0.method2498(), arg0.method2498());
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!sn;I)Z")
	public boolean method5071(@OriginalArg(0) Class188 arg0) {
		return this.anInt5696 == arg0.anInt5696 && this.aFloat109 == arg0.aFloat109 && arg0.aFloat114 == this.aFloat114 && this.aFloat113 == arg0.aFloat113 && this.aFloat111 == arg0.aFloat111 && arg0.aFloat110 == this.aFloat110 && this.aFloat112 == arg0.aFloat112 && this.anInt5708 == arg0.anInt5708 && arg0.anInt5703 == this.anInt5703 && this.aClass67_4 == arg0.aClass67_4;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!jg;B)V")
	public void method5076(@OriginalArg(0) Class14_Sub4 arg0) {
		this.aFloat110 = (float) (arg0.method2548() * 8) / 255.0F;
		this.aFloat111 = (float) (arg0.method2548() * 8) / 255.0F;
		this.aFloat112 = (float) (arg0.method2548() * 8) / 255.0F;
	}
}

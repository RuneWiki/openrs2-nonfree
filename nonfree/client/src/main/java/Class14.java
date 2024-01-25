import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class14 {

	@OriginalMember(owner = "client!ao", name = "p", descriptor = "F")
	public float aFloat6 = 0.25F;

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "F")
	public float aFloat4 = 1.0F;

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "F")
	public float aFloat5 = 1.0F;

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
	public final int anInt293;

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
	public final int anInt288;

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
	public final int anInt290;

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "F")
	public final float aFloat3;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "F")
	public final float aFloat2;

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
	public final int anInt291;

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
	public final int anInt294;

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "F")
	public final float aFloat1;

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
	public final int anInt286;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "Lclient!k;")
	public final Class17 aClass17_1;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
	public Class14() {
		this.anInt293 = 0;
		this.anInt288 = Static221.anInt4406;
		this.anInt290 = -60;
		this.aFloat3 = 1.1523438F;
		this.aFloat2 = 0.69921875F;
		this.anInt291 = Static48.anInt5547;
		this.anInt294 = -50;
		this.aFloat1 = 1.2F;
		this.anInt286 = -50;
		this.aClass17_1 = Static178.aClass17_4;
	}

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!ap;)V")
	public Class14(@OriginalArg(0) Class7_Sub3 arg0) {
		@Pc(14) int local14 = arg0.method2772();
		if (Static325.aBoolean452 && Static34.aClass89_1.method5419() > 0) {
			if ((local14 & 0x1) == 0) {
				this.anInt288 = Static221.anInt4406;
			} else {
				this.anInt288 = arg0.method2767();
			}
			if ((local14 & 0x2) == 0) {
				this.aFloat3 = 1.1523438F;
			} else {
				this.aFloat3 = (float) arg0.method2764() / 256.0F;
			}
			if ((local14 & 0x4) == 0) {
				this.aFloat2 = 0.69921875F;
			} else {
				this.aFloat2 = (float) arg0.method2764() / 256.0F;
			}
			if ((local14 & 0x8) == 0) {
				this.aFloat1 = 1.2F;
			} else {
				this.aFloat1 = (float) arg0.method2764() / 256.0F;
			}
		} else {
			if ((local14 & 0x1) != 0) {
				arg0.method2767();
			}
			if ((local14 & 0x2) != 0) {
				arg0.method2764();
			}
			if ((local14 & 0x4) != 0) {
				arg0.method2764();
			}
			if ((local14 & 0x8) != 0) {
				arg0.method2764();
			}
			this.aFloat1 = 1.2F;
			this.anInt288 = Static221.anInt4406;
			this.aFloat2 = 0.69921875F;
			this.aFloat3 = 1.1523438F;
		}
		if ((local14 & 0x10) == 0) {
			this.anInt286 = -50;
			this.anInt290 = -60;
			this.anInt294 = -50;
		} else {
			this.anInt286 = arg0.method2744();
			this.anInt290 = arg0.method2744();
			this.anInt294 = arg0.method2744();
		}
		if ((local14 & 0x20) == 0) {
			this.anInt291 = Static48.anInt5547;
		} else {
			this.anInt291 = arg0.method2767();
		}
		if ((local14 & 0x40) == 0) {
			this.anInt293 = 0;
		} else {
			this.anInt293 = arg0.method2764();
		}
		if ((local14 & 0x80) == 0) {
			this.aClass17_1 = Static178.aClass17_4;
		} else {
			this.aClass17_1 = Static300.method4858(arg0.method2764(), arg0.method2764(), arg0.method2764(), arg0.method2764(), arg0.method2764(), arg0.method2764());
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!ap;Z)V")
	public void method211(@OriginalArg(0) Class7_Sub3 arg0) {
		this.aFloat5 = (float) (arg0.method2772() * 8) / 255.0F;
		this.aFloat6 = (float) (arg0.method2772() * 8) / 255.0F;
		this.aFloat4 = (float) (arg0.method2772() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZLclient!ao;)Z")
	public boolean method212(@OriginalArg(1) Class14 arg0) {
		return arg0.anInt288 == this.anInt288 && this.aFloat3 == arg0.aFloat3 && this.aFloat2 == arg0.aFloat2 && this.aFloat1 == arg0.aFloat1 && this.aFloat6 == arg0.aFloat6 && this.aFloat5 == arg0.aFloat5 && arg0.aFloat4 == this.aFloat4 && this.anInt291 == arg0.anInt291 && this.anInt293 == arg0.anInt293 && arg0.aClass17_1 == this.aClass17_1;
	}
}

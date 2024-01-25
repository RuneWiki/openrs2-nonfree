import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class14 {

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "F")
	public float aFloat4 = 0.25F;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "F")
	public float aFloat6 = 1.0F;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "F")
	public float aFloat2 = 1.0F;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "F")
	public final float aFloat7;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "F")
	public final float aFloat5;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	public final int anInt316;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Lclient!qi;")
	public final Class19 aClass19_1;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	public final int anInt315;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
	public final int anInt320;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
	public final int anInt318;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
	public final int anInt317;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
	public final int anInt319;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "F")
	public final float aFloat3;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	public Class14() {
		this.aFloat7 = 1.2F;
		this.aFloat5 = 0.69921875F;
		this.anInt316 = -50;
		this.aClass19_1 = Static316.aClass19_3;
		this.anInt315 = Static158.anInt5619;
		this.anInt320 = Static57.anInt1095;
		this.anInt318 = 0;
		this.anInt317 = -60;
		this.anInt319 = -50;
		this.aFloat3 = 1.1523438F;
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!ec;)V")
	public Class14(@OriginalArg(0) Class6_Sub10 arg0) {
		@Pc(16) int local16 = arg0.method3972();
		if (Static194.aBoolean277 && Static16.aClass81_1.method3038() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt320 = Static57.anInt1095;
			} else {
				this.anInt320 = arg0.method3979();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat3 = 1.1523438F;
			} else {
				this.aFloat3 = (float) arg0.method4021() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat5 = 0.69921875F;
			} else {
				this.aFloat5 = (float) arg0.method4021() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat7 = 1.2F;
			} else {
				this.aFloat7 = (float) arg0.method4021() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method3979();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method4021();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method4021();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method4021();
			}
			this.aFloat7 = 1.2F;
			this.aFloat3 = 1.1523438F;
			this.aFloat5 = 0.69921875F;
			this.anInt320 = Static57.anInt1095;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt316 = -50;
			this.anInt319 = -50;
			this.anInt317 = -60;
		} else {
			this.anInt316 = arg0.method4022();
			this.anInt317 = arg0.method4022();
			this.anInt319 = arg0.method4022();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt315 = Static158.anInt5619;
		} else {
			this.anInt315 = arg0.method3979();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt318 = 0;
		} else {
			this.anInt318 = arg0.method4021();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass19_1 = Static316.aClass19_3;
		} else {
			this.aClass19_1 = Static324.method5382(arg0.method4021(), arg0.method4021(), arg0.method4021(), arg0.method4021(), arg0.method4021(), arg0.method4021());
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!bc;)Z")
	public boolean method293(@OriginalArg(1) Class14 arg0) {
		return this.anInt320 == arg0.anInt320 && arg0.aFloat3 == this.aFloat3 && this.aFloat5 == arg0.aFloat5 && this.aFloat7 == arg0.aFloat7 && this.aFloat4 == arg0.aFloat4 && this.aFloat2 == arg0.aFloat2 && this.aFloat6 == arg0.aFloat6 && arg0.anInt315 == this.anInt315 && arg0.anInt318 == this.anInt318 && arg0.aClass19_1 == this.aClass19_1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ec;I)V")
	public void method295(@OriginalArg(0) Class6_Sub10 arg0) {
		this.aFloat2 = (float) (arg0.method3972() * 8) / 255.0F;
		this.aFloat4 = (float) (arg0.method3972() * 8) / 255.0F;
		this.aFloat6 = (float) (arg0.method3972() * 8) / 255.0F;
	}
}

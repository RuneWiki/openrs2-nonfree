import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class217 {

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "F")
	public float aFloat120 = 1.0F;

	@OriginalMember(owner = "client!mq", name = "k", descriptor = "F")
	public float aFloat123 = 0.25F;

	@OriginalMember(owner = "client!mq", name = "o", descriptor = "F")
	public float aFloat124 = 1.0F;

	@OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
	public final int anInt5957;

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "F")
	public final float aFloat119;

	@OriginalMember(owner = "client!mq", name = "n", descriptor = "I")
	public final int anInt5958;

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "Lclient!js;")
	public final Class55 aClass55_2;

	@OriginalMember(owner = "client!mq", name = "g", descriptor = "I")
	public final int anInt5953;

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "F")
	public final float aFloat121;

	@OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
	public final int anInt5955;

	@OriginalMember(owner = "client!mq", name = "i", descriptor = "I")
	public final int anInt5954;

	@OriginalMember(owner = "client!mq", name = "l", descriptor = "I")
	public final int anInt5956;

	@OriginalMember(owner = "client!mq", name = "h", descriptor = "F")
	public final float aFloat122;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
	public Class217() {
		this.anInt5957 = 0;
		this.aFloat119 = 0.69921875F;
		this.anInt5958 = Static36.anInt850;
		this.aClass55_2 = Static312.aClass55_1;
		this.anInt5953 = -50;
		this.aFloat121 = 1.1523438F;
		this.anInt5955 = -60;
		this.anInt5954 = -50;
		this.anInt5956 = Static206.anInt4178;
		this.aFloat122 = 1.2F;
	}

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!qh;)V")
	public Class217(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(16) int local16 = arg0.method3118();
		if (Static278.aClass3_Sub13_Sub1_1.method4457(Static260.anInt4932) && Static131.aClass43_5.method7159() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt5956 = Static206.anInt4178;
			} else {
				this.anInt5956 = arg0.method3116();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat121 = 1.1523438F;
			} else {
				this.aFloat121 = (float) arg0.method3109() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat119 = 0.69921875F;
			} else {
				this.aFloat119 = (float) arg0.method3109() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat122 = 1.2F;
			} else {
				this.aFloat122 = (float) arg0.method3109() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method3116();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method3109();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method3109();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method3109();
			}
			this.aFloat122 = 1.2F;
			this.anInt5956 = Static206.anInt4178;
			this.aFloat121 = 1.1523438F;
			this.aFloat119 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt5953 = -50;
			this.anInt5955 = -60;
			this.anInt5954 = -50;
		} else {
			this.anInt5954 = arg0.method3107();
			this.anInt5955 = arg0.method3107();
			this.anInt5953 = arg0.method3107();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt5958 = Static36.anInt850;
		} else {
			this.anInt5958 = arg0.method3116();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt5957 = 0;
		} else {
			this.anInt5957 = arg0.method3109();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass55_2 = Static312.aClass55_1;
		} else {
			@Pc(229) int local229 = arg0.method3109();
			@Pc(233) int local233 = arg0.method3109();
			@Pc(237) int local237 = arg0.method3109();
			@Pc(241) int local241 = arg0.method3109();
			@Pc(245) int local245 = arg0.method3109();
			@Pc(249) int local249 = arg0.method3109();
			this.aClass55_2 = Static433.method6087(local233, local245, local249, local241, local229, local237);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!qh;)V")
	public void method5139(@OriginalArg(1) Class3_Sub11 arg0) {
		this.aFloat120 = (float) (arg0.method3118() * 8) / 255.0F;
		this.aFloat123 = (float) (arg0.method3118() * 8) / 255.0F;
		this.aFloat124 = (float) (arg0.method3118() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZLclient!mq;)Z")
	public boolean method5140(@OriginalArg(1) Class217 arg0) {
		return this.anInt5956 == arg0.anInt5956 && arg0.aFloat121 == this.aFloat121 && arg0.aFloat119 == this.aFloat119 && this.aFloat122 == arg0.aFloat122 && this.aFloat123 == arg0.aFloat123 && arg0.aFloat120 == this.aFloat120 && arg0.aFloat124 == this.aFloat124 && this.anInt5958 == arg0.anInt5958 && this.anInt5957 == arg0.anInt5957 && arg0.aClass55_2 == this.aClass55_2;
	}
}

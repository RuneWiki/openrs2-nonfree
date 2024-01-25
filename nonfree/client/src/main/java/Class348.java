import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public final class Class348 {

	@OriginalMember(owner = "client!vw", name = "g", descriptor = "F")
	public float aFloat199 = 0.25F;

	@OriginalMember(owner = "client!vw", name = "q", descriptor = "F")
	public float aFloat202 = 1.0F;

	@OriginalMember(owner = "client!vw", name = "n", descriptor = "F")
	public float aFloat201 = 1.0F;

	@OriginalMember(owner = "client!vw", name = "h", descriptor = "Lclient!ip;")
	public final Class26 aClass26_7;

	@OriginalMember(owner = "client!vw", name = "l", descriptor = "I")
	public final int anInt9428;

	@OriginalMember(owner = "client!vw", name = "p", descriptor = "I")
	public final int anInt9430;

	@OriginalMember(owner = "client!vw", name = "f", descriptor = "F")
	public final float aFloat198;

	@OriginalMember(owner = "client!vw", name = "m", descriptor = "F")
	public final float aFloat200;

	@OriginalMember(owner = "client!vw", name = "i", descriptor = "I")
	public final int anInt9425;

	@OriginalMember(owner = "client!vw", name = "d", descriptor = "I")
	public final int anInt9423;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "I")
	public final int anInt9421;

	@OriginalMember(owner = "client!vw", name = "k", descriptor = "I")
	public final int anInt9427;

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "F")
	public final float aFloat197;

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "()V")
	public Class348() {
		this.aClass26_7 = Static199.aClass26_5;
		this.anInt9428 = -60;
		this.anInt9430 = -50;
		this.aFloat198 = 1.1523438F;
		this.aFloat200 = 0.69921875F;
		this.anInt9425 = -50;
		this.anInt9423 = Static33.anInt908;
		this.anInt9421 = Static452.anInt7784;
		this.anInt9427 = 0;
		this.aFloat197 = 1.2F;
	}

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class348(@OriginalArg(0) Class6_Sub21 arg0) {
		@Pc(16) int local16 = arg0.method6069();
		if (Static140.aClass6_Sub48_Sub1_1.method7369(Static560.anInt9242) && Static25.aClass14_1.method6847() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt9423 = Static33.anInt908;
			} else {
				this.anInt9423 = arg0.method6036();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat198 = 1.1523438F;
			} else {
				this.aFloat198 = (float) arg0.method6003() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat200 = 0.69921875F;
			} else {
				this.aFloat200 = (float) arg0.method6003() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat197 = 1.2F;
			} else {
				this.aFloat197 = (float) arg0.method6003() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method6036();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method6003();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method6003();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method6003();
			}
			this.aFloat197 = 1.2F;
			this.aFloat198 = 1.1523438F;
			this.aFloat200 = 0.69921875F;
			this.anInt9423 = Static33.anInt908;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt9430 = -50;
			this.anInt9428 = -60;
			this.anInt9425 = -50;
		} else {
			this.anInt9425 = arg0.method6058();
			this.anInt9428 = arg0.method6058();
			this.anInt9430 = arg0.method6058();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt9421 = Static452.anInt7784;
		} else {
			this.anInt9421 = arg0.method6036();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt9427 = 0;
		} else {
			this.anInt9427 = arg0.method6003();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass26_7 = Static199.aClass26_5;
		} else {
			@Pc(226) int local226 = arg0.method6003();
			@Pc(230) int local230 = arg0.method6003();
			@Pc(234) int local234 = arg0.method6003();
			@Pc(238) int local238 = arg0.method6003();
			@Pc(242) int local242 = arg0.method6003();
			@Pc(246) int local246 = arg0.method6003();
			this.aClass26_7 = Static113.method1998(local238, local246, local226, local230, local242, local234);
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(ZLclient!vw;)Z")
	public boolean method7685(@OriginalArg(1) Class348 arg0) {
		return arg0.anInt9423 == this.anInt9423 && arg0.aFloat198 == this.aFloat198 && arg0.aFloat200 == this.aFloat200 && this.aFloat197 == arg0.aFloat197 && arg0.aFloat199 == this.aFloat199 && this.aFloat202 == arg0.aFloat202 && arg0.aFloat201 == this.aFloat201 && this.anInt9421 == arg0.anInt9421 && this.anInt9427 == arg0.anInt9427 && this.aClass26_7 == arg0.aClass26_7;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method7686(@OriginalArg(0) Class6_Sub21 arg0) {
		this.aFloat202 = (float) (arg0.method6069() * 8) / 255.0F;
		this.aFloat199 = (float) (arg0.method6069() * 8) / 255.0F;
		this.aFloat201 = (float) (arg0.method6069() * 8) / 255.0F;
	}
}

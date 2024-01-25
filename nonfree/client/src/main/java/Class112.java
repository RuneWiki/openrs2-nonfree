import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class112 {

	@OriginalMember(owner = "client!gba", name = "i", descriptor = "F")
	public float aFloat112 = 1.0F;

	@OriginalMember(owner = "client!gba", name = "p", descriptor = "F")
	public float aFloat115 = 1.0F;

	@OriginalMember(owner = "client!gba", name = "s", descriptor = "F")
	public float aFloat116 = 0.25F;

	@OriginalMember(owner = "client!gba", name = "j", descriptor = "I")
	public final int anInt3251;

	@OriginalMember(owner = "client!gba", name = "r", descriptor = "I")
	public final int anInt3254;

	@OriginalMember(owner = "client!gba", name = "o", descriptor = "F")
	public final float aFloat114;

	@OriginalMember(owner = "client!gba", name = "l", descriptor = "Lclient!caa;")
	public final Class36 aClass36_3;

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "I")
	public final int anInt3244;

	@OriginalMember(owner = "client!gba", name = "d", descriptor = "F")
	public final float aFloat111;

	@OriginalMember(owner = "client!gba", name = "e", descriptor = "I")
	public final int anInt3247;

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "I")
	public final int anInt3245;

	@OriginalMember(owner = "client!gba", name = "n", descriptor = "F")
	public final float aFloat113;

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "I")
	public final int anInt3246;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "()V")
	public Class112() {
		this.anInt3251 = Static583.anInt10139;
		this.anInt3254 = -50;
		this.aFloat114 = 0.69921875F;
		this.aClass36_3 = Static243.aClass36_6;
		this.anInt3244 = 0;
		this.aFloat111 = 1.1523438F;
		this.anInt3247 = Static400.anInt7647;
		this.anInt3245 = -50;
		this.aFloat113 = 1.2F;
		this.anInt3246 = -60;
	}

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!un;)V")
	public Class112(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(16) int local16 = arg0.method4905();
		if (Static214.aClass4_Sub19_Sub1_1.method2771(Static495.anInt9000) && Static458.aClass44_13.method4972() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt3247 = Static400.anInt7647;
			} else {
				this.anInt3247 = arg0.method4931();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat111 = 1.1523438F;
			} else {
				this.aFloat111 = (float) arg0.method4936() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat114 = 0.69921875F;
			} else {
				this.aFloat114 = (float) arg0.method4936() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat113 = 1.2F;
			} else {
				this.aFloat113 = (float) arg0.method4936() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method4931();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method4936();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method4936();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method4936();
			}
			this.anInt3247 = Static400.anInt7647;
			this.aFloat113 = 1.2F;
			this.aFloat114 = 0.69921875F;
			this.aFloat111 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt3246 = -60;
			this.anInt3245 = -50;
			this.anInt3254 = -50;
		} else {
			this.anInt3254 = arg0.method4946();
			this.anInt3246 = arg0.method4946();
			this.anInt3245 = arg0.method4946();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt3251 = Static583.anInt10139;
		} else {
			this.anInt3251 = arg0.method4931();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt3244 = 0;
		} else {
			this.anInt3244 = arg0.method4936();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass36_3 = Static243.aClass36_6;
		} else {
			@Pc(226) int local226 = arg0.method4936();
			@Pc(230) int local230 = arg0.method4936();
			@Pc(234) int local234 = arg0.method4936();
			@Pc(238) int local238 = arg0.method4936();
			@Pc(242) int local242 = arg0.method4936();
			@Pc(246) int local246 = arg0.method4936();
			this.aClass36_3 = Static236.method3797(local226, local234, local230, local246, local242, local238);
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!un;I)V")
	public void method2910(@OriginalArg(0) Class4_Sub11 arg0) {
		this.aFloat112 = (float) (arg0.method4905() * 8) / 255.0F;
		this.aFloat116 = (float) (arg0.method4905() * 8) / 255.0F;
		this.aFloat115 = (float) (arg0.method4905() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!gba;I)Z")
	public boolean method2913(@OriginalArg(0) Class112 arg0) {
		return this.anInt3247 == arg0.anInt3247 && this.aFloat111 == arg0.aFloat111 && this.aFloat114 == arg0.aFloat114 && this.aFloat113 == arg0.aFloat113 && arg0.aFloat116 == this.aFloat116 && this.aFloat112 == arg0.aFloat112 && arg0.aFloat115 == this.aFloat115 && this.anInt3251 == arg0.anInt3251 && arg0.anInt3244 == this.anInt3244 && arg0.aClass36_3 == this.aClass36_3;
	}
}

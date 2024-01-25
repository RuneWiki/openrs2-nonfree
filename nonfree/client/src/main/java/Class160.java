import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class160 {

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "F")
	public float aFloat63 = 0.25F;

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "F")
	public float aFloat65 = 1.0F;

	@OriginalMember(owner = "client!mn", name = "n", descriptor = "F")
	public float aFloat67 = 1.0F;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
	public final int anInt4571;

	@OriginalMember(owner = "client!mn", name = "l", descriptor = "F")
	public final float aFloat66;

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
	public final int anInt4573;

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
	public final int anInt4574;

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
	public final int anInt4578;

	@OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
	public final int anInt4577;

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "F")
	public final float aFloat62;

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
	public final int anInt4572;

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "Lclient!ud;")
	public final Class59 aClass59_24;

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "F")
	public final float aFloat64;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
	public Class160() {
		this.anInt4571 = 0;
		this.aFloat66 = 1.2F;
		this.anInt4573 = -50;
		this.anInt4574 = -50;
		this.anInt4578 = Static417.anInt6743;
		this.anInt4577 = Static334.anInt5474;
		this.aFloat62 = 0.69921875F;
		this.anInt4572 = -60;
		this.aClass59_24 = Static386.aClass59_46;
		this.aFloat64 = 1.1523438F;
	}

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!wm;)V")
	public Class160(@OriginalArg(0) Class1_Sub19 arg0) {
		@Pc(16) int local16 = arg0.method2915();
		if (Static126.aClass19_Sub1_1.method3339(Static214.anInt3968) && Static424.aClass117_11.method5710() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt4578 = Static417.anInt6743;
			} else {
				this.anInt4578 = arg0.method2877();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat64 = 1.1523438F;
			} else {
				this.aFloat64 = (float) arg0.method2896() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat62 = 0.69921875F;
			} else {
				this.aFloat62 = (float) arg0.method2896() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat66 = 1.2F;
			} else {
				this.aFloat66 = (float) arg0.method2896() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method2877();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method2896();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method2896();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method2896();
			}
			this.anInt4578 = Static417.anInt6743;
			this.aFloat64 = 1.1523438F;
			this.aFloat62 = 0.69921875F;
			this.aFloat66 = 1.2F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt4573 = -50;
			this.anInt4574 = -50;
			this.anInt4572 = -60;
		} else {
			this.anInt4574 = arg0.method2929();
			this.anInt4572 = arg0.method2929();
			this.anInt4573 = arg0.method2929();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt4577 = Static334.anInt5474;
		} else {
			this.anInt4577 = arg0.method2877();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt4571 = 0;
		} else {
			this.anInt4571 = arg0.method2896();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass59_24 = Static386.aClass59_46;
		} else {
			@Pc(222) int local222 = arg0.method2896();
			@Pc(226) int local226 = arg0.method2896();
			@Pc(230) int local230 = arg0.method2896();
			@Pc(234) int local234 = arg0.method2896();
			@Pc(238) int local238 = arg0.method2896();
			@Pc(242) int local242 = arg0.method2896();
			this.aClass59_24 = Static320.method4215(local226, local242, local234, local222, local238, local230);
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!wm;I)V")
	public void method3638(@OriginalArg(0) Class1_Sub19 arg0) {
		this.aFloat65 = (float) (arg0.method2915() * 8) / 255.0F;
		this.aFloat63 = (float) (arg0.method2915() * 8) / 255.0F;
		this.aFloat67 = (float) (arg0.method2915() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILclient!mn;)Z")
	public boolean method3639(@OriginalArg(1) Class160 arg0) {
		return arg0.anInt4578 == this.anInt4578 && arg0.aFloat64 == this.aFloat64 && this.aFloat62 == arg0.aFloat62 && arg0.aFloat66 == this.aFloat66 && arg0.aFloat63 == this.aFloat63 && arg0.aFloat65 == this.aFloat65 && this.aFloat67 == arg0.aFloat67 && this.anInt4577 == arg0.anInt4577 && arg0.anInt4571 == this.anInt4571 && this.aClass59_24 == arg0.aClass59_24;
	}
}

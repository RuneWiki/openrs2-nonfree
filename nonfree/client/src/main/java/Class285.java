import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class285 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "F")
	public float aFloat147 = 1.0F;

	@OriginalMember(owner = "client!r", name = "b", descriptor = "F")
	public float aFloat148 = 1.0F;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "F")
	public float aFloat152 = 0.25F;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "I")
	public final int anInt7591;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "I")
	public final int anInt7590;

	@OriginalMember(owner = "client!r", name = "r", descriptor = "I")
	public final int anInt7600;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "I")
	public final int anInt7598;

	@OriginalMember(owner = "client!r", name = "j", descriptor = "I")
	public final int anInt7595;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "F")
	public final float aFloat150;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "F")
	public final float aFloat151;

	@OriginalMember(owner = "client!r", name = "m", descriptor = "Lclient!dn;")
	public final Class75 aClass75_4;

	@OriginalMember(owner = "client!r", name = "h", descriptor = "F")
	public final float aFloat149;

	@OriginalMember(owner = "client!r", name = "k", descriptor = "I")
	public final int anInt7596;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	public Class285() {
		this.anInt7591 = Static121.anInt7239;
		this.anInt7590 = 0;
		this.anInt7600 = Static436.anInt7484;
		this.anInt7598 = -50;
		this.anInt7595 = -50;
		this.aFloat150 = 0.69921875F;
		this.aFloat151 = 1.2F;
		this.aClass75_4 = Static289.aClass75_2;
		this.aFloat149 = 1.1523438F;
		this.anInt7596 = -60;
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!eh;)V")
	public Class285(@OriginalArg(0) Class4_Sub9 arg0) {
		@Pc(16) int local16 = arg0.method6015();
		if (Static189.aClass4_Sub2_Sub1_1.method7644(Static403.anInt6994) && Static249.aClass66_9.method6832() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt7591 = Static121.anInt7239;
			} else {
				this.anInt7591 = arg0.method6026();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat149 = 1.1523438F;
			} else {
				this.aFloat149 = (float) arg0.method5982() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat150 = 0.69921875F;
			} else {
				this.aFloat150 = (float) arg0.method5982() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat151 = 1.2F;
			} else {
				this.aFloat151 = (float) arg0.method5982() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method6026();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method5982();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method5982();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method5982();
			}
			this.anInt7591 = Static121.anInt7239;
			this.aFloat151 = 1.2F;
			this.aFloat149 = 1.1523438F;
			this.aFloat150 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt7596 = -60;
			this.anInt7598 = -50;
			this.anInt7595 = -50;
		} else {
			this.anInt7595 = arg0.method6003();
			this.anInt7596 = arg0.method6003();
			this.anInt7598 = arg0.method6003();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt7600 = Static436.anInt7484;
		} else {
			this.anInt7600 = arg0.method6026();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt7590 = 0;
		} else {
			this.anInt7590 = arg0.method5982();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass75_4 = Static289.aClass75_2;
		} else {
			@Pc(222) int local222 = arg0.method5982();
			@Pc(226) int local226 = arg0.method5982();
			@Pc(230) int local230 = arg0.method5982();
			@Pc(234) int local234 = arg0.method5982();
			@Pc(238) int local238 = arg0.method5982();
			@Pc(242) int local242 = arg0.method5982();
			this.aClass75_4 = Static125.method2680(local242, local238, local226, local234, local230, local222);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!eh;)V")
	public void method6285(@OriginalArg(1) Class4_Sub9 arg0) {
		this.aFloat147 = (float) (arg0.method6015() * 8) / 255.0F;
		this.aFloat152 = (float) (arg0.method6015() * 8) / 255.0F;
		this.aFloat148 = (float) (arg0.method6015() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!r;)Z")
	public boolean method6286(@OriginalArg(1) Class285 arg0) {
		return this.anInt7591 == arg0.anInt7591 && this.aFloat149 == arg0.aFloat149 && this.aFloat150 == arg0.aFloat150 && arg0.aFloat151 == this.aFloat151 && this.aFloat152 == arg0.aFloat152 && arg0.aFloat147 == this.aFloat147 && this.aFloat148 == arg0.aFloat148 && arg0.anInt7600 == this.anInt7600 && arg0.anInt7590 == this.anInt7590 && this.aClass75_4 == arg0.aClass75_4;
	}
}

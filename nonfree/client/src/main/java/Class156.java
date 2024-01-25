import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class156 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "F")
	public float aFloat119 = 1.0F;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "F")
	public float aFloat120 = 0.25F;

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "F")
	public float aFloat122 = 1.0F;

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
	public final int anInt4250;

	@OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
	public final int anInt4253;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "F")
	public final float aFloat123;

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "F")
	public final float aFloat124;

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
	public final int anInt4254;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
	public final int anInt4244;

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
	public final int anInt4251;

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "Lclient!qs;")
	public final Class96 aClass96_3;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "F")
	public final float aFloat121;

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
	public final int anInt4246;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	public Class156() {
		this.anInt4250 = 0;
		this.anInt4253 = Static60.anInt1104;
		this.aFloat123 = 1.2F;
		this.aFloat124 = 1.1523438F;
		this.anInt4254 = Static362.anInt5746;
		this.anInt4244 = -50;
		this.anInt4251 = -50;
		this.aClass96_3 = Static388.aClass96_4;
		this.aFloat121 = 0.69921875F;
		this.anInt4246 = -60;
	}

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class156(@OriginalArg(0) Class7_Sub14 arg0) {
		@Pc(16) int local16 = arg0.method3981();
		if (Static130.aClass153_Sub1_1.method4218(Static377.anInt6113) && Static253.aClass51_7.method5290() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt4254 = Static362.anInt5746;
			} else {
				this.anInt4254 = arg0.method3938();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat124 = 1.1523438F;
			} else {
				this.aFloat124 = (float) arg0.method3943() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat121 = 0.69921875F;
			} else {
				this.aFloat121 = (float) arg0.method3943() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat123 = 1.2F;
			} else {
				this.aFloat123 = (float) arg0.method3943() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method3938();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method3943();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method3943();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method3943();
			}
			this.aFloat123 = 1.2F;
			this.aFloat121 = 0.69921875F;
			this.anInt4254 = Static362.anInt5746;
			this.aFloat124 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt4246 = -60;
			this.anInt4251 = -50;
			this.anInt4244 = -50;
		} else {
			this.anInt4251 = arg0.method3961();
			this.anInt4246 = arg0.method3961();
			this.anInt4244 = arg0.method3961();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt4253 = Static60.anInt1104;
		} else {
			this.anInt4253 = arg0.method3938();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt4250 = 0;
		} else {
			this.anInt4250 = arg0.method3943();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass96_3 = Static388.aClass96_4;
		} else {
			@Pc(225) int local225 = arg0.method3943();
			@Pc(229) int local229 = arg0.method3943();
			@Pc(233) int local233 = arg0.method3943();
			@Pc(237) int local237 = arg0.method3943();
			@Pc(241) int local241 = arg0.method3943();
			@Pc(245) int local245 = arg0.method3943();
			this.aClass96_3 = Static95.method1667(local233, local225, local229, local241, local237, local245);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!mh;I)Z")
	public boolean method3349(@OriginalArg(0) Class156 arg0) {
		return arg0.anInt4254 == this.anInt4254 && this.aFloat124 == arg0.aFloat124 && this.aFloat121 == arg0.aFloat121 && this.aFloat123 == arg0.aFloat123 && this.aFloat120 == arg0.aFloat120 && this.aFloat119 == arg0.aFloat119 && this.aFloat122 == arg0.aFloat122 && arg0.anInt4253 == this.anInt4253 && arg0.anInt4250 == this.anInt4250 && this.aClass96_3 == arg0.aClass96_3;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLclient!gk;)V")
	public void method3351(@OriginalArg(1) Class7_Sub14 arg0) {
		this.aFloat119 = (float) (arg0.method3981() * 8) / 255.0F;
		this.aFloat120 = (float) (arg0.method3981() * 8) / 255.0F;
		this.aFloat122 = (float) (arg0.method3981() * 8) / 255.0F;
	}
}

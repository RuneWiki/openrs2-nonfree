import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class92 {

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "F")
	public float aFloat90 = 0.25F;

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "F")
	public float aFloat88 = 1.0F;

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "F")
	public float aFloat89 = 1.0F;

	@OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
	public final int anInt2893;

	@OriginalMember(owner = "client!fm", name = "q", descriptor = "F")
	public final float aFloat91;

	@OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
	public final int anInt2894;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "F")
	public final float aFloat87;

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
	public final int anInt2884;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "F")
	public final float aFloat86;

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "Lclient!dw;")
	public final Class66 aClass66_1;

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
	public final int anInt2885;

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
	public final int anInt2890;

	@OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
	public final int anInt2889;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
	public Class92() {
		this.anInt2893 = -50;
		this.aFloat91 = 0.69921875F;
		this.anInt2894 = -50;
		this.aFloat87 = 1.1523438F;
		this.anInt2884 = Static66.anInt1452;
		this.aFloat86 = 1.2F;
		this.aClass66_1 = Static214.aClass66_2;
		this.anInt2885 = Static505.anInt8839;
		this.anInt2890 = -60;
		this.anInt2889 = 0;
	}

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!rt;)V")
	public Class92(@OriginalArg(0) Class3_Sub27 arg0) {
		@Pc(16) int local16 = arg0.method7548();
		if (Static7.aClass3_Sub15_Sub1_1.method6943(Static382.anInt7091) && Static236.aClass5_4.method7479() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt2885 = Static505.anInt8839;
			} else {
				this.anInt2885 = arg0.method7549();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat87 = 1.1523438F;
			} else {
				this.aFloat87 = (float) arg0.method7591() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat91 = 0.69921875F;
			} else {
				this.aFloat91 = (float) arg0.method7591() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat86 = 1.2F;
			} else {
				this.aFloat86 = (float) arg0.method7591() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method7549();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method7591();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method7591();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method7591();
			}
			this.aFloat86 = 1.2F;
			this.aFloat87 = 1.1523438F;
			this.anInt2885 = Static505.anInt8839;
			this.aFloat91 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt2893 = -50;
			this.anInt2890 = -60;
			this.anInt2894 = -50;
		} else {
			this.anInt2893 = arg0.method7604();
			this.anInt2890 = arg0.method7604();
			this.anInt2894 = arg0.method7604();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt2884 = Static66.anInt1452;
		} else {
			this.anInt2884 = arg0.method7549();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt2889 = 0;
		} else {
			this.anInt2889 = arg0.method7591();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass66_1 = Static214.aClass66_2;
		} else {
			@Pc(216) int local216 = arg0.method7591();
			@Pc(220) int local220 = arg0.method7591();
			@Pc(224) int local224 = arg0.method7591();
			@Pc(228) int local228 = arg0.method7591();
			@Pc(232) int local232 = arg0.method7591();
			@Pc(236) int local236 = arg0.method7591();
			this.aClass66_1 = Static407.method6165(local224, local232, local236, local228, local216, local220);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!fm;I)Z")
	public boolean method2459(@OriginalArg(0) Class92 arg0) {
		return arg0.anInt2885 == this.anInt2885 && arg0.aFloat87 == this.aFloat87 && this.aFloat91 == arg0.aFloat91 && this.aFloat86 == arg0.aFloat86 && arg0.aFloat90 == this.aFloat90 && arg0.aFloat88 == this.aFloat88 && this.aFloat89 == arg0.aFloat89 && this.anInt2884 == arg0.anInt2884 && this.anInt2889 == arg0.anInt2889 && this.aClass66_1 == arg0.aClass66_1;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!rt;Z)V")
	public void method2463(@OriginalArg(0) Class3_Sub27 arg0) {
		this.aFloat88 = (float) (arg0.method7548() * 8) / 255.0F;
		this.aFloat90 = (float) (arg0.method7548() * 8) / 255.0F;
		this.aFloat89 = (float) (arg0.method7548() * 8) / 255.0F;
	}
}

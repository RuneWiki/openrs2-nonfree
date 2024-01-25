import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class283 {

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "F")
	public float aFloat156 = 0.25F;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "F")
	public float aFloat154 = 1.0F;

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "F")
	public float aFloat159 = 1.0F;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "F")
	public final float aFloat155;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
	public final int anInt8163;

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
	public final int anInt8166;

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "F")
	public final float aFloat158;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
	public final int anInt8168;

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
	public final int anInt8167;

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
	public final int anInt8171;

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "Lclient!ok;")
	public final Class25 aClass25_3;

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
	public final int anInt8172;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "F")
	public final float aFloat157;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	public Class283() {
		this.aFloat155 = 0.69921875F;
		this.anInt8163 = Static601.anInt9807;
		this.anInt8166 = 0;
		this.aFloat158 = 1.1523438F;
		this.anInt8168 = -60;
		this.anInt8167 = -50;
		this.anInt8171 = Static268.anInt4671;
		this.aClass25_3 = Static459.aClass25_2;
		this.anInt8172 = -50;
		this.aFloat157 = 1.2F;
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!gga;)V")
	public Class283(@OriginalArg(0) Class6_Sub23 arg0) {
		@Pc(16) int local16 = arg0.method8374();
		if (Static96.aClass6_Sub22_7.aClass29_Sub21_1.method6967() == 1 && Static83.aClass132_3.method7511() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt8163 = Static601.anInt9807;
			} else {
				this.anInt8163 = arg0.method8369();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat158 = 1.1523438F;
			} else {
				this.aFloat158 = (float) arg0.method8363() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat155 = 0.69921875F;
			} else {
				this.aFloat155 = (float) arg0.method8363() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat157 = 1.2F;
			} else {
				this.aFloat157 = (float) arg0.method8363() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method8369();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method8363();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method8363();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method8363();
			}
			this.aFloat157 = 1.2F;
			this.aFloat155 = 0.69921875F;
			this.anInt8163 = Static601.anInt9807;
			this.aFloat158 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt8168 = -60;
			this.anInt8172 = -50;
			this.anInt8167 = -50;
		} else {
			this.anInt8167 = arg0.method8395();
			this.anInt8168 = arg0.method8395();
			this.anInt8172 = arg0.method8395();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt8171 = Static268.anInt4671;
		} else {
			this.anInt8171 = arg0.method8369();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt8166 = 0;
		} else {
			this.anInt8166 = arg0.method8363();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass25_3 = Static459.aClass25_2;
		} else {
			@Pc(217) int local217 = arg0.method8363();
			@Pc(221) int local221 = arg0.method8363();
			@Pc(225) int local225 = arg0.method8363();
			@Pc(229) int local229 = arg0.method8363();
			@Pc(233) int local233 = arg0.method8363();
			@Pc(237) int local237 = arg0.method8363();
			this.aClass25_3 = Static11.method411(local229, local221, local233, local237, local225, local217);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!gga;)V")
	public void method6970(@OriginalArg(1) Class6_Sub23 arg0) {
		this.aFloat154 = (float) (arg0.method8374() * 8) / 255.0F;
		this.aFloat156 = (float) (arg0.method8374() * 8) / 255.0F;
		this.aFloat159 = (float) (arg0.method8374() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!qf;)Z")
	public boolean method6971(@OriginalArg(1) Class283 arg0) {
		return this.anInt8163 == arg0.anInt8163 && arg0.aFloat158 == this.aFloat158 && this.aFloat155 == arg0.aFloat155 && arg0.aFloat157 == this.aFloat157 && arg0.aFloat156 == this.aFloat156 && this.aFloat154 == arg0.aFloat154 && arg0.aFloat159 == this.aFloat159 && arg0.anInt8171 == this.anInt8171 && this.anInt8166 == arg0.anInt8166 && arg0.aClass25_3 == this.aClass25_3;
	}
}

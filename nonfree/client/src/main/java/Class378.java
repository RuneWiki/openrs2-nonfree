import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class378 {

	@OriginalMember(owner = "client!vm", name = "s", descriptor = "F")
	public float aFloat194 = 1.0F;

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "F")
	public float aFloat190 = 1.0F;

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "F")
	public float aFloat191 = 0.25F;

	@OriginalMember(owner = "client!vm", name = "p", descriptor = "F")
	public final float aFloat192;

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
	public final int anInt10124;

	@OriginalMember(owner = "client!vm", name = "r", descriptor = "F")
	public final float aFloat193;

	@OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
	public final int anInt10127;

	@OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
	public final int anInt10130;

	@OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
	public final int anInt10128;

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "Lclient!ag;")
	public final Class11 aClass11_4;

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
	public final int anInt10125;

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "F")
	public final float aFloat189;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
	public final int anInt10121;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	public Class378() {
		this.aFloat192 = 1.2F;
		this.anInt10124 = -50;
		this.aFloat193 = 0.69921875F;
		this.anInt10127 = Static424.anInt7534;
		this.anInt10130 = 0;
		this.anInt10128 = -60;
		this.aClass11_4 = Static403.aClass11_3;
		this.anInt10125 = Static326.anInt5966;
		this.aFloat189 = 1.1523438F;
		this.anInt10121 = -50;
	}

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!rv;)V")
	public Class378(@OriginalArg(0) Class5_Sub15 arg0) {
		@Pc(16) int local16 = arg0.method3642();
		if (Static655.aClass5_Sub36_29.aClass2_Sub16_1.method6973() == 1 && Static96.aClass143_3.method6237() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt10125 = Static326.anInt5966;
			} else {
				this.anInt10125 = arg0.method3671();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat189 = 1.1523438F;
			} else {
				this.aFloat189 = (float) arg0.method3698() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat193 = 0.69921875F;
			} else {
				this.aFloat193 = (float) arg0.method3698() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat192 = 1.2F;
			} else {
				this.aFloat192 = (float) arg0.method3698() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method3671();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method3698();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method3698();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method3698();
			}
			this.anInt10125 = Static326.anInt5966;
			this.aFloat192 = 1.2F;
			this.aFloat193 = 0.69921875F;
			this.aFloat189 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt10128 = -60;
			this.anInt10124 = -50;
			this.anInt10121 = -50;
		} else {
			this.anInt10121 = arg0.method3638();
			this.anInt10128 = arg0.method3638();
			this.anInt10124 = arg0.method3638();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt10127 = Static424.anInt7534;
		} else {
			this.anInt10127 = arg0.method3671();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt10130 = 0;
		} else {
			this.anInt10130 = arg0.method3698();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass11_4 = Static403.aClass11_3;
		} else {
			@Pc(220) int local220 = arg0.method3698();
			@Pc(224) int local224 = arg0.method3698();
			@Pc(228) int local228 = arg0.method3698();
			@Pc(232) int local232 = arg0.method3698();
			@Pc(236) int local236 = arg0.method3698();
			@Pc(240) int local240 = arg0.method3698();
			this.aClass11_4 = Static115.method1841(local240, local236, local224, local232, local220, local228);
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!rv;B)V")
	public void method8434(@OriginalArg(0) Class5_Sub15 arg0) {
		this.aFloat194 = (float) (arg0.method3642() * 8) / 255.0F;
		this.aFloat191 = (float) (arg0.method3642() * 8) / 255.0F;
		this.aFloat190 = (float) (arg0.method3642() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!vm;B)Z")
	public boolean method8435(@OriginalArg(0) Class378 arg0) {
		return this.anInt10125 == arg0.anInt10125 && this.aFloat189 == arg0.aFloat189 && this.aFloat193 == arg0.aFloat193 && this.aFloat192 == arg0.aFloat192 && arg0.aFloat191 == this.aFloat191 && arg0.aFloat194 == this.aFloat194 && this.aFloat190 == arg0.aFloat190 && this.anInt10127 == arg0.anInt10127 && this.anInt10130 == arg0.anInt10130 && arg0.aClass11_4 == this.aClass11_4;
	}
}

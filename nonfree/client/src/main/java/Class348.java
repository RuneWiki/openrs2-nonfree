import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class348 {

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "F")
	public float aFloat198 = 1.0F;

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "F")
	public float aFloat200 = 1.0F;

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "F")
	public float aFloat203 = 0.25F;

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "F")
	public final float aFloat201;

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "F")
	public final float aFloat199;

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
	public final int anInt9719;

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
	public final int anInt9715;

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "F")
	public final float aFloat202;

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
	public final int anInt9717;

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
	public final int anInt9716;

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
	public final int anInt9712;

	@OriginalMember(owner = "client!wm", name = "r", descriptor = "Lclient!dga;")
	public final Class65 aClass65_139;

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
	public final int anInt9713;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
	public Class348() {
		this.aFloat201 = 1.1523438F;
		this.aFloat199 = 1.2F;
		this.anInt9719 = -60;
		this.anInt9715 = Static51.anInt1395;
		this.aFloat202 = 0.69921875F;
		this.anInt9717 = 0;
		this.anInt9716 = -50;
		this.anInt9712 = Static307.anInt1465;
		this.aClass65_139 = Static408.aClass65_95;
		this.anInt9713 = -50;
	}

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!iaa;)V")
	public Class348(@OriginalArg(0) Class6_Sub26 arg0) {
		@Pc(16) int local16 = arg0.method4966();
		if (Static104.aClass6_Sub6_Sub1_4.method1064(Static5.anInt145) && Static101.aClass9_4.method5427() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt9712 = Static307.anInt1465;
			} else {
				this.anInt9712 = arg0.method5000();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat201 = 1.1523438F;
			} else {
				this.aFloat201 = (float) arg0.method4999() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat202 = 0.69921875F;
			} else {
				this.aFloat202 = (float) arg0.method4999() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat199 = 1.2F;
			} else {
				this.aFloat199 = (float) arg0.method4999() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method5000();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method4999();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method4999();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method4999();
			}
			this.aFloat202 = 0.69921875F;
			this.aFloat201 = 1.1523438F;
			this.anInt9712 = Static307.anInt1465;
			this.aFloat199 = 1.2F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt9716 = -50;
			this.anInt9719 = -60;
			this.anInt9713 = -50;
		} else {
			this.anInt9713 = arg0.method4974();
			this.anInt9719 = arg0.method4974();
			this.anInt9716 = arg0.method4974();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt9715 = Static51.anInt1395;
		} else {
			this.anInt9715 = arg0.method5000();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt9717 = 0;
		} else {
			this.anInt9717 = arg0.method4999();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass65_139 = Static408.aClass65_95;
		} else {
			@Pc(216) int local216 = arg0.method4999();
			@Pc(220) int local220 = arg0.method4999();
			@Pc(224) int local224 = arg0.method4999();
			@Pc(228) int local228 = arg0.method4999();
			@Pc(232) int local232 = arg0.method4999();
			@Pc(236) int local236 = arg0.method4999();
			this.aClass65_139 = Static173.method3493(local224, local228, local232, local216, local236, local220);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!iaa;I)V")
	public void method8091(@OriginalArg(0) Class6_Sub26 arg0) {
		this.aFloat200 = (float) (arg0.method4966() * 8) / 255.0F;
		this.aFloat203 = (float) (arg0.method4966() * 8) / 255.0F;
		this.aFloat198 = (float) (arg0.method4966() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!wm;I)Z")
	public boolean method8092(@OriginalArg(0) Class348 arg0) {
		return arg0.anInt9712 == this.anInt9712 && arg0.aFloat201 == this.aFloat201 && this.aFloat202 == arg0.aFloat202 && this.aFloat199 == arg0.aFloat199 && arg0.aFloat203 == this.aFloat203 && arg0.aFloat200 == this.aFloat200 && this.aFloat198 == arg0.aFloat198 && this.anInt9715 == arg0.anInt9715 && this.anInt9717 == arg0.anInt9717 && arg0.aClass65_139 == this.aClass65_139;
	}
}

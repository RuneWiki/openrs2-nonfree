import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class165 {

	@OriginalMember(owner = "client!po", name = "i", descriptor = "F")
	public float aFloat68 = 0.25F;

	@OriginalMember(owner = "client!po", name = "c", descriptor = "F")
	public float aFloat66 = 1.0F;

	@OriginalMember(owner = "client!po", name = "p", descriptor = "F")
	public float aFloat71 = 1.0F;

	@OriginalMember(owner = "client!po", name = "b", descriptor = "I")
	public final int anInt4976;

	@OriginalMember(owner = "client!po", name = "j", descriptor = "I")
	public final int anInt4981;

	@OriginalMember(owner = "client!po", name = "h", descriptor = "I")
	public final int anInt4980;

	@OriginalMember(owner = "client!po", name = "e", descriptor = "I")
	public final int anInt4978;

	@OriginalMember(owner = "client!po", name = "m", descriptor = "Lclient!ts;")
	public final Class114 aClass114_3;

	@OriginalMember(owner = "client!po", name = "l", descriptor = "F")
	public final float aFloat70;

	@OriginalMember(owner = "client!po", name = "o", descriptor = "I")
	public final int anInt4983;

	@OriginalMember(owner = "client!po", name = "k", descriptor = "F")
	public final float aFloat69;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "I")
	public final int anInt4975;

	@OriginalMember(owner = "client!po", name = "g", descriptor = "F")
	public final float aFloat67;

	static {
		new Class92(64);
	}

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V")
	public Class165() {
		this.anInt4976 = -50;
		this.anInt4981 = Static47.anInt1511;
		this.anInt4980 = Static148.anInt3242;
		this.anInt4978 = -50;
		this.aClass114_3 = Static176.aClass114_2;
		this.aFloat70 = 1.2F;
		this.anInt4983 = -60;
		this.aFloat69 = 1.1523438F;
		this.anInt4975 = 0;
		this.aFloat67 = 0.69921875F;
	}

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!bg;)V")
	public Class165(@OriginalArg(0) Class1_Sub8 arg0) {
		@Pc(16) int local16 = arg0.method4532();
		if (Static129.aBoolean269 && Static324.aClass32_14.method2240() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt4980 = Static148.anInt3242;
			} else {
				this.anInt4980 = arg0.method4545();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat69 = 1.1523438F;
			} else {
				this.aFloat69 = (float) arg0.method4556() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat67 = 0.69921875F;
			} else {
				this.aFloat67 = (float) arg0.method4556() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat70 = 1.2F;
			} else {
				this.aFloat70 = (float) arg0.method4556() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method4545();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method4556();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method4556();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method4556();
			}
			this.aFloat70 = 1.2F;
			this.aFloat67 = 0.69921875F;
			this.anInt4980 = Static148.anInt3242;
			this.aFloat69 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt4978 = -50;
			this.anInt4976 = -50;
			this.anInt4983 = -60;
		} else {
			this.anInt4978 = arg0.method4551();
			this.anInt4983 = arg0.method4551();
			this.anInt4976 = arg0.method4551();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt4981 = Static47.anInt1511;
		} else {
			this.anInt4981 = arg0.method4545();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt4975 = 0;
		} else {
			this.anInt4975 = arg0.method4556();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass114_3 = Static176.aClass114_2;
		} else {
			this.aClass114_3 = Static167.method3361(arg0.method4556(), arg0.method4556(), arg0.method4556(), arg0.method4556(), arg0.method4556(), arg0.method4556());
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILclient!bg;)V")
	public void method4378(@OriginalArg(1) Class1_Sub8 arg0) {
		this.aFloat66 = (float) (arg0.method4532() * 8) / 255.0F;
		this.aFloat68 = (float) (arg0.method4532() * 8) / 255.0F;
		this.aFloat71 = (float) (arg0.method4532() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BLclient!po;)Z")
	public boolean method4379(@OriginalArg(1) Class165 arg0) {
		return this.anInt4980 == arg0.anInt4980 && arg0.aFloat69 == this.aFloat69 && arg0.aFloat67 == this.aFloat67 && this.aFloat70 == arg0.aFloat70 && this.aFloat68 == arg0.aFloat68 && arg0.aFloat66 == this.aFloat66 && arg0.aFloat71 == this.aFloat71 && arg0.anInt4981 == this.anInt4981 && arg0.anInt4975 == this.anInt4975 && this.aClass114_3 == arg0.aClass114_3;
	}
}

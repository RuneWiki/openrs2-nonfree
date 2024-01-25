import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class100 {

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "F")
	public float aFloat31 = 1.0F;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "F")
	public float aFloat30 = 0.25F;

	@OriginalMember(owner = "client!ja", name = "t", descriptor = "F")
	public float aFloat34 = 1.0F;

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "F")
	public final float aFloat32;

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
	public final int anInt3109;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "F")
	public final float aFloat33;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "Lclient!mc;")
	public final Class49 aClass49_2;

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
	public final int anInt3101;

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
	public final int anInt3104;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "F")
	public final float aFloat29;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
	public final int anInt3106;

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
	public final int anInt3100;

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
	public final int anInt3103;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
	public Class100() {
		this.aFloat32 = 1.1523438F;
		this.anInt3109 = -50;
		this.aFloat33 = 1.2F;
		this.aClass49_2 = Static204.aClass49_4;
		this.anInt3101 = Static325.anInt6400;
		this.anInt3104 = -60;
		this.aFloat29 = 0.69921875F;
		this.anInt3106 = Static59.anInt1272;
		this.anInt3100 = -50;
		this.anInt3103 = 0;
	}

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!tq;)V")
	public Class100(@OriginalArg(0) Class4_Sub7 arg0) {
		@Pc(16) int local16 = arg0.method2380();
		if (Static58.aBoolean95 && Static158.aClass92_6.method4499() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt3106 = Static59.anInt1272;
			} else {
				this.anInt3106 = arg0.method2389();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat32 = 1.1523438F;
			} else {
				this.aFloat32 = (float) arg0.method2404() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat29 = 0.69921875F;
			} else {
				this.aFloat29 = (float) arg0.method2404() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat33 = 1.2F;
			} else {
				this.aFloat33 = (float) arg0.method2404() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method2389();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method2404();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method2404();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method2404();
			}
			this.aFloat32 = 1.1523438F;
			this.aFloat33 = 1.2F;
			this.anInt3106 = Static59.anInt1272;
			this.aFloat29 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt3104 = -60;
			this.anInt3109 = -50;
			this.anInt3100 = -50;
		} else {
			this.anInt3100 = arg0.method2396();
			this.anInt3104 = arg0.method2396();
			this.anInt3109 = arg0.method2396();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt3101 = Static325.anInt6400;
		} else {
			this.anInt3101 = arg0.method2389();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt3103 = 0;
		} else {
			this.anInt3103 = arg0.method2404();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass49_2 = Static204.aClass49_4;
		} else {
			this.aClass49_2 = Static72.method1362(arg0.method2404(), arg0.method2404(), arg0.method2404(), arg0.method2404(), arg0.method2404(), arg0.method2404());
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLclient!ja;)Z")
	public boolean method2726(@OriginalArg(1) Class100 arg0) {
		return arg0.anInt3106 == this.anInt3106 && this.aFloat32 == arg0.aFloat32 && arg0.aFloat29 == this.aFloat29 && this.aFloat33 == arg0.aFloat33 && arg0.aFloat30 == this.aFloat30 && this.aFloat34 == arg0.aFloat34 && arg0.aFloat31 == this.aFloat31 && this.anInt3101 == arg0.anInt3101 && this.anInt3103 == arg0.anInt3103 && this.aClass49_2 == arg0.aClass49_2;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!tq;I)V")
	public void method2727(@OriginalArg(0) Class4_Sub7 arg0) {
		this.aFloat34 = (float) (arg0.method2380() * 8) / 255.0F;
		this.aFloat30 = (float) (arg0.method2380() * 8) / 255.0F;
		this.aFloat31 = (float) (arg0.method2380() * 8) / 255.0F;
	}
}

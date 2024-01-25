import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class278 {

	@OriginalMember(owner = "client!rca", name = "h", descriptor = "F")
	public float aFloat202 = 1.0F;

	@OriginalMember(owner = "client!rca", name = "i", descriptor = "F")
	public float aFloat203 = 0.25F;

	@OriginalMember(owner = "client!rca", name = "p", descriptor = "F")
	public float aFloat204 = 1.0F;

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
	public final int anInt7751;

	@OriginalMember(owner = "client!rca", name = "q", descriptor = "Lclient!it;")
	public final Class36 aClass36_2;

	@OriginalMember(owner = "client!rca", name = "n", descriptor = "I")
	public final int anInt7756;

	@OriginalMember(owner = "client!rca", name = "o", descriptor = "I")
	public final int anInt7757;

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "F")
	public final float aFloat199;

	@OriginalMember(owner = "client!rca", name = "l", descriptor = "I")
	public final int anInt7754;

	@OriginalMember(owner = "client!rca", name = "j", descriptor = "I")
	public final int anInt7752;

	@OriginalMember(owner = "client!rca", name = "f", descriptor = "F")
	public final float aFloat200;

	@OriginalMember(owner = "client!rca", name = "g", descriptor = "F")
	public final float aFloat201;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
	public final int anInt7749;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "()V")
	public Class278() {
		this.anInt7751 = Static173.anInt3157;
		this.aClass36_2 = Static582.aClass36_4;
		this.anInt7756 = -50;
		this.anInt7757 = -50;
		this.aFloat199 = 1.2F;
		this.anInt7754 = Static108.anInt7210;
		this.anInt7752 = 0;
		this.aFloat200 = 0.69921875F;
		this.aFloat201 = 1.1523438F;
		this.anInt7749 = -60;
	}

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lclient!io;)V")
	public Class278(@OriginalArg(0) Class1_Sub20 arg0) {
		@Pc(16) int local16 = arg0.method4393();
		if (Static479.aClass1_Sub7_Sub1_1.method2618(Static375.anInt6609) && Static174.aClass12_9.method6406() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt7754 = Static108.anInt7210;
			} else {
				this.anInt7754 = arg0.method4371();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat201 = 1.1523438F;
			} else {
				this.aFloat201 = (float) arg0.method4426() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat200 = 0.69921875F;
			} else {
				this.aFloat200 = (float) arg0.method4426() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat199 = 1.2F;
			} else {
				this.aFloat199 = (float) arg0.method4426() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method4371();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method4426();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method4426();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method4426();
			}
			this.aFloat201 = 1.1523438F;
			this.aFloat200 = 0.69921875F;
			this.anInt7754 = Static108.anInt7210;
			this.aFloat199 = 1.2F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt7756 = -50;
			this.anInt7749 = -60;
			this.anInt7757 = -50;
		} else {
			this.anInt7757 = arg0.method4391();
			this.anInt7749 = arg0.method4391();
			this.anInt7756 = arg0.method4391();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt7751 = Static173.anInt3157;
		} else {
			this.anInt7751 = arg0.method4371();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt7752 = 0;
		} else {
			this.anInt7752 = arg0.method4426();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass36_2 = Static582.aClass36_4;
		} else {
			@Pc(229) int local229 = arg0.method4426();
			@Pc(233) int local233 = arg0.method4426();
			@Pc(237) int local237 = arg0.method4426();
			@Pc(241) int local241 = arg0.method4426();
			@Pc(245) int local245 = arg0.method4426();
			@Pc(249) int local249 = arg0.method4426();
			this.aClass36_2 = Static209.method3525(local233, local245, local229, local241, local249, local237);
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(BLclient!rca;)Z")
	public boolean method6375(@OriginalArg(1) Class278 arg0) {
		return arg0.anInt7754 == this.anInt7754 && this.aFloat201 == arg0.aFloat201 && this.aFloat200 == arg0.aFloat200 && arg0.aFloat199 == this.aFloat199 && this.aFloat203 == arg0.aFloat203 && this.aFloat202 == arg0.aFloat202 && arg0.aFloat204 == this.aFloat204 && this.anInt7751 == arg0.anInt7751 && arg0.anInt7752 == this.anInt7752 && arg0.aClass36_2 == this.aClass36_2;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!io;)V")
	public void method6376(@OriginalArg(1) Class1_Sub20 arg0) {
		this.aFloat202 = (float) (arg0.method4393() * 8) / 255.0F;
		this.aFloat203 = (float) (arg0.method4393() * 8) / 255.0F;
		this.aFloat204 = (float) (arg0.method4393() * 8) / 255.0F;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class186 {

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "F")
	public float aFloat103 = 1.0F;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "F")
	public float aFloat101 = 1.0F;

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "F")
	public float aFloat104 = 0.25F;

	@OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
	public final int anInt5496;

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
	public final int anInt5487;

	@OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
	public final int anInt5492;

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "F")
	public final float aFloat102;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
	public final int anInt5489;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "F")
	public final float aFloat99;

	@OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
	public final int anInt5495;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
	public final int anInt5486;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "F")
	public final float aFloat100;

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "Lclient!vm;")
	public final Class113 aClass113_4;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	public Class186() {
		this.anInt5496 = -50;
		this.anInt5487 = Static226.anInt4463;
		this.anInt5492 = Static172.anInt5803;
		this.aFloat102 = 0.69921875F;
		this.anInt5489 = 0;
		this.aFloat99 = 1.1523438F;
		this.anInt5495 = -50;
		this.anInt5486 = -60;
		this.aFloat100 = 1.2F;
		this.aClass113_4 = Static99.aClass113_2;
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!eb;)V")
	public Class186(@OriginalArg(0) Class1_Sub7 arg0) {
		@Pc(16) int local16 = arg0.method3141();
		if (Static44.aBoolean87 && Static176.aClass2_9.method3312() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt5492 = Static172.anInt5803;
			} else {
				this.anInt5492 = arg0.method3125();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat99 = 1.1523438F;
			} else {
				this.aFloat99 = (float) arg0.method3115() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat102 = 0.69921875F;
			} else {
				this.aFloat102 = (float) arg0.method3115() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat100 = 1.2F;
			} else {
				this.aFloat100 = (float) arg0.method3115() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method3125();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method3115();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method3115();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method3115();
			}
			this.anInt5492 = Static172.anInt5803;
			this.aFloat100 = 1.2F;
			this.aFloat99 = 1.1523438F;
			this.aFloat102 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt5496 = -50;
			this.anInt5495 = -50;
			this.anInt5486 = -60;
		} else {
			this.anInt5496 = arg0.method3090();
			this.anInt5486 = arg0.method3090();
			this.anInt5495 = arg0.method3090();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt5487 = Static226.anInt4463;
		} else {
			this.anInt5487 = arg0.method3125();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt5489 = 0;
		} else {
			this.anInt5489 = arg0.method3115();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass113_4 = Static99.aClass113_2;
		} else {
			this.aClass113_4 = Static199.method3742(arg0.method3115(), arg0.method3115(), arg0.method3115(), arg0.method3115(), arg0.method3115(), arg0.method3115());
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!eb;I)V")
	public void method4878(@OriginalArg(0) Class1_Sub7 arg0) {
		this.aFloat103 = (float) (arg0.method3141() * 8) / 255.0F;
		this.aFloat104 = (float) (arg0.method3141() * 8) / 255.0F;
		this.aFloat101 = (float) (arg0.method3141() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!sh;I)Z")
	public boolean method4879(@OriginalArg(0) Class186 arg0) {
		return arg0.anInt5492 == this.anInt5492 && arg0.aFloat99 == this.aFloat99 && arg0.aFloat102 == this.aFloat102 && arg0.aFloat100 == this.aFloat100 && this.aFloat104 == arg0.aFloat104 && arg0.aFloat103 == this.aFloat103 && this.aFloat101 == arg0.aFloat101 && this.anInt5487 == arg0.anInt5487 && this.anInt5489 == arg0.anInt5489 && this.aClass113_4 == arg0.aClass113_4;
	}
}

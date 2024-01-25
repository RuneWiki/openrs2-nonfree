import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class54 {

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "F")
	public float aFloat13 = 1.0F;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "F")
	public float aFloat15 = 0.25F;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "F")
	public float aFloat16 = 1.0F;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
	public final int anInt1878;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public final int anInt1873;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
	public final int anInt1881;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	public final int anInt1879;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
	public final int anInt1880;

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "F")
	public final float aFloat17;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	public final int anInt1877;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "F")
	public final float aFloat12;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Lclient!sd;")
	public final Class13 aClass13_1;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "F")
	public final float aFloat14;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	public Class54() {
		this.anInt1878 = Static339.anInt6002;
		this.anInt1873 = -50;
		this.anInt1881 = -60;
		this.anInt1879 = 0;
		this.anInt1880 = -50;
		this.aFloat17 = 1.1523438F;
		this.anInt1877 = Static28.anInt665;
		this.aFloat12 = 1.2F;
		this.aClass13_1 = Static345.aClass13_4;
		this.aFloat14 = 0.69921875F;
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!at;)V")
	public Class54(@OriginalArg(0) Class1_Sub7 arg0) {
		@Pc(16) int local16 = arg0.method2132();
		if (Static69.aBoolean112 && Static51.aClass63_2.method4592() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt1878 = Static339.anInt6002;
			} else {
				this.anInt1878 = arg0.method2140();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat17 = 1.1523438F;
			} else {
				this.aFloat17 = (float) arg0.method2161() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat14 = 0.69921875F;
			} else {
				this.aFloat14 = (float) arg0.method2161() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat12 = 1.2F;
			} else {
				this.aFloat12 = (float) arg0.method2161() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method2140();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method2161();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method2161();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method2161();
			}
			this.aFloat12 = 1.2F;
			this.aFloat14 = 0.69921875F;
			this.anInt1878 = Static339.anInt6002;
			this.aFloat17 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt1881 = -60;
			this.anInt1873 = -50;
			this.anInt1880 = -50;
		} else {
			this.anInt1880 = arg0.method2141();
			this.anInt1881 = arg0.method2141();
			this.anInt1873 = arg0.method2141();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt1877 = Static28.anInt665;
		} else {
			this.anInt1877 = arg0.method2140();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt1879 = 0;
		} else {
			this.anInt1879 = arg0.method2161();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass13_1 = Static345.aClass13_4;
		} else {
			this.aClass13_1 = Static334.method5891(arg0.method2161(), arg0.method2161(), arg0.method2161(), arg0.method2161(), arg0.method2161(), arg0.method2161());
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!fc;I)Z")
	public boolean method1782(@OriginalArg(0) Class54 arg0) {
		return arg0.anInt1878 == this.anInt1878 && this.aFloat17 == arg0.aFloat17 && this.aFloat14 == arg0.aFloat14 && arg0.aFloat12 == this.aFloat12 && this.aFloat15 == arg0.aFloat15 && arg0.aFloat13 == this.aFloat13 && this.aFloat16 == arg0.aFloat16 && arg0.anInt1877 == this.anInt1877 && this.anInt1879 == arg0.anInt1879 && arg0.aClass13_1 == this.aClass13_1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!at;)V")
	public void method1784(@OriginalArg(1) Class1_Sub7 arg0) {
		this.aFloat13 = (float) (arg0.method2132() * 8) / 255.0F;
		this.aFloat15 = (float) (arg0.method2132() * 8) / 255.0F;
		this.aFloat16 = (float) (arg0.method2132() * 8) / 255.0F;
	}
}

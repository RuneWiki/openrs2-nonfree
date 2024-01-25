import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class61 {

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
	public int anInt1830;

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
	public int anInt1831;

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
	public int anInt1832;

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
	private int anInt1834;

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
	private int anInt1835;

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
	private int anInt1836;

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
	private int anInt1837;

	@OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
	private int anInt1838;

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
	private int anInt1833 = 2;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "[I")
	private int[] anIntArray148 = new int[2];

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "[I")
	private int[] anIntArray149 = new int[2];

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
	public Class61() {
		this.anIntArray148[0] = 0;
		this.anIntArray148[1] = 65535;
		this.anIntArray149[0] = 0;
		this.anIntArray149[1] = 65535;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "()V")
	public void method1602() {
		this.anInt1835 = 0;
		this.anInt1834 = 0;
		this.anInt1837 = 0;
		this.anInt1836 = 0;
		this.anInt1838 = 0;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!iv;)V")
	public void method1603(@OriginalArg(0) Class4_Sub12 arg0) {
		this.anInt1830 = arg0.method2490();
		this.anInt1831 = arg0.method2529();
		this.anInt1832 = arg0.method2529();
		this.method1605(arg0);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)I")
	public int method1604(@OriginalArg(0) int arg0) {
		if (this.anInt1838 >= this.anInt1835) {
			this.anInt1836 = this.anIntArray149[this.anInt1834++] << 15;
			if (this.anInt1834 >= this.anInt1833) {
				this.anInt1834 = this.anInt1833 - 1;
			}
			this.anInt1835 = (int) ((double) this.anIntArray148[this.anInt1834] / 65536.0D * (double) arg0);
			if (this.anInt1835 > this.anInt1838) {
				this.anInt1837 = ((this.anIntArray149[this.anInt1834] << 15) - this.anInt1836) / (this.anInt1835 - this.anInt1838);
			}
		}
		this.anInt1836 += this.anInt1837;
		this.anInt1838++;
		return this.anInt1836 - this.anInt1837 >> 15;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(Lclient!iv;)V")
	public void method1605(@OriginalArg(0) Class4_Sub12 arg0) {
		this.anInt1833 = arg0.method2490();
		this.anIntArray148 = new int[this.anInt1833];
		this.anIntArray149 = new int[this.anInt1833];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1833; local16++) {
			this.anIntArray148[local16] = arg0.method2536();
			this.anIntArray149[local16] = arg0.method2536();
		}
	}
}

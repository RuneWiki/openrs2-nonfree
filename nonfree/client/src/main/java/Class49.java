import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class49 {

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
	public int anInt1708;

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
	public int anInt1709;

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
	public int anInt1710;

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
	private int anInt1712;

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
	private int anInt1713;

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
	private int anInt1714;

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
	private int anInt1715;

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
	private int anInt1716;

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
	private int anInt1711 = 2;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "[I")
	private int[] anIntArray80 = new int[2];

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "[I")
	private int[] anIntArray81 = new int[2];

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
	public Class49() {
		this.anIntArray80[0] = 0;
		this.anIntArray80[1] = 65535;
		this.anIntArray81[0] = 0;
		this.anIntArray81[1] = 65535;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "()V")
	public void method1651() {
		this.anInt1715 = 0;
		this.anInt1714 = 0;
		this.anInt1716 = 0;
		this.anInt1713 = 0;
		this.anInt1712 = 0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)I")
	public int method1652(@OriginalArg(0) int arg0) {
		if (this.anInt1712 >= this.anInt1715) {
			this.anInt1713 = this.anIntArray81[this.anInt1714++] << 15;
			if (this.anInt1714 >= this.anInt1711) {
				this.anInt1714 = this.anInt1711 - 1;
			}
			this.anInt1715 = (int) ((double) this.anIntArray80[this.anInt1714] / 65536.0D * (double) arg0);
			if (this.anInt1715 > this.anInt1712) {
				this.anInt1716 = ((this.anIntArray81[this.anInt1714] << 15) - this.anInt1713) / (this.anInt1715 - this.anInt1712);
			}
		}
		this.anInt1713 += this.anInt1716;
		this.anInt1712++;
		return this.anInt1713 - this.anInt1716 >> 15;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!fd;)V")
	public void method1653(@OriginalArg(0) Class3_Sub7 arg0) {
		this.anInt1711 = arg0.method6538();
		this.anIntArray80 = new int[this.anInt1711];
		this.anIntArray81 = new int[this.anInt1711];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1711; local16++) {
			this.anIntArray80[local16] = arg0.method6535();
			this.anIntArray81[local16] = arg0.method6535();
		}
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(Lclient!fd;)V")
	public void method1654(@OriginalArg(0) Class3_Sub7 arg0) {
		this.anInt1709 = arg0.method6538();
		this.anInt1708 = arg0.method6497();
		this.anInt1710 = arg0.method6497();
		this.method1653(arg0);
	}
}

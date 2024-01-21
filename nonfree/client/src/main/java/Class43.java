import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class43 {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
	public int anInt1826;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
	public int anInt1827;

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
	public int anInt1828;

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
	private int anInt1830;

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
	private int anInt1831;

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
	private int anInt1832;

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
	private int anInt1833;

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
	private int anInt1834;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
	private int anInt1829 = 2;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "[I")
	private int[] anIntArray194 = new int[2];

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "[I")
	private int[] anIntArray193 = new int[2];

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
	public Class43() {
		this.anIntArray194[0] = 0;
		this.anIntArray194[1] = 65535;
		this.anIntArray193[0] = 0;
		this.anIntArray193[1] = 65535;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)I")
	public int method1287(@OriginalArg(0) int arg0) {
		if (this.anInt1834 >= this.anInt1830) {
			this.anInt1832 = this.anIntArray193[this.anInt1831++] << 15;
			if (this.anInt1831 >= this.anInt1829) {
				this.anInt1831 = this.anInt1829 - 1;
			}
			this.anInt1830 = (int) ((double) this.anIntArray194[this.anInt1831] / 65536.0D * (double) arg0);
			if (this.anInt1830 > this.anInt1834) {
				this.anInt1833 = ((this.anIntArray193[this.anInt1831] << 15) - this.anInt1832) / (this.anInt1830 - this.anInt1834);
			}
		}
		this.anInt1832 += this.anInt1833;
		this.anInt1834++;
		return this.anInt1832 - this.anInt1833 >> 15;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "()V")
	public void method1288() {
		this.anInt1830 = 0;
		this.anInt1831 = 0;
		this.anInt1833 = 0;
		this.anInt1832 = 0;
		this.anInt1834 = 0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!va;)V")
	public void method1289(@OriginalArg(0) Class2_Sub11 arg0) {
		this.anInt1829 = arg0.method1461();
		this.anIntArray194 = new int[this.anInt1829];
		this.anIntArray193 = new int[this.anInt1829];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1829; local16++) {
			this.anIntArray194[local16] = arg0.method1456();
			this.anIntArray193[local16] = arg0.method1456();
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(Lclient!va;)V")
	public void method1290(@OriginalArg(0) Class2_Sub11 arg0) {
		this.anInt1826 = arg0.method1461();
		this.anInt1827 = arg0.method1449();
		this.anInt1828 = arg0.method1449();
		this.method1289(arg0);
	}
}

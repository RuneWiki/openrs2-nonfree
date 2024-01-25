import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class68 {

	@OriginalMember(owner = "client!df", name = "b", descriptor = "I")
	public int anInt1798;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "I")
	public int anInt1799;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "I")
	public int anInt1800;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "I")
	private int anInt1802;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "I")
	private int anInt1803;

	@OriginalMember(owner = "client!df", name = "i", descriptor = "I")
	private int anInt1804;

	@OriginalMember(owner = "client!df", name = "j", descriptor = "I")
	private int anInt1805;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "I")
	private int anInt1806;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "I")
	private int anInt1801 = 2;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "[I")
	private int[] anIntArray162 = new int[2];

	@OriginalMember(owner = "client!df", name = "c", descriptor = "[I")
	private int[] anIntArray163 = new int[2];

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class68() {
		this.anIntArray162[0] = 0;
		this.anIntArray162[1] = 65535;
		this.anIntArray163[0] = 0;
		this.anIntArray163[1] = 65535;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!ud;)V")
	public void method1571(@OriginalArg(0) Class2_Sub34 arg0) {
		this.anInt1801 = arg0.method6904();
		this.anIntArray162 = new int[this.anInt1801];
		this.anIntArray163 = new int[this.anInt1801];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1801; local16++) {
			this.anIntArray162[local16] = arg0.method6884();
			this.anIntArray163[local16] = arg0.method6884();
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(Lclient!ud;)V")
	public void method1572(@OriginalArg(0) Class2_Sub34 arg0) {
		this.anInt1798 = arg0.method6904();
		this.anInt1800 = arg0.method6865();
		this.anInt1799 = arg0.method6865();
		this.method1571(arg0);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
	public void method1573() {
		this.anInt1806 = 0;
		this.anInt1803 = 0;
		this.anInt1802 = 0;
		this.anInt1805 = 0;
		this.anInt1804 = 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I")
	public int method1574(@OriginalArg(0) int arg0) {
		if (this.anInt1804 >= this.anInt1806) {
			this.anInt1805 = this.anIntArray163[this.anInt1803++] << 15;
			if (this.anInt1803 >= this.anInt1801) {
				this.anInt1803 = this.anInt1801 - 1;
			}
			this.anInt1806 = (int) ((double) this.anIntArray162[this.anInt1803] / 65536.0D * (double) arg0);
			if (this.anInt1806 > this.anInt1804) {
				this.anInt1802 = ((this.anIntArray163[this.anInt1803] << 15) - this.anInt1805) / (this.anInt1806 - this.anInt1804);
			}
		}
		this.anInt1805 += this.anInt1802;
		this.anInt1804++;
		return this.anInt1805 - this.anInt1802 >> 15;
	}
}

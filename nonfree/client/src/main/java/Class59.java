import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class59 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
	public int anInt1813;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
	public int anInt1815;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
	public int anInt1816;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
	private int anInt1817;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
	private int anInt1818;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
	private int anInt1819;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
	private int anInt1820;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
	private int anInt1821;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
	private int anInt1814 = 2;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "[I")
	private int[] anIntArray327 = new int[2];

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "[I")
	private int[] anIntArray328 = new int[2];

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class59() {
		this.anIntArray327[0] = 0;
		this.anIntArray327[1] = 65535;
		this.anIntArray328[0] = 0;
		this.anIntArray328[1] = 65535;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!dc;)V")
	public void method1385(@OriginalArg(0) Class1_Sub5 arg0) {
		this.anInt1816 = arg0.method672();
		this.anInt1813 = arg0.method663();
		this.anInt1815 = arg0.method663();
		this.method1388(arg0);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "()V")
	public void method1386() {
		this.anInt1817 = 0;
		this.anInt1819 = 0;
		this.anInt1818 = 0;
		this.anInt1820 = 0;
		this.anInt1821 = 0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I")
	public int method1387(@OriginalArg(0) int arg0) {
		if (this.anInt1821 >= this.anInt1817) {
			this.anInt1820 = this.anIntArray328[this.anInt1819++] << 15;
			if (this.anInt1819 >= this.anInt1814) {
				this.anInt1819 = this.anInt1814 - 1;
			}
			this.anInt1817 = (int) ((double) this.anIntArray327[this.anInt1819] / 65536.0D * (double) arg0);
			if (this.anInt1817 > this.anInt1821) {
				this.anInt1818 = ((this.anIntArray328[this.anInt1819] << 15) - this.anInt1820) / (this.anInt1817 - this.anInt1821);
			}
		}
		this.anInt1820 += this.anInt1818;
		this.anInt1821++;
		return this.anInt1820 - this.anInt1818 >> 15;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(Lclient!dc;)V")
	public void method1388(@OriginalArg(0) Class1_Sub5 arg0) {
		this.anInt1814 = arg0.method672();
		this.anIntArray327 = new int[this.anInt1814];
		this.anIntArray328 = new int[this.anInt1814];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1814; local16++) {
			this.anIntArray327[local16] = arg0.method651();
			this.anIntArray328[local16] = arg0.method651();
		}
	}
}

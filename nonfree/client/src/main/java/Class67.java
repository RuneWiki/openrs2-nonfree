import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class67 {

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
	public int anInt1772;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
	public int anInt1773;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
	public int anInt1775;

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
	private int anInt1776;

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
	private int anInt1777;

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
	private int anInt1778;

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
	private int anInt1779;

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
	private int anInt1780;

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
	private int anInt1774 = 2;

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "[I")
	private int[] anIntArray144 = new int[2];

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "[I")
	private int[] anIntArray143 = new int[2];

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
	public Class67() {
		this.anIntArray144[0] = 0;
		this.anIntArray144[1] = 65535;
		this.anIntArray143[0] = 0;
		this.anIntArray143[1] = 65535;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!sb;)V")
	public void method1380(@OriginalArg(0) Class1_Sub14 arg0) {
		this.anInt1775 = arg0.method2595();
		this.anInt1772 = arg0.method2647();
		this.anInt1773 = arg0.method2647();
		this.method1383(arg0);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "()V")
	public void method1381() {
		this.anInt1776 = 0;
		this.anInt1777 = 0;
		this.anInt1778 = 0;
		this.anInt1780 = 0;
		this.anInt1779 = 0;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)I")
	public int method1382(@OriginalArg(0) int arg0) {
		if (this.anInt1779 >= this.anInt1776) {
			this.anInt1780 = this.anIntArray143[this.anInt1777++] << 15;
			if (this.anInt1777 >= this.anInt1774) {
				this.anInt1777 = this.anInt1774 - 1;
			}
			this.anInt1776 = (int) ((double) this.anIntArray144[this.anInt1777] / 65536.0D * (double) arg0);
			if (this.anInt1776 > this.anInt1779) {
				this.anInt1778 = ((this.anIntArray143[this.anInt1777] << 15) - this.anInt1780) / (this.anInt1776 - this.anInt1779);
			}
		}
		this.anInt1780 += this.anInt1778;
		this.anInt1779++;
		return this.anInt1780 - this.anInt1778 >> 15;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(Lclient!sb;)V")
	public void method1383(@OriginalArg(0) Class1_Sub14 arg0) {
		this.anInt1774 = arg0.method2595();
		this.anIntArray144 = new int[this.anInt1774];
		this.anIntArray143 = new int[this.anInt1774];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1774; local16++) {
			this.anIntArray144[local16] = arg0.method2593();
			this.anIntArray143[local16] = arg0.method2593();
		}
	}
}

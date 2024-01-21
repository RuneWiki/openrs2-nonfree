import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class36 {

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
	public int anInt1749;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
	public int anInt1750;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
	public int anInt1751;

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
	private int anInt1752;

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
	private int anInt1753;

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
	private int anInt1754;

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
	private int anInt1755;

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
	private int anInt1756;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
	private int anInt1748 = 2;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "[I")
	private int[] anIntArray193 = new int[2];

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "[I")
	private int[] anIntArray194 = new int[2];

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class36() {
		this.anIntArray193[0] = 0;
		this.anIntArray193[1] = 65535;
		this.anIntArray194[0] = 0;
		this.anIntArray194[1] = 65535;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "()V")
	public void method1214() {
		this.anInt1753 = 0;
		this.anInt1756 = 0;
		this.anInt1754 = 0;
		this.anInt1752 = 0;
		this.anInt1755 = 0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!wa;)V")
	public void method1215(@OriginalArg(0) Class1_Sub14 arg0) {
		this.anInt1749 = arg0.method1738();
		this.anInt1751 = arg0.method1700();
		this.anInt1750 = arg0.method1700();
		this.method1216(arg0);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lclient!wa;)V")
	public void method1216(@OriginalArg(0) Class1_Sub14 arg0) {
		this.anInt1748 = arg0.method1738();
		this.anIntArray193 = new int[this.anInt1748];
		this.anIntArray194 = new int[this.anInt1748];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1748; local16++) {
			this.anIntArray193[local16] = arg0.method1753();
			this.anIntArray194[local16] = arg0.method1753();
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I")
	public int method1217(@OriginalArg(0) int arg0) {
		if (this.anInt1755 >= this.anInt1753) {
			this.anInt1752 = this.anIntArray194[this.anInt1756++] << 15;
			if (this.anInt1756 >= this.anInt1748) {
				this.anInt1756 = this.anInt1748 - 1;
			}
			this.anInt1753 = (int) ((double) this.anIntArray193[this.anInt1756] / 65536.0D * (double) arg0);
			if (this.anInt1753 > this.anInt1755) {
				this.anInt1754 = ((this.anIntArray194[this.anInt1756] << 15) - this.anInt1752) / (this.anInt1753 - this.anInt1755);
			}
		}
		this.anInt1752 += this.anInt1754;
		this.anInt1755++;
		return this.anInt1752 - this.anInt1754 >> 15;
	}
}

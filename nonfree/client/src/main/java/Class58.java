import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class58 {

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
	public int anInt1921;

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
	public int anInt1922;

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
	public int anInt1923;

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
	private int anInt1925;

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
	private int anInt1926;

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
	private int anInt1927;

	@OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
	private int anInt1928;

	@OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
	private int anInt1929;

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
	private int anInt1924 = 2;

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "[I")
	private int[] anIntArray62 = new int[2];

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "[I")
	private int[] anIntArray61 = new int[2];

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V")
	public Class58() {
		this.anIntArray62[0] = 0;
		this.anIntArray62[1] = 65535;
		this.anIntArray61[0] = 0;
		this.anIntArray61[1] = 65535;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!sl;)V")
	public void method1861(@OriginalArg(0) Class3_Sub3 arg0) {
		this.anInt1924 = arg0.method4225();
		this.anIntArray62 = new int[this.anInt1924];
		this.anIntArray61 = new int[this.anInt1924];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1924; local16++) {
			this.anIntArray62[local16] = arg0.method4221();
			this.anIntArray61[local16] = arg0.method4221();
		}
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(Lclient!sl;)V")
	public void method1862(@OriginalArg(0) Class3_Sub3 arg0) {
		this.anInt1921 = arg0.method4225();
		this.anInt1923 = arg0.method4207();
		this.anInt1922 = arg0.method4207();
		this.method1861(arg0);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)I")
	public int method1863(@OriginalArg(0) int arg0) {
		if (this.anInt1925 >= this.anInt1929) {
			this.anInt1928 = this.anIntArray61[this.anInt1926++] << 15;
			if (this.anInt1926 >= this.anInt1924) {
				this.anInt1926 = this.anInt1924 - 1;
			}
			this.anInt1929 = (int) ((double) this.anIntArray62[this.anInt1926] / 65536.0D * (double) arg0);
			if (this.anInt1929 > this.anInt1925) {
				this.anInt1927 = ((this.anIntArray61[this.anInt1926] << 15) - this.anInt1928) / (this.anInt1929 - this.anInt1925);
			}
		}
		this.anInt1928 += this.anInt1927;
		this.anInt1925++;
		return this.anInt1928 - this.anInt1927 >> 15;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "()V")
	public void method1864() {
		this.anInt1929 = 0;
		this.anInt1926 = 0;
		this.anInt1927 = 0;
		this.anInt1928 = 0;
		this.anInt1925 = 0;
	}
}

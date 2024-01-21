import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class74 {

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	public int anInt2836;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	public int anInt2837;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
	public int anInt2838;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
	private int anInt2839;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
	private int anInt2840;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
	private int anInt2841;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
	private int anInt2842;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
	private int anInt2843;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
	private int anInt2835 = 2;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "[I")
	private int[] anIntArray317 = new int[2];

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "[I")
	private int[] anIntArray318 = new int[2];

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class74() {
		this.anIntArray317[0] = 0;
		this.anIntArray317[1] = 65535;
		this.anIntArray318[0] = 0;
		this.anIntArray318[1] = 65535;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
	public int method2008(@OriginalArg(0) int arg0) {
		if (this.anInt2839 >= this.anInt2843) {
			this.anInt2842 = this.anIntArray318[this.anInt2840++] << 15;
			if (this.anInt2840 >= this.anInt2835) {
				this.anInt2840 = this.anInt2835 - 1;
			}
			this.anInt2843 = (int) ((double) this.anIntArray317[this.anInt2840] / 65536.0D * (double) arg0);
			if (this.anInt2843 > this.anInt2839) {
				this.anInt2841 = ((this.anIntArray318[this.anInt2840] << 15) - this.anInt2842) / (this.anInt2843 - this.anInt2839);
			}
		}
		this.anInt2842 += this.anInt2841;
		this.anInt2839++;
		return this.anInt2842 - this.anInt2841 >> 15;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
	public void method2009() {
		this.anInt2843 = 0;
		this.anInt2840 = 0;
		this.anInt2841 = 0;
		this.anInt2842 = 0;
		this.anInt2839 = 0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!re;)V")
	public void method2010(@OriginalArg(0) Class4_Sub13 arg0) {
		this.anInt2835 = arg0.method1223();
		this.anIntArray317 = new int[this.anInt2835];
		this.anIntArray318 = new int[this.anInt2835];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2835; local16++) {
			this.anIntArray317[local16] = arg0.method1244();
			this.anIntArray318[local16] = arg0.method1244();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Lclient!re;)V")
	public void method2011(@OriginalArg(0) Class4_Sub13 arg0) {
		this.anInt2838 = arg0.method1223();
		this.anInt2837 = arg0.method1215();
		this.anInt2836 = arg0.method1215();
		this.method2010(arg0);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class93 {

	@OriginalMember(owner = "client!go", name = "a", descriptor = "I")
	public int anInt2836;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "I")
	public int anInt2838;

	@OriginalMember(owner = "client!go", name = "f", descriptor = "I")
	public int anInt2839;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "I")
	private int anInt2840;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "I")
	private int anInt2841;

	@OriginalMember(owner = "client!go", name = "i", descriptor = "I")
	private int anInt2842;

	@OriginalMember(owner = "client!go", name = "j", descriptor = "I")
	private int anInt2843;

	@OriginalMember(owner = "client!go", name = "k", descriptor = "I")
	private int anInt2844;

	@OriginalMember(owner = "client!go", name = "c", descriptor = "I")
	private int anInt2837 = 2;

	@OriginalMember(owner = "client!go", name = "b", descriptor = "[I")
	private int[] anIntArray171 = new int[2];

	@OriginalMember(owner = "client!go", name = "d", descriptor = "[I")
	private int[] anIntArray172 = new int[2];

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	public Class93() {
		this.anIntArray171[0] = 0;
		this.anIntArray171[1] = 65535;
		this.anIntArray172[0] = 0;
		this.anIntArray172[1] = 65535;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!ae;)V")
	public void method2376(@OriginalArg(0) Class6_Sub1 arg0) {
		this.anInt2837 = arg0.method6433();
		this.anIntArray171 = new int[this.anInt2837];
		this.anIntArray172 = new int[this.anInt2837];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2837; local16++) {
			this.anIntArray171[local16] = arg0.method6485();
			this.anIntArray172[local16] = arg0.method6485();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "()V")
	public void method2377() {
		this.anInt2844 = 0;
		this.anInt2840 = 0;
		this.anInt2841 = 0;
		this.anInt2842 = 0;
		this.anInt2843 = 0;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)I")
	public int method2378(@OriginalArg(0) int arg0) {
		if (this.anInt2843 >= this.anInt2844) {
			this.anInt2842 = this.anIntArray172[this.anInt2840++] << 15;
			if (this.anInt2840 >= this.anInt2837) {
				this.anInt2840 = this.anInt2837 - 1;
			}
			this.anInt2844 = (int) ((double) this.anIntArray171[this.anInt2840] / 65536.0D * (double) arg0);
			if (this.anInt2844 > this.anInt2843) {
				this.anInt2841 = ((this.anIntArray172[this.anInt2840] << 15) - this.anInt2842) / (this.anInt2844 - this.anInt2843);
			}
		}
		this.anInt2842 += this.anInt2841;
		this.anInt2843++;
		return this.anInt2842 - this.anInt2841 >> 15;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(Lclient!ae;)V")
	public void method2379(@OriginalArg(0) Class6_Sub1 arg0) {
		this.anInt2839 = arg0.method6433();
		this.anInt2838 = arg0.method6442();
		this.anInt2836 = arg0.method6442();
		this.method2376(arg0);
	}
}

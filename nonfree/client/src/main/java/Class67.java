import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class67 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	public int anInt2841;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	public int anInt2842;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
	public int anInt2844;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
	private int anInt2845;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
	private int anInt2846;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
	private int anInt2847;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
	private int anInt2848;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
	private int anInt2849;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
	private int anInt2843 = 2;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "[I")
	private int[] anIntArray308 = new int[2];

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "[I")
	private int[] anIntArray309 = new int[2];

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public Class67() {
		this.anIntArray308[0] = 0;
		this.anIntArray308[1] = 65535;
		this.anIntArray309[0] = 0;
		this.anIntArray309[1] = 65535;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!bf;)V")
	public void method1865(@OriginalArg(0) Class6_Sub4 arg0) {
		this.anInt2843 = arg0.method1321();
		this.anIntArray308 = new int[this.anInt2843];
		this.anIntArray309 = new int[this.anInt2843];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2843; local16++) {
			this.anIntArray308[local16] = arg0.method1306();
			this.anIntArray309[local16] = arg0.method1306();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "()V")
	public void method1866() {
		this.anInt2845 = 0;
		this.anInt2849 = 0;
		this.anInt2846 = 0;
		this.anInt2847 = 0;
		this.anInt2848 = 0;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(Lclient!bf;)V")
	public void method1867(@OriginalArg(0) Class6_Sub4 arg0) {
		this.anInt2842 = arg0.method1321();
		this.anInt2844 = arg0.method1289();
		this.anInt2841 = arg0.method1289();
		this.method1865(arg0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)I")
	public int method1868(@OriginalArg(0) int arg0) {
		if (this.anInt2848 >= this.anInt2845) {
			this.anInt2847 = this.anIntArray309[this.anInt2849++] << 15;
			if (this.anInt2849 >= this.anInt2843) {
				this.anInt2849 = this.anInt2843 - 1;
			}
			this.anInt2845 = (int) ((double) this.anIntArray308[this.anInt2849] / 65536.0D * (double) arg0);
			if (this.anInt2845 > this.anInt2848) {
				this.anInt2846 = ((this.anIntArray309[this.anInt2849] << 15) - this.anInt2847) / (this.anInt2845 - this.anInt2848);
			}
		}
		this.anInt2847 += this.anInt2846;
		this.anInt2848++;
		return this.anInt2847 - this.anInt2846 >> 15;
	}
}

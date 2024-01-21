import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class87 {

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
	public int anInt3836;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
	public int anInt3838;

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
	public int anInt3839;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
	private int anInt3840;

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
	private int anInt3841;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
	private int anInt3842;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
	private int anInt3843;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
	private int anInt3844;

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
	private int anInt3837 = 2;

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "[I")
	private int[] anIntArray433 = new int[2];

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "[I")
	private int[] anIntArray432 = new int[2];

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
	public Class87() {
		this.anIntArray433[0] = 0;
		this.anIntArray433[1] = 65535;
		this.anIntArray432[0] = 0;
		this.anIntArray432[1] = 65535;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!rd;)V")
	public void method2760(@OriginalArg(0) Class3_Sub4 arg0) {
		this.anInt3837 = arg0.method191();
		this.anIntArray433 = new int[this.anInt3837];
		this.anIntArray432 = new int[this.anInt3837];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3837; local16++) {
			this.anIntArray433[local16] = arg0.method208();
			this.anIntArray432[local16] = arg0.method208();
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(Lclient!rd;)V")
	public void method2761(@OriginalArg(0) Class3_Sub4 arg0) {
		this.anInt3838 = arg0.method191();
		this.anInt3839 = arg0.method213();
		this.anInt3836 = arg0.method213();
		this.method2760(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "()V")
	public void method2762() {
		this.anInt3840 = 0;
		this.anInt3841 = 0;
		this.anInt3842 = 0;
		this.anInt3844 = 0;
		this.anInt3843 = 0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)I")
	public int method2763(@OriginalArg(0) int arg0) {
		if (this.anInt3843 >= this.anInt3840) {
			this.anInt3844 = this.anIntArray432[this.anInt3841++] << 15;
			if (this.anInt3841 >= this.anInt3837) {
				this.anInt3841 = this.anInt3837 - 1;
			}
			this.anInt3840 = (int) ((double) this.anIntArray433[this.anInt3841] / 65536.0D * (double) arg0);
			if (this.anInt3840 > this.anInt3843) {
				this.anInt3842 = ((this.anIntArray432[this.anInt3841] << 15) - this.anInt3844) / (this.anInt3840 - this.anInt3843);
			}
		}
		this.anInt3844 += this.anInt3842;
		this.anInt3843++;
		return this.anInt3844 - this.anInt3842 >> 15;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ica")
public final class Class171 {

	@OriginalMember(owner = "client!ica", name = "i", descriptor = "I")
	public int anInt4060;

	@OriginalMember(owner = "client!ica", name = "k", descriptor = "I")
	public int anInt4061;

	@OriginalMember(owner = "client!ica", name = "j", descriptor = "I")
	public int anInt4063;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "I")
	private int anInt4064;

	@OriginalMember(owner = "client!ica", name = "h", descriptor = "I")
	private int anInt4065;

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "I")
	private int anInt4066;

	@OriginalMember(owner = "client!ica", name = "e", descriptor = "I")
	private int anInt4067;

	@OriginalMember(owner = "client!ica", name = "f", descriptor = "I")
	private int anInt4068;

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "I")
	private int anInt4062 = 2;

	@OriginalMember(owner = "client!ica", name = "d", descriptor = "[I")
	private int[] anIntArray303 = new int[2];

	@OriginalMember(owner = "client!ica", name = "g", descriptor = "[I")
	private int[] anIntArray304 = new int[2];

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "()V")
	public Class171() {
		this.anIntArray303[0] = 0;
		this.anIntArray303[1] = 65535;
		this.anIntArray304[0] = 0;
		this.anIntArray304[1] = 65535;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lclient!et;)V")
	public void method3695(@OriginalArg(0) Class2_Sub20 arg0) {
		this.anInt4060 = arg0.method8581(-17416);
		this.anInt4063 = arg0.method8555(-9372);
		this.anInt4061 = arg0.method8555(-9372);
		this.method3696(arg0);
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(Lclient!et;)V")
	public void method3696(@OriginalArg(0) Class2_Sub20 arg0) {
		this.anInt4062 = arg0.method8581(-17416);
		this.anIntArray303 = new int[this.anInt4062];
		this.anIntArray304 = new int[this.anInt4062];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4062; local16++) {
			this.anIntArray303[local16] = arg0.method8575();
			this.anIntArray304[local16] = arg0.method8575();
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "()V")
	public void method3697() {
		this.anInt4068 = 0;
		this.anInt4066 = 0;
		this.anInt4064 = 0;
		this.anInt4065 = 0;
		this.anInt4067 = 0;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)I")
	public int method3698(@OriginalArg(0) int arg0) {
		if (this.anInt4067 >= this.anInt4068) {
			this.anInt4065 = this.anIntArray304[this.anInt4066++] << 15;
			if (this.anInt4066 >= this.anInt4062) {
				this.anInt4066 = this.anInt4062 - 1;
			}
			this.anInt4068 = (int) ((double) this.anIntArray303[this.anInt4066] / 65536.0D * (double) arg0);
			if (this.anInt4068 > this.anInt4067) {
				this.anInt4064 = ((this.anIntArray304[this.anInt4066] << 15) - this.anInt4065) / (this.anInt4068 - this.anInt4067);
			}
		}
		this.anInt4065 += this.anInt4064;
		this.anInt4067++;
		return this.anInt4065 - this.anInt4064 >> 15;
	}
}

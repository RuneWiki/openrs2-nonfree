import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class292 {

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
	public int anInt7927;

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
	public int anInt7928;

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
	public int anInt7929;

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
	private int anInt7931;

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
	private int anInt7932;

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
	private int anInt7933;

	@OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
	private int anInt7934;

	@OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
	private int anInt7935;

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
	private int anInt7930 = 2;

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "[I")
	private int[] anIntArray639 = new int[2];

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "[I")
	private int[] anIntArray638 = new int[2];

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "()V")
	public Class292() {
		this.anIntArray639[0] = 0;
		this.anIntArray639[1] = 65535;
		this.anIntArray638[0] = 0;
		this.anIntArray638[1] = 65535;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!ee;)V")
	public void method6915(@OriginalArg(0) Class5_Sub12 arg0) {
		this.anInt7930 = arg0.method8645();
		this.anIntArray639 = new int[this.anInt7930];
		this.anIntArray638 = new int[this.anInt7930];
		for (@Pc(16) int local16 = 0; local16 < this.anInt7930; local16++) {
			this.anIntArray639[local16] = arg0.method8631();
			this.anIntArray638[local16] = arg0.method8631();
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(Lclient!ee;)V")
	public void method6916(@OriginalArg(0) Class5_Sub12 arg0) {
		this.anInt7927 = arg0.method8645();
		this.anInt7928 = arg0.method8623();
		this.anInt7929 = arg0.method8623();
		this.method6915(arg0);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "()V")
	public void method6917() {
		this.anInt7935 = 0;
		this.anInt7933 = 0;
		this.anInt7931 = 0;
		this.anInt7934 = 0;
		this.anInt7932 = 0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)I")
	public int method6918(@OriginalArg(0) int arg0) {
		if (this.anInt7932 >= this.anInt7935) {
			this.anInt7934 = this.anIntArray638[this.anInt7933++] << 15;
			if (this.anInt7933 >= this.anInt7930) {
				this.anInt7933 = this.anInt7930 - 1;
			}
			this.anInt7935 = (int) ((double) this.anIntArray639[this.anInt7933] / 65536.0D * (double) arg0);
			if (this.anInt7935 > this.anInt7932) {
				this.anInt7931 = ((this.anIntArray638[this.anInt7933] << 15) - this.anInt7934) / (this.anInt7935 - this.anInt7932);
			}
		}
		this.anInt7934 += this.anInt7931;
		this.anInt7932++;
		return this.anInt7934 - this.anInt7931 >> 15;
	}
}

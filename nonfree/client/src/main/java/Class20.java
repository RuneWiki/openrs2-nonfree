import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class20 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
	public int anInt873;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
	public int anInt874;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
	public int anInt876;

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
	private int anInt875 = 2;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "[I")
	private int[] anIntArray71 = new int[2];

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "[I")
	private int[] anIntArray70 = new int[2];

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class20() {
		this.anIntArray71[0] = 0;
		this.anIntArray71[1] = 65535;
		this.anIntArray70[0] = 0;
		this.anIntArray70[1] = 65535;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ra;)V")
	public void method692(@OriginalArg(0) Class2_Sub3 arg0) {
		this.anInt875 = arg0.method260();
		this.anIntArray71 = new int[this.anInt875];
		this.anIntArray70 = new int[this.anInt875];
		for (@Pc(16) int local16 = 0; local16 < this.anInt875; local16++) {
			this.anIntArray71[local16] = arg0.method269();
			this.anIntArray70[local16] = arg0.method269();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "()V")
	public void method693() {
		this.anInt877 = 0;
		this.anInt879 = 0;
		this.anInt881 = 0;
		this.anInt878 = 0;
		this.anInt880 = 0;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(Lclient!ra;)V")
	public void method694(@OriginalArg(0) Class2_Sub3 arg0) {
		this.anInt874 = arg0.method260();
		this.anInt876 = arg0.method248();
		this.anInt873 = arg0.method248();
		this.method692(arg0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)I")
	public int method695(@OriginalArg(0) int arg0) {
		if (this.anInt880 >= this.anInt877) {
			this.anInt878 = this.anIntArray70[this.anInt879++] << 15;
			if (this.anInt879 >= this.anInt875) {
				this.anInt879 = this.anInt875 - 1;
			}
			this.anInt877 = (int) ((double) this.anIntArray71[this.anInt879] / 65536.0D * (double) arg0);
			if (this.anInt877 > this.anInt880) {
				this.anInt881 = ((this.anIntArray70[this.anInt879] << 15) - this.anInt878) / (this.anInt877 - this.anInt880);
			}
		}
		this.anInt878 += this.anInt881;
		this.anInt880++;
		return this.anInt878 - this.anInt881 >> 15;
	}
}

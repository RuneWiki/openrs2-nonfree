import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class8 {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
	public int anInt255;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
	public int anInt257;

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
	public int anInt258;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
	private int anInt256 = 2;

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "[I")
	private int[] anIntArray92 = new int[2];

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "[I")
	private int[] anIntArray91 = new int[2];

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class8() {
		this.anIntArray92[0] = 0;
		this.anIntArray92[1] = 65535;
		this.anIntArray91[0] = 0;
		this.anIntArray91[1] = 65535;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!hd;)V")
	public void method244(@OriginalArg(0) Class3_Sub8 arg0) {
		this.anInt256 = arg0.method1545();
		this.anIntArray92 = new int[this.anInt256];
		this.anIntArray91 = new int[this.anInt256];
		for (@Pc(16) int local16 = 0; local16 < this.anInt256; local16++) {
			this.anIntArray92[local16] = arg0.method1510();
			this.anIntArray91[local16] = arg0.method1510();
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(Lclient!hd;)V")
	public void method245(@OriginalArg(0) Class3_Sub8 arg0) {
		this.anInt257 = arg0.method1545();
		this.anInt258 = arg0.method1540();
		this.anInt255 = arg0.method1540();
		this.method244(arg0);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "()V")
	public void method246() {
		this.anInt259 = 0;
		this.anInt261 = 0;
		this.anInt263 = 0;
		this.anInt260 = 0;
		this.anInt262 = 0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)I")
	public int method247(@OriginalArg(0) int arg0) {
		if (this.anInt262 >= this.anInt259) {
			this.anInt260 = this.anIntArray91[this.anInt261++] << 15;
			if (this.anInt261 >= this.anInt256) {
				this.anInt261 = this.anInt256 - 1;
			}
			this.anInt259 = (int) ((double) this.anIntArray92[this.anInt261] / 65536.0D * (double) arg0);
			if (this.anInt259 > this.anInt262) {
				this.anInt263 = ((this.anIntArray91[this.anInt261] << 15) - this.anInt260) / (this.anInt259 - this.anInt262);
			}
		}
		this.anInt260 += this.anInt263;
		this.anInt262++;
		return this.anInt260 - this.anInt263 >> 15;
	}
}

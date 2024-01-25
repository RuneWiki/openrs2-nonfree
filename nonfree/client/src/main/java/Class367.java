import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class367 {

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "I")
	public int anInt10396;

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "I")
	public int anInt10397;

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
	public int anInt10399;

	@OriginalMember(owner = "client!wda", name = "g", descriptor = "I")
	private int anInt10400;

	@OriginalMember(owner = "client!wda", name = "h", descriptor = "I")
	private int anInt10401;

	@OriginalMember(owner = "client!wda", name = "i", descriptor = "I")
	private int anInt10402;

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "I")
	private int anInt10403;

	@OriginalMember(owner = "client!wda", name = "k", descriptor = "I")
	private int anInt10404;

	@OriginalMember(owner = "client!wda", name = "e", descriptor = "I")
	private int anInt10398 = 2;

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "[I")
	private int[] anIntArray610 = new int[2];

	@OriginalMember(owner = "client!wda", name = "d", descriptor = "[I")
	private int[] anIntArray611 = new int[2];

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "()V")
	public Class367() {
		this.anIntArray610[0] = 0;
		this.anIntArray610[1] = 65535;
		this.anIntArray611[0] = 0;
		this.anIntArray611[1] = 65535;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "()V")
	public void method8395() {
		this.anInt10400 = 0;
		this.anInt10402 = 0;
		this.anInt10401 = 0;
		this.anInt10403 = 0;
		this.anInt10404 = 0;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)I")
	public int method8396(@OriginalArg(0) int arg0) {
		if (this.anInt10404 >= this.anInt10400) {
			this.anInt10403 = this.anIntArray611[this.anInt10402++] << 15;
			if (this.anInt10402 >= this.anInt10398) {
				this.anInt10402 = this.anInt10398 - 1;
			}
			this.anInt10400 = (int) ((double) this.anIntArray610[this.anInt10402] / 65536.0D * (double) arg0);
			if (this.anInt10400 > this.anInt10404) {
				this.anInt10401 = ((this.anIntArray611[this.anInt10402] << 15) - this.anInt10403) / (this.anInt10400 - this.anInt10404);
			}
		}
		this.anInt10403 += this.anInt10401;
		this.anInt10404++;
		return this.anInt10403 - this.anInt10401 >> 15;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!ig;)V")
	public void method8397(@OriginalArg(0) Class8_Sub8 arg0) {
		this.anInt10396 = arg0.method8525();
		this.anInt10399 = arg0.method8540();
		this.anInt10397 = arg0.method8540();
		this.method8398(arg0);
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(Lclient!ig;)V")
	public void method8398(@OriginalArg(0) Class8_Sub8 arg0) {
		this.anInt10398 = arg0.method8525();
		this.anIntArray610 = new int[this.anInt10398];
		this.anIntArray611 = new int[this.anInt10398];
		for (@Pc(16) int local16 = 0; local16 < this.anInt10398; local16++) {
			this.anIntArray610[local16] = arg0.method8578();
			this.anIntArray611[local16] = arg0.method8578();
		}
	}
}

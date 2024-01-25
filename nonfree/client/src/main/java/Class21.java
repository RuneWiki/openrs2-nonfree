import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class21 {

	@OriginalMember(owner = "client!av", name = "a", descriptor = "I")
	public int anInt608;

	@OriginalMember(owner = "client!av", name = "b", descriptor = "I")
	public int anInt609;

	@OriginalMember(owner = "client!av", name = "f", descriptor = "I")
	public int anInt611;

	@OriginalMember(owner = "client!av", name = "g", descriptor = "I")
	private int anInt612;

	@OriginalMember(owner = "client!av", name = "h", descriptor = "I")
	private int anInt613;

	@OriginalMember(owner = "client!av", name = "i", descriptor = "I")
	private int anInt614;

	@OriginalMember(owner = "client!av", name = "j", descriptor = "I")
	private int anInt615;

	@OriginalMember(owner = "client!av", name = "k", descriptor = "I")
	private int anInt616;

	@OriginalMember(owner = "client!av", name = "e", descriptor = "I")
	private int anInt610 = 2;

	@OriginalMember(owner = "client!av", name = "d", descriptor = "[I")
	private int[] anIntArray61 = new int[2];

	@OriginalMember(owner = "client!av", name = "c", descriptor = "[I")
	private int[] anIntArray60 = new int[2];

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "()V")
	public Class21() {
		this.anIntArray61[0] = 0;
		this.anIntArray61[1] = 65535;
		this.anIntArray60[0] = 0;
		this.anIntArray60[1] = 65535;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!vj;)V")
	public void method480(@OriginalArg(0) Class2_Sub22 arg0) {
		this.anInt610 = arg0.method8547();
		this.anIntArray61 = new int[this.anInt610];
		this.anIntArray60 = new int[this.anInt610];
		for (@Pc(16) int local16 = 0; local16 < this.anInt610; local16++) {
			this.anIntArray61[local16] = arg0.method8546();
			this.anIntArray60[local16] = arg0.method8546();
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)I")
	public int method481(@OriginalArg(0) int arg0) {
		if (this.anInt612 >= this.anInt614) {
			this.anInt616 = this.anIntArray60[this.anInt613++] << 15;
			if (this.anInt613 >= this.anInt610) {
				this.anInt613 = this.anInt610 - 1;
			}
			this.anInt614 = (int) ((double) this.anIntArray61[this.anInt613] / 65536.0D * (double) arg0);
			if (this.anInt614 > this.anInt612) {
				this.anInt615 = ((this.anIntArray60[this.anInt613] << 15) - this.anInt616) / (this.anInt614 - this.anInt612);
			}
		}
		this.anInt616 += this.anInt615;
		this.anInt612++;
		return this.anInt616 - this.anInt615 >> 15;
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(Lclient!vj;)V")
	public void method482(@OriginalArg(0) Class2_Sub22 arg0) {
		this.anInt611 = arg0.method8547();
		this.anInt608 = arg0.method8542();
		this.anInt609 = arg0.method8542();
		this.method480(arg0);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "()V")
	public void method483() {
		this.anInt614 = 0;
		this.anInt613 = 0;
		this.anInt615 = 0;
		this.anInt616 = 0;
		this.anInt612 = 0;
	}
}

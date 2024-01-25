import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class285 {

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
	public int anInt7824;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
	public int anInt7825;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
	public int anInt7827;

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
	private int anInt7828;

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
	private int anInt7829;

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
	private int anInt7830;

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
	private int anInt7831;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
	private int anInt7832;

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
	private int anInt7826 = 2;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "[I")
	private int[] anIntArray415 = new int[2];

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "[I")
	private int[] anIntArray416 = new int[2];

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class285() {
		this.anIntArray415[0] = 0;
		this.anIntArray415[1] = 65535;
		this.anIntArray416[0] = 0;
		this.anIntArray416[1] = 65535;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)I")
	public int method6880(@OriginalArg(0) int arg0) {
		if (this.anInt7831 >= this.anInt7829) {
			this.anInt7830 = this.anIntArray416[this.anInt7828++] << 15;
			if (this.anInt7828 >= this.anInt7826) {
				this.anInt7828 = this.anInt7826 - 1;
			}
			this.anInt7829 = (int) ((double) this.anIntArray415[this.anInt7828] / 65536.0D * (double) arg0);
			if (this.anInt7829 > this.anInt7831) {
				this.anInt7832 = ((this.anIntArray416[this.anInt7828] << 15) - this.anInt7830) / (this.anInt7829 - this.anInt7831);
			}
		}
		this.anInt7830 += this.anInt7832;
		this.anInt7831++;
		return this.anInt7830 - this.anInt7832 >> 15;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!jc;)V")
	public void method6881(@OriginalArg(0) Class14_Sub21 arg0) {
		this.anInt7826 = arg0.method7695(126);
		this.anIntArray415 = new int[this.anInt7826];
		this.anIntArray416 = new int[this.anInt7826];
		for (@Pc(16) int local16 = 0; local16 < this.anInt7826; local16++) {
			this.anIntArray415[local16] = arg0.method7717(-1978450544);
			this.anIntArray416[local16] = arg0.method7717(-1978450544);
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(Lclient!jc;)V")
	public void method6882(@OriginalArg(0) Class14_Sub21 arg0) {
		this.anInt7824 = arg0.method7695(109);
		this.anInt7827 = arg0.method7748();
		this.anInt7825 = arg0.method7748();
		this.method6881(arg0);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "()V")
	public void method6883() {
		this.anInt7829 = 0;
		this.anInt7828 = 0;
		this.anInt7832 = 0;
		this.anInt7830 = 0;
		this.anInt7831 = 0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class267 {

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
	public int anInt7596;

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
	public int anInt7597;

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
	public int anInt7598;

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
	private int anInt7600;

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
	private int anInt7601;

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
	private int anInt7602;

	@OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
	private int anInt7603;

	@OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
	private int anInt7604;

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
	private int anInt7599 = 2;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "[I")
	private int[] anIntArray527 = new int[2];

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "[I")
	private int[] anIntArray528 = new int[2];

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
	public Class267() {
		this.anIntArray527[0] = 0;
		this.anIntArray527[1] = 65535;
		this.anIntArray528[0] = 0;
		this.anIntArray528[1] = 65535;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!cu;)V")
	public void method5933(@OriginalArg(0) Class3_Sub7 arg0) {
		this.anInt7597 = arg0.method2582();
		this.anInt7596 = arg0.method2589();
		this.anInt7598 = arg0.method2589();
		this.method5935(arg0);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "()V")
	public void method5934() {
		this.anInt7603 = 0;
		this.anInt7601 = 0;
		this.anInt7602 = 0;
		this.anInt7604 = 0;
		this.anInt7600 = 0;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(Lclient!cu;)V")
	public void method5935(@OriginalArg(0) Class3_Sub7 arg0) {
		this.anInt7599 = arg0.method2582();
		this.anIntArray527 = new int[this.anInt7599];
		this.anIntArray528 = new int[this.anInt7599];
		for (@Pc(16) int local16 = 0; local16 < this.anInt7599; local16++) {
			this.anIntArray527[local16] = arg0.method2588();
			this.anIntArray528[local16] = arg0.method2588();
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)I")
	public int method5936(@OriginalArg(0) int arg0) {
		if (this.anInt7600 >= this.anInt7603) {
			this.anInt7604 = this.anIntArray528[this.anInt7601++] << 15;
			if (this.anInt7601 >= this.anInt7599) {
				this.anInt7601 = this.anInt7599 - 1;
			}
			this.anInt7603 = (int) ((double) this.anIntArray527[this.anInt7601] / 65536.0D * (double) arg0);
			if (this.anInt7603 > this.anInt7600) {
				this.anInt7602 = ((this.anIntArray528[this.anInt7601] << 15) - this.anInt7604) / (this.anInt7603 - this.anInt7600);
			}
		}
		this.anInt7604 += this.anInt7602;
		this.anInt7600++;
		return this.anInt7604 - this.anInt7602 >> 15;
	}
}

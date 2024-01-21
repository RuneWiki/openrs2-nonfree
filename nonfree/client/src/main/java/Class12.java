import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class12 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
	public int anInt687;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
	public int anInt689;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
	public int anInt690;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
	private int anInt691;

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
	private int anInt692;

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
	private int anInt693;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
	private int anInt694;

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
	private int anInt695;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
	private int anInt688 = 2;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "[I")
	private int[] anIntArray95 = new int[2];

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "[I")
	private int[] anIntArray94 = new int[2];

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
	public Class12() {
		this.anIntArray95[0] = 0;
		this.anIntArray95[1] = 65535;
		this.anIntArray94[0] = 0;
		this.anIntArray94[1] = 65535;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!jg;)V")
	public void method390(@OriginalArg(0) Class1_Sub8 arg0) {
		this.anInt690 = arg0.method861();
		this.anInt689 = arg0.method868();
		this.anInt687 = arg0.method868();
		this.method393(arg0);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)I")
	public int method391(@OriginalArg(0) int arg0) {
		if (this.anInt693 >= this.anInt692) {
			this.anInt695 = this.anIntArray94[this.anInt691++] << 15;
			if (this.anInt691 >= this.anInt688) {
				this.anInt691 = this.anInt688 - 1;
			}
			this.anInt692 = (int) ((double) this.anIntArray95[this.anInt691] / 65536.0D * (double) arg0);
			if (this.anInt692 > this.anInt693) {
				this.anInt694 = ((this.anIntArray94[this.anInt691] << 15) - this.anInt695) / (this.anInt692 - this.anInt693);
			}
		}
		this.anInt695 += this.anInt694;
		this.anInt693++;
		return this.anInt695 - this.anInt694 >> 15;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "()V")
	public void method392() {
		this.anInt692 = 0;
		this.anInt691 = 0;
		this.anInt694 = 0;
		this.anInt695 = 0;
		this.anInt693 = 0;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lclient!jg;)V")
	public void method393(@OriginalArg(0) Class1_Sub8 arg0) {
		this.anInt688 = arg0.method861();
		this.anIntArray95 = new int[this.anInt688];
		this.anIntArray94 = new int[this.anInt688];
		for (@Pc(16) int local16 = 0; local16 < this.anInt688; local16++) {
			this.anIntArray95[local16] = arg0.method878();
			this.anIntArray94[local16] = arg0.method878();
		}
	}
}

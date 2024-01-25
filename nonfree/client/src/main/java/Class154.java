import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class154 {

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
	public int anInt4741;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
	public int anInt4743;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
	public int anInt4744;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
	private int anInt4745;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
	private int anInt4746;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
	private int anInt4747;

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
	private int anInt4748;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
	private int anInt4749;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
	private int anInt4742 = 2;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "[I")
	private int[] anIntArray375 = new int[2];

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "[I")
	private int[] anIntArray374 = new int[2];

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class154() {
		this.anIntArray375[0] = 0;
		this.anIntArray375[1] = 65535;
		this.anIntArray374[0] = 0;
		this.anIntArray374[1] = 65535;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!kh;)V")
	public void method4178(@OriginalArg(0) Class11_Sub25 arg0) {
		this.anInt4744 = arg0.method5185();
		this.anInt4741 = arg0.method5198();
		this.anInt4743 = arg0.method5198();
		this.method4179(arg0);
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(Lclient!kh;)V")
	public void method4179(@OriginalArg(0) Class11_Sub25 arg0) {
		this.anInt4742 = arg0.method5185();
		this.anIntArray375 = new int[this.anInt4742];
		this.anIntArray374 = new int[this.anInt4742];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4742; local16++) {
			this.anIntArray375[local16] = arg0.method5187();
			this.anIntArray374[local16] = arg0.method5187();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)I")
	public int method4180(@OriginalArg(0) int arg0) {
		if (this.anInt4747 >= this.anInt4746) {
			this.anInt4745 = this.anIntArray374[this.anInt4748++] << 15;
			if (this.anInt4748 >= this.anInt4742) {
				this.anInt4748 = this.anInt4742 - 1;
			}
			this.anInt4746 = (int) ((double) this.anIntArray375[this.anInt4748] / 65536.0D * (double) arg0);
			if (this.anInt4746 > this.anInt4747) {
				this.anInt4749 = ((this.anIntArray374[this.anInt4748] << 15) - this.anInt4745) / (this.anInt4746 - this.anInt4747);
			}
		}
		this.anInt4745 += this.anInt4749;
		this.anInt4747++;
		return this.anInt4745 - this.anInt4749 >> 15;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "()V")
	public void method4181() {
		this.anInt4746 = 0;
		this.anInt4748 = 0;
		this.anInt4749 = 0;
		this.anInt4745 = 0;
		this.anInt4747 = 0;
	}
}

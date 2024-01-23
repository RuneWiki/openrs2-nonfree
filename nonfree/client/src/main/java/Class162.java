import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class162 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
	public int anInt4647;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
	public int anInt4648;

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
	public int anInt4650;

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
	private int anInt4651;

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
	private int anInt4652;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
	private int anInt4653;

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
	private int anInt4654;

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
	private int anInt4655;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
	private int anInt4649 = 2;

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "[I")
	private int[] anIntArray414 = new int[2];

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "[I")
	private int[] anIntArray413 = new int[2];

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	public Class162() {
		this.anIntArray414[0] = 0;
		this.anIntArray414[1] = 65535;
		this.anIntArray413[0] = 0;
		this.anIntArray413[1] = 65535;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)I")
	public int method4056(@OriginalArg(0) int arg0) {
		if (this.anInt4651 >= this.anInt4655) {
			this.anInt4652 = this.anIntArray413[this.anInt4653++] << 15;
			if (this.anInt4653 >= this.anInt4649) {
				this.anInt4653 = this.anInt4649 - 1;
			}
			this.anInt4655 = (int) ((double) this.anIntArray414[this.anInt4653] / 65536.0D * (double) arg0);
			if (this.anInt4655 > this.anInt4651) {
				this.anInt4654 = ((this.anIntArray413[this.anInt4653] << 15) - this.anInt4652) / (this.anInt4655 - this.anInt4651);
			}
		}
		this.anInt4652 += this.anInt4654;
		this.anInt4651++;
		return this.anInt4652 - this.anInt4654 >> 15;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "()V")
	public void method4057() {
		this.anInt4655 = 0;
		this.anInt4653 = 0;
		this.anInt4654 = 0;
		this.anInt4652 = 0;
		this.anInt4651 = 0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!lf;)V")
	public void method4058(@OriginalArg(0) Class1_Sub14 arg0) {
		this.anInt4649 = arg0.method1378();
		this.anIntArray414 = new int[this.anInt4649];
		this.anIntArray413 = new int[this.anInt4649];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4649; local16++) {
			this.anIntArray414[local16] = arg0.method1386();
			this.anIntArray413[local16] = arg0.method1386();
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(Lclient!lf;)V")
	public void method4059(@OriginalArg(0) Class1_Sub14 arg0) {
		this.anInt4650 = arg0.method1378();
		this.anInt4647 = arg0.method1392();
		this.anInt4648 = arg0.method1392();
		this.method4058(arg0);
	}
}

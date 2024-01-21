import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class9 {

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	public int anInt623;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	public int anInt624;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	public int anInt625;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	private int anInt626;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	private int anInt627;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	private int anInt628;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "I")
	private int anInt629;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "I")
	private int anInt630;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	private int anInt622 = 2;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "[I")
	private int[] anIntArray61 = new int[2];

	@OriginalMember(owner = "client!c", name = "f", descriptor = "[I")
	private int[] anIntArray62 = new int[2];

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	public Class9() {
		this.anIntArray61[0] = 0;
		this.anIntArray61[1] = 65535;
		this.anIntArray62[0] = 0;
		this.anIntArray62[1] = 65535;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()V")
	public void method416() {
		this.anInt628 = 0;
		this.anInt629 = 0;
		this.anInt627 = 0;
		this.anInt630 = 0;
		this.anInt626 = 0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ba;)V")
	public void method417(@OriginalArg(0) Class2_Sub3 arg0) {
		this.anInt624 = arg0.method791();
		this.anInt623 = arg0.method814();
		this.anInt625 = arg0.method814();
		this.method418(arg0);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(Lclient!ba;)V")
	public void method418(@OriginalArg(0) Class2_Sub3 arg0) {
		this.anInt622 = arg0.method791();
		this.anIntArray61 = new int[this.anInt622];
		this.anIntArray62 = new int[this.anInt622];
		for (@Pc(16) int local16 = 0; local16 < this.anInt622; local16++) {
			this.anIntArray61[local16] = arg0.method792();
			this.anIntArray62[local16] = arg0.method792();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)I")
	public int method419(@OriginalArg(0) int arg0) {
		if (this.anInt626 >= this.anInt628) {
			this.anInt630 = this.anIntArray62[this.anInt629++] << 15;
			if (this.anInt629 >= this.anInt622) {
				this.anInt629 = this.anInt622 - 1;
			}
			this.anInt628 = (int) ((double) this.anIntArray61[this.anInt629] / 65536.0D * (double) arg0);
			if (this.anInt628 > this.anInt626) {
				this.anInt627 = ((this.anIntArray62[this.anInt629] << 15) - this.anInt630) / (this.anInt628 - this.anInt626);
			}
		}
		this.anInt630 += this.anInt627;
		this.anInt626++;
		return this.anInt630 - this.anInt627 >> 15;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class35 {

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
	public int anInt760;

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
	public int anInt762;

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
	public int anInt763;

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "I")
	private int anInt764;

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "I")
	private int anInt765;

	@OriginalMember(owner = "client!bv", name = "i", descriptor = "I")
	private int anInt766;

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "I")
	private int anInt767;

	@OriginalMember(owner = "client!bv", name = "k", descriptor = "I")
	private int anInt768;

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
	private int anInt761 = 2;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "[I")
	private int[] anIntArray51 = new int[2];

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "[I")
	private int[] anIntArray52 = new int[2];

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V")
	public Class35() {
		this.anIntArray51[0] = 0;
		this.anIntArray51[1] = 65535;
		this.anIntArray52[0] = 0;
		this.anIntArray52[1] = 65535;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)I")
	public int method690(@OriginalArg(0) int arg0) {
		if (this.anInt766 >= this.anInt765) {
			this.anInt764 = this.anIntArray52[this.anInt767++] << 15;
			if (this.anInt767 >= this.anInt761) {
				this.anInt767 = this.anInt761 - 1;
			}
			this.anInt765 = (int) ((double) this.anIntArray51[this.anInt767] / 65536.0D * (double) arg0);
			if (this.anInt765 > this.anInt766) {
				this.anInt768 = ((this.anIntArray52[this.anInt767] << 15) - this.anInt764) / (this.anInt765 - this.anInt766);
			}
		}
		this.anInt764 += this.anInt768;
		this.anInt766++;
		return this.anInt764 - this.anInt768 >> 15;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!lh;)V")
	public void method691(@OriginalArg(0) Class1_Sub1 arg0) {
		this.anInt761 = arg0.method4130();
		this.anIntArray51 = new int[this.anInt761];
		this.anIntArray52 = new int[this.anInt761];
		for (@Pc(16) int local16 = 0; local16 < this.anInt761; local16++) {
			this.anIntArray51[local16] = arg0.method4093();
			this.anIntArray52[local16] = arg0.method4093();
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "()V")
	public void method692() {
		this.anInt765 = 0;
		this.anInt767 = 0;
		this.anInt768 = 0;
		this.anInt764 = 0;
		this.anInt766 = 0;
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(Lclient!lh;)V")
	public void method693(@OriginalArg(0) Class1_Sub1 arg0) {
		this.anInt763 = arg0.method4130();
		this.anInt760 = arg0.method4087();
		this.anInt762 = arg0.method4087();
		this.method691(arg0);
	}
}

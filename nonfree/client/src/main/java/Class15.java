import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class15 {

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
	public int anInt554;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
	public int anInt555;

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
	public int anInt557;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
	private int anInt558;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
	private int anInt559;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
	private int anInt560;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
	private int anInt561;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
	private int anInt562;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
	private int anInt556 = 2;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "[I")
	private int[] anIntArray41 = new int[2];

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "[I")
	private int[] anIntArray42 = new int[2];

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	public Class15() {
		this.anIntArray41[0] = 0;
		this.anIntArray41[1] = 65535;
		this.anIntArray42[0] = 0;
		this.anIntArray42[1] = 65535;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)I")
	public int method403(@OriginalArg(0) int arg0) {
		if (this.anInt560 >= this.anInt562) {
			this.anInt558 = this.anIntArray42[this.anInt559++] << 15;
			if (this.anInt559 >= this.anInt556) {
				this.anInt559 = this.anInt556 - 1;
			}
			this.anInt562 = (int) ((double) this.anIntArray41[this.anInt559] / 65536.0D * (double) arg0);
			if (this.anInt562 > this.anInt560) {
				this.anInt561 = ((this.anIntArray42[this.anInt559] << 15) - this.anInt558) / (this.anInt562 - this.anInt560);
			}
		}
		this.anInt558 += this.anInt561;
		this.anInt560++;
		return this.anInt558 - this.anInt561 >> 15;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!ka;)V")
	public void method404(@OriginalArg(0) Class1_Sub8 arg0) {
		this.anInt556 = arg0.method1186();
		this.anIntArray41 = new int[this.anInt556];
		this.anIntArray42 = new int[this.anInt556];
		for (@Pc(16) int local16 = 0; local16 < this.anInt556; local16++) {
			this.anIntArray41[local16] = arg0.method1199();
			this.anIntArray42[local16] = arg0.method1199();
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(Lclient!ka;)V")
	public void method405(@OriginalArg(0) Class1_Sub8 arg0) {
		this.anInt555 = arg0.method1186();
		this.anInt554 = arg0.method1188();
		this.anInt557 = arg0.method1188();
		this.method404(arg0);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "()V")
	public void method406() {
		this.anInt562 = 0;
		this.anInt559 = 0;
		this.anInt561 = 0;
		this.anInt558 = 0;
		this.anInt560 = 0;
	}
}

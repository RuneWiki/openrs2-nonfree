import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class36 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "I")
	public int anInt1537;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "I")
	public int anInt1539;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "I")
	public int anInt1540;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "I")
	private int anInt1541;

	@OriginalMember(owner = "client!k", name = "h", descriptor = "I")
	private int anInt1542;

	@OriginalMember(owner = "client!k", name = "i", descriptor = "I")
	private int anInt1543;

	@OriginalMember(owner = "client!k", name = "j", descriptor = "I")
	private int anInt1544;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "I")
	private int anInt1545;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "I")
	private int anInt1538 = 2;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "[I")
	private int[] anIntArray159 = new int[2];

	@OriginalMember(owner = "client!k", name = "e", descriptor = "[I")
	private int[] anIntArray160 = new int[2];

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
	public Class36() {
		this.anIntArray159[0] = 0;
		this.anIntArray159[1] = 65535;
		this.anIntArray160[0] = 0;
		this.anIntArray160[1] = 65535;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)I")
	public int method1040(@OriginalArg(0) int arg0) {
		if (this.anInt1542 >= this.anInt1543) {
			this.anInt1541 = this.anIntArray160[this.anInt1545++] << 15;
			if (this.anInt1545 >= this.anInt1538) {
				this.anInt1545 = this.anInt1538 - 1;
			}
			this.anInt1543 = (int) ((double) this.anIntArray159[this.anInt1545] / 65536.0D * (double) arg0);
			if (this.anInt1543 > this.anInt1542) {
				this.anInt1544 = ((this.anIntArray160[this.anInt1545] << 15) - this.anInt1541) / (this.anInt1543 - this.anInt1542);
			}
		}
		this.anInt1541 += this.anInt1544;
		this.anInt1542++;
		return this.anInt1541 - this.anInt1544 >> 15;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!jd;)V")
	public void method1041(@OriginalArg(0) Class4_Sub11 arg0) {
		this.anInt1540 = arg0.method719();
		this.anInt1539 = arg0.method725();
		this.anInt1537 = arg0.method725();
		this.method1043(arg0);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "()V")
	public void method1042() {
		this.anInt1543 = 0;
		this.anInt1545 = 0;
		this.anInt1544 = 0;
		this.anInt1541 = 0;
		this.anInt1542 = 0;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(Lclient!jd;)V")
	public void method1043(@OriginalArg(0) Class4_Sub11 arg0) {
		this.anInt1538 = arg0.method719();
		this.anIntArray159 = new int[this.anInt1538];
		this.anIntArray160 = new int[this.anInt1538];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1538; local16++) {
			this.anIntArray159[local16] = arg0.method718();
			this.anIntArray160[local16] = arg0.method718();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class53 {

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
	public int anInt1644;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
	public int anInt1645;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
	public int anInt1646;

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
	private int anInt1647;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
	private int anInt1648;

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
	private int anInt1649;

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
	private int anInt1650;

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
	private int anInt1651;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
	private int anInt1643 = 2;

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "[I")
	private int[] anIntArray150 = new int[2];

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "[I")
	private int[] anIntArray149 = new int[2];

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
	public Class53() {
		this.anIntArray150[0] = 0;
		this.anIntArray150[1] = 65535;
		this.anIntArray149[0] = 0;
		this.anIntArray149[1] = 65535;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)I")
	public int method1348(@OriginalArg(0) int arg0) {
		if (this.anInt1650 >= this.anInt1649) {
			this.anInt1647 = this.anIntArray149[this.anInt1651++] << 15;
			if (this.anInt1651 >= this.anInt1643) {
				this.anInt1651 = this.anInt1643 - 1;
			}
			this.anInt1649 = (int) ((double) this.anIntArray150[this.anInt1651] / 65536.0D * (double) arg0);
			if (this.anInt1649 > this.anInt1650) {
				this.anInt1648 = ((this.anIntArray149[this.anInt1651] << 15) - this.anInt1647) / (this.anInt1649 - this.anInt1650);
			}
		}
		this.anInt1647 += this.anInt1648;
		this.anInt1650++;
		return this.anInt1647 - this.anInt1648 >> 15;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!bt;)V")
	public void method1349(@OriginalArg(0) Class3_Sub2 arg0) {
		this.anInt1643 = arg0.method6053();
		this.anIntArray150 = new int[this.anInt1643];
		this.anIntArray149 = new int[this.anInt1643];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1643; local16++) {
			this.anIntArray150[local16] = arg0.method6004();
			this.anIntArray149[local16] = arg0.method6004();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "()V")
	public void method1350() {
		this.anInt1649 = 0;
		this.anInt1651 = 0;
		this.anInt1648 = 0;
		this.anInt1647 = 0;
		this.anInt1650 = 0;
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(Lclient!bt;)V")
	public void method1351(@OriginalArg(0) Class3_Sub2 arg0) {
		this.anInt1644 = arg0.method6053();
		this.anInt1645 = arg0.method6014();
		this.anInt1646 = arg0.method6014();
		this.method1349(arg0);
	}
}

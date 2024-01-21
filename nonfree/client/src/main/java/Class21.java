import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class21 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
	public int anInt690;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
	public int anInt692;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	public int anInt693;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
	private int anInt694;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
	private int anInt695;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
	private int anInt696;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
	private int anInt697;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
	private int anInt698;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
	private int anInt691 = 2;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "[I")
	private int[] anIntArray42 = new int[2];

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "[I")
	private int[] anIntArray41 = new int[2];

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	public Class21() {
		this.anIntArray42[0] = 0;
		this.anIntArray42[1] = 65535;
		this.anIntArray41[0] = 0;
		this.anIntArray41[1] = 65535;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!gb;)V")
	public void method472(@OriginalArg(0) Class3_Sub4 arg0) {
		this.anInt691 = arg0.method446();
		this.anIntArray42 = new int[this.anInt691];
		this.anIntArray41 = new int[this.anInt691];
		for (@Pc(16) int local16 = 0; local16 < this.anInt691; local16++) {
			this.anIntArray42[local16] = arg0.method459();
			this.anIntArray41[local16] = arg0.method459();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)I")
	public int method473(@OriginalArg(0) int arg0) {
		if (this.anInt695 >= this.anInt698) {
			this.anInt696 = this.anIntArray41[this.anInt697++] << 15;
			if (this.anInt697 >= this.anInt691) {
				this.anInt697 = this.anInt691 - 1;
			}
			this.anInt698 = (int) ((double) this.anIntArray42[this.anInt697] / 65536.0D * (double) arg0);
			if (this.anInt698 > this.anInt695) {
				this.anInt694 = ((this.anIntArray41[this.anInt697] << 15) - this.anInt696) / (this.anInt698 - this.anInt695);
			}
		}
		this.anInt696 += this.anInt694;
		this.anInt695++;
		return this.anInt696 - this.anInt694 >> 15;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "()V")
	public void method474() {
		this.anInt698 = 0;
		this.anInt697 = 0;
		this.anInt694 = 0;
		this.anInt696 = 0;
		this.anInt695 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(Lclient!gb;)V")
	public void method475(@OriginalArg(0) Class3_Sub4 arg0) {
		this.anInt692 = arg0.method446();
		this.anInt690 = arg0.method438();
		this.anInt693 = arg0.method438();
		this.method472(arg0);
	}
}

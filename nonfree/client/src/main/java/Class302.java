import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class302 {

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "I")
	public int anInt8626;

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "I")
	public int anInt8627;

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "I")
	public int anInt8628;

	@OriginalMember(owner = "client!tca", name = "g", descriptor = "I")
	private int anInt8630;

	@OriginalMember(owner = "client!tca", name = "h", descriptor = "I")
	private int anInt8631;

	@OriginalMember(owner = "client!tca", name = "i", descriptor = "I")
	private int anInt8632;

	@OriginalMember(owner = "client!tca", name = "j", descriptor = "I")
	private int anInt8633;

	@OriginalMember(owner = "client!tca", name = "k", descriptor = "I")
	private int anInt8634;

	@OriginalMember(owner = "client!tca", name = "e", descriptor = "I")
	private int anInt8629 = 2;

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "[I")
	private int[] anIntArray608 = new int[2];

	@OriginalMember(owner = "client!tca", name = "f", descriptor = "[I")
	private int[] anIntArray609 = new int[2];

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "()V")
	public Class302() {
		this.anIntArray608[0] = 0;
		this.anIntArray608[1] = 65535;
		this.anIntArray609[0] = 0;
		this.anIntArray609[1] = 65535;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!jr;)V")
	public void method6856(@OriginalArg(0) Class6_Sub12 arg0) {
		this.anInt8629 = arg0.method6019();
		this.anIntArray608 = new int[this.anInt8629];
		this.anIntArray609 = new int[this.anInt8629];
		for (@Pc(16) int local16 = 0; local16 < this.anInt8629; local16++) {
			this.anIntArray608[local16] = arg0.method6044();
			this.anIntArray609[local16] = arg0.method6044();
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)I")
	public int method6857(@OriginalArg(0) int arg0) {
		if (this.anInt8631 >= this.anInt8633) {
			this.anInt8632 = this.anIntArray609[this.anInt8634++] << 15;
			if (this.anInt8634 >= this.anInt8629) {
				this.anInt8634 = this.anInt8629 - 1;
			}
			this.anInt8633 = (int) ((double) this.anIntArray608[this.anInt8634] / 65536.0D * (double) arg0);
			if (this.anInt8633 > this.anInt8631) {
				this.anInt8630 = ((this.anIntArray609[this.anInt8634] << 15) - this.anInt8632) / (this.anInt8633 - this.anInt8631);
			}
		}
		this.anInt8632 += this.anInt8630;
		this.anInt8631++;
		return this.anInt8632 - this.anInt8630 >> 15;
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(Lclient!jr;)V")
	public void method6858(@OriginalArg(0) Class6_Sub12 arg0) {
		this.anInt8626 = arg0.method6019();
		this.anInt8627 = arg0.method6015();
		this.anInt8628 = arg0.method6015();
		this.method6856(arg0);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "()V")
	public void method6859() {
		this.anInt8633 = 0;
		this.anInt8634 = 0;
		this.anInt8630 = 0;
		this.anInt8632 = 0;
		this.anInt8631 = 0;
	}
}

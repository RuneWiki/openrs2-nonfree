import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class84 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
	public int anInt3429;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
	public int anInt3430;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	public int anInt3432;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	private int anInt3433;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
	private int anInt3434;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	private int anInt3435;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
	private int anInt3436;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	private int anInt3437;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	private int anInt3431 = 2;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "[I")
	private int[] anIntArray262 = new int[2];

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "[I")
	private int[] anIntArray261 = new int[2];

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class84() {
		this.anIntArray262[0] = 0;
		this.anIntArray262[1] = 65535;
		this.anIntArray261[0] = 0;
		this.anIntArray261[1] = 65535;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ql;)V")
	public void method2577(@OriginalArg(0) Class1_Sub13 arg0) {
		this.anInt3432 = arg0.method1772();
		this.anInt3430 = arg0.method1802();
		this.anInt3429 = arg0.method1802();
		this.method2579(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "()V")
	public void method2578() {
		this.anInt3433 = 0;
		this.anInt3436 = 0;
		this.anInt3437 = 0;
		this.anInt3435 = 0;
		this.anInt3434 = 0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(Lclient!ql;)V")
	public void method2579(@OriginalArg(0) Class1_Sub13 arg0) {
		this.anInt3431 = arg0.method1772();
		this.anIntArray262 = new int[this.anInt3431];
		this.anIntArray261 = new int[this.anInt3431];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3431; local16++) {
			this.anIntArray262[local16] = arg0.method1764();
			this.anIntArray261[local16] = arg0.method1764();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I")
	public int method2580(@OriginalArg(0) int arg0) {
		if (this.anInt3434 >= this.anInt3433) {
			this.anInt3435 = this.anIntArray261[this.anInt3436++] << 15;
			if (this.anInt3436 >= this.anInt3431) {
				this.anInt3436 = this.anInt3431 - 1;
			}
			this.anInt3433 = (int) ((double) this.anIntArray262[this.anInt3436] / 65536.0D * (double) arg0);
			if (this.anInt3433 > this.anInt3434) {
				this.anInt3437 = ((this.anIntArray261[this.anInt3436] << 15) - this.anInt3435) / (this.anInt3433 - this.anInt3434);
			}
		}
		this.anInt3435 += this.anInt3437;
		this.anInt3434++;
		return this.anInt3435 - this.anInt3437 >> 15;
	}
}

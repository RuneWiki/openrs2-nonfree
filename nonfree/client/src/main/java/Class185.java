import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lea")
public final class Class185 {

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "I")
	public int anInt5663;

	@OriginalMember(owner = "client!lea", name = "e", descriptor = "I")
	public int anInt5664;

	@OriginalMember(owner = "client!lea", name = "f", descriptor = "I")
	public int anInt5665;

	@OriginalMember(owner = "client!lea", name = "g", descriptor = "I")
	private int anInt5666;

	@OriginalMember(owner = "client!lea", name = "h", descriptor = "I")
	private int anInt5667;

	@OriginalMember(owner = "client!lea", name = "i", descriptor = "I")
	private int anInt5668;

	@OriginalMember(owner = "client!lea", name = "j", descriptor = "I")
	private int anInt5669;

	@OriginalMember(owner = "client!lea", name = "k", descriptor = "I")
	private int anInt5670;

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
	private int anInt5662 = 2;

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "[I")
	private int[] anIntArray275 = new int[2];

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "[I")
	private int[] anIntArray274 = new int[2];

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "()V")
	public Class185() {
		this.anIntArray275[0] = 0;
		this.anIntArray275[1] = 65535;
		this.anIntArray274[0] = 0;
		this.anIntArray274[1] = 65535;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)I")
	public int method4599(@OriginalArg(0) int arg0) {
		if (this.anInt5666 >= this.anInt5669) {
			this.anInt5670 = this.anIntArray274[this.anInt5667++] << 15;
			if (this.anInt5667 >= this.anInt5662) {
				this.anInt5667 = this.anInt5662 - 1;
			}
			this.anInt5669 = (int) ((double) this.anIntArray275[this.anInt5667] / 65536.0D * (double) arg0);
			if (this.anInt5669 > this.anInt5666) {
				this.anInt5668 = ((this.anIntArray274[this.anInt5667] << 15) - this.anInt5670) / (this.anInt5669 - this.anInt5666);
			}
		}
		this.anInt5670 += this.anInt5668;
		this.anInt5666++;
		return this.anInt5670 - this.anInt5668 >> 15;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!ie;)V")
	public void method4600(@OriginalArg(0) Class3_Sub26 arg0) {
		this.anInt5662 = arg0.method6814();
		this.anIntArray275 = new int[this.anInt5662];
		this.anIntArray274 = new int[this.anInt5662];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5662; local16++) {
			this.anIntArray275[local16] = arg0.method6811();
			this.anIntArray274[local16] = arg0.method6811();
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "()V")
	public void method4601() {
		this.anInt5669 = 0;
		this.anInt5667 = 0;
		this.anInt5668 = 0;
		this.anInt5670 = 0;
		this.anInt5666 = 0;
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(Lclient!ie;)V")
	public void method4602(@OriginalArg(0) Class3_Sub26 arg0) {
		this.anInt5664 = arg0.method6814();
		this.anInt5663 = arg0.method6816();
		this.anInt5665 = arg0.method6816();
		this.method4600(arg0);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oea")
public final class Class235 {

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "I")
	public int anInt7467;

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "I")
	public int anInt7469;

	@OriginalMember(owner = "client!oea", name = "d", descriptor = "I")
	public int anInt7470;

	@OriginalMember(owner = "client!oea", name = "g", descriptor = "I")
	private int anInt7471;

	@OriginalMember(owner = "client!oea", name = "h", descriptor = "I")
	private int anInt7472;

	@OriginalMember(owner = "client!oea", name = "i", descriptor = "I")
	private int anInt7473;

	@OriginalMember(owner = "client!oea", name = "j", descriptor = "I")
	private int anInt7474;

	@OriginalMember(owner = "client!oea", name = "k", descriptor = "I")
	private int anInt7475;

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "I")
	private int anInt7468 = 2;

	@OriginalMember(owner = "client!oea", name = "e", descriptor = "[I")
	private int[] anIntArray447 = new int[2];

	@OriginalMember(owner = "client!oea", name = "f", descriptor = "[I")
	private int[] anIntArray448 = new int[2];

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "()V")
	public Class235() {
		this.anIntArray447[0] = 0;
		this.anIntArray447[1] = 65535;
		this.anIntArray448[0] = 0;
		this.anIntArray448[1] = 65535;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!rg;)V")
	public void method6447(@OriginalArg(0) Class6_Sub40 arg0) {
		this.anInt7467 = arg0.method8604();
		this.anInt7470 = arg0.method8579();
		this.anInt7469 = arg0.method8579();
		this.method6449(arg0);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)I")
	public int method6448(@OriginalArg(0) int arg0) {
		if (this.anInt7473 >= this.anInt7475) {
			this.anInt7472 = this.anIntArray448[this.anInt7471++] << 15;
			if (this.anInt7471 >= this.anInt7468) {
				this.anInt7471 = this.anInt7468 - 1;
			}
			this.anInt7475 = (int) ((double) this.anIntArray447[this.anInt7471] / 65536.0D * (double) arg0);
			if (this.anInt7475 > this.anInt7473) {
				this.anInt7474 = ((this.anIntArray448[this.anInt7471] << 15) - this.anInt7472) / (this.anInt7475 - this.anInt7473);
			}
		}
		this.anInt7472 += this.anInt7474;
		this.anInt7473++;
		return this.anInt7472 - this.anInt7474 >> 15;
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(Lclient!rg;)V")
	public void method6449(@OriginalArg(0) Class6_Sub40 arg0) {
		this.anInt7468 = arg0.method8604();
		this.anIntArray447 = new int[this.anInt7468];
		this.anIntArray448 = new int[this.anInt7468];
		for (@Pc(16) int local16 = 0; local16 < this.anInt7468; local16++) {
			this.anIntArray447[local16] = arg0.method8571();
			this.anIntArray448[local16] = arg0.method8571();
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "()V")
	public void method6450() {
		this.anInt7475 = 0;
		this.anInt7471 = 0;
		this.anInt7474 = 0;
		this.anInt7472 = 0;
		this.anInt7473 = 0;
	}
}

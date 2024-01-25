import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class16 {

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
	public int anInt439;

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
	public int anInt441;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
	public int anInt442;

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
	private int anInt443;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
	private int anInt444;

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
	private int anInt445;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
	private int anInt446;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
	private int anInt447;

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
	private int anInt440 = 2;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "[I")
	private int[] anIntArray30 = new int[2];

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "[I")
	private int[] anIntArray29 = new int[2];

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class16() {
		this.anIntArray30[0] = 0;
		this.anIntArray30[1] = 65535;
		this.anIntArray29[0] = 0;
		this.anIntArray29[1] = 65535;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)I")
	public int method680(@OriginalArg(0) int arg0) {
		if (this.anInt447 >= this.anInt446) {
			this.anInt444 = this.anIntArray29[this.anInt443++] << 15;
			if (this.anInt443 >= this.anInt440) {
				this.anInt443 = this.anInt440 - 1;
			}
			this.anInt446 = (int) ((double) this.anIntArray30[this.anInt443] / 65536.0D * (double) arg0);
			if (this.anInt446 > this.anInt447) {
				this.anInt445 = ((this.anIntArray29[this.anInt443] << 15) - this.anInt444) / (this.anInt446 - this.anInt447);
			}
		}
		this.anInt444 += this.anInt445;
		this.anInt447++;
		return this.anInt444 - this.anInt445 >> 15;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!dg;)V")
	public void method681(@OriginalArg(0) Class2_Sub10 arg0) {
		this.anInt442 = arg0.method4421();
		this.anInt441 = arg0.method4444();
		this.anInt439 = arg0.method4444();
		this.method683(arg0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "()V")
	public void method682() {
		this.anInt446 = 0;
		this.anInt443 = 0;
		this.anInt445 = 0;
		this.anInt444 = 0;
		this.anInt447 = 0;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(Lclient!dg;)V")
	public void method683(@OriginalArg(0) Class2_Sub10 arg0) {
		this.anInt440 = arg0.method4421();
		this.anIntArray30 = new int[this.anInt440];
		this.anIntArray29 = new int[this.anInt440];
		for (@Pc(16) int local16 = 0; local16 < this.anInt440; local16++) {
			this.anIntArray30[local16] = arg0.method4464();
			this.anIntArray29[local16] = arg0.method4464();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class12 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	public int anInt476;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	public int anInt478;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
	public int anInt479;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
	private int anInt480;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
	private int anInt481;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	private int anInt482;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	private int anInt483;

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	private int anInt484;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	private int anInt477 = 2;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "[I")
	private int[] anIntArray59 = new int[2];

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[I")
	private int[] anIntArray60 = new int[2];

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class12() {
		this.anIntArray59[0] = 0;
		this.anIntArray59[1] = 65535;
		this.anIntArray60[0] = 0;
		this.anIntArray60[1] = 65535;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	public int method401(@OriginalArg(0) int arg0) {
		if (this.anInt483 >= this.anInt481) {
			this.anInt480 = this.anIntArray60[this.anInt484++] << 15;
			if (this.anInt484 >= this.anInt477) {
				this.anInt484 = this.anInt477 - 1;
			}
			this.anInt481 = (int) ((double) this.anIntArray59[this.anInt484] / 65536.0D * (double) arg0);
			if (this.anInt481 > this.anInt483) {
				this.anInt482 = ((this.anIntArray60[this.anInt484] << 15) - this.anInt480) / (this.anInt481 - this.anInt483);
			}
		}
		this.anInt480 += this.anInt482;
		this.anInt483++;
		return this.anInt480 - this.anInt482 >> 15;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
	public void method402() {
		this.anInt481 = 0;
		this.anInt484 = 0;
		this.anInt482 = 0;
		this.anInt480 = 0;
		this.anInt483 = 0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!qe;)V")
	public void method403(@OriginalArg(0) Class5_Sub11 arg0) {
		this.anInt479 = arg0.method1546();
		this.anInt478 = arg0.method1540();
		this.anInt476 = arg0.method1540();
		this.method404(arg0);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lclient!qe;)V")
	public void method404(@OriginalArg(0) Class5_Sub11 arg0) {
		this.anInt477 = arg0.method1546();
		this.anIntArray59 = new int[this.anInt477];
		this.anIntArray60 = new int[this.anInt477];
		for (@Pc(16) int local16 = 0; local16 < this.anInt477; local16++) {
			this.anIntArray59[local16] = arg0.method1543();
			this.anIntArray60[local16] = arg0.method1543();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class319 {

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
	public int anInt8116;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
	public int anInt8117;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
	public int anInt8119;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
	private int anInt8120;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
	private int anInt8121;

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
	private int anInt8122;

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
	private int anInt8123;

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
	private int anInt8124;

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
	private int anInt8118 = 2;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "[I")
	private int[] anIntArray522 = new int[2];

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "[I")
	private int[] anIntArray521 = new int[2];

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	public Class319() {
		this.anIntArray522[0] = 0;
		this.anIntArray522[1] = 65535;
		this.anIntArray521[0] = 0;
		this.anIntArray521[1] = 65535;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!np;)V")
	public void method6749(@OriginalArg(0) Class3_Sub11 arg0) {
		this.anInt8118 = arg0.method5175();
		this.anIntArray522 = new int[this.anInt8118];
		this.anIntArray521 = new int[this.anInt8118];
		for (@Pc(16) int local16 = 0; local16 < this.anInt8118; local16++) {
			this.anIntArray522[local16] = arg0.method5198();
			this.anIntArray521[local16] = arg0.method5198();
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(Lclient!np;)V")
	public void method6750(@OriginalArg(0) Class3_Sub11 arg0) {
		this.anInt8119 = arg0.method5175();
		this.anInt8116 = arg0.method5186();
		this.anInt8117 = arg0.method5186();
		this.method6749(arg0);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "()V")
	public void method6751() {
		this.anInt8121 = 0;
		this.anInt8120 = 0;
		this.anInt8124 = 0;
		this.anInt8123 = 0;
		this.anInt8122 = 0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)I")
	public int method6752(@OriginalArg(0) int arg0) {
		if (this.anInt8122 >= this.anInt8121) {
			this.anInt8123 = this.anIntArray521[this.anInt8120++] << 15;
			if (this.anInt8120 >= this.anInt8118) {
				this.anInt8120 = this.anInt8118 - 1;
			}
			this.anInt8121 = (int) ((double) this.anIntArray522[this.anInt8120] / 65536.0D * (double) arg0);
			if (this.anInt8121 > this.anInt8122) {
				this.anInt8124 = ((this.anIntArray521[this.anInt8120] << 15) - this.anInt8123) / (this.anInt8121 - this.anInt8122);
			}
		}
		this.anInt8123 += this.anInt8124;
		this.anInt8122++;
		return this.anInt8123 - this.anInt8124 >> 15;
	}
}
